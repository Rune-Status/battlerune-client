public enum Enum5 implements RSEnum {

	anEnum5_1(6, 0), anEnum5_2(5, 1), anEnum5_3(2, 2), anEnum5_4(1, 3), anEnum5_5(4, 4), anEnum5_6(3, 5), anEnum5_7(7,
			6), anEnum5_8(0, 7);

	static ModIcon aModIcon4;
	public final int anInt398;
	final int anInt399;

	Enum5(final int int_1, final int int_2) {
		anInt398 = int_1;
		anInt399 = int_2;
	}

	@Override
	public int rsOrdinal() {
		return anInt399;
	}

	public static CacheableNode_Sub4 method656(final int int_0) {
		CacheableNode_Sub4 cacheablenode_sub4_0 = (CacheableNode_Sub4) CacheableNode_Sub4.aNodeCache16.get(int_0);
		if (cacheablenode_sub4_0 != null) {
			return cacheablenode_sub4_0;
		} else {
			final byte[] bytes_0 = CacheableNode_Sub4.anIndexDataBase25.getConfigData(11, int_0);
			cacheablenode_sub4_0 = new CacheableNode_Sub4();
			if (bytes_0 != null) {
				cacheablenode_sub4_0.method827(new Buffer(bytes_0));
			}

			cacheablenode_sub4_0.method826();
			CacheableNode_Sub4.aNodeCache16.put(cacheablenode_sub4_0, int_0);
			return cacheablenode_sub4_0;
		}
	}

}
