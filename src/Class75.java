public class Class75 {

	static MachineInfo aMachineInfo1;
	int anInt179;
	int anInt180;
	int anInt181;
	byte[] aByteArray10;
	int anInt182;
	byte[] aByteArray11;
	int anInt183;
	int anInt184;
	int anInt185;

	public static void method445() {
		CacheableNode_Sub2.aNodeCache12.reset();
	}

	public static String method446(final CharSequence charsequence_0, final Class110 class110_0) {
		if (charsequence_0 == null) {
			return null;
		} else {
			int int_0 = 0;

			int int_1;
			for (int_1 = charsequence_0.length(); (int_0 < int_1)
					&& Class40.method259(charsequence_0.charAt(int_0)); int_0++) {
				;
			}

			while ((int_1 > int_0) && Class40.method259(charsequence_0.charAt(int_1 - 1))) {
				--int_1;
			}

			final int int_2 = int_1 - int_0;
			if ((int_2 >= 1) && (int_2 <= WorldMapData.method304(class110_0))) {
				final StringBuilder stringbuilder_0 = new StringBuilder(int_2);

				for (int int_3 = int_0; int_3 < int_1; int_3++) {
					final char char_0 = charsequence_0.charAt(int_3);
					boolean bool_0;
					if (Character.isISOControl(char_0)) {
						bool_0 = false;
					} else {
						final boolean bool_1 = ((char_0 >= 48) && (char_0 <= 57)) || ((char_0 >= 65) && (char_0 <= 90))
								|| ((char_0 >= 97) && (char_0 <= 122));
						if (bool_1) {
							bool_0 = true;
						} else {
							char[] chars_0 = Class104.aCharArray6;
							int int_4 = 0;

							label70: while (true) {
								char char_1;
								if (int_4 >= chars_0.length) {
									chars_0 = Class104.aCharArray7;

									for (int_4 = 0; int_4 < chars_0.length; int_4++) {
										char_1 = chars_0[int_4];
										if (char_1 == char_0) {
											bool_0 = true;
											break label70;
										}
									}

									bool_0 = false;
									break;
								}

								char_1 = chars_0[int_4];
								if (char_1 == char_0) {
									bool_0 = true;
									break;
								}

								++int_4;
							}
						}
					}

					if (bool_0) {
						final char char_2 = Class57.method349(char_0);
						if (char_2 != 0) {
							stringbuilder_0.append(char_2);
						}
					}
				}

				if (stringbuilder_0.length() == 0) {
					return null;
				} else {
					return stringbuilder_0.toString();
				}
			} else {
				return null;
			}
		}
	}

}
