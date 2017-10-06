public final class ISAACCipher {

	static ModIcon aModIcon2;
	int valuesRemaining;
	int anInt193;
	int anInt194;
	int[] anIntArray45;
	int[] randResult;
	int anInt195;

	ISAACCipher(final int[] ints_0) {
		anIntArray45 = new int[256];
		randResult = new int[256];

		for (int int_0 = 0; int_0 < ints_0.length; int_0++) {
			randResult[int_0] = ints_0[int_0];
		}

		method465();
	}

	final void generateMoreResults() {
		anInt193 += ++anInt194;

		for (int int_0 = 0; int_0 < 256; int_0++) {
			final int int_1 = anIntArray45[int_0];
			if ((int_0 & 0x2) == 0) {
				if ((int_0 & 0x1) == 0) {
					anInt195 ^= anInt195 << 13;
				} else {
					anInt195 ^= anInt195 >>> 6;
				}
			} else if ((int_0 & 0x1) == 0) {
				anInt195 ^= anInt195 << 2;
			} else {
				anInt195 ^= anInt195 >>> 16;
			}

			anInt195 += anIntArray45[(int_0 + 128) & 0xFF];
			int int_2;
			anIntArray45[int_0] = int_2 = anInt193 + anInt195 + anIntArray45[(int_1 & 0x3FC) >> 2];
			randResult[int_0] = anInt193 = int_1 + anIntArray45[((int_2 >> 8) & 0x3FC) >> 2];
		}

	}

	final void method465() {
		int int_0 = -1640531527;
		int int_1 = -1640531527;
		int int_2 = -1640531527;
		int int_3 = -1640531527;
		int int_4 = -1640531527;
		int int_5 = -1640531527;
		int int_6 = -1640531527;
		int int_7 = -1640531527;

		int int_8;
		for (int_8 = 0; int_8 < 4; int_8++) {
			int_7 ^= int_6 << 11;
			int_4 += int_7;
			int_6 += int_5;
			int_6 ^= int_5 >>> 2;
			int_3 += int_6;
			int_5 += int_4;
			int_5 ^= int_4 << 8;
			int_2 += int_5;
			int_4 += int_3;
			int_4 ^= int_3 >>> 16;
			int_1 += int_4;
			int_3 += int_2;
			int_3 ^= int_2 << 10;
			int_0 += int_3;
			int_2 += int_1;
			int_2 ^= int_1 >>> 4;
			int_7 += int_2;
			int_1 += int_0;
			int_1 ^= int_0 << 8;
			int_6 += int_1;
			int_0 += int_7;
			int_0 ^= int_7 >>> 9;
			int_5 += int_0;
			int_7 += int_6;
		}

		for (int_8 = 0; int_8 < 256; int_8 += 8) {
			int_7 += randResult[int_8];
			int_6 += randResult[int_8 + 1];
			int_5 += randResult[int_8 + 2];
			int_4 += randResult[int_8 + 3];
			int_3 += randResult[int_8 + 4];
			int_2 += randResult[int_8 + 5];
			int_1 += randResult[int_8 + 6];
			int_0 += randResult[int_8 + 7];
			int_7 ^= int_6 << 11;
			int_4 += int_7;
			int_6 += int_5;
			int_6 ^= int_5 >>> 2;
			int_3 += int_6;
			int_5 += int_4;
			int_5 ^= int_4 << 8;
			int_2 += int_5;
			int_4 += int_3;
			int_4 ^= int_3 >>> 16;
			int_1 += int_4;
			int_3 += int_2;
			int_3 ^= int_2 << 10;
			int_0 += int_3;
			int_2 += int_1;
			int_2 ^= int_1 >>> 4;
			int_7 += int_2;
			int_1 += int_0;
			int_1 ^= int_0 << 8;
			int_6 += int_1;
			int_0 += int_7;
			int_0 ^= int_7 >>> 9;
			int_5 += int_0;
			int_7 += int_6;
			anIntArray45[int_8] = int_7;
			anIntArray45[int_8 + 1] = int_6;
			anIntArray45[int_8 + 2] = int_5;
			anIntArray45[int_8 + 3] = int_4;
			anIntArray45[int_8 + 4] = int_3;
			anIntArray45[int_8 + 5] = int_2;
			anIntArray45[int_8 + 6] = int_1;
			anIntArray45[int_8 + 7] = int_0;
		}

		for (int_8 = 0; int_8 < 256; int_8 += 8) {
			int_7 += anIntArray45[int_8];
			int_6 += anIntArray45[int_8 + 1];
			int_5 += anIntArray45[int_8 + 2];
			int_4 += anIntArray45[int_8 + 3];
			int_3 += anIntArray45[int_8 + 4];
			int_2 += anIntArray45[int_8 + 5];
			int_1 += anIntArray45[int_8 + 6];
			int_0 += anIntArray45[int_8 + 7];
			int_7 ^= int_6 << 11;
			int_4 += int_7;
			int_6 += int_5;
			int_6 ^= int_5 >>> 2;
			int_3 += int_6;
			int_5 += int_4;
			int_5 ^= int_4 << 8;
			int_2 += int_5;
			int_4 += int_3;
			int_4 ^= int_3 >>> 16;
			int_1 += int_4;
			int_3 += int_2;
			int_3 ^= int_2 << 10;
			int_0 += int_3;
			int_2 += int_1;
			int_2 ^= int_1 >>> 4;
			int_7 += int_2;
			int_1 += int_0;
			int_1 ^= int_0 << 8;
			int_6 += int_1;
			int_0 += int_7;
			int_0 ^= int_7 >>> 9;
			int_5 += int_0;
			int_7 += int_6;
			anIntArray45[int_8] = int_7;
			anIntArray45[int_8 + 1] = int_6;
			anIntArray45[int_8 + 2] = int_5;
			anIntArray45[int_8 + 3] = int_4;
			anIntArray45[int_8 + 4] = int_3;
			anIntArray45[int_8 + 5] = int_2;
			anIntArray45[int_8 + 6] = int_1;
			anIntArray45[int_8 + 7] = int_0;
		}

		generateMoreResults();
		valuesRemaining = 256;
	}

	final int nextInt() {
		if ((--valuesRemaining + 1) == 0) {
			generateMoreResults();
			valuesRemaining = 255;
		}

		return randResult[valuesRemaining];
	}

	public static ModIcon getSprite(final IndexDataBase indexdatabase_0, final String string_0, final String string_1) {
		final int int_0 = indexdatabase_0.getFile(string_0);
		final int int_1 = indexdatabase_0.getChild(int_0, string_1);
		return Projectile.method939(indexdatabase_0, int_0, int_1);
	}

}
