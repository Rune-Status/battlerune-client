public final class DState {

	final int anInt114;
	final int anInt115;
	final int anInt116;
	final int anInt117;
	final int anInt118;
	final int anInt119;
	int next_in;
	int next_out;
	int[] anIntArray25;
	int[] anIntArray26;
	boolean[] inUse;
	boolean[] aBoolArray2;
	byte[] seqToUnseq;
	byte[] aByteArray6;
	byte[] strm;
	int[] anIntArray27;
	byte[] aByteArray7;
	byte[] aByteArray8;
	byte[] out;
	byte[][] aByteArrayArray3;
	int[][] anIntArrayArray6;
	int[][] anIntArrayArray7;
	int[][] anIntArrayArray8;
	int anInt120;
	int[] anIntArray28;
	int total_in_lo32;
	int total_in_hi32;
	int total_out_lo32;
	int total_out_hi32;
	int blockSize100k;
	int anInt121;
	int nInUse;
	int out_len;
	byte out_ch;
	int tPos;
	int nblock_used;
	int anInt122;
	int anInt123;

	DState() {
		anInt114 = 4096;
		anInt115 = 16;
		anInt116 = 258;
		anInt117 = 6;
		anInt118 = 50;
		anInt119 = 18002;
		next_in = 0;
		next_out = 0;
		anIntArray25 = new int[256];
		anIntArray26 = new int[257];
		inUse = new boolean[256];
		aBoolArray2 = new boolean[16];
		seqToUnseq = new byte[256];
		aByteArray6 = new byte[4096];
		anIntArray27 = new int[16];
		aByteArray7 = new byte[18002];
		aByteArray8 = new byte[18002];
		aByteArrayArray3 = new byte[6][258];
		anIntArrayArray6 = new int[6][258];
		anIntArrayArray7 = new int[6][258];
		anIntArrayArray8 = new int[6][258];
		anIntArray28 = new int[6];
	}

	static final int method311(final double double_0, final double double_1, final double double_2) {
		double double_3 = double_2;
		double double_4 = double_2;
		double double_5 = double_2;
		if (double_1 != 0.0D) {
			double double_6;
			if (double_2 < 0.5D) {
				double_6 = double_2 * (double_1 + 1.0D);
			} else {
				double_6 = (double_1 + double_2) - (double_2 * double_1);
			}

			final double double_7 = (double_2 * 2.0D) - double_6;
			double double_8 = 0.3333333333333333D + double_0;
			if (double_8 > 1.0D) {
				--double_8;
			}

			double double_9 = double_0 - 0.3333333333333333D;
			if (double_9 < 0.0D) {
				++double_9;
			}

			if ((double_8 * 6.0D) < 1.0D) {
				double_3 = double_7 + (double_8 * (double_6 - double_7) * 6.0D);
			} else if ((double_8 * 2.0D) < 1.0D) {
				double_3 = double_6;
			} else if ((3.0D * double_8) < 2.0D) {
				double_3 = (6.0D * (double_6 - double_7) * (0.6666666666666666D - double_8)) + double_7;
			} else {
				double_3 = double_7;
			}

			if ((6.0D * double_0) < 1.0D) {
				double_4 = double_7 + (double_0 * (double_6 - double_7) * 6.0D);
			} else if ((double_0 * 2.0D) < 1.0D) {
				double_4 = double_6;
			} else if ((double_0 * 3.0D) < 2.0D) {
				double_4 = ((double_6 - double_7) * (0.6666666666666666D - double_0) * 6.0D) + double_7;
			} else {
				double_4 = double_7;
			}

			if ((double_9 * 6.0D) < 1.0D) {
				double_5 = double_7 + (6.0D * (double_6 - double_7) * double_9);
			} else if ((double_9 * 2.0D) < 1.0D) {
				double_5 = double_6;
			} else if ((3.0D * double_9) < 2.0D) {
				double_5 = double_7 + ((0.6666666666666666D - double_9) * (double_6 - double_7) * 6.0D);
			} else {
				double_5 = double_7;
			}
		}

		final int int_0 = (int) (double_3 * 256.0D);
		final int int_1 = (int) (256.0D * double_4);
		final int int_2 = (int) (256.0D * double_5);
		final int int_3 = int_2 + (int_1 << 8) + (int_0 << 16);
		return int_3;
	}

	static char method312(final char char_0) {
		if ((char_0 >= 192) && (char_0 <= 255)) {
			if ((char_0 >= 192) && (char_0 <= 198)) {
				return '\u0041';
			}

			if (char_0 == 199) {
				return '\u0043';
			}

			if ((char_0 >= 200) && (char_0 <= 203)) {
				return '\u0045';
			}

			if ((char_0 >= 204) && (char_0 <= 207)) {
				return '\u0049';
			}

			if ((char_0 >= 210) && (char_0 <= 214)) {
				return '\u004f';
			}

			if ((char_0 >= 217) && (char_0 <= 220)) {
				return '\u0055';
			}

			if (char_0 == 221) {
				return '\u0059';
			}

			if (char_0 == 223) {
				return '\u0073';
			}

			if ((char_0 >= 224) && (char_0 <= 230)) {
				return '\u0061';
			}

			if (char_0 == 231) {
				return '\u0063';
			}

			if ((char_0 >= 232) && (char_0 <= 235)) {
				return '\u0065';
			}

			if ((char_0 >= 236) && (char_0 <= 239)) {
				return '\u0069';
			}

			if ((char_0 >= 242) && (char_0 <= 246)) {
				return '\u006f';
			}

			if ((char_0 >= 249) && (char_0 <= 252)) {
				return '\u0075';
			}

			if ((char_0 == 253) || (char_0 == 255)) {
				return '\u0079';
			}
		}

		if (char_0 == 338) {
			return '\u004f';
		} else if (char_0 == 339) {
			return '\u006f';
		} else if (char_0 == 376) {
			return '\u0059';
		} else {
			return char_0;
		}
	}

}
