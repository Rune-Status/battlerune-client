import java.io.File;
import java.io.RandomAccessFile;

public class Class36 {

	static Font aFont3;
	protected static boolean aBool9;

	public static CacheableNode_Sub3 method246(final int int_0) {
		CacheableNode_Sub3 cacheablenode_sub3_0 = (CacheableNode_Sub3) CacheableNode_Sub3.aNodeCache13.get(int_0);
		if (cacheablenode_sub3_0 != null) {
			return cacheablenode_sub3_0;
		} else {
			final byte[] bytes_0 = CacheableNode_Sub3.anIndexDataBase22.getConfigData(32, int_0);
			cacheablenode_sub3_0 = new CacheableNode_Sub3();
			if (bytes_0 != null) {
				cacheablenode_sub3_0.method816(new Buffer(bytes_0));
			}

			CacheableNode_Sub3.aNodeCache13.put(cacheablenode_sub3_0, int_0);
			return cacheablenode_sub3_0;
		}
	}

	static void method247(final IndexData indexdata_0, final int int_0) {
		if (WorldMapData_Sub1.aBuffer5 != null) {
			WorldMapData_Sub1.aBuffer5.offset = (8 * int_0) + 5;
			final int int_1 = WorldMapData_Sub1.aBuffer5.readInt();
			final int int_2 = WorldMapData_Sub1.aBuffer5.readInt();
			indexdata_0.setInformation(int_1, int_2);
		} else {
			FileOnDisk.method75((IndexData) null, 255, 255, 0, (byte) 0, true);
			Class93.anIndexDataArray1[int_0] = indexdata_0;
		}
	}

	public static File method248(final String string_0) {
		if (!Class58.aBool18) {
			throw new RuntimeException("");
		} else {
			final File file_0 = (File) Class58.aHashtable1.get(string_0);
			if (file_0 != null) {
				return file_0;
			} else {
				final File file_1 = new File(Class58.aFile3, string_0);
				RandomAccessFile randomaccessfile_0 = null;

				try {
					final File file_2 = new File(file_1.getParent());
					if (!file_2.exists()) {
						throw new RuntimeException("");
					} else {
						randomaccessfile_0 = new RandomAccessFile(file_1, "rw");
						final int int_0 = randomaccessfile_0.read();
						randomaccessfile_0.seek(0L);
						randomaccessfile_0.write(int_0);
						randomaccessfile_0.seek(0L);
						randomaccessfile_0.close();
						Class58.aHashtable1.put(string_0, file_1);
						return file_1;
					}
				} catch (final Exception exception_0) {
					try {
						if (randomaccessfile_0 != null) {
							randomaccessfile_0.close();
							randomaccessfile_0 = null;
						}
					} catch (final Exception exception_1) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

	static void method249(final int int_0, final Coordinates coordinates_0, final boolean bool_0) {
		final WorldMapData worldmapdata_0 = Class3.method86().method18(int_0);
		final int int_1 = Script.localPlayer.anInt632;
		final int int_2 = (Script.localPlayer.anInt547 >> 7) + AClass2.baseX;
		final int int_3 = (Script.localPlayer.anInt550 >> 7) + AClass4_Sub1.baseY;
		final Coordinates coordinates_1 = new Coordinates(int_1, int_2, int_3);
		Class3.method86().method66(worldmapdata_0, coordinates_1, coordinates_0, bool_0);
	}

}
