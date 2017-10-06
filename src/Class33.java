import java.util.Comparator;

final class Class33 implements Comparator {

	static IndexData indexMaps;
	static byte[][][] overlayPaths;

	int method234(final Class48 class48_0, final Class48 class48_1) {
		return class48_0.anInt105 < class48_1.anInt105 ? -1 : (class48_1.anInt105 == class48_0.anInt105 ? 0 : 1);
	}

	@Override
	public int compare(final Object object_0, final Object object_1) {
		return method234((Class48) object_0, (Class48) object_1);
	}

	@Override
	public boolean equals(final Object object_0) {
		return super.equals(object_0);
	}

	static Enum8[] method235() {
		return new Enum8[] { Enum8.anEnum8_3, Enum8.anEnum8_2, Enum8.anEnum8_1 };
	}

	static void method236() {
		for (Node_Sub1 node_sub1_0 = (Node_Sub1) Node_Sub1.aDeque3
				.getFront(); node_sub1_0 != null; node_sub1_0 = (Node_Sub1) Node_Sub1.aDeque3.getNext()) {
			if (node_sub1_0.anAClass5_Sub2_1 != null) {
				Class76.anAClass5_Sub1_1.method700(node_sub1_0.anAClass5_Sub2_1);
				node_sub1_0.anAClass5_Sub2_1 = null;
			}

			if (node_sub1_0.anAClass5_Sub2_2 != null) {
				Class76.anAClass5_Sub1_1.method700(node_sub1_0.anAClass5_Sub2_2);
				node_sub1_0.anAClass5_Sub2_2 = null;
			}
		}

		Node_Sub1.aDeque3.clear();
	}

