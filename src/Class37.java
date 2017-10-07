import java.math.BigInteger;

public class Class37 {

	static final BigInteger rsaKeyExponent;
	static final BigInteger rsaKeyModulus;
	public static int[] anIntArray16;

	static {
		rsaKeyExponent = new BigInteger("65537");
		rsaKeyModulus = new BigInteger(
				"94904992129904410061849432720048295856082621425118273522925386720620318960919649616773860564226013741030211135158797393273808089000770687087538386210551037271884505217469135237269866084874090369313013016228010726263597258760029391951907049483204438424117908438852851618778702170822555894057960542749301583313");
	}

	static boolean method250(final Widget widget_0) {
		if (Client.aBool79) {
			if (Class6.getWidgetConfig(widget_0) != 0) {
				return false;
			}

			if (widget_0.type == 0) {
				return false;
			}
		}

		return widget_0.isHidden;
	}

	public static void method251() {
		synchronized (KeyFocusListener.keyboard) {
			++KeyFocusListener.keyboardIdleTicks;
			KeyFocusListener.anInt127 = KeyFocusListener.anInt129;
			KeyFocusListener.anInt128 = 0;
			int int_0;
			if (KeyFocusListener.anInt124 < 0) {
				for (int_0 = 0; int_0 < 112; int_0++) {
					KeyFocusListener.aBoolArray3[int_0] = false;
				}

				KeyFocusListener.anInt124 = KeyFocusListener.anInt125;
			} else {
				while (KeyFocusListener.anInt125 != KeyFocusListener.anInt124) {
					int_0 = KeyFocusListener.anIntArray30[KeyFocusListener.anInt125];
					KeyFocusListener.anInt125 = (KeyFocusListener.anInt125 + 1) & 0x7F;
					if (int_0 < 0) {
						KeyFocusListener.aBoolArray3[~int_0] = false;
					} else {
						if (!KeyFocusListener.aBoolArray3[int_0]
								&& (KeyFocusListener.anInt128 < (KeyFocusListener.anIntArray32.length - 1))) {
							KeyFocusListener.anIntArray32[++KeyFocusListener.anInt128 - 1] = int_0;
						}

						KeyFocusListener.aBoolArray3[int_0] = true;
					}
				}
			}

			if (KeyFocusListener.anInt128 > 0) {
				KeyFocusListener.keyboardIdleTicks = 0;
			}

			KeyFocusListener.anInt129 = KeyFocusListener.anInt126;
		}
	}

	static final void initializeGPI(final PacketBuffer packetbuffer_0) {
		packetbuffer_0.bitAccess();
		final int int_0 = Client.localInteractingIndex;
		final Player player_0 = Script.localPlayer = Client.cachedPlayers[int_0] = new Player();
		player_0.anInt637 = int_0;
		final int int_1 = packetbuffer_0.getBits(30);
		final byte byte_0 = (byte) (int_1 >> 28);
		final int int_2 = (int_1 >> 14) & 0x3FFF;
		final int int_3 = int_1 & 0x3FFF;
		player_0.pathX[0] = int_2 - AClass2.baseX;
		player_0.anInt547 = (player_0.pathX[0] << 7) + (player_0.getSize() << 6);
		player_0.pathY[0] = int_3 - AClass4_Sub1.baseY;
		player_0.anInt550 = (player_0.pathY[0] << 7) + (player_0.getSize() << 6);
		AClass1_Sub1.plane = player_0.anInt632 = byte_0;

		if (Class40.aBufferArray1[int_0] != null) {
			player_0.decodeApperance(Class40.aBufferArray1[int_0]);
		}

		Class40.anInt94 = 0;
		Class40.anIntArray17[++Class40.anInt94 - 1] = int_0;
		Class40.aByteArray4[int_0] = 0;
		Class40.anInt95 = 0;

		for (int int_4 = 1; int_4 < 2048; int_4++) {
			if (int_4 != int_0) {
				final int int_5 = packetbuffer_0.getBits(18);
				final int int_6 = int_5 >> 16;
				final int int_7 = (int_5 >> 8) & 0x255;
				final int int_8 = int_5 & 0x255;
				Class40.anIntArray19[int_4] = int_8 + (int_7 << 14) + (int_6 << 28);
				Class40.anIntArray20[int_4] = 0;
				Class40.anIntArray21[int_4] = -1;
				Class40.anIntArray18[++Class40.anInt95 - 1] = int_4;
				Class40.aByteArray4[int_4] = 0;
			}
		}

		packetbuffer_0.byteAccess();
	}

	static void method252() {
		if (Class49.renderOverview != null) {
			Class49.renderOverview.method34(AClass1_Sub1.plane, (Script.localPlayer.anInt547 >> 7) + AClass2.baseX,
					(Script.localPlayer.anInt550 >> 7) + AClass4_Sub1.baseY, false);
			Class49.renderOverview.method35();
		}

	}

	public static boolean method253(final int int_0, final int int_1) {
		return ((int_0 >> (int_1 + 1)) & 0x1) != 0;
	}

}
