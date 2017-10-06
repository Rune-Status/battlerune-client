public class AClass5_Sub4 extends AClass5 {

	static ModIcon aModIcon5;
	static ModIcon[] aModIconArray8;
	AClass5_Sub1 anAClass5_Sub1_2;
	AClass5_Sub3 anAClass5_Sub3_2;
	Deque aDeque6;

	AClass5_Sub4(final AClass5_Sub3 aclass5_sub3_0) {
		aDeque6 = new Deque();
		anAClass5_Sub1_2 = new AClass5_Sub1();
		anAClass5_Sub3_2 = aclass5_sub3_0;
	}

	@Override
	protected void method625(final int[] ints_0, final int int_0, final int int_1) {
		anAClass5_Sub1_2.method625(ints_0, int_0, int_1);

		for (Node_Sub4 node_sub4_0 = (Node_Sub4) aDeque6
				.getFront(); node_sub4_0 != null; node_sub4_0 = (Node_Sub4) aDeque6.getNext()) {
			if (!anAClass5_Sub3_2.method774(node_sub4_0)) {
				int int_2 = int_0;
				int int_3 = int_1;

				do {
					if (int_3 <= node_sub4_0.anInt379) {
						method808(node_sub4_0, ints_0, int_2, int_3, int_3 + int_2);
						node_sub4_0.anInt379 -= int_3;
						break;
					}

					method808(node_sub4_0, ints_0, int_2, node_sub4_0.anInt379, int_2 + int_3);
					int_2 += node_sub4_0.anInt379;
					int_3 -= node_sub4_0.anInt379;
				} while (!anAClass5_Sub3_2.method784(node_sub4_0, ints_0, int_2, int_3));
			}
		}

	}

	@Override
	protected void method626(final int int_0) {
		anAClass5_Sub1_2.method626(int_0);

		for (Node_Sub4 node_sub4_0 = (Node_Sub4) aDeque6
				.getFront(); node_sub4_0 != null; node_sub4_0 = (Node_Sub4) aDeque6.getNext()) {
			if (!anAClass5_Sub3_2.method774(node_sub4_0)) {
				int int_1 = int_0;

				do {
					if (int_1 <= node_sub4_0.anInt379) {
						method807(node_sub4_0, int_1);
						node_sub4_0.anInt379 -= int_1;
						break;
					}

					method807(node_sub4_0, node_sub4_0.anInt379);
					int_1 -= node_sub4_0.anInt379;
				} while (!anAClass5_Sub3_2.method784(node_sub4_0, (int[]) null, 0, int_1));
			}
		}

	}

	@Override
	protected AClass5 method628() {
		Node_Sub4 node_sub4_0;
		do {
			node_sub4_0 = (Node_Sub4) aDeque6.getNext();
			if (node_sub4_0 == null) {
				return null;
			}
		} while (node_sub4_0.anAClass5_Sub2_3 == null);

		return node_sub4_0.anAClass5_Sub2_3;
	}

	void method807(final Node_Sub4 node_sub4_0, int int_0) {
		if (((anAClass5_Sub3_2.anIntArray91[node_sub4_0.anInt376] & 0x4) != 0) && (node_sub4_0.anInt378 < 0)) {
			final int int_1 = anAClass5_Sub3_2.anIntArray94[node_sub4_0.anInt376] / ChatLineBuffer.sampleRate;
			final int int_2 = ((int_1 + 1048575) - node_sub4_0.anInt383) / int_1;
			node_sub4_0.anInt383 = ((int_1 * int_0) + node_sub4_0.anInt383) & 0xFFFFF;
			if (int_2 <= int_0) {
				if (anAClass5_Sub3_2.anIntArray96[node_sub4_0.anInt376] == 0) {
					node_sub4_0.anAClass5_Sub2_3 = AClass5_Sub2.method748(node_sub4_0.anAClass7_Sub1_1,
							node_sub4_0.anAClass5_Sub2_3.method722(), node_sub4_0.anAClass5_Sub2_3.method723(),
							node_sub4_0.anAClass5_Sub2_3.method710());
				} else {
					node_sub4_0.anAClass5_Sub2_3 = AClass5_Sub2.method748(node_sub4_0.anAClass7_Sub1_1,
							node_sub4_0.anAClass5_Sub2_3.method722(), 0, node_sub4_0.anAClass5_Sub2_3.method710());
					anAClass5_Sub3_2.method787(node_sub4_0,
							node_sub4_0.aNode_Sub6_1.aShortArray4[node_sub4_0.anInt384] < 0);
				}

				if (node_sub4_0.aNode_Sub6_1.aShortArray4[node_sub4_0.anInt384] < 0) {
					node_sub4_0.anAClass5_Sub2_3.method727(-1);
				}

				int_0 = node_sub4_0.anInt383 / int_1;
			}
		}

		node_sub4_0.anAClass5_Sub2_3.method626(int_0);
	}

	void method808(final Node_Sub4 node_sub4_0, final int[] ints_0, int int_0, int int_1, final int int_2) {
		if (((anAClass5_Sub3_2.anIntArray91[node_sub4_0.anInt376] & 0x4) != 0) && (node_sub4_0.anInt378 < 0)) {
			final int int_3 = anAClass5_Sub3_2.anIntArray94[node_sub4_0.anInt376] / ChatLineBuffer.sampleRate;

			while (true) {
				final int int_4 = ((int_3 + 1048575) - node_sub4_0.anInt383) / int_3;
				if (int_4 > int_1) {
					node_sub4_0.anInt383 += int_3 * int_1;
					break;
				}

				node_sub4_0.anAClass5_Sub2_3.method625(ints_0, int_0, int_4);
				int_0 += int_4;
				int_1 -= int_4;
				node_sub4_0.anInt383 += (int_4 * int_3) - 1048576;
				int int_5 = ChatLineBuffer.sampleRate / 100;
				final int int_6 = 262144 / int_3;
				if (int_6 < int_5) {
					int_5 = int_6;
				}

				final AClass5_Sub2 aclass5_sub2_0 = node_sub4_0.anAClass5_Sub2_3;
				if (anAClass5_Sub3_2.anIntArray96[node_sub4_0.anInt376] == 0) {
					node_sub4_0.anAClass5_Sub2_3 = AClass5_Sub2.method748(node_sub4_0.anAClass7_Sub1_1,
							aclass5_sub2_0.method722(), aclass5_sub2_0.method723(), aclass5_sub2_0.method710());
				} else {
					node_sub4_0.anAClass5_Sub2_3 = AClass5_Sub2.method748(node_sub4_0.anAClass7_Sub1_1,
							aclass5_sub2_0.method722(), 0, aclass5_sub2_0.method710());
					anAClass5_Sub3_2.method787(node_sub4_0,
							node_sub4_0.aNode_Sub6_1.aShortArray4[node_sub4_0.anInt384] < 0);
					node_sub4_0.anAClass5_Sub2_3.method728(int_5, aclass5_sub2_0.method723());
				}

				if (node_sub4_0.aNode_Sub6_1.aShortArray4[node_sub4_0.anInt384] < 0) {
					node_sub4_0.anAClass5_Sub2_3.method727(-1);
				}

				aclass5_sub2_0.method718(int_5);
				aclass5_sub2_0.method625(ints_0, int_0, int_2 - int_0);
				if (aclass5_sub2_0.method719()) {
					anAClass5_Sub1_2.method699(aclass5_sub2_0);
				}
			}
		}

		node_sub4_0.anAClass5_Sub2_3.method625(ints_0, int_0, int_1);
	}

	@Override
	protected AClass5 method629() {
		final Node_Sub4 node_sub4_0 = (Node_Sub4) aDeque6.getFront();
		return node_sub4_0 == null ? null
				: (node_sub4_0.anAClass5_Sub2_3 != null ? node_sub4_0.anAClass5_Sub2_3 : method628());
	}

	@Override
	protected int method631() {
		return 0;
	}

	public static int djb2Hash(final CharSequence charsequence_0) {
		final int int_0 = charsequence_0.length();
		int int_1 = 0;

		for (int int_2 = 0; int_2 < int_0; int_2++) {
			int_1 = ((int_1 << 5) - int_1) + Class58.method380(charsequence_0.charAt(int_2));
		}

		return int_1;
	}

}
