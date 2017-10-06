import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class Class5 {

	static final Class5 aClass5_1;
	static final Class5 aClass5_2;
	final int anInt24;

	static {
		aClass5_2 = new Class5(0);
		aClass5_1 = new Class5(1);
	}

	Class5(final int int_0) {
		anInt24 = int_0;
	}

	public static void decodeSprite(final byte[] bytes_0) {
		final Buffer buffer_0 = new Buffer(bytes_0);
		buffer_0.offset = bytes_0.length - 2;
		Class108.anInt218 = buffer_0.readUnsignedShort();
		Class108.anIntArray56 = new int[Class108.anInt218];
		Class12.offsetsY = new int[Class108.anInt218];
		Class108.anIntArray57 = new int[Class108.anInt218];
		Class37.anIntArray16 = new int[Class108.anInt218];
		Class66.spritePixels = new byte[Class108.anInt218][];
		buffer_0.offset = bytes_0.length - 7 - (Class108.anInt218 * 8);
		Class108.anInt216 = buffer_0.readUnsignedShort();
		Class108.anInt217 = buffer_0.readUnsignedShort();
		final int int_0 = (buffer_0.readUnsignedByte() & 0xFF) + 1;

		int int_1;
		for (int_1 = 0; int_1 < Class108.anInt218; int_1++) {
			Class108.anIntArray56[int_1] = buffer_0.readUnsignedShort();
		}

		for (int_1 = 0; int_1 < Class108.anInt218; int_1++) {
			Class12.offsetsY[int_1] = buffer_0.readUnsignedShort();
		}

		for (int_1 = 0; int_1 < Class108.anInt218; int_1++) {
			Class108.anIntArray57[int_1] = buffer_0.readUnsignedShort();
		}

		for (int_1 = 0; int_1 < Class108.anInt218; int_1++) {
			Class37.anIntArray16[int_1] = buffer_0.readUnsignedShort();
		}

		buffer_0.offset = bytes_0.length - 7 - (Class108.anInt218 * 8) - ((int_0 - 1) * 3);
		Class108.anIntArray58 = new int[int_0];

		for (int_1 = 1; int_1 < int_0; int_1++) {
			Class108.anIntArray58[int_1] = buffer_0.read24BitInt();
			if (Class108.anIntArray58[int_1] == 0) {
				Class108.anIntArray58[int_1] = 1;
			}
		}

		buffer_0.offset = 0;

		for (int_1 = 0; int_1 < Class108.anInt218; int_1++) {
			final int int_2 = Class108.anIntArray57[int_1];
			final int int_3 = Class37.anIntArray16[int_1];
			final int int_4 = int_3 * int_2;
			final byte[] bytes_1 = new byte[int_4];
			Class66.spritePixels[int_1] = bytes_1;
			final int int_5 = buffer_0.readUnsignedByte();
			int int_6;
			if (int_5 == 0) {
				for (int_6 = 0; int_6 < int_4; int_6++) {
					bytes_1[int_6] = buffer_0.readByte();
				}
			} else if (int_5 == 1) {
				for (int_6 = 0; int_6 < int_2; int_6++) {
					for (int int_7 = 0; int_7 < int_3; int_7++) {
						bytes_1[int_6 + (int_7 * int_2)] = buffer_0.readByte();
					}
				}
			}
		}

	}

	static void method89(final Widget[] widgets_0, final Widget widget_0, final boolean bool_0) {
		final int int_0 = widget_0.scrollWidth != 0 ? widget_0.scrollWidth : widget_0.width;
		final int int_1 = widget_0.scrollHeight != 0 ? widget_0.scrollHeight : widget_0.height;
		Class50.method306(widgets_0, widget_0.anInt289, int_0, int_1, bool_0);
		if (widget_0.children != null) {
			Class50.method306(widget_0.children, widget_0.anInt289, int_0, int_1, bool_0);
		}

		final WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable.get(widget_0.anInt289);
		if (widgetnode_0 != null) {
			final int int_2 = widgetnode_0.anInt392;
			if (Class14.loadWidget(int_2)) {
				Class50.method306(Widget.widgets[int_2], -1, int_0, int_1, bool_0);
			}
		}

		if (widget_0.contentType == 1337) {
			;
		}

	}

	static void method90() {
		for (int int_0 = 0; int_0 < Client.menuOptionCount; int_0++) {
			if (FaceNormal.method540(Client.menuTypes[int_0])) {
				if (int_0 < (Client.menuOptionCount - 1)) {
					for (int int_1 = int_0; int_1 < (Client.menuOptionCount - 1); int_1++) {
						Client.menuOptions[int_1] = Client.menuOptions[int_1 + 1];
						Client.menuTargets[int_1] = Client.menuTargets[int_1 + 1];
						Client.menuTypes[int_1] = Client.menuTypes[int_1 + 1];
						Client.menuIdentifiers[int_1] = Client.menuIdentifiers[int_1 + 1];
						Client.menuActionParams0[int_1] = Client.menuActionParams0[int_1 + 1];
						Client.menuActionParams1[int_1] = Client.menuActionParams1[int_1 + 1];
					}
				}

				--Client.menuOptionCount;
			}
		}

	}

	public static void method91(final String string_0, final boolean bool_0, final boolean bool_1) {
		if (!bool_0) {
			NPC.method1002(string_0, 3, "openjs");
		} else {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(string_0));
					return;
				} catch (final Exception exception_0) {
					;
				}
			}

			if (Class19.aString3.startsWith("win")) {
				NPC.method1002(string_0, 0, "openjs");
			} else if (Class19.aString3.startsWith("mac")) {
				NPC.method1002(string_0, 1, "openjs");
			} else {
				NPC.method1002(string_0, 2, "openjs");
			}
		}
	}

	static int method92(final int int_0, final Script script_0, final boolean bool_0) {
		final Widget widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
		if (int_0 == 2800) {
			final int[] ints_0 = Class45.intStack;
			final int int_1 = ++WorldMapType2.intStackSize - 1;
			final int int_2 = Class6.getWidgetConfig(widget_0);
			final int int_3 = (int_2 >> 11) & 0x3F;
			ints_0[int_1] = int_3;
			return 1;
		} else if (int_0 != 2801) {
			if (int_0 == 2802) {
				if (widget_0.name == null) {
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
				} else {
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = widget_0.name;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int int_4 = Class45.intStack[--WorldMapType2.intStackSize];
			--int_4;
			if ((widget_0.actions != null) && (int_4 < widget_0.actions.length) && (widget_0.actions[int_4] != null)) {
				Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = widget_0.actions[int_4];
			} else {
				Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
			}

			return 1;
		}
	}

}
