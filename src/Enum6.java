public enum Enum6 implements RSEnum {

	anEnum6_2("runescape", "RuneScape", 0), anEnum6_3("stellardawn", "Stellar Dawn", 1), anEnum6_4("game3", "Game 3",
			2), anEnum6_5("game4", "Game 4",
					3), anEnum6_6("game5", "Game 5", 4), anEnum6_7("oldscape", "RuneScape 2007", 5);

	public final String aString19;
	final int anInt400;

	Enum6(final String string_1, final String string_2, final int int_1) {
		aString19 = string_1;
		anInt400 = int_1;
	}

	@Override
	public int rsOrdinal() {
		return anInt400;
	}

	public static int method657(final CharSequence charsequence_0) {
		final int int_0 = charsequence_0.length();
		int int_1 = 0;

		for (int int_2 = 0; int_2 < int_0; int_2++) {
			int_1 = ((int_1 << 5) - int_1) + charsequence_0.charAt(int_2);
		}

		return int_1;
	}

}
