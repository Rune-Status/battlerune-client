public class Class40 {

	static byte[] aByteArray4;
	static RSSocket rssocket;
	static byte[] aByteArray5;
	static Buffer[] aBufferArray1;
	static int anInt94;
	static int[] anIntArray17;
	static int anInt95;
	static int[] anIntArray18;
	static int[] anIntArray19;
	static int[] anIntArray20;
	static int[] anIntArray21;
	static int anInt96;
	static int[] anIntArray22;
	static Buffer aBuffer2;

	static {
		aByteArray4 = new byte[2048];
		aByteArray5 = new byte[2048];
		aBufferArray1 = new Buffer[2048];
		anInt94 = 0;
		anIntArray17 = new int[2048];
		anInt95 = 0;
		anIntArray18 = new int[2048];
		anIntArray19 = new int[2048];
		anIntArray20 = new int[2048];
		anIntArray21 = new int[2048];
		anInt96 = 0;
		anIntArray22 = new int[2048];
		aBuffer2 = new Buffer(new byte[5000]);
	}

	static final boolean method259(final char char_0) {
		return (char_0 == 160) || (char_0 == 32) || (char_0 == 95) || (char_0 == 45);
	}

	static final void loadTerrain(final Buffer buffer_0, final int int_0, final int int_1, final int int_2,
			final int int_3, final int int_4, final int int_5) {
		int int_6;
		if ((int_1 >= 0) && (int_1 < 104) && (int_2 >= 0) && (int_2 < 104)) {
			Class18.tileSettings[int_0][int_1][int_2] = 0;

			while (true) {
				int_6 = buffer_0.readUnsignedByte();
				if (int_6 == 0) {
					if (int_0 == 0) {
						final int[] ints_0 = Class18.tileHeights[0][int_1];
						final int int_7 = int_3 + int_1 + 932731;
						final int int_8 = int_4 + int_2 + 556238;
						int int_9 = (Class42.getSmoothNoise(int_7 + 45365, int_8 + 91923, 4) - 128)
								+ ((Class42.getSmoothNoise(int_7 + 10294, int_8 + 37821, 2) - 128) >> 1)
								+ ((Class42.getSmoothNoise(int_7, int_8, 1) - 128) >> 2);
						int_9 = (int) (int_9 * 0.3D) + 35;
						if (int_9 < 10) {
							int_9 = 10;
						} else if (int_9 > 60) {
							int_9 = 60;
						}

						ints_0[int_2] = -int_9 * 8;
						return;
					} else {
						Class18.tileHeights[int_0][int_1][int_2] = Class18.tileHeights[int_0 - 1][int_1][int_2] - 240;
						return;
					}
				}

				if (int_6 == 1) {
					int int_10 = buffer_0.readUnsignedByte();
					if (int_10 == 1) {
						int_10 = 0;
					}

					if (int_0 == 0) {
						Class18.tileHeights[0][int_1][int_2] = -int_10 * 8;
						return;
					}

					Class18.tileHeights[int_0][int_1][int_2] = Class18.tileHeights[int_0 - 1][int_1][int_2]
							- (int_10 * 8);
					return;
				}

				if (int_6 <= 49) {
					Class18.overlayIds[int_0][int_1][int_2] = buffer_0.readByte();
					Class33.overlayPaths[int_0][int_1][int_2] = (byte) ((int_6 - 2) / 4);
					Class18.overlayRotations[int_0][int_1][int_2] = (byte) (((int_6 - 2) + int_5) & 0x3);
				} else if (int_6 <= 81) {
					Class18.tileSettings[int_0][int_1][int_2] = (byte) (int_6 - 49);
				} else {
					Item.underlayIds[int_0][int_1][int_2] = (byte) (int_6 - 81);
				}
			}
		} else {
			while (true) {
				int_6 = buffer_0.readUnsignedByte();
				if (int_6 == 0) {
					return;
				}

				if (int_6 == 1) {
					buffer_0.readUnsignedByte();
					return;
				}

				if (int_6 <= 49) {
					buffer_0.readUnsignedByte();
				}
			}
		}
	}

}
