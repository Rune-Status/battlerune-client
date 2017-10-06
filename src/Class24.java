public class Class24 {

	static SpritePixels[] aSpritePixelsArray1;

	static final void method216(int int_0, int int_1, int int_2, int int_3) {
		++Client.anInt699;
		Class8.method120(Class23.aClass23_1);
		boolean bool_0 = false;
		int int_4;
		int int_5;
		if (Client.anInt709 >= 0) {
			int_4 = Class40.anInt94;
			final int[] ints_0 = Class40.anIntArray17;

			for (int_5 = 0; int_5 < int_4; int_5++) {
				if (ints_0[int_5] == Client.anInt709) {
					bool_0 = true;
					break;
				}
			}
		}

		if (bool_0) {
			Class8.method120(Class23.aClass23_2);
		}

		Class54.method330(true);
		Class8.method120(bool_0 ? Class23.aClass23_4 : Class23.aClass23_3);
		Class54.method330(false);
		Timer.method559();

		for (GraphicsObject graphicsobject_0 = (GraphicsObject) Client.graphicsObjectDeque
				.getFront(); graphicsobject_0 != null; graphicsobject_0 = (GraphicsObject) Client.graphicsObjectDeque
						.getNext()) {
			if ((graphicsobject_0.level == AClass1_Sub1.plane) && !graphicsobject_0.finished) {
				if (Client.gameCycle >= graphicsobject_0.startCycle) {
					graphicsobject_0.method894(Client.anInt662);
					if (graphicsobject_0.finished) {
						graphicsobject_0.unlink();
					} else {
						Class8.region.method356(graphicsobject_0.level, graphicsobject_0.anInt576,
								graphicsobject_0.anInt577, graphicsobject_0.height, 60, graphicsobject_0, 0, -1, false);
					}
				}
			} else {
				graphicsobject_0.unlink();
			}
		}

		Class51.method308(int_0, int_1, int_2, int_3, true);
		int_0 = Client.anInt745;
		int_1 = Client.anInt747;
		int_2 = Client.viewportHeight;
		int_3 = Client.viewportWidth;
		Rasterizer2D.setDrawRegion(int_0, int_1, int_0 + int_2, int_3 + int_1);
		Graphics3D.method898();
		int int_6;
		if (!Client.aBool85) {
			int_4 = Client.anInt712;
			if ((Client.anInt741 / 256) > int_4) {
				int_4 = Client.anInt741 / 256;
			}

			if (Client.aBoolArray11[4] && ((Client.anIntArray145[4] + 128) > int_4)) {
				int_4 = Client.anIntArray145[4] + 128;
			}

			int_6 = (Client.anInt723 + Client.mapAngle) & 0x7FF;
			Class68.method403(Class17.anInt70,
					Actor.getTileHeight(Script.localPlayer.anInt547, Script.localPlayer.anInt550, AClass1_Sub1.plane)
							- Client.anInt739,
					Class15.anInt58, int_4, int_6, (3 * int_4) + 600);
		}

		int int_7;
		int int_8;
		int int_9;
		int int_10;
		int int_11;
		int int_12;
		int int_13;
		int int_14;
		if (!Client.aBool85) {
			if (Class28.preferences.hideRoofs) {
				int_6 = AClass1_Sub1.plane;
			} else {
				label479: {
					int_5 = 3;
					if (AClass4_Sub2.cameraPitch < 310) {
						int_7 = Class13.cameraX >> 7;
						int_8 = Class46.cameraY >> 7;
						int_9 = Script.localPlayer.anInt547 >> 7;
						int_10 = Script.localPlayer.anInt550 >> 7;
						if ((int_7 < 0) || (int_8 < 0) || (int_7 >= 104) || (int_8 >= 104)) {
							int_6 = AClass1_Sub1.plane;
							break label479;
						}

						if ((Class18.tileSettings[AClass1_Sub1.plane][int_7][int_8] & 0x4) != 0) {
							int_5 = AClass1_Sub1.plane;
						}

						if (int_9 > int_7) {
							int_11 = int_9 - int_7;
						} else {
							int_11 = int_7 - int_9;
						}

						if (int_10 > int_8) {
							int_12 = int_10 - int_8;
						} else {
							int_12 = int_8 - int_10;
						}

						if (int_11 > int_12) {
							int_13 = (int_12 * 65536) / int_11;
							int_14 = 32768;

							while (int_9 != int_7) {
								if (int_7 < int_9) {
									++int_7;
								} else if (int_7 > int_9) {
									--int_7;
								}

								if ((Class18.tileSettings[AClass1_Sub1.plane][int_7][int_8] & 0x4) != 0) {
									int_5 = AClass1_Sub1.plane;
								}

								int_14 += int_13;
								if (int_14 >= 65536) {
									int_14 -= 65536;
									if (int_8 < int_10) {
										++int_8;
									} else if (int_8 > int_10) {
										--int_8;
									}

									if ((Class18.tileSettings[AClass1_Sub1.plane][int_7][int_8] & 0x4) != 0) {
										int_5 = AClass1_Sub1.plane;
									}
								}
							}
						} else {
							int_13 = (int_11 * 65536) / int_12;
							int_14 = 32768;

							while (int_10 != int_8) {
								if (int_8 < int_10) {
									++int_8;
								} else if (int_8 > int_10) {
									--int_8;
								}

								if ((Class18.tileSettings[AClass1_Sub1.plane][int_7][int_8] & 0x4) != 0) {
									int_5 = AClass1_Sub1.plane;
								}

								int_14 += int_13;
								if (int_14 >= 65536) {
									int_14 -= 65536;
									if (int_7 < int_9) {
										++int_7;
									} else if (int_7 > int_9) {
										--int_7;
									}

									if ((Class18.tileSettings[AClass1_Sub1.plane][int_7][int_8] & 0x4) != 0) {
										int_5 = AClass1_Sub1.plane;
									}
								}
							}
						}
					}

					if ((Script.localPlayer.anInt547 >= 0) && (Script.localPlayer.anInt550 >= 0)
							&& (Script.localPlayer.anInt547 < 13312) && (Script.localPlayer.anInt550 < 13312)) {
						if ((Class18.tileSettings[AClass1_Sub1.plane][Script.localPlayer.anInt547 >> 7][Script.localPlayer.anInt550 >> 7]
								& 0x4) != 0) {
							int_5 = AClass1_Sub1.plane;
						}

						int_6 = int_5;
					} else {
						int_6 = AClass1_Sub1.plane;
					}
				}
			}

			int_4 = int_6;
		} else {
			int_4 = WorldMapType2.method546();
		}

		int_6 = Class13.cameraX;
		int_5 = XItemContainer.cameraZ;
		int_7 = Class46.cameraY;
		int_8 = AClass4_Sub2.cameraPitch;
		int_9 = Friend.cameraYaw;

		for (int_10 = 0; int_10 < 5; int_10++) {
			if (Client.aBoolArray11[int_10]) {
				int_11 = (int) (((Math.random() * ((Client.anIntArray144[int_10] * 2) + 1))
						- Client.anIntArray144[int_10])
						+ (Math.sin((Client.anIntArray146[int_10] / 100.0D) * Client.anIntArray147[int_10])
								* Client.anIntArray145[int_10]));
				if (int_10 == 0) {
					Class13.cameraX += int_11;
				}

				if (int_10 == 1) {
					XItemContainer.cameraZ += int_11;
				}

				if (int_10 == 2) {
					Class46.cameraY += int_11;
				}

				if (int_10 == 3) {
					Friend.cameraYaw = (int_11 + Friend.cameraYaw) & 0x7FF;
				}

				if (int_10 == 4) {
					AClass4_Sub2.cameraPitch += int_11;
					if (AClass4_Sub2.cameraPitch < 128) {
						AClass4_Sub2.cameraPitch = 128;
					}

					if (AClass4_Sub2.cameraPitch > 383) {
						AClass4_Sub2.cameraPitch = 383;
					}
				}
			}
		}

		int_10 = MouseInput.anInt278;
		int_11 = MouseInput.anInt280;
		if (MouseInput.anInt277 != 0) {
			int_10 = MouseInput.anInt282;
			int_11 = MouseInput.anInt283;
		}

		if ((int_10 >= int_0) && (int_10 < (int_0 + int_2)) && (int_11 >= int_1) && (int_11 < (int_3 + int_1))) {
			Class57.method350(int_10 - int_0, int_11 - int_1);
		} else {
			GameEngine.method1031();
		}

		Class6.method105();
		Rasterizer2D.method853(int_0, int_1, int_2, int_3, 0);
		Class6.method105();
		int_12 = Graphics3D.anInt578;
		Graphics3D.anInt578 = Client.scale;
		Class8.region.draw(Class13.cameraX, XItemContainer.cameraZ, Class46.cameraY, AClass4_Sub2.cameraPitch,
				Friend.cameraYaw, int_4);
		Class38.method256();
		Graphics3D.anInt578 = int_12;
		Class6.method105();
		Class8.region.clearEntities();
		Client.anInt742 = 0;
		boolean bool_2 = false;
		int_14 = -1;
		final int int_15 = Class40.anInt94;
		final int[] ints_1 = Class40.anIntArray17;

		int int_16;
		for (int_16 = 0; int_16 < (int_15 + Client.anInt690); int_16++) {
			Object object_0;
			if (int_16 < int_15) {
				object_0 = Client.cachedPlayers[ints_1[int_16]];
				if (ints_1[int_16] == Client.anInt709) {
					bool_2 = true;
					int_14 = int_16;
					continue;
				}
			} else {
				object_0 = Client.cachedNPCs[Client.npcIndices[int_16 - int_15]];
			}

			RSCanvas.method695((Actor) object_0, int_16, int_0, int_1, int_2, int_3);
		}

		if (bool_2) {
			RSCanvas.method695(Client.cachedPlayers[Client.anInt709], int_14, int_0, int_1, int_2, int_3);
		}

		for (int_16 = 0; int_16 < Client.anInt742; int_16++) {
			final int int_17 = Client.anIntArray157[int_16];
			int int_18 = Client.anIntArray158[int_16];
			final int int_19 = Client.anIntArray160[int_16];
			final int int_20 = Client.anIntArray159[int_16];
			boolean bool_1 = true;

			while (bool_1) {
				bool_1 = false;

				for (int int_21 = 0; int_21 < int_16; int_21++) {
					if (((int_18 + 2) > (Client.anIntArray158[int_21] - Client.anIntArray159[int_21]))
							&& ((int_18 - int_20) < (Client.anIntArray158[int_21] + 2))
							&& ((int_17 - int_19) < (Client.anIntArray157[int_21] + Client.anIntArray160[int_21]))
							&& ((int_17 + int_19) > (Client.anIntArray157[int_21] - Client.anIntArray160[int_21]))
							&& ((Client.anIntArray158[int_21] - Client.anIntArray159[int_21]) < int_18)) {
						int_18 = Client.anIntArray158[int_21] - Client.anIntArray159[int_21];
						bool_1 = true;
					}
				}
			}

			Client.screenY = Client.anIntArray157[int_16];
			Client.screenX = Client.anIntArray158[int_16] = int_18;
			final String string_0 = Client.aStringArray6[int_16];
			if (Client.anInt731 == 0) {
				int int_22 = 16776960;
				if (Client.anIntArray161[int_16] < 6) {
					int_22 = Client.anIntArray168[Client.anIntArray161[int_16]];
				}

				if (Client.anIntArray161[int_16] == 6) {
					int_22 = (Client.anInt699 % 20) < 10 ? 16711680 : 16776960;
				}

				if (Client.anIntArray161[int_16] == 7) {
					int_22 = (Client.anInt699 % 20) < 10 ? 255 : 65535;
				}

				if (Client.anIntArray161[int_16] == 8) {
					int_22 = (Client.anInt699 % 20) < 10 ? 45056 : 8454016;
				}

				int int_23;
				if (Client.anIntArray161[int_16] == 9) {
					int_23 = 150 - Client.anIntArray163[int_16];
					if (int_23 < 50) {
						int_22 = (int_23 * 1280) + 16711680;
					} else if (int_23 < 100) {
						int_22 = 16776960 - ((int_23 - 50) * 327680);
					} else if (int_23 < 150) {
						int_22 = ((int_23 - 100) * 5) + 65280;
					}
				}

				if (Client.anIntArray161[int_16] == 10) {
					int_23 = 150 - Client.anIntArray163[int_16];
					if (int_23 < 50) {
						int_22 = (int_23 * 5) + 16711680;
					} else if (int_23 < 100) {
						int_22 = 16711935 - ((int_23 - 50) * 327680);
					} else if (int_23 < 150) {
						int_22 = (((int_23 - 100) * 327680) + 255) - ((int_23 - 100) * 5);
					}
				}

				if (Client.anIntArray161[int_16] == 11) {
					int_23 = 150 - Client.anIntArray163[int_16];
					if (int_23 < 50) {
						int_22 = 16777215 - (int_23 * 327685);
					} else if (int_23 < 100) {
						int_22 = ((int_23 - 50) * 327685) + 65280;
					} else if (int_23 < 150) {
						int_22 = 16777215 - ((int_23 - 100) * 327680);
					}
				}

				if (Client.anIntArray162[int_16] == 0) {
					Class36.aFont3.method974(string_0, int_0 + Client.screenY, Client.screenX + int_1, int_22, 0);
				}

				if (Client.anIntArray162[int_16] == 1) {
					Class36.aFont3.method977(string_0, int_0 + Client.screenY, Client.screenX + int_1, int_22, 0,
							Client.anInt699);
				}

				if (Client.anIntArray162[int_16] == 2) {
					Class36.aFont3.method978(string_0, int_0 + Client.screenY, Client.screenX + int_1, int_22, 0,
							Client.anInt699);
				}

				if (Client.anIntArray162[int_16] == 3) {
					Class36.aFont3.method979(string_0, int_0 + Client.screenY, Client.screenX + int_1, int_22, 0,
							Client.anInt699, 150 - Client.anIntArray163[int_16]);
				}

				if (Client.anIntArray162[int_16] == 4) {
					int_23 = ((150 - Client.anIntArray163[int_16]) * (Class36.aFont3.method965(string_0) + 100)) / 150;
					Rasterizer2D.setInnerDrawRegion((int_0 + Client.screenY) - 50, int_1, int_0 + Client.screenY + 50,
							int_3 + int_1);
					Class36.aFont3.method975(string_0, (Client.screenY + int_0 + 50) - int_23, Client.screenX + int_1,
							int_22, 0);
					Rasterizer2D.setDrawRegion(int_0, int_1, int_0 + int_2, int_3 + int_1);
				}

				if (Client.anIntArray162[int_16] == 5) {
					int_23 = 150 - Client.anIntArray163[int_16];
					int int_24 = 0;
					if (int_23 < 25) {
						int_24 = int_23 - 25;
					} else if (int_23 > 125) {
						int_24 = int_23 - 125;
					}

					Rasterizer2D.setInnerDrawRegion(int_0, (Client.screenX + int_1) - Class36.aFont3.verticalSpace - 1,
							int_0 + int_2, Client.screenX + int_1 + 5);
					Class36.aFont3.method974(string_0, int_0 + Client.screenY, int_24 + Client.screenX + int_1, int_22,
							0);
					Rasterizer2D.setDrawRegion(int_0, int_1, int_0 + int_2, int_3 + int_1);
				}
			} else {
				Class36.aFont3.method974(string_0, int_0 + Client.screenY, Client.screenX + int_1, 16776960, 0);
			}
		}

		Class39.method258(int_0, int_1);
		((TextureProvider) Graphics3D.textureLoader).method541(Client.anInt662);
		if (Client.cursorState == 1) {
			CombatInfoListHolder.aSpritePixelsArray3[Client.anInt688 / 100].method916(Client.anInt685 - 8,
					Client.anInt686 - 8);
		}

		if (Client.cursorState == 2) {
			CombatInfoListHolder.aSpritePixelsArray3[(Client.anInt688 / 100) + 4].method916(Client.anInt685 - 8,
					Client.anInt686 - 8);
		}

		Client.anInt715 = 0;
		int_13 = (Script.localPlayer.anInt547 >> 7) + AClass2.baseX;
		int_14 = (Script.localPlayer.anInt550 >> 7) + AClass4_Sub1.baseY;
		if ((int_13 >= 3053) && (int_13 <= 3156) && (int_14 >= 3056) && (int_14 <= 3136)) {
			Client.anInt715 = 1;
		}

		if ((int_13 >= 3072) && (int_13 <= 3118) && (int_14 >= 9492) && (int_14 <= 9535)) {
			Client.anInt715 = 1;
		}

		if ((Client.anInt715 == 1) && (int_13 >= 3139) && (int_13 <= 3199) && (int_14 >= 3008) && (int_14 <= 3062)) {
			Client.anInt715 = 0;
		}

		Class13.cameraX = int_6;
		XItemContainer.cameraZ = int_5;
		Class46.cameraY = int_7;
		AClass4_Sub2.cameraPitch = int_8;
		Friend.cameraYaw = int_9;
		if (Client.aBool81 && (Class9.method123(true, false) == 0)) {
			Client.aBool81 = false;
		}

		if (Client.aBool81) {
			Rasterizer2D.method853(int_0, int_1, int_2, int_3, 0);
			Class30.drawStatusBox("Loading - please wait.", false);
		}

	}

	public static boolean method217(final int int_0) {
		return ((int_0 >> 20) & 0x1) != 0;
	}

}
