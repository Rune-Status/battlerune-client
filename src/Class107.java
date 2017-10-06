import java.util.HashMap;

public class Class107 {

	IndexDataBase anIndexDataBase11;
	HashMap aHashMap8;
	IndexDataBase anIndexDataBase12;

	public Class107(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1) {
		anIndexDataBase11 = indexdatabase_0;
		anIndexDataBase12 = indexdatabase_1;
		aHashMap8 = new HashMap();
	}

	public HashMap method501(final Class101[] class101s_0) {
		final HashMap hashmap_0 = new HashMap();
		final Class101[] class101s_1 = class101s_0;

		for (int int_0 = 0; int_0 < class101s_1.length; int_0++) {
			final Class101 class101_0 = class101s_1[int_0];
			if (aHashMap8.containsKey(class101_0)) {
				hashmap_0.put(class101_0, aHashMap8.get(class101_0));
			} else {
				final IndexDataBase indexdatabase_0 = anIndexDataBase11;
				final IndexDataBase indexdatabase_1 = anIndexDataBase12;
				final String string_0 = class101_0.aString12;
				final int int_1 = indexdatabase_0.getFile(string_0);
				final int int_2 = indexdatabase_0.getChild(int_1, "");
				Font font_0;
				if (!IndexData.method597(indexdatabase_0, int_1, int_2)) {
					font_0 = null;
				} else {
					final byte[] bytes_0 = indexdatabase_1.getConfigData(int_1, int_2);
					Font font_1;
					if (bytes_0 == null) {
						font_1 = null;
					} else {
						final Font font_2 = new Font(bytes_0, Class108.anIntArray56, Class12.offsetsY,
								Class108.anIntArray57, Class37.anIntArray16, Class108.anIntArray58,
								Class66.spritePixels);
						Class32.method232();
						font_1 = font_2;
					}

					font_0 = font_1;
				}

				if (font_0 != null) {
					aHashMap8.put(class101_0, font_0);
					hashmap_0.put(class101_0, font_0);
				}
			}
		}

		return hashmap_0;
	}

	public static char method502(final byte byte_0) {
		int int_0 = byte_0 & 0xFF;
		if (int_0 == 0) {
			throw new IllegalArgumentException("");
		} else {
			if ((int_0 >= 128) && (int_0 < 160)) {
				char char_0 = Class98.aCharArray3[int_0 - 128];
				if (char_0 == 0) {
					char_0 = 63;
				}

				int_0 = char_0;
			}

			return (char) int_0;
		}
	}

}
