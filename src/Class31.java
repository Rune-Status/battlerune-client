final class Class31 implements Interface1 {

	static Font font_p12full;

	static final void xteaChanged(final boolean bool_0) {
		Client.isDynamicRegion = bool_0;
		int int_0;
		int int_1;
		int int_2;
		int int_3;
		int int_4;
		int int_5;
		if (!Client.isDynamicRegion) {
			int_0 = Client.secretPacketBuffer2.readUnsignedShort();
			final int int_12 = Client.secretPacketBuffer2.readByteOb1();
			int_1 = Client.secretPacketBuffer2.readUnsignedShort();
			AClass2_Sub1.xteaKeys = new int[int_1][4];

			for (int_2 = 0; int_2 < int_1; int_2++) {
				for (int_3 = 0; int_3 < 4; int_3++) {
					AClass2_Sub1.xteaKeys[int_2][int_3] = Client.secretPacketBuffer2.readInt();
				}
			}

			RSCanvas.mapRegions = new int[int_1];
			AClass4_Sub1.anIntArray81 = new int[int_1];
			CombatInfoListHolder.landRegionFielIds = new int[int_1];
			Class3.aByteArrayArray1 = new byte[int_1][];
			Class51.aByteArrayArray2 = new byte[int_1][];
			boolean bool_2 = false;
			if ((((int_0 / 8) == 48) || ((int_0 / 8) == 49)) && ((int_12 / 8) == 48)) {
				bool_2 = true;
			}

			if (((int_0 / 8) == 48) && ((int_12 / 8) == 148)) {
				bool_2 = true;
			}

			int_1 = 0;

			for (int_3 = (int_0 - 6) / 8; int_3 <= ((int_0 + 6) / 8); int_3++) {
				for (int_4 = (int_12 - 6) / 8; int_4 <= ((int_12 + 6) / 8); int_4++) {
					int_5 = int_4 + (int_3 << 8);
					if (!bool_2 || ((int_4 != 49) && (int_4 != 149) && (int_4 != 147) && (int_3 != 50)
							&& ((int_3 != 49) || (int_4 != 47)))) {
						RSCanvas.mapRegions[int_1] = int_5;
						AClass4_Sub1.anIntArray81[int_1] = Class33.indexMaps.getFile("m" + int_3 + "_" + int_4);
						CombatInfoListHolder.landRegionFielIds[int_1] = Class33.indexMaps
								.getFile("l" + int_3 + "_" + int_4);
						++int_1;
					}
				}
			}

			Varcs.method506(int_0, int_12, true);
		} else {
			int_0 = Client.secretPacketBuffer2.readUShortA();
			final boolean bool_1 = Client.secretPacketBuffer2.method669() == 1;
			int_1 = Client.secretPacketBuffer2.readUShortA();
			int_2 = Client.secretPacketBuffer2.readUnsignedShort();
			Client.secretPacketBuffer2.bitAccess();

			int int_6;
			for (int_3 = 0; int_3 < 4; int_3++) {
				for (int_4 = 0; int_4 < 13; int_4++) {
					for (int_5 = 0; int_5 < 13; int_5++) {
						int_6 = Client.secretPacketBuffer2.getBits(1);
						if (int_6 == 1) {
							Client.anIntArrayArrayArray2[int_3][int_4][int_5] = Client.secretPacketBuffer2.getBits(26);
						} else {
							Client.anIntArrayArrayArray2[int_3][int_4][int_5] = -1;
						}
					}
				}
			}

			Client.secretPacketBuffer2.byteAccess();
			AClass2_Sub1.xteaKeys = new int[int_2][4];

			for (int_3 = 0; int_3 < int_2; int_3++) {
				for (int_4 = 0; int_4 < 4; int_4++) {
					AClass2_Sub1.xteaKeys[int_3][int_4] = Client.secretPacketBuffer2.readInt();
				}
			}

			RSCanvas.mapRegions = new int[int_2];
			AClass4_Sub1.anIntArray81 = new int[int_2];
			CombatInfoListHolder.landRegionFielIds = new int[int_2];
			Class3.aByteArrayArray1 = new byte[int_2][];
			Class51.aByteArrayArray2 = new byte[int_2][];
			int_2 = 0;

			for (int_3 = 0; int_3 < 4; int_3++) {
				for (int_4 = 0; int_4 < 13; int_4++) {
					for (int_5 = 0; int_5 < 13; int_5++) {
						int_6 = Client.anIntArrayArrayArray2[int_3][int_4][int_5];
						if (int_6 != -1) {
							final int int_7 = (int_6 >> 14) & 0x3FF;
							final int int_8 = (int_6 >> 3) & 0x7FF;
							int int_9 = ((int_7 / 8) << 8) + (int_8 / 8);

							int int_10;
							for (int_10 = 0; int_10 < int_2; int_10++) {
								if (RSCanvas.mapRegions[int_10] == int_9) {
									int_9 = -1;
									break;
								}
							}

							if (int_9 != -1) {
								RSCanvas.mapRegions[int_2] = int_9;
								int_10 = (int_9 >> 8) & 0xFF;
								final int int_11 = int_9 & 0xFF;
								AClass4_Sub1.anIntArray81[int_2] = Class33.indexMaps
										.getFile("m" + int_10 + "_" + int_11);
								CombatInfoListHolder.landRegionFielIds[int_2] = Class33.indexMaps
										.getFile("l" + int_10 + "_" + int_11);
								++int_2;
							}
						}
					}
				}
			}

			Varcs.method506(int_0, int_1, !bool_1);
		}
	}

}
