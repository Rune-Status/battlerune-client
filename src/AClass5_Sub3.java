public class AClass5_Sub3 extends AClass5 {

	int[] anIntArray86;
	int anInt478;
	int anInt479;
	int[] anIntArray87;
	int[] anIntArray88;
	XHashTable aXHashTable8;
	int[] anIntArray89;
	int[] anIntArray90;
	Node_Sub4[][] aNode_Sub4ArrayArray1;
	int[] anIntArray91;
	Class69 aClass69_1;
	AClass5_Sub4 anAClass5_Sub4_1;
	int[] anIntArray92;
	int[] anIntArray93;
	int anInt480;
	int[] anIntArray94;
	int[] anIntArray95;
	long aLong20;
	int[] anIntArray96;
	int anInt481;
	Node_Sub4[][] aNode_Sub4ArrayArray2;
	boolean aBool51;
	int[] anIntArray97;
	int[] anIntArray98;
	long aLong21;
	int[] anIntArray99;
	int[] anIntArray100;

	public AClass5_Sub3() {
		anInt479 = 256;
		anInt481 = 1000000;
		anIntArray93 = new int[16];
		anIntArray88 = new int[16];
		anIntArray92 = new int[16];
		anIntArray89 = new int[16];
		anIntArray90 = new int[16];
		anIntArray95 = new int[16];
		anIntArray87 = new int[16];
		anIntArray99 = new int[16];
		anIntArray98 = new int[16];
		anIntArray91 = new int[16];
		anIntArray100 = new int[16];
		anIntArray97 = new int[16];
		anIntArray96 = new int[16];
		anIntArray86 = new int[16];
		anIntArray94 = new int[16];
		aNode_Sub4ArrayArray1 = new Node_Sub4[16][128];
		aNode_Sub4ArrayArray2 = new Node_Sub4[16][128];
		aClass69_1 = new Class69();
		anAClass5_Sub4_1 = new AClass5_Sub4(this);
		aXHashTable8 = new XHashTable(128);
		method768();
	}

	void method761(final int int_0, final int int_1) {
		anIntArray89[int_0] = int_1;
		anIntArray95[int_0] = int_1 & 0xFFFFFF80;
		method769(int_0, int_1);
	}

	void method762(final int int_0, final int int_1) {
		final Node_Sub4 node_sub4_0 = aNode_Sub4ArrayArray1[int_0][int_1];
		if (node_sub4_0 != null) {
			aNode_Sub4ArrayArray1[int_0][int_1] = null;
			if ((anIntArray91[int_0] & 0x2) == 0) {
				node_sub4_0.anInt378 = 0;
			} else {
				for (Node_Sub4 node_sub4_1 = (Node_Sub4) anAClass5_Sub4_1.aDeque6
						.getFront(); node_sub4_1 != null; node_sub4_1 = (Node_Sub4) anAClass5_Sub4_1.aDeque6
								.getNext()) {
					if ((node_sub4_1.anInt376 == node_sub4_0.anInt376) && (node_sub4_1.anInt378 < 0)
							&& (node_sub4_0 != node_sub4_1)) {
						node_sub4_0.anInt378 = 0;
						break;
					}
				}

			}
		}
	}

	void method763(final int int_0) {
		for (Node_Sub4 node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6
				.getFront(); node_sub4_0 != null; node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6.getNext()) {
			if ((int_0 < 0) || (node_sub4_0.anInt376 == int_0)) {
				if (node_sub4_0.anAClass5_Sub2_3 != null) {
					node_sub4_0.anAClass5_Sub2_3.method718(ChatLineBuffer.sampleRate / 100);
					if (node_sub4_0.anAClass5_Sub2_3.method719()) {
						anAClass5_Sub4_1.anAClass5_Sub1_2.method699(node_sub4_0.anAClass5_Sub2_3);
					}

					node_sub4_0.method642();
				}

				if (node_sub4_0.anInt378 < 0) {
					aNode_Sub4ArrayArray1[node_sub4_0.anInt376][node_sub4_0.anInt384] = null;
				}

				node_sub4_0.unlink();
			}
		}

	}

	public synchronized void method764() {
		aClass69_1.method405();
		method768();
	}

	void method765(int int_0) {
		if (int_0 >= 0) {
			anIntArray93[int_0] = 12800;
			anIntArray88[int_0] = 8192;
			anIntArray92[int_0] = 16383;
			anIntArray87[int_0] = 8192;
			anIntArray99[int_0] = 0;
			anIntArray98[int_0] = 8192;
			method775(int_0);
			method778(int_0);
			anIntArray91[int_0] = 0;
			anIntArray100[int_0] = 32767;
			anIntArray97[int_0] = 256;
			anIntArray96[int_0] = 0;
			method785(int_0, 8192);
		} else {
			for (int_0 = 0; int_0 < 16; int_0++) {
				method765(int_0);
			}

		}
	}

	void method766(final int int_0, final int int_1, final int int_2) {
		method762(int_0, int_1);
		if ((anIntArray91[int_0] & 0x2) != 0) {
			for (Node_Sub4 node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6
					.getTail(); node_sub4_0 != null; node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6.getPrevious()) {
				if ((node_sub4_0.anInt376 == int_0) && (node_sub4_0.anInt378 < 0)) {
					aNode_Sub4ArrayArray1[int_0][node_sub4_0.anInt384] = null;
					aNode_Sub4ArrayArray1[int_0][int_1] = node_sub4_0;
					final int int_3 = ((node_sub4_0.anInt375 * node_sub4_0.anInt374) >> 12) + node_sub4_0.anInt377;
					node_sub4_0.anInt377 += (int_1 - node_sub4_0.anInt384) << 8;
					node_sub4_0.anInt374 = int_3 - node_sub4_0.anInt377;
					node_sub4_0.anInt375 = 4096;
					node_sub4_0.anInt384 = int_1;
					return;
				}
			}
		}

		final Node_Sub6 node_sub6_0 = (Node_Sub6) aXHashTable8.get(anIntArray90[int_0]);
		if (node_sub6_0 != null) {
			final AClass7_Sub1 aclass7_sub1_0 = node_sub6_0.anAClass7_Sub1Array1[int_1];
			if (aclass7_sub1_0 != null) {
				final Node_Sub4 node_sub4_1 = new Node_Sub4();
				node_sub4_1.anInt376 = int_0;
				node_sub4_1.aNode_Sub6_1 = node_sub6_0;
				node_sub4_1.anAClass7_Sub1_1 = aclass7_sub1_0;
				node_sub4_1.aClass75_1 = node_sub6_0.aClass75Array1[int_1];
				node_sub4_1.anInt381 = node_sub6_0.aByteArray17[int_1];
				node_sub4_1.anInt384 = int_1;
				node_sub4_1.anInt382 = ((int_2 * int_2 * node_sub6_0.anInt391 * node_sub6_0.aByteArray15[int_1])
						+ 1024) >> 11;
				node_sub4_1.anInt380 = node_sub6_0.aByteArray16[int_1] & 0xFF;
				node_sub4_1.anInt377 = (int_1 << 8) - (node_sub6_0.aShortArray4[int_1] & 0x7FFF);
				node_sub4_1.anInt385 = 0;
				node_sub4_1.anInt388 = 0;
				node_sub4_1.anInt389 = 0;
				node_sub4_1.anInt378 = -1;
				node_sub4_1.anInt390 = 0;
				if (anIntArray96[int_0] == 0) {
					node_sub4_1.anAClass5_Sub2_3 = AClass5_Sub2.method748(aclass7_sub1_0, method772(node_sub4_1),
							method788(node_sub4_1), method789(node_sub4_1));
				} else {
					node_sub4_1.anAClass5_Sub2_3 = AClass5_Sub2.method748(aclass7_sub1_0, method772(node_sub4_1), 0,
							method789(node_sub4_1));
					method787(node_sub4_1, node_sub6_0.aShortArray4[int_1] < 0);
				}

				if (node_sub6_0.aShortArray4[int_1] < 0) {
					node_sub4_1.anAClass5_Sub2_3.method727(-1);
				}

				if (node_sub4_1.anInt381 >= 0) {
					final Node_Sub4 node_sub4_2 = aNode_Sub4ArrayArray2[int_0][node_sub4_1.anInt381];
					if ((node_sub4_2 != null) && (node_sub4_2.anInt378 < 0)) {
						aNode_Sub4ArrayArray1[int_0][node_sub4_2.anInt384] = null;
						node_sub4_2.anInt378 = 0;
					}

					aNode_Sub4ArrayArray2[int_0][node_sub4_1.anInt381] = node_sub4_1;
				}

				anAClass5_Sub4_1.aDeque6.addFront(node_sub4_1);
				aNode_Sub4ArrayArray1[int_0][int_1] = node_sub4_1;
			}
		}
	}

	void method767() {
	}

	void method768() {
		method763(-1);
		method765(-1);

		int int_0;
		for (int_0 = 0; int_0 < 16; int_0++) {
			anIntArray90[int_0] = anIntArray89[int_0];
		}

		for (int_0 = 0; int_0 < 16; int_0++) {
			anIntArray95[int_0] = anIntArray89[int_0] & 0xFFFFFF80;
		}

	}

	void method769(final int int_0, final int int_1) {
		if (int_1 != anIntArray90[int_0]) {
			anIntArray90[int_0] = int_1;

			for (int int_2 = 0; int_2 < 128; int_2++) {
				aNode_Sub4ArrayArray2[int_0][int_2] = null;
			}
		}

	}

	@Override
	protected synchronized void method625(final int[] ints_0, int int_0, int int_1) {
		if (aClass69_1.method406()) {
			final int int_2 = (aClass69_1.anInt174 * anInt481) / ChatLineBuffer.sampleRate;

			do {
				final long long_0 = aLong21 + ((long) int_2 * (long) int_1);
				if ((aLong20 - long_0) >= 0L) {
					aLong21 = long_0;
					break;
				}

				final int int_3 = (int) ((((aLong20 - aLong21) + int_2) - 1L) / int_2);
				aLong21 += (long) int_2 * (long) int_3;
				anAClass5_Sub4_1.method625(ints_0, int_0, int_3);
				int_0 += int_3;
				int_1 -= int_3;
				method786();
			} while (aClass69_1.method406());
		}

		anAClass5_Sub4_1.method625(ints_0, int_0, int_1);
	}

	@Override
	protected synchronized void method626(int int_0) {
		if (aClass69_1.method406()) {
			final int int_1 = (aClass69_1.anInt174 * anInt481) / ChatLineBuffer.sampleRate;

			do {
				final long long_0 = ((long) int_0 * (long) int_1) + aLong21;
				if ((aLong20 - long_0) >= 0L) {
					aLong21 = long_0;
					break;
				}

				final int int_2 = (int) ((((aLong20 - aLong21) + int_1) - 1L) / int_1);
				aLong21 += (long) int_1 * (long) int_2;
				anAClass5_Sub4_1.method626(int_2);
				int_0 -= int_2;
				method786();
			} while (aClass69_1.method406());
		}

		anAClass5_Sub4_1.method626(int_0);
	}

	void method770() {
	}

	void method771(final int int_0, final int int_1) {
		anIntArray87[int_0] = int_1;
	}

	@Override
	protected synchronized AClass5 method628() {
		return null;
	}

	int method772(final Node_Sub4 node_sub4_0) {
		int int_0 = ((node_sub4_0.anInt374 * node_sub4_0.anInt375) >> 12) + node_sub4_0.anInt377;
		int_0 += ((anIntArray87[node_sub4_0.anInt376] - 8192) * anIntArray97[node_sub4_0.anInt376]) >> 12;
		final Class75 class75_0 = node_sub4_0.aClass75_1;
		int int_1;
		if ((class75_0.anInt179 > 0) && ((class75_0.anInt181 > 0) || (anIntArray99[node_sub4_0.anInt376] > 0))) {
			int_1 = class75_0.anInt181 << 2;
			final int int_2 = class75_0.anInt182 << 1;
			if (node_sub4_0.anInt386 < int_2) {
				int_1 = (int_1 * node_sub4_0.anInt386) / int_2;
			}

			int_1 += anIntArray99[node_sub4_0.anInt376] >> 7;
			final double double_0 = Math.sin(0.01227184630308513D * (node_sub4_0.anInt387 & 0x1FF));
			int_0 += (int) (double_0 * int_1);
		}

		int_1 = (int) (((node_sub4_0.anAClass7_Sub1_1.anInt448 * 256 * Math.pow(2.0D, int_0 * 3.255208333333333E-4D))
				/ ChatLineBuffer.sampleRate) + 0.5D);
		return int_1 < 1 ? 1 : int_1;
	}

	public synchronized boolean method773(final Track1 track1_0, final IndexDataBase indexdatabase_0,
			final Class54 class54_0, final int int_0) {
		track1_0.method684();
		boolean bool_0 = true;
		final int[] ints_0 = new int[] { int_0 };

		for (Node_Sub5 node_sub5_0 = (Node_Sub5) track1_0.aXHashTable7
				.method515(); node_sub5_0 != null; node_sub5_0 = (Node_Sub5) track1_0.aXHashTable7.method516()) {
			final int int_1 = (int) node_sub5_0.hash;
			Node_Sub6 node_sub6_0 = (Node_Sub6) aXHashTable8.get(int_1);
			if (node_sub6_0 == null) {
				node_sub6_0 = Class76.method447(indexdatabase_0, int_1);
				if (node_sub6_0 == null) {
					bool_0 = false;
					continue;
				}

				aXHashTable8.put(node_sub6_0, int_1);
			}

			if (!node_sub6_0.method644(class54_0, node_sub5_0.aByteArray14, ints_0)) {
				bool_0 = false;
			}
		}

		if (bool_0) {
			track1_0.method685();
		}

		return bool_0;
	}

	boolean method774(final Node_Sub4 node_sub4_0) {
		if (node_sub4_0.anAClass5_Sub2_3 == null) {
			if (node_sub4_0.anInt378 >= 0) {
				node_sub4_0.unlink();
				if ((node_sub4_0.anInt381 > 0)
						&& (node_sub4_0 == aNode_Sub4ArrayArray2[node_sub4_0.anInt376][node_sub4_0.anInt381])) {
					aNode_Sub4ArrayArray2[node_sub4_0.anInt376][node_sub4_0.anInt381] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	void method775(final int int_0) {
		if ((anIntArray91[int_0] & 0x2) != 0) {
			for (Node_Sub4 node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6
					.getFront(); node_sub4_0 != null; node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6.getNext()) {
				if ((node_sub4_0.anInt376 == int_0) && (aNode_Sub4ArrayArray1[int_0][node_sub4_0.anInt384] == null)
						&& (node_sub4_0.anInt378 < 0)) {
					node_sub4_0.anInt378 = 0;
				}
			}
		}

	}

	int method776() {
		return anInt479;
	}

	public synchronized void method777() {
		for (Node_Sub6 node_sub6_0 = (Node_Sub6) aXHashTable8
				.method515(); node_sub6_0 != null; node_sub6_0 = (Node_Sub6) aXHashTable8.method516()) {
			node_sub6_0.method643();
		}

	}

	void method778(final int int_0) {
		if ((anIntArray91[int_0] & 0x4) != 0) {
			for (Node_Sub4 node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6
					.getFront(); node_sub4_0 != null; node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6.getNext()) {
				if (node_sub4_0.anInt376 == int_0) {
					node_sub4_0.anInt383 = 0;
				}
			}
		}

	}

	void method779(final int int_0) {
		int int_1 = int_0 & 0xF0;
		int int_2;
		int int_3;
		int int_4;
		if (int_1 == 128) {
			int_2 = int_0 & 0xF;
			int_3 = (int_0 >> 8) & 0x7F;
			int_4 = (int_0 >> 16) & 0x7F;
			method762(int_2, int_3);
		} else if (int_1 == 144) {
			int_2 = int_0 & 0xF;
			int_3 = (int_0 >> 8) & 0x7F;
			int_4 = (int_0 >> 16) & 0x7F;
			if (int_4 > 0) {
				method766(int_2, int_3, int_4);
			} else {
				method762(int_2, int_3);
			}
		} else if (int_1 == 160) {
			int_2 = int_0 & 0xF;
			int_3 = (int_0 >> 8) & 0x7F;
			int_4 = (int_0 >> 16) & 0x7F;
			method767();
		} else if (int_1 == 176) {
			int_2 = int_0 & 0xF;
			int_3 = (int_0 >> 8) & 0x7F;
			int_4 = (int_0 >> 16) & 0x7F;
			if (int_3 == 0) {
				anIntArray95[int_2] = (int_4 << 14) + (anIntArray95[int_2] & 0xFFE03FFF);
			}

			if (int_3 == 32) {
				anIntArray95[int_2] = (int_4 << 7) + (anIntArray95[int_2] & 0xFFFFC07F);
			}

			if (int_3 == 1) {
				anIntArray99[int_2] = (int_4 << 7) + (anIntArray99[int_2] & 0xFFFFC07F);
			}

			if (int_3 == 33) {
				anIntArray99[int_2] = int_4 + (anIntArray99[int_2] & 0xFFFFFF80);
			}

			if (int_3 == 5) {
				anIntArray98[int_2] = (int_4 << 7) + (anIntArray98[int_2] & 0xFFFFC07F);
			}

			if (int_3 == 37) {
				anIntArray98[int_2] = int_4 + (anIntArray98[int_2] & 0xFFFFFF80);
			}

			if (int_3 == 7) {
				anIntArray93[int_2] = (int_4 << 7) + (anIntArray93[int_2] & 0xFFFFC07F);
			}

			if (int_3 == 39) {
				anIntArray93[int_2] = int_4 + (anIntArray93[int_2] & 0xFFFFFF80);
			}

			if (int_3 == 10) {
				anIntArray88[int_2] = (int_4 << 7) + (anIntArray88[int_2] & 0xFFFFC07F);
			}

			if (int_3 == 42) {
				anIntArray88[int_2] = int_4 + (anIntArray88[int_2] & 0xFFFFFF80);
			}

			if (int_3 == 11) {
				anIntArray92[int_2] = (int_4 << 7) + (anIntArray92[int_2] & 0xFFFFC07F);
			}

			if (int_3 == 43) {
				anIntArray92[int_2] = int_4 + (anIntArray92[int_2] & 0xFFFFFF80);
			}

			if (int_3 == 64) {
				if (int_4 >= 64) {
					anIntArray91[int_2] |= 0x1;
				} else {
					anIntArray91[int_2] &= 0xFFFFFFFE;
				}
			}

			if (int_3 == 65) {
				if (int_4 >= 64) {
					anIntArray91[int_2] |= 0x2;
				} else {
					method775(int_2);
					anIntArray91[int_2] &= 0xFFFFFFFD;
				}
			}

			if (int_3 == 99) {
				anIntArray100[int_2] = (int_4 << 7) + (anIntArray100[int_2] & 0x7F);
			}

			if (int_3 == 98) {
				anIntArray100[int_2] = (anIntArray100[int_2] & 0x3F80) + int_4;
			}

			if (int_3 == 101) {
				anIntArray100[int_2] = (int_4 << 7) + (anIntArray100[int_2] & 0x7F) + 16384;
			}

			if (int_3 == 100) {
				anIntArray100[int_2] = int_4 + (anIntArray100[int_2] & 0x3F80) + 16384;
			}

			if (int_3 == 120) {
				method763(int_2);
			}

			if (int_3 == 121) {
				method765(int_2);
			}

			if (int_3 == 123) {
				method791(int_2);
			}

			int int_5;
			if (int_3 == 6) {
				int_5 = anIntArray100[int_2];
				if (int_5 == 16384) {
					anIntArray97[int_2] = (int_4 << 7) + (anIntArray97[int_2] & 0xFFFFC07F);
				}
			}

			if (int_3 == 38) {
				int_5 = anIntArray100[int_2];
				if (int_5 == 16384) {
					anIntArray97[int_2] = int_4 + (anIntArray97[int_2] & 0xFFFFFF80);
				}
			}

			if (int_3 == 16) {
				anIntArray96[int_2] = (int_4 << 7) + (anIntArray96[int_2] & 0xFFFFC07F);
			}

			if (int_3 == 48) {
				anIntArray96[int_2] = int_4 + (anIntArray96[int_2] & 0xFFFFFF80);
			}

			if (int_3 == 81) {
				if (int_4 >= 64) {
					anIntArray91[int_2] |= 0x4;
				} else {
					method778(int_2);
					anIntArray91[int_2] &= 0xFFFFFFFB;
				}
			}

			if (int_3 == 17) {
				method785(int_2, (int_4 << 7) + (anIntArray86[int_2] & 0xFFFFC07F));
			}

			if (int_3 == 49) {
				method785(int_2, int_4 + (anIntArray86[int_2] & 0xFFFFFF80));
			}

		} else if (int_1 == 192) {
			int_2 = int_0 & 0xF;
			int_3 = (int_0 >> 8) & 0x7F;
			method769(int_2, int_3 + anIntArray95[int_2]);
		} else if (int_1 == 208) {
			int_2 = int_0 & 0xF;
			int_3 = (int_0 >> 8) & 0x7F;
			method770();
		} else if (int_1 == 224) {
			int_2 = int_0 & 0xF;
			int_3 = ((int_0 >> 8) & 0x7F) + ((int_0 >> 9) & 0x3F80);
			method771(int_2, int_3);
		} else {
			int_1 = int_0 & 0xFF;
			if (int_1 == 255) {
				method768();
			}
		}
	}

	public synchronized boolean method780() {
		return aClass69_1.method406();
	}

	public synchronized void method781(final int int_0) {
		anInt479 = int_0;
	}

	synchronized void method782() {
		for (Node_Sub6 node_sub6_0 = (Node_Sub6) aXHashTable8
				.method515(); node_sub6_0 != null; node_sub6_0 = (Node_Sub6) aXHashTable8.method516()) {
			node_sub6_0.unlink();
		}

	}

	public synchronized void method783(final Track1 track1_0, final boolean bool_0) {
		method764();
		aClass69_1.method407(track1_0.aByteArray18);
		aBool51 = bool_0;
		aLong21 = 0L;
		final int int_0 = aClass69_1.method410();

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			aClass69_1.method408(int_1);
			aClass69_1.method412(int_1);
			aClass69_1.method416(int_1);
		}

		anInt478 = aClass69_1.method409();
		anInt480 = aClass69_1.anIntArray43[anInt478];
		aLong20 = aClass69_1.method414(anInt480);
	}

	boolean method784(final Node_Sub4 node_sub4_0, final int[] ints_0, final int int_0, final int int_1) {
		node_sub4_0.anInt379 = ChatLineBuffer.sampleRate / 100;
		if ((node_sub4_0.anInt378 < 0)
				|| ((node_sub4_0.anAClass5_Sub2_3 != null) && !node_sub4_0.anAClass5_Sub2_3.method716())) {
			int int_2 = node_sub4_0.anInt375;
			if (int_2 > 0) {
				int_2 -= (int) ((16.0D * Math.pow(2.0D, anIntArray98[node_sub4_0.anInt376] * 4.921259842519685E-4D))
						+ 0.5D);
				if (int_2 < 0) {
					int_2 = 0;
				}

				node_sub4_0.anInt375 = int_2;
			}

			node_sub4_0.anAClass5_Sub2_3.method717(method772(node_sub4_0));
			final Class75 class75_0 = node_sub4_0.aClass75_1;
			boolean bool_0 = false;
			++node_sub4_0.anInt386;
			node_sub4_0.anInt387 += class75_0.anInt179;
			final double double_0 = (((node_sub4_0.anInt384 - 60) << 8)
					+ ((node_sub4_0.anInt374 * node_sub4_0.anInt375) >> 12)) * 5.086263020833333E-6D;
			if (class75_0.anInt180 > 0) {
				if (class75_0.anInt183 > 0) {
					node_sub4_0.anInt385 += (int) ((128.0D * Math.pow(2.0D, double_0 * class75_0.anInt183)) + 0.5D);
				} else {
					node_sub4_0.anInt385 += 128;
				}
			}

			if (class75_0.aByteArray10 != null) {
				if (class75_0.anInt184 > 0) {
					node_sub4_0.anInt388 += (int) ((128.0D * Math.pow(2.0D, double_0 * class75_0.anInt184)) + 0.5D);
				} else {
					node_sub4_0.anInt388 += 128;
				}

				while ((node_sub4_0.anInt389 < (class75_0.aByteArray10.length - 2))
						&& (node_sub4_0.anInt388 > ((class75_0.aByteArray10[node_sub4_0.anInt389 + 2] & 0xFF) << 8))) {
					node_sub4_0.anInt389 += 2;
				}

				if (((class75_0.aByteArray10.length - 2) == node_sub4_0.anInt389)
						&& (class75_0.aByteArray10[node_sub4_0.anInt389 + 1] == 0)) {
					bool_0 = true;
				}
			}

			if ((node_sub4_0.anInt378 >= 0) && (class75_0.aByteArray11 != null)
					&& ((anIntArray91[node_sub4_0.anInt376] & 0x1) == 0) && ((node_sub4_0.anInt381 < 0)
							|| (node_sub4_0 != aNode_Sub4ArrayArray2[node_sub4_0.anInt376][node_sub4_0.anInt381]))) {
				if (class75_0.anInt185 > 0) {
					node_sub4_0.anInt378 += (int) ((128.0D * Math.pow(2.0D, class75_0.anInt185 * double_0)) + 0.5D);
				} else {
					node_sub4_0.anInt378 += 128;
				}

				while ((node_sub4_0.anInt390 < (class75_0.aByteArray11.length - 2))
						&& (node_sub4_0.anInt378 > ((class75_0.aByteArray11[node_sub4_0.anInt390 + 2] & 0xFF) << 8))) {
					node_sub4_0.anInt390 += 2;
				}

				if ((class75_0.aByteArray11.length - 2) == node_sub4_0.anInt390) {
					bool_0 = true;
				}
			}

			if (bool_0) {
				node_sub4_0.anAClass5_Sub2_3.method718(node_sub4_0.anInt379);
				if (ints_0 != null) {
					node_sub4_0.anAClass5_Sub2_3.method625(ints_0, int_0, int_1);
				} else {
					node_sub4_0.anAClass5_Sub2_3.method626(int_1);
				}

				if (node_sub4_0.anAClass5_Sub2_3.method719()) {
					anAClass5_Sub4_1.anAClass5_Sub1_2.method699(node_sub4_0.anAClass5_Sub2_3);
				}

				node_sub4_0.method642();
				if (node_sub4_0.anInt378 >= 0) {
					node_sub4_0.unlink();
					if ((node_sub4_0.anInt381 > 0)
							&& (node_sub4_0 == aNode_Sub4ArrayArray2[node_sub4_0.anInt376][node_sub4_0.anInt381])) {
						aNode_Sub4ArrayArray2[node_sub4_0.anInt376][node_sub4_0.anInt381] = null;
					}
				}

				return true;
			} else {
				node_sub4_0.anAClass5_Sub2_3.method713(node_sub4_0.anInt379, method788(node_sub4_0),
						method789(node_sub4_0));
				return false;
			}
		} else {
			node_sub4_0.method642();
			node_sub4_0.unlink();
			if ((node_sub4_0.anInt381 > 0)
					&& (node_sub4_0 == aNode_Sub4ArrayArray2[node_sub4_0.anInt376][node_sub4_0.anInt381])) {
				aNode_Sub4ArrayArray2[node_sub4_0.anInt376][node_sub4_0.anInt381] = null;
			}

			return true;
		}
	}

	void method785(final int int_0, final int int_1) {
		anIntArray86[int_0] = int_1;
		anIntArray94[int_0] = (int) ((2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * int_1)) + 0.5D);
	}

	@Override
	protected synchronized AClass5 method629() {
		return anAClass5_Sub4_1;
	}

	void method786() {
		int int_0 = anInt478;
		int int_1 = anInt480;

		long long_0;
		for (long_0 = aLong20; int_1 == anInt480; long_0 = aClass69_1.method414(int_1)) {
			while (int_1 == aClass69_1.anIntArray43[int_0]) {
				aClass69_1.method408(int_0);
				final int int_2 = aClass69_1.method411(int_0);
				if (int_2 == 1) {
					aClass69_1.method415();
					aClass69_1.method416(int_0);
					if (aClass69_1.method417()) {
						if (!aBool51 || (int_1 == 0)) {
							method768();
							aClass69_1.method405();
							return;
						}

						aClass69_1.method418(long_0);
					}
					break;
				}

				if ((int_2 & 0x80) != 0) {
					method779(int_2);
				}

				aClass69_1.method412(int_0);
				aClass69_1.method416(int_0);
			}

			int_0 = aClass69_1.method409();
			int_1 = aClass69_1.anIntArray43[int_0];
		}

		anInt478 = int_0;
		anInt480 = int_1;
		aLong20 = long_0;
	}

	void method787(final Node_Sub4 node_sub4_0, final boolean bool_0) {
		int int_0 = node_sub4_0.anAClass7_Sub1_1.aByteArray19.length;
		int int_2;
		if (bool_0 && node_sub4_0.anAClass7_Sub1_1.aBool49) {
			final int int_1 = (int_0 + int_0) - node_sub4_0.anAClass7_Sub1_1.anInt449;
			int_2 = (int) (((long) int_1 * (long) anIntArray96[node_sub4_0.anInt376]) >> 6);
			int_0 <<= 8;
			if (int_2 >= int_0) {
				int_2 = (int_0 + int_0) - 1 - int_2;
				node_sub4_0.anAClass5_Sub2_3.method721();
			}
		} else {
			int_2 = (int) (((long) int_0 * (long) anIntArray96[node_sub4_0.anInt376]) >> 6);
		}

		node_sub4_0.anAClass5_Sub2_3.method714(int_2);
	}

	@Override
	protected synchronized int method631() {
		return 0;
	}

	int method788(final Node_Sub4 node_sub4_0) {
		final Class75 class75_0 = node_sub4_0.aClass75_1;
		int int_0 = ((anIntArray92[node_sub4_0.anInt376] * anIntArray93[node_sub4_0.anInt376]) + 4096) >> 13;
		int_0 = ((int_0 * int_0) + 16384) >> 15;
		int_0 = ((int_0 * node_sub4_0.anInt382) + 16384) >> 15;
		int_0 = ((int_0 * anInt479) + 128) >> 8;
		if (class75_0.anInt180 > 0) {
			int_0 = (int) ((int_0
					* Math.pow(0.5D, (double) class75_0.anInt180 * (double) node_sub4_0.anInt385 * 1.953125E-5D))
					+ 0.5D);
		}

		int int_1;
		int int_2;
		int int_3;
		int int_4;
		if (class75_0.aByteArray10 != null) {
			int_1 = node_sub4_0.anInt388;
			int_2 = class75_0.aByteArray10[node_sub4_0.anInt389 + 1];
			if (node_sub4_0.anInt389 < (class75_0.aByteArray10.length - 2)) {
				int_3 = (class75_0.aByteArray10[node_sub4_0.anInt389] & 0xFF) << 8;
				int_4 = (class75_0.aByteArray10[node_sub4_0.anInt389 + 2] & 0xFF) << 8;
				int_2 += ((class75_0.aByteArray10[node_sub4_0.anInt389 + 3] - int_2) * (int_1 - int_3))
						/ (int_4 - int_3);
			}

			int_0 = ((int_0 * int_2) + 32) >> 6;
		}

		if ((node_sub4_0.anInt378 > 0) && (class75_0.aByteArray11 != null)) {
			int_1 = node_sub4_0.anInt378;
			int_2 = class75_0.aByteArray11[node_sub4_0.anInt390 + 1];
			if (node_sub4_0.anInt390 < (class75_0.aByteArray11.length - 2)) {
				int_3 = (class75_0.aByteArray11[node_sub4_0.anInt390] & 0xFF) << 8;
				int_4 = (class75_0.aByteArray11[node_sub4_0.anInt390 + 2] & 0xFF) << 8;
				int_2 += ((class75_0.aByteArray11[node_sub4_0.anInt390 + 3] - int_2) * (int_1 - int_3))
						/ (int_4 - int_3);
			}

			int_0 = ((int_2 * int_0) + 32) >> 6;
		}

		return int_0;
	}

	int method789(final Node_Sub4 node_sub4_0) {
		final int int_0 = anIntArray88[node_sub4_0.anInt376];
		return int_0 < 8192 ? ((int_0 * node_sub4_0.anInt380) + 32) >> 6
				: 16384 - ((((128 - node_sub4_0.anInt380) * (16384 - int_0)) + 32) >> 6);
	}

	public synchronized void method790(final int int_0, final int int_1) {
		method761(int_0, int_1);
	}

	void method791(final int int_0) {
		for (Node_Sub4 node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6
				.getFront(); node_sub4_0 != null; node_sub4_0 = (Node_Sub4) anAClass5_Sub4_1.aDeque6.getNext()) {
			if (((int_0 < 0) || (node_sub4_0.anInt376 == int_0)) && (node_sub4_0.anInt378 < 0)) {
				aNode_Sub4ArrayArray1[node_sub4_0.anInt376][node_sub4_0.anInt384] = null;
				node_sub4_0.anInt378 = 0;
			}
		}

	}

}
