public final class Occluder {

	static RSSocket rssocket;
	int testDirection;
	int minX;
	int type;
	int minNormalX;
	int minTileX;
	int minZ;
	int minTileZ;
	int maxNormalX;
	int anInt161;
	int maxZ;
	int minY;
	int minNormalY;
	int anInt162;
	int maxX;
	int maxNormalY;
	int maxY;
	int maxTileZ;
	int maxTIleX;

	static void method382(final int int_0, final IndexFile indexfile_0, final IndexData indexdata_0) {
		byte[] bytes_0 = null;
		synchronized (Class92.aDeque1) {
			for (FileSystem filesystem_0 = (FileSystem) Class92.aDeque1
					.getFront(); filesystem_0 != null; filesystem_0 = (FileSystem) Class92.aDeque1.getNext()) {
				if ((filesystem_0.hash == int_0) && (indexfile_0 == filesystem_0.index)
						&& (filesystem_0.anInt361 == 0)) {
					bytes_0 = filesystem_0.aByteArray13;
					break;
				}
			}
		}

		if (bytes_0 != null) {
			indexdata_0.method594(indexfile_0, int_0, bytes_0, true);
		} else {
			final byte[] bytes_1 = indexfile_0.method69(int_0);
			indexdata_0.method594(indexfile_0, int_0, bytes_1, true);
		}
	}

	public static void method383(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1) {
		CombatInfo2.anIndexDataBase20 = indexdatabase_0;
		Class111.anIndexDataBase14 = indexdatabase_1;
	}

}
