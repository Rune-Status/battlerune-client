public class Class55 {

	public static void method345() {
		try {
			if (Class76.anInt186 == 1) {
				int int_0 = Class76.anAClass5_Sub3_1.method776();
				if ((int_0 > 0) && Class76.anAClass5_Sub3_1.method780()) {
					int_0 -= AClass2_Sub1.anInt334;
					if (int_0 < 0) {
						int_0 = 0;
					}

					Class76.anAClass5_Sub3_1.method781(int_0);
				} else {
					Class76.anAClass5_Sub3_1.method764();
					Class76.anAClass5_Sub3_1.method782();
					if (Class76.anIndexDataBase3 != null) {
						Class76.anInt186 = 2;
					} else {
						Class76.anInt186 = 0;
					}

					Enum3.aTrack1_1 = null;
					Class76.aClass54_1 = null;
				}
			}
		} catch (final Exception exception_0) {
			exception_0.printStackTrace();
			Class76.anAClass5_Sub3_1.method764();
			Class76.anInt186 = 0;
			Enum3.aTrack1_1 = null;
			Class76.aClass54_1 = null;
			Class76.anIndexDataBase3 = null;
		}
	}

	static final int method346(final int int_0, final int int_1, final int int_2) {
		final int int_3 = 256 - int_2;
		return (((((int_0 & 0xFF00FF) * int_3) + (int_2 * (int_1 & 0xFF00FF))) & 0xFF00FF00)
				+ (((int_3 * (int_0 & 0xFF00)) + (int_2 * (int_1 & 0xFF00))) & 0xFF0000)) >> 8;
	}

}
