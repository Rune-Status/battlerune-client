public abstract class AbstractByteBuffer {

	static boolean aBool10;

	static {
		aBool10 = false;
	}

	abstract byte[] get();

	abstract void put(byte[] var1);

	public static String method260(final CharSequence[] charsequences_0, final int int_0, final int int_1) {
		if (int_1 == 0) {
			return "";
		} else if (int_1 == 1) {
			final CharSequence charsequence_0 = charsequences_0[int_0];
			return charsequence_0 == null ? "null" : charsequence_0.toString();
		} else {
			final int int_2 = int_1 + int_0;
			int int_3 = 0;

			for (int int_4 = int_0; int_4 < int_2; int_4++) {
				final CharSequence charsequence_1 = charsequences_0[int_4];
				if (charsequence_1 == null) {
					int_3 += 4;
				} else {
					int_3 += charsequence_1.length();
				}
			}

			final StringBuilder stringbuilder_0 = new StringBuilder(int_3);

			for (int int_5 = int_0; int_5 < int_2; int_5++) {
				final CharSequence charsequence_2 = charsequences_0[int_5];
				if (charsequence_2 == null) {
					stringbuilder_0.append("null");
				} else {
					stringbuilder_0.append(charsequence_2);
				}
			}

			return stringbuilder_0.toString();
		}
	}

}
