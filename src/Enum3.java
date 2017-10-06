public enum Enum3 implements RSEnum {

	anEnum3_2(0, 0), anEnum3_3(1, 1), anEnum3_4(3, 2), anEnum3_5(2, 3);

	public final int anInt370;
	final int anInt371;
	public static Track1 aTrack1_1;

	Enum3(final int int_1, final int int_2) {
		anInt370 = int_1;
		anInt371 = int_2;
	}

	@Override
	public int rsOrdinal() {
		return anInt371;
	}

}
