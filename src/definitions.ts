export interface SystemColorsPlugin {
  get(id: string): Promise<string>;
}