	static final void method237(NPCComposition npccomposition_0, final int int_0, final int int_1, final int int_2) {
		if (Client.menuOptionCount < 400) {
			if (npccomposition_0.configs != null) {
				npccomposition_0 = npccomposition_0.transform();
			}

			if (npccomposition_0 != null) {
				if (npccomposition_0.aBool58) {
					if (!npccomposition_0.aBool59 || (Client.anInt740 == int_0)) {
						String string_0 = npccomposition_0.name;
						int int_3;
						int int_4;
						if (npccomposition_0.combatLevel != 0) {
							int_3 = npccomposition_0.combatLevel;
							int_4 = Script.localPlayer.combatLevel;
							final int int_5 = int_4 - int_3;
							String string_1;
							if (int_5 < -9) {
								string_1 = Class6.getColTags(16711680);
							} else if (int_5 < -6) {
								string_1 = Class6.getColTags(16723968);
							} else if (int_5 < -3) {
								string_1 = Class6.getColTags(16740352);
							} else if (int_5 < 0) {
								string_1 = Class6.getColTags(16756736);
							} else if (int_5 > 9) {
								string_1 = Class6.getColTags(65280);
							} else if (int_5 > 6) {
								string_1 = Class6.getColTags(4259584);
							} else if (int_5 > 3) {
								string_1 = Class6.getColTags(8453888);
							} else if (int_5 > 0) {
								string_1 = Class6.getColTags(12648192);
							} else {
								string_1 = Class6.getColTags(16776960);
							}

							string_0 = string_0 + string_1 + " " + " (" + "level-" + npccomposition_0.combatLevel + ")";
						}

						if (npccomposition_0.aBool59 && Client.aBool90) {
							Class7.addMenuEntry("Examine", Class6.getColTags(16776960) + string_0, 1003, int_0, int_1,
									int_2);
						}

						if (Client.itemSelectionState == 1) {
							Class7.addMenuEntry("Use",
									Client.selectedItemName + " " + "->" + " " + Class6.getColTags(16776960) + string_0,
									7, int_0, int_1, int_2);
						} else if (Client.spellSelected) {
							if ((Class53.anInt131 & 0x2) == 2) {
								Class7.addMenuEntry(Client.aString33,
										Client.aString34 + " " + "->" + " " + Class6.getColTags(16776960) + string_0, 8,
										int_0, int_1, int_2);
								return;
							}
						} else {
							final int int_6 = npccomposition_0.aBool59 && Client.aBool90 ? 2000 : 0;
							String[] strings_0 = npccomposition_0.actions;
							if (Client.aBool89) {
								strings_0 = Class11.method168(strings_0);
							}

							if (strings_0 != null) {
								for (int_3 = 4; int_3 >= 0; --int_3) {
									if ((strings_0[int_3] != null) && !strings_0[int_3].equalsIgnoreCase("Attack")) {
										int_4 = 0;
										if (int_3 == 0) {
											int_4 = int_6 + 9;
										}

										if (int_3 == 1) {
											int_4 = int_6 + 10;
										}

										if (int_3 == 2) {
											int_4 = int_6 + 11;
										}

										if (int_3 == 3) {
											int_4 = int_6 + 12;
										}

										if (int_3 == 4) {
											int_4 = int_6 + 13;
										}

										Class7.addMenuEntry(strings_0[int_3], Class6.getColTags(16776960) + string_0,
												int_4, int_0, int_1, int_2);
									}
								}
							}

							if (strings_0 != null) {
								for (int_3 = 4; int_3 >= 0; --int_3) {
									if ((strings_0[int_3] != null) && strings_0[int_3].equalsIgnoreCase("Attack")) {
										short short_0 = 0;
										if (Client.anEnum2_6 != Enum2.anEnum2_4) {
											if ((Client.anEnum2_6 == Enum2.anEnum2_2)
													|| ((Enum2.anEnum2_1 == Client.anEnum2_6)
															&& (npccomposition_0.combatLevel > Script.localPlayer.combatLevel))) {
												short_0 = 2000;
											}

											int_4 = 0;
											if (int_3 == 0) {
												int_4 = short_0 + 9;
											}

											if (int_3 == 1) {
												int_4 = short_0 + 10;
											}

											if (int_3 == 2) {
												int_4 = short_0 + 11;
											}

											if (int_3 == 3) {
												int_4 = short_0 + 12;
											}

											if (int_3 == 4) {
												int_4 = short_0 + 13;
											}

											Class7.addMenuEntry(strings_0[int_3],
													Class6.getColTags(16776960) + string_0, int_4, int_0, int_1, int_2);
										}
									}
								}
							}

							if (!npccomposition_0.aBool59 || !Client.aBool90) {
								Class7.addMenuEntry("Examine", Class6.getColTags(16776960) + string_0, 1003, int_0,
										int_1, int_2);
								return;
							}
						}

					}
				}
			}
		}
	}

	public static Widget method238(final int int_0, final int int_1) {
		final Widget widget_0 = Class18.method202(int_0);
		return int_1 == -1 ? widget_0
				: ((widget_0 != null) && (widget_0.children != null) && (int_1 < widget_0.children.length)
						? widget_0.children[int_1] : null);
	}

	static int method239(final int int_0, final Script script_0, final boolean bool_0) {
		int int_1;
		if (int_0 == 5504) {
			WorldMapType2.intStackSize -= 2;
			int_1 = Class45.intStack[WorldMapType2.intStackSize];
			final int int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
			if (!Client.aBool85) {
				Client.anInt712 = int_1;
				Client.mapAngle = int_2;
			}

			return 1;
		} else if (int_0 == 5505) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.anInt712;
			return 1;
		} else if (int_0 == 5506) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.mapAngle;
			return 1;
		} else if (int_0 == 5530) {
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			if (int_1 < 0) {
				int_1 = 0;
			}

			Client.anInt739 = int_1;
			return 1;
		} else if (int_0 == 5531) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.anInt739;
			return 1;
		} else {
			return 2;
		}
	}

	public static boolean method240(final int int_0) {
		return (int_0 & 0x1) != 0;
	}

}
