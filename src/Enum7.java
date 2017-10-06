public enum Enum7 implements RSEnum {

	anEnum7_1(0, 0), anEnum7_2(1, 1), anEnum7_3(2, 2);

	final int anInt409;
	public final int anInt410;

	Enum7(final int int_1, final int int_2) {
		anInt410 = int_1;
		anInt409 = int_2;
	}

	@Override
	public int rsOrdinal() {
		return anInt409;
	}

}
