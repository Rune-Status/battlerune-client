public class XClanMember extends Node {

	static ModIcon[] titlemuteSprite;
	static Class39 aClass39_1;
	String aString17;
	String username;
	int world;
	byte rank;

	public static boolean method572(final int int_0) {
		return ((int_0 >= Enum4.anEnum4_1.anInt396) && (int_0 <= Enum4.anEnum4_4.anInt396))
				|| (int_0 == Enum4.anEnum4_5.anInt396);
	}

	static void drawLoginScreen(final Font font_0, final Font font_1, final Font font_2, final boolean bool_0) {
		if (bool_0) {
			Class26.anInt79 = (Class25.canvasWidth - 765) / 2;
			Class26.loginWindowX = Class26.anInt79 + 202;
		}

		byte byte_0;
		int int_0;
		int int_1;
		int int_2;
		int int_3;
		int int_4;
		int int_5;
		int int_10;
		int int_11;
		int int_12;
		int int_13;
		if (Class26.worldSelectShown) {
			if (Class26.aSpritePixelsArray2 == null) {
				Class26.aSpritePixelsArray2 = WorldMapType1.method549(Class50.indexSprites, "sl_back", "");
			}

			if (Class26.aModIconArray3 == null) {
				Class26.aModIconArray3 = Class98.method494(Class50.indexSprites, "sl_flags", "");
			}

			if (Class63.aModIconArray4 == null) {
				Class63.aModIconArray4 = Class98.method494(Class50.indexSprites, "sl_arrows", "");
			}

			if (AClass4_Sub1.aModIconArray7 == null) {
				AClass4_Sub1.aModIconArray7 = Class98.method494(Class50.indexSprites, "sl_stars", "");
			}

			Rasterizer2D.method853(Class26.anInt79, 23, 765, 480, 0);
			Rasterizer2D.method859(Class26.anInt79, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.method859(Class26.anInt79 + 125, 0, 640, 23, 5197647, 2697513);
			font_0.method974("Select a world", Class26.anInt79 + 62, 15, 0, -1);
			if (AClass4_Sub1.aModIconArray7 != null) {
				AClass4_Sub1.aModIconArray7[1].method886(Class26.anInt79 + 140, 1);
				font_1.method975("Members only world", Class26.anInt79 + 152, 10, 16777215, -1);
				AClass4_Sub1.aModIconArray7[0].method886(Class26.anInt79 + 140, 12);
				font_1.method975("Free world", Class26.anInt79 + 152, 21, 16777215, -1);
			}

			if (Class63.aModIconArray4 != null) {
				int_10 = Class26.anInt79 + 280;
				if ((World.anIntArray62[0] == 0) && (World.anIntArray61[0] == 0)) {
					Class63.aModIconArray4[2].method886(int_10, 4);
				} else {
					Class63.aModIconArray4[0].method886(int_10, 4);
				}

				if ((World.anIntArray62[0] == 0) && (World.anIntArray61[0] == 1)) {
					Class63.aModIconArray4[3].method886(int_10 + 15, 4);
				} else {
					Class63.aModIconArray4[1].method886(int_10 + 15, 4);
				}

				font_0.method975("World", int_10 + 32, 17, 16777215, -1);
				int_0 = Class26.anInt79 + 390;
				if ((World.anIntArray62[0] == 1) && (World.anIntArray61[0] == 0)) {
					Class63.aModIconArray4[2].method886(int_0, 4);
				} else {
					Class63.aModIconArray4[0].method886(int_0, 4);
				}

				if ((World.anIntArray62[0] == 1) && (World.anIntArray61[0] == 1)) {
					Class63.aModIconArray4[3].method886(int_0 + 15, 4);
				} else {
					Class63.aModIconArray4[1].method886(int_0 + 15, 4);
				}

				font_0.method975("Players", int_0 + 32, 17, 16777215, -1);
				int_11 = Class26.anInt79 + 500;
				if ((World.anIntArray62[0] == 2) && (World.anIntArray61[0] == 0)) {
					Class63.aModIconArray4[2].method886(int_11, 4);
				} else {
					Class63.aModIconArray4[0].method886(int_11, 4);
				}

				if ((World.anIntArray62[0] == 2) && (World.anIntArray61[0] == 1)) {
					Class63.aModIconArray4[3].method886(int_11 + 15, 4);
				} else {
					Class63.aModIconArray4[1].method886(int_11 + 15, 4);
				}

				font_0.method975("Location", int_11 + 32, 17, 16777215, -1);
				int_1 = Class26.anInt79 + 610;
				if ((World.anIntArray62[0] == 3) && (World.anIntArray61[0] == 0)) {
					Class63.aModIconArray4[2].method886(int_1, 4);
				} else {
					Class63.aModIconArray4[0].method886(int_1, 4);
				}

				if ((World.anIntArray62[0] == 3) && (World.anIntArray61[0] == 1)) {
					Class63.aModIconArray4[3].method886(int_1 + 15, 4);
				} else {
					Class63.aModIconArray4[1].method886(int_1 + 15, 4);
				}

				font_0.method975("Type", int_1 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.method853(Class26.anInt79 + 708, 4, 50, 16, 0);
			font_1.method974("Cancel", Class26.anInt79 + 708 + 25, 16, 16777215, -1);
			Class26.anInt86 = -1;
			if (Class26.aSpritePixelsArray2 != null) {
				byte_0 = 88;
				final byte byte_4 = 19;
				int_11 = 765 / (byte_0 + 1);
				int_1 = 480 / (byte_4 + 1);

				do {
					int_12 = int_1;
					int_13 = int_11;
					if (((int_11 - 1) * int_1) >= World.worldCount) {
						--int_11;
					}

					if (((int_1 - 1) * int_11) >= World.worldCount) {
						--int_1;
					}

					if (((int_1 - 1) * int_11) >= World.worldCount) {
						--int_1;
					}
				} while ((int_12 != int_1) || (int_11 != int_13));

				int_12 = (765 - (byte_0 * int_11)) / (int_11 + 1);
				if (int_12 > 5) {
					int_12 = 5;
				}

				int_13 = (480 - (byte_4 * int_1)) / (int_1 + 1);
				if (int_13 > 5) {
					int_13 = 5;
				}

				int_2 = (765 - (int_11 * byte_0) - ((int_11 - 1) * int_12)) / 2;
				int_3 = (480 - (int_1 * byte_4) - ((int_1 - 1) * int_13)) / 2;
				int_4 = int_3 + 23;
				int_5 = int_2 + Class26.anInt79;
				int int_6 = 0;
				boolean bool_1 = false;

				int int_7;
				for (int_7 = 0; int_7 < World.worldCount; int_7++) {
					final World world_0 = World.worldList[int_7];
					boolean bool_2 = true;
					String string_1 = Integer.toString(world_0.playerCount);
					if (world_0.playerCount == -1) {
						string_1 = "OFF";
						bool_2 = false;
					} else if (world_0.playerCount > 1980) {
						string_1 = "FULL";
						bool_2 = false;
					}

					int int_8 = 0;
					byte byte_1;
					if (world_0.method520()) {
						if (world_0.method519()) {
							byte_1 = 7;
						} else {
							byte_1 = 6;
						}
					} else if (world_0.method521()) {
						int_8 = 16711680;
						if (world_0.method519()) {
							byte_1 = 5;
						} else {
							byte_1 = 4;
						}
					} else if (world_0.method522()) {
						if (world_0.method519()) {
							byte_1 = 3;
						} else {
							byte_1 = 2;
						}
					} else if (world_0.method519()) {
						byte_1 = 1;
					} else {
						byte_1 = 0;
					}

					if ((MouseInput.anInt278 >= int_5) && (MouseInput.anInt280 >= int_4)
							&& (MouseInput.anInt278 < (byte_0 + int_5)) && (MouseInput.anInt280 < (byte_4 + int_4))
							&& bool_2) {
						Class26.anInt86 = int_7;
						Class26.aSpritePixelsArray2[byte_1].method930(int_5, int_4, 128, 16777215);
						bool_1 = true;
					} else {
						Class26.aSpritePixelsArray2[byte_1].method914(int_5, int_4);
					}

					if (Class26.aModIconArray3 != null) {
						Class26.aModIconArray3[(world_0.method519() ? 8 : 0) + world_0.location].method886(int_5 + 29,
								int_4);
					}

					font_0.method974(Integer.toString(world_0.anInt227), int_5 + 15, int_4 + (byte_4 / 2) + 5, int_8,
							-1);
					font_1.method974(string_1, int_5 + 60, int_4 + (byte_4 / 2) + 5, 268435455, -1);
					int_4 += byte_4 + int_13;
					++int_6;
					if (int_6 >= int_1) {
						int_4 = int_3 + 23;
						int_5 += byte_0 + int_12;
						int_6 = 0;
					}
				}

				if (bool_1) {
					int_7 = font_1.method965(World.worldList[Class26.anInt86].activity) + 6;
					final int int_9 = font_1.verticalSpace + 8;
					Rasterizer2D.method853(MouseInput.anInt278 - (int_7 / 2), MouseInput.anInt280 + 20 + 5, int_7,
							int_9, 16777120);
					Rasterizer2D.drawRectangle(MouseInput.anInt278 - (int_7 / 2), MouseInput.anInt280 + 20 + 5, int_7,
							int_9, 0);
					font_1.method974(World.worldList[Class26.anInt86].activity, MouseInput.anInt278,
							20 + MouseInput.anInt280 + 5 + font_1.verticalSpace + 4, 0, -1);
				}
			}

			GZipDecompressor.aBufferProvider1.method474(0, 0);
		} else {
			if (bool_0) {
				XItemContainer.aSpritePixels4.method914(Class26.anInt79, 0);
				AClass4_Sub2.aSpritePixels5.method914(Class26.anInt79 + 382, 0);
				Class58.logoSprite.method886((Class26.anInt79 + 382) - (Class58.logoSprite.originalWidth / 2), 18);
			}

			if ((Client.gameState == 0) || (Client.gameState == 5)) {
				byte_0 = 20;
				font_0.method974("RuneScape is loading - please wait...", Class26.loginWindowX + 180, 245 - byte_0,
						16777215, -1);
				int_0 = 253 - byte_0;
				Rasterizer2D.drawRectangle((Class26.loginWindowX + 180) - 152, int_0, 304, 34, 9179409);
				Rasterizer2D.drawRectangle((Class26.loginWindowX + 180) - 151, int_0 + 1, 302, 32, 0);
				Rasterizer2D.method853((Class26.loginWindowX + 180) - 150, int_0 + 2, Class26.loadingBarPercentage * 3,
						30, 9179409);
				Rasterizer2D.method853(((Class26.loginWindowX + 180) - 150) + (Class26.loadingBarPercentage * 3),
						int_0 + 2, 300 - (Class26.loadingBarPercentage * 3), 30, 0);
				font_0.method974(Class26.loadingText, Class26.loginWindowX + 180, 276 - byte_0, 16777215, -1);
			}

			String string_0;
			short short_3;
			short short_4;
			if (Client.gameState == 20) {
				Class26.aModIcon1.method886((Class26.loginWindowX + 180) - (Class26.aModIcon1.originalWidth / 2),
						271 - (Class26.aModIcon1.height / 2));
				short_3 = 211;
				font_0.method974(Class26.loginMessage1, Class26.loginWindowX + 180, short_3, 16776960, 0);
				int_10 = short_3 + 15;
				font_0.method974(Class26.loginMessage2, Class26.loginWindowX + 180, int_10, 16776960, 0);
				int_10 += 15;
				font_0.method974(Class26.loginMessage3, Class26.loginWindowX + 180, int_10, 16776960, 0);
				int_10 += 15;
				int_10 += 10;
				if (Class26.loginIndex != 4) {
					font_0.method975("Login: ", (Class26.loginWindowX + 180) - 110, int_10, 16777215, 0);
					short_4 = 200;

					for (string_0 = Class26.username; font_0.method965(string_0) > short_4; string_0 = string_0
							.substring(0, string_0.length() - 1)) {
						;
					}

					font_0.method975(FontTypeFace.appendTags(string_0), (Class26.loginWindowX + 180) - 70, int_10,
							16777215, 0);
					int_10 += 15;
					font_0.method975("Password: " + Class82.method464(Class26.password),
							(Class26.loginWindowX + 180) - 108, int_10, 16777215, 0);
					int_10 += 15;
				}
			}

			if ((Client.gameState == 10) || (Client.gameState == 11)) {
				Class26.aModIcon1.method886(Class26.loginWindowX, 171);
				short short_0;
				if (Class26.loginIndex == 0) {
					short_3 = 251;
					font_0.method974("Welcome to RuneScape", Class26.loginWindowX + 180, short_3, 16776960, 0);
					int_10 = short_3 + 30;
					int_0 = (Class26.loginWindowX + 180) - 80;
					short_0 = 291;
					AClass5_Sub4.aModIcon5.method886(int_0 - 73, short_0 - 20);
					font_0.method971("New User", int_0 - 73, short_0 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					int_0 = Class26.loginWindowX + 180 + 80;
					AClass5_Sub4.aModIcon5.method886(int_0 - 73, short_0 - 20);
					font_0.method971("Existing User", int_0 - 73, short_0 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Class26.loginIndex == 1) {
					font_0.method974(Class26.aString4, Class26.loginWindowX + 180, 211, 16776960, 0);
					short_3 = 236;
					font_0.method974(Class26.loginMessage1, Class26.loginWindowX + 180, short_3, 16777215, 0);
					int_10 = short_3 + 15;
					font_0.method974(Class26.loginMessage2, Class26.loginWindowX + 180, int_10, 16777215, 0);
					int_10 += 15;
					font_0.method974(Class26.loginMessage3, Class26.loginWindowX + 180, int_10, 16777215, 0);
					int_10 += 15;
					int_0 = (Class26.loginWindowX + 180) - 80;
					short_0 = 321;
					AClass5_Sub4.aModIcon5.method886(int_0 - 73, short_0 - 20);
					font_0.method974("Continue", int_0, short_0 + 5, 16777215, 0);
					int_0 = Class26.loginWindowX + 180 + 80;
					AClass5_Sub4.aModIcon5.method886(int_0 - 73, short_0 - 20);
					font_0.method974("Cancel", int_0, short_0 + 5, 16777215, 0);
				} else {
					short short_1;
					if (Class26.loginIndex == 2) {
						short_3 = 211;
						font_0.method974(Class26.loginMessage1, Class26.loginWindowX + 180, short_3, 16776960, 0);
						int_10 = short_3 + 15;
						font_0.method974(Class26.loginMessage2, Class26.loginWindowX + 180, int_10, 16776960, 0);
						int_10 += 15;
						font_0.method974(Class26.loginMessage3, Class26.loginWindowX + 180, int_10, 16776960, 0);
						int_10 += 15;
						int_10 += 10;
						font_0.method975("Login: ", (Class26.loginWindowX + 180) - 110, int_10, 16777215, 0);
						short_4 = 200;

						for (string_0 = Class26.username; font_0.method965(string_0) > short_4; string_0 = string_0
								.substring(1)) {
							;
						}

						font_0.method975(
								FontTypeFace.appendTags(string_0)
										+ ((Class26.loginIndex2 == 0) & ((Client.gameCycle % 40) < 20)
												? Class6.getColTags(16776960) + "|" : ""),
								(Class26.loginWindowX + 180) - 70, int_10, 16777215, 0);
						int_10 += 15;
						font_0.method975(
								"Password: " + Class82.method464(Class26.password)
										+ ((Class26.loginIndex2 == 1) & ((Client.gameCycle % 40) < 20)
												? Class6.getColTags(16776960) + "|" : ""),
								(Class26.loginWindowX + 180) - 108, int_10, 16777215, 0);
						int_10 += 15;
						int_1 = (Class26.loginWindowX + 180) - 80;
						short_1 = 321;
						AClass5_Sub4.aModIcon5.method886(int_1 - 73, short_1 - 20);
						font_0.method974("Login", int_1, short_1 + 5, 16777215, 0);
						int_1 = Class26.loginWindowX + 180 + 80;
						AClass5_Sub4.aModIcon5.method886(int_1 - 73, short_1 - 20);
						font_0.method974("Cancel", int_1, short_1 + 5, 16777215, 0);
						short_3 = 357;
						font_1.method974("Forgotten your password? <col=ffffff>Click here.", Class26.loginWindowX + 180,
								short_3, 16776960, 0);
					} else if (Class26.loginIndex == 3) {
						short_3 = 201;
						font_0.method974("Invalid username or password.", Class26.loginWindowX + 180, short_3, 16776960,
								0);
						int_10 = short_3 + 20;
						font_1.method974("For accounts created after 24th November 2010, please use your",
								Class26.loginWindowX + 180, int_10, 16776960, 0);
						int_10 += 15;
						font_1.method974("email address to login. Otherwise please login with your username.",
								Class26.loginWindowX + 180, int_10, 16776960, 0);
						int_10 += 15;
						int_0 = Class26.loginWindowX + 180;
						short_0 = 276;
						AClass5_Sub4.aModIcon5.method886(int_0 - 73, short_0 - 20);
						font_2.method974("Try again", int_0, short_0 + 5, 16777215, 0);
						int_0 = Class26.loginWindowX + 180;
						short_0 = 326;
						AClass5_Sub4.aModIcon5.method886(int_0 - 73, short_0 - 20);
						font_2.method974("Forgotten password?", int_0, short_0 + 5, 16777215, 0);
					} else if (Class26.loginIndex == 4) {
						font_0.method974("Authenticator", Class26.loginWindowX + 180, 211, 16776960, 0);
						short_3 = 236;
						font_0.method974(Class26.loginMessage1, Class26.loginWindowX + 180, short_3, 16777215, 0);
						int_10 = short_3 + 15;
						font_0.method974(Class26.loginMessage2, Class26.loginWindowX + 180, int_10, 16777215, 0);
						int_10 += 15;
						font_0.method974(Class26.loginMessage3, Class26.loginWindowX + 180, int_10, 16777215, 0);
						int_10 += 15;
						font_0.method975(
								"PIN: " + Class82.method464(WallObject.authCode)
										+ ((Client.gameCycle % 40) < 20 ? Class6.getColTags(16776960) + "|" : ""),
								(Class26.loginWindowX + 180) - 108, int_10, 16777215, 0);
						int_10 -= 8;
						font_0.method975("Trust this computer", (Class26.loginWindowX + 180) - 9, int_10, 16776960, 0);
						int_10 += 15;
						font_0.method975("for 30 days: ", (Class26.loginWindowX + 180) - 9, int_10, 16776960, 0);
						int_0 = ((Class26.loginWindowX + 180) - 9) + font_0.method965("for 30 days: ") + 15;
						int_11 = int_10 - font_0.verticalSpace;
						ModIcon modicon_0;
						if (Class26.aBool7) {
							modicon_0 = Enum5.aModIcon4;
						} else {
							modicon_0 = ISAACCipher.aModIcon2;
						}

						modicon_0.method886(int_0, int_11);
						int_10 += 15;
						int_12 = (Class26.loginWindowX + 180) - 80;
						final short short_2 = 321;
						AClass5_Sub4.aModIcon5.method886(int_12 - 73, short_2 - 20);
						font_0.method974("Continue", int_12, short_2 + 5, 16777215, 0);
						int_12 = Class26.loginWindowX + 180 + 80;
						AClass5_Sub4.aModIcon5.method886(int_12 - 73, short_2 - 20);
						font_0.method974("Cancel", int_12, short_2 + 5, 16777215, 0);
						font_1.method974("<u=ff>Can\'t Log In?</u>", Class26.loginWindowX + 180, short_2 + 36, 255, 0);
					} else if (Class26.loginIndex == 5) {
						font_0.method974("Forgotten your password?", Class26.loginWindowX + 180, 201, 16776960, 0);
						short_3 = 221;
						font_2.method974(Class26.loginMessage1, Class26.loginWindowX + 180, short_3, 16776960, 0);
						int_10 = short_3 + 15;
						font_2.method974(Class26.loginMessage2, Class26.loginWindowX + 180, int_10, 16776960, 0);
						int_10 += 15;
						font_2.method974(Class26.loginMessage3, Class26.loginWindowX + 180, int_10, 16776960, 0);
						int_10 += 15;
						int_10 += 14;
						font_0.method975("Username/email: ", (Class26.loginWindowX + 180) - 145, int_10, 16777215, 0);
						short_4 = 174;

						for (string_0 = Class26.username; font_0.method965(string_0) > short_4; string_0 = string_0
								.substring(1)) {
							;
						}

						font_0.method975(
								FontTypeFace.appendTags(string_0)
										+ ((Client.gameCycle % 40) < 20 ? Class6.getColTags(16776960) + "|" : ""),
								(Class26.loginWindowX + 180) - 34, int_10, 16777215, 0);
						int_10 += 15;
						int_1 = (Class26.loginWindowX + 180) - 80;
						short_1 = 321;
						AClass5_Sub4.aModIcon5.method886(int_1 - 73, short_1 - 20);
						font_0.method974("Recover", int_1, short_1 + 5, 16777215, 0);
						int_1 = 180 + Class26.loginWindowX + 80;
						AClass5_Sub4.aModIcon5.method886(int_1 - 73, short_1 - 20);
						font_0.method974("Back", int_1, short_1 + 5, 16777215, 0);
					} else if (Class26.loginIndex == 6) {
						short_3 = 211;
						font_0.method974(Class26.loginMessage1, Class26.loginWindowX + 180, short_3, 16776960, 0);
						int_10 = short_3 + 15;
						font_0.method974(Class26.loginMessage2, Class26.loginWindowX + 180, int_10, 16776960, 0);
						int_10 += 15;
						font_0.method974(Class26.loginMessage3, Class26.loginWindowX + 180, int_10, 16776960, 0);
						int_10 += 15;
						int_0 = Class26.loginWindowX + 180;
						short_0 = 321;
						AClass5_Sub4.aModIcon5.method886(int_0 - 73, short_0 - 20);
						font_0.method974("Back", int_0, short_0 + 5, 16777215, 0);
					}
				}
			}

			if (Class26.anInt84 > 0) {
				int_10 = Class26.anInt84;
				short_4 = 256;
				Class26.anInt82 += int_10 * 128;
				if (Class26.anInt82 > Spotanim.anIntArray83.length) {
					Class26.anInt82 -= Spotanim.anIntArray83.length;
					int_11 = (int) (Math.random() * 12.0D);
					Class23.method214(Frames.aModIconArray9[int_11]);
				}

				int_11 = 0;
				int_1 = int_10 * 128;
				int_12 = (short_4 - int_10) * 128;

				for (int_13 = 0; int_13 < int_12; int_13++) {
					int_2 = Class61.anIntArray40[int_1 + int_11] - ((int_10
							* Spotanim.anIntArray83[(int_11 + Class26.anInt82) & (Spotanim.anIntArray83.length - 1)])
							/ 6);
					if (int_2 < 0) {
						int_2 = 0;
					}

					Class61.anIntArray40[int_11++] = int_2;
				}

				for (int_13 = short_4 - int_10; int_13 < short_4; int_13++) {
					int_2 = int_13 * 128;

					for (int_3 = 0; int_3 < 128; int_3++) {
						int_4 = (int) (Math.random() * 100.0D);
						if ((int_4 < 50) && (int_3 > 10) && (int_3 < 118)) {
							Class61.anIntArray40[int_2 + int_3] = 255;
						} else {
							Class61.anIntArray40[int_2 + int_3] = 0;
						}
					}
				}

				if (Class26.anInt80 > 0) {
					Class26.anInt80 -= int_10 * 4;
				}

				if (Class26.anInt81 > 0) {
					Class26.anInt81 -= int_10 * 4;
				}

				if ((Class26.anInt80 == 0) && (Class26.anInt81 == 0)) {
					int_13 = (int) (Math.random() * (2000 / int_10));
					if (int_13 == 0) {
						Class26.anInt80 = 1024;
					}

					if (int_13 == 1) {
						Class26.anInt81 = 1024;
					}
				}

				for (int_13 = 0; int_13 < (short_4 - int_10); int_13++) {
					Class26.anIntArray12[int_13] = Class26.anIntArray12[int_10 + int_13];
				}

				for (int_13 = short_4 - int_10; int_13 < short_4; int_13++) {
					Class26.anIntArray12[int_13] = (int) ((Math.sin(Class26.anInt85 / 14.0D) * 16.0D)
							+ (Math.sin(Class26.anInt85 / 15.0D) * 14.0D)
							+ (Math.sin(Class26.anInt85 / 16.0D) * 12.0D));
					++Class26.anInt85;
				}

				Class26.anInt83 += int_10;
				int_13 = ((Client.gameCycle & 0x1) + int_10) / 2;
				if (int_13 > 0) {
					for (int_2 = 0; int_2 < (Class26.anInt83 * 100); int_2++) {
						int_3 = (int) (Math.random() * 124.0D) + 2;
						int_4 = (int) (Math.random() * 128.0D) + 128;
						Class61.anIntArray40[int_3 + (int_4 << 7)] = 192;
					}

					Class26.anInt83 = 0;
					int_2 = 0;

					label421: while (true) {
						if (int_2 >= short_4) {
							int_2 = 0;

							while (true) {
								if (int_2 >= 128) {
									break label421;
								}

								int_3 = 0;

								for (int_4 = -int_13; int_4 < short_4; int_4++) {
									int_5 = int_4 * 128;
									if ((int_13 + int_4) < short_4) {
										int_3 += Class50.anIntArray24[(int_13 * 128) + int_5 + int_2];
									}

									if ((int_4 - (int_13 + 1)) >= 0) {
										int_3 -= Class50.anIntArray24[(int_5 + int_2) - ((int_13 + 1) * 128)];
									}

									if (int_4 >= 0) {
										Class61.anIntArray40[int_5 + int_2] = int_3 / ((int_13 * 2) + 1);
									}
								}

								++int_2;
							}
						}

						int_3 = 0;
						int_4 = int_2 * 128;

						for (int_5 = -int_13; int_5 < 128; int_5++) {
							if ((int_13 + int_5) < 128) {
								int_3 += Class61.anIntArray40[int_13 + int_5 + int_4];
							}

							if ((int_5 - (int_13 + 1)) >= 0) {
								int_3 -= Class61.anIntArray40[(int_4 + int_5) - (int_13 + 1)];
							}

							if (int_5 >= 0) {
								Class50.anIntArray24[int_4 + int_5] = int_3 / ((int_13 * 2) + 1);
							}
						}

						++int_2;
					}
				}

				Class26.anInt84 = 0;
			}

			Class16.method198();
			titlemuteSprite[Class28.preferences.muted ? 1 : 0].method886((Class26.anInt79 + 765) - 40, 463);
			if ((Client.gameState > 5) && (Client.languageId == 0)) {
				if (Huffman.aModIcon3 == null) {
					Huffman.aModIcon3 = ISAACCipher.getSprite(Class50.indexSprites, "sl_button", "");
					return;
				}

				int_10 = Class26.anInt79 + 5;
				short_4 = 463;
				final byte byte_3 = 100;
				final byte byte_2 = 35;
				Huffman.aModIcon3.method886(int_10, short_4);
				font_0.method974("World" + " " + Client.world, int_10 + (byte_3 / 2), (short_4 + (byte_2 / 2)) - 2,
						16777215, 0);
				if (Class54.worldServersDownload == null) {
					font_1.method974("Click to switch", int_10 + (byte_3 / 2), short_4 + (byte_2 / 2) + 12, 16777215,
							0);
					return;
				}

				font_1.method974("Loading...", int_10 + (byte_3 / 2), short_4 + (byte_2 / 2) + 12, 16777215, 0);
			}

		}
	}

	static int method573(final int int_0, final Script script_0, final boolean bool_0) {
		final Widget widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
		if (int_0 == 2500) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.relativeX;
			return 1;
		} else if (int_0 == 2501) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.relativeY;
			return 1;
		} else if (int_0 == 2502) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.width;
			return 1;
		} else if (int_0 == 2503) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.height;
			return 1;
		} else if (int_0 == 2504) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.isHidden ? 1 : 0;
			return 1;
		} else if (int_0 == 2505) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.parentId;
			return 1;
		} else {
			return 2;
		}
	}

}
