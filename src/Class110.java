public class Class110 {

	public static final Class110 aClass110_2;
	static final Class110 aClass110_3;
	static final Class110 aClass110_4;
	static final Class110 aClass110_5;
	static final Class110 aClass110_6;
	static final Class110 aClass110_7;
	static final Class110 aClass110_8;
	static final Class110 aClass110_9;
	public static final Class110 aClass110_10;
	final String identifier;
	public final int anInt222;

	static {
		aClass110_2 = new Class110(1, 0, "", "");
		aClass110_3 = new Class110(0, 1, "", "");
		aClass110_4 = new Class110(8, 2, "", "");
		aClass110_5 = new Class110(2, 3, "", "");
		aClass110_6 = new Class110(3, 4, "", "");
		aClass110_7 = new Class110(6, 5, "", "");
		aClass110_8 = new Class110(7, 6, "", "");
		aClass110_9 = new Class110(5, 7, "", "");
		aClass110_10 = new Class110(4, -1, "", "", true,
				new Class110[] { aClass110_2, aClass110_3, aClass110_4, aClass110_6, aClass110_5 });
	}

	Class110(final int int_0, final int int_1, final String string_0, final String string_1) {
		anInt222 = int_0;
		identifier = string_1;
	}

	Class110(final int int_0, final int int_1, final String string_0, final String string_1, final boolean bool_0,
			final Class110[] class110s_0) {
		anInt222 = int_0;
		identifier = string_1;
	}

	@Override
	public String toString() {
		return identifier;
	}

}
