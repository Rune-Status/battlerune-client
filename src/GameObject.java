public final class GameObject {

	static int anInt230;
	int relativeX;
	int offsetX;
	public int hash;
	int flags;
	int relativeY;
	int offsetY;
	int plane;
	int anInt231;
	int anInt232;
	int height;
	public Renderable renderable;
	int orientation;
	int cycle;
	int drawPriority;

	GameObject() {
		hash = 0;
		flags = 0;
	}

	static final WidgetNode method535(final int int_0, final int int_1, final int int_2) {
		final WidgetNode widgetnode_0 = new WidgetNode();
		widgetnode_0.anInt392 = int_1;
		widgetnode_0.owner = int_2;
		Client.componentTable.put(widgetnode_0, int_0);
		AClass1_Sub2.method607(int_1);
		final Widget widget_0 = Class18.method202(int_0);
		Class15.method196(widget_0);
		if (Client.aWidget12 != null) {
			Class15.method196(Client.aWidget12);
			Client.aWidget12 = null;
		}

		Class5.method90();
		Class5.method89(Widget.widgets[int_0 >> 16], widget_0, false);
		Class90.method473(int_1);
		if (Client.widgetRoot != -1) {
			Class12.method170(Client.widgetRoot, 1);
		}

		return widgetnode_0;
	}

}
