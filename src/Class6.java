public class Class6 {

	static Varcs chatMessages;
	static IndexDataBase skin_ref;
	byte[][][] aByteArrayArrayArray1;
	int anInt25;

	Class6(final int int_0) {
		anInt25 = int_0;
	}

	void method93() {
		byte[] bytes_0 = new byte[anInt25 * anInt25];
		int int_0 = 0;

		int int_1;
		int int_2;
		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 <= int_1) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[0][0] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 <= int_1) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[0][1] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 >= int_1) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[0][2] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 >= int_1) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[0][3] = bytes_0;
	}

	int method94(int int_0, final int int_1) {
		if (int_1 == 9) {
			int_0 = (int_0 + 1) & 0x3;
		}

		if (int_1 == 10) {
			int_0 = (int_0 + 3) & 0x3;
		}

		if (int_1 == 11) {
			int_0 = (int_0 + 3) & 0x3;
		}

		return int_0;
	}

	void method95() {
		byte[] bytes_0 = new byte[anInt25 * anInt25];
		int int_0 = 0;

		int int_1;
		int int_2;
		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 <= (int_1 >> 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[1][0] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if ((int_0 >= 0) && (int_0 < bytes_0.length)) {
					if (int_2 >= (int_1 << 1)) {
						bytes_0[int_0] = -1;
					}

					++int_0;
				} else {
					++int_0;
				}
			}
		}

		aByteArrayArrayArray1[1][1] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = anInt25 - 1; int_2 >= 0; --int_2) {
				if (int_2 <= (int_1 >> 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[1][2] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = anInt25 - 1; int_2 >= 0; --int_2) {
				if (int_2 >= (int_1 << 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[1][3] = bytes_0;
	}

	int method96(final int int_0) {
		return (int_0 != 9) && (int_0 != 10) ? (int_0 == 11 ? 8 : int_0) : 1;
	}

	void method97() {
		byte[] bytes_0 = new byte[anInt25 * anInt25];
		int int_0 = 0;

		int int_1;
		int int_2;
		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = anInt25 - 1; int_2 >= 0; --int_2) {
				if (int_2 <= (int_1 >> 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[2][0] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 >= (int_1 << 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[2][1] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 <= (int_1 >> 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[2][2] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = anInt25 - 1; int_2 >= 0; --int_2) {
				if (int_2 >= (int_1 << 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[2][3] = bytes_0;
	}

	void method98() {
		byte[] bytes_0 = new byte[anInt25 * anInt25];
		int int_0 = 0;

		int int_1;
		int int_2;
		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 >= (int_1 >> 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[3][0] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 <= (int_1 << 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[3][1] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = anInt25 - 1; int_2 >= 0; --int_2) {
				if (int_2 >= (int_1 >> 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[3][2] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = anInt25 - 1; int_2 >= 0; --int_2) {
				if (int_2 <= (int_1 << 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[3][3] = bytes_0;
	}

	void method99() {
		byte[] bytes_0 = new byte[anInt25 * anInt25];
		int int_0 = 0;

		int int_1;
		int int_2;
		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = anInt25 - 1; int_2 >= 0; --int_2) {
				if (int_2 >= (int_1 >> 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[4][0] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 <= (int_1 << 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[4][1] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = 0; int_2 < anInt25; int_2++) {
				if (int_2 >= (int_1 >> 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[4][2] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_0 = 0;

		for (int_1 = 0; int_1 < anInt25; int_1++) {
			for (int_2 = anInt25 - 1; int_2 >= 0; --int_2) {
				if (int_2 <= (int_1 << 1)) {
					bytes_0[int_0] = -1;
				}

				++int_0;
			}
		}

		aByteArrayArrayArray1[4][3] = bytes_0;
	}

	void method100() {
		byte[] bytes_0 = new byte[anInt25 * anInt25];
		bytes_0 = new byte[anInt25 * anInt25];
		int int_2 = 0;

		int int_0;
		int int_1;
		for (int_0 = 0; int_0 < anInt25; int_0++) {
			for (int_1 = 0; int_1 < anInt25; int_1++) {
				if (int_1 <= (anInt25 / 2)) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[5][0] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = 0; int_0 < anInt25; int_0++) {
			for (int_1 = 0; int_1 < anInt25; int_1++) {
				if (int_0 <= (anInt25 / 2)) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[5][1] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = 0; int_0 < anInt25; int_0++) {
			for (int_1 = 0; int_1 < anInt25; int_1++) {
				if (int_1 >= (anInt25 / 2)) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[5][2] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = 0; int_0 < anInt25; int_0++) {
			for (int_1 = 0; int_1 < anInt25; int_1++) {
				if (int_0 >= (anInt25 / 2)) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[5][3] = bytes_0;
	}

	void method101() {
		byte[] bytes_0 = new byte[anInt25 * anInt25];
		bytes_0 = new byte[anInt25 * anInt25];
		int int_2 = 0;

		int int_0;
		int int_1;
		for (int_0 = 0; int_0 < anInt25; int_0++) {
			for (int_1 = 0; int_1 < anInt25; int_1++) {
				if (int_1 <= (int_0 - (anInt25 / 2))) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[6][0] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = anInt25 - 1; int_0 >= 0; --int_0) {
			for (int_1 = 0; int_1 < anInt25; int_1++) {
				if (int_1 <= (int_0 - (anInt25 / 2))) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[6][1] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = anInt25 - 1; int_0 >= 0; --int_0) {
			for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
				if (int_1 <= (int_0 - (anInt25 / 2))) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[6][2] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = 0; int_0 < anInt25; int_0++) {
			for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
				if (int_1 <= (int_0 - (anInt25 / 2))) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[6][3] = bytes_0;
	}

	void method102(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			int int_6, int int_7) {
		if ((int_6 != 0) && (anInt25 != 0)) {
			if (aByteArrayArrayArray1 != null) {
				int_7 = method94(int_7, int_6);
				int_6 = method96(int_6);
				Rasterizer2D.method855(int_0, int_1, int_4, int_5, int_2, int_3,
						aByteArrayArrayArray1[int_6 - 1][int_7], anInt25);
			}
		}
	}

	void method103() {
		byte[] bytes_0 = new byte[anInt25 * anInt25];
		bytes_0 = new byte[anInt25 * anInt25];
		int int_2 = 0;

		int int_0;
		int int_1;
		for (int_0 = 0; int_0 < anInt25; int_0++) {
			for (int_1 = 0; int_1 < anInt25; int_1++) {
				if (int_1 >= (int_0 - (anInt25 / 2))) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[7][0] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = anInt25 - 1; int_0 >= 0; --int_0) {
			for (int_1 = 0; int_1 < anInt25; int_1++) {
				if (int_1 >= (int_0 - (anInt25 / 2))) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[7][1] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = anInt25 - 1; int_0 >= 0; --int_0) {
			for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
				if (int_1 >= (int_0 - (anInt25 / 2))) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[7][2] = bytes_0;
		bytes_0 = new byte[anInt25 * anInt25];
		int_2 = 0;

		for (int_0 = 0; int_0 < anInt25; int_0++) {
			for (int_1 = anInt25 - 1; int_1 >= 0; --int_1) {
				if (int_1 >= (int_0 - (anInt25 / 2))) {
					bytes_0[int_2] = -1;
				}

				++int_2;
			}
		}

		aByteArrayArrayArray1[7][3] = bytes_0;
	}

	void method104() {
		if (aByteArrayArrayArray1 == null) {
			aByteArrayArrayArray1 = new byte[8][4][];
			method93();
			method95();
			method97();
			method98();
			method99();
			method100();
			method101();
			method103();
		}
	}

	public static synchronized long currentTimeMs() {
		final long long_0 = System.currentTimeMillis();
		if (long_0 < Class63.aLong8) {
			Class63.aLong9 += Class63.aLong8 - long_0;
		}

		Class63.aLong8 = long_0;
		return Class63.aLong9 + long_0;
	}

	static final void method105() {
		if (KeyFocusListener.soundSystem1 != null) {
			KeyFocusListener.soundSystem1.method332();
		}

		if (AClass3.soundSystem0 != null) {
			AClass3.soundSystem0.method332();
		}

	}

	static int getWidgetConfig(final Widget widget_0) {
		final WidgetConfig widgetconfig_0 = (WidgetConfig) Client.widgetFlags
				.get(((long) widget_0.anInt289 << 32) + widget_0.index);
		return widgetconfig_0 != null ? widgetconfig_0.config : widget_0.config;
	}

	static String getColTags(final int int_0) {
		return "<col=" + Integer.toHexString(int_0) + ">";
	}

	static final void method106() {
		Client.secretPacketBuffer2.bitAccess();
		final int int_0 = Client.secretPacketBuffer2.getBits(8);
		int int_1;
		if (int_0 < Client.anInt690) {
			for (int_1 = int_0; int_1 < Client.anInt690; int_1++) {
				Client.anIntArray166[++Client.anInt748 - 1] = Client.npcIndices[int_1];
			}
		}

		if (int_0 > Client.anInt690) {
			throw new RuntimeException("");
		} else {
			Client.anInt690 = 0;

			for (int_1 = 0; int_1 < int_0; int_1++) {
				final int int_2 = Client.npcIndices[int_1];
				final NPC npc_0 = Client.cachedNPCs[int_2];
				final int int_3 = Client.secretPacketBuffer2.getBits(1);
				if (int_3 == 0) {
					Client.npcIndices[++Client.anInt690 - 1] = int_2;
					npc_0.anInt562 = Client.gameCycle;
				} else {
					final int int_4 = Client.secretPacketBuffer2.getBits(2);
					if (int_4 == 0) {
						Client.npcIndices[++Client.anInt690 - 1] = int_2;
						npc_0.anInt562 = Client.gameCycle;
						Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = int_2;
					} else {
						int int_5;
						int int_6;
						if (int_4 == 1) {
							Client.npcIndices[++Client.anInt690 - 1] = int_2;
							npc_0.anInt562 = Client.gameCycle;
							int_5 = Client.secretPacketBuffer2.getBits(3);
							npc_0.method999(int_5, (byte) 1);
							int_6 = Client.secretPacketBuffer2.getBits(1);
							if (int_6 == 1) {
								Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = int_2;
							}
						} else if (int_4 == 2) {
							Client.npcIndices[++Client.anInt690 - 1] = int_2;
							npc_0.anInt562 = Client.gameCycle;
							int_5 = Client.secretPacketBuffer2.getBits(3);
							npc_0.method999(int_5, (byte) 2);
							int_6 = Client.secretPacketBuffer2.getBits(3);
							npc_0.method999(int_6, (byte) 2);
							final int int_7 = Client.secretPacketBuffer2.getBits(1);
							if (int_7 == 1) {
								Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = int_2;
							}
						} else if (int_4 == 3) {
							Client.anIntArray166[++Client.anInt748 - 1] = int_2;
						}
					}
				}
			}

		}
	}

	public static final boolean method107(final String string_0, final String string_1, final String string_2,
			final String string_3) {
		return (string_0 != null) && (string_2 != null) ? (!string_0.startsWith("#") && !string_2.startsWith("#")
				? string_1.equals(string_3) : string_0.equals(string_2)) : false;
	}

}
