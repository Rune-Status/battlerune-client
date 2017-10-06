public enum Enum1 implements RSEnum {

	anEnum1_1(0, (byte) 0), anEnum1_2(3, (byte) 1), anEnum1_3(1, (byte) 2), anEnum1_4(2, (byte) 3);

	static byte clanChatRank;
	final int anInt323;
	final byte aByte3;

	Enum1(final int int_1, final byte byte_0) {
		anInt323 = int_1;
		aByte3 = byte_0;
	}

	@Override
	public int rsOrdinal() {
		return aByte3;
	}

	static void method575(final int int_0, final int int_1) {
		final long long_0 = (int_0 << 16) + int_1;
		final FileRequest filerequest_0 = (FileRequest) Class93.aXHashTable3.get(long_0);
		if (filerequest_0 != null) {
			Class93.aNode2LinkedList1.setHead(filerequest_0);
		}
	}

	static Enum1[] method576() {
		return new Enum1[] { anEnum1_1, anEnum1_4, anEnum1_3, anEnum1_2 };
	}

	public static SpritePixels method577(final IndexDataBase indexdatabase_0, final int int_0, final int int_1) {
		if (!IndexData.method597(indexdatabase_0, int_0, int_1)) {
			return null;
		} else {
			final SpritePixels spritepixels_0 = new SpritePixels();
			spritepixels_0.maxWidth = Class108.anInt216;
			spritepixels_0.maxHeight = Class108.anInt217;
			spritepixels_0.offsetX = Class108.anIntArray56[0];
			spritepixels_0.offsetY = Class12.offsetsY[0];
			spritepixels_0.width = Class108.anIntArray57[0];
			spritepixels_0.height = Class37.anIntArray16[0];
			final int int_2 = spritepixels_0.height * spritepixels_0.width;
			final byte[] bytes_0 = Class66.spritePixels[0];
			spritepixels_0.image = new int[int_2];

			for (int int_3 = 0; int_3 < int_2; int_3++) {
				spritepixels_0.image[int_3] = Class108.anIntArray58[bytes_0[int_3] & 0xFF];
			}

			Class32.method232();
			return spritepixels_0;
		}
	}

	static final void method578(final byte[] bytes_0, final int int_0, final int int_1, final int int_2,
			final int int_3, final int int_4, final int int_5, final int int_6, final Region region_0,
			final CollisionData[] collisiondatas_0) {
		final Buffer buffer_0 = new Buffer(bytes_0);
		int int_7 = -1;

		while (true) {
			final int int_8 = buffer_0.getUSmart();
			if (int_8 == 0) {
				return;
			}

			int_7 += int_8;
			int int_9 = 0;

			while (true) {
				final int int_10 = buffer_0.getUSmart();
				if (int_10 == 0) {
					break;
				}

				int_9 += int_10 - 1;
				final int int_11 = int_9 & 0x3F;
				final int int_12 = (int_9 >> 6) & 0x3F;
				final int int_13 = int_9 >> 12;
				final int int_14 = buffer_0.readUnsignedByte();
				final int int_15 = int_14 >> 2;
				final int int_16 = int_14 & 0x3;
				if ((int_13 == int_3) && (int_12 >= int_4) && (int_12 < (int_4 + 8)) && (int_11 >= int_5)
						&& (int_11 < (int_5 + 8))) {
					final ObjectComposition objectcomposition_0 = PlayerComposition.getObjectDefinition(int_7);
					final int int_17 = int_12 & 0x7;
					final int int_18 = int_11 & 0x7;
					int int_20 = objectcomposition_0.sizeX;
					int int_21 = objectcomposition_0.sizeY;
					int int_22;
					if ((int_16 & 0x1) == 1) {
						int_22 = int_20;
						int_20 = int_21;
						int_21 = int_22;
					}

					final int int_19 = int_6 & 0x3;
					int int_23;
					if (int_19 == 0) {
						int_23 = int_17;
					} else if (int_19 == 1) {
						int_23 = int_18;
					} else if (int_19 == 2) {
						int_23 = 7 - int_17 - (int_20 - 1);
					} else {
						int_23 = 7 - int_18 - (int_21 - 1);
					}

					int_22 = int_23 + int_1;
					final int int_24 = int_2 + Class65.method397(int_12 & 0x7, int_11 & 0x7, int_6,
							objectcomposition_0.sizeX, objectcomposition_0.sizeY, int_16);
					if ((int_22 > 0) && (int_24 > 0) && (int_22 < 103) && (int_24 < 103)) {
						int int_25 = int_0;
						if ((Class18.tileSettings[1][int_22][int_24] & 0x2) == 2) {
							int_25 = int_0 - 1;
						}

						CollisionData collisiondata_0 = null;
						if (int_25 >= 0) {
							collisiondata_0 = collisiondatas_0[int_25];
						}

						Class22.addObject(int_0, int_22, int_24, int_7, (int_16 + int_6) & 0x3, int_15, region_0,
								collisiondata_0);
					}
				}
			}
		}
	}

	static void setItemTableSlot(final int int_0, final int int_1, final int int_2, final int int_3) {
		XItemContainer xitemcontainer_0 = (XItemContainer) XItemContainer.itemContainers.get(int_0);
		if (xitemcontainer_0 == null) {
			xitemcontainer_0 = new XItemContainer();
			XItemContainer.itemContainers.put(xitemcontainer_0, int_0);
		}

		if (xitemcontainer_0.itemIds.length <= int_1) {
			final int[] ints_0 = new int[int_1 + 1];
			final int[] ints_1 = new int[int_1 + 1];

			int int_4;
			for (int_4 = 0; int_4 < xitemcontainer_0.itemIds.length; int_4++) {
				ints_0[int_4] = xitemcontainer_0.itemIds[int_4];
				ints_1[int_4] = xitemcontainer_0.stackSizes[int_4];
			}

			for (int_4 = xitemcontainer_0.itemIds.length; int_4 < int_1; int_4++) {
				ints_0[int_4] = -1;
				ints_1[int_4] = 0;
			}

			xitemcontainer_0.itemIds = ints_0;
			xitemcontainer_0.stackSizes = ints_1;
		}

		xitemcontainer_0.itemIds[int_1] = int_2;
		xitemcontainer_0.stackSizes[int_1] = int_3;
	}

}
