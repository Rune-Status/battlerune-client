import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyFocusListener implements KeyListener, FocusListener {

	public static KeyFocusListener keyboard;
	static int anInt124;
	static int[] anIntArray29;
	static Class21 aClass21_1;
	public static boolean[] aBoolArray3;
	static int[] anIntArray30;
	static int anInt125;
	static int anInt126;
	static int anInt127;
	static int[] anIntArray31;
	static char[] aCharArray1;
	public static int[] anIntArray32;
	public static int anInt128;
	static int anInt129;
	public static volatile int keyboardIdleTicks;
	static AbstractSoundSystem soundSystem1;
	public static int anInt130;

	static {
		keyboard = new KeyFocusListener();
		aBoolArray3 = new boolean[112];
		anIntArray30 = new int[128];
		anInt125 = 0;
		anInt124 = 0;
		aCharArray1 = new char[128];
		anIntArray31 = new int[128];
		anIntArray32 = new int[128];
		anInt128 = 0;
		anInt127 = 0;
		anInt126 = 0;
		anInt129 = 0;
		keyboardIdleTicks = 0;
		anIntArray29 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1,
				-1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1,
				-1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52,
				53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228,
				231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
				12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1 };
	}

	@Override
	public final synchronized void keyReleased(final KeyEvent keyevent_0) {
		if (keyboard != null) {
			int int_0 = keyevent_0.getKeyCode();
			if ((int_0 >= 0) && (int_0 < anIntArray29.length)) {
				int_0 = anIntArray29[int_0] & 0xFFFFFF7F;
			} else {
				int_0 = -1;
			}

			if ((anInt124 >= 0) && (int_0 >= 0)) {
				anIntArray30[anInt124] = ~int_0;
				anInt124 = (anInt124 + 1) & 0x7F;
				if (anInt125 == anInt124) {
					anInt124 = -1;
				}
			}
		}

		keyevent_0.consume();
	}

	@Override
	public final synchronized void keyPressed(final KeyEvent keyevent_0) {
		if (keyboard != null) {
			int int_0 = keyevent_0.getKeyCode();
			if ((int_0 >= 0) && (int_0 < anIntArray29.length)) {
				int_0 = anIntArray29[int_0];
				if ((int_0 & 0x80) != 0) {
					int_0 = -1;
				}
			} else {
				int_0 = -1;
			}

			if ((anInt124 >= 0) && (int_0 >= 0)) {
				anIntArray30[anInt124] = int_0;
				anInt124 = (anInt124 + 1) & 0x7F;
				if (anInt124 == anInt125) {
					anInt124 = -1;
				}
			}

			int int_1;
			if (int_0 >= 0) {
				int_1 = (anInt126 + 1) & 0x7F;
				if (int_1 != anInt127) {
					anIntArray31[anInt126] = int_0;
					aCharArray1[anInt126] = 0;
					anInt126 = int_1;
				}
			}

			int_1 = keyevent_0.getModifiers();
			if (((int_1 & 0xA) != 0) || (int_0 == 85) || (int_0 == 10)) {
				keyevent_0.consume();
				return;
			}
		}

	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent_0) {
		if (keyboard != null) {
			anInt124 = -1;
		}

	}

	@Override
	public final void focusGained(final FocusEvent focusevent_0) {
	}

	@Override
	public final void keyTyped(final KeyEvent keyevent_0) {
		if (keyboard != null) {
			final char char_0 = keyevent_0.getKeyChar();
			if ((char_0 != 0) && (char_0 != 65535)) {
				boolean bool_0;
				if (((char_0 > 0) && (char_0 < 128)) || ((char_0 >= 160) && (char_0 <= 255))) {
					bool_0 = true;
				} else {
					label58: {
						if (char_0 != 0) {
							final char[] chars_0 = Class98.aCharArray3;

							for (int int_1 = 0; int_1 < chars_0.length; int_1++) {
								final char char_1 = chars_0[int_1];
								if (char_0 == char_1) {
									bool_0 = true;
									break label58;
								}
							}
						}

						bool_0 = false;
					}
				}

				if (bool_0) {
					final int int_0 = (anInt126 + 1) & 0x7F;
					if (int_0 != anInt127) {
						anIntArray31[anInt126] = -1;
						aCharArray1[anInt126] = char_0;
						anInt126 = int_0;
					}
				}
			}
		}

		keyevent_0.consume();
	}

	public static int method314(int int_0) {
		int_0 = ((int_0 >>> 1) & 0x55555555) + (int_0 & 0x55555555);
		int_0 = (int_0 & 0x33333333) + ((int_0 >>> 2) & 0x33333333);
		int_0 = (int_0 + (int_0 >>> 4)) & 0xF0F0F0F;
		int_0 += int_0 >>> 8;
		int_0 += int_0 >>> 16;
		return int_0 & 0xFF;
	}

	static final void method315(final int int_0, final int int_1, final int int_2, final int int_3) {
		if ((Client.itemSelectionState == 0) && !Client.spellSelected) {
			Class7.addMenuEntry("Walk here", "", 23, 0, int_0 - int_2, int_1 - int_3);
		}

		int int_4 = -1;
		int int_5 = -1;

		int int_6;
		int int_7;
		for (int_6 = 0; int_6 < Class56.anInt145; int_6++) {
			int_7 = Class56.anIntArray35[int_6];
			final int int_8 = int_7 & 0x7F;
			final int int_9 = (int_7 >> 7) & 0x7F;
			final int int_10 = (int_7 >> 29) & 0x3;
			final int int_11 = (int_7 >> 14) & 0x7FFF;
			if (int_5 != int_7) {
				int_5 = int_7;
				if ((int_10 == 2) && (Class8.region.method364(AClass1_Sub1.plane, int_8, int_9, int_7) >= 0)) {
					ObjectComposition objectcomposition_0 = PlayerComposition.getObjectDefinition(int_11);
					if (objectcomposition_0.impostorIds != null) {
						objectcomposition_0 = objectcomposition_0.getImpostor();
					}

					if (objectcomposition_0 == null) {
						continue;
					}

					if (Client.itemSelectionState == 1) {
						Class7.addMenuEntry("Use", Client.selectedItemName + " " + "->" + " " + Class6.getColTags(65535)
								+ objectcomposition_0.name, 1, int_7, int_8, int_9);
					} else if (Client.spellSelected) {
						if ((Class53.anInt131 & 0x4) == 4) {
							Class7.addMenuEntry(Client.aString33, Client.aString34 + " " + "->" + " "
									+ Class6.getColTags(65535) + objectcomposition_0.name, 2, int_7, int_8, int_9);
						}
					} else {
						String[] strings_0 = objectcomposition_0.actions;
						if (Client.aBool89) {
							strings_0 = Class11.method168(strings_0);
						}

						if (strings_0 != null) {
							for (int int_12 = 4; int_12 >= 0; --int_12) {
								if (strings_0[int_12] != null) {
									short short_0 = 0;
									if (int_12 == 0) {
										short_0 = 3;
									}

									if (int_12 == 1) {
										short_0 = 4;
									}

									if (int_12 == 2) {
										short_0 = 5;
									}

									if (int_12 == 3) {
										short_0 = 6;
									}

									if (int_12 == 4) {
										short_0 = 1001;
									}

									Class7.addMenuEntry(strings_0[int_12],
											Class6.getColTags(65535) + objectcomposition_0.name, short_0, int_7, int_8,
											int_9);
								}
							}
						}

						Class7.addMenuEntry("Examine", Class6.getColTags(65535) + objectcomposition_0.name, 1002,
								objectcomposition_0.anInt493 << 14, int_8, int_9);
					}
				}

				int int_13;
				NPC npc_0;
				Player player_1;
				int[] ints_0;
				int int_15;
				if (int_10 == 1) {
					final NPC npc_1 = Client.cachedNPCs[int_11];
					if (npc_1 == null) {
						continue;
					}

					if ((npc_1.composition.anInt518 == 1) && ((npc_1.anInt547 & 0x7F) == 64)
							&& ((npc_1.anInt550 & 0x7F) == 64)) {
						for (int_13 = 0; int_13 < Client.anInt690; int_13++) {
							npc_0 = Client.cachedNPCs[Client.npcIndices[int_13]];
							if ((npc_0 != null) && (npc_1 != npc_0) && (npc_0.composition.anInt518 == 1)
									&& (npc_0.anInt547 == npc_1.anInt547) && (npc_1.anInt550 == npc_0.anInt550)) {
								Class33.method237(npc_0.composition, Client.npcIndices[int_13], int_8, int_9);
							}
						}

						int_13 = Class40.anInt94;
						ints_0 = Class40.anIntArray17;

						for (int_15 = 0; int_15 < int_13; int_15++) {
							player_1 = Client.cachedPlayers[ints_0[int_15]];
							if ((player_1 != null) && (player_1.anInt547 == npc_1.anInt547)
									&& (npc_1.anInt550 == player_1.anInt550)) {
								GraphicsObject.method895(player_1, ints_0[int_15], int_8, int_9);
							}
						}
					}

					Class33.method237(npc_1.composition, int_11, int_8, int_9);
				}

				if (int_10 == 0) {
					final Player player_2 = Client.cachedPlayers[int_11];
					if (player_2 == null) {
						continue;
					}

					if (((player_2.anInt547 & 0x7F) == 64) && ((player_2.anInt550 & 0x7F) == 64)) {
						for (int_13 = 0; int_13 < Client.anInt690; int_13++) {
							npc_0 = Client.cachedNPCs[Client.npcIndices[int_13]];
							if ((npc_0 != null) && (npc_0.composition.anInt518 == 1)
									&& (player_2.anInt547 == npc_0.anInt547) && (npc_0.anInt550 == player_2.anInt550)) {
								Class33.method237(npc_0.composition, Client.npcIndices[int_13], int_8, int_9);
							}
						}

						int_13 = Class40.anInt94;
						ints_0 = Class40.anIntArray17;

						for (int_15 = 0; int_15 < int_13; int_15++) {
							player_1 = Client.cachedPlayers[ints_0[int_15]];
							if ((player_1 != null) && (player_1 != player_2) && (player_2.anInt547 == player_1.anInt547)
									&& (player_1.anInt550 == player_2.anInt550)) {
								GraphicsObject.method895(player_1, ints_0[int_15], int_8, int_9);
							}
						}
					}

					if (int_11 != Client.anInt709) {
						GraphicsObject.method895(player_2, int_11, int_8, int_9);
					} else {
						int_4 = int_7;
					}
				}

				if (int_10 == 3) {
					final Deque deque_0 = Client.groundItemDeque[AClass1_Sub1.plane][int_8][int_9];
					if (deque_0 != null) {
						for (Item item_0 = (Item) deque_0.getTail(); item_0 != null; item_0 = (Item) deque_0
								.getPrevious()) {
							final ItemComposition itemcomposition_0 = Class45.getItemDefinition(item_0.anInt584);
							if (Client.itemSelectionState == 1) {
								Class7.addMenuEntry("Use", Client.selectedItemName + " " + "->" + " "
										+ Class6.getColTags(16748608) + itemcomposition_0.name, 16, item_0.anInt584,
										int_8, int_9);
							} else if (Client.spellSelected) {
								if ((Class53.anInt131 & 0x1) == 1) {
									Class7.addMenuEntry(
											Client.aString33, Client.aString34 + " " + "->" + " "
													+ Class6.getColTags(16748608) + itemcomposition_0.name,
											17, item_0.anInt584, int_8, int_9);
								}
							} else {
								String[] strings_1 = itemcomposition_0.groundActions;
								if (Client.aBool89) {
									strings_1 = Class11.method168(strings_1);
								}

								for (int int_14 = 4; int_14 >= 0; --int_14) {
									if ((strings_1 != null) && (strings_1[int_14] != null)) {
										byte byte_0 = 0;
										if (int_14 == 0) {
											byte_0 = 18;
										}

										if (int_14 == 1) {
											byte_0 = 19;
										}

										if (int_14 == 2) {
											byte_0 = 20;
										}

										if (int_14 == 3) {
											byte_0 = 21;
										}

										if (int_14 == 4) {
											byte_0 = 22;
										}

										Class7.addMenuEntry(strings_1[int_14],
												Class6.getColTags(16748608) + itemcomposition_0.name, byte_0,
												item_0.anInt584, int_8, int_9);
									} else if (int_14 == 2) {
										Class7.addMenuEntry("Take",
												Class6.getColTags(16748608) + itemcomposition_0.name, 20,
												item_0.anInt584, int_8, int_9);
									}
								}

								Class7.addMenuEntry("Examine", Class6.getColTags(16748608) + itemcomposition_0.name,
										1004, item_0.anInt584, int_8, int_9);
							}
						}
					}
				}
			}
		}

		if (int_4 != -1) {
			int_6 = int_4 & 0x7F;
			int_7 = (int_4 >> 7) & 0x7F;
			final Player player_0 = Client.cachedPlayers[Client.anInt709];
			GraphicsObject.method895(player_0, Client.anInt709, int_6, int_7);
		}

	}

}
