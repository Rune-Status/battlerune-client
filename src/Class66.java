public class Class66 {

	public static byte[][] spritePixels;

	public static CacheableNode_Sub6 getVarClientStringType(final int int_0) {
		CacheableNode_Sub6 cacheablenode_sub6_0 = (CacheableNode_Sub6) CacheableNode_Sub6.aNodeCache18.get(int_0);
		if (cacheablenode_sub6_0 != null) {
			return cacheablenode_sub6_0;
		} else {
			final byte[] bytes_0 = CacheableNode_Sub6.anIndexDataBase27.getConfigData(15, int_0);
			cacheablenode_sub6_0 = new CacheableNode_Sub6();
			if (bytes_0 != null) {
				cacheablenode_sub6_0.method833(new Buffer(bytes_0));
			}

			CacheableNode_Sub6.aNodeCache18.put(cacheablenode_sub6_0, int_0);
			return cacheablenode_sub6_0;
		}
	}

	public static void method398(final IndexDataBase indexdatabase_0) {
		Class41.varplayer_ref = indexdatabase_0;
		VarPlayerType.anInt537 = Class41.varplayer_ref.fileCount(16);
	}

}
