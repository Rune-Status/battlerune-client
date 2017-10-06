public final class Class90 {

	public static void method472(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1) {
		Spotanim.anIndexDataBase16 = indexdatabase_0;
		Spotanim.anIndexDataBase15 = indexdatabase_1;
	}

	static void method473(final int int_0) {
		if (int_0 != -1) {
			if (Class14.loadWidget(int_0)) {
				final Widget[] widgets_0 = Widget.widgets[int_0];

				for (int int_1 = 0; int_1 < widgets_0.length; int_1++) {
					final Widget widget_0 = widgets_0[int_1];
					if (widget_0.anObjectArray5 != null) {
						final ScriptEvent scriptevent_0 = new ScriptEvent();
						scriptevent_0.widget = widget_0;
						scriptevent_0.anObjectArray22 = widget_0.anObjectArray5;
						IndexFile.method71(scriptevent_0, 2000000);
					}
				}

			}
		}
	}

}
