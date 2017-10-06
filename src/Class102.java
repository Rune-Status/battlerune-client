public class Class102 {

	static char[] aCharArray4;
	static char[] aCharArray5;
	static int[] anIntArray55;
	static boolean aBool22;

	static {
		aCharArray4 = new char[64];

		int int_0;
		for (int_0 = 0; int_0 < 26; int_0++) {
			aCharArray4[int_0] = (char) (int_0 + 65);
		}

		for (int_0 = 26; int_0 < 52; int_0++) {
			aCharArray4[int_0] = (char) ((int_0 + 97) - 26);
		}

		for (int_0 = 52; int_0 < 62; int_0++) {
			aCharArray4[int_0] = (char) ((int_0 + 48) - 52);
		}

		aCharArray4[62] = 43;
		aCharArray4[63] = 47;
		aCharArray5 = new char[64];

		for (int_0 = 0; int_0 < 26; int_0++) {
			aCharArray5[int_0] = (char) (int_0 + 65);
		}

		for (int_0 = 26; int_0 < 52; int_0++) {
			aCharArray5[int_0] = (char) ((int_0 + 97) - 26);
		}

		for (int_0 = 52; int_0 < 62; int_0++) {
			aCharArray5[int_0] = (char) ((int_0 + 48) - 52);
		}

		aCharArray5[62] = 42;
		aCharArray5[63] = 45;
		anIntArray55 = new int[128];

		for (int_0 = 0; int_0 < anIntArray55.length; int_0++) {
			anIntArray55[int_0] = -1;
		}

		for (int_0 = 65; int_0 <= 90; int_0++) {
			anIntArray55[int_0] = int_0 - 65;
		}

		for (int_0 = 97; int_0 <= 122; int_0++) {
			anIntArray55[int_0] = (int_0 - 97) + 26;
		}

		for (int_0 = 48; int_0 <= 57; int_0++) {
			anIntArray55[int_0] = (int_0 - 48) + 52;
		}

		final int[] ints_0 = anIntArray55;
		anIntArray55[43] = 62;
		ints_0[42] = 62;
		final int[] ints_1 = anIntArray55;
		anIntArray55[47] = 63;
		ints_1[45] = 63;
	}

	static final int method500() {
		return Class56.anInt143;
	}

}
