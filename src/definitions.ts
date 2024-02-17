export interface SystemColorsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
