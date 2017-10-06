public class Frames extends CacheableNode {

	static ModIcon[] aModIconArray9;
	Frame[] skeletons;

	public Frames(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1, final int int_0,
			final boolean bool_0) {
		final Deque deque_0 = new Deque();
		final int int_1 = indexdatabase_0.fileCount(int_0);
		skeletons = new Frame[int_1];
		final int[] ints_0 = indexdatabase_0.getChilds(int_0);

		for (int int_2 = 0; int_2 < ints_0.length; int_2++) {
			final byte[] bytes_0 = indexdatabase_0.getConfigData(int_0, ints_0[int_2]);
			FrameMap framemap_0 = null;
			final int int_3 = ((bytes_0[0] & 0xFF) << 8) | (bytes_0[1] & 0xFF);

			for (FrameMap framemap_1 = (FrameMap) deque_0
					.getFront(); framemap_1 != null; framemap_1 = (FrameMap) deque_0.getNext()) {
				if (int_3 == framemap_1.anInt397) {
					framemap_0 = framemap_1;
					break;
				}
			}

			if (framemap_0 == null) {
				final byte[] bytes_1 = indexdatabase_1.getChild(int_3, 0);
				framemap_0 = new FrameMap(int_3, bytes_1);
				deque_0.addFront(framemap_0);
			}

			skeletons[ints_0[int_2]] = new Frame(bytes_0, framemap_0);
		}

	}

	public boolean method814(final int int_0) {
		return skeletons[int_0].showing;
	}

	static final void gameDraw(final Widget[] widgets_0, final int int_0, final int int_1, final int int_2,
			final int int_3, final int int_4, final int int_5, final int int_6, final int int_7) {
		Rasterizer2D.setDrawRegion(int_1, int_2, int_3, int_4);
		Graphics3D.method898();

		for (int int_8 = 0; int_8 < widgets_0.length; int_8++) {
			final Widget widget_0 = widgets_0[int_8];
			if ((widget_0 != null)
					&& ((widget_0.parentId == int_0) || ((int_0 == -1412584499) && (widget_0 == Client.aWidget9)))) {
				int int_9;
				if (int_7 == -1) {
					Client.widgetPositionX[Client.anInt647] = widget_0.relativeX + int_5;
					Client.widgetPositionY[Client.anInt647] = int_6 + widget_0.relativeY;
					Client.widgetBoundsWidth[Client.anInt647] = widget_0.width;
					Client.widgetBoundsHeight[Client.anInt647] = widget_0.height;
					int_9 = ++Client.anInt647 - 1;
				} else {
					int_9 = int_7;
				}

				widget_0.boundsIndex = int_9;
				widget_0.loopCycle = Client.gameCycle;
				if (!widget_0.hasScript || !Class37.method250(widget_0)) {
					if (widget_0.contentType > 0) {
						Class52.method310(widget_0);
					}

					int int_10 = widget_0.relativeX + int_5;
					int int_11 = int_6 + widget_0.relativeY;
					int int_12 = widget_0.opacity;
					int int_13;
					int int_14;
					if (widget_0 == Client.aWidget9) {
						if ((int_0 != -1412584499) && !widget_0.aBool32) {
							Class76.aWidgetArray1 = widgets_0;
							Ignore.anInt223 = int_5;
							AClass1_Sub1.anInt324 = int_6;
							continue;
						}

						if (Client.aBool84 && Client.aBool78) {
							int_13 = MouseInput.anInt278;
							int_14 = MouseInput.anInt280;
							int_13 -= Client.anInt656;
							int_14 -= Client.anInt657;
							if (int_13 < Client.anInt658) {
								int_13 = Client.anInt658;
							}

							if ((int_13 + widget_0.width) > (Client.anInt658 + Client.aWidget10.width)) {
								int_13 = (Client.anInt658 + Client.aWidget10.width) - widget_0.width;
							}

							if (int_14 < Client.anInt665) {
								int_14 = Client.anInt665;
							}

							if ((int_14 + widget_0.height) > (Client.anInt665 + Client.aWidget10.height)) {
								int_14 = (Client.anInt665 + Client.aWidget10.height) - widget_0.height;
							}

							int_10 = int_13;
							int_11 = int_14;
						}

						if (!widget_0.aBool32) {
							int_12 = 128;
						}
					}

					int int_15;
					int int_16;
					int int_17;
					int int_18;
					int int_19;
					int int_20;
					if (widget_0.type == 2) {
						int_13 = int_1;
						int_14 = int_2;
						int_15 = int_3;
						int_16 = int_4;
					} else if (widget_0.type == 9) {
						int_19 = int_10;
						int_17 = int_11;
						int_18 = int_10 + widget_0.width;
						int_20 = int_11 + widget_0.height;
						if (int_18 < int_10) {
							int_19 = int_18;
							int_18 = int_10;
						}

						if (int_20 < int_11) {
							int_17 = int_20;
							int_20 = int_11;
						}

						++int_18;
						++int_20;
						int_13 = int_19 > int_1 ? int_19 : int_1;
						int_14 = int_17 > int_2 ? int_17 : int_2;
						int_15 = int_18 < int_3 ? int_18 : int_3;
						int_16 = int_20 < int_4 ? int_20 : int_4;
					} else {
						int_19 = int_10 + widget_0.width;
						int_17 = int_11 + widget_0.height;
						int_13 = int_10 > int_1 ? int_10 : int_1;
						int_14 = int_11 > int_2 ? int_11 : int_2;
						int_15 = int_19 < int_3 ? int_19 : int_3;
						int_16 = int_17 < int_4 ? int_17 : int_4;
					}

					if (!widget_0.hasScript || ((int_13 < int_15) && (int_14 < int_16))) {
						int int_21;
						int int_22;
						int int_23;
						int int_24;
						int int_26;
						int int_27;
						int int_29;
						if (widget_0.contentType != 0) {
							if (widget_0.contentType == 1336) {
								if (Client.displayFps) {
									int_11 += 15;
									Class31.font_p12full.method976("Fps:" + GameEngine.FPS, int_10 + widget_0.width,
											int_11, 16776960, -1);
									int_11 += 15;
									final Runtime runtime_0 = Runtime.getRuntime();
									int_17 = (int) ((runtime_0.totalMemory() - runtime_0.freeMemory()) / 1024L);
									int_18 = 16776960;
									if ((int_17 > 32768) && Client.lowMemory) {
										int_18 = 16711680;
									}

									if ((int_17 > 65536) && !Client.lowMemory) {
										int_18 = 16711680;
									}

									Class31.font_p12full.method976("Mem:" + int_17 + "k", int_10 + widget_0.width,
											int_11, int_18, -1);
									int_11 += 15;
								}
								continue;
							}

							if (widget_0.contentType == 1337) {
								Client.anInt650 = int_10;
								Client.anInt651 = int_11;
								Class24.method216(int_10, int_11, widget_0.width, widget_0.height);
								Client.aBoolArray8[widget_0.boundsIndex] = true;
								Rasterizer2D.setDrawRegion(int_1, int_2, int_3, int_4);
								continue;
							}

							if (widget_0.contentType == 1338) {
								Class6.method105();
								final CacheableNode_Sub1 cacheablenode_sub1_0 = widget_0.method562(false);
								if (cacheablenode_sub1_0 != null) {
									Rasterizer2D.setDrawRegion(int_10, int_11, int_10 + cacheablenode_sub1_0.anInt498,
											int_11 + cacheablenode_sub1_0.anInt499);
									if ((Client.anInt701 != 2) && (Client.anInt701 != 5)) {
										int_17 = (Client.mapAngle + Client.mapScale) & 0x7FF;
										int_18 = (Script.localPlayer.anInt547 / 32) + 48;
										int_20 = 464 - (Script.localPlayer.anInt550 / 32);
										Enum4.aSpritePixels3.method923(int_10, int_11, cacheablenode_sub1_0.anInt498,
												cacheablenode_sub1_0.anInt499, int_18, int_20, int_17,
												Client.mapScaleDelta + 256, cacheablenode_sub1_0.anIntArray102,
												cacheablenode_sub1_0.anIntArray103);

										for (int_21 = 0; int_21 < Client.anInt711; int_21++) {
											int_22 = ((Client.anIntArray155[int_21] * 4) + 2)
													- (Script.localPlayer.anInt547 / 32);
											int_23 = ((Client.anIntArray156[int_21] * 4) + 2)
													- (Script.localPlayer.anInt550 / 32);
											ScriptVarType.drawDot(int_10, int_11, int_22, int_23,
													Client.aSpritePixelsArray4[int_21], cacheablenode_sub1_0);
										}

										int_21 = 0;

										while (true) {
											if (int_21 >= 104) {
												for (int_21 = 0; int_21 < Client.anInt690; int_21++) {
													final NPC npc_0 = Client.cachedNPCs[Client.npcIndices[int_21]];
													if ((npc_0 != null) && npc_0.hasConfig()) {
														NPCComposition npccomposition_0 = npc_0.composition;
														if ((npccomposition_0 != null)
																&& (npccomposition_0.configs != null)) {
															npccomposition_0 = npccomposition_0.transform();
														}

														if ((npccomposition_0 != null)
																&& npccomposition_0.isMinimapVisible
																&& npccomposition_0.aBool58) {
															int_24 = (npc_0.anInt547 / 32)
																	- (Script.localPlayer.anInt547 / 32);
															int_26 = (npc_0.anInt550 / 32)
																	- (Script.localPlayer.anInt550 / 32);
															ScriptVarType.drawDot(int_10, int_11, int_24, int_26,
																	AClass2.mapDots[1], cacheablenode_sub1_0);
														}
													}
												}

												int_21 = Class40.anInt94;
												final int[] ints_0 = Class40.anIntArray17;

												for (int_23 = 0; int_23 < int_21; int_23++) {
													final Player player_0 = Client.cachedPlayers[ints_0[int_23]];
													if ((player_0 != null) && player_0.hasConfig() && !player_0.hidden
															&& (player_0 != Script.localPlayer)) {
														int_26 = (player_0.anInt547 / 32)
																- (Script.localPlayer.anInt547 / 32);
														int_27 = (player_0.anInt550 / 32)
																- (Script.localPlayer.anInt550 / 32);
														boolean bool_3 = false;
														if (WorldMapType3.isFriended(player_0.name, true)) {
															bool_3 = true;
														}

														boolean bool_4 = false;

														for (int_29 = 0; int_29 < Signlink.clanChatCount; int_29++) {
															if (player_0.name.equals(
																	WorldMapData_Sub1.clanMembers[int_29].username)) {
																bool_4 = true;
																break;
															}
														}

														boolean bool_5 = false;
														if ((Script.localPlayer.team != 0) && (player_0.team != 0)
																&& (player_0.team == Script.localPlayer.team)) {
															bool_5 = true;
														}

														if (bool_3) {
															ScriptVarType.drawDot(int_10, int_11, int_26, int_27,
																	AClass2.mapDots[3], cacheablenode_sub1_0);
														} else if (bool_5) {
															ScriptVarType.drawDot(int_10, int_11, int_26, int_27,
																	AClass2.mapDots[4], cacheablenode_sub1_0);
														} else if (bool_4) {
															ScriptVarType.drawDot(int_10, int_11, int_26, int_27,
																	AClass2.mapDots[5], cacheablenode_sub1_0);
														} else {
															ScriptVarType.drawDot(int_10, int_11, int_26, int_27,
																	AClass2.mapDots[2], cacheablenode_sub1_0);
														}
													}
												}

												if ((Client.anInt667 != 0) && ((Client.gameCycle % 20) < 10)) {
													if ((Client.anInt667 == 1) && (Client.anInt669 >= 0)
															&& (Client.anInt669 < Client.cachedNPCs.length)) {
														final NPC npc_1 = Client.cachedNPCs[Client.anInt669];
														if (npc_1 != null) {
															int_24 = (npc_1.anInt547 / 32)
																	- (Script.localPlayer.anInt547 / 32);
															int_26 = (npc_1.anInt550 / 32)
																	- (Script.localPlayer.anInt550 / 32);
															Class26.method225(int_10, int_11, int_24, int_26,
																	Class24.aSpritePixelsArray1[1],
																	cacheablenode_sub1_0);
														}
													}

													if (Client.anInt667 == 2) {
														int_23 = (((Client.hintArrowX * 4) - (AClass2.baseX * 4)) + 2)
																- (Script.localPlayer.anInt547 / 32);
														int_24 = (((Client.hintArrowY * 4) - (AClass4_Sub1.baseY * 4))
																+ 2) - (Script.localPlayer.anInt550 / 32);
														Class26.method225(int_10, int_11, int_23, int_24,
																Class24.aSpritePixelsArray1[1], cacheablenode_sub1_0);
													}

													if ((Client.anInt667 == 10) && (Client.anInt671 >= 0)
															&& (Client.anInt671 < Client.cachedPlayers.length)) {
														final Player player_1 = Client.cachedPlayers[Client.anInt671];
														if (player_1 != null) {
															int_24 = (player_1.anInt547 / 32)
																	- (Script.localPlayer.anInt547 / 32);
															int_26 = (player_1.anInt550 / 32)
																	- (Script.localPlayer.anInt550 / 32);
															Class26.method225(int_10, int_11, int_24, int_26,
																	Class24.aSpritePixelsArray1[1],
																	cacheablenode_sub1_0);
														}
													}
												}

												if (Client.destinationX != 0) {
													int_23 = ((Client.destinationX * 4) + 2)
															- (Script.localPlayer.anInt547 / 32);
													int_24 = ((Client.destinationY * 4) + 2)
															- (Script.localPlayer.anInt550 / 32);
													ScriptVarType.drawDot(int_10, int_11, int_23, int_24,
															Class24.aSpritePixelsArray1[0], cacheablenode_sub1_0);
												}

												if (!Script.localPlayer.hidden) {
													Rasterizer2D.method853(
															(int_10 + (cacheablenode_sub1_0.anInt498 / 2)) - 1,
															(int_11 + (cacheablenode_sub1_0.anInt499 / 2)) - 1, 3, 3,
															16777215);
												}
												break;
											}

											for (int_22 = 0; int_22 < 104; int_22++) {
												final Deque deque_0 = Client.groundItemDeque[AClass1_Sub1.plane][int_21][int_22];
												if (deque_0 != null) {
													int_24 = ((4 * int_21) + 2) - (Script.localPlayer.anInt547 / 32);
													int_26 = ((4 * int_22) + 2) - (Script.localPlayer.anInt550 / 32);
													ScriptVarType.drawDot(int_10, int_11, int_24, int_26,
															AClass2.mapDots[0], cacheablenode_sub1_0);
												}
											}

											++int_21;
										}
									} else {
										Rasterizer2D.method860(int_10, int_11, 0, cacheablenode_sub1_0.anIntArray102,
												cacheablenode_sub1_0.anIntArray103);
									}

									Client.aBoolArray10[int_9] = true;
								}

								Rasterizer2D.setDrawRegion(int_1, int_2, int_3, int_4);
								continue;
							}

							if (widget_0.contentType == 1339) {
								Class4.method87(widget_0, int_10, int_11);
								Rasterizer2D.setDrawRegion(int_1, int_2, int_3, int_4);
								continue;
							}

							if (widget_0.contentType == 1400) {
								Class49.renderOverview.extractWorldmap(int_10, int_11, widget_0.width, widget_0.height,
										Client.gameCycle);
							}

							if (widget_0.contentType == 1401) {
								Class49.renderOverview.extractData(int_10, int_11, widget_0.width, widget_0.height);
							}
						}

						if (widget_0.type == 0) {
							if (!widget_0.hasScript && Class37.method250(widget_0)
									&& (widget_0 != XGrandExchangeOffer.aWidget3)) {
								continue;
							}

							if (!widget_0.hasScript) {
								if (widget_0.scrollY > (widget_0.scrollHeight - widget_0.height)) {
									widget_0.scrollY = widget_0.scrollHeight - widget_0.height;
								}

								if (widget_0.scrollY < 0) {
									widget_0.scrollY = 0;
								}
							}

							gameDraw(widgets_0, widget_0.anInt289, int_13, int_14, int_15, int_16,
									int_10 - widget_0.scrollX, int_11 - widget_0.scrollY, int_9);
							if (widget_0.children != null) {
								gameDraw(widget_0.children, widget_0.anInt289, int_13, int_14, int_15, int_16,
										int_10 - widget_0.scrollX, int_11 - widget_0.scrollY, int_9);
							}

							final WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable.get(widget_0.anInt289);
							if (widgetnode_0 != null) {
								VertexNormal.drawWidget(widgetnode_0.anInt392, int_13, int_14, int_15, int_16, int_10,
										int_11, int_9);
							}

							Rasterizer2D.setDrawRegion(int_1, int_2, int_3, int_4);
							Graphics3D.method898();
						}

						if (Client.isResized || Client.aBoolArray9[int_9] || (Client.gameDrawingMode > 1)) {
							if ((widget_0.type == 0) && !widget_0.hasScript
									&& (widget_0.scrollHeight > widget_0.height)) {
								Widget.method570(int_10 + widget_0.width, int_11, widget_0.scrollY, widget_0.height,
										widget_0.scrollHeight);
							}

							if (widget_0.type != 1) {
								int int_25;
								if (widget_0.type == 2) {
									int_19 = 0;

									for (int_17 = 0; int_17 < widget_0.anInt294; int_17++) {
										for (int_18 = 0; int_18 < widget_0.originalWidth; int_18++) {
											int_20 = int_10 + (int_18 * (widget_0.paddingX + 32));
											int_21 = int_11 + (int_17 * (widget_0.paddingY + 32));
											if (int_19 < 20) {
												int_20 += widget_0.xSprites[int_19];
												int_21 += widget_0.anIntArray70[int_19];
											}

											if (widget_0.itemIds[int_19] <= 0) {
												if ((widget_0.anIntArray68 != null) && (int_19 < 20)) {
													final SpritePixels spritepixels_2 = widget_0.method564(int_19);
													if (spritepixels_2 != null) {
														spritepixels_2.method916(int_20, int_21);
													} else if (Widget.aBool26) {
														Class15.method196(widget_0);
													}
												}
											} else {
												int_24 = widget_0.itemIds[int_19] - 1;
												if ((((int_20 + 32) > int_1) && (int_20 < int_3)
														&& ((int_21 + 32) > int_2) && (int_21 < int_4))
														|| ((widget_0 == Ignore.aWidget7)
																&& (int_19 == Client.anInt678))) {
													SpritePixels spritepixels_0;
													if ((Client.itemSelectionState == 1)
															&& (int_19 == Class49.selectedItemIndex)
															&& (widget_0.anInt289 == Class44.anInt101)) {
														spritepixels_0 = MilliTimer.createSprite(int_24,
																widget_0.itemQuantities[int_19], 2, 0, 2, false);
													} else {
														spritepixels_0 = MilliTimer.createSprite(int_24,
																widget_0.itemQuantities[int_19], 1, 3153952, 2, false);
													}

													if (spritepixels_0 != null) {
														if ((widget_0 == Ignore.aWidget7)
																&& (int_19 == Client.anInt678)) {
															int_22 = MouseInput.anInt278 - Client.anInt673;
															int_23 = MouseInput.anInt280 - Client.anInt675;
															if ((int_22 < 5) && (int_22 > -5)) {
																int_22 = 0;
															}

															if ((int_23 < 5) && (int_23 > -5)) {
																int_23 = 0;
															}

															if (Client.anInt663 < 5) {
																int_22 = 0;
																int_23 = 0;
															}

															spritepixels_0.method926(int_20 + int_22, int_23 + int_21,
																	128);
															if (int_0 != -1) {
																final Widget widget_1 = widgets_0[int_0 & 0xFFFF];
																if (((int_21 + int_23) < Rasterizer2D.drawingAreaTop)
																		&& (widget_1.scrollY > 0)) {
																	int_25 = ((Rasterizer2D.drawingAreaTop - int_21
																			- int_23) * Client.anInt662) / 3;
																	if (int_25 > (Client.anInt662 * 10)) {
																		int_25 = Client.anInt662 * 10;
																	}

																	if (int_25 > widget_1.scrollY) {
																		int_25 = widget_1.scrollY;
																	}

																	widget_1.scrollY -= int_25;
																	Client.anInt675 += int_25;
																	Class15.method196(widget_1);
																}

																if (((int_21 + int_23
																		+ 32) > Rasterizer2D.drawingAreaRight)
																		&& (widget_1.scrollY < (widget_1.scrollHeight
																				- widget_1.height))) {
																	int_25 = (((int_23 + int_21 + 32)
																			- Rasterizer2D.drawingAreaRight)
																			* Client.anInt662) / 3;
																	if (int_25 > (Client.anInt662 * 10)) {
																		int_25 = Client.anInt662 * 10;
																	}

																	if (int_25 > (widget_1.scrollHeight
																			- widget_1.height - widget_1.scrollY)) {
																		int_25 = widget_1.scrollHeight - widget_1.height
																				- widget_1.scrollY;
																	}

																	widget_1.scrollY += int_25;
																	Client.anInt675 -= int_25;
																	Class15.method196(widget_1);
																}
															}
														} else if ((widget_0 == Class1.aWidget1)
																&& (int_19 == Client.anInt680)) {
															spritepixels_0.method926(int_20, int_21, 128);
														} else {
															spritepixels_0.method916(int_20, int_21);
														}
													} else {
														Class15.method196(widget_0);
													}
												}
											}

											++int_19;
										}
									}
								} else if (widget_0.type == 3) {
									if (AbstractSoundSystem.method341(widget_0)) {
										int_19 = widget_0.anInt303;
										if ((widget_0 == XGrandExchangeOffer.aWidget3) && (widget_0.anInt307 != 0)) {
											int_19 = widget_0.anInt307;
										}
									} else {
										int_19 = widget_0.textColor;
										if ((widget_0 == XGrandExchangeOffer.aWidget3) && (widget_0.anInt305 != 0)) {
											int_19 = widget_0.anInt305;
										}
									}

									if (widget_0.aBool28) {
										switch (widget_0.anEnum9_1.anInt413) {
										case 1:
											Rasterizer2D.method862(int_10, int_11, widget_0.width, widget_0.height,
													widget_0.textColor, widget_0.anInt303,
													256 - (widget_0.opacity & 0xFF), 256 - (widget_0.anInt308 & 0xFF));
											break;
										case 2:
											Rasterizer2D.method863(int_10, int_11, widget_0.width, widget_0.height,
													widget_0.textColor, widget_0.anInt303,
													256 - (widget_0.opacity & 0xFF), 256 - (widget_0.anInt308 & 0xFF));
											break;
										case 3:
											Rasterizer2D.method865(int_10, int_11, widget_0.width, widget_0.height,
													widget_0.textColor, widget_0.anInt303,
													256 - (widget_0.opacity & 0xFF), 256 - (widget_0.anInt308 & 0xFF));
											break;
										case 4:
											Rasterizer2D.method864(int_10, int_11, widget_0.width, widget_0.height,
													widget_0.textColor, widget_0.anInt303,
													256 - (widget_0.opacity & 0xFF), 256 - (widget_0.anInt308 & 0xFF));
											break;
										default:
											if (int_12 == 0) {
												Rasterizer2D.method853(int_10, int_11, widget_0.width, widget_0.height,
														int_19);
											} else {
												Rasterizer2D.fillRectangle(int_10, int_11, widget_0.width,
														widget_0.height, int_19, 256 - (int_12 & 0xFF));
											}
										}
									} else if (int_12 == 0) {
										Rasterizer2D.drawRectangle(int_10, int_11, widget_0.width, widget_0.height,
												int_19);
									} else {
										Rasterizer2D.method861(int_10, int_11, widget_0.width, widget_0.height, int_19,
												256 - (int_12 & 0xFF));
									}
								} else {
									Font font_1;
									if (widget_0.type == 4) {
										font_1 = widget_0.method563();
										if (font_1 == null) {
											if (Widget.aBool26) {
												Class15.method196(widget_0);
											}
										} else {
											String string_3 = widget_0.text;
											if (AbstractSoundSystem.method341(widget_0)) {
												int_17 = widget_0.anInt303;
												if ((widget_0 == XGrandExchangeOffer.aWidget3)
														&& (widget_0.anInt307 != 0)) {
													int_17 = widget_0.anInt307;
												}

												if (widget_0.aString15.length() > 0) {
													string_3 = widget_0.aString15;
												}
											} else {
												int_17 = widget_0.textColor;
												if ((widget_0 == XGrandExchangeOffer.aWidget3)
														&& (widget_0.anInt305 != 0)) {
													int_17 = widget_0.anInt305;
												}
											}

											if (widget_0.hasScript && (widget_0.itemId != -1)) {
												final ItemComposition itemcomposition_1 = Class45
														.getItemDefinition(widget_0.itemId);
												string_3 = itemcomposition_1.name;
												if (string_3 == null) {
													string_3 = "null";
												}

												if (((itemcomposition_1.isStackable == 1)
														|| (widget_0.itemQuantity != 1))
														&& (widget_0.itemQuantity != -1)) {
													string_3 = Class6.getColTags(16748608) + string_3 + "</col>" + " "
															+ '\u0078' + Class19.method204(widget_0.itemQuantity);
												}
											}

											if (widget_0 == Client.aWidget12) {
												string_3 = "Please wait...";
												int_17 = widget_0.textColor;
											}

											if (!widget_0.hasScript) {
												string_3 = Class21.method209(string_3, widget_0);
											}

											font_1.method971(string_3, int_10, int_11, widget_0.width, widget_0.height,
													int_17, widget_0.textShadowed ? 0 : -1, widget_0.anInt310,
													widget_0.anInt311, widget_0.anInt312);
										}
									} else if (widget_0.type == 5) {
										SpritePixels spritepixels_1;
										if (!widget_0.hasScript) {
											spritepixels_1 = widget_0
													.method561(AbstractSoundSystem.method341(widget_0));
											if (spritepixels_1 != null) {
												spritepixels_1.method916(int_10, int_11);
											} else if (Widget.aBool26) {
												Class15.method196(widget_0);
											}
										} else {
											if (widget_0.itemId != -1) {
												spritepixels_1 = MilliTimer.createSprite(widget_0.itemId,
														widget_0.itemQuantity, widget_0.borderThickness,
														widget_0.sprite2, widget_0.anInt316, false);
											} else {
												spritepixels_1 = widget_0.method561(false);
											}

											if (spritepixels_1 == null) {
												if (Widget.aBool26) {
													Class15.method196(widget_0);
												}
											} else {
												int_17 = spritepixels_1.maxWidth;
												int_18 = spritepixels_1.maxHeight;
												if (!widget_0.aBool31) {
													int_20 = (widget_0.width * 4096) / int_17;
													if (widget_0.textureId != 0) {
														spritepixels_1.method925(int_10 + (widget_0.width / 2),
																int_11 + (widget_0.height / 2), widget_0.textureId,
																int_20);
													} else if (int_12 != 0) {
														spritepixels_1.method924(int_10, int_11, widget_0.width,
																widget_0.height, 256 - (int_12 & 0xFF));
													} else if ((int_17 == widget_0.width)
															&& (int_18 == widget_0.height)) {
														spritepixels_1.method916(int_10, int_11);
													} else {
														spritepixels_1.method912(int_10, int_11, widget_0.width,
																widget_0.height);
													}
												} else {
													Rasterizer2D.setInnerDrawRegion(int_10, int_11,
															int_10 + widget_0.width, int_11 + widget_0.height);
													int_20 = ((int_17 - 1) + widget_0.width) / int_17;
													int_21 = ((int_18 - 1) + widget_0.height) / int_18;

													for (int_22 = 0; int_22 < int_20; int_22++) {
														for (int_23 = 0; int_23 < int_21; int_23++) {
															if (widget_0.textureId != 0) {
																spritepixels_1.method925(
																		int_10 + (int_22 * int_17) + (int_17 / 2),
																		int_11 + (int_18 * int_23) + (int_18 / 2),
																		widget_0.textureId, 4096);
															} else if (int_12 != 0) {
																spritepixels_1.method926(int_10 + (int_17 * int_22),
																		int_11 + (int_18 * int_23),
																		256 - (int_12 & 0xFF));
															} else {
																spritepixels_1.method916(int_10 + (int_22 * int_17),
																		int_11 + (int_18 * int_23));
															}
														}
													}

													Rasterizer2D.setDrawRegion(int_1, int_2, int_3, int_4);
												}
											}
										}
									} else {
										ItemComposition itemcomposition_0;
										if (widget_0.type == 6) {
											final boolean bool_0 = AbstractSoundSystem.method341(widget_0);
											if (bool_0) {
												int_17 = widget_0.anInt296;
											} else {
												int_17 = widget_0.anInt295;
											}

											Model model_0 = null;
											int_20 = 0;
											if (widget_0.itemId != -1) {
												itemcomposition_0 = Class45.getItemDefinition(widget_0.itemId);
												if (itemcomposition_0 != null) {
													itemcomposition_0 = itemcomposition_0
															.method874(widget_0.itemQuantity);
													model_0 = itemcomposition_0.getModel(1);
													if (model_0 != null) {
														model_0.method942();
														int_20 = model_0.modelHeight / 2;
													} else {
														Class15.method196(widget_0);
													}
												}
											} else if (widget_0.modelType == 5) {
												if (widget_0.modelId == 0) {
													model_0 = Client.aPlayerComposition1.method481((Sequence) null, -1,
															(Sequence) null, -1);
												} else {
													model_0 = Script.localPlayer.getModel();
												}
											} else if (int_17 == -1) {
												model_0 = widget_0.method565((Sequence) null, -1, bool_0,
														Script.localPlayer.composition);
												if ((model_0 == null) && Widget.aBool26) {
													Class15.method196(widget_0);
												}
											} else {
												final Sequence sequence_0 = Class54.getAnimation(int_17);
												model_0 = widget_0.method565(sequence_0, widget_0.anInt301, bool_0,
														Script.localPlayer.composition);
												if ((model_0 == null) && Widget.aBool26) {
													Class15.method196(widget_0);
												}
											}

											Graphics3D.method908(int_10 + (widget_0.width / 2),
													int_11 + (widget_0.height / 2));
											int_21 = (Graphics3D.SINE[widget_0.rotationX] * widget_0.modelZoom) >> 16;
											int_22 = (Graphics3D.COSINE[widget_0.rotationX] * widget_0.modelZoom) >> 16;
											if (model_0 != null) {
												if (!widget_0.hasScript) {
													model_0.method962(0, widget_0.rotationZ, 0, widget_0.rotationX, 0,
															int_21, int_22);
												} else {
													model_0.method942();
													if (widget_0.aBool33) {
														model_0.method963(0, widget_0.rotationZ, widget_0.rotationY,
																widget_0.rotationX, widget_0.anInt313,
																widget_0.anInt314 + int_20 + int_21,
																int_22 + widget_0.anInt314, widget_0.modelZoom);
													} else {
														model_0.method962(0, widget_0.rotationZ, widget_0.rotationY,
																widget_0.rotationX, widget_0.anInt313,
																widget_0.anInt314 + int_21 + int_20,
																int_22 + widget_0.anInt314);
													}
												}
											}

											Graphics3D.method900();
										} else {
											if (widget_0.type == 7) {
												font_1 = widget_0.method563();
												if (font_1 == null) {
													if (Widget.aBool26) {
														Class15.method196(widget_0);
													}
													continue;
												}

												int_17 = 0;

												for (int_18 = 0; int_18 < widget_0.anInt294; int_18++) {
													for (int_20 = 0; int_20 < widget_0.originalWidth; int_20++) {
														if (widget_0.itemIds[int_17] > 0) {
															itemcomposition_0 = Class45
																	.getItemDefinition(widget_0.itemIds[int_17] - 1);
															String string_0;
															if ((itemcomposition_0.isStackable != 1)
																	&& (widget_0.itemQuantities[int_17] == 1)) {
																string_0 = Class6.getColTags(16748608)
																		+ itemcomposition_0.name + "</col>";
															} else {
																string_0 = Class6.getColTags(16748608)
																		+ itemcomposition_0.name + "</col>" + " "
																		+ '\u0078' + Class19.method204(
																				widget_0.itemQuantities[int_17]);
															}

															int_23 = (int_20 * (115 + widget_0.paddingX)) + int_10;
															int_24 = (int_18 * (12 + widget_0.paddingY)) + int_11;
															if (widget_0.anInt310 == 0) {
																font_1.method975(string_0, int_23, int_24,
																		widget_0.textColor,
																		widget_0.textShadowed ? 0 : -1);
															} else if (widget_0.anInt310 == 1) {
																font_1.method974(string_0,
																		int_23 + (widget_0.width / 2), int_24,
																		widget_0.textColor,
																		widget_0.textShadowed ? 0 : -1);
															} else {
																font_1.method976(string_0,
																		(int_23 + widget_0.width) - 1, int_24,
																		widget_0.textColor,
																		widget_0.textShadowed ? 0 : -1);
															}
														}

														++int_17;
													}
												}
											}

											if ((widget_0.type == 8) && (widget_0 == Class1.aWidget2)
													&& (Client.anInt706 == Client.anInt707)) {
												int_19 = 0;
												int_17 = 0;
												final Font font_0 = Class31.font_p12full;
												String string_1 = widget_0.text;

												String string_2;
												for (string_1 = Class21.method209(string_1, widget_0); string_1
														.length() > 0; int_17 += font_0.verticalSpace + 1) {
													int_22 = string_1.indexOf("<br>");
													if (int_22 != -1) {
														string_2 = string_1.substring(0, int_22);
														string_1 = string_1.substring(int_22 + 4);
													} else {
														string_2 = string_1;
														string_1 = "";
													}

													int_23 = font_0.method965(string_2);
													if (int_23 > int_19) {
														int_19 = int_23;
													}
												}

												int_19 += 6;
												int_17 += 7;
												int_22 = (int_10 + widget_0.width) - 5 - int_19;
												int_23 = int_11 + widget_0.height + 5;
												if (int_22 < (int_10 + 5)) {
													int_22 = int_10 + 5;
												}

												if ((int_19 + int_22) > int_3) {
													int_22 = int_3 - int_19;
												}

												if ((int_17 + int_23) > int_4) {
													int_23 = int_4 - int_17;
												}

												Rasterizer2D.method853(int_22, int_23, int_19, int_17, 16777120);
												Rasterizer2D.drawRectangle(int_22, int_23, int_19, int_17, 0);
												string_1 = widget_0.text;
												int_24 = int_23 + font_0.verticalSpace + 2;

												for (string_1 = Class21.method209(string_1, widget_0); string_1
														.length() > 0; int_24 += font_0.verticalSpace + 1) {
													int_26 = string_1.indexOf("<br>");
													if (int_26 != -1) {
														string_2 = string_1.substring(0, int_26);
														string_1 = string_1.substring(int_26 + 4);
													} else {
														string_2 = string_1;
														string_1 = "";
													}

													font_0.method975(string_2, int_22 + 3, int_24, 0, -1);
												}
											}

											if (widget_0.type == 9) {
												if (widget_0.aBool29) {
													int_19 = int_10;
													int_17 = int_11 + widget_0.height;
													int_18 = int_10 + widget_0.width;
													int_20 = int_11;
												} else {
													int_19 = int_10;
													int_17 = int_11;
													int_18 = int_10 + widget_0.width;
													int_20 = int_11 + widget_0.height;
												}

												if (widget_0.anInt309 == 1) {
													Rasterizer2D.drawLine(int_19, int_17, int_18, int_20,
															widget_0.textColor);
												} else {
													int_23 = widget_0.textColor;
													int_24 = widget_0.anInt309;
													int_26 = int_18 - int_19;
													int_27 = int_20 - int_17;
													int_25 = int_26 >= 0 ? int_26 : -int_26;
													final int int_28 = int_27 >= 0 ? int_27 : -int_27;
													int_29 = int_25;
													if (int_25 < int_28) {
														int_29 = int_28;
													}

													if (int_29 != 0) {
														int int_30 = (int_26 << 16) / int_29;
														int int_31 = (int_27 << 16) / int_29;
														if (int_31 <= int_30) {
															int_30 = -int_30;
														} else {
															int_31 = -int_31;
														}

														final int int_32 = (int_31 * int_24) >> 17;
														final int int_33 = ((int_24 * int_31) + 1) >> 17;
														final int int_34 = (int_24 * int_30) >> 17;
														final int int_35 = ((int_30 * int_24) + 1) >> 17;
														int_21 = int_19 - Rasterizer2D.draw_region_x;
														int_22 = int_17 - Rasterizer2D.drawingAreaTop;
														final int int_36 = int_32 + int_21;
														final int int_37 = int_21 - int_33;
														final int int_38 = (int_26 + int_21) - int_33;
														final int int_39 = int_32 + int_21 + int_26;
														final int int_40 = int_22 + int_34;
														final int int_41 = int_22 - int_35;
														final int int_42 = (int_22 + int_27) - int_35;
														final int int_43 = int_34 + int_27 + int_22;
														Graphics3D.setRasterClippingEnabled(int_36, int_37, int_38);
														Graphics3D.rasterFlat(int_40, int_41, int_42, int_36, int_37,
																int_38, int_23);
														Graphics3D.setRasterClippingEnabled(int_36, int_38, int_39);
														Graphics3D.rasterFlat(int_40, int_42, int_43, int_36, int_38,
																int_39, int_23);
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
			}
		}

	}

}
