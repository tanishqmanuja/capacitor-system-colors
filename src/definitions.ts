export interface SystemColorsPlugin {
  get(options: { id: string }): Promise<{ color: string }>;
}
