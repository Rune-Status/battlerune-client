public final class Class8 {

	static Region region;
	// $FF: synthetic field
	final Class13 this$0;
	int anInt28;
	int anInt29;
	int anInt30;
	int anInt31;

	Class8(final Class13 class13_0) {
		this$0 = class13_0;
	}

	static void method118(final GameEngine gameengine_0) {
		int int_0;
		int int_4;
		int int_5;
		int int_6;
		if (Class26.worldSelectShown) {
			if ((MouseInput.anInt277 == 1) || (!Class14.aBool5 && (MouseInput.anInt277 == 4))) {
				int_0 = Class26.anInt79 + 280;
				if ((MouseInput.anInt282 >= int_0) && (MouseInput.anInt282 <= (int_0 + 14))
						&& (MouseInput.anInt283 >= 4) && (MouseInput.anInt283 <= 18)) {
					method119(0, 0);
					return;
				}

				if ((MouseInput.anInt282 >= (int_0 + 15)) && (MouseInput.anInt282 <= (int_0 + 80))
						&& (MouseInput.anInt283 >= 4) && (MouseInput.anInt283 <= 18)) {
					method119(0, 1);
					return;
				}

				int_4 = Class26.anInt79 + 390;
				if ((MouseInput.anInt282 >= int_4) && (MouseInput.anInt282 <= (int_4 + 14))
						&& (MouseInput.anInt283 >= 4) && (MouseInput.anInt283 <= 18)) {
					method119(1, 0);
					return;
				}

				if ((MouseInput.anInt282 >= (int_4 + 15)) && (MouseInput.anInt282 <= (int_4 + 80))
						&& (MouseInput.anInt283 >= 4) && (MouseInput.anInt283 <= 18)) {
					method119(1, 1);
					return;
				}

				int_5 = Class26.anInt79 + 500;
				if ((MouseInput.anInt282 >= int_5) && (MouseInput.anInt282 <= (int_5 + 14))
						&& (MouseInput.anInt283 >= 4) && (MouseInput.anInt283 <= 18)) {
					method119(2, 0);
					return;
				}

				if ((MouseInput.anInt282 >= (int_5 + 15)) && (MouseInput.anInt282 <= (int_5 + 80))
						&& (MouseInput.anInt283 >= 4) && (MouseInput.anInt283 <= 18)) {
					method119(2, 1);
					return;
				}

				int_6 = Class26.anInt79 + 610;
				if ((MouseInput.anInt282 >= int_6) && (MouseInput.anInt282 <= (int_6 + 14))
						&& (MouseInput.anInt283 >= 4) && (MouseInput.anInt283 <= 18)) {
					method119(3, 0);
					return;
				}

				if ((MouseInput.anInt282 >= (int_6 + 15)) && (MouseInput.anInt282 <= (int_6 + 80))
						&& (MouseInput.anInt283 >= 4) && (MouseInput.anInt283 <= 18)) {
					method119(3, 1);
					return;
				}

				if ((MouseInput.anInt282 >= (Class26.anInt79 + 708)) && (MouseInput.anInt283 >= 4)
						&& (MouseInput.anInt282 <= (Class26.anInt79 + 708 + 50)) && (MouseInput.anInt283 <= 20)) {
					Class26.worldSelectShown = false;
					XItemContainer.aSpritePixels4.method914(Class26.anInt79, 0);
					AClass4_Sub2.aSpritePixels5.method914(Class26.anInt79 + 382, 0);
					Class58.logoSprite.method886((Class26.anInt79 + 382) - (Class58.logoSprite.originalWidth / 2), 18);
					return;
				}

				if (Class26.anInt86 != -1) {
					final World world_0 = World.worldList[Class26.anInt86];
					Class12.method169(world_0);
					Class26.worldSelectShown = false;
					XItemContainer.aSpritePixels4.method914(Class26.anInt79, 0);
					AClass4_Sub2.aSpritePixels5.method914(Class26.anInt79 + 382, 0);
					Class58.logoSprite.method886((Class26.anInt79 + 382) - (Class58.logoSprite.originalWidth / 2), 18);
					return;
				}
			}

		} else {
			if (((MouseInput.anInt277 == 1) || (!Class14.aBool5 && (MouseInput.anInt277 == 4)))
					&& (MouseInput.anInt282 >= ((Class26.anInt79 + 765) - 50)) && (MouseInput.anInt283 >= 453)) {
				Class28.preferences.muted = !Class28.preferences.muted;
				PendingSpawn.method635();
				if (!Class28.preferences.muted) {
					FileOnDisk.method76(Class68.indexTrack1, "scape main", "", 255, false);
				} else {
					Class76.anAClass5_Sub3_1.method764();
					Class76.anInt186 = 1;
					Class76.anIndexDataBase3 = null;
				}
			}

			if (Client.gameState != 5) {
				++Class26.anInt84;
				if ((Client.gameState == 10) || (Client.gameState == 11)) {
					if (Client.languageId == 0) {
						if ((MouseInput.anInt277 == 1) || (!Class14.aBool5 && (MouseInput.anInt277 == 4))) {
							int_0 = Class26.anInt79 + 5;
							final short short_0 = 463;
							final byte byte_0 = 100;
							final byte byte_1 = 35;
							if ((MouseInput.anInt282 >= int_0) && (MouseInput.anInt282 <= (int_0 + byte_0))
									&& (MouseInput.anInt283 >= short_0)
									&& (MouseInput.anInt283 <= (byte_1 + short_0))) {
								World.method528();
								return;
							}
						}

						if (Class54.worldServersDownload != null) {
							World.method528();
						}
					}

					int_0 = MouseInput.anInt277;
					int_4 = MouseInput.anInt282;
					int_5 = MouseInput.anInt283;
					if (!Class14.aBool5 && (int_0 == 4)) {
						int_0 = 1;
					}

					int int_1;
					short short_1;
					if (Class26.loginIndex == 0) {
						boolean bool_0 = false;

						while (Class54.method329()) {
							if (KeyFocusListener.anInt130 == 84) {
								bool_0 = true;
							}
						}

						int_1 = (Class26.loginWindowX + 180) - 80;
						short_1 = 291;
						if ((int_0 == 1) && (int_4 >= (int_1 - 75)) && (int_4 <= (int_1 + 75))
								&& (int_5 >= (short_1 - 20)) && (int_5 <= (short_1 + 20))) {
							Class5.method91(WidgetNode.method647("secure", true)
									+ "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						int_1 = Class26.loginWindowX + 180 + 80;
						if (((int_0 == 1) && (int_4 >= (int_1 - 75)) && (int_4 <= (int_1 + 75))
								&& (int_5 >= (short_1 - 20)) && (int_5 <= (short_1 + 20))) || bool_0) {
							if ((Client.flags & 0x2000000) == 0) {
								if ((Client.flags & 0x4) != 0) {
									if ((Client.flags & 0x400) != 0) {
										Class26.loginMessage1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
										Class26.loginMessage2 = "Players can attack each other almost everywhere";
										Class26.loginMessage3 = "and the Protect Item prayer won\'t work.";
									} else {
										Class26.loginMessage1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
										Class26.loginMessage2 = "Players can attack each other";
										Class26.loginMessage3 = "almost everywhere.";
									}

									Class26.aString4 = "Warning!";
									Class26.loginIndex = 1;
									Class26.loginIndex2 = 0;
									return;
								}

								if ((Client.flags & 0x400) != 0) {
									Class26.loginMessage1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
									Class26.loginMessage2 = "The Protect Item prayer will";
									Class26.loginMessage3 = "not work on this world.";
									Class26.aString4 = "Warning!";
									Class26.loginIndex = 1;
									Class26.loginIndex2 = 0;
									return;
								}

								Class26.loginMessage1 = "";
								Class26.loginMessage2 = "Enter your username/email & password.";
								Class26.loginMessage3 = "";
								Class26.loginIndex = 2;
								Class26.loginIndex2 = 0;
								return;
							}

							Class26.aString4 = "";
							Class26.loginMessage1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
							Class26.loginMessage2 = "Your normal account will not be affected.";
							Class26.loginMessage3 = "";
							Class26.loginIndex = 1;
							Class26.loginIndex2 = 0;
						}
					} else {
						short short_3;

						if (Class26.loginIndex == 1) {
							while (Class54.method329()) {
								if (KeyFocusListener.anInt130 == 84) {
									Class26.loginMessage1 = "";
									Class26.loginMessage2 = "Enter your username/email & password.";
									Class26.loginMessage3 = "";
									Class26.loginIndex = 2;
									Class26.loginIndex2 = 0;
								} else if (KeyFocusListener.anInt130 == 13) {
									Class26.loginIndex = 0;
								}
							}

							int_6 = (Class26.loginWindowX + 180) - 80;
							short_3 = 321;
							if ((int_0 == 1) && (int_4 >= (int_6 - 75)) && (int_4 <= (int_6 + 75))
									&& (int_5 >= (short_3 - 20)) && (int_5 <= (short_3 + 20))) {
								Class26.loginMessage1 = "";
								Class26.loginMessage2 = "Enter your username/email & password.";
								Class26.loginMessage3 = "";
								Class26.loginIndex = 2;
								Class26.loginIndex2 = 0;
							}

							int_6 = Class26.loginWindowX + 180 + 80;
							if ((int_0 == 1) && (int_4 >= (int_6 - 75)) && (int_4 <= (int_6 + 75))
									&& (int_5 >= (short_3 - 20)) && (int_5 <= (short_3 + 20))) {
								Class26.loginIndex = 0;
							}

							return;
						}

						short short_2;
						if (Class26.loginIndex == 2) {
							short_2 = 231;
							int_6 = short_2 + 30;
							if ((int_0 == 1) && (int_5 >= (int_6 - 15)) && (int_5 < int_6)) {
								Class26.loginIndex2 = 0;
							}

							int_6 += 15;
							if ((int_0 == 1) && (int_5 >= (int_6 - 15)) && (int_5 < int_6)) {
								Class26.loginIndex2 = 1;
							}

							int_6 += 15;
							short_2 = 361;
							if ((int_0 == 1) && (int_5 >= (short_2 - 15)) && (int_5 < short_2)) {
								Class41.method261("Please enter your username.",
										"If you created your account after November",
										"2010, this will be the creation email address.");
								Class26.loginIndex = 5;
								return;
							}

							int_1 = (Class26.loginWindowX + 180) - 80;
							short_1 = 321;
							if ((int_0 == 1) && (int_4 >= (int_1 - 75)) && (int_4 <= (int_1 + 75))
									&& (int_5 >= (short_1 - 20)) && (int_5 <= (short_1 + 20))) {
								Class26.username = Class26.username.trim();
								if (Class26.username.length() == 0) {
									Class41.method261("", "Please enter your username/email address.", "");
									return;
								}

								if (Class26.password.length() == 0) {
									Class41.method261("", "Please enter your password.", "");
									return;
								}

								Class41.method261("", "Connecting to server...", "");
								Class26.anEnum3_1 = Class28.preferences.preferences
										.containsKey(Integer.valueOf(Enum6.method657(Class26.username)))
												? Enum3.anEnum3_2 : Enum3.anEnum3_4;
								WorldMapType2.setGameState(20);
								return;
							}

							int_1 = Class26.loginWindowX + 180 + 80;
							if ((int_0 == 1) && (int_4 >= (int_1 - 75)) && (int_4 <= (int_1 + 75))
									&& (int_5 >= (short_1 - 20)) && (int_5 <= (short_1 + 20))) {
								Class26.loginIndex = 0;
								Class26.username = "";
								Class26.password = "";
								Class44.authCodeForLogin = 0;
								WallObject.authCode = "";
								Class26.aBool7 = true;
							}

							while (true) {
								while (Class54.method329()) {
									boolean bool_2 = false;

									for (int int_3 = 0; int_3 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.length(); int_3++) {
										if (Class76.aChar1 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
												.charAt(int_3)) {
											bool_2 = true;
											break;
										}
									}

									if (KeyFocusListener.anInt130 == 13) {
										Class26.loginIndex = 0;
										Class26.username = "";
										Class26.password = "";
										Class44.authCodeForLogin = 0;
										WallObject.authCode = "";
										Class26.aBool7 = true;
									} else if (Class26.loginIndex2 == 0) {
										if ((KeyFocusListener.anInt130 == 85) && (Class26.username.length() > 0)) {
											Class26.username = Class26.username.substring(0,
													Class26.username.length() - 1);
										}

										if ((KeyFocusListener.anInt130 == 84) || (KeyFocusListener.anInt130 == 80)) {
											Class26.loginIndex2 = 1;
										}

										if (bool_2 && (Class26.username.length() < 320)) {
											Class26.username = Class26.username + Class76.aChar1;
										}
									} else if (Class26.loginIndex2 == 1) {
										if ((KeyFocusListener.anInt130 == 85) && (Class26.password.length() > 0)) {
											Class26.password = Class26.password.substring(0,
													Class26.password.length() - 1);
										}

										if ((KeyFocusListener.anInt130 == 84) || (KeyFocusListener.anInt130 == 80)) {
											Class26.loginIndex2 = 0;
										}

										if (KeyFocusListener.anInt130 == 84) {
											Class26.username = Class26.username.trim();
											if (Class26.username.length() == 0) {
												Class41.method261("", "Please enter your username/email address.", "");
												return;
											}

											if (Class26.password.length() == 0) {
												Class41.method261("", "Please enter your password.", "");
												return;
											}

											Class41.method261("", "Connecting to server...", "");
											Class26.anEnum3_1 = Class28.preferences.preferences
													.containsKey(Integer.valueOf(Enum6.method657(Class26.username)))
															? Enum3.anEnum3_2 : Enum3.anEnum3_4;
											WorldMapType2.setGameState(20);
											return;
										}

										if (bool_2 && (Class26.password.length() < 20)) {
											Class26.password = Class26.password + Class76.aChar1;
										}
									}
								}

								return;
							}
						}

						if (Class26.loginIndex == 3) {
							int_6 = Class26.loginWindowX + 180;
							short_3 = 276;
							if ((int_0 == 1) && (int_4 >= (int_6 - 75)) && (int_4 <= (int_6 + 75))
									&& (int_5 >= (short_3 - 20)) && (int_5 <= (short_3 + 20))) {
								Class26.loginMessage1 = "";
								Class26.loginMessage2 = "Enter your username/email & password.";
								Class26.loginMessage3 = "";
								Class26.loginIndex = 2;
								Class26.loginIndex2 = 0;
							}

							int_6 = Class26.loginWindowX + 180;
							short_3 = 326;
							if ((int_0 == 1) && (int_4 >= (int_6 - 75)) && (int_4 <= (int_6 + 75))
									&& (int_5 >= (short_3 - 20)) && (int_5 <= (short_3 + 20))) {
								Class41.method261("Please enter your username.",
										"If you created your account after November",
										"2010, this will be the creation email address.");
								Class26.loginIndex = 5;
								return;
							}

							return;
						}

						int int_2;
						boolean bool_1;
						if (Class26.loginIndex == 4) {
							int_6 = (Class26.loginWindowX + 180) - 80;
							short_3 = 321;
							if ((int_0 == 1) && (int_4 >= (int_6 - 75)) && (int_4 <= (int_6 + 75))
									&& (int_5 >= (short_3 - 20)) && (int_5 <= (short_3 + 20))) {
								WallObject.authCode.trim();
								if (WallObject.authCode.length() != 6) {
									Class41.method261("", "Please enter a 6-digit PIN.", "");
									return;
								}

								Class44.authCodeForLogin = Integer.parseInt(WallObject.authCode);
								WallObject.authCode = "";
								Class26.anEnum3_1 = Class26.aBool7 ? Enum3.anEnum3_3 : Enum3.anEnum3_5;
								Class41.method261("", "Connecting to server...", "");
								WorldMapType2.setGameState(20);
								return;
							}

							if ((int_0 == 1) && (int_4 >= ((Class26.loginWindowX + 180) - 9))
									&& (int_4 <= (Class26.loginWindowX + 180 + 130)) && (int_5 >= 263)
									&& (int_5 <= 296)) {
								Class26.aBool7 = !Class26.aBool7;
							}

							if ((int_0 == 1) && (int_4 >= ((Class26.loginWindowX + 180) - 34))
									&& (int_4 <= (Class26.loginWindowX + 180 + 34)) && (int_5 >= 351)
									&& (int_5 <= 363)) {
								Class5.method91(WidgetNode.method647("secure", true)
										+ "m=totp-authenticator/disableTOTPRequest", true, false);
							}

							int_6 = Class26.loginWindowX + 180 + 80;
							if ((int_0 == 1) && (int_4 >= (int_6 - 75)) && (int_4 <= (int_6 + 75))
									&& (int_5 >= (short_3 - 20)) && (int_5 <= (short_3 + 20))) {
								Class26.loginIndex = 0;
								Class26.username = "";
								Class26.password = "";
								Class44.authCodeForLogin = 0;
								WallObject.authCode = "";
							}

							while (Class54.method329()) {
								bool_1 = false;

								for (int_2 = 0; int_2 < "1234567890".length(); int_2++) {
									if (Class76.aChar1 == "1234567890".charAt(int_2)) {
										bool_1 = true;
										break;
									}
								}

								if (KeyFocusListener.anInt130 == 13) {
									Class26.loginIndex = 0;
									Class26.username = "";
									Class26.password = "";
									Class44.authCodeForLogin = 0;
									WallObject.authCode = "";
								} else {
									if ((KeyFocusListener.anInt130 == 85) && (WallObject.authCode.length() > 0)) {
										WallObject.authCode = WallObject.authCode.substring(0,
												WallObject.authCode.length() - 1);
									}

									if (KeyFocusListener.anInt130 == 84) {
										WallObject.authCode.trim();
										if (WallObject.authCode.length() != 6) {
											Class41.method261("", "Please enter a 6-digit PIN.", "");
											return;
										}

										Class44.authCodeForLogin = Integer.parseInt(WallObject.authCode);
										WallObject.authCode = "";
										Class26.anEnum3_1 = Class26.aBool7 ? Enum3.anEnum3_3 : Enum3.anEnum3_5;
										Class41.method261("", "Connecting to server...", "");
										WorldMapType2.setGameState(20);
										return;
									}

									if (bool_1 && (WallObject.authCode.length() < 6)) {
										WallObject.authCode = WallObject.authCode + Class76.aChar1;
									}
								}
							}

							return;
						}

						if (Class26.loginIndex == 5) {
							int_6 = (Class26.loginWindowX + 180) - 80;
							short_3 = 321;
							if ((int_0 == 1) && (int_4 >= (int_6 - 75)) && (int_4 <= (int_6 + 75))
									&& (int_5 >= (short_3 - 20)) && (int_5 <= (short_3 + 20))) {
								Class47.method275();
								return;
							}

							int_6 = Class26.loginWindowX + 180 + 80;
							if ((int_0 == 1) && (int_4 >= (int_6 - 75)) && (int_4 <= (int_6 + 75))
									&& (int_5 >= (short_3 - 20)) && (int_5 <= (short_3 + 20))) {
								Class26.loginMessage1 = "";
								Class26.loginMessage2 = "Enter your username/email & password.";
								Class26.loginMessage3 = "";
								Class26.loginIndex = 2;
								Class26.loginIndex2 = 0;
								Class26.password = "";
							}

							while (Class54.method329()) {
								bool_1 = false;

								for (int_2 = 0; int_2 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
										.length(); int_2++) {
									if (Class76.aChar1 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.charAt(int_2)) {
										bool_1 = true;
										break;
									}
								}

								if (KeyFocusListener.anInt130 == 13) {
									Class26.loginMessage1 = "";
									Class26.loginMessage2 = "Enter your username/email & password.";
									Class26.loginMessage3 = "";
									Class26.loginIndex = 2;
									Class26.loginIndex2 = 0;
									Class26.password = "";
								} else {
									if ((KeyFocusListener.anInt130 == 85) && (Class26.username.length() > 0)) {
										Class26.username = Class26.username.substring(0, Class26.username.length() - 1);
									}

									if (KeyFocusListener.anInt130 == 84) {
										Class47.method275();
										return;
									}

									if (bool_1 && (Class26.username.length() < 320)) {
										Class26.username = Class26.username + Class76.aChar1;
									}
								}
							}

							return;
						}

						if (Class26.loginIndex == 6) {
							while (true) {
								do {
									if (!Class54.method329()) {
										short_2 = 321;
										if ((int_0 == 1) && (int_5 >= (short_2 - 20)) && (int_5 <= (short_2 + 20))) {
											Class26.loginMessage1 = "";
											Class26.loginMessage2 = "Enter your username/email & password.";
											Class26.loginMessage3 = "";
											Class26.loginIndex = 2;
											Class26.loginIndex2 = 0;
											Class26.password = "";
											return;
										}

										return;
									}
								} while ((KeyFocusListener.anInt130 != 84) && (KeyFocusListener.anInt130 != 13));

								Class26.loginMessage1 = "";
								Class26.loginMessage2 = "Enter your username/email & password.";
								Class26.loginMessage3 = "";
								Class26.loginIndex = 2;
								Class26.loginIndex2 = 0;
								Class26.password = "";
							}
						}
					}

				}
			}
		}
	}

	static void method119(final int int_0, final int int_1) {
		final int[] ints_0 = new int[4];
		final int[] ints_1 = new int[4];
		ints_0[0] = int_0;
		ints_1[0] = int_1;
		int int_2 = 1;

		for (int int_3 = 0; int_3 < 4; int_3++) {
			if (World.anIntArray62[int_3] != int_0) {
				ints_0[int_2] = World.anIntArray62[int_3];
				ints_1[int_2] = World.anIntArray61[int_3];
				++int_2;
			}
		}

		World.anIntArray62 = ints_0;
		World.anIntArray61 = ints_1;
		PacketBuffer.method842(World.worldList, 0, World.worldList.length - 1, World.anIntArray62, World.anIntArray61);
	}

	static final void method120(final Class23 class23_0) {
		if (((Script.localPlayer.anInt547 >> 7) == Client.destinationX)
				&& ((Script.localPlayer.anInt550 >> 7) == Client.destinationY)) {
			Client.destinationX = 0;
		}

		final int int_0 = Class40.anInt94;
		final int[] ints_0 = Class40.anIntArray17;
		int int_1 = int_0;
		if ((Class23.aClass23_1 == class23_0) || (Class23.aClass23_2 == class23_0)) {
			int_1 = 1;
		}

		for (int int_2 = 0; int_2 < int_1; int_2++) {
			Player player_0;
			int int_3;
			if (Class23.aClass23_1 == class23_0) {
				player_0 = Script.localPlayer;
				int_3 = Script.localPlayer.anInt637 << 14;
			} else if (Class23.aClass23_2 == class23_0) {
				player_0 = Client.cachedPlayers[Client.anInt709];
				int_3 = Client.anInt709 << 14;
			} else {
				player_0 = Client.cachedPlayers[ints_0[int_2]];
				int_3 = ints_0[int_2] << 14;
				if ((Class23.aClass23_4 == class23_0) && (ints_0[int_2] == Client.anInt709)) {
					continue;
				}
			}

			if ((player_0 != null) && player_0.hasConfig() && !player_0.hidden) {
				player_0.aBool73 = false;
				if (((Client.lowMemory && (int_0 > 50)) || (int_0 > 200)) && (Class23.aClass23_1 != class23_0)
						&& (player_0.idlePoseAnimation == player_0.poseAnimation)) {
					player_0.aBool73 = true;
				}

				final int int_4 = player_0.anInt547 >> 7;
				final int int_5 = player_0.anInt550 >> 7;
				if ((int_4 >= 0) && (int_4 < 104) && (int_5 >= 0) && (int_5 < 104)) {
					if ((player_0.model != null) && (Client.gameCycle >= player_0.anInt630)
							&& (Client.gameCycle < player_0.anInt631)) {
						player_0.aBool73 = false;
						player_0.anInt635 = Actor.getTileHeight(player_0.anInt547, player_0.anInt550,
								AClass1_Sub1.plane);
						region.method358(AClass1_Sub1.plane, player_0.anInt547, player_0.anInt550, player_0.anInt635,
								60, player_0, player_0.angle, int_3, player_0.anInt638, player_0.anInt639,
								player_0.anInt640, player_0.anInt641);
					} else {
						if (((player_0.anInt547 & 0x7F) == 64) && ((player_0.anInt550 & 0x7F) == 64)) {
							if (Client.anIntArrayArray21[int_4][int_5] == Client.anInt699) {
								continue;
							}

							Client.anIntArrayArray21[int_4][int_5] = Client.anInt699;
						}

						player_0.anInt635 = Actor.getTileHeight(player_0.anInt547, player_0.anInt550,
								AClass1_Sub1.plane);
						region.method356(AClass1_Sub1.plane, player_0.anInt547, player_0.anInt550, player_0.anInt635,
								60, player_0, player_0.angle, int_3, player_0.aBool61);
					}
				}
			}
		}

	}

}
