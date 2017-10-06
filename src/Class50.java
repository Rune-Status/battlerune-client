import java.util.Comparator;

final class Class50 implements Comparator {

	static IndexData indexSprites;
	static int[] anIntArray24;

	int method305(final Class48 class48_0, final Class48 class48_1) {
		return class48_0.aXGrandExchangeOffer1.price < class48_1.aXGrandExchangeOffer1.price ? -1
				: (class48_1.aXGrandExchangeOffer1.price == class48_0.aXGrandExchangeOffer1.price ? 0 : 1);
	}

	@Override
	public boolean equals(final Object object_0) {
		return super.equals(object_0);
	}

	@Override
	public int compare(final Object object_0, final Object object_1) {
		return method305((Class48) object_0, (Class48) object_1);
	}

	static void method306(final Widget[] widgets_0, final int int_0, final int int_1, final int int_2,
			final boolean bool_0) {
		for (int int_3 = 0; int_3 < widgets_0.length; int_3++) {
			final Widget widget_0 = widgets_0[int_3];
			if ((widget_0 != null) && (widget_0.parentId == int_0)) {
				Class67.method399(widget_0, int_1, int_2, bool_0);
				Class59.method381(widget_0, int_1, int_2);
				if (widget_0.scrollX > (widget_0.scrollWidth - widget_0.width)) {
					widget_0.scrollX = widget_0.scrollWidth - widget_0.width;
				}

				if (widget_0.scrollX < 0) {
					widget_0.scrollX = 0;
				}

				if (widget_0.scrollY > (widget_0.scrollHeight - widget_0.height)) {
					widget_0.scrollY = widget_0.scrollHeight - widget_0.height;
				}

				if (widget_0.scrollY < 0) {
					widget_0.scrollY = 0;
				}

				if (widget_0.type == 0) {
					Class5.method89(widgets_0, widget_0, bool_0);
				}
			}
		}

	}

}
