public class Class87 {

	static final void method466(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6) {
		final int[] ints_0 = Region.method375(int_0, int_1, int_2);
		final int[] ints_1 = Region.method375(int_3, int_4, int_5);
		Rasterizer2D.drawLine(ints_0[0], ints_0[1], ints_1[0], ints_1[1], int_6);
	}

	public static final void method467(final Model model_0, final int int_0, final int int_1, final int int_2,
			final int int_3) {
		Class46.aCombatInfoList1.method455(new AClass4_Sub1(model_0, int_0, int_1, int_2, int_3));
	}

	static int method468(final int int_0, final Script script_0, final boolean bool_0) {
		if (int_0 == 3300) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.gameCycle;
			return 1;
		} else {
			int int_1;
			int int_2;
			if (int_0 == 3301) {
				WorldMapType2.intStackSize -= 2;
				int_1 = Class45.intStack[WorldMapType2.intStackSize];
				int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
				Class45.intStack[++WorldMapType2.intStackSize - 1] = BaseVarType.method613(int_1, int_2);
				return 1;
			} else {
				int[] ints_0;
				int int_3;
				XItemContainer xitemcontainer_0;
				int int_4;
				if (int_0 == 3302) {
					WorldMapType2.intStackSize -= 2;
					int_1 = Class45.intStack[WorldMapType2.intStackSize];
					int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
					ints_0 = Class45.intStack;
					int_3 = ++WorldMapType2.intStackSize - 1;
					xitemcontainer_0 = (XItemContainer) XItemContainer.itemContainers.get(int_1);
					if (xitemcontainer_0 == null) {
						int_4 = 0;
					} else if ((int_2 >= 0) && (int_2 < xitemcontainer_0.stackSizes.length)) {
						int_4 = xitemcontainer_0.stackSizes[int_2];
					} else {
						int_4 = 0;
					}

					ints_0[int_3] = int_4;
					return 1;
				} else {
					int int_5;
					int int_6;
					if (int_0 == 3303) {
						WorldMapType2.intStackSize -= 2;
						int_1 = Class45.intStack[WorldMapType2.intStackSize];
						int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
						ints_0 = Class45.intStack;
						int_3 = ++WorldMapType2.intStackSize - 1;
						xitemcontainer_0 = (XItemContainer) XItemContainer.itemContainers.get(int_1);
						if (xitemcontainer_0 == null) {
							int_4 = 0;
						} else if (int_2 == -1) {
							int_4 = 0;
						} else {
							int_5 = 0;

							for (int_6 = 0; int_6 < xitemcontainer_0.stackSizes.length; int_6++) {
								if (int_2 == xitemcontainer_0.itemIds[int_6]) {
									int_5 += xitemcontainer_0.stackSizes[int_6];
								}
							}

							int_4 = int_5;
						}

						ints_0[int_3] = int_4;
						return 1;
					} else {
						int int_7;
						if (int_0 == 3304) {
							int_1 = Class45.intStack[--WorldMapType2.intStackSize];
							final int[] ints_1 = Class45.intStack;
							int_7 = ++WorldMapType2.intStackSize - 1;
							InvType invtype_0 = (InvType) InvType.aNodeCache7.get(int_1);
							InvType invtype_1;
							if (invtype_0 != null) {
								invtype_1 = invtype_0;
							} else {
								final byte[] bytes_0 = InvType.anIndexDataBase18.getConfigData(5, int_1);
								invtype_0 = new InvType();
								if (bytes_0 != null) {
									invtype_0.decode(new Buffer(bytes_0));
								}

								InvType.aNodeCache7.put(invtype_0, int_1);
								invtype_1 = invtype_0;
							}

							ints_1[int_7] = invtype_1.anInt466;
							return 1;
						} else if (int_0 == 3305) {
							int_1 = Class45.intStack[--WorldMapType2.intStackSize];
							Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.boostedSkillLevels[int_1];
							return 1;
						} else if (int_0 == 3306) {
							int_1 = Class45.intStack[--WorldMapType2.intStackSize];
							Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.realSkillLevels[int_1];
							return 1;
						} else if (int_0 == 3307) {
							int_1 = Class45.intStack[--WorldMapType2.intStackSize];
							Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.skillExperiences[int_1];
							return 1;
						} else if (int_0 == 3308) {
							int_1 = AClass1_Sub1.plane;
							int_2 = (Script.localPlayer.anInt547 >> 7) + AClass2.baseX;
							int_7 = (Script.localPlayer.anInt550 >> 7) + AClass4_Sub1.baseY;
							Class45.intStack[++WorldMapType2.intStackSize - 1] = (int_1 << 28) + (int_2 << 14) + int_7;
							return 1;
						} else if (int_0 == 3309) {
							int_1 = Class45.intStack[--WorldMapType2.intStackSize];
							Class45.intStack[++WorldMapType2.intStackSize - 1] = (int_1 >> 14) & 0x3FFF;
							return 1;
						} else if (int_0 == 3310) {
							int_1 = Class45.intStack[--WorldMapType2.intStackSize];
							Class45.intStack[++WorldMapType2.intStackSize - 1] = int_1 >> 28;
							return 1;
						} else if (int_0 == 3311) {
							int_1 = Class45.intStack[--WorldMapType2.intStackSize];
							Class45.intStack[++WorldMapType2.intStackSize - 1] = int_1 & 0x3FFF;
							return 1;
						} else if (int_0 == 3312) {
							Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.isMembers ? 1 : 0;
							return 1;
						} else if (int_0 == 3313) {
							WorldMapType2.intStackSize -= 2;
							int_1 = Class45.intStack[WorldMapType2.intStackSize] + 32768;
							int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
							Class45.intStack[++WorldMapType2.intStackSize - 1] = BaseVarType.method613(int_1, int_2);
							return 1;
						} else if (int_0 == 3314) {
							WorldMapType2.intStackSize -= 2;
							int_1 = Class45.intStack[WorldMapType2.intStackSize] + 32768;
							int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
							ints_0 = Class45.intStack;
							int_3 = ++WorldMapType2.intStackSize - 1;
							xitemcontainer_0 = (XItemContainer) XItemContainer.itemContainers.get(int_1);
							if (xitemcontainer_0 == null) {
								int_4 = 0;
							} else if ((int_2 >= 0) && (int_2 < xitemcontainer_0.stackSizes.length)) {
								int_4 = xitemcontainer_0.stackSizes[int_2];
							} else {
								int_4 = 0;
							}

							ints_0[int_3] = int_4;
							return 1;
						} else if (int_0 != 3315) {
							if (int_0 == 3316) {
								if (Client.rights >= 2) {
									Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.rights;
								} else {
									Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
								}

								return 1;
							} else if (int_0 == 3317) {
								Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.anInt644;
								return 1;
							} else if (int_0 == 3318) {
								Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.world;
								return 1;
							} else if (int_0 == 3321) {
								Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.energy;
								return 1;
							} else if (int_0 == 3322) {
								Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.weight;
								return 1;
							} else if (int_0 == 3323) {
								if (Client.aBool87) {
									Class45.intStack[++WorldMapType2.intStackSize - 1] = 1;
								} else {
									Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
								}

								return 1;
							} else if (int_0 == 3324) {
								Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.flags;
								return 1;
							} else if (int_0 == 3325) {
								WorldMapType2.intStackSize -= 4;
								int_1 = Class45.intStack[WorldMapType2.intStackSize];
								int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
								int_7 = Class45.intStack[WorldMapType2.intStackSize + 2];
								int_3 = Class45.intStack[WorldMapType2.intStackSize + 3];
								int_1 += int_2 << 14;
								int_1 += int_7 << 28;
								int_1 += int_3;
								Class45.intStack[++WorldMapType2.intStackSize - 1] = int_1;
								return 1;
							} else {
								return 2;
							}
						} else {
							WorldMapType2.intStackSize -= 2;
							int_1 = Class45.intStack[WorldMapType2.intStackSize] + 32768;
							int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
							ints_0 = Class45.intStack;
							int_3 = ++WorldMapType2.intStackSize - 1;
							xitemcontainer_0 = (XItemContainer) XItemContainer.itemContainers.get(int_1);
							if (xitemcontainer_0 == null) {
								int_4 = 0;
							} else if (int_2 == -1) {
								int_4 = 0;
							} else {
								int_5 = 0;

								for (int_6 = 0; int_6 < xitemcontainer_0.stackSizes.length; int_6++) {
									if (int_2 == xitemcontainer_0.itemIds[int_6]) {
										int_5 += xitemcontainer_0.stackSizes[int_6];
									}
								}

								int_4 = int_5;
							}

							ints_0[int_3] = int_4;
							return 1;
						}
					}
				}
			}
		}
	}

}
