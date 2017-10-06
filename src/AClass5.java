public abstract class AClass5 extends Node {

	volatile boolean aBool45;
	AClass7 anAClass7_1;
	AClass5 anAClass5_2;
	int anInt358;

	protected AClass5() {
		aBool45 = true;
	}

	protected abstract void method625(int[] var1, int var2, int var3);

	protected abstract void method626(int var1);

	final void method627(final int[] ints_0, final int int_0, final int int_1) {
		if (aBool45) {
			method625(ints_0, int_0, int_1);
		} else {
			method626(int_1);
		}
	}

	protected abstract AClass5 method628();

	protected abstract AClass5 method629();

	int method630() {
		return 255;
	}

	protected abstract int method631();

}
