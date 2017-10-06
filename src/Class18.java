public final class Class18 {

	static int[][][] tileHeights;
	static byte[][][] tileSettings;
	static int anInt71;
	static int menuX;
	static final int[] anIntArray2;
	static final int[] anIntArray3;
	static final int[] anIntArray4;
	static final int[] anIntArray5;
	static final int[] anIntArray6;
	static final int[] anIntArray7;
	static int anInt72;
	static int anInt73;
	static byte[][][] overlayIds;
	static byte[][][] overlayRotations;
	static byte[][][] aByteArrayArrayArray4;
	static int[] blendedHue;
	static int[] anIntArray8;

	static {
		tileHeights = new int[4][105][105];
		tileSettings = new byte[4][104][104];
		anInt71 = 99;
		anIntArray2 = new int[] { 1, 2, 4, 8 };
		anIntArray3 = new int[] { 16, 32, 64, 128 };
		anIntArray4 = new int[] { 1, 0, -1, 0 };
		anIntArray5 = new int[] { 0, -1, 0, 1 };
		anIntArray6 = new int[] { 1, -1, -1, 1 };
		anIntArray7 = new int[] { -1, -1, 1, 1 };
		anInt72 = (int) (Math.random() * 17.0D) - 8;
		anInt73 = (int) (Math.random() * 33.0D) - 16;
	}

	public static Widget method202(final int int_0) {
		final int int_1 = int_0 >> 16;
		final int int_2 = int_0 & 0xFFFF;
		if ((Widget.widgets[int_1] == null) || (Widget.widgets[int_1][int_2] == null)) {
			final boolean bool_0 = Class14.loadWidget(int_1);
			if (!bool_0) {
				return null;
			}
		}

		return Widget.widgets[int_1][int_2];
	}

	static final void method203(final AClass5 aclass5_0) {
		aclass5_0.aBool45 = false;
		if (aclass5_0.anAClass7_1 != null) {
			aclass5_0.anAClass7_1.anInt360 = 0;
		}

		for (AClass5 aclass5_1 = aclass5_0.method629(); aclass5_1 != null; aclass5_1 = aclass5_0.method628()) {
			method203(aclass5_1);
		}

	}

}
