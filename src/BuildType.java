public class BuildType {

	public static final BuildType aBuildType2;
	public static final BuildType WIP;
	public static final BuildType LIVE;
	public static final BuildType BUILD_LIVE;
	static IndexData anIndexData3;
	public final String identifier;
	public final int ordinal;

	static {
		aBuildType2 = new BuildType("LIVE", 0);
		WIP = new BuildType("BUILDLIVE", 3);
		LIVE = new BuildType("RC", 1);
		BUILD_LIVE = new BuildType("WIP", 2);
	}

	BuildType(final String string_0, final int int_0) {
		identifier = string_0;
		ordinal = int_0;
	}

	public static int method504(final CharSequence charsequence_0, final int int_0, final int int_1,
			final byte[] bytes_0, final int int_2) {
		final int int_3 = int_1 - int_0;

		for (int int_4 = 0; int_4 < int_3; int_4++) {
			final char char_0 = charsequence_0.charAt(int_4 + int_0);
			if (((char_0 > 0) && (char_0 < 128)) || ((char_0 >= 160) && (char_0 <= 255))) {
				bytes_0[int_4 + int_2] = (byte) char_0;
			} else if (char_0 == 8364) {
				bytes_0[int_4 + int_2] = -128;
			} else if (char_0 == 8218) {
				bytes_0[int_4 + int_2] = -126;
			} else if (char_0 == 402) {
				bytes_0[int_4 + int_2] = -125;
			} else if (char_0 == 8222) {
				bytes_0[int_4 + int_2] = -124;
			} else if (char_0 == 8230) {
				bytes_0[int_4 + int_2] = -123;
			} else if (char_0 == 8224) {
				bytes_0[int_4 + int_2] = -122;
			} else if (char_0 == 8225) {
				bytes_0[int_4 + int_2] = -121;
			} else if (char_0 == 710) {
				bytes_0[int_4 + int_2] = -120;
			} else if (char_0 == 8240) {
				bytes_0[int_4 + int_2] = -119;
			} else if (char_0 == 352) {
				bytes_0[int_4 + int_2] = -118;
			} else if (char_0 == 8249) {
				bytes_0[int_4 + int_2] = -117;
			} else if (char_0 == 338) {
				bytes_0[int_4 + int_2] = -116;
			} else if (char_0 == 381) {
				bytes_0[int_4 + int_2] = -114;
			} else if (char_0 == 8216) {
				bytes_0[int_4 + int_2] = -111;
			} else if (char_0 == 8217) {
				bytes_0[int_4 + int_2] = -110;
			} else if (char_0 == 8220) {
				bytes_0[int_4 + int_2] = -109;
			} else if (char_0 == 8221) {
				bytes_0[int_4 + int_2] = -108;
			} else if (char_0 == 8226) {
				bytes_0[int_4 + int_2] = -107;
			} else if (char_0 == 8211) {
				bytes_0[int_4 + int_2] = -106;
			} else if (char_0 == 8212) {
				bytes_0[int_4 + int_2] = -105;
			} else if (char_0 == 732) {
				bytes_0[int_4 + int_2] = -104;
			} else if (char_0 == 8482) {
				bytes_0[int_4 + int_2] = -103;
			} else if (char_0 == 353) {
				bytes_0[int_4 + int_2] = -102;
			} else if (char_0 == 8250) {
				bytes_0[int_4 + int_2] = -101;
			} else if (char_0 == 339) {
				bytes_0[int_4 + int_2] = -100;
			} else if (char_0 == 382) {
				bytes_0[int_4 + int_2] = -98;
			} else if (char_0 == 376) {
				bytes_0[int_4 + int_2] = -97;
			} else {
				bytes_0[int_4 + int_2] = 63;
			}
		}

		return int_3;
	}

}
