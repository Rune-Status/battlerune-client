public final class AClass4_Sub1 extends AClass4 {

	static Task aTask2;
	static int menuY;
	static int menuWidth;
	static int baseY;
	static ModIcon[] aModIconArray7;
	static int[] anIntArray81;
	static IndexData indexTrack2;
	static int[] anIntArray82;
	final int anInt428;
	final int anInt429;
	final int anInt430;
	final int anInt431;
	final int anInt432;
	final int anInt433;
	final int anInt434;

	AClass4_Sub1(final Model model_0, final int int_0, final int int_1, final int int_2, final int int_3) {
		anInt428 = (int_0 + model_0.anInt597) - model_0.anInt594;
		anInt430 = (int_1 + model_0.anInt601) - model_0.anInt602;
		anInt432 = (int_2 + model_0.anInt603) - model_0.anInt605;
		anInt429 = int_0 + model_0.anInt597 + model_0.anInt594;
		anInt431 = int_1 + model_0.anInt601 + model_0.anInt602;
		anInt433 = int_2 + model_0.anInt603 + model_0.anInt605;
		anInt434 = int_3;
	}

	@Override
	final void method611() {
		for (int int_0 = 0; int_0 < 8; int_0++) {
			final int int_1 = (int_0 & 0x1) == 0 ? anInt428 : anInt429;
			final int int_2 = (int_0 & 0x2) == 0 ? anInt430 : anInt431;
			final int int_3 = (int_0 & 0x4) == 0 ? anInt432 : anInt433;
			if ((int_0 & 0x1) == 0) {
				Class87.method466(int_1, int_2, int_3, anInt429, int_2, int_3, anInt434);
			}

			if ((int_0 & 0x2) == 0) {
				Class87.method466(int_1, int_2, int_3, int_1, anInt431, int_3, anInt434);
			}

			if ((int_0 & 0x4) == 0) {
				Class87.method466(int_1, int_2, int_3, int_1, int_2, anInt433, anInt434);
			}
		}

	}

	static final void method703(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4) {
		int int_5 = Class8.region.method361(int_0, int_1, int_2);
		int int_6;
		int int_7;
		int int_8;
		int int_9;
		int int_10;
		int int_11;
		if (int_5 != 0) {
			int_6 = Class8.region.method364(int_0, int_1, int_2, int_5);
			int_7 = (int_6 >> 6) & 0x3;
			int_8 = int_6 & 0x1F;
			int_9 = int_3;
			if (int_5 > 0) {
				int_9 = int_4;
			}

			final int[] ints_0 = Enum4.aSpritePixels3.image;
			int_10 = ((103 - int_2) * 2048) + (4 * int_1) + 24624;
			int_11 = (int_5 >> 14) & 0x7FFF;
			final ObjectComposition objectcomposition_0 = PlayerComposition.getObjectDefinition(int_11);
			if (objectcomposition_0.mapSceneId != -1) {
				final ModIcon modicon_0 = GZipDecompressor.aModIconArray6[objectcomposition_0.mapSceneId];
				if (modicon_0 != null) {
					final int int_12 = ((objectcomposition_0.sizeX * 4) - modicon_0.originalWidth) / 2;
					final int int_13 = ((objectcomposition_0.sizeY * 4) - modicon_0.height) / 2;
					modicon_0.method886(int_12 + 48 + (4 * int_1),
							int_13 + ((104 - int_2 - objectcomposition_0.sizeY) * 4) + 48);
				}
			} else {
				if ((int_8 == 0) || (int_8 == 2)) {
					if (int_7 == 0) {
						ints_0[int_10] = int_9;
						ints_0[int_10 + 512] = int_9;
						ints_0[int_10 + 1024] = int_9;
						ints_0[int_10 + 1536] = int_9;
					} else if (int_7 == 1) {
						ints_0[int_10] = int_9;
						ints_0[int_10 + 1] = int_9;
						ints_0[int_10 + 2] = int_9;
						ints_0[int_10 + 3] = int_9;
					} else if (int_7 == 2) {
						ints_0[int_10 + 3] = int_9;
						ints_0[int_10 + 3 + 512] = int_9;
						ints_0[int_10 + 3 + 1024] = int_9;
						ints_0[int_10 + 3 + 1536] = int_9;
					} else if (int_7 == 3) {
						ints_0[int_10 + 1536] = int_9;
						ints_0[1536 + int_10 + 1] = int_9;
						ints_0[int_10 + 1536 + 2] = int_9;
						ints_0[int_10 + 1536 + 3] = int_9;
					}
				}

				if (int_8 == 3) {
					if (int_7 == 0) {
						ints_0[int_10] = int_9;
					} else if (int_7 == 1) {
						ints_0[int_10 + 3] = int_9;
					} else if (int_7 == 2) {
						ints_0[int_10 + 3 + 1536] = int_9;
					} else if (int_7 == 3) {
						ints_0[int_10 + 1536] = int_9;
					}
				}

				if (int_8 == 2) {
					if (int_7 == 3) {
						ints_0[int_10] = int_9;
						ints_0[int_10 + 512] = int_9;
						ints_0[int_10 + 1024] = int_9;
						ints_0[int_10 + 1536] = int_9;
					} else if (int_7 == 0) {
						ints_0[int_10] = int_9;
						ints_0[int_10 + 1] = int_9;
						ints_0[int_10 + 2] = int_9;
						ints_0[int_10 + 3] = int_9;
					} else if (int_7 == 1) {
						ints_0[int_10 + 3] = int_9;
						ints_0[3 + int_10 + 512] = int_9;
						ints_0[int_10 + 3 + 1024] = int_9;
						ints_0[int_10 + 3 + 1536] = int_9;
					} else if (int_7 == 2) {
						ints_0[int_10 + 1536] = int_9;
						ints_0[int_10 + 1536 + 1] = int_9;
						ints_0[int_10 + 1536 + 2] = int_9;
						ints_0[int_10 + 1536 + 3] = int_9;
					}
				}
			}
		}

		int_5 = Class8.region.method365(int_0, int_1, int_2);
		if (int_5 != 0) {
			int_6 = Class8.region.method364(int_0, int_1, int_2, int_5);
			int_7 = (int_6 >> 6) & 0x3;
			int_8 = int_6 & 0x1F;
			int_9 = (int_5 >> 14) & 0x7FFF;
			final ObjectComposition objectcomposition_2 = PlayerComposition.getObjectDefinition(int_9);
			int int_14;
			if (objectcomposition_2.mapSceneId != -1) {
				final ModIcon modicon_1 = GZipDecompressor.aModIconArray6[objectcomposition_2.mapSceneId];
				if (modicon_1 != null) {
					int_11 = ((objectcomposition_2.sizeX * 4) - modicon_1.originalWidth) / 2;
					int_14 = ((objectcomposition_2.sizeY * 4) - modicon_1.height) / 2;
					modicon_1.method886((4 * int_1) + 48 + int_11,
							int_14 + ((104 - int_2 - objectcomposition_2.sizeY) * 4) + 48);
				}
			} else if (int_8 == 9) {
				int_10 = 15658734;
				if (int_5 > 0) {
					int_10 = 15597568;
				}

				final int[] ints_1 = Enum4.aSpritePixels3.image;
				int_14 = (int_1 * 4) + 24624 + ((103 - int_2) * 2048);
				if ((int_7 != 0) && (int_7 != 2)) {
					ints_1[int_14] = int_10;
					ints_1[int_14 + 512 + 1] = int_10;
					ints_1[int_14 + 1024 + 2] = int_10;
					ints_1[int_14 + 1536 + 3] = int_10;
				} else {
					ints_1[int_14 + 1536] = int_10;
					ints_1[int_14 + 1024 + 1] = int_10;
					ints_1[int_14 + 512 + 2] = int_10;
					ints_1[int_14 + 3] = int_10;
				}
			}
		}

		int_5 = Class8.region.method363(int_0, int_1, int_2);
		if (int_5 != 0) {
			int_6 = (int_5 >> 14) & 0x7FFF;
			final ObjectComposition objectcomposition_1 = PlayerComposition.getObjectDefinition(int_6);
			if (objectcomposition_1.mapSceneId != -1) {
				final ModIcon modicon_2 = GZipDecompressor.aModIconArray6[objectcomposition_1.mapSceneId];
				if (modicon_2 != null) {
					int_9 = ((objectcomposition_1.sizeX * 4) - modicon_2.originalWidth) / 2;
					final int int_15 = ((objectcomposition_1.sizeY * 4) - modicon_2.height) / 2;
					modicon_2.method886(int_9 + (int_1 * 4) + 48,
							int_15 + (4 * (104 - int_2 - objectcomposition_1.sizeY)) + 48);
					return;
				}
			}
		}

	}

}
