import { WebPlugin } from '@capacitor/core';

import type { SystemColorsPlugin } from './definitions';

export class SystemColorsWeb extends WebPlugin implements SystemColorsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
