public class Class104 {

	public static Interface2 anInterface2_1;
	static final char[] aCharArray6;
	static final char[] aCharArray7;

	static {
		aCharArray6 = new char[] { '\u0020', '\u00a0', '\u005f', '\u002d', '\u00e0', '\u00e1', '\u00e2', '\u00e4',
				'\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb',
				'\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf',
				'\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5',
				'\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7',
				'\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
		aCharArray7 = new char[] { '\u005b', '\u005d', '\u0023' };
	}

	public static int parseInt(final CharSequence charsequence_0, final int int_0, final boolean bool_0) {
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
						throw new NumberFormatException();
					}

					int_5 = char_0 - 87;
				}

				if (int_5 >= int_0) {
					throw new NumberFormatException();
				}

				if (bool_1) {
					int_5 = -int_5;
				}

				final int int_4 = int_5 + (int_1 * int_0);
				if ((int_4 / int_0) != int_1) {
					throw new NumberFormatException();
				}

				int_1 = int_4;
				bool_2 = true;
			}

			if (!bool_2) {
				throw new NumberFormatException();
			} else {
				return int_1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

}
