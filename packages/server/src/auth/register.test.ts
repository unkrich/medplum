import { randomUUID } from 'crypto';
import express from 'express';
import { pwnedPassword } from 'hibp';
import fetch from 'node-fetch';
import { MockInstance } from 'vitest';
import { initApp, shutdownApp } from '../app';
import { loadTestConfig } from '../config';
import { setupPwnedPasswordMock, setupRecaptchaMock } from '../test.setup';
import { registerNew } from './register';

vi.mock('hibp');
vi.mock('node-fetch');

const app = express();

describe('Register', () => {
  beforeAll(async () => {
    const config = await loadTestConfig();
    await initApp(app, config);
  });

  afterAll(async () => {
    await shutdownApp();
  });

  beforeEach(async () => {
    (fetch as unknown as MockInstance).mockClear();
    (pwnedPassword as unknown as MockInstance).mockClear();
    setupPwnedPasswordMock(pwnedPassword as unknown as MockInstance, 0);
    setupRecaptchaMock(fetch as unknown as MockInstance, true);
  });

  test('Success', async () => {
    const result = await registerNew({
      firstName: 'Alexander',
      lastName: 'Hamilton',
      projectName: 'Hamilton Project',
      email: `alex${randomUUID()}@example.com`,
      password: 'password!@#',
    });

    expect(result.profile).toBeDefined();
    expect(result.accessToken).toBeDefined();
  });
});
