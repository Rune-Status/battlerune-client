final class Class44 implements Interface1 {

	static IndexData indexWorldMap;
	static int anInt101;
	static int authCodeForLogin;

	static final boolean method265(final Model model_0, final int int_0, final int int_1, final int int_2) {
		if (!Class2.method79()) {
			return false;
		} else {
			RuntimeException_Sub1.method893();
			final int int_3 = model_0.anInt597 + int_0;
			final int int_4 = int_1 + model_0.anInt601;
			final int int_5 = int_2 + model_0.anInt603;
			final int int_6 = model_0.anInt594;
			final int int_7 = model_0.anInt602;
			final int int_8 = model_0.anInt605;
			final int int_9 = Class56.anInt146 - int_3;
			final int int_10 = Class56.anInt147 - int_4;
			final int int_11 = Class32.anInt91 - int_5;
			return Math.abs(int_9) > (int_6 + FileOnDisk.anInt15) ? false
					: (Math.abs(int_10) > (int_7 + Class56.anInt148) ? false
							: (Math.abs(int_11) > (int_8 + Class56.anInt149) ? false
									: (Math.abs((int_11 * Class22.anInt75) - (int_10 * Class67.anInt170)) > ((int_7
											* Class56.anInt149) + (int_8 * Class56.anInt148))
													? false
													: (Math.abs((int_9 * Class67.anInt170)
															- (int_11 * FileRequest.anInt477)) > ((int_6
																	* Class56.anInt149) + (int_8 * FileOnDisk.anInt15))
																			? false
																			: Math.abs((int_10 * FileRequest.anInt477)
																					- (int_9 * Class22.anInt75)) <= ((int_6
																							* Class56.anInt148) + (int_7
																									* FileOnDisk.anInt15))))));
		}
	}

	static final void method266(final int int_0) {
		Class46.method270();

		for (Node_Sub1 node_sub1_0 = (Node_Sub1) Node_Sub1.aDeque3
				.getFront(); node_sub1_0 != null; node_sub1_0 = (Node_Sub1) Node_Sub1.aDeque3.getNext()) {
			if (node_sub1_0.anObjectComposition1 != null) {
				node_sub1_0.method608();
			}
		}

		final int int_1 = Class65.method396(int_0).configType;
		if (int_1 != 0) {
			final int int_2 = Class86.widgetSettings[int_0];
			if (int_1 == 1) {
				if (int_2 == 1) {
					Graphics3D.setBrightness(0.9D);
					((TextureProvider) Graphics3D.textureLoader).brightness(0.9D);
				}

				if (int_2 == 2) {
					Graphics3D.setBrightness(0.8D);
					((TextureProvider) Graphics3D.textureLoader).brightness(0.8D);
				}

				if (int_2 == 3) {
					Graphics3D.setBrightness(0.7D);
					((TextureProvider) Graphics3D.textureLoader).brightness(0.7D);
				}

				if (int_2 == 4) {
					Graphics3D.setBrightness(0.6D);
					((TextureProvider) Graphics3D.textureLoader).brightness(0.6D);
				}

				ItemComposition.itemSpriteCache.reset();
			}

			if (int_1 == 3) {
				short short_0 = 0;
				if (int_2 == 0) {
					short_0 = 255;
				}

				if (int_2 == 1) {
					short_0 = 192;
				}

				if (int_2 == 2) {
					short_0 = 128;
				}

				if (int_2 == 3) {
					short_0 = 64;
				}

				if (int_2 == 4) {
					short_0 = 0;
				}

				if (short_0 != Client.anInt713) {
					if ((Client.anInt713 == 0) && (Client.anInt666 != -1)) {
						Friend.method503(Class68.indexTrack1, Client.anInt666, 0, short_0, false);
						Client.aBool80 = false;
					} else if (short_0 == 0) {
						Class76.anAClass5_Sub3_1.method764();
						Class76.anInt186 = 1;
						Class76.anIndexDataBase3 = null;
						Client.aBool80 = false;
					} else if (Class76.anInt186 != 0) {
						Class76.anInt188 = short_0;
					} else {
						Class76.anAClass5_Sub3_1.method781(short_0);
					}

					Client.anInt713 = short_0;
				}
			}

			if (int_1 == 4) {
				if (int_2 == 0) {
					Client.anInt698 = 127;
				}

				if (int_2 == 1) {
					Client.anInt698 = 96;
				}

				if (int_2 == 2) {
					Client.anInt698 = 64;
				}

				if (int_2 == 3) {
					Client.anInt698 = 32;
				}

				if (int_2 == 4) {
					Client.anInt698 = 0;
				}
			}

			if (int_1 == 5) {
				Client.anInt655 = int_2;
			}

			if (int_1 == 6) {
				Client.anInt731 = int_2;
			}

			if (int_1 == 9) {
				Client.anInt733 = int_2;
			}

			if (int_1 == 10) {
				if (int_2 == 0) {
					Client.anInt684 = 127;
				}

				if (int_2 == 1) {
					Client.anInt684 = 96;
				}

				if (int_2 == 2) {
					Client.anInt684 = 64;
				}

				if (int_2 == 3) {
					Client.anInt684 = 32;
				}

				if (int_2 == 4) {
					Client.anInt684 = 0;
				}
			}

			if (int_1 == 17) {
				Client.anInt740 = int_2 & 0xFFFF;
			}

			Enum2[] enum2s_0;
			if (int_1 == 18) {
				enum2s_0 = new Enum2[] { Enum2.anEnum2_1, Enum2.anEnum2_3, Enum2.anEnum2_2, Enum2.anEnum2_4 };
				Client.anEnum2_5 = (Enum2) PendingSpawn.forOrdinal(enum2s_0, int_2);
				if (Client.anEnum2_5 == null) {
					Client.anEnum2_5 = Enum2.anEnum2_1;
				}
			}

			if (int_1 == 19) {
				if (int_2 == -1) {
					Client.anInt709 = -1;
				} else {
					Client.anInt709 = int_2 & 0x7FF;
				}
			}

			if (int_1 == 22) {
				enum2s_0 = new Enum2[] { Enum2.anEnum2_1, Enum2.anEnum2_3, Enum2.anEnum2_2, Enum2.anEnum2_4 };
				Client.anEnum2_6 = (Enum2) PendingSpawn.forOrdinal(enum2s_0, int_2);
				if (Client.anEnum2_6 == null) {
					Client.anEnum2_6 = Enum2.anEnum2_1;
					return;
				}
			}

		}
	}

	static void method267() {
		Client.aLong25 = -1L;
		Client.anInt661 = -1;
		KeyFocusListener.aClass21_1.anInt74 = 0;
		Class36.aBool9 = true;
		Client.aBool82 = true;
		Client.aLong28 = -1L;
		FloorUnderlayDefinition.method841();
		Client.secretPacketBuffer1.offset = 0;
		Client.secretPacketBuffer2.offset = 0;
		Client.packetType = -1;
		Client.lastFrameId = -1;
		Client.secondLastFrameId = -1;
		Client.thridLastFrameId = -1;
		Client.anInt687 = 0;
		Client.anInt644 = 0;
		Client.anInt646 = 0;
		Client.anInt667 = 0;
		Client.menuOptionCount = 0;
		Client.anInt654 = -1;
		Client.isMenuOpen = false;
		MouseInput.mouseIdleTicks = 0;
		Class53.method323();
		Client.itemSelectionState = 0;
		Client.spellSelected = false;
		Client.anInt700 = 0;
		Client.anInt714 = (int) (Math.random() * 100.0D) - 50;
		Client.anInt720 = (int) (Math.random() * 110.0D) - 55;
		Client.anInt723 = (int) (Math.random() * 80.0D) - 40;
		Client.mapScale = (int) (Math.random() * 120.0D) - 60;
		Client.mapScaleDelta = (int) (Math.random() * 30.0D) - 20;
		Client.mapAngle = ((int) (Math.random() * 20.0D) - 10) & 0x7FF;
		Client.anInt701 = 0;
		Client.anInt722 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.anEnum2_5 = Enum2.anEnum2_4;
		Client.anEnum2_6 = Enum2.anEnum2_4;
		Client.anInt690 = 0;
		Class40.anInt94 = 0;

		int int_0;
		for (int_0 = 0; int_0 < 2048; int_0++) {
			Class40.aBufferArray1[int_0] = null;
			Class40.aByteArray5[int_0] = 1;
		}

		for (int_0 = 0; int_0 < 2048; int_0++) {
			Client.cachedPlayers[int_0] = null;
		}

		for (int_0 = 0; int_0 < 32768; int_0++) {
			Client.cachedNPCs[int_0] = null;
		}

		Client.anInt709 = -1;
		Client.projectiles.clear();
		Client.graphicsObjectDeque.clear();

		int int_2;
		for (int_0 = 0; int_0 < 4; int_0++) {
			for (int int_1 = 0; int_1 < 104; int_1++) {
				for (int_2 = 0; int_2 < 104; int_2++) {
					Client.groundItemDeque[int_0][int_1][int_2] = null;
				}
			}
		}

		Client.pendingSpawns = new Deque();
		Client.anInt696 = 0;
		Client.friendCount = 0;
		Client.ignoreCount = 0;

		for (int_0 = 0; int_0 < VarPlayerType.anInt537; int_0++) {
			final VarPlayerType varplayertype_0 = Class65.method396(int_0);
			if (varplayertype_0 != null) {
				Class86.settings[int_0] = 0;
				Class86.widgetSettings[int_0] = 0;
			}
		}

		Class6.chatMessages.reset();
		Client.anInt740 = -1;
		if (Client.widgetRoot != -1) {
			int_0 = Client.widgetRoot;
			if ((int_0 != -1) && Widget.validInterfaces[int_0]) {
				Class49.widgetIndex.method441(int_0);
				if (Widget.widgets[int_0] != null) {
					boolean bool_0 = true;

					for (int_2 = 0; int_2 < Widget.widgets[int_0].length; int_2++) {
						if (Widget.widgets[int_0][int_2] != null) {
							if (Widget.widgets[int_0][int_2].type != 2) {
								Widget.widgets[int_0][int_2] = null;
							} else {
								bool_0 = false;
							}
						}
					}

					if (bool_0) {
						Widget.widgets[int_0] = null;
					}

					Widget.validInterfaces[int_0] = false;
				}
			}
		}

		for (WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable
				.method515(); widgetnode_0 != null; widgetnode_0 = (WidgetNode) Client.componentTable.method516()) {
			MilliTimer.method690(widgetnode_0, true);
		}

		Client.widgetRoot = -1;
		Client.componentTable = new XHashTable(8);
		Client.aWidget12 = null;
		Client.menuOptionCount = 0;
		Client.anInt654 = -1;
		Client.isMenuOpen = false;
		Client.aPlayerComposition1.method480((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);

		for (int_0 = 0; int_0 < 8; int_0++) {
			Client.playerOptions[int_0] = null;
			Client.playerOptionsPriorities[int_0] = false;
		}

		XItemContainer.itemContainers = new XHashTable(32);
		Client.aBool81 = true;

		for (int_0 = 0; int_0 < 100; int_0++) {
			Client.aBoolArray8[int_0] = true;
		}

		Class11.method166();
		Client.clanChatOwner = null;
		Signlink.clanChatCount = 0;
		WorldMapData_Sub1.clanMembers = null;

		for (int_0 = 0; int_0 < 8; int_0++) {
			Client.grandExchangeOffers[int_0] = new XGrandExchangeOffer();
		}

		XClanMember.aClass39_1 = null;
	}

}
