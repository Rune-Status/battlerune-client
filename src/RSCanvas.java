import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class RSCanvas extends Canvas {

	static int[] mapRegions;
	Component component;

	RSCanvas(final Component component_0) {
		component = component_0;
	}

	@Override
	public final void update(final Graphics graphics_0) {
		component.update(graphics_0);
	}

	@Override
	public final void paint(final Graphics graphics_0) {
		component.paint(graphics_0);
	}

	public static void method693() {
		while (true) {
			FileSystem filesystem_0;
			synchronized (Class92.aDeque1) {
				filesystem_0 = (FileSystem) Class92.aDeque2.popFront();
			}

			if (filesystem_0 == null) {
				return;
			}

			filesystem_0.data.method594(filesystem_0.index, (int) filesystem_0.hash, filesystem_0.aByteArray13, false);
		}
	}

	static AClass2 method694(final int int_0, final int int_1) {
		Client.anAClass2_Sub1_1.anInt166 = int_0;
		Client.anAClass2_Sub1_1.anInt167 = int_1;
		Client.anAClass2_Sub1_1.anInt168 = 1;
		Client.anAClass2_Sub1_1.anInt169 = 1;
		return Client.anAClass2_Sub1_1;
	}

	static final void method695(final Actor actor_0, final int int_0, final int int_1, final int int_2, final int int_3,
			final int int_4) {
		if (actor_0 != null) {
			if (actor_0.hasConfig()) {
				if (actor_0 instanceof NPC) {
					NPCComposition npccomposition_0 = ((NPC) actor_0).composition;
					if (npccomposition_0.configs != null) {
						npccomposition_0 = npccomposition_0.transform();
					}

					if (npccomposition_0 == null) {
						return;
					}
				}

				final int int_5 = Class40.anInt94;
				final int[] ints_0 = Class40.anIntArray17;
				int int_6 = 3;
				int int_8;
				int int_13;
				int int_14;
				if (!actor_0.combatInfoList.method451()) {
					Class9.characterToScreen(actor_0, actor_0.anInt552 + 15);

					for (CombatInfoListHolder combatinfolistholder_0 = (CombatInfoListHolder) actor_0.combatInfoList
							.method452(); combatinfolistholder_0 != null; combatinfolistholder_0 = (CombatInfoListHolder) actor_0.combatInfoList
									.method453()) {
						final CombatInfo1 combatinfo1_0 = combatinfolistholder_0.method616(Client.gameCycle);
						if (combatinfo1_0 == null) {
							if (combatinfolistholder_0.method617()) {
								combatinfolistholder_0.unlink();
							}
						} else {
							final CombatInfo2 combatinfo2_0 = combatinfolistholder_0.combatInfo2;
							final SpritePixels spritepixels_0 = combatinfo2_0.method794();
							final SpritePixels spritepixels_1 = combatinfo2_0.method795();
							int int_7 = 0;
							if ((spritepixels_0 != null) && (spritepixels_1 != null)) {
								if ((combatinfo2_0.anInt490 * 2) < spritepixels_1.width) {
									int_7 = combatinfo2_0.anInt490;
								}

								int_8 = spritepixels_1.width - (int_7 * 2);
							} else {
								int_8 = combatinfo2_0.healthScale;
							}

							int int_9 = 255;
							final int int_10 = Client.gameCycle - combatinfo1_0.anInt393;
							final int int_11 = (int_8 * combatinfo1_0.health) / combatinfo2_0.healthScale;
							int int_12;
							int int_62;
							if (combatinfo1_0.anInt394 > int_10) {
								int_12 = combatinfo2_0.anInt488 == 0 ? 0
										: combatinfo2_0.anInt488 * (int_10 / combatinfo2_0.anInt488);
								int_13 = (int_8 * combatinfo1_0.healthRatio) / combatinfo2_0.healthScale;
								int_62 = ((int_12 * (int_11 - int_13)) / combatinfo1_0.anInt394) + int_13;
							} else {
								int_62 = int_11;
								int_12 = (combatinfo1_0.anInt394 + combatinfo2_0.anInt487) - int_10;
								if (combatinfo2_0.anInt485 >= 0) {
									int_9 = (int_12 << 8) / (combatinfo2_0.anInt487 - combatinfo2_0.anInt485);
								}
							}

							if ((combatinfo1_0.health > 0) && (int_62 < 1)) {
								int_62 = 1;
							}

							int_12 = (int_1 + Client.screenY) - (int_8 >> 1);
							int_13 = (int_2 + Client.screenX) - int_6;
							if ((spritepixels_0 != null) && (spritepixels_1 != null)) {
								int_12 -= int_7;
								if (int_62 == int_8) {
									int_62 += int_7 * 2;
								} else {
									int_62 += int_7;
								}

								int_14 = spritepixels_0.height;
								int_6 += int_14;
								if ((int_9 >= 0) && (int_9 < 255)) {
									spritepixels_0.method926(int_12, int_13, int_9);
									Rasterizer2D.setInnerDrawRegion(int_12, int_13, int_12 + int_62, int_13 + int_14);
									spritepixels_1.method926(int_12, int_13, int_9);
								} else {
									spritepixels_0.method916(int_12, int_13);
									Rasterizer2D.setInnerDrawRegion(int_12, int_13, int_12 + int_62, int_13 + int_14);
									spritepixels_1.method916(int_12, int_13);
								}

								Rasterizer2D.setDrawRegion(int_1, int_2, int_1 + int_3, int_2 + int_4);
								int_6 += 2;
							} else {
								if (Client.screenY > -1) {
									Rasterizer2D.method853(int_12, int_13, int_62, 5, 65280);
									Rasterizer2D.method853(int_12 + int_62, int_13, int_8 - int_62, 5, 16711680);
								}

								int_6 += 7;
							}
						}
					}
				}

				if (int_6 < 30) {
					int_6 = 30;
				}

				if (int_0 < int_5) {
					final Player player_0 = (Player) actor_0;
					if (player_0.hidden) {
						return;
					}

					if ((player_0.skullIcon != -1) || (player_0.overheadIcon != -1)) {
						Class9.characterToScreen(actor_0, actor_0.anInt552 + 15);
						if (Client.screenY > -1) {
							if (player_0.skullIcon != -1) {
								Class2.mapfunctions[player_0.skullIcon].method916((int_1 + Client.screenY) - 12,
										(int_2 + Client.screenX) - int_6);
								int_6 += 25;
							}

							if (player_0.overheadIcon != -1) {
								XItemContainer.hitmarks[player_0.overheadIcon].method916((int_1 + Client.screenY) - 12,
										(int_2 + Client.screenX) - int_6);
								int_6 += 25;
							}
						}
					}

					if ((int_0 >= 0) && (Client.anInt667 == 10) && (ints_0[int_0] == Client.anInt671)) {
						Class9.characterToScreen(actor_0, actor_0.anInt552 + 15);
						if (Client.screenY > -1) {
							Class28.pkIcons[1].method916((int_1 + Client.screenY) - 12,
									(int_2 + Client.screenX) - int_6);
						}
					}
				} else {
					NPCComposition npccomposition_1 = ((NPC) actor_0).composition;
					if (npccomposition_1.configs != null) {
						npccomposition_1 = npccomposition_1.transform();
					}

					if ((npccomposition_1.anInt530 >= 0)
							&& (npccomposition_1.anInt530 < XItemContainer.hitmarks.length)) {
						Class9.characterToScreen(actor_0, actor_0.anInt552 + 15);
						if (Client.screenY > -1) {
							XItemContainer.hitmarks[npccomposition_1.anInt530].method916((int_1 + Client.screenY) - 12,
									(int_2 + Client.screenX) - 30);
						}
					}

					if ((Client.anInt667 == 1) && (Client.npcIndices[int_0 - int_5] == Client.anInt669)
							&& ((Client.gameCycle % 20) < 10)) {
						Class9.characterToScreen(actor_0, actor_0.anInt552 + 15);
						if (Client.screenY > -1) {
							Class28.pkIcons[0].method916((int_1 + Client.screenY) - 12, (int_2 + Client.screenX) - 28);
						}
					}
				}

				if ((actor_0.overhead != null)
						&& ((int_0 >= int_5) || (!actor_0.inSequence && ((Client.anInt727 == 4) || (!actor_0.aBool63
								&& ((Client.anInt727 == 0) || (Client.anInt727 == 3) || ((Client.anInt727 == 1)
										&& WorldMapType3.isFriended(((Player) actor_0).name, false)))))))) {
					Class9.characterToScreen(actor_0, actor_0.anInt552);
					if ((Client.screenY > -1) && (Client.anInt742 < Client.anInt743)) {
						Client.anIntArray160[Client.anInt742] = Class36.aFont3.method965(actor_0.overhead) / 2;
						Client.anIntArray159[Client.anInt742] = Class36.aFont3.verticalSpace;
						Client.anIntArray157[Client.anInt742] = Client.screenY;
						Client.anIntArray158[Client.anInt742] = Client.screenX;
						Client.anIntArray161[Client.anInt742] = actor_0.anInt555;
						Client.anIntArray162[Client.anInt742] = actor_0.anInt556;
						Client.anIntArray163[Client.anInt742] = actor_0.anInt554;
						Client.aStringArray6[Client.anInt742] = actor_0.overhead;
						++Client.anInt742;
					}
				}

				for (int int_15 = 0; int_15 < 4; int_15++) {
					final int int_16 = actor_0.hitsplatCycles[int_15];
					final int int_17 = actor_0.anIntArray109[int_15];
					CacheableNode_Sub3 cacheablenode_sub3_1 = null;
					int int_18 = 0;
					if (int_17 >= 0) {
						if (int_16 <= Client.gameCycle) {
							continue;
						}

						cacheablenode_sub3_1 = Class36.method246(actor_0.anIntArray109[int_15]);
						int_18 = cacheablenode_sub3_1.anInt510;
						if ((cacheablenode_sub3_1 != null) && (cacheablenode_sub3_1.anIntArray104 != null)) {
							cacheablenode_sub3_1 = cacheablenode_sub3_1.method817();
							if (cacheablenode_sub3_1 == null) {
								actor_0.hitsplatCycles[int_15] = -1;
								continue;
							}
						}
					} else if (int_16 < 0) {
						continue;
					}

					int_8 = actor_0.anIntArray110[int_15];
					CacheableNode_Sub3 cacheablenode_sub3_0 = null;
					if (int_8 >= 0) {
						cacheablenode_sub3_0 = Class36.method246(int_8);
						if ((cacheablenode_sub3_0 != null) && (cacheablenode_sub3_0.anIntArray104 != null)) {
							cacheablenode_sub3_0 = cacheablenode_sub3_0.method817();
						}
					}

					if ((int_16 - int_18) <= Client.gameCycle) {
						if (cacheablenode_sub3_1 == null) {
							actor_0.hitsplatCycles[int_15] = -1;
						} else {
							Class9.characterToScreen(actor_0, actor_0.anInt552 / 2);
							if (Client.screenY > -1) {
								if (int_15 == 1) {
									Client.screenX -= 20;
								}

								if (int_15 == 2) {
									Client.screenY -= 15;
									Client.screenX -= 10;
								}

								if (int_15 == 3) {
									Client.screenY += 15;
									Client.screenX -= 10;
								}

								SpritePixels spritepixels_2 = null;
								SpritePixels spritepixels_3 = null;
								SpritePixels spritepixels_4 = null;
								SpritePixels spritepixels_5 = null;
								int_13 = 0;
								int_14 = 0;
								int int_19 = 0;
								int int_20 = 0;
								int int_21 = 0;
								int int_22 = 0;
								int int_23 = 0;
								int int_24 = 0;
								SpritePixels spritepixels_6 = null;
								SpritePixels spritepixels_7 = null;
								SpritePixels spritepixels_8 = null;
								SpritePixels spritepixels_9 = null;
								int int_25 = 0;
								int int_26 = 0;
								int int_27 = 0;
								int int_28 = 0;
								int int_29 = 0;
								int int_30 = 0;
								int int_31 = 0;
								int int_32 = 0;
								int int_33 = 0;
								spritepixels_2 = cacheablenode_sub3_1.method818();
								int int_34;
								if (spritepixels_2 != null) {
									int_13 = spritepixels_2.width;
									int_34 = spritepixels_2.height;
									if (int_34 > int_33) {
										int_33 = int_34;
									}

									int_21 = spritepixels_2.offsetX;
								}

								spritepixels_3 = cacheablenode_sub3_1.method819();
								if (spritepixels_3 != null) {
									int_14 = spritepixels_3.width;
									int_34 = spritepixels_3.height;
									if (int_34 > int_33) {
										int_33 = int_34;
									}

									int_22 = spritepixels_3.offsetX;
								}

								spritepixels_4 = cacheablenode_sub3_1.method820();
								if (spritepixels_4 != null) {
									int_19 = spritepixels_4.width;
									int_34 = spritepixels_4.height;
									if (int_34 > int_33) {
										int_33 = int_34;
									}

									int_23 = spritepixels_4.offsetX;
								}

								spritepixels_5 = cacheablenode_sub3_1.method821();
								if (spritepixels_5 != null) {
									int_20 = spritepixels_5.width;
									int_34 = spritepixels_5.height;
									if (int_34 > int_33) {
										int_33 = int_34;
									}

									int_24 = spritepixels_5.offsetX;
								}

								if (cacheablenode_sub3_0 != null) {
									spritepixels_6 = cacheablenode_sub3_0.method818();
									if (spritepixels_6 != null) {
										int_25 = spritepixels_6.width;
										int_34 = spritepixels_6.height;
										if (int_34 > int_33) {
											int_33 = int_34;
										}

										int_29 = spritepixels_6.offsetX;
									}

									spritepixels_7 = cacheablenode_sub3_0.method819();
									if (spritepixels_7 != null) {
										int_26 = spritepixels_7.width;
										int_34 = spritepixels_7.height;
										if (int_34 > int_33) {
											int_33 = int_34;
										}

										int_30 = spritepixels_7.offsetX;
									}

									spritepixels_8 = cacheablenode_sub3_0.method820();
									if (spritepixels_8 != null) {
										int_27 = spritepixels_8.width;
										int_34 = spritepixels_8.height;
										if (int_34 > int_33) {
											int_33 = int_34;
										}

										int_31 = spritepixels_8.offsetX;
									}

									spritepixels_9 = cacheablenode_sub3_0.method821();
									if (spritepixels_9 != null) {
										int_28 = spritepixels_9.width;
										int_34 = spritepixels_9.height;
										if (int_34 > int_33) {
											int_33 = int_34;
										}

										int_32 = spritepixels_9.offsetX;
									}
								}

								Font font_0 = cacheablenode_sub3_1.method822();
								if (font_0 == null) {
									font_0 = Class82.aFont4;
								}

								Font font_1;
								if (cacheablenode_sub3_0 != null) {
									font_1 = cacheablenode_sub3_0.method822();
									if (font_1 == null) {
										font_1 = Class82.aFont4;
									}
								} else {
									font_1 = Class82.aFont4;
								}

								String string_0 = null;
								String string_1 = null;
								int int_35 = 0;
								string_0 = cacheablenode_sub3_1.method823(actor_0.hitsplatTypes[int_15]);
								final int int_63 = font_0.method965(string_0);
								if (cacheablenode_sub3_0 != null) {
									string_1 = cacheablenode_sub3_0.method823(actor_0.anIntArray111[int_15]);
									int_35 = font_1.method965(string_1);
								}

								int int_36 = 0;
								int int_37 = 0;
								if (int_14 > 0) {
									if ((spritepixels_4 == null) && (spritepixels_5 == null)) {
										int_36 = 1;
									} else {
										int_36 = (int_63 / int_14) + 1;
									}
								}

								if ((cacheablenode_sub3_0 != null) && (int_26 > 0)) {
									if ((spritepixels_8 == null) && (spritepixels_9 == null)) {
										int_37 = 1;
									} else {
										int_37 = (int_35 / int_26) + 1;
									}
								}

								int int_38 = 0;
								final int int_39 = int_38;
								if (int_13 > 0) {
									int_38 += int_13;
								}

								int_38 += 2;
								final int int_40 = int_38;
								if (int_19 > 0) {
									int_38 += int_19;
								}

								final int int_41 = int_38;
								int int_42 = int_38;
								int int_43;
								if (int_14 > 0) {
									int_43 = int_36 * int_14;
									int_38 += int_43;
									int_42 += (int_43 - int_63) / 2;
								} else {
									int_38 += int_63;
								}

								int_43 = int_38;
								if (int_20 > 0) {
									int_38 += int_20;
								}

								int int_44 = 0;
								int int_45 = 0;
								int int_46 = 0;
								int int_47 = 0;
								int int_48 = 0;
								int int_49;
								if (cacheablenode_sub3_0 != null) {
									int_38 += 2;
									int_44 = int_38;
									if (int_25 > 0) {
										int_38 += int_25;
									}

									int_38 += 2;
									int_45 = int_38;
									if (int_27 > 0) {
										int_38 += int_27;
									}

									int_46 = int_38;
									int_48 = int_38;
									if (int_26 > 0) {
										int_49 = int_26 * int_37;
										int_38 += int_49;
										int_48 += (int_49 - int_35) / 2;
									} else {
										int_38 += int_35;
									}

									int_47 = int_38;
									if (int_28 > 0) {
										int_38 += int_28;
									}
								}

								int_49 = actor_0.hitsplatCycles[int_15] - Client.gameCycle;
								final int int_50 = cacheablenode_sub3_1.anInt511
										- ((int_49 * cacheablenode_sub3_1.anInt511) / cacheablenode_sub3_1.anInt510);
								final int int_51 = ((cacheablenode_sub3_1.anInt513 * int_49)
										/ cacheablenode_sub3_1.anInt510) + -cacheablenode_sub3_1.anInt513;
								final int int_52 = ((Client.screenY + int_1) - (int_38 >> 1)) + int_50;
								final int int_53 = int_51 + ((int_2 + Client.screenX) - 12);
								int int_54 = int_53;
								int int_55 = int_33 + int_53;
								final int int_56 = int_53 + 15 + cacheablenode_sub3_1.anInt514;
								final int int_57 = int_56 - font_0.minSpacing;
								final int int_58 = int_56 + font_0.maxSpacing;
								if (int_57 < int_53) {
									int_54 = int_57;
								}

								if (int_58 > int_55) {
									int_55 = int_58;
								}

								int int_59 = 0;
								int int_60;
								int int_61;
								if (cacheablenode_sub3_0 != null) {
									int_59 = 15 + int_53 + cacheablenode_sub3_0.anInt514;
									int_60 = int_59 - font_1.minSpacing;
									int_61 = int_59 + font_1.maxSpacing;
									if (int_60 < int_54) {
										;
									}

									if (int_61 > int_55) {
										;
									}
								}

								int_60 = 255;
								if (cacheablenode_sub3_1.anInt512 >= 0) {
									int_60 = (int_49 << 8)
											/ (cacheablenode_sub3_1.anInt510 - cacheablenode_sub3_1.anInt512);
								}

								if ((int_60 >= 0) && (int_60 < 255)) {
									if (spritepixels_2 != null) {
										spritepixels_2.method926((int_52 + int_39) - int_21, int_53, int_60);
									}

									if (spritepixels_4 != null) {
										spritepixels_4.method926((int_52 + int_40) - int_23, int_53, int_60);
									}

									if (spritepixels_3 != null) {
										for (int_61 = 0; int_61 < int_36; int_61++) {
											spritepixels_3.method926((int_14 * int_61) + ((int_41 + int_52) - int_22),
													int_53, int_60);
										}
									}

									if (spritepixels_5 != null) {
										spritepixels_5.method926((int_52 + int_43) - int_24, int_53, int_60);
									}

									font_0.method980(string_0, int_42 + int_52, int_56, cacheablenode_sub3_1.anInt509,
											0, int_60);
									if (cacheablenode_sub3_0 != null) {
										if (spritepixels_6 != null) {
											spritepixels_6.method926((int_52 + int_44) - int_29, int_53, int_60);
										}

										if (spritepixels_8 != null) {
											spritepixels_8.method926((int_52 + int_45) - int_31, int_53, int_60);
										}

										if (spritepixels_7 != null) {
											for (int_61 = 0; int_61 < int_37; int_61++) {
												spritepixels_7.method926(
														(int_61 * int_26) + ((int_46 + int_52) - int_30), int_53,
														int_60);
											}
										}

										if (spritepixels_9 != null) {
											spritepixels_9.method926((int_47 + int_52) - int_32, int_53, int_60);
										}

										font_1.method980(string_1, int_52 + int_48, int_59,
												cacheablenode_sub3_0.anInt509, 0, int_60);
									}
								} else {
									if (spritepixels_2 != null) {
										spritepixels_2.method916((int_52 + int_39) - int_21, int_53);
									}

									if (spritepixels_4 != null) {
										spritepixels_4.method916((int_52 + int_40) - int_23, int_53);
									}

									if (spritepixels_3 != null) {
										for (int_61 = 0; int_61 < int_36; int_61++) {
											spritepixels_3.method916((int_14 * int_61) + ((int_52 + int_41) - int_22),
													int_53);
										}
									}

									if (spritepixels_5 != null) {
										spritepixels_5.method916((int_43 + int_52) - int_24, int_53);
									}

									font_0.method975(string_0, int_42 + int_52, int_56,
											cacheablenode_sub3_1.anInt509 | 0xFF000000, 0);
									if (cacheablenode_sub3_0 != null) {
										if (spritepixels_6 != null) {
											spritepixels_6.method916((int_52 + int_44) - int_29, int_53);
										}

										if (spritepixels_8 != null) {
											spritepixels_8.method916((int_45 + int_52) - int_31, int_53);
										}

										if (spritepixels_7 != null) {
											for (int_61 = 0; int_61 < int_37; int_61++) {
												spritepixels_7.method916(
														(int_26 * int_61) + ((int_52 + int_46) - int_30), int_53);
											}
										}

										if (spritepixels_9 != null) {
											spritepixels_9.method916((int_52 + int_47) - int_32, int_53);
										}

										font_1.method975(string_1, int_52 + int_48, int_59,
												cacheablenode_sub3_0.anInt509 | 0xFF000000, 0);
									}
								}
							}
						}
					}
				}

			}
		}
	}

}
