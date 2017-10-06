import java.io.File;

public class Class57 {

	public static CacheFile aCacheFile1;
	public static File aFile1;
	public static CacheFile aCacheFile2;
	public static CacheFile aCacheFile3;
	public static int anInt150;
	public static CacheFile[] aCacheFileArray1;
	public static String osName;
	public static File aFile2;

	static {
		aCacheFile1 = null;
		aCacheFile2 = null;
		aCacheFile3 = null;
	}

	static String method348(int int_0, final int int_1, final boolean bool_0) {
		if ((int_1 >= 2) && (int_1 <= 36)) {
			if (bool_0 && (int_0 >= 0)) {
				int int_2 = 2;

				for (int int_3 = int_0 / int_1; int_3 != 0; int_2++) {
					int_3 /= int_1;
				}

				final char[] chars_0 = new char[int_2];
				chars_0[0] = 43;

				for (int int_4 = int_2 - 1; int_4 > 0; --int_4) {
					final int int_5 = int_0;
					int_0 /= int_1;
					final int int_6 = int_5 - (int_0 * int_1);
					if (int_6 >= 10) {
						chars_0[int_4] = (char) (int_6 + 87);
					} else {
						chars_0[int_4] = (char) (int_6 + 48);
					}
				}

				return new String(chars_0);
			} else {
				return Integer.toString(int_0, int_1);
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	static char method349(final char char_0) {
		switch (char_0) {
		case '\u0020':
		case '\u002d':
		case '\u005f':
		case '\u00a0':
			return '\u005f';
		case '\u0023':
		case '\u005b':
		case '\u005d':
			return char_0;
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return '\u0061';
		case '\u00c7':
		case '\u00e7':
			return '\u0063';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return '\u0065';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return '\u0069';
		case '\u00d1':
		case '\u00f1':
			return '\u006e';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return '\u006f';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return '\u0075';
		case '\u00df':
			return '\u0062';
		case '\u00ff':
		case '\u0178':
			return '\u0079';
		default:
			return Character.toLowerCase(char_0);
		}
	}

	public static final void method350(final int int_0, final int int_1) {
		Class56.anInt143 = int_0;
		Class56.anInt144 = int_1;
		Class56.aBool16 = true;
		Class56.anInt145 = 0;
		Class56.aBool17 = false;
	}

}
