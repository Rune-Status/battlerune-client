public class FloorUnderlayDefinition extends CacheableNode {

	protected static int canvasHeight;
	public static NodeCache underlays;
	public static IndexDataBase underlay_ref;
	int rgbColor;
	public int hue;
	public int saturation;
	public int hueMultiplier;
	public int lightness;

	static {
		underlays = new NodeCache(64);
	}

	FloorUnderlayDefinition() {
		rgbColor = 0;
	}

	void setHSL(final int int_0) {
		final double double_1 = ((int_0 >> 16) & 0xFF) / 256.0D;
		final double double_2 = ((int_0 >> 8) & 0xFF) / 256.0D;
		final double double_3 = (int_0 & 0xFF) / 256.0D;
		double double_4 = double_1;
		if (double_2 < double_1) {
			double_4 = double_2;
		}

		if (double_3 < double_4) {
			double_4 = double_3;
		}

		double double_5 = double_1;
		if (double_2 > double_1) {
			double_5 = double_2;
		}

		if (double_3 > double_5) {
			double_5 = double_3;
		}

		double double_6 = 0.0D;
		double double_7 = 0.0D;
		final double double_0 = (double_4 + double_5) / 2.0D;
		if (double_4 != double_5) {
			if (double_0 < 0.5D) {
				double_7 = (double_5 - double_4) / (double_4 + double_5);
			}

			if (double_0 >= 0.5D) {
				double_7 = (double_5 - double_4) / (2.0D - double_5 - double_4);
			}

			if (double_1 == double_5) {
				double_6 = (double_2 - double_3) / (double_5 - double_4);
			} else if (double_2 == double_5) {
				double_6 = ((double_3 - double_1) / (double_5 - double_4)) + 2.0D;
			} else if (double_3 == double_5) {
				double_6 = 4.0D + ((double_1 - double_2) / (double_5 - double_4));
			}
		}

		double_6 /= 6.0D;
		saturation = (int) (256.0D * double_7);
		lightness = (int) (double_0 * 256.0D);
		if (saturation < 0) {
			saturation = 0;
		} else if (saturation > 255) {
			saturation = 255;
		}

		if (lightness < 0) {
			lightness = 0;
		} else if (lightness > 255) {
			lightness = 255;
		}

		if (double_0 > 0.5D) {
			hueMultiplier = (int) ((1.0D - double_0) * double_7 * 512.0D);
		} else {
			hueMultiplier = (int) (512.0D * double_7 * double_0);
		}

		if (hueMultiplier < 1) {
			hueMultiplier = 1;
		}

		hue = (int) (hueMultiplier * double_6);
	}

	void decode(final Buffer buffer_0, final int int_0, final int int_1) {
		if (int_0 == 1) {
			rgbColor = buffer_0.read24BitInt();
		}

	}

	void post() {
		setHSL(rgbColor);
	}

	void decode(final Buffer buffer_0, final int int_0) {
		while (true) {
			final int int_1 = buffer_0.readUnsignedByte();
			if (int_1 == 0) {
				return;
			}

			this.decode(buffer_0, int_1, int_0);
		}
	}

	public static KitDefinition getKitDefinition(final int int_0) {
		KitDefinition kitdefinition_0 = (KitDefinition) KitDefinition.identKits.get(int_0);
		if (kitdefinition_0 != null) {
			return kitdefinition_0;
		} else {
			final byte[] bytes_0 = KitDefinition.identKit_ref.getConfigData(3, int_0);
			kitdefinition_0 = new KitDefinition();
			if (bytes_0 != null) {
				kitdefinition_0.decode(new Buffer(bytes_0));
			}

			KitDefinition.identKits.put(kitdefinition_0, int_0);
			return kitdefinition_0;
		}
	}

	public static void method840(final IndexDataBase indexdatabase_0) {
		Overlay.overlay_ref = indexdatabase_0;
	}

	public static void method841() {
		Class95.aCombatInfoList3 = new CombatInfoList();
	}

}
