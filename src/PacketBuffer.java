import java.awt.FontMetrics;

public final class PacketBuffer extends Buffer {

	static FontMetrics aFontMetrics1;
	static final int[] anIntArray106;
	int bitPosition;
	ISAACCipher cipher;

	static {
		anIntArray106 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535,
				131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
				268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	}

	public PacketBuffer(final int int_0) {
		super(int_0);
	}

	public int readOpcode() {
		return (super.payload[super.offset++] - cipher.nextInt()) & 0xFF;
	}

	// TODO reimplement ISAAC
	public void putOpcode(final int int_0) {
		super.payload[super.offset++] = (byte) (int_0 /*+ cipher.nextInt()*/);
	}

	public void bitAccess() {
		bitPosition = super.offset * 8;
	}

	public int getBits(int int_0) {
		int int_1 = bitPosition >> 3;
		int int_2 = 8 - (bitPosition & 0x7);
		int int_3 = 0;

		for (bitPosition += int_0; int_0 > int_2; int_2 = 8) {
			int_3 += (super.payload[int_1++] & anIntArray106[int_2]) << (int_0 - int_2);
			int_0 -= int_2;
		}

		if (int_2 == int_0) {
			int_3 += super.payload[int_1] & anIntArray106[int_2];
		} else {
			int_3 += (super.payload[int_1] >> (int_2 - int_0)) & anIntArray106[int_0];
		}

		return int_3;
	}

	public void byteAccess() {
		super.offset = (bitPosition + 7) / 8;
	}

	public int bitsAvail(final int int_0) {
		return (int_0 * 8) - bitPosition;
	}

	public void seed(final int[] ints_0) {
		cipher = new ISAACCipher(ints_0);
	}

	static void method842(final World[] worlds_0, final int int_0, final int int_1, final int[] ints_0,
			final int[] ints_1) {
		if (int_0 < int_1) {
			int int_2 = int_0 - 1;
			int int_3 = int_1 + 1;
			final int int_4 = (int_1 + int_0) / 2;
			final World world_0 = worlds_0[int_4];
			worlds_0[int_4] = worlds_0[int_0];
			worlds_0[int_0] = world_0;

			while (int_2 < int_3) {
				boolean bool_0 = true;

				int int_5;
				int int_6;
				int int_7;
				do {
					--int_3;

					for (int_5 = 0; int_5 < 4; int_5++) {
						if (ints_0[int_5] == 2) {
							int_6 = worlds_0[int_3].index;
							int_7 = world_0.index;
						} else if (ints_0[int_5] == 1) {
							int_6 = worlds_0[int_3].playerCount;
							int_7 = world_0.playerCount;
							if ((int_6 == -1) && (ints_1[int_5] == 1)) {
								int_6 = 2001;
							}

							if ((int_7 == -1) && (ints_1[int_5] == 1)) {
								int_7 = 2001;
							}
						} else if (ints_0[int_5] == 3) {
							int_6 = worlds_0[int_3].method519() ? 1 : 0;
							int_7 = world_0.method519() ? 1 : 0;
						} else {
							int_6 = worlds_0[int_3].anInt227;
							int_7 = world_0.anInt227;
						}

						if (int_7 != int_6) {
							if (((ints_1[int_5] != 1) || (int_6 <= int_7))
									&& ((ints_1[int_5] != 0) || (int_6 >= int_7))) {
								bool_0 = false;
							}
							break;
						}

						if (int_5 == 3) {
							bool_0 = false;
						}
					}
				} while (bool_0);

				bool_0 = true;

				do {
					++int_2;

					for (int_5 = 0; int_5 < 4; int_5++) {
						if (ints_0[int_5] == 2) {
							int_6 = worlds_0[int_2].index;
							int_7 = world_0.index;
						} else if (ints_0[int_5] == 1) {
							int_6 = worlds_0[int_2].playerCount;
							int_7 = world_0.playerCount;
							if ((int_6 == -1) && (ints_1[int_5] == 1)) {
								int_6 = 2001;
							}

							if ((int_7 == -1) && (ints_1[int_5] == 1)) {
								int_7 = 2001;
							}
						} else if (ints_0[int_5] == 3) {
							int_6 = worlds_0[int_2].method519() ? 1 : 0;
							int_7 = world_0.method519() ? 1 : 0;
						} else {
							int_6 = worlds_0[int_2].anInt227;
							int_7 = world_0.anInt227;
						}

						if (int_7 != int_6) {
							if (((ints_1[int_5] != 1) || (int_6 >= int_7))
									&& ((ints_1[int_5] != 0) || (int_6 <= int_7))) {
								bool_0 = false;
							}
							break;
						}

						if (int_5 == 3) {
							bool_0 = false;
						}
					}
				} while (bool_0);

				if (int_2 < int_3) {
					final World world_1 = worlds_0[int_2];
					worlds_0[int_2] = worlds_0[int_3];
					worlds_0[int_3] = world_1;
				}
			}

			method842(worlds_0, int_0, int_3, ints_0, ints_1);
			method842(worlds_0, int_3 + 1, int_1, ints_0, ints_1);
		}
	}

}
