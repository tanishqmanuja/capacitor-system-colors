import { registerPlugin } from '@capacitor/core';

import type { SystemColorsPlugin } from './definitions';

const SystemColors = registerPlugin<SystemColorsPlugin>('SystemColors', {
  web: () => import('./web').then(m => new m.SystemColorsWeb()),
});

export * from './definitions';
export { SystemColors };
