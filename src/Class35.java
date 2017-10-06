import java.util.Comparator;

final class Class35 implements Comparator {

	int method243(final Class48 class48_0, final Class48 class48_1) {
		return class48_0.aLong4 < class48_1.aLong4 ? -1 : (class48_0.aLong4 == class48_1.aLong4 ? 0 : 1);
	}

	@Override
	public int compare(final Object object_0, final Object object_1) {
		return method243((Class48) object_0, (Class48) object_1);
	}

	@Override
	public boolean equals(final Object object_0) {
		return super.equals(object_0);
	}

	static int method244(int int_0, final Script script_0, final boolean bool_0) {
		Widget widget_0;
		if (int_0 >= 2000) {
			int_0 -= 1000;
			widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
		} else {
			widget_0 = bool_0 ? Class45.aWidget6 : Class38.aWidget5;
		}

		Class15.method196(widget_0);
		if ((int_0 != 1200) && (int_0 != 1205) && (int_0 != 1212)) {
			if (int_0 == 1201) {
				widget_0.modelType = 2;
				widget_0.modelId = Class45.intStack[--WorldMapType2.intStackSize];
				return 1;
			} else if (int_0 == 1202) {
				widget_0.modelType = 3;
				widget_0.modelId = Script.localPlayer.composition.method483();
				return 1;
			} else {
				return 2;
			}
		} else {
			WorldMapType2.intStackSize -= 2;
			final int int_1 = Class45.intStack[WorldMapType2.intStackSize];
			final int int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
			widget_0.itemId = int_1;
			widget_0.itemQuantity = int_2;
			final ItemComposition itemcomposition_0 = Class45.getItemDefinition(int_1);
			widget_0.rotationX = itemcomposition_0.xan2d;
			widget_0.rotationZ = itemcomposition_0.yan2d;
			widget_0.rotationY = itemcomposition_0.zan2d;
			widget_0.anInt313 = itemcomposition_0.offsetX2d;
			widget_0.anInt314 = itemcomposition_0.offsetY2d;
			widget_0.modelZoom = itemcomposition_0.zoom2d;
			if (int_0 == 1205) {
				widget_0.anInt316 = 0;
			} else if ((int_0 == 1212) | (itemcomposition_0.isStackable == 1)) {
				widget_0.anInt316 = 1;
			} else {
				widget_0.anInt316 = 2;
			}

			if (widget_0.anInt315 > 0) {
				widget_0.modelZoom = (widget_0.modelZoom * 32) / widget_0.anInt315;
			} else if (widget_0.originalWidth > 0) {
				widget_0.modelZoom = (widget_0.modelZoom * 32) / widget_0.originalWidth;
			}

			return 1;
		}
	}

	static int method245(int int_0, final Script script_0, final boolean bool_0) {
		Widget widget_0;
		if (int_0 >= 2000) {
			int_0 -= 1000;
			widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
		} else {
			widget_0 = bool_0 ? Class45.aWidget6 : Class38.aWidget5;
		}

		if (int_0 == 1927) {
			if (Class45.anInt102 >= 10) {
				throw new RuntimeException();
			} else if (widget_0.anObjectArray2 == null) {
				return 0;
			} else {
				final ScriptEvent scriptevent_0 = new ScriptEvent();
				scriptevent_0.widget = widget_0;
				scriptevent_0.anObjectArray22 = widget_0.anObjectArray2;
				scriptevent_0.anInt417 = Class45.anInt102 + 1;
				Client.aDeque7.addFront(scriptevent_0);
				return 1;
			}
		} else {
			return 2;
		}
	}

}
