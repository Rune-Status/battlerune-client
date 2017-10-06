public enum Permission implements RSEnum {

	aPermission1(0, -1, true, false, true), aPermission2(1, 0, true, true, true), aPermission3(2, 1, true, true,
			false), aPermission4(3, 2, false, false,
					true), aPermission5(4, 3, false, false, true), aPermission6(5, 10, false, false, true);

	final int anInt321;
	public final int anInt322;
	public final boolean aBool37;
	public final boolean aBool38;

	Permission(final int int_1, final int int_2, final boolean bool_0, final boolean bool_1, final boolean bool_2) {
		anInt321 = int_1;
		anInt322 = int_2;
		aBool37 = bool_1;
		aBool38 = bool_2;
	}

	@Override
	public int rsOrdinal() {
		return anInt321;
	}

	public static boolean method574(final char char_0) {
		return (char_0 >= 32) && (char_0 <= 126) ? true
				: ((char_0 >= 160) && (char_0 <= 255) ? true
						: (char_0 == 8364) || (char_0 == 338) || (char_0 == 8212) || (char_0 == 339)
								|| (char_0 == 376));
	}

}
