export interface SystemColorsPlugin {
  /** @description Is equivalent to calling getColor(context, android.R.color.{id}) on android. */
  get(options: { id: string }): Promise<{ color: string }>;
}
