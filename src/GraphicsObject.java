public final class GraphicsObject extends Renderable {

	static int anInt572;
	int anInt573;
	boolean finished;
	int anInt574;
	int anInt575;
	Sequence aSequence1;
	int level;
	int anInt576;
	int anInt577;
	int height;
	int startCycle;

	GraphicsObject(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final int int_6) {
		anInt575 = 0;
		anInt574 = 0;
		finished = false;
		anInt573 = int_0;
		level = int_1;
		anInt576 = int_2;
		anInt577 = int_3;
		height = int_4;
		startCycle = int_6 + int_5;
		final int int_7 = InvType.getSpotAnimType(anInt573).anInt441;
		if (int_7 != -1) {
			finished = false;
			aSequence1 = Class54.getAnimation(int_7);
		} else {
			finished = true;
		}
	}

	@Override
	protected final Model getModel() {
		final Spotanim spotanim_0 = InvType.getSpotAnimType(anInt573);
		Model model_0;
		if (!finished) {
			model_0 = spotanim_0.method708(anInt575);
		} else {
			model_0 = spotanim_0.method708(-1);
		}

		return model_0 == null ? null : model_0;
	}

	final void method894(final int int_0) {
		if (!finished) {
			anInt574 += int_0;

			while (anInt574 > aSequence1.frameLenghts[anInt575]) {
				anInt574 -= aSequence1.frameLenghts[anInt575];
				++anInt575;
				if (anInt575 >= aSequence1.frameIDs.length) {
					finished = true;
					break;
				}
			}

		}
	}

	static final void method895(final Player player_0, final int int_0, final int int_1, final int int_2) {
		if (Script.localPlayer != player_0) {
			if (Client.menuOptionCount < 400) {
				int int_3;
				String string_2;
				if (player_0.totalLevel == 0) {
					final String string_0 = player_0.actions[0] + player_0.name + player_0.actions[1];
					int_3 = player_0.combatLevel;
					final int int_4 = Script.localPlayer.combatLevel;
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

					string_2 = string_0 + string_1 + " " + " (" + "level-" + player_0.combatLevel + ")"
							+ player_0.actions[2];
				} else {
					string_2 = player_0.actions[0] + player_0.name + player_0.actions[1] + " " + " (" + "skill-"
							+ player_0.totalLevel + ")" + player_0.actions[2];
				}

				int int_6;
				if (Client.itemSelectionState == 1) {
					Class7.addMenuEntry("Use",
							Client.selectedItemName + " " + "->" + " " + Class6.getColTags(16777215) + string_2, 14,
							int_0, int_1, int_2);
				} else if (Client.spellSelected) {
					if ((Class53.anInt131 & 0x8) == 8) {
						Class7.addMenuEntry(Client.aString33,
								Client.aString34 + " " + "->" + " " + Class6.getColTags(16777215) + string_2, 15, int_0,
								int_1, int_2);
					}
				} else {
					for (int_6 = 7; int_6 >= 0; --int_6) {
						if (Client.playerOptions[int_6] != null) {
							short short_0 = 0;
							if (Client.playerOptions[int_6].equalsIgnoreCase("Attack")) {
								if (Client.anEnum2_5 == Enum2.anEnum2_4) {
									continue;
								}

								if ((Enum2.anEnum2_2 == Client.anEnum2_5) || ((Enum2.anEnum2_1 == Client.anEnum2_5)
										&& (player_0.combatLevel > Script.localPlayer.combatLevel))) {
									short_0 = 2000;
								}

								if ((Script.localPlayer.team != 0) && (player_0.team != 0)) {
									if (player_0.team == Script.localPlayer.team) {
										short_0 = 2000;
									} else {
										short_0 = 0;
									}
								}
							} else if (Client.playerOptionsPriorities[int_6]) {
								short_0 = 2000;
							}

							int_3 = Client.playerMenuTypes[int_6] + short_0;
							Class7.addMenuEntry(Client.playerOptions[int_6], Class6.getColTags(16777215) + string_2,
									int_3, int_0, int_1, int_2);
						}
					}
				}

				for (int_6 = 0; int_6 < Client.menuOptionCount; int_6++) {
					if (Client.menuTypes[int_6] == 23) {
						Client.menuTargets[int_6] = Class6.getColTags(16777215) + string_2;
						break;
					}
				}

			}
		}
	}

}
