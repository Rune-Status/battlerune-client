public final class Projectile extends Renderable {

	int anInt585;
	boolean isMoving;
	int anInt586;
	int cycle;
	double aDouble1;
	double aDouble2;
	int anInt587;
	int anInt588;
	int anInt589;
	int rotationY;
	double velocityZ;
	int start;
	double scalar;
	int floor;
	double aDouble3;
	double heightOffset;
	double velocityX;
	int height;
	int startTime;
	double velocityY;
	int slope;
	int interacting;
	int endHeight;
	int rotationX;
	Sequence animationSequence;

	Projectile(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final int int_6, final int int_7, final int int_8, final int int_9, final int int_10) {
		isMoving = false;
		anInt587 = 0;
		anInt589 = 0;
		anInt585 = int_0;
		floor = int_1;
		anInt586 = int_2;
		anInt588 = int_3;
		height = int_4;
		startTime = int_5;
		cycle = int_6;
		slope = int_7;
		start = int_8;
		interacting = int_9;
		endHeight = int_10;
		isMoving = false;
		final int int_11 = InvType.getSpotAnimType(anInt585).anInt441;
		if (int_11 != -1) {
			animationSequence = Class54.getAnimation(int_11);
		} else {
			animationSequence = null;
		}
	}

	@Override
	protected final Model getModel() {
		final Spotanim spotanim_0 = InvType.getSpotAnimType(anInt585);
		final Model model_0 = spotanim_0.method708(anInt587);
		if (model_0 == null) {
			return null;
		} else {
			model_0.method951(rotationY);
			return model_0;
		}
	}

	final void method937(final int int_0) {
		isMoving = true;
		aDouble1 += aDouble2 * int_0;
		velocityZ += scalar * int_0;
		aDouble3 += (int_0 * heightOffset * 0.5D * int_0) + (int_0 * velocityX);
		velocityX += heightOffset * int_0;
		rotationX = ((int) (Math.atan2(aDouble2, scalar) * 325.949D) + 1024) & 0x7FF;
		rotationY = (int) (Math.atan2(velocityX, velocityY) * 325.949D) & 0x7FF;
		if (animationSequence != null) {
			anInt589 += int_0;

			while (true) {
				do {
					do {
						if (anInt589 <= animationSequence.frameLenghts[anInt587]) {
							return;
						}

						anInt589 -= animationSequence.frameLenghts[anInt587];
						++anInt587;
					} while (anInt587 < animationSequence.frameIDs.length);

					anInt587 -= animationSequence.frameStep;
				} while ((anInt587 >= 0) && (anInt587 < animationSequence.frameIDs.length));

				anInt587 = 0;
			}
		}
	}

	final void method938(final int int_0, final int int_1, final int int_2, final int int_3) {
		double double_0;
		if (!isMoving) {
			double_0 = int_0 - anInt586;
			final double double_1 = int_1 - anInt588;
			final double double_2 = Math.sqrt((double_1 * double_1) + (double_0 * double_0));
			aDouble1 = ((start * double_0) / double_2) + anInt586;
			velocityZ = ((start * double_1) / double_2) + anInt588;
			aDouble3 = height;
		}

		double_0 = (cycle + 1) - int_3;
		aDouble2 = (int_0 - aDouble1) / double_0;
		scalar = (int_1 - velocityZ) / double_0;
		velocityY = Math.sqrt((scalar * scalar) + (aDouble2 * aDouble2));
		if (!isMoving) {
			velocityX = -velocityY * Math.tan(0.02454369D * slope);
		}

		heightOffset = (2.0D * (int_2 - aDouble3 - (double_0 * velocityX))) / (double_0 * double_0);
	}

	static ModIcon method939(final IndexDataBase indexdatabase_0, final int int_0, final int int_1) {
		if (!IndexData.method597(indexdatabase_0, int_0, int_1)) {
			return null;
		} else {
			final ModIcon modicon_0 = new ModIcon();
			modicon_0.width = Class108.anInt216;
			modicon_0.originalHeight = Class108.anInt217;
			modicon_0.offsetX = Class108.anIntArray56[0];
			modicon_0.offsetY = Class12.offsetsY[0];
			modicon_0.originalWidth = Class108.anIntArray57[0];
			modicon_0.height = Class37.anIntArray16[0];
			modicon_0.palette = Class108.anIntArray58;
			modicon_0.pixels = Class66.spritePixels[0];
			Class32.method232();
			return modicon_0;
		}
	}

	static int method940(final int int_0, final Script script_0, final boolean bool_0) {
		String string_2;
		if (int_0 == 3100) {
			string_2 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
			WidgetNode.sendGameMessage(0, "", string_2);
			return 1;
		} else if (int_0 == 3101) {
			WorldMapType2.intStackSize -= 2;
			Timer.method560(Script.localPlayer, Class45.intStack[WorldMapType2.intStackSize],
					Class45.intStack[WorldMapType2.intStackSize + 1]);
			return 1;
		} else if (int_0 != 3103) {
			int int_4;
			if (int_0 == 3104) {
				string_2 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
				int_4 = 0;
				final boolean bool_2 = CacheableNode_Sub5.method831(string_2, 10, true);
				if (bool_2) {
					final int int_2 = Class104.parseInt(string_2, 10, true);
					int_4 = int_2;
				}

				Client.secretPacketBuffer1.putOpcode(38);
				Client.secretPacketBuffer1.putInt(int_4);
				return 1;
			} else if (int_0 == 3105) {
				string_2 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
				Client.secretPacketBuffer1.putOpcode(226);
				Client.secretPacketBuffer1.putByte(string_2.length() + 1);
				Client.secretPacketBuffer1.putString(string_2);
				return 1;
			} else if (int_0 == 3106) {
				string_2 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
				Client.secretPacketBuffer1.putOpcode(165);
				Client.secretPacketBuffer1.putByte(string_2.length() + 1);
				Client.secretPacketBuffer1.putString(string_2);
				return 1;
			} else {
				int int_3;
				String string_0;
				if (int_0 == 3107) {
					int_3 = Class45.intStack[--WorldMapType2.intStackSize];
					string_0 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
					Class46.method274(int_3, string_0);
					return 1;
				} else if (int_0 == 3108) {
					WorldMapType2.intStackSize -= 3;
					int_3 = Class45.intStack[WorldMapType2.intStackSize];
					int_4 = Class45.intStack[WorldMapType2.intStackSize + 1];
					final int int_1 = Class45.intStack[WorldMapType2.intStackSize + 2];
					final Widget widget_0 = Class18.method202(int_1);
					Enum2.method605(widget_0, int_3, int_4);
					return 1;
				} else if (int_0 == 3109) {
					WorldMapType2.intStackSize -= 2;
					int_3 = Class45.intStack[WorldMapType2.intStackSize];
					int_4 = Class45.intStack[WorldMapType2.intStackSize + 1];
					final Widget widget_1 = bool_0 ? Class45.aWidget6 : Class38.aWidget5;
					Enum2.method605(widget_1, int_3, int_4);
					return 1;
				} else if (int_0 == 3110) {
					Class14.aBool5 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
					return 1;
				} else if (int_0 == 3111) {
					Class45.intStack[++WorldMapType2.intStackSize - 1] = Class28.preferences.hideRoofs ? 1 : 0;
					return 1;
				} else if (int_0 == 3112) {
					Class28.preferences.hideRoofs = Class45.intStack[--WorldMapType2.intStackSize] == 1;
					PendingSpawn.method635();
					return 1;
				} else if (int_0 == 3113) {
					string_2 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
					final boolean bool_1 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
					Class5.method91(string_2, bool_1, false);
					return 1;
				} else if (int_0 == 3115) {
					int_3 = Class45.intStack[--WorldMapType2.intStackSize];
					Client.secretPacketBuffer1.putOpcode(124);
					Client.secretPacketBuffer1.putShort(int_3);
					return 1;
				} else if (int_0 == 3116) {
					int_3 = Class45.intStack[--WorldMapType2.intStackSize];
					BaseVarType.scriptStringStackSize -= 2;
					string_0 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize];
					final String string_1 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize + 1];
					if (string_0.length() > 500) {
						return 1;
					} else if (string_1.length() > 500) {
						return 1;
					} else {
						Client.secretPacketBuffer1.putOpcode(23);
						Client.secretPacketBuffer1.putShort(
								1 + DecorativeObject.getLength(string_0) + DecorativeObject.getLength(string_1));
						Client.secretPacketBuffer1.putString(string_1);
						Client.secretPacketBuffer1.putString(string_0);
						Client.secretPacketBuffer1.method676(int_3);
						return 1;
					}
				} else if (int_0 == 3117) {
					Client.aBool77 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
					return 1;
				} else {
					return 2;
				}
			}
		} else {
			Client.secretPacketBuffer1.putOpcode(89);

			for (WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable
					.method515(); widgetnode_0 != null; widgetnode_0 = (WidgetNode) Client.componentTable.method516()) {
				if ((widgetnode_0.owner == 0) || (widgetnode_0.owner == 3)) {
					MilliTimer.method690(widgetnode_0, true);
				}
			}

			if (Client.aWidget12 != null) {
				Class15.method196(Client.aWidget12);
				Client.aWidget12 = null;
			}

			return 1;
		}
	}

	public static int method941(final CharSequence charsequence_0, final CharSequence charsequence_1, final int int_0) {
		final int int_1 = charsequence_0.length();
		final int int_2 = charsequence_1.length();
		int int_3 = 0;
		int int_4 = 0;
		byte byte_0 = 0;
		byte byte_1 = 0;

		while (((int_3 - byte_0) < int_1) || ((int_4 - byte_1) < int_2)) {
			if ((int_3 - byte_0) >= int_1) {
				return -1;
			}

			if ((int_4 - byte_1) >= int_2) {
				return 1;
			}

			char char_0;
			if (byte_0 != 0) {
				char_0 = (char) byte_0;
			} else {
				char_0 = charsequence_0.charAt(int_3++);
			}

			char char_1;
			if (byte_1 != 0) {
				char_1 = (char) byte_1;
			} else {
				char_1 = charsequence_1.charAt(int_4++);
			}

			byte byte_2;
			if (char_0 == 198) {
				byte_2 = 69;
			} else if (char_0 == 230) {
				byte_2 = 101;
			} else if (char_0 == 223) {
				byte_2 = 115;
			} else if (char_0 == 338) {
				byte_2 = 69;
			} else if (char_0 == 339) {
				byte_2 = 101;
			} else {
				byte_2 = 0;
			}

			byte_0 = byte_2;
			byte byte_3;
			if (char_1 == 198) {
				byte_3 = 69;
			} else if (char_1 == 230) {
				byte_3 = 101;
			} else if (char_1 == 223) {
				byte_3 = 115;
			} else if (char_1 == 338) {
				byte_3 = 69;
			} else if (char_1 == 339) {
				byte_3 = 101;
			} else {
				byte_3 = 0;
			}

			byte_1 = byte_3;
			char_0 = DState.method312(char_0);
			char_1 = DState.method312(char_1);
			if ((char_0 != char_1) && (Character.toUpperCase(char_0) != Character.toUpperCase(char_1))) {
				char_0 = Character.toLowerCase(char_0);
				char_1 = Character.toLowerCase(char_1);
				if (char_1 != char_0) {
					return Class7.method117(char_0) - Class7.method117(char_1);
				}
			}
		}

		final int int_5 = Math.min(int_1, int_2);

		int int_6;
		char char_4;
		for (int_6 = 0; int_6 < int_5; int_6++) {
			char char_3 = charsequence_0.charAt(int_6);
			char_4 = charsequence_1.charAt(int_6);
			if ((char_3 != char_4) && (Character.toUpperCase(char_3) != Character.toUpperCase(char_4))) {
				char_3 = Character.toLowerCase(char_3);
				char_4 = Character.toLowerCase(char_4);
				if (char_4 != char_3) {
					return Class7.method117(char_3) - Class7.method117(char_4);
				}
			}
		}

		int_6 = int_1 - int_2;
		if (int_6 != 0) {
			return int_6;
		} else {
			for (int int_7 = 0; int_7 < int_5; int_7++) {
				char_4 = charsequence_0.charAt(int_7);
				final char char_2 = charsequence_1.charAt(int_7);
				if (char_2 != char_4) {
					return Class7.method117(char_4) - Class7.method117(char_2);
				}
			}

			return 0;
		}
	}

}
