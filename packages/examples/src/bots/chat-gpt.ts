import { BotEvent, MedplumClient } from '@medplum/core';
import { Communication, Practitioner, Reference } from '@medplum/fhirtypes';

const CHAT_GPT: Reference<Practitioner> = {
  reference: 'Practitioner/cc358e24-aadd-4a3c-9d9d-99fb06904d26',
  display: 'Chat GPT',
};

export async function handler(medplum: MedplumClient, event: BotEvent): Promise<any> {
  const input = event.input;
  if (!input || typeof input !== 'object') {
    return false;
  }

  const communication = input as Communication;
  if (communication.resourceType !== 'Communication' || communication.status !== 'completed' || !communication.sender) {
    return false;
  }

  const incomingMessage = communication.payload?.[0]?.contentString;
  if (!incomingMessage) {
    return false;
  }

  await medplum.createResource<Communication>({
    resourceType: 'Communication',
    status: 'completed',
    sender: CHAT_GPT,
    recipient: [communication.sender],
    sent: new Date().toISOString(),
    payload: [{ contentString: `I received your message: ${incomingMessage}` }],
  });

  return true;
}
