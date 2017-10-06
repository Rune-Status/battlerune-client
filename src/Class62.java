public class Class62 {

	static int anInt163;
	static int anInt164;
	static int anInt165;
	static byte[][] aByteArrayArray4;
	static byte[][] aByteArrayArray5;
	static byte[][] aByteArrayArray6;

	static {
		anInt163 = 0;
		anInt164 = 0;
		anInt165 = 0;
		aByteArrayArray4 = new byte[1000][];
		aByteArrayArray5 = new byte[250][];
		aByteArrayArray6 = new byte[50][];
	}

	static synchronized byte[] method384(final int int_0) {
		byte[] bytes_0;
		if ((int_0 == 100) && (anInt163 > 0)) {
			bytes_0 = aByteArrayArray4[--anInt163];
			aByteArrayArray4[anInt163] = null;
			return bytes_0;
		} else if ((int_0 == 5000) && (anInt164 > 0)) {
			bytes_0 = aByteArrayArray5[--anInt164];
			aByteArrayArray5[anInt164] = null;
			return bytes_0;
		} else if ((int_0 == 30000) && (anInt165 > 0)) {
			bytes_0 = aByteArrayArray6[--anInt165];
			aByteArrayArray6[anInt165] = null;
			return bytes_0;
		} else {
			return new byte[int_0];
		}
	}

	public static int method385(final int int_0, final int int_1, int int_2) {
		int_2 &= 0x3;
		return int_2 == 0 ? int_1 : (int_2 == 1 ? 7 - int_0 : (int_2 == 2 ? 7 - int_1 : int_0));
	}

	static int method386(int int_0, final Script script_0, final boolean bool_0) {
		int int_1 = -1;
		Widget widget_0;
		if (int_0 >= 2000) {
			int_0 -= 1000;
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			widget_0 = Class18.method202(int_1);
		} else {
			widget_0 = bool_0 ? Class45.aWidget6 : Class38.aWidget5;
		}

		if (int_0 == 1100) {
			WorldMapType2.intStackSize -= 2;
			widget_0.scrollX = Class45.intStack[WorldMapType2.intStackSize];
			if (widget_0.scrollX > (widget_0.scrollWidth - widget_0.width)) {
				widget_0.scrollX = widget_0.scrollWidth - widget_0.width;
			}

			if (widget_0.scrollX < 0) {
				widget_0.scrollX = 0;
			}

			widget_0.scrollY = Class45.intStack[WorldMapType2.intStackSize + 1];
			if (widget_0.scrollY > (widget_0.scrollHeight - widget_0.height)) {
				widget_0.scrollY = widget_0.scrollHeight - widget_0.height;
			}

			if (widget_0.scrollY < 0) {
				widget_0.scrollY = 0;
			}

			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1101) {
			widget_0.textColor = Class45.intStack[--WorldMapType2.intStackSize];
			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1102) {
			widget_0.aBool28 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1103) {
			widget_0.opacity = Class45.intStack[--WorldMapType2.intStackSize];
			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1104) {
			widget_0.anInt309 = Class45.intStack[--WorldMapType2.intStackSize];
			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1105) {
			widget_0.spriteId = Class45.intStack[--WorldMapType2.intStackSize];
			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1106) {
			widget_0.textureId = Class45.intStack[--WorldMapType2.intStackSize];
			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1107) {
			widget_0.aBool31 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1108) {
			widget_0.modelType = 1;
			widget_0.modelId = Class45.intStack[--WorldMapType2.intStackSize];
			Class15.method196(widget_0);
			return 1;
		} else if (int_0 == 1109) {
			WorldMapType2.intStackSize -= 6;
			widget_0.anInt313 = Class45.intStack[WorldMapType2.intStackSize];
			widget_0.anInt314 = Class45.intStack[WorldMapType2.intStackSize + 1];
			widget_0.rotationX = Class45.intStack[WorldMapType2.intStackSize + 2];
			widget_0.rotationZ = Class45.intStack[WorldMapType2.intStackSize + 3];
			widget_0.rotationY = Class45.intStack[WorldMapType2.intStackSize + 4];
			widget_0.modelZoom = Class45.intStack[WorldMapType2.intStackSize + 5];
			Class15.method196(widget_0);
			return 1;
		} else {
			int int_3;
			if (int_0 == 1110) {
				int_3 = Class45.intStack[--WorldMapType2.intStackSize];
				if (int_3 != widget_0.anInt295) {
					widget_0.anInt295 = int_3;
					widget_0.anInt301 = 0;
					widget_0.anInt300 = 0;
					Class15.method196(widget_0);
				}

				return 1;
			} else if (int_0 == 1111) {
				widget_0.aBool33 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1112) {
				final String string_0 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
				if (!string_0.equals(widget_0.text)) {
					widget_0.text = string_0;
					Class15.method196(widget_0);
				}

				return 1;
			} else if (int_0 == 1113) {
				widget_0.fontId = Class45.intStack[--WorldMapType2.intStackSize];
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1114) {
				WorldMapType2.intStackSize -= 3;
				widget_0.anInt310 = Class45.intStack[WorldMapType2.intStackSize];
				widget_0.anInt311 = Class45.intStack[WorldMapType2.intStackSize + 1];
				widget_0.anInt312 = Class45.intStack[WorldMapType2.intStackSize + 2];
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1115) {
				widget_0.textShadowed = Class45.intStack[--WorldMapType2.intStackSize] == 1;
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1116) {
				widget_0.borderThickness = Class45.intStack[--WorldMapType2.intStackSize];
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1117) {
				widget_0.sprite2 = Class45.intStack[--WorldMapType2.intStackSize];
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1118) {
				widget_0.flippedVertically = Class45.intStack[--WorldMapType2.intStackSize] == 1;
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1119) {
				widget_0.flippedHorizontally = Class45.intStack[--WorldMapType2.intStackSize] == 1;
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1120) {
				WorldMapType2.intStackSize -= 2;
				widget_0.scrollWidth = Class45.intStack[WorldMapType2.intStackSize];
				widget_0.scrollHeight = Class45.intStack[WorldMapType2.intStackSize + 1];
				Class15.method196(widget_0);
				if ((int_1 != -1) && (widget_0.type == 0)) {
					Class5.method89(Widget.widgets[int_1 >> 16], widget_0, false);
				}

				return 1;
			} else if (int_0 == 1121) {
				int_3 = widget_0.anInt289;
				final int int_2 = widget_0.index;
				Client.secretPacketBuffer1.putOpcode(213);
				Client.secretPacketBuffer1.putLEInt(int_3);
				Client.secretPacketBuffer1.putLEShortA(int_2);
				Client.aWidget12 = widget_0;
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1122) {
				widget_0.anInt286 = Class45.intStack[--WorldMapType2.intStackSize];
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1123) {
				widget_0.anInt303 = Class45.intStack[--WorldMapType2.intStackSize];
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1124) {
				widget_0.anInt308 = Class45.intStack[--WorldMapType2.intStackSize];
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 == 1125) {
				int_3 = Class45.intStack[--WorldMapType2.intStackSize];
				final Enum9[] enum9s_0 = new Enum9[] { Enum9.anEnum9_3, Enum9.anEnum9_2, Enum9.anEnum9_5,
						Enum9.anEnum9_6, Enum9.anEnum9_4 };
				final Enum9 enum9_0 = (Enum9) PendingSpawn.forOrdinal(enum9s_0, int_3);
				if (enum9_0 != null) {
					widget_0.anEnum9_1 = enum9_0;
					Class15.method196(widget_0);
				}

				return 1;
			} else if (int_0 == 1126) {
				final boolean bool_1 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
				widget_0.aBool29 = bool_1;
				return 1;
			} else {
				return 2;
			}
		}
	}

}
