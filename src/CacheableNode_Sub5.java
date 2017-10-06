public class CacheableNode_Sub5 extends CacheableNode {

	public static NodeCache aNodeCache17;
	public static IndexDataBase anIndexDataBase26;
	public boolean aBool56;

	static {
		aNodeCache17 = new NodeCache(64);
	}

	public CacheableNode_Sub5() {
		aBool56 = false;
	}

	void method828(final Buffer buffer_0, final int int_0) {
		if (int_0 == 2) {
			aBool56 = true;
		}

	}

	public void method829(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method828(buffer_0, int_0);
		}
	}

	public static Overlay method830(final int int_0) {
		Overlay overlay_0 = (Overlay) Overlay.overlays.get(int_0);
		if (overlay_0 != null) {
			return overlay_0;
		} else {
			final byte[] bytes_0 = Overlay.overlay_ref.getConfigData(4, int_0);
			overlay_0 = new Overlay();
			if (bytes_0 != null) {
				overlay_0.decode(new Buffer(bytes_0), int_0);
			}

			overlay_0.post();
			Overlay.overlays.put(overlay_0, int_0);
			return overlay_0;
		}
	}

	public static boolean method831(final CharSequence charsequence_0, final int int_0, final boolean bool_0) {
		if ((int_0 >= 2) && (int_0 <= 36)) {
			boolean bool_1 = false;
			boolean bool_2 = false;
			int int_1 = 0;
			final int int_2 = charsequence_0.length();

			for (int int_3 = 0; int_3 < int_2; int_3++) {
				final char char_0 = charsequence_0.charAt(int_3);
				if (int_3 == 0) {
					if (char_0 == 45) {
						bool_1 = true;
						continue;
					}

					if (char_0 == 43) {
						continue;
					}
				}

				int int_5;
				if ((char_0 >= 48) && (char_0 <= 57)) {
					int_5 = char_0 - 48;
				} else if ((char_0 >= 65) && (char_0 <= 90)) {
					int_5 = char_0 - 55;
				} else {
					if ((char_0 < 97) || (char_0 > 122)) {
						return false;
					}

					int_5 = char_0 - 87;
				}

				if (int_5 >= int_0) {
					return false;
				}

				if (bool_1) {
					int_5 = -int_5;
				}

				final int int_4 = int_5 + (int_1 * int_0);
				if ((int_4 / int_0) != int_1) {
					return false;
				}

				int_1 = int_4;
				bool_2 = true;
			}

			return bool_2;
		} else {
			throw new IllegalArgumentException("");
		}
	}

}
