import java.applet.Applet;

public class Class19 {

	static Applet anApplet1;
	static String aString3;
	static IndexData anIndexData2;

	static {
		anApplet1 = null;
		aString3 = null;
	}

	static final String method204(final int int_0) {
		String string_0 = Integer.toString(int_0);

		for (int int_1 = string_0.length() - 3; int_1 > 0; int_1 -= 3) {
			string_0 = string_0.substring(0, int_1) + "," + string_0.substring(int_1);
		}

		return string_0.length() > 9
				? " " + Class6.getColTags(65408) + string_0.substring(0, string_0.length() - 8) + "M" + " " + " ("
						+ string_0 + ")" + "</col>"
				: (string_0.length() > 6
						? " " + Class6.getColTags(16777215) + string_0.substring(0, string_0.length() - 4) + "K" + " "
								+ " (" + string_0 + ")" + "</col>"
						: " " + Class6.getColTags(16776960) + string_0 + "</col>");
	}

	static void decodeMovement(final PacketBuffer packetbuffer_0, final int int_0) {
		final boolean bool_0 = packetbuffer_0.getBits(1) == 1;
		if (bool_0) {
			Class40.anIntArray22[++Class40.anInt96 - 1] = int_0;
		}

		final int int_1 = packetbuffer_0.getBits(2);
		final Player player_0 = Client.cachedPlayers[int_0];
		if (int_1 == 0) {
			if (bool_0) {
				player_0.aBool74 = false;
			} else if (Client.localInteractingIndex == int_0) {
				throw new RuntimeException();
			} else {
				Class40.anIntArray19[int_0] = (player_0.anInt632 << 28)
						+ (((AClass2.baseX + player_0.pathX[0]) >> 13) << 14)
						+ ((player_0.pathY[0] + AClass4_Sub1.baseY) >> 13);
				if (player_0.anInt539 != -1) {
					Class40.anIntArray20[int_0] = player_0.anInt539;
				} else {
					Class40.anIntArray20[int_0] = player_0.orientation;
				}

				Class40.anIntArray21[int_0] = player_0.interacting;
				Client.cachedPlayers[int_0] = null;
				if (packetbuffer_0.getBits(1) != 0) {
					Class58.decodeRegionHash(packetbuffer_0, int_0);
				}

			}
		} else {
			int int_2;
			int int_3;
			int int_4;
			if (int_1 == 1) {
				int_2 = packetbuffer_0.getBits(3);
				int_3 = player_0.pathX[0];
				int_4 = player_0.pathY[0];
				if (int_2 == 0) {
					--int_3;
					--int_4;
				} else if (int_2 == 1) {
					--int_4;
				} else if (int_2 == 2) {
					++int_3;
					--int_4;
				} else if (int_2 == 3) {
					--int_3;
				} else if (int_2 == 4) {
					++int_3;
				} else if (int_2 == 5) {
					--int_3;
					++int_4;
				} else if (int_2 == 6) {
					++int_4;
				} else if (int_2 == 7) {
					++int_3;
					++int_4;
				}

				if ((Client.localInteractingIndex == int_0) && ((player_0.anInt547 < 1536) || (player_0.anInt550 < 1536)
						|| (player_0.anInt547 >= 11776) || (player_0.anInt550 >= 11776))) {
					player_0.method1032(int_3, int_4);
					player_0.aBool74 = false;
				} else if (bool_0) {
					player_0.aBool74 = true;
					player_0.anInt642 = int_3;
					player_0.anInt643 = int_4;
				} else {
					player_0.aBool74 = false;
					player_0.method1034(int_3, int_4, Class40.aByteArray5[int_0]);
				}
			} else if (int_1 == 2) {
				int_2 = packetbuffer_0.getBits(4);
				int_3 = player_0.pathX[0];
				int_4 = player_0.pathY[0];
				if (int_2 == 0) {
					int_3 -= 2;
					int_4 -= 2;
				} else if (int_2 == 1) {
					--int_3;
					int_4 -= 2;
				} else if (int_2 == 2) {
					int_4 -= 2;
				} else if (int_2 == 3) {
					++int_3;
					int_4 -= 2;
				} else if (int_2 == 4) {
					int_3 += 2;
					int_4 -= 2;
				} else if (int_2 == 5) {
					int_3 -= 2;
					--int_4;
				} else if (int_2 == 6) {
					int_3 += 2;
					--int_4;
				} else if (int_2 == 7) {
					int_3 -= 2;
				} else if (int_2 == 8) {
					int_3 += 2;
				} else if (int_2 == 9) {
					int_3 -= 2;
					++int_4;
				} else if (int_2 == 10) {
					int_3 += 2;
					++int_4;
				} else if (int_2 == 11) {
					int_3 -= 2;
					int_4 += 2;
				} else if (int_2 == 12) {
					--int_3;
					int_4 += 2;
				} else if (int_2 == 13) {
					int_4 += 2;
				} else if (int_2 == 14) {
					++int_3;
					int_4 += 2;
				} else if (int_2 == 15) {
					int_3 += 2;
					int_4 += 2;
				}

				if ((Client.localInteractingIndex == int_0) && ((player_0.anInt547 < 1536) || (player_0.anInt550 < 1536)
						|| (player_0.anInt547 >= 11776) || (player_0.anInt550 >= 11776))) {
					player_0.method1032(int_3, int_4);
					player_0.aBool74 = false;
				} else if (bool_0) {
					player_0.aBool74 = true;
					player_0.anInt642 = int_3;
					player_0.anInt643 = int_4;
				} else {
					player_0.aBool74 = false;
					player_0.method1034(int_3, int_4, Class40.aByteArray5[int_0]);
				}
			} else {
				int_2 = packetbuffer_0.getBits(1);
				int int_5;
				int int_6;
				int int_7;
				int int_8;
				if (int_2 == 0) {
					int_3 = packetbuffer_0.getBits(12);
					int_4 = int_3 >> 10;
					int_5 = (int_3 >> 5) & 0x1F;
					if (int_5 > 15) {
						int_5 -= 32;
					}

					int_6 = int_3 & 0x1F;
					if (int_6 > 15) {
						int_6 -= 32;
					}

					int_7 = int_5 + player_0.pathX[0];
					int_8 = int_6 + player_0.pathY[0];
					if ((Client.localInteractingIndex != int_0)
							|| ((player_0.anInt547 >= 1536) && (player_0.anInt550 >= 1536)
									&& (player_0.anInt547 < 11776) && (player_0.anInt550 < 11776))) {
						if (bool_0) {
							player_0.aBool74 = true;
							player_0.anInt642 = int_7;
							player_0.anInt643 = int_8;
						} else {
							player_0.aBool74 = false;
							player_0.method1034(int_7, int_8, Class40.aByteArray5[int_0]);
						}
					} else {
						player_0.method1032(int_7, int_8);
						player_0.aBool74 = false;
					}

					player_0.anInt632 = (byte) ((int_4 + player_0.anInt632) & 0x3);
					if (Client.localInteractingIndex == int_0) {
						AClass1_Sub1.plane = player_0.anInt632;
					}

				} else {
					int_3 = packetbuffer_0.getBits(30);
					int_4 = int_3 >> 28;
					int_5 = (int_3 >> 14) & 0x3FFF;
					int_6 = int_3 & 0x3FFF;
					int_7 = ((int_5 + player_0.pathX[0] + AClass2.baseX) & 0x3FFF) - AClass2.baseX;
					int_8 = ((int_6 + player_0.pathY[0] + AClass4_Sub1.baseY) & 0x3FFF) - AClass4_Sub1.baseY;
					if ((Client.localInteractingIndex == int_0)
							&& ((player_0.anInt547 < 1536) || (player_0.anInt550 < 1536) || (player_0.anInt547 >= 11776)
									|| (player_0.anInt550 >= 11776))) {
						player_0.method1032(int_7, int_8);
						player_0.aBool74 = false;
					} else if (bool_0) {
						player_0.aBool74 = true;
						player_0.anInt642 = int_7;
						player_0.anInt643 = int_8;
					} else {
						player_0.aBool74 = false;
						player_0.method1034(int_7, int_8, Class40.aByteArray5[int_0]);
					}

					player_0.anInt632 = (byte) ((int_4 + player_0.anInt632) & 0x3);
					if (Client.localInteractingIndex == int_0) {
						AClass1_Sub1.plane = player_0.anInt632;
					}

				}
			}
		}
	}

