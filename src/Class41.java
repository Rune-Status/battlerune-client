final class Class41 implements Interface1 {

	public static String[] cacheLocations;
	static IndexDataBase varplayer_ref;

	static void method261(final String string_0, final String string_1, final String string_2) {
		Class26.loginMessage1 = string_0;
		Class26.loginMessage2 = string_1;
		Class26.loginMessage3 = string_2;
	}

	static final int method262(final Widget widget_0, final int int_0) {
		if ((widget_0.dynamicValues != null) && (int_0 < widget_0.dynamicValues.length)) {
			try {
				final int[] ints_0 = widget_0.dynamicValues[int_0];
				int int_1 = 0;
				int int_2 = 0;
				byte byte_0 = 0;

				while (true) {
					final int int_3 = ints_0[int_2++];
					int int_4 = 0;
					byte byte_1 = 0;
					if (int_3 == 0) {
						return int_1;
					}

					if (int_3 == 1) {
						int_4 = Client.boostedSkillLevels[ints_0[int_2++]];
					}

					if (int_3 == 2) {
						int_4 = Client.realSkillLevels[ints_0[int_2++]];
					}

					if (int_3 == 3) {
						int_4 = Client.skillExperiences[ints_0[int_2++]];
					}

					int int_5;
					Widget widget_1;
					int int_6;
					int int_7;
					if (int_3 == 4) {
						int_5 = ints_0[int_2++] << 16;
						int_5 += ints_0[int_2++];
						widget_1 = Class18.method202(int_5);
						int_6 = ints_0[int_2++];
						if ((int_6 != -1) && (!Class45.getItemDefinition(int_6).isMembers || Client.isMembers)) {
							for (int_7 = 0; int_7 < widget_1.itemIds.length; int_7++) {
								if ((int_6 + 1) == widget_1.itemIds[int_7]) {
									int_4 += widget_1.itemQuantities[int_7];
								}
							}
						}
					}

					if (int_3 == 5) {
						int_4 = Class86.widgetSettings[ints_0[int_2++]];
					}

					if (int_3 == 6) {
						int_4 = Class88.anIntArray47[Client.realSkillLevels[ints_0[int_2++]] - 1];
					}

					if (int_3 == 7) {
						int_4 = (Class86.widgetSettings[ints_0[int_2++]] * 100) / 46875;
					}

					if (int_3 == 8) {
						int_4 = Script.localPlayer.combatLevel;
					}

					if (int_3 == 9) {
						for (int_5 = 0; int_5 < 25; int_5++) {
							if (Class88.aBoolArray4[int_5]) {
								int_4 += Client.realSkillLevels[int_5];
							}
						}
					}

					if (int_3 == 10) {
						int_5 = ints_0[int_2++] << 16;
						int_5 += ints_0[int_2++];
						widget_1 = Class18.method202(int_5);
						int_6 = ints_0[int_2++];
						if ((int_6 != -1) && (!Class45.getItemDefinition(int_6).isMembers || Client.isMembers)) {
							for (int_7 = 0; int_7 < widget_1.itemIds.length; int_7++) {
								if ((int_6 + 1) == widget_1.itemIds[int_7]) {
									int_4 = 999999999;
									break;
								}
							}
						}
					}

					if (int_3 == 11) {
						int_4 = Client.energy;
					}

					if (int_3 == 12) {
						int_4 = Client.weight;
					}

					if (int_3 == 13) {
						int_5 = Class86.widgetSettings[ints_0[int_2++]];
						final int int_8 = ints_0[int_2++];
						int_4 = (int_5 & (1 << int_8)) != 0 ? 1 : 0;
					}

					if (int_3 == 14) {
						int_5 = ints_0[int_2++];
						int_4 = Class38.method254(int_5);
					}

					if (int_3 == 15) {
						byte_1 = 1;
					}

					if (int_3 == 16) {
						byte_1 = 2;
					}

					if (int_3 == 17) {
						byte_1 = 3;
					}

					if (int_3 == 18) {
						int_4 = (Script.localPlayer.anInt547 >> 7) + AClass2.baseX;
					}

					if (int_3 == 19) {
						int_4 = (Script.localPlayer.anInt550 >> 7) + AClass4_Sub1.baseY;
					}

					if (int_3 == 20) {
						int_4 = ints_0[int_2++];
					}

					if (byte_1 == 0) {
						if (byte_0 == 0) {
							int_1 += int_4;
						}

						if (byte_0 == 1) {
							int_1 -= int_4;
						}

						if ((byte_0 == 2) && (int_4 != 0)) {
							int_1 /= int_4;
						}

						if (byte_0 == 3) {
							int_1 *= int_4;
						}

						byte_0 = 0;
					} else {
						byte_0 = byte_1;
					}
				}
			} catch (final Exception exception_0) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	static final void method263() {
		for (PendingSpawn pendingspawn_0 = (PendingSpawn) Client.pendingSpawns
				.getFront(); pendingspawn_0 != null; pendingspawn_0 = (PendingSpawn) Client.pendingSpawns.getNext()) {
			if (pendingspawn_0.hitpoints > 0) {
				--pendingspawn_0.hitpoints;
			}

			if (pendingspawn_0.hitpoints == 0) {
				if ((pendingspawn_0.anInt365 < 0)
						|| Enum2.method603(pendingspawn_0.anInt365, pendingspawn_0.anInt367)) {
					DecorativeObject.method460(pendingspawn_0.level, pendingspawn_0.type, pendingspawn_0.anInt363,
							pendingspawn_0.anInt364, pendingspawn_0.anInt365, pendingspawn_0.anInt369,
							pendingspawn_0.anInt367);
					pendingspawn_0.unlink();
				}
			} else {
				if (pendingspawn_0.delay > 0) {
					--pendingspawn_0.delay;
				}

				if ((pendingspawn_0.delay == 0) && (pendingspawn_0.anInt363 >= 1) && (pendingspawn_0.anInt364 >= 1)
						&& (pendingspawn_0.anInt363 <= 102) && (pendingspawn_0.anInt364 <= 102)
						&& ((pendingspawn_0.anInt366 < 0)
								|| Enum2.method603(pendingspawn_0.anInt366, pendingspawn_0.anInt368))) {
					DecorativeObject.method460(pendingspawn_0.level, pendingspawn_0.type, pendingspawn_0.anInt363,
							pendingspawn_0.anInt364, pendingspawn_0.anInt366, pendingspawn_0.orientation,
							pendingspawn_0.anInt368);
					pendingspawn_0.delay = -1;
					if ((pendingspawn_0.anInt366 == pendingspawn_0.anInt365) && (pendingspawn_0.anInt365 == -1)) {
						pendingspawn_0.unlink();
					} else if ((pendingspawn_0.anInt366 == pendingspawn_0.anInt365)
							&& (pendingspawn_0.anInt369 == pendingspawn_0.orientation)
							&& (pendingspawn_0.anInt368 == pendingspawn_0.anInt367)) {
						pendingspawn_0.unlink();
					}
				}
			}
		}

	}

}
