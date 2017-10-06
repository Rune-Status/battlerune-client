public class Class23 {

	static final Class23 aClass23_1;
	static final Class23 aClass23_2;
	static final Class23 aClass23_3;
	static Widget aWidget4;
	public static String userHome;
	static final Class23 aClass23_4;

	static {
		aClass23_1 = new Class23();
		aClass23_2 = new Class23();
		aClass23_3 = new Class23();
		aClass23_4 = new Class23();
	}

	public static void method213() {
		if (MouseInput.mouse != null) {
			synchronized (MouseInput.mouse) {
				MouseInput.mouse = null;
			}
		}

	}

	static final void method214(final ModIcon modicon_0) {
		final short short_0 = 256;

		int int_0;
		for (int_0 = 0; int_0 < Spotanim.anIntArray83.length; int_0++) {
			Spotanim.anIntArray83[int_0] = 0;
		}

		int int_1;
		for (int_0 = 0; int_0 < 5000; int_0++) {
			int_1 = (int) (Math.random() * 128.0D * short_0);
			Spotanim.anIntArray83[int_1] = (int) (Math.random() * 256.0D);
		}

		int int_2;
		int int_3;
		for (int_0 = 0; int_0 < 20; int_0++) {
			for (int_1 = 1; int_1 < (short_0 - 1); int_1++) {
				for (int_2 = 1; int_2 < 127; int_2++) {
					int_3 = int_2 + (int_1 << 7);
					Class32.anIntArray15[int_3] = (Spotanim.anIntArray83[int_3 + 128]
							+ Spotanim.anIntArray83[int_3 - 128] + Spotanim.anIntArray83[int_3 + 1]
							+ Spotanim.anIntArray83[int_3 - 1]) / 4;
				}
			}

			final int[] ints_0 = Spotanim.anIntArray83;
			Spotanim.anIntArray83 = Class32.anIntArray15;
			Class32.anIntArray15 = ints_0;
		}

		if (modicon_0 != null) {
			int_0 = 0;

			for (int_1 = 0; int_1 < modicon_0.height; int_1++) {
				for (int_2 = 0; int_2 < modicon_0.originalWidth; int_2++) {
					if (modicon_0.pixels[int_0++] != 0) {
						int_3 = int_2 + 16 + modicon_0.offsetX;
						final int int_4 = int_1 + 16 + modicon_0.offsetY;
						final int int_5 = int_3 + (int_4 << 7);
						Spotanim.anIntArray83[int_5] = 0;
					}
				}
			}
		}

	}

	static void method215() {
		if (Client.spellSelected) {
			final Widget widget_0 = Class33.method238(Class13.anInt43, Client.anInt750);
			if ((widget_0 != null) && (widget_0.anObjectArray6 != null)) {
				final ScriptEvent scriptevent_0 = new ScriptEvent();
				scriptevent_0.widget = widget_0;
				scriptevent_0.anObjectArray22 = widget_0.anObjectArray6;
				Class30.method229(scriptevent_0);
			}

			Client.spellSelected = false;
			Class15.method196(widget_0);
		}
	}

}