	static final void method205(final Widget[] widgets_0, final int int_0) {
		for (int int_1 = 0; int_1 < widgets_0.length; int_1++) {
			final Widget widget_0 = widgets_0[int_1];
			if (widget_0 != null) {
				if (widget_0.type == 0) {
					if (widget_0.children != null) {
						method205(widget_0.children, int_0);
					}

					final WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable.get(widget_0.anInt289);
					if (widgetnode_0 != null) {
						Class12.method170(widgetnode_0.anInt392, int_0);
					}
				}

				ScriptEvent scriptevent_0;
				if ((int_0 == 0) && (widget_0.anObjectArray18 != null)) {
					scriptevent_0 = new ScriptEvent();
					scriptevent_0.widget = widget_0;
					scriptevent_0.anObjectArray22 = widget_0.anObjectArray18;
					Class30.method229(scriptevent_0);
				}

				if ((int_0 == 1) && (widget_0.anObjectArray19 != null)) {
					if (widget_0.index >= 0) {
						final Widget widget_1 = Class18.method202(widget_0.anInt289);
						if ((widget_1 == null) || (widget_1.children == null)
								|| (widget_0.index >= widget_1.children.length)
								|| (widget_0 != widget_1.children[widget_0.index])) {
							continue;
						}
					}

					scriptevent_0 = new ScriptEvent();
					scriptevent_0.widget = widget_0;
					scriptevent_0.anObjectArray22 = widget_0.anObjectArray19;
					Class30.method229(scriptevent_0);
				}
			}
		}

	}

