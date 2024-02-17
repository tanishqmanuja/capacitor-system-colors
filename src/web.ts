import { WebPlugin } from '@capacitor/core';

import type { SystemColorsPlugin } from './definitions';

export class SystemColorsWeb extends WebPlugin implements SystemColorsPlugin {
  async get() {
    console.warn('[SYSTEM COLORS]', 'Only for Android');
    return Promise.reject('unimplemented');
  }
}
