public final class ItemLayer {

	Renderable bottom;
	int anInt219;
	int anInt220;
	int hash;
	int flags;
	Renderable middle;
	Renderable top;
	int height;

	public static int method509(final byte[] bytes_0, final int int_0) {
		int int_1 = -1;

		for (int int_2 = 0; int_2 < int_0; int_2++) {
			int_1 = (int_1 >>> 8) ^ Buffer.crc32Table[(int_1 ^ bytes_0[int_2]) & 0xFF];
		}

		int_1 = ~int_1;
		return int_1;
	}

}
