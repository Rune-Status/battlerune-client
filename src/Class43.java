public class Class43 {

	static SoundTask task;
	public static final Class43 aClass43_2;
	public static final Class43 aClass43_3;
	public static final Class43 aClass43_4;
	final int anInt98;
	final String aString6;
	final int anInt99;
	final int anInt100;

	static {
		aClass43_2 = new Class43("SMALL", 0, 0, 4);
		aClass43_3 = new Class43("MEDIUM", 1, 1, 2);
		aClass43_4 = new Class43("LARGE", 2, 2, 0);
	}

	Class43(final String string_0, final int int_0, final int int_1, final int int_2) {
		aString6 = string_0;
		anInt99 = int_0;
		anInt100 = int_1;
		anInt98 = int_2;
	}

	boolean method264(final float float_0) {
		return float_0 >= anInt98;
	}

}