	static final void method206() {
		final int int_0 = Client.anInt714 + Script.localPlayer.anInt547;
		final int int_1 = Client.anInt720 + Script.localPlayer.anInt550;
		if (((Class17.anInt70 - int_0) < -500) || ((Class17.anInt70 - int_0) > 500)
				|| ((Class15.anInt58 - int_1) < -500) || ((Class15.anInt58 - int_1) > 500)) {
			Class17.anInt70 = int_0;
			Class15.anInt58 = int_1;
		}

		if (int_0 != Class17.anInt70) {
			Class17.anInt70 += (int_0 - Class17.anInt70) / 16;
		}

		if (int_1 != Class15.anInt58) {
			Class15.anInt58 += (int_1 - Class15.anInt58) / 16;
		}

		int int_2;
		int int_3;
		if ((MouseInput.anInt281 == 4) && Class14.aBool5) {
			int_2 = MouseInput.anInt280 - Client.anInt738;
			Client.anInt736 = int_2 * 2;
			Client.anInt738 = (int_2 != -1) && (int_2 != 1) ? (MouseInput.anInt280 + Client.anInt738) / 2
					: MouseInput.anInt280;
			int_3 = Client.anInt737 - MouseInput.anInt278;
			Client.anInt735 = int_3 * 2;
			Client.anInt737 = (int_3 != -1) && (int_3 != 1) ? (MouseInput.anInt278 + Client.anInt737) / 2
					: MouseInput.anInt278;
		} else {
			if (KeyFocusListener.aBoolArray3[96]) {
				Client.anInt735 += (-24 - Client.anInt735) / 2;
			} else if (KeyFocusListener.aBoolArray3[97]) {
				Client.anInt735 += (24 - Client.anInt735) / 2;
			} else {
				Client.anInt735 /= 2;
			}

			if (KeyFocusListener.aBoolArray3[98]) {
				Client.anInt736 += (12 - Client.anInt736) / 2;
			} else if (KeyFocusListener.aBoolArray3[99]) {
				Client.anInt736 += (-12 - Client.anInt736) / 2;
			} else {
				Client.anInt736 /= 2;
			}

			Client.anInt738 = MouseInput.anInt280;
			Client.anInt737 = MouseInput.anInt278;
		}

		Client.mapAngle = ((Client.anInt735 / 2) + Client.mapAngle) & 0x7FF;
		Client.anInt712 += Client.anInt736 / 2;
		if (Client.anInt712 < 128) {
			Client.anInt712 = 128;
		}

		if (Client.anInt712 > 383) {
			Client.anInt712 = 383;
		}

		int_2 = Class17.anInt70 >> 7;
		int_3 = Class15.anInt58 >> 7;
		final int int_4 = Actor.getTileHeight(Class17.anInt70, Class15.anInt58, AClass1_Sub1.plane);
		int int_5 = 0;
		int int_6;
		if ((int_2 > 3) && (int_3 > 3) && (int_2 < 100) && (int_3 < 100)) {
			for (int_6 = int_2 - 4; int_6 <= (int_2 + 4); int_6++) {
				for (int int_7 = int_3 - 4; int_7 <= (int_3 + 4); int_7++) {
					int int_8 = AClass1_Sub1.plane;
					if ((int_8 < 3) && ((Class18.tileSettings[1][int_6][int_7] & 0x2) == 2)) {
						++int_8;
					}

					final int int_9 = int_4 - Class18.tileHeights[int_8][int_6][int_7];
					if (int_9 > int_5) {
						int_5 = int_9;
					}
				}
			}
		}

		int_6 = int_5 * 192;
		if (int_6 > 98048) {
			int_6 = 98048;
		}

		if (int_6 < 32768) {
			int_6 = 32768;
		}

		if (int_6 > Client.anInt741) {
			Client.anInt741 += (int_6 - Client.anInt741) / 24;
		} else if (int_6 < Client.anInt741) {
			Client.anInt741 += (int_6 - Client.anInt741) / 80;
			return;
		}

	}

