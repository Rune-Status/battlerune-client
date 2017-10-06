import java.util.LinkedList;

public abstract class AClass1 {

	static Client clientInstance;
	int anInt48;
	int anInt49;
	short[][][] aShortArrayArrayArray1;
	int anInt50;
	Class12[][][][] aClass12ArrayArrayArrayArray1;
	short[][][] aShortArrayArrayArray2;
	int anInt51;
	byte[][][] aByteArrayArrayArray2;
	int anInt52;
	byte[][][] aByteArrayArrayArray3;
	int anInt53;

	AClass1() {
		new LinkedList();
	}

	int method183(final int int_0, final int int_1) {
		return (int_0 >= 0) && (int_1 >= 0)
				? ((int_0 < 64) && (int_1 < 64) ? aShortArrayArrayArray1[0][int_0][int_1] - 1 : -1) : -1;
	}

	void method184(final int int_0, final int int_1, final Buffer buffer_0, final int int_2) {
		final int int_3 = ((int_2 & 0x18) >> 3) + 1;
		final boolean bool_0 = (int_2 & 0x2) != 0;
		final boolean bool_1 = (int_2 & 0x4) != 0;
		aShortArrayArrayArray1[0][int_0][int_1] = (short) buffer_0.readUnsignedByte();
		int int_4;
		int int_5;
		int int_7;
		if (bool_0) {
			int_4 = buffer_0.readUnsignedByte();

			for (int_5 = 0; int_5 < int_4; int_5++) {
				final int int_6 = buffer_0.readUnsignedByte();
				if (int_6 != 0) {
					aShortArrayArrayArray2[int_5][int_0][int_1] = (short) int_6;
					int_7 = buffer_0.readUnsignedByte();
					aByteArrayArrayArray2[int_5][int_0][int_1] = (byte) (int_7 >> 2);
					aByteArrayArrayArray3[int_5][int_0][int_1] = (byte) (int_7 & 0x3);
				}
			}
		}

		if (bool_1) {
			for (int_4 = 0; int_4 < int_3; int_4++) {
				int_5 = buffer_0.readUnsignedByte();
				if (int_5 != 0) {
					final Class12[] class12s_0 = aClass12ArrayArrayArrayArray1[int_4][int_0][int_1] = new Class12[int_5];

					for (int_7 = 0; int_7 < int_5; int_7++) {
						final int int_8 = buffer_0.method661();
						final int int_9 = buffer_0.readUnsignedByte();
						class12s_0[int_7] = new Class12(int_8, int_9 >> 2, int_9 & 0x3);
					}
				}
			}
		}

	}

	void method185(final int int_0, final int int_1, final Buffer buffer_0, final int int_2) {
		final boolean bool_0 = (int_2 & 0x2) != 0;
		if (bool_0) {
			aShortArrayArrayArray2[0][int_0][int_1] = (short) buffer_0.readUnsignedByte();
		}

		aShortArrayArrayArray1[0][int_0][int_1] = (short) buffer_0.readUnsignedByte();
	}

	int method186() {
		return anInt49;
	}

	int method187() {
		return anInt48;
	}

	void method188(final int int_0, final int int_1, final Buffer buffer_0) {
		final int int_2 = buffer_0.readUnsignedByte();
		if (int_2 != 0) {
			if ((int_2 & 0x1) != 0) {
				method185(int_0, int_1, buffer_0, int_2);
			} else {
				method184(int_0, int_1, buffer_0, int_2);
			}
		}
	}

}
