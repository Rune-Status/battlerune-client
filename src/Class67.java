public class Class67 {

	static int anInt170;
	static int anInt171;

	static void method399(final Widget widget_0, final int int_0, final int int_1, final boolean bool_0) {
		final int int_2 = widget_0.width;
		final int int_3 = widget_0.height;
		if (widget_0.anInt291 == 0) {
			widget_0.width = widget_0.originalWidth;
		} else if (widget_0.anInt291 == 1) {
			widget_0.width = int_0 - widget_0.originalWidth;
		} else if (widget_0.anInt291 == 2) {
			widget_0.width = (widget_0.originalWidth * int_0) >> 14;
		}

		if (widget_0.buttonType == 0) {
			widget_0.height = widget_0.anInt294;
		} else if (widget_0.buttonType == 1) {
			widget_0.height = int_1 - widget_0.anInt294;
		} else if (widget_0.buttonType == 2) {
			widget_0.height = (int_1 * widget_0.anInt294) >> 14;
		}

		if (widget_0.anInt291 == 4) {
			widget_0.width = (widget_0.height * widget_0.anInt297) / widget_0.anInt298;
		}

		if (widget_0.buttonType == 4) {
			widget_0.height = (widget_0.anInt298 * widget_0.width) / widget_0.anInt297;
		}

		if (Client.aBool79 && (widget_0.type == 0)) {
			if ((widget_0.height < 5) && (widget_0.width < 5)) {
				widget_0.height = 5;
				widget_0.width = 5;
			} else {
				if (widget_0.height <= 0) {
					widget_0.height = 5;
				}

				if (widget_0.width <= 0) {
					widget_0.width = 5;
				}
			}
		}

		if (widget_0.contentType == 1337) {
			Client.aWidget11 = widget_0;
		}

		if (bool_0 && (widget_0.anObjectArray2 != null) && ((int_2 != widget_0.width) || (int_3 != widget_0.height))) {
			final ScriptEvent scriptevent_0 = new ScriptEvent();
			scriptevent_0.widget = widget_0;
			scriptevent_0.anObjectArray22 = widget_0.anObjectArray2;
			Client.aDeque7.addFront(scriptevent_0);
		}
	}

}
