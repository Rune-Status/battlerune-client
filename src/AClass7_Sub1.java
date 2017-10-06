public class AClass7_Sub1 extends AClass7 {

	public byte[] aByteArray19;
	public int anInt448;
	public boolean aBool49;
	public int anInt449;
	int anInt450;

	AClass7_Sub1(final int int_0, final byte[] bytes_0, final int int_1, final int int_2) {
		anInt448 = int_0;
		aByteArray19 = bytes_0;
		anInt449 = int_1;
		anInt450 = int_2;
	}

	AClass7_Sub1(final int int_0, final byte[] bytes_0, final int int_1, final int int_2, final boolean bool_0) {
		anInt448 = int_0;
		aByteArray19 = bytes_0;
		anInt449 = int_1;
		anInt450 = int_2;
		aBool49 = bool_0;
	}

	public AClass7_Sub1 method709(final Class53 class53_0) {
		aByteArray19 = class53_0.method319(aByteArray19);
		anInt448 = class53_0.method320(anInt448);
		if (anInt449 == anInt450) {
			anInt449 = anInt450 = class53_0.method321(anInt449);
		} else {
			anInt449 = class53_0.method321(anInt449);
			anInt450 = class53_0.method321(anInt450);
			if (anInt449 == anInt450) {
				--anInt449;
			}
		}

		return this;
	}

}