	static int method207(final int int_0, final Script script_0, final boolean bool_0) {
		int int_1;
		if (int_0 == 4200) {
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = Class45.getItemDefinition(int_1).name;
			return 1;
		} else {
			int int_2;
			ItemComposition itemcomposition_2;
			if (int_0 == 4201) {
				WorldMapType2.intStackSize -= 2;
				int_1 = Class45.intStack[WorldMapType2.intStackSize];
				int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
				itemcomposition_2 = Class45.getItemDefinition(int_1);
				if ((int_2 >= 1) && (int_2 <= 5) && (itemcomposition_2.groundActions[int_2 - 1] != null)) {
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
							- 1] = itemcomposition_2.groundActions[int_2 - 1];
				} else {
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
				}

				return 1;
			} else if (int_0 == 4202) {
				WorldMapType2.intStackSize -= 2;
				int_1 = Class45.intStack[WorldMapType2.intStackSize];
				int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
				itemcomposition_2 = Class45.getItemDefinition(int_1);
				if ((int_2 >= 1) && (int_2 <= 5) && (itemcomposition_2.inventoryActions[int_2 - 1] != null)) {
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
							- 1] = itemcomposition_2.inventoryActions[int_2 - 1];
				} else {
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
				}

				return 1;
			} else if (int_0 == 4203) {
				int_1 = Class45.intStack[--WorldMapType2.intStackSize];
				Class45.intStack[++WorldMapType2.intStackSize - 1] = Class45.getItemDefinition(int_1).price;
				return 1;
			} else if (int_0 == 4204) {
				int_1 = Class45.intStack[--WorldMapType2.intStackSize];
				Class45.intStack[++WorldMapType2.intStackSize - 1] = Class45.getItemDefinition(int_1).isStackable == 1
						? 1 : 0;
				return 1;
			} else {
				ItemComposition itemcomposition_0;
				if (int_0 == 4205) {
					int_1 = Class45.intStack[--WorldMapType2.intStackSize];
					itemcomposition_0 = Class45.getItemDefinition(int_1);
					if ((itemcomposition_0.notedTemplate == -1) && (itemcomposition_0.note >= 0)) {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = itemcomposition_0.note;
					} else {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = int_1;
					}

					return 1;
				} else if (int_0 == 4206) {
					int_1 = Class45.intStack[--WorldMapType2.intStackSize];
					itemcomposition_0 = Class45.getItemDefinition(int_1);
					if ((itemcomposition_0.notedTemplate >= 0) && (itemcomposition_0.note >= 0)) {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = itemcomposition_0.note;
					} else {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = int_1;
					}

					return 1;
				} else if (int_0 == 4207) {
					int_1 = Class45.intStack[--WorldMapType2.intStackSize];
					Class45.intStack[++WorldMapType2.intStackSize - 1] = Class45.getItemDefinition(int_1).isMembers ? 1
							: 0;
					return 1;
				} else if (int_0 == 4208) {
					int_1 = Class45.intStack[--WorldMapType2.intStackSize];
					itemcomposition_0 = Class45.getItemDefinition(int_1);
					if ((itemcomposition_0.anInt535 == -1) && (itemcomposition_0.anInt536 >= 0)) {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = itemcomposition_0.anInt536;
					} else {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = int_1;
					}

					return 1;
				} else if (int_0 == 4209) {
					int_1 = Class45.intStack[--WorldMapType2.intStackSize];
					itemcomposition_0 = Class45.getItemDefinition(int_1);
					if ((itemcomposition_0.anInt535 >= 0) && (itemcomposition_0.anInt536 >= 0)) {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = itemcomposition_0.anInt536;
					} else {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = int_1;
					}

					return 1;
				} else if (int_0 == 4210) {
					final String string_1 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
					int_2 = Class45.intStack[--WorldMapType2.intStackSize];
					final boolean bool_1 = int_2 == 1;
					final String string_0 = string_1.toLowerCase();
					short[] shorts_0 = new short[16];
					int int_3 = 0;
					int int_4 = 0;

					while (true) {
						if (int_4 >= ItemComposition.anInt532) {
							Client.aShortArray17 = shorts_0;
							RSSocket.anInt239 = 0;
							Class47.anInt104 = int_3;
							final String[] strings_0 = new String[Class47.anInt104];

							for (int int_5 = 0; int_5 < Class47.anInt104; int_5++) {
								strings_0[int_5] = Class45.getItemDefinition(shorts_0[int_5]).name;
							}

							final short[] shorts_2 = Client.aShortArray17;
							ChatLineBuffer.method14(strings_0, shorts_2, 0, strings_0.length - 1);
							break;
						}

						final ItemComposition itemcomposition_1 = Class45.getItemDefinition(int_4);
						if ((!bool_1 || itemcomposition_1.aBool60) && (itemcomposition_1.notedTemplate == -1)
								&& (itemcomposition_1.name.toLowerCase().indexOf(string_0) != -1)) {
							if (int_3 >= 250) {
								Class47.anInt104 = -1;
								Client.aShortArray17 = null;
								break;
							}

							if (int_3 >= shorts_0.length) {
								final short[] shorts_1 = new short[shorts_0.length * 2];

								for (int int_6 = 0; int_6 < int_3; int_6++) {
									shorts_1[int_6] = shorts_0[int_6];
								}

								shorts_0 = shorts_1;
							}

							shorts_0[int_3++] = (short) int_4;
						}

						++int_4;
					}

					Class45.intStack[++WorldMapType2.intStackSize - 1] = Class47.anInt104;
					return 1;
				} else if (int_0 != 4211) {
					if (int_0 == 4212) {
						RSSocket.anInt239 = 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					if ((Client.aShortArray17 != null) && (RSSocket.anInt239 < Class47.anInt104)) {
						Class45.intStack[++WorldMapType2.intStackSize
								- 1] = Client.aShortArray17[++RSSocket.anInt239 - 1] & 0xFFFF;
					} else {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

}
