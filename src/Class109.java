public class Class109 {

	boolean aBool25;
	int anInt221;
	IndexDataBase anIndexDataBase13;
	String aString13;

	Class109(final IndexDataBase indexdatabase_0) {
		anInt221 = 0;
		aBool25 = false;
		anIndexDataBase13 = indexdatabase_0;
	}

	int method510() {
		if (anInt221 < 25) {
			if (!anIndexDataBase13.method432(Class16.aClass16_2.aString2, aString13)) {
				return anInt221;
			}

			anInt221 = 25;
		}

		if (anInt221 == 25) {
			if (!anIndexDataBase13.method432(aString13, Class16.aClass16_3.aString2)) {
				return 25 + ((anIndexDataBase13.method437(aString13) * 25) / 100);
			}

			anInt221 = 50;
		}

		if (anInt221 == 50) {
			if (anIndexDataBase13.method435(Class16.aClass16_4.aString2, aString13)
					&& !anIndexDataBase13.method432(Class16.aClass16_4.aString2, aString13)) {
				return 50;
			}

			anInt221 = 75;
		}

		if (anInt221 == 75) {
			if (!anIndexDataBase13.method432(aString13, Class16.aClass16_5.aString2)) {
				return 75;
			}

			anInt221 = 100;
			aBool25 = true;
		}

		return anInt221;
	}

	boolean method511() {
		return aBool25;
	}

	void method512(final String string_0) {
		if ((string_0 != null) && !string_0.isEmpty()) {
			if (string_0 != aString13) {
				aString13 = string_0;
				anInt221 = 0;
				aBool25 = false;
				method510();
			}
		}
	}

	int method513() {
		return anInt221;
	}

	static int method514(final int int_0, int int_1) {
		if (int_0 == -2) {
			return 12345678;
		} else if (int_0 == -1) {
			if (int_1 < 0) {
				int_1 = 0;
			} else if (int_1 > 127) {
				int_1 = 127;
			}

			int_1 = 127 - int_1;
			return int_1;
		} else {
			int_1 = ((int_0 & 0x7F) * int_1) / 128;
			if (int_1 < 2) {
				int_1 = 2;
			} else if (int_1 > 126) {
				int_1 = 126;
			}

			return (int_0 & 0xFF80) + int_1;
		}
	}

}
