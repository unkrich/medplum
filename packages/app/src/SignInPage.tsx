import { Text } from '@mantine/core';
import { Logo, SignInForm } from '@medplum/react';
import React from 'react';
import { useNavigate, useSearchParams } from 'react-router-dom';

export function SignInPage(): JSX.Element {
  const navigate = useNavigate();
  const [searchParams] = useSearchParams();

  return (
    <SignInForm
      onSuccess={() => navigate('/')}
      onForgotPassword={() => navigate('/resetpassword')}
      onRegister={() => navigate('/register')}
      googleClientId={import.meta.env.VITE_GOOGLE_CLIENT_ID as string | undefined}
      projectId={searchParams.get('project') as string | undefined}
    >
      <Logo size={32} />
      <Text size="lg" weight={500}>
        Sign in to Medplum
      </Text>
    </SignInForm>
  );
}
