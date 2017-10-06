public class XItemContainer extends Node {

	static XHashTable itemContainers;
	static SpritePixels aSpritePixels4;
	static SpritePixels[] hitmarks;
	static int cameraZ;
	static int anInt421;
	int[] itemIds;
	int[] stackSizes;

	static {
		itemContainers = new XHashTable(32);
	}

	XItemContainer() {
		itemIds = new int[] { -1 };
		stackSizes = new int[] { 0 };
	}

	static final void method686(final int int_0) {
		final int[] ints_0 = Enum4.aSpritePixels3.image;
		final int int_1 = ints_0.length;

		int int_2;
		for (int_2 = 0; int_2 < int_1; int_2++) {
			ints_0[int_2] = 0;
		}

		int int_3;
		int int_4;
		for (int_2 = 1; int_2 < 103; int_2++) {
			int_3 = ((103 - int_2) * 2048) + 24628;

			for (int_4 = 1; int_4 < 103; int_4++) {
				if ((Class18.tileSettings[int_0][int_4][int_2] & 0x18) == 0) {
					Class8.region.method359(ints_0, int_3, 512, int_0, int_4, int_2);
				}

				if ((int_0 < 3) && ((Class18.tileSettings[int_0 + 1][int_4][int_2] & 0x8) != 0)) {
					Class8.region.method359(ints_0, int_3, 512, int_0 + 1, int_4, int_2);
				}

				int_3 += 4;
			}
		}

		int_2 = (((238 + (int) (Math.random() * 20.0D)) - 10) << 16)
				+ (((238 + (int) (Math.random() * 20.0D)) - 10) << 8) + ((238 + (int) (Math.random() * 20.0D)) - 10);
		int_3 = ((238 + (int) (Math.random() * 20.0D)) - 10) << 16;
		Enum4.aSpritePixels3.method915();

		int int_5;
		for (int_4 = 1; int_4 < 103; int_4++) {
			for (int_5 = 1; int_5 < 103; int_5++) {
				if ((Class18.tileSettings[int_0][int_5][int_4] & 0x18) == 0) {
					AClass4_Sub1.method703(int_0, int_5, int_4, int_2, int_3);
				}

				if ((int_0 < 3) && ((Class18.tileSettings[int_0 + 1][int_5][int_4] & 0x8) != 0)) {
					AClass4_Sub1.method703(int_0 + 1, int_5, int_4, int_2, int_3);
				}
			}
		}

		Client.anInt711 = 0;

		for (int_4 = 0; int_4 < 104; int_4++) {
			for (int_5 = 0; int_5 < 104; int_5++) {
				int int_6 = Class8.region.method363(AClass1_Sub1.plane, int_4, int_5);
				if (int_6 != 0) {
					int_6 = (int_6 >> 14) & 0x7FFF;
					final int int_7 = PlayerComposition.getObjectDefinition(int_6).mapIconId;
					if (int_7 >= 0) {
						int int_8 = int_4;
						int int_9 = int_5;
						if ((int_7 != 22) && (int_7 != 29) && (int_7 != 34) && (int_7 != 36) && (int_7 != 46)
								&& (int_7 != 47) && (int_7 != 48)) {
							final int[][] ints_1 = Client.collisionMaps[AClass1_Sub1.plane].flags;

							for (int int_10 = 0; int_10 < 10; int_10++) {
								final int int_11 = (int) (Math.random() * 4.0D);
								if ((int_11 == 0) && (int_8 > 0) && (int_8 > (int_4 - 3))
										&& ((ints_1[int_8 - 1][int_9] & 0x1240108) == 0)) {
									--int_8;
								}

								if ((int_11 == 1) && (int_8 < 103) && (int_8 < (int_4 + 3))
										&& ((ints_1[int_8 + 1][int_9] & 0x1240180) == 0)) {
									++int_8;
								}

								if ((int_11 == 2) && (int_9 > 0) && (int_9 > (int_5 - 3))
										&& ((ints_1[int_8][int_9 - 1] & 0x1240102) == 0)) {
									--int_9;
								}

								if ((int_11 == 3) && (int_9 < 103) && (int_9 < (int_5 + 3))
										&& ((ints_1[int_8][int_9 + 1] & 0x1240120) == 0)) {
									++int_9;
								}
							}
						}

						Client.aSpritePixelsArray4[Client.anInt711] = Class17.anAreaArray1[int_7].method755(false);
						Client.anIntArray155[Client.anInt711] = int_8;
						Client.anIntArray156[Client.anInt711] = int_9;
						++Client.anInt711;
					}
				}
			}
		}

		GZipDecompressor.aBufferProvider1.setRaster();
	}

}
