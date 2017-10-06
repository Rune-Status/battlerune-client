public class Class30 {

	int anInt87;
	int anInt88;
	int anInt89;
	int anInt90;
	String aString5;

	public static void method229(final ScriptEvent scriptevent_0) {
		IndexFile.method71(scriptevent_0, 200000);
	}

	static final void drawStatusBox(final String string_0, final boolean bool_0) {
		final byte byte_0 = 4;
		final int int_0 = byte_0 + 6;
		final int int_1 = byte_0 + 6;
		final int int_2 = Class31.font_p12full.method973(string_0, 250);
		final int int_3 = Class31.font_p12full.method970(string_0, 250) * 13;
		Rasterizer2D.method853(int_0 - byte_0, int_1 - byte_0, byte_0 + int_2 + byte_0, byte_0 + byte_0 + int_3, 0);
		Rasterizer2D.drawRectangle(int_0 - byte_0, int_1 - byte_0, byte_0 + int_2 + byte_0, byte_0 + byte_0 + int_3,
				16777215);
		Class31.font_p12full.method971(string_0, int_0, int_1, int_2, int_3, 16777215, -1, 1, 1, 0);
		Class3.method85(int_0 - byte_0, int_1 - byte_0, byte_0 + int_2 + byte_0, byte_0 + byte_0 + int_3);
		if (bool_0) {
			GZipDecompressor.aBufferProvider1.method474(0, 0);
		} else {
			final int int_4 = int_0;
			final int int_5 = int_1;
			final int int_6 = int_2;
			final int int_7 = int_3;

			for (int int_8 = 0; int_8 < Client.anInt647; int_8++) {
				if (((Client.widgetPositionX[int_8] + Client.widgetBoundsWidth[int_8]) > int_4)
						&& (Client.widgetPositionX[int_8] < (int_6 + int_4))
						&& ((Client.widgetBoundsHeight[int_8] + Client.widgetPositionY[int_8]) > int_5)
						&& (Client.widgetPositionY[int_8] < (int_7 + int_5))) {
					Client.aBoolArray10[int_8] = true;
				}
			}
		}

	}

	static Widget method230(final Widget widget_0) {
		Widget widget_1 = Class25.method219(widget_0);
		if (widget_1 == null) {
			widget_1 = widget_0.dragParent;
		}

		return widget_1;
	}

}
