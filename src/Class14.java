public class Class14 {

	static int anInt54;
	static boolean aBool5;
	static int anInt55;
	String aString1;
	Class43 aClass43_1;
	int anInt56;
	int anInt57;

	Class14(final String string_0, final int int_0, final int int_1, final Class43 class43_0) {
		aString1 = string_0;
		anInt56 = int_0;
		anInt57 = int_1;
		aClass43_1 = class43_0;
	}

	public static boolean loadWidget(final int int_0) {
		if (Widget.validInterfaces[int_0]) {
			return true;
		} else if (!Class49.widgetIndex.containsFile(int_0)) {
			return false;
		} else {
			final int int_1 = Class49.widgetIndex.fileCount(int_0);
			if (int_1 == 0) {
				Widget.validInterfaces[int_0] = true;
				return true;
			} else {
				if (Widget.widgets[int_0] == null) {
					Widget.widgets[int_0] = new Widget[int_1];
				}

				for (int int_2 = 0; int_2 < int_1; int_2++) {
					if (Widget.widgets[int_0][int_2] == null) {
						final byte[] bytes_0 = Class49.widgetIndex.getConfigData(int_0, int_2);
						if (bytes_0 != null) {
							Widget.widgets[int_0][int_2] = new Widget();
							Widget.widgets[int_0][int_2].anInt289 = int_2 + (int_0 << 16);
							if (bytes_0[0] == -1) {
								Widget.widgets[int_0][int_2].decodeActive(new Buffer(bytes_0));
							} else {
								Widget.widgets[int_0][int_2].decode(new Buffer(bytes_0));
							}
						}
					}
				}

				Widget.validInterfaces[int_0] = true;
				return true;
			}
		}
	}

	public static final void method189(final long long_0) {
		if (long_0 > 0L) {
			if ((long_0 % 10L) == 0L) {
				final long long_1 = long_0 - 1L;

				try {
					Thread.sleep(long_1);
				} catch (final InterruptedException interruptedexception_1) {
					;
				}

				try {
					Thread.sleep(1L);
				} catch (final InterruptedException interruptedexception_2) {
					;
				}
			} else {
				try {
					Thread.sleep(long_0);
				} catch (final InterruptedException interruptedexception_0) {
					;
				}
			}
		}
	}

	static final void method190(final Class30 class30_0, final int int_0, final int int_1) {
		Class11.menuAction(class30_0.anInt87, class30_0.anInt88, class30_0.anInt89, class30_0.anInt90,
				class30_0.aString5, class30_0.aString5, int_0, int_1);
	}

	public static void method191(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1,
			final boolean bool_0, final Font font_0) {
		FrameMap.item_ref = indexdatabase_0;
		ItemComposition.anIndexDataBase29 = indexdatabase_1;
		ItemComposition.isMembersWorld = bool_0;
		ItemComposition.anInt532 = FrameMap.item_ref.fileCount(10);
		ItemComposition.aFont5 = font_0;
	}

	static final int method192(final int int_0, final int int_1, final int int_2, final int int_3) {
		final int int_4 = (65536 - Graphics3D.COSINE[(int_2 * 1024) / int_3]) >> 1;
		return ((int_4 * int_1) >> 16) + (((65536 - int_4) * int_0) >> 16);
	}

	static int method193(final int int_0, final Script script_0, final boolean bool_0) {
		Widget widget_0;
		if (int_0 == 2700) {
			widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.itemId;
			return 1;
		} else if (int_0 == 2701) {
			widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
			if (widget_0.itemId != -1) {
				Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.itemQuantity;
			} else {
				Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
			}

			return 1;
		} else if (int_0 == 2702) {
			final int int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			final WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable.get(int_1);
			if (widgetnode_0 != null) {
				Class45.intStack[++WorldMapType2.intStackSize - 1] = 1;
			} else {
				Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
			}

			return 1;
		} else if (int_0 == 2706) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.widgetRoot;
			return 1;
		} else {
			return 2;
		}
	}

	static int method194(final int int_0, final int int_1, final int int_2) {
		return (Class18.tileSettings[int_0][int_1][int_2] & 0x8) != 0 ? 0
				: ((int_0 > 0) && ((Class18.tileSettings[1][int_1][int_2] & 0x2) != 0) ? int_0 - 1 : int_0);
	}

}
