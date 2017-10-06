public class Class69 {

	static final byte[] aByteArray9;
	long aLong10;
	int[] anIntArray41;
	Buffer aBuffer3;
	int anInt173;
	int[] anIntArray42;
	int[] anIntArray43;
	int[] anIntArray44;
	int anInt174;

	static {
		aByteArray9 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
				(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
				(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
				(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
				(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
				(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
				(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
				(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
				(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
				(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2,
				(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
				(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
	}

	Class69(final byte[] bytes_0) {
		aBuffer3 = new Buffer((byte[]) null);
		method407(bytes_0);
	}

	Class69() {
		aBuffer3 = new Buffer((byte[]) null);
	}

	int method404(final int int_0) {
		final byte byte_0 = aBuffer3.payload[aBuffer3.offset];
		int int_3;
		if (byte_0 < 0) {
			int_3 = byte_0 & 0xFF;
			anIntArray44[int_0] = int_3;
			++aBuffer3.offset;
		} else {
			int_3 = anIntArray44[int_0];
		}

		if ((int_3 != 240) && (int_3 != 247)) {
			return method413(int_0, int_3);
		} else {
			final int int_1 = aBuffer3.readVarInt();
			if ((int_3 == 247) && (int_1 > 0)) {
				final int int_2 = aBuffer3.payload[aBuffer3.offset] & 0xFF;
				if (((int_2 >= 241) && (int_2 <= 243)) || (int_2 == 246) || (int_2 == 248)
						|| ((int_2 >= 250) && (int_2 <= 252)) || (int_2 == 254)) {
					++aBuffer3.offset;
					anIntArray44[int_0] = int_2;
					return method413(int_0, int_2);
				}
			}

			aBuffer3.offset += int_1;
			return 0;
		}
	}

	void method405() {
		aBuffer3.payload = null;
		anIntArray42 = null;
		anIntArray41 = null;
		anIntArray43 = null;
		anIntArray44 = null;
	}

	boolean method406() {
		return aBuffer3.payload != null;
	}

	void method407(final byte[] bytes_0) {
		aBuffer3.payload = bytes_0;
		aBuffer3.offset = 10;
		final int int_0 = aBuffer3.readUnsignedShort();
		anInt174 = aBuffer3.readUnsignedShort();
		anInt173 = 500000;
		anIntArray42 = new int[int_0];

		int int_1;
		int int_3;
		for (int_1 = 0; int_1 < int_0; aBuffer3.offset += int_3) {
			final int int_2 = aBuffer3.readInt();
			int_3 = aBuffer3.readInt();
			if (int_2 == 1297379947) {
				anIntArray42[int_1] = aBuffer3.offset;
				++int_1;
			}
		}

		aLong10 = 0L;
		anIntArray41 = new int[int_0];

		for (int_1 = 0; int_1 < int_0; int_1++) {
			anIntArray41[int_1] = anIntArray42[int_1];
		}

		anIntArray43 = new int[int_0];
		anIntArray44 = new int[int_0];
	}

	void method408(final int int_0) {
		aBuffer3.offset = anIntArray41[int_0];
	}

	int method409() {
		final int int_0 = anIntArray41.length;
		int int_1 = -1;
		int int_2 = Integer.MAX_VALUE;

		for (int int_3 = 0; int_3 < int_0; int_3++) {
			if ((anIntArray41[int_3] >= 0) && (anIntArray43[int_3] < int_2)) {
				int_1 = int_3;
				int_2 = anIntArray43[int_3];
			}
		}

		return int_1;
	}

	int method410() {
		return anIntArray41.length;
	}

	int method411(final int int_0) {
		final int int_1 = method404(int_0);
		return int_1;
	}

	void method412(final int int_0) {
		final int int_1 = aBuffer3.readVarInt();
		anIntArray43[int_0] += int_1;
	}

	int method413(final int int_0, final int int_1) {
		int int_2;
		if (int_1 == 255) {
			final int int_5 = aBuffer3.readUnsignedByte();
			int_2 = aBuffer3.readVarInt();
			if (int_5 == 47) {
				aBuffer3.offset += int_2;
				return 1;
			} else if (int_5 == 81) {
				final int int_3 = aBuffer3.read24BitInt();
				int_2 -= 3;
				final int int_4 = anIntArray43[int_0];
				aLong10 += (long) int_4 * (long) (anInt173 - int_3);
				anInt173 = int_3;
				aBuffer3.offset += int_2;
				return 2;
			} else {
				aBuffer3.offset += int_2;
				return 3;
			}
		} else {
			final byte byte_0 = aByteArray9[int_1 - 128];
			int_2 = int_1;
			if (byte_0 >= 1) {
				int_2 = int_1 | (aBuffer3.readUnsignedByte() << 8);
			}

			if (byte_0 >= 2) {
				int_2 |= aBuffer3.readUnsignedByte() << 16;
			}

			return int_2;
		}
	}

	long method414(final int int_0) {
		return aLong10 + ((long) int_0 * (long) anInt173);
	}

	void method415() {
		aBuffer3.offset = -1;
	}

	void method416(final int int_0) {
		anIntArray41[int_0] = aBuffer3.offset;
	}

	boolean method417() {
		final int int_0 = anIntArray41.length;

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			if (anIntArray41[int_1] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method418(final long long_0) {
		aLong10 = long_0;
		final int int_0 = anIntArray41.length;

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			anIntArray43[int_1] = 0;
			anIntArray44[int_1] = 0;
			aBuffer3.offset = anIntArray42[int_1];
			method412(int_1);
			anIntArray41[int_1] = aBuffer3.offset;
		}

	}

}
