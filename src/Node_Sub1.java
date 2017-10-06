public final class Node_Sub1 extends Node {

	static Deque aDeque3;
	int anInt337;
	ObjectComposition anObjectComposition1;
	int anInt338;
	int anInt339;
	int anInt340;
	int[] anIntArray76;
	AClass5_Sub2 anAClass5_Sub2_1;
	int anInt341;
	int anInt342;
	int anInt343;
	int anInt344;
	int anInt345;
	AClass5_Sub2 anAClass5_Sub2_2;
	int anInt346;

	static {
		aDeque3 = new Deque();
	}

	void method608() {
		final int int_0 = anInt337;
		final ObjectComposition objectcomposition_0 = anObjectComposition1.getImpostor();
		if (objectcomposition_0 != null) {
			anInt337 = objectcomposition_0.ambientSoundId;
			anInt338 = objectcomposition_0.anInt494 * 128;
			anInt339 = objectcomposition_0.anInt495;
			anInt340 = objectcomposition_0.anInt496;
			anIntArray76 = objectcomposition_0.anIntArray101;
		} else {
			anInt337 = -1;
			anInt338 = 0;
			anInt339 = 0;
			anInt340 = 0;
			anIntArray76 = null;
		}

		if ((int_0 != anInt337) && (anAClass5_Sub2_1 != null)) {
			Class76.anAClass5_Sub1_1.method700(anAClass5_Sub2_1);
			anAClass5_Sub2_1 = null;
		}
	}

	static Class method609(final String string_0) throws ClassNotFoundException {
		return string_0.equals("B") ? Byte.TYPE
				: (string_0.equals("I") ? Integer.TYPE
						: (string_0.equals("S") ? Short.TYPE
								: (string_0.equals("J") ? Long.TYPE
										: (string_0.equals("Z") ? Boolean.TYPE
												: (string_0.equals("F") ? Float.TYPE
														: (string_0.equals("D") ? Double.TYPE
																: (string_0.equals("C") ? Character.TYPE
																		: (string_0.equals("void") ? Void.TYPE
																				: Class.forName(string_0)))))))));
	}

	static long method610(final CharSequence charsequence_0) {
		long long_0 = 0L;
		final int int_0 = charsequence_0.length();

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			long_0 *= 37L;
			final char char_0 = charsequence_0.charAt(int_1);
			if ((char_0 >= 65) && (char_0 <= 90)) {
				long_0 += (char_0 + 1) - 65;
			} else if ((char_0 >= 97) && (char_0 <= 122)) {
				long_0 += (char_0 + 1) - 97;
			} else if ((char_0 >= 48) && (char_0 <= 57)) {
				long_0 += (char_0 + 27) - 48;
			}

			if (long_0 >= 177917621779460413L) {
				break;
			}
		}

		while (((long_0 % 37L) == 0L) && (long_0 != 0L)) {
			long_0 /= 37L;
		}

		return long_0;
	}

}
