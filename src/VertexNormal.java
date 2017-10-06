public class VertexNormal {

	int anInt196;
	int anInt197;
	int anInt198;
	int magnitude;

	VertexNormal() {
	}

	VertexNormal(final VertexNormal vertexnormal_1) {
		anInt196 = vertexnormal_1.anInt196;
		anInt197 = vertexnormal_1.anInt197;
		anInt198 = vertexnormal_1.anInt198;
		magnitude = vertexnormal_1.magnitude;
	}

	static final void drawWidget(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6, final int int_7) {
		if (Class14.loadWidget(int_0)) {
			Class76.aWidgetArray1 = null;
			Frames.gameDraw(Widget.widgets[int_0], -1, int_1, int_2, int_3, int_4, int_5, int_6, int_7);
			if (Class76.aWidgetArray1 != null) {
				Frames.gameDraw(Class76.aWidgetArray1, -1412584499, int_1, int_2, int_3, int_4, Ignore.anInt223,
						AClass1_Sub1.anInt324, int_7);
				Class76.aWidgetArray1 = null;
			}

		} else {
			if (int_7 != -1) {
				Client.aBoolArray8[int_7] = true;
			} else {
				for (int int_8 = 0; int_8 < 100; int_8++) {
					Client.aBoolArray8[int_8] = true;
				}
			}

		}
	}

}
