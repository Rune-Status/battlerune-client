public class Class21 implements Runnable {

	static IndexData vorbisIndex;
	boolean aBool6;
	Object anObject1;
	int anInt74;
	int[] anIntArray9;
	int[] anIntArray10;

	Class21() {
		aBool6 = true;
		anObject1 = new Object();
		anInt74 = 0;
		anIntArray9 = new int[500];
		anIntArray10 = new int[500];
	}

	@Override
	public void run() {
		for (; aBool6; Class14.method189(50L)) {
			synchronized (anObject1) {
				if (anInt74 < 500) {
					anIntArray9[anInt74] = MouseInput.anInt278;
					anIntArray10[anInt74] = MouseInput.anInt280;
					++anInt74;
				}
			}
		}

	}

	static String method209(String string_0, final Widget widget_0) {
		if (string_0.indexOf("%") != -1) {
			int int_0;
			for (int_0 = 1; int_0 <= 5; int_0++) {
				while (true) {
					final int int_1 = string_0.indexOf("%" + int_0);
					if (int_1 == -1) {
						break;
					}

					final String string_1 = string_0.substring(0, int_1);
					final int int_2 = Class41.method262(widget_0, int_0 - 1);
					String string_2;
					if (int_2 < 999999999) {
						string_2 = Integer.toString(int_2);
					} else {
						string_2 = "*";
					}

					string_0 = string_1 + string_2 + string_0.substring(int_1 + 2);
				}
			}

			while (true) {
				int_0 = string_0.indexOf("%dns");
				if (int_0 == -1) {
					break;
				}

				String string_3 = "";
				if (AClass4_Sub2.aTask3 != null) {
					string_3 = FileSystem.method634(AClass4_Sub2.aTask3.anInt224);
					if (AClass4_Sub2.aTask3.value != null) {
						string_3 = (String) AClass4_Sub2.aTask3.value;
					}
				}

				string_0 = string_0.substring(0, int_0) + string_3 + string_0.substring(int_0 + 4);
			}
		}

		return string_0;
	}

}
