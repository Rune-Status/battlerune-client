public class Class51 {

	static int anInt112;
	static byte[][] aByteArrayArray2;
	int anInt113;
	Coordinates aCoordinates7;

	Class51(final int int_0, final Coordinates coordinates_0) {
		anInt113 = int_0;
		aCoordinates7 = coordinates_0;
	}

	public static final boolean method307(final int int_0, final int int_1, final AClass2 aclass2_0,
			final CollisionData collisiondata_0) {
		int int_2 = int_0;
		int int_3 = int_1;
		final byte byte_0 = 64;
		final byte byte_1 = 64;
		final int int_4 = int_0 - byte_0;
		final int int_5 = int_1 - byte_1;
		Class60.anIntArrayArray10[byte_0][byte_1] = 99;
		Class60.anIntArrayArray11[byte_0][byte_1] = 0;
		final byte byte_2 = 0;
		int int_6 = 0;
		Class60.anIntArray38[byte_2] = int_0;
		final byte byte_3 = byte_2;
		int int_12 = byte_2 + 1;
		Class60.anIntArray39[byte_3] = int_1;
		final int[][] ints_0 = collisiondata_0.flags;

		while (int_12 != int_6) {
			int_2 = Class60.anIntArray38[int_6];
			int_3 = Class60.anIntArray39[int_6];
			int_6 = (int_6 + 1) & 0xFFF;
			final int int_10 = int_2 - int_4;
			final int int_11 = int_3 - int_5;
			final int int_7 = int_2 - collisiondata_0.anInt273;
			final int int_8 = int_3 - collisiondata_0.anInt274;
			if (aclass2_0.method387(1, int_2, int_3, collisiondata_0)) {
				Class60.anInt160 = int_2;
				FaceNormal.anInt235 = int_3;
				return true;
			}

			final int int_9 = Class60.anIntArrayArray11[int_10][int_11] + 1;
			if ((int_10 > 0) && (Class60.anIntArrayArray10[int_10 - 1][int_11] == 0)
					&& ((ints_0[int_7 - 1][int_8] & 0x1240108) == 0)) {
				Class60.anIntArray38[int_12] = int_2 - 1;
				Class60.anIntArray39[int_12] = int_3;
				int_12 = (int_12 + 1) & 0xFFF;
				Class60.anIntArrayArray10[int_10 - 1][int_11] = 2;
				Class60.anIntArrayArray11[int_10 - 1][int_11] = int_9;
			}

			if ((int_10 < 127) && (Class60.anIntArrayArray10[int_10 + 1][int_11] == 0)
					&& ((ints_0[int_7 + 1][int_8] & 0x1240180) == 0)) {
				Class60.anIntArray38[int_12] = int_2 + 1;
				Class60.anIntArray39[int_12] = int_3;
				int_12 = (int_12 + 1) & 0xFFF;
				Class60.anIntArrayArray10[int_10 + 1][int_11] = 8;
				Class60.anIntArrayArray11[int_10 + 1][int_11] = int_9;
			}

			if ((int_11 > 0) && (Class60.anIntArrayArray10[int_10][int_11 - 1] == 0)
					&& ((ints_0[int_7][int_8 - 1] & 0x1240102) == 0)) {
				Class60.anIntArray38[int_12] = int_2;
				Class60.anIntArray39[int_12] = int_3 - 1;
				int_12 = (int_12 + 1) & 0xFFF;
				Class60.anIntArrayArray10[int_10][int_11 - 1] = 1;
				Class60.anIntArrayArray11[int_10][int_11 - 1] = int_9;
			}

			if ((int_11 < 127) && (Class60.anIntArrayArray10[int_10][int_11 + 1] == 0)
					&& ((ints_0[int_7][1 + int_8] & 0x1240120) == 0)) {
				Class60.anIntArray38[int_12] = int_2;
				Class60.anIntArray39[int_12] = int_3 + 1;
				int_12 = (int_12 + 1) & 0xFFF;
				Class60.anIntArrayArray10[int_10][int_11 + 1] = 4;
				Class60.anIntArrayArray11[int_10][int_11 + 1] = int_9;
			}

			if ((int_10 > 0) && (int_11 > 0) && (Class60.anIntArrayArray10[int_10 - 1][int_11 - 1] == 0)
					&& ((ints_0[int_7 - 1][int_8 - 1] & 0x124010E) == 0)
					&& ((ints_0[int_7 - 1][int_8] & 0x1240108) == 0) && ((ints_0[int_7][int_8 - 1] & 0x1240102) == 0)) {
				Class60.anIntArray38[int_12] = int_2 - 1;
				Class60.anIntArray39[int_12] = int_3 - 1;
				int_12 = (int_12 + 1) & 0xFFF;
				Class60.anIntArrayArray10[int_10 - 1][int_11 - 1] = 3;
				Class60.anIntArrayArray11[int_10 - 1][int_11 - 1] = int_9;
			}

			if ((int_10 < 127) && (int_11 > 0) && (Class60.anIntArrayArray10[int_10 + 1][int_11 - 1] == 0)
					&& ((ints_0[int_7 + 1][int_8 - 1] & 0x1240183) == 0)
					&& ((ints_0[int_7 + 1][int_8] & 0x1240180) == 0) && ((ints_0[int_7][int_8 - 1] & 0x1240102) == 0)) {
				Class60.anIntArray38[int_12] = int_2 + 1;
				Class60.anIntArray39[int_12] = int_3 - 1;
				int_12 = (int_12 + 1) & 0xFFF;
				Class60.anIntArrayArray10[int_10 + 1][int_11 - 1] = 9;
				Class60.anIntArrayArray11[int_10 + 1][int_11 - 1] = int_9;
			}

			if ((int_10 > 0) && (int_11 < 127) && (Class60.anIntArrayArray10[int_10 - 1][int_11 + 1] == 0)
					&& ((ints_0[int_7 - 1][int_8 + 1] & 0x1240138) == 0)
					&& ((ints_0[int_7 - 1][int_8] & 0x1240108) == 0) && ((ints_0[int_7][int_8 + 1] & 0x1240120) == 0)) {
				Class60.anIntArray38[int_12] = int_2 - 1;
				Class60.anIntArray39[int_12] = int_3 + 1;
				int_12 = (int_12 + 1) & 0xFFF;
				Class60.anIntArrayArray10[int_10 - 1][int_11 + 1] = 6;
				Class60.anIntArrayArray11[int_10 - 1][int_11 + 1] = int_9;
			}

			if ((int_10 < 127) && (int_11 < 127) && (Class60.anIntArrayArray10[int_10 + 1][int_11 + 1] == 0)
					&& ((ints_0[int_7 + 1][int_8 + 1] & 0x12401E0) == 0)
					&& ((ints_0[int_7 + 1][int_8] & 0x1240180) == 0) && ((ints_0[int_7][int_8 + 1] & 0x1240120) == 0)) {
				Class60.anIntArray38[int_12] = int_2 + 1;
				Class60.anIntArray39[int_12] = int_3 + 1;
				int_12 = (int_12 + 1) & 0xFFF;
				Class60.anIntArrayArray10[int_10 + 1][int_11 + 1] = 12;
				Class60.anIntArrayArray11[int_10 + 1][int_11 + 1] = int_9;
			}
		}

		Class60.anInt160 = int_2;
		FaceNormal.anInt235 = int_3;
		return false;
	}

	static final void method308(int int_0, int int_1, int int_2, int int_3, final boolean bool_0) {
		if (int_2 < 1) {
			int_2 = 1;
		}

		if (int_3 < 1) {
			int_3 = 1;
		}

		int int_4 = int_3 - 334;
		if (int_4 < 0) {
			int_4 = 0;
		} else if (int_4 > 100) {
			int_4 = 100;
		}

		int int_5 = (((Client.aShort3 - Client.aShort4) * int_4) / 100) + Client.aShort4;
		final int int_6 = (int_3 * int_5 * 512) / (int_2 * 334);
		int int_7;
		int int_8;
		short short_0;
		if (int_6 < Client.aShort5) {
			short_0 = Client.aShort5;
			int_5 = (short_0 * int_2 * 334) / (int_3 * 512);
			if (int_5 > Client.aShort7) {
				int_5 = Client.aShort7;
				int_7 = (int_3 * int_5 * 512) / (short_0 * 334);
				int_8 = (int_2 - int_7) / 2;
				if (bool_0) {
					Rasterizer2D.noClip();
					Rasterizer2D.method853(int_0, int_1, int_8, int_3, -16777216);
					Rasterizer2D.method853((int_0 + int_2) - int_8, int_1, int_8, int_3, -16777216);
				}

				int_0 += int_8;
				int_2 -= int_8 * 2;
			}
		} else if (int_6 > Client.aShort6) {
			short_0 = Client.aShort6;
			int_5 = (short_0 * int_2 * 334) / (int_3 * 512);
			if (int_5 < Client.aShort10) {
				int_5 = Client.aShort10;
				int_7 = (short_0 * int_2 * 334) / (int_5 * 512);
				int_8 = (int_3 - int_7) / 2;
				if (bool_0) {
					Rasterizer2D.noClip();
					Rasterizer2D.method853(int_0, int_1, int_2, int_8, -16777216);
					Rasterizer2D.method853(int_0, (int_3 + int_1) - int_8, int_2, int_8, -16777216);
				}

				int_1 += int_8;
				int_3 -= int_8 * 2;
			}
		}

		int_7 = ((int_4 * (Client.aShort8 - Client.aShort9)) / 100) + Client.aShort9;
		Client.scale = ((int_7 * int_3 * int_5) / 85504) << 1;
		if ((int_2 != Client.viewportHeight) || (int_3 != Client.viewportWidth)) {
			final int[] ints_0 = new int[9];

			for (int int_9 = 0; int_9 < 9; int_9++) {
				final int int_10 = (int_9 * 32) + 128 + 15;
				final int int_11 = (int_10 * 3) + 600;
				final int int_12 = Graphics3D.SINE[int_10];
				ints_0[int_9] = (int_11 * int_12) >> 16;
			}

			Region.method376(ints_0, 500, 800, int_2, int_3);
		}

		Client.anInt745 = int_0;
		Client.anInt747 = int_1;
		Client.viewportHeight = int_2;
		Client.viewportWidth = int_3;
	}

	static int method309(final int int_0, final Script script_0, final boolean bool_0) {
		int int_1;
		if (int_0 == 3903) {
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.grandExchangeOffers[int_1].method110();
			return 1;
		} else if (int_0 == 3904) {
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.grandExchangeOffers[int_1].itemId;
			return 1;
		} else if (int_0 == 3905) {
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.grandExchangeOffers[int_1].price;
			return 1;
		} else if (int_0 == 3906) {
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.grandExchangeOffers[int_1].totalQuantity;
			return 1;
		} else if (int_0 == 3907) {
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.grandExchangeOffers[int_1].quantitySold;
			return 1;
		} else if (int_0 == 3908) {
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.grandExchangeOffers[int_1].spent;
			return 1;
		} else {
			int int_5;
			if (int_0 == 3910) {
				int_1 = Class45.intStack[--WorldMapType2.intStackSize];
				int_5 = Client.grandExchangeOffers[int_1].method111();
				Class45.intStack[++WorldMapType2.intStackSize - 1] = int_5 == 0 ? 1 : 0;
				return 1;
			} else if (int_0 == 3911) {
				int_1 = Class45.intStack[--WorldMapType2.intStackSize];
				int_5 = Client.grandExchangeOffers[int_1].method111();
				Class45.intStack[++WorldMapType2.intStackSize - 1] = int_5 == 2 ? 1 : 0;
				return 1;
			} else if (int_0 == 3912) {
				int_1 = Class45.intStack[--WorldMapType2.intStackSize];
				int_5 = Client.grandExchangeOffers[int_1].method111();
				Class45.intStack[++WorldMapType2.intStackSize - 1] = int_5 == 5 ? 1 : 0;
				return 1;
			} else if (int_0 == 3913) {
				int_1 = Class45.intStack[--WorldMapType2.intStackSize];
				int_5 = Client.grandExchangeOffers[int_1].method111();
				Class45.intStack[++WorldMapType2.intStackSize - 1] = int_5 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean bool_2;
				if (int_0 == 3914) {
					bool_2 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
					if (XClanMember.aClass39_1 != null) {
						XClanMember.aClass39_1.method257(Class39.aComparator3, bool_2);
					}

					return 1;
				} else if (int_0 == 3915) {
					bool_2 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
					if (XClanMember.aClass39_1 != null) {
						XClanMember.aClass39_1.method257(Class39.aComparator2, bool_2);
					}

					return 1;
				} else if (int_0 == 3916) {
					WorldMapType2.intStackSize -= 2;
					bool_2 = Class45.intStack[WorldMapType2.intStackSize] == 1;
					final boolean bool_1 = Class45.intStack[WorldMapType2.intStackSize + 1] == 1;
					if (XClanMember.aClass39_1 != null) {
						XClanMember.aClass39_1.method257(new Class34(bool_1), bool_2);
					}

					return 1;
				} else if (int_0 == 3917) {
					bool_2 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
					if (XClanMember.aClass39_1 != null) {
						XClanMember.aClass39_1.method257(Class39.aComparator1, bool_2);
					}

					return 1;
				} else if (int_0 == 3918) {
					bool_2 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
					if (XClanMember.aClass39_1 != null) {
						XClanMember.aClass39_1.method257(Class39.aComparator4, bool_2);
					}

					return 1;
				} else if (int_0 == 3919) {
					Class45.intStack[++WorldMapType2.intStackSize - 1] = XClanMember.aClass39_1 == null ? 0
							: XClanMember.aClass39_1.aList3.size();
					return 1;
				} else {
					Class48 class48_0;
					if (int_0 == 3920) {
						int_1 = Class45.intStack[--WorldMapType2.intStackSize];
						class48_0 = (Class48) XClanMember.aClass39_1.aList3.get(int_1);
						Class45.intStack[++WorldMapType2.intStackSize - 1] = class48_0.anInt105;
						return 1;
					} else if (int_0 == 3921) {
						int_1 = Class45.intStack[--WorldMapType2.intStackSize];
						class48_0 = (Class48) XClanMember.aClass39_1.aList3.get(int_1);
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = class48_0.method276();
						return 1;
					} else if (int_0 == 3922) {
						int_1 = Class45.intStack[--WorldMapType2.intStackSize];
						class48_0 = (Class48) XClanMember.aClass39_1.aList3.get(int_1);
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = class48_0.method277();
						return 1;
					} else if (int_0 == 3923) {
						int_1 = Class45.intStack[--WorldMapType2.intStackSize];
						class48_0 = (Class48) XClanMember.aClass39_1.aList3.get(int_1);
						final long long_0 = Class6.currentTimeMs() - Ignore.aLong13 - class48_0.aLong4;
						final int int_2 = (int) (long_0 / 3600000L);
						final int int_3 = (int) ((long_0 - int_2 * 3600000) / 60000L);
						final int int_4 = (int) ((long_0 - int_2 * 3600000 - int_3 * 60000) / 1000L);
						final String string_0 = int_2 + ":" + (int_3 / 10) + (int_3 % 10) + ":" + (int_4 / 10)
								+ (int_4 % 10);
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = string_0;
						return 1;
					} else if (int_0 == 3924) {
						int_1 = Class45.intStack[--WorldMapType2.intStackSize];
						class48_0 = (Class48) XClanMember.aClass39_1.aList3.get(int_1);
						Class45.intStack[++WorldMapType2.intStackSize
								- 1] = class48_0.aXGrandExchangeOffer1.totalQuantity;
						return 1;
					} else if (int_0 == 3925) {
						int_1 = Class45.intStack[--WorldMapType2.intStackSize];
						class48_0 = (Class48) XClanMember.aClass39_1.aList3.get(int_1);
						Class45.intStack[++WorldMapType2.intStackSize - 1] = class48_0.aXGrandExchangeOffer1.price;
						return 1;
					} else if (int_0 == 3926) {
						int_1 = Class45.intStack[--WorldMapType2.intStackSize];
						class48_0 = (Class48) XClanMember.aClass39_1.aList3.get(int_1);
						Class45.intStack[++WorldMapType2.intStackSize - 1] = class48_0.aXGrandExchangeOffer1.itemId;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

}
