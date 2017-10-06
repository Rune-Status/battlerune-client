public class Class97 {

	public static final int[] anIntArray49;

	static {
		anIntArray49 = new int[] { -2, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, -1, 0, 0, 2, 0, -2, -1, 0, 5, 0, 0, 0, -1, 0, 0, 0,
				0, 4, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, -2, -2, 0, -2, 0, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 3, 10, 0, -1,
				-2, 0, -1, 0, 0, 0, 0, 0, 0, 0, -2, 10, 1, 0, 0, 0, 0, 0, 8, 0, 2, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0,
				0, -2, 0, 0, 0, 0, 0, 4, 0, 6, 0, 0, 5, 0, 1, 0, 2, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 14, 1, 0, 0, 8,
				4, -2, 2, 0, 0, 0, 0, 0, 0, 2, -2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, 5, 0, 0, 0, 0, 0,
				0, 6, 8, 0, 0, 0, 0, -2, 2, 12, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 0, 3, 6, 0, 0, 0,
				0, 0, 0, 0, 6, 0, 6, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 7, 8, 20, 6, 0, 0, 0, 15, 0, -2, 0, 0, 6,
				6, 0, 0, 0, 0, 28, 0, 5, 0, 0, 0, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 5, 0, 0, 0, 6, 0, 0, 0 };
	}

	static final void method493(final Widget[] widgets_0, final int int_0) {
		for (int int_1 = 0; int_1 < widgets_0.length; int_1++) {
			final Widget widget_0 = widgets_0[int_1];
			if ((widget_0 != null) && (widget_0.parentId == int_0)
					&& (!widget_0.hasScript || !Class37.method250(widget_0))) {
				int int_2;
				if (widget_0.type == 0) {
					if (!widget_0.hasScript && Class37.method250(widget_0)
							&& (widget_0 != XGrandExchangeOffer.aWidget3)) {
						continue;
					}

					method493(widgets_0, widget_0.anInt289);
					if (widget_0.children != null) {
						method493(widget_0.children, widget_0.anInt289);
					}

					final WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable.get(widget_0.anInt289);
					if (widgetnode_0 != null) {
						int_2 = widgetnode_0.anInt392;
						if (Class14.loadWidget(int_2)) {
							method493(Widget.widgets[int_2], -1);
						}
					}
				}

				if (widget_0.type == 6) {
					if ((widget_0.anInt295 != -1) || (widget_0.anInt296 != -1)) {
						final boolean bool_0 = AbstractSoundSystem.method341(widget_0);
						if (bool_0) {
							int_2 = widget_0.anInt296;
						} else {
							int_2 = widget_0.anInt295;
						}

						if (int_2 != -1) {
							final Sequence sequence_0 = Class54.getAnimation(int_2);

							for (widget_0.anInt300 += Client.anInt662; widget_0.anInt300 > sequence_0.frameLenghts[widget_0.anInt301]; Class15
									.method196(widget_0)) {
								widget_0.anInt300 -= sequence_0.frameLenghts[widget_0.anInt301];
								++widget_0.anInt301;
								if (widget_0.anInt301 >= sequence_0.frameIDs.length) {
									widget_0.anInt301 -= sequence_0.frameStep;
									if ((widget_0.anInt301 < 0) || (widget_0.anInt301 >= sequence_0.frameIDs.length)) {
										widget_0.anInt301 = 0;
									}
								}
							}
						}
					}

					if ((widget_0.anInt299 != 0) && !widget_0.hasScript) {
						int int_3 = widget_0.anInt299 >> 16;
						int_2 = (widget_0.anInt299 << 16) >> 16;
						int_3 *= Client.anInt662;
						int_2 *= Client.anInt662;
						widget_0.rotationX = (int_3 + widget_0.rotationX) & 0x7FF;
						widget_0.rotationZ = (int_2 + widget_0.rotationZ) & 0x7FF;
						Class15.method196(widget_0);
					}
				}
			}
		}

	}

}
