import java.io.File;
import java.io.RandomAccessFile;

public class Class46 {

	public static boolean aBool11;
	public static boolean aBool12;
	public static boolean aBool13;
	public static Class49 aClass49_1;
	public static CombatInfoList aCombatInfoList1;
	static int cameraY;

	static {
		aBool11 = false;
		aBool12 = false;
		aBool13 = false;
		aClass49_1 = Class49.aClass49_2;
		aCombatInfoList1 = new CombatInfoList();
	}

	public static String getString(final byte[] bytes_0, final int int_0, final int int_1) {
		final char[] chars_0 = new char[int_1];
		int int_2 = 0;

		for (int int_3 = 0; int_3 < int_1; int_3++) {
			int int_4 = bytes_0[int_3 + int_0] & 0xFF;
			if (int_4 != 0) {
				if ((int_4 >= 128) && (int_4 < 160)) {
					char char_0 = Class98.aCharArray3[int_4 - 128];
					if (char_0 == 0) {
						char_0 = 63;
					}

					int_4 = char_0;
				}

				chars_0[int_2++] = (char) int_4;
			}
		}

		return new String(chars_0, 0, int_2);
	}

	static void method270() {
		for (WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable
				.method515(); widgetnode_0 != null; widgetnode_0 = (WidgetNode) Client.componentTable.method516()) {
			final int int_0 = widgetnode_0.anInt392;
			if (Class14.loadWidget(int_0)) {
				boolean bool_0 = true;
				final Widget[] widgets_0 = Widget.widgets[int_0];

				int int_1;
				for (int_1 = 0; int_1 < widgets_0.length; int_1++) {
					if (widgets_0[int_1] != null) {
						bool_0 = widgets_0[int_1].hasScript;
						break;
					}
				}

				if (!bool_0) {
					int_1 = (int) widgetnode_0.hash;
					final Widget widget_0 = Class18.method202(int_1);
					if (widget_0 != null) {
						Class15.method196(widget_0);
					}
				}
			}
		}

	}

	static void method271() {
		Class18.anInt71 = 99;
		Item.underlayIds = new byte[4][104][104];
		Class18.overlayIds = new byte[4][104][104];
		Class33.overlayPaths = new byte[4][104][104];
		Class18.overlayRotations = new byte[4][104][104];
		AClass4.anIntArrayArrayArray1 = new int[4][105][105];
		Class18.aByteArrayArrayArray4 = new byte[4][105][105];
		FileRequest.anIntArrayArray14 = new int[105][105];
		Class18.blendedHue = new int[104];
		Class42.blendedSaturation = new int[104];
		AClass4_Sub1.anIntArray82 = new int[104];
		Class18.anIntArray8 = new int[104];
		Varcs.anIntArray59 = new int[104];
	}

	public static boolean method272(final File file_0, final boolean bool_0) {
		try {
			final RandomAccessFile randomaccessfile_0 = new RandomAccessFile(file_0, "rw");
			final int int_0 = randomaccessfile_0.read();
			randomaccessfile_0.seek(0L);
			randomaccessfile_0.write(int_0);
			randomaccessfile_0.seek(0L);
			randomaccessfile_0.close();
			if (bool_0) {
				file_0.delete();
			}

			return true;
		} catch (final Exception exception_0) {
			return false;
		}
	}

	static final void method273() {
		if (Client.anInt722 != AClass1_Sub1.plane) {
			Client.anInt722 = AClass1_Sub1.plane;
			XItemContainer.method686(AClass1_Sub1.plane);
		}

	}

	static void method274(final int int_0, final String string_0) {
		final int int_1 = Class40.anInt94;
		final int[] ints_0 = Class40.anIntArray17;
		boolean bool_0 = false;

		for (int int_2 = 0; int_2 < int_1; int_2++) {
			final Player player_0 = Client.cachedPlayers[ints_0[int_2]];
			if ((player_0 != null) && (player_0 != Script.localPlayer) && (player_0.name != null)
					&& player_0.name.equalsIgnoreCase(string_0)) {
				if (int_0 == 1) {
					Client.secretPacketBuffer1.putOpcode(143);
					Client.secretPacketBuffer1.putByte(0);
					Client.secretPacketBuffer1.putShortOb2(ints_0[int_2]);
				} else if (int_0 == 4) {
					Client.secretPacketBuffer1.putOpcode(49);
					Client.secretPacketBuffer1.putShort(ints_0[int_2]);
					Client.secretPacketBuffer1.putShortLE(0);
				} else if (int_0 == 6) {
					Client.secretPacketBuffer1.putOpcode(20);
					Client.secretPacketBuffer1.putShortLE(0);
					Client.secretPacketBuffer1.putShort(ints_0[int_2]);
				} else if (int_0 == 7) {
					Client.secretPacketBuffer1.putOpcode(93);
					Client.secretPacketBuffer1.method675(0);
					Client.secretPacketBuffer1.putLEShortA(ints_0[int_2]);
				}

				bool_0 = true;
				break;
			}
		}

		if (!bool_0) {
			WidgetNode.sendGameMessage(4, "", "Unable to find " + string_0);
		}

	}

}
