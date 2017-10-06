public class AClass5_Sub1 extends AClass5 {

	Deque aDeque4;
	Deque aDeque5;
	int anInt426;
	int anInt427;

	public AClass5_Sub1() {
		aDeque4 = new Deque();
		aDeque5 = new Deque();
		anInt427 = 0;
		anInt426 = -1;
	}

	void method696(final int[] ints_0, final int int_0, final int int_1) {
		for (AClass5 aclass5_0 = (AClass5) aDeque4.getFront(); aclass5_0 != null; aclass5_0 = (AClass5) aDeque4
				.getNext()) {
			aclass5_0.method627(ints_0, int_0, int_1);
		}

	}

	void method697(final int int_0) {
		for (AClass5 aclass5_0 = (AClass5) aDeque4.getFront(); aclass5_0 != null; aclass5_0 = (AClass5) aDeque4
				.getNext()) {
			aclass5_0.method626(int_0);
		}

	}

	@Override
	public final synchronized void method625(final int[] ints_0, int int_0, int int_1) {
		do {
			if (anInt426 < 0) {
				method696(ints_0, int_0, int_1);
				return;
			}

			if ((int_1 + anInt427) < anInt426) {
				anInt427 += int_1;
				method696(ints_0, int_0, int_1);
				return;
			}

			final int int_2 = anInt426 - anInt427;
			method696(ints_0, int_0, int_2);
			int_0 += int_2;
			int_1 -= int_2;
			anInt427 += int_2;
			method698();
			final AClass6 aclass6_0 = (AClass6) aDeque5.getFront();
			synchronized (aclass6_0) {
				final int int_3 = aclass6_0.method633(this);
				if (int_3 < 0) {
					aclass6_0.anInt359 = 0;
					method701(aclass6_0);
				} else {
					aclass6_0.anInt359 = int_3;
					method702(aclass6_0.next, aclass6_0);
				}
			}
		} while (int_1 != 0);

	}

	@Override
	public final synchronized void method626(int int_0) {
		do {
			if (anInt426 < 0) {
				method697(int_0);
				return;
			}

			if ((anInt427 + int_0) < anInt426) {
				anInt427 += int_0;
				method697(int_0);
				return;
			}

			final int int_1 = anInt426 - anInt427;
			method697(int_1);
			int_0 -= int_1;
			anInt427 += int_1;
			method698();
			final AClass6 aclass6_0 = (AClass6) aDeque5.getFront();
			synchronized (aclass6_0) {
				final int int_2 = aclass6_0.method633(this);
				if (int_2 < 0) {
					aclass6_0.anInt359 = 0;
					method701(aclass6_0);
				} else {
					aclass6_0.anInt359 = int_2;
					method702(aclass6_0.next, aclass6_0);
				}
			}
		} while (int_0 != 0);

	}

	@Override
	protected AClass5 method628() {
		return (AClass5) aDeque4.getNext();
	}

	void method698() {
		if (anInt427 > 0) {
			for (AClass6 aclass6_0 = (AClass6) aDeque5.getFront(); aclass6_0 != null; aclass6_0 = (AClass6) aDeque5
					.getNext()) {
				aclass6_0.anInt359 -= anInt427;
			}

			anInt426 -= anInt427;
			anInt427 = 0;
		}
	}

	public final synchronized void method699(final AClass5 aclass5_0) {
		aDeque4.addTail(aclass5_0);
	}

	@Override
	protected AClass5 method629() {
		return (AClass5) aDeque4.getFront();
	}

	public final synchronized void method700(final AClass5 aclass5_0) {
		aclass5_0.unlink();
	}

	void method701(final AClass6 aclass6_0) {
		aclass6_0.unlink();
		aclass6_0.method632();
		final Node node_0 = aDeque5.head.next;
		if (node_0 == aDeque5.head) {
			anInt426 = -1;
		} else {
			anInt426 = ((AClass6) node_0).anInt359;
		}
	}

	void method702(Node node_0, final AClass6 aclass6_0) {
		while ((aDeque5.head != node_0) && (((AClass6) node_0).anInt359 <= aclass6_0.anInt359)) {
			node_0 = node_0.next;
		}

		Deque.method518(aclass6_0, node_0);
		anInt426 = ((AClass6) aDeque5.head.next).anInt359;
	}

	@Override
	protected int method631() {
		return 0;
	}

}
