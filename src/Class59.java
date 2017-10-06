public class Class59 {

	static Class110 aClass110_1;

	static void method381(final Widget widget_0, final int int_0, final int int_1) {
		if (widget_0.anInt290 == 0) {
			widget_0.relativeX = widget_0.originalX;
		} else if (widget_0.anInt290 == 1) {
			widget_0.relativeX = widget_0.originalX + ((int_0 - widget_0.width) / 2);
		} else if (widget_0.anInt290 == 2) {
			widget_0.relativeX = int_0 - widget_0.width - widget_0.originalX;
		} else if (widget_0.anInt290 == 3) {
			widget_0.relativeX = (widget_0.originalX * int_0) >> 14;
		} else if (widget_0.anInt290 == 4) {
			widget_0.relativeX = ((int_0 * widget_0.originalX) >> 14) + ((int_0 - widget_0.width) / 2);
		} else {
			widget_0.relativeX = int_0 - widget_0.width - ((widget_0.originalX * int_0) >> 14);
		}

		if (widget_0.anInt293 == 0) {
			widget_0.relativeY = widget_0.originalY;
		} else if (widget_0.anInt293 == 1) {
			widget_0.relativeY = widget_0.originalY + ((int_1 - widget_0.height) / 2);
		} else if (widget_0.anInt293 == 2) {
			widget_0.relativeY = int_1 - widget_0.height - widget_0.originalY;
		} else if (widget_0.anInt293 == 3) {
			widget_0.relativeY = (int_1 * widget_0.originalY) >> 14;
		} else if (widget_0.anInt293 == 4) {
			widget_0.relativeY = ((int_1 * widget_0.originalY) >> 14) + ((int_1 - widget_0.height) / 2);
		} else {
			widget_0.relativeY = int_1 - widget_0.height - ((int_1 * widget_0.originalY) >> 14);
		}

		if (Client.aBool79 && (widget_0.type == 0)) {
			if (widget_0.relativeX < 0) {
				widget_0.relativeX = 0;
			} else if ((widget_0.width + widget_0.relativeX) > int_0) {
				widget_0.relativeX = int_0 - widget_0.width;
			}

			if (widget_0.relativeY < 0) {
				widget_0.relativeY = 0;
			} else if ((widget_0.relativeY + widget_0.height) > int_1) {
				widget_0.relativeY = int_1 - widget_0.height;
				return;
			}
		}

	}

}
