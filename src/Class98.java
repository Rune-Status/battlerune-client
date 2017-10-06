public class Class98 {

	public static final char[] aCharArray3;

	static {
		aCharArray3 = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021',
				'\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018',
				'\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a',
				'\u0153', '\u0000', '\u017e', '\u0178' };
	}

	public static ModIcon[] method494(final IndexDataBase indexdatabase_0, final String string_0,
			final String string_1) {
		final int int_0 = indexdatabase_0.getFile(string_0);
		final int int_1 = indexdatabase_0.getChild(int_0, string_1);
		ModIcon[] modicons_0;
		if (!IndexData.method597(indexdatabase_0, int_0, int_1)) {
			modicons_0 = null;
		} else {
			modicons_0 = CacheableNode_Sub1.method805();
		}

		return modicons_0;
	}

}
