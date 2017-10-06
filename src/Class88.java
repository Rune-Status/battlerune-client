public class Class88 {

	public static final boolean[] aBoolArray4;
	public static int[] anIntArray47;

	static {
		aBoolArray4 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, true, true, true, true, true, true, true, true, false, false };
		anIntArray47 = new int[99];
		int int_0 = 0;

		for (int int_1 = 0; int_1 < 99; int_1++) {
			final int int_2 = int_1 + 1;
			final int int_3 = (int) (int_2 + (300.0D * Math.pow(2.0D, int_2 / 7.0D)));
			int_0 += int_3;
			anIntArray47[int_1] = int_0 / 4;
		}

	}

	static int method469(final int int_0, final Script script_0, final boolean bool_0) {
		final Widget widget_0 = bool_0 ? Class45.aWidget6 : Class38.aWidget5;
		if (int_0 == 1600) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.scrollX;
			return 1;
		} else if (int_0 == 1601) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.scrollY;
			return 1;
		} else if (int_0 == 1602) {
			Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = widget_0.text;
			return 1;
		} else if (int_0 == 1603) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.scrollWidth;
			return 1;
		} else if (int_0 == 1604) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.scrollHeight;
			return 1;
		} else if (int_0 == 1605) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.modelZoom;
			return 1;
		} else if (int_0 == 1606) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.rotationX;
			return 1;
		} else if (int_0 == 1607) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.rotationY;
			return 1;
		} else if (int_0 == 1608) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.rotationZ;
			return 1;
		} else if (int_0 == 1609) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.opacity;
			return 1;
		} else if (int_0 == 1610) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.anInt308;
			return 1;
		} else if (int_0 == 1611) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.textColor;
			return 1;
		} else if (int_0 == 1612) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.anInt303;
			return 1;
		} else if (int_0 == 1613) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.anEnum9_1.rsOrdinal();
			return 1;
		} else {
			return 2;
		}
	}

}
