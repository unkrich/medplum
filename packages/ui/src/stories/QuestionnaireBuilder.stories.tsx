import { Meta } from '@storybook/react';
import React from 'react';
import { Document } from '../Document';
import { QuestionnaireBuilder } from '../QuestionnaireBuilder';

export default {
  title: 'Medplum/QuestionnaireBuilder',
  component: QuestionnaireBuilder,
} as Meta;

export const Basic = () => (
  <Document>
    <QuestionnaireBuilder
      questionnaire={{
        resourceType: 'Questionnaire',
        item: [{
          linkId: 'titleDisplay',
          text: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
          type: 'display'
        }, {
          linkId: 'abc',
          text: 'Question',
          type: 'string'
        }]
      }}
      onSubmit={(formData: any) => {
        console.log('submit', formData);
      }}
    />
  </Document>
);

export const Groups = () => (
  <Document>
    <QuestionnaireBuilder
      questionnaire={{
        resourceType: 'Questionnaire',
        title: 'My Questionnaire',
        item: [{
          linkId: 'g1',
          text: 'Group 1',
          type: 'group',
          item: [{
            linkId: 'q1',
            text: 'Question 1',
            type: 'string'
          },
          {
            linkId: 'q2',
            text: 'Question 2',
            type: 'string'
          }]
        }, {
          linkId: 'g2',
          text: 'Group 2',
          type: 'group',
          item: [{
            linkId: 'q3',
            text: 'Question 3',
            type: 'string'
          },
          {
            linkId: 'q4',
            text: 'Question 4',
            type: 'string'
          }]
        }]
      }}
      onSubmit={(formData: any) => {
        console.log('submit', formData);
      }}
    />
  </Document>
);