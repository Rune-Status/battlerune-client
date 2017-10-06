public class Node_Sub6 extends Node {

	int[] anIntArray79;
	AClass7_Sub1[] anAClass7_Sub1Array1;
	short[] aShortArray4;
	byte[] aByteArray15;
	byte[] aByteArray16;
	Class75[] aClass75Array1;
	byte[] aByteArray17;
	int anInt391;

	Node_Sub6(final byte[] bytes_0) {
		anAClass7_Sub1Array1 = new AClass7_Sub1[128];
		aShortArray4 = new short[128];
		aByteArray15 = new byte[128];
		aByteArray16 = new byte[128];
		aClass75Array1 = new Class75[128];
		aByteArray17 = new byte[128];
		anIntArray79 = new int[128];
		final Buffer buffer_0 = new Buffer(bytes_0);

		int int_0;
		for (int_0 = 0; buffer_0.payload[buffer_0.offset + int_0] != 0; int_0++) {
			;
		}

		final byte[] bytes_1 = new byte[int_0];

		int int_1;
		for (int_1 = 0; int_1 < int_0; int_1++) {
			bytes_1[int_1] = buffer_0.readByte();
		}

		++buffer_0.offset;
		++int_0;
		int_1 = buffer_0.offset;
		buffer_0.offset += int_0;

		int int_2;
		for (int_2 = 0; buffer_0.payload[int_2 + buffer_0.offset] != 0; int_2++) {
			;
		}

		final byte[] bytes_2 = new byte[int_2];

		int int_3;
		for (int_3 = 0; int_3 < int_2; int_3++) {
			bytes_2[int_3] = buffer_0.readByte();
		}

		++buffer_0.offset;
		++int_2;
		int_3 = buffer_0.offset;
		buffer_0.offset += int_2;

		int int_4;
		for (int_4 = 0; buffer_0.payload[int_4 + buffer_0.offset] != 0; int_4++) {
			;
		}

		final byte[] bytes_3 = new byte[int_4];

		for (int int_5 = 0; int_5 < int_4; int_5++) {
			bytes_3[int_5] = buffer_0.readByte();
		}

		++buffer_0.offset;
		++int_4;
		final byte[] bytes_4 = new byte[int_4];
		int int_7;
		int int_8;
		if (int_4 > 1) {
			bytes_4[1] = 1;
			int int_6 = 1;
			int_7 = 2;

			for (int_8 = 2; int_8 < int_4; int_8++) {
				int int_9 = buffer_0.readUnsignedByte();
				if (int_9 == 0) {
					int_6 = int_7++;
				} else {
					if (int_9 <= int_6) {
						--int_9;
					}

					int_6 = int_9;
				}

				bytes_4[int_8] = (byte) int_6;
			}
		} else {
			int_7 = int_4;
		}

		final Class75[] class75s_0 = new Class75[int_7];

		Class75 class75_0;
		for (int_8 = 0; int_8 < class75s_0.length; int_8++) {
			class75_0 = class75s_0[int_8] = new Class75();
			int int_10 = buffer_0.readUnsignedByte();
			if (int_10 > 0) {
				class75_0.aByteArray10 = new byte[int_10 * 2];
			}

			int_10 = buffer_0.readUnsignedByte();
			if (int_10 > 0) {
				class75_0.aByteArray11 = new byte[(int_10 * 2) + 2];
				class75_0.aByteArray11[1] = 64;
			}
		}

		int_8 = buffer_0.readUnsignedByte();
		final byte[] bytes_7 = int_8 > 0 ? new byte[int_8 * 2] : null;
		int_8 = buffer_0.readUnsignedByte();
		final byte[] bytes_5 = int_8 > 0 ? new byte[int_8 * 2] : null;

		int int_11;
		for (int_11 = 0; buffer_0.payload[int_11 + buffer_0.offset] != 0; int_11++) {
			;
		}

		final byte[] bytes_6 = new byte[int_11];

		int int_12;
		for (int_12 = 0; int_12 < int_11; int_12++) {
			bytes_6[int_12] = buffer_0.readByte();
		}

		++buffer_0.offset;
		++int_11;
		int_12 = 0;

		int int_13;
		for (int_13 = 0; int_13 < 128; int_13++) {
			int_12 += buffer_0.readUnsignedByte();
			aShortArray4[int_13] = (short) int_12;
		}

		int_12 = 0;

		for (int_13 = 0; int_13 < 128; int_13++) {
			int_12 += buffer_0.readUnsignedByte();
			aShortArray4[int_13] = (short) (aShortArray4[int_13] + (int_12 << 8));
		}

		int_13 = 0;
		int int_14 = 0;
		int int_15 = 0;

		int int_16;
		for (int_16 = 0; int_16 < 128; int_16++) {
			if (int_13 == 0) {
				if (int_14 < bytes_6.length) {
					int_13 = bytes_6[int_14++];
				} else {
					int_13 = -1;
				}

				int_15 = buffer_0.readVarInt();
			}

			aShortArray4[int_16] = (short) (aShortArray4[int_16] + (((int_15 - 1) & 0x2) << 14));
			anIntArray79[int_16] = int_15;
			--int_13;
		}

		int_13 = 0;
		int_14 = 0;
		int_16 = 0;

		int int_17;
		for (int_17 = 0; int_17 < 128; int_17++) {
			if (anIntArray79[int_17] != 0) {
				if (int_13 == 0) {
					if (int_14 < bytes_1.length) {
						int_13 = bytes_1[int_14++];
					} else {
						int_13 = -1;
					}

					int_16 = buffer_0.payload[int_1++] - 1;
				}

				aByteArray17[int_17] = (byte) int_16;
				--int_13;
			}
		}

		int_13 = 0;
		int_14 = 0;
		int_17 = 0;

		for (int int_18 = 0; int_18 < 128; int_18++) {
			if (anIntArray79[int_18] != 0) {
				if (int_13 == 0) {
					if (int_14 < bytes_2.length) {
						int_13 = bytes_2[int_14++];
					} else {
						int_13 = -1;
					}

					int_17 = (buffer_0.payload[int_3++] + 16) << 2;
				}

				aByteArray16[int_18] = (byte) int_17;
				--int_13;
			}
		}

		int_13 = 0;
		int_14 = 0;
		Class75 class75_1 = null;

		int int_19;
		for (int_19 = 0; int_19 < 128; int_19++) {
			if (anIntArray79[int_19] != 0) {
				if (int_13 == 0) {
					class75_1 = class75s_0[bytes_4[int_14]];
					if (int_14 < bytes_3.length) {
						int_13 = bytes_3[int_14++];
					} else {
						int_13 = -1;
					}
				}

				aClass75Array1[int_19] = class75_1;
				--int_13;
			}
		}

		int_13 = 0;
		int_14 = 0;
		int_19 = 0;

		int int_20;
		for (int_20 = 0; int_20 < 128; int_20++) {
			if (int_13 == 0) {
				if (int_14 < bytes_6.length) {
					int_13 = bytes_6[int_14++];
				} else {
					int_13 = -1;
				}

				if (anIntArray79[int_20] > 0) {
					int_19 = buffer_0.readUnsignedByte() + 1;
				}
			}

			aByteArray15[int_20] = (byte) int_19;
			--int_13;
		}

		anInt391 = buffer_0.readUnsignedByte() + 1;

		Class75 class75_2;
		int int_21;
		for (int_20 = 0; int_20 < int_7; int_20++) {
			class75_2 = class75s_0[int_20];
			if (class75_2.aByteArray10 != null) {
				for (int_21 = 1; int_21 < class75_2.aByteArray10.length; int_21 += 2) {
					class75_2.aByteArray10[int_21] = buffer_0.readByte();
				}
			}

			if (class75_2.aByteArray11 != null) {
				for (int_21 = 3; int_21 < (class75_2.aByteArray11.length - 2); int_21 += 2) {
					class75_2.aByteArray11[int_21] = buffer_0.readByte();
				}
			}
		}

		if (bytes_7 != null) {
			for (int_20 = 1; int_20 < bytes_7.length; int_20 += 2) {
				bytes_7[int_20] = buffer_0.readByte();
			}
		}

		if (bytes_5 != null) {
			for (int_20 = 1; int_20 < bytes_5.length; int_20 += 2) {
				bytes_5[int_20] = buffer_0.readByte();
			}
		}

		for (int_20 = 0; int_20 < int_7; int_20++) {
			class75_2 = class75s_0[int_20];
			if (class75_2.aByteArray11 != null) {
				int_12 = 0;

				for (int_21 = 2; int_21 < class75_2.aByteArray11.length; int_21 += 2) {
					int_12 = int_12 + 1 + buffer_0.readUnsignedByte();
					class75_2.aByteArray11[int_21] = (byte) int_12;
				}
			}
		}

		for (int_20 = 0; int_20 < int_7; int_20++) {
			class75_2 = class75s_0[int_20];
			if (class75_2.aByteArray10 != null) {
				int_12 = 0;

				for (int_21 = 2; int_21 < class75_2.aByteArray10.length; int_21 += 2) {
					int_12 = int_12 + 1 + buffer_0.readUnsignedByte();
					class75_2.aByteArray10[int_21] = (byte) int_12;
				}
			}
		}

		byte byte_1;
		int int_22;
		int int_23;
		int int_24;
		int int_27;
		byte byte_3;
		if (bytes_7 != null) {
			int_12 = buffer_0.readUnsignedByte();
			bytes_7[0] = (byte) int_12;

			for (int_20 = 2; int_20 < bytes_7.length; int_20 += 2) {
				int_12 = int_12 + 1 + buffer_0.readUnsignedByte();
				bytes_7[int_20] = (byte) int_12;
			}

			byte_3 = bytes_7[0];
			byte byte_0 = bytes_7[1];

			for (int_21 = 0; int_21 < byte_3; int_21++) {
				aByteArray15[int_21] = (byte) (((byte_0 * aByteArray15[int_21]) + 32) >> 6);
			}

			for (int_21 = 2; int_21 < bytes_7.length; int_21 += 2) {
				byte_1 = bytes_7[int_21];
				final byte byte_2 = bytes_7[int_21 + 1];
				int_22 = (byte_0 * (byte_1 - byte_3)) + ((byte_1 - byte_3) / 2);

				for (int_23 = byte_3; int_23 < byte_1; int_23++) {
					int_24 = Class73_Sub1.method601(int_22, byte_1 - byte_3);
					aByteArray15[int_23] = (byte) (((int_24 * aByteArray15[int_23]) + 32) >> 6);
					int_22 += byte_2 - byte_0;
				}

				byte_3 = byte_1;
				byte_0 = byte_2;
			}

			for (int_27 = byte_3; int_27 < 128; int_27++) {
				aByteArray15[int_27] = (byte) (((byte_0 * aByteArray15[int_27]) + 32) >> 6);
			}

			class75_0 = null;
		}

		if (bytes_5 != null) {
			int_12 = buffer_0.readUnsignedByte();
			bytes_5[0] = (byte) int_12;

			for (int_20 = 2; int_20 < bytes_5.length; int_20 += 2) {
				int_12 = int_12 + 1 + buffer_0.readUnsignedByte();
				bytes_5[int_20] = (byte) int_12;
			}

			byte_3 = bytes_5[0];
			int int_26 = bytes_5[1] << 1;

			for (int_21 = 0; int_21 < byte_3; int_21++) {
				int_27 = int_26 + (aByteArray16[int_21] & 0xFF);
				if (int_27 < 0) {
					int_27 = 0;
				}

				if (int_27 > 128) {
					int_27 = 128;
				}

				aByteArray16[int_21] = (byte) int_27;
			}

			int int_28;
			for (int_21 = 2; int_21 < bytes_5.length; int_21 += 2) {
				byte_1 = bytes_5[int_21];
				int_28 = bytes_5[int_21 + 1] << 1;
				int_22 = ((byte_1 - byte_3) * int_26) + ((byte_1 - byte_3) / 2);

				for (int_23 = byte_3; int_23 < byte_1; int_23++) {
					int_24 = Class73_Sub1.method601(int_22, byte_1 - byte_3);
					int int_25 = int_24 + (aByteArray16[int_23] & 0xFF);
					if (int_25 < 0) {
						int_25 = 0;
					}

					if (int_25 > 128) {
						int_25 = 128;
					}

					aByteArray16[int_23] = (byte) int_25;
					int_22 += int_28 - int_26;
				}

				byte_3 = byte_1;
				int_26 = int_28;
			}

			for (int_27 = byte_3; int_27 < 128; int_27++) {
				int_28 = int_26 + (aByteArray16[int_27] & 0xFF);
				if (int_28 < 0) {
					int_28 = 0;
				}

				if (int_28 > 128) {
					int_28 = 128;
				}

				aByteArray16[int_27] = (byte) int_28;
			}
		}

		for (int_20 = 0; int_20 < int_7; int_20++) {
			class75s_0[int_20].anInt180 = buffer_0.readUnsignedByte();
		}

		for (int_20 = 0; int_20 < int_7; int_20++) {
			class75_2 = class75s_0[int_20];
			if (class75_2.aByteArray10 != null) {
				class75_2.anInt184 = buffer_0.readUnsignedByte();
			}

			if (class75_2.aByteArray11 != null) {
				class75_2.anInt185 = buffer_0.readUnsignedByte();
			}

			if (class75_2.anInt180 > 0) {
				class75_2.anInt183 = buffer_0.readUnsignedByte();
			}
		}

		for (int_20 = 0; int_20 < int_7; int_20++) {
			class75s_0[int_20].anInt179 = buffer_0.readUnsignedByte();
		}

		for (int_20 = 0; int_20 < int_7; int_20++) {
			class75_2 = class75s_0[int_20];
			if (class75_2.anInt179 > 0) {
				class75_2.anInt181 = buffer_0.readUnsignedByte();
			}
		}

		for (int_20 = 0; int_20 < int_7; int_20++) {
			class75_2 = class75s_0[int_20];
			if (class75_2.anInt181 > 0) {
				class75_2.anInt182 = buffer_0.readUnsignedByte();
			}
		}

	}

	void method643() {
		anIntArray79 = null;
	}

	boolean method644(final Class54 class54_0, final byte[] bytes_0, final int[] ints_0) {
		boolean bool_0 = true;
		int int_0 = 0;
		AClass7_Sub1 aclass7_sub1_0 = null;

		for (int int_1 = 0; int_1 < 128; int_1++) {
			if ((bytes_0 == null) || (bytes_0[int_1] != 0)) {
				int int_2 = anIntArray79[int_1];
				if (int_2 != 0) {
					if (int_2 != int_0) {
						int_0 = int_2--;
						if ((int_2 & 0x1) == 0) {
							aclass7_sub1_0 = class54_0.method326(int_2 >> 2, ints_0);
						} else {
							aclass7_sub1_0 = class54_0.method327(int_2 >> 2, ints_0);
						}

						if (aclass7_sub1_0 == null) {
							bool_0 = false;
						}
					}

					if (aclass7_sub1_0 != null) {
						anAClass7_Sub1Array1[int_1] = aclass7_sub1_0;
						anIntArray79[int_1] = 0;
					}
				}
			}
		}

		return bool_0;
	}

	static final void method645() {
		if (Occluder.rssocket != null) {
			Occluder.rssocket.close();
			Occluder.rssocket = null;
		}

		MilliTimer.method687();
		Class8.region.reset();

		for (int int_0 = 0; int_0 < 4; int_0++) {
			Client.collisionMaps[int_0].reset();
		}

		System.gc();
		Class76.anInt186 = 1;
		Class76.anIndexDataBase3 = null;
		Class76.anInt187 = -1;
		MilliTimer.anInt422 = -1;
		Class76.anInt188 = 0;
		Class76.aBool21 = false;
		AClass2_Sub1.anInt334 = 2;
		Client.anInt666 = -1;
		Client.aBool80 = false;
		Class33.method236();
		WorldMapType2.setGameState(10);
	}

}
