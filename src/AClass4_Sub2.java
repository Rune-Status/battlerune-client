public final class AClass4_Sub2 extends AClass4 {

	static String sessionToken;
	static SpritePixels aSpritePixels5;
	static Task aTask3;
	static int cameraPitch;
	final int anInt435;
	final int anInt436;
	final int anInt437;
	final int anInt438;
	final int anInt439;

	public AClass4_Sub2(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4) {
		anInt435 = int_0;
		anInt436 = int_1;
		anInt437 = int_2;
		anInt438 = int_3;
		anInt439 = int_4;
	}

	@Override
	final void method611() {
		Rasterizer2D.drawRectangle(anInt435 + Rasterizer2D.draw_region_x, anInt436 + Rasterizer2D.drawingAreaTop,
				anInt437 - anInt435, anInt438 - anInt436, anInt439);
	}

	public static boolean method704() {
		final ClassInfo classinfo_0 = (ClassInfo) Class95.aCombatInfoList3.method452();
		return classinfo_0 != null;
	}

	static final void method705(final byte[] bytes_0, final int int_0, final int int_1, final int int_2,
			final int int_3, final int int_4, final int int_5, final int int_6,
			final CollisionData[] collisiondatas_0) {
		int int_8;
		for (int int_7 = 0; int_7 < 8; int_7++) {
			for (int_8 = 0; int_8 < 8; int_8++) {
				if (((int_7 + int_1) > 0) && ((int_7 + int_1) < 103) && ((int_2 + int_8) > 0)
						&& ((int_2 + int_8) < 103)) {
					collisiondatas_0[int_0].flags[int_7 + int_1][int_8 + int_2] &= 0xFEFFFFFF;
				}
			}
		}

		final Buffer buffer_0 = new Buffer(bytes_0);

		for (int_8 = 0; int_8 < 4; int_8++) {
			for (int int_9 = 0; int_9 < 64; int_9++) {
				for (int int_10 = 0; int_10 < 64; int_10++) {
					if ((int_8 == int_3) && (int_9 >= int_4) && (int_9 < (int_4 + 8)) && (int_10 >= int_5)
							&& (int_10 < (int_5 + 8))) {
						final int int_11 = int_9 & 0x7;
						final int int_12 = int_10 & 0x7;
						final int int_13 = int_6 & 0x3;
						int int_14;
						if (int_13 == 0) {
							int_14 = int_11;
						} else if (int_13 == 1) {
							int_14 = int_12;
						} else if (int_13 == 2) {
							int_14 = 7 - int_11;
						} else {
							int_14 = 7 - int_12;
						}

						Class40.loadTerrain(buffer_0, int_0, int_1 + int_14,
								int_2 + Class62.method385(int_9 & 0x7, int_10 & 0x7, int_6), 0, 0, int_6);
					} else {
						Class40.loadTerrain(buffer_0, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	public static int method706() {
		return ++MouseInput.mouseIdleTicks - 1;
	}

}
