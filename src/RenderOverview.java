import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RenderOverview {

	static final Class101 aClass101_1;
	static final Class101 aClass101_2;
	static final Class101 aClass101_3;
	ModIcon[] aModIconArray1;
	boolean aBool1;
	HashSet aHashSet1;
	int anInt1;
	int anInt2;
	int anInt3;
	HashSet aHashSet2;
	boolean aBool2;
	int anInt4;
	int anInt5;
	IndexDataBase anIndexDataBase1;
	HashMap aHashMap1;
	HashSet aHashSet3;
	HashSet aHashSet4;
	Class109 aClass109_1;
	Iterator anIterator1;
	int anInt6;
	float aFloat1;
	float aFloat2;
	WorldMapData aWorldMapData1;
	WorldMapData aWorldMapData2;
	int anInt7;
	int anInt8;
	int anInt9;
	int anInt10;
	HashMap aHashMap2;
	int anInt11;
	WorldMapData aWorldMapData3;
	Font aFont1;
	Class13 aClass13_1;
	int anInt12;
	HashSet aHashSet5;
	List aList1;
	final int[] anIntArray1;
	HashSet aHashSet6;
	int anInt13;

	static {
		aClass101_1 = Class101.aClass101_4;
		aClass101_2 = Class101.aClass101_6;
		aClass101_3 = Class101.aClass101_7;
	}

	public RenderOverview() {
		anInt6 = -1;
		anInt8 = -1;
		anInt2 = -1;
		anInt1 = -1;
		anInt3 = 3;
		anInt4 = 50;
		aBool1 = false;
		aHashSet4 = null;
		anInt11 = -1;
		anInt12 = -1;
		anInt5 = -1;
		anInt7 = -1;
		aHashSet2 = new HashSet();
		aHashSet1 = new HashSet();
		aHashSet5 = new HashSet();
		aHashSet3 = new HashSet();
		aBool2 = false;
		anInt13 = 0;
		anIntArray1 = new int[] { 1008, 1009, 1010, 1011, 1012 };
		aHashSet6 = new HashSet();
	}

	boolean method15() {
		return (anInt6 != -1) && (anInt8 != -1);
	}

	public WorldMapData method16(final int int_0, final int int_1, final int int_2) {
		final Iterator iterator_0 = aHashMap1.values().iterator();

		WorldMapData worldmapdata_0;
		do {
			if (!iterator_0.hasNext()) {
				return null;
			}

			worldmapdata_0 = (WorldMapData) iterator_0.next();
		} while (!worldmapdata_0.method288(int_0, int_1, int_2));

		return worldmapdata_0;
	}

	float method17(final int int_0) {
		return int_0 == 25 ? 1.0F
				: (int_0 == 37 ? 1.5F : (int_0 == 50 ? 2.0F : (int_0 == 75 ? 3.0F : (int_0 == 100 ? 4.0F : 8.0F))));
	}

	public WorldMapData method18(final int int_0) {
		final Iterator iterator_0 = aHashMap1.values().iterator();

		WorldMapData worldmapdata_0;
		do {
			if (!iterator_0.hasNext()) {
				return null;
			}

			worldmapdata_0 = (WorldMapData) iterator_0.next();
		} while (worldmapdata_0.method284() != int_0);

		return worldmapdata_0;
	}

	void method19(final WorldMapData worldmapdata_0) {
		aWorldMapData1 = worldmapdata_0;
		aClass13_1 = new Class13(aModIconArray1, aHashMap2);
		aClass109_1.method512(aWorldMapData1.method282());
	}

	public int method20() {
		return aWorldMapData1 == null ? -1 : anInt9 + (aWorldMapData1.method286() * 64);
	}

	void method21(final WorldMapData worldmapdata_0) {
		if ((aWorldMapData1 == null) || (worldmapdata_0 != aWorldMapData1)) {
			method19(worldmapdata_0);
			method24(-1, -1, -1);
		}
	}

	void method22() {
		if (aFloat2 < aFloat1) {
			aFloat2 = Math.min(aFloat1, (aFloat2 / 30.0F) + aFloat2);
		}

		if (aFloat2 > aFloat1) {
			aFloat2 = Math.max(aFloat1, aFloat2 - (aFloat2 / 30.0F));
		}

	}

	void method23() {
		aHashSet3.clear();
		aHashSet3.addAll(aHashSet2);
		aHashSet3.addAll(aHashSet5);
	}

	void method24(final int int_0, final int int_1, final int int_2) {
		if (aWorldMapData1 != null) {
			int[] ints_0 = aWorldMapData1.method285(int_0, int_1, int_2);
			if (ints_0 == null) {
				ints_0 = aWorldMapData1.method285(aWorldMapData1.method290(), aWorldMapData1.method291(),
						aWorldMapData1.method292());
			}

			anInt9 = ints_0[0] - (aWorldMapData1.method286() * 64);
			anInt10 = ints_0[1] - (aWorldMapData1.method287() * 64);
			anInt6 = -1;
			anInt8 = -1;
			aFloat2 = method17(aWorldMapData1.method293());
			aFloat1 = aFloat2;
			aList1 = null;
			anIterator1 = null;
			aClass13_1.method179();
		}
	}

	public int method25() {
		return aWorldMapData1 == null ? -1 : anInt10 + (aWorldMapData1.method287() * 64);
	}

	void method26() {
		if (method15()) {
			int int_0 = anInt6 - anInt9;
			int int_1 = anInt8 - anInt10;
			if (int_0 != 0) {
				int_0 /= Math.min(8, Math.abs(int_0));
			}

			if (int_1 != 0) {
				int_1 /= Math.min(8, Math.abs(int_1));
			}

			anInt9 += int_0;
			anInt10 += int_1;
			if ((anInt9 == anInt6) && (anInt8 == anInt10)) {
				anInt6 = -1;
				anInt8 = -1;
			}

		}
	}

	public void method27(final int int_0, final int int_1) {
		if (aWorldMapData1 != null) {
			if (aWorldMapData1.method283(int_0, int_1)) {
				anInt6 = int_0 - (aWorldMapData1.method286() * 64);
				anInt8 = int_1 - (aWorldMapData1.method287() * 64);
			}
		}
	}

	public void method28(final int int_0, final int int_1) {
		if (aWorldMapData1 != null) {
			anInt9 = int_0 - (aWorldMapData1.method286() * 64);
			anInt10 = int_1 - (aWorldMapData1.method287() * 64);
			anInt6 = -1;
			anInt8 = -1;
		}
	}

	public Class3 method29() {
		return anIterator1 == null ? null : (!anIterator1.hasNext() ? null : (Class3) anIterator1.next());
	}

	void method30(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4) {
		final byte byte_0 = 20;
		final int int_5 = int_0 + (int_2 / 2);
		final int int_6 = (int_1 + (int_3 / 2)) - 18 - byte_0;
		Rasterizer2D.method853(int_0, int_1, int_2, int_3, -16777216);
		Rasterizer2D.drawRectangle(int_5 - 152, int_6, 304, 34, -65536);
		Rasterizer2D.method853(int_5 - 150, int_6 + 2, int_4 * 3, 30, -65536);
		aFont1.method974("Loading...", int_5, int_6 + byte_0, -1, -1);
	}

	public int method31() {
		return anIndexDataBase1.method432(aWorldMapData2.method282(), Class16.aClass16_3.aString2) ? 100
				: anIndexDataBase1.method437(aWorldMapData2.method282());
	}

	public void method32(final IndexDataBase indexdatabase_0, final Font font_0, final HashMap hashmap_0,
			final ModIcon[] modicons_0) {
		aModIconArray1 = modicons_0;
		anIndexDataBase1 = indexdatabase_0;
		aFont1 = font_0;
		aHashMap2 = new HashMap();
		aHashMap2.put(Class43.aClass43_2, hashmap_0.get(aClass101_1));
		aHashMap2.put(Class43.aClass43_3, hashmap_0.get(aClass101_2));
		aHashMap2.put(Class43.aClass43_4, hashmap_0.get(aClass101_3));
		aClass109_1 = new Class109(indexdatabase_0);
		final int int_0 = anIndexDataBase1.getFile(Class16.aClass16_1.aString2);
		final int[] ints_0 = anIndexDataBase1.getChilds(int_0);
		aHashMap1 = new HashMap(ints_0.length);

		for (int int_1 = 0; int_1 < ints_0.length; int_1++) {
			final Buffer buffer_0 = new Buffer(anIndexDataBase1.getConfigData(int_0, ints_0[int_1]));
			final WorldMapData worldmapdata_0 = new WorldMapData();
			worldmapdata_0.loadMapData(buffer_0, ints_0[int_1]);
			aHashMap1.put(worldmapdata_0.method282(), worldmapdata_0);
			if (worldmapdata_0.method296()) {
				aWorldMapData2 = worldmapdata_0;
			}
		}

		method21(aWorldMapData2);
		aWorldMapData3 = null;
	}

	public void extractWorldmap(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4) {
		final int[] ints_0 = new int[4];
		Rasterizer2D.copyDrawRegion(ints_0);
		Rasterizer2D.setDrawRegion(int_0, int_1, int_2 + int_0, int_1 + int_3);
		Rasterizer2D.method853(int_0, int_1, int_2, int_3, -16777216);
		final int int_5 = aClass109_1.method513();
		if (int_5 < 100) {
			method30(int_0, int_1, int_2, int_3, int_5);
		} else {
			if (!aClass13_1.method174()) {
				aClass13_1.method177(anIndexDataBase1, aWorldMapData1.method282(), Client.isMembers);
				if (!aClass13_1.method174()) {
					return;
				}
			}

			if (aHashSet4 != null) {
				++anInt12;
				if ((anInt12 % anInt4) == 0) {
					anInt12 = 0;
					++anInt11;
				}

				if ((anInt11 >= anInt3) && !aBool1) {
					aHashSet4 = null;
				}
			}

			final int int_6 = (int) Math.ceil(int_2 / aFloat2);
			final int int_7 = (int) Math.ceil(int_3 / aFloat2);
			aClass13_1.method181(anInt9 - (int_6 / 2), anInt10 - (int_7 / 2), anInt9 + (int_6 / 2),
					anInt10 + (int_7 / 2), int_0, int_1, int_2 + int_0, int_1 + int_3);
			if (!aBool2) {
				boolean bool_0 = false;
				if ((int_4 - anInt13) > 100) {
					anInt13 = int_4;
					bool_0 = true;
				}

				aClass13_1.method182(anInt9 - (int_6 / 2), anInt10 - (int_7 / 2), anInt9 + (int_6 / 2),
						anInt10 + (int_7 / 2), int_0, int_1, int_2 + int_0, int_1 + int_3, aHashSet3, aHashSet4,
						anInt12, anInt4, bool_0);
			}

			anInt2 = int_6;
			anInt1 = int_7;
			Rasterizer2D.setDrawRegion(ints_0);
		}
	}

	public void extractData(final int int_0, final int int_1, final int int_2, final int int_3) {
		if (aClass109_1.method511()) {
			if (!aClass13_1.method174()) {
				aClass13_1.method177(anIndexDataBase1, aWorldMapData1.method282(), Client.isMembers);
				if (!aClass13_1.method174()) {
					return;
				}
			}

			aClass13_1.method176(int_0, int_1, int_2, int_3, aHashSet4, anInt12, anInt4);
		}
	}

	public void method33(final int int_0, final int int_1, final Coordinates coordinates_0,
			final Coordinates coordinates_1) {
		final ScriptEvent scriptevent_0 = new ScriptEvent();
		final Class9 class9_0 = new Class9(int_1, coordinates_0, coordinates_1);
		scriptevent_0.method682(new Object[] { class9_0 });
		switch (int_0) {
		case 1008:
			scriptevent_0.method683(Class91.aClass91_1);
			break;
		case 1009:
			scriptevent_0.method683(Class91.aClass91_3);
			break;
		case 1010:
			scriptevent_0.method683(Class91.aClass91_4);
			break;
		case 1011:
			scriptevent_0.method683(Class91.aClass91_5);
			break;
		case 1012:
			scriptevent_0.method683(Class91.aClass91_6);
		}

		Class30.method229(scriptevent_0);
	}

	public void method34(final int int_0, final int int_1, final int int_2, final boolean bool_0) {
		WorldMapData worldmapdata_0 = method16(int_0, int_1, int_2);
		if (worldmapdata_0 == null) {
			if (!bool_0) {
				return;
			}

			worldmapdata_0 = aWorldMapData2;
		}

		boolean bool_1 = false;
		if ((worldmapdata_0 != aWorldMapData3) || bool_0) {
			aWorldMapData3 = worldmapdata_0;
			method21(worldmapdata_0);
			bool_1 = true;
		}

		if (bool_1 || bool_0) {
			method24(int_0, int_1, int_2);
		}

	}

	public void method35() {
		aClass109_1.method510();
	}

	public void method36(final int int_0, final int int_1, final boolean bool_0, final int int_2, final int int_3,
			final int int_4, final int int_5) {
		if (aClass109_1.method511()) {
			method22();
			method26();
			if (bool_0) {
				final int int_6 = (int) Math.ceil(int_4 / aFloat2);
				final int int_7 = (int) Math.ceil(int_5 / aFloat2);
				final List list_0 = aClass13_1.method178(anInt9 - (int_6 / 2) - 1, anInt10 - (int_7 / 2) - 1,
						anInt9 + (int_6 / 2) + 1, anInt10 + (int_7 / 2) + 1, int_2, int_3, int_4, int_5, int_0, int_1);
				final HashSet hashset_0 = new HashSet();

				Iterator iterator_0;
				Class3 class3_0;
				ScriptEvent scriptevent_0;
				Class9 class9_0;
				for (iterator_0 = list_0.iterator(); iterator_0.hasNext(); Class30.method229(scriptevent_0)) {
					class3_0 = (Class3) iterator_0.next();
					hashset_0.add(class3_0);
					scriptevent_0 = new ScriptEvent();
					class9_0 = new Class9(class3_0.anInt19, class3_0.aCoordinates1, class3_0.aCoordinates2);
					scriptevent_0.method682(new Object[] { class9_0, Integer.valueOf(int_0), Integer.valueOf(int_1) });
					if (aHashSet6.contains(class3_0)) {
						scriptevent_0.method683(Class91.aClass91_9);
					} else {
						scriptevent_0.method683(Class91.aClass91_7);
					}
				}

				iterator_0 = aHashSet6.iterator();

				while (iterator_0.hasNext()) {
					class3_0 = (Class3) iterator_0.next();
					if (!hashset_0.contains(class3_0)) {
						scriptevent_0 = new ScriptEvent();
						class9_0 = new Class9(class3_0.anInt19, class3_0.aCoordinates1, class3_0.aCoordinates2);
						scriptevent_0
								.method682(new Object[] { class9_0, Integer.valueOf(int_0), Integer.valueOf(int_1) });
						scriptevent_0.method683(Class91.aClass91_8);
						Class30.method229(scriptevent_0);
					}
				}

				aHashSet6 = hashset_0;
			}
		}
	}

	public void method37(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5) {
		if (aClass109_1.method511()) {
			final int int_6 = (int) Math.ceil(int_2 / aFloat2);
			final int int_7 = (int) Math.ceil(int_3 / aFloat2);
			final List list_0 = aClass13_1.method178(anInt9 - (int_6 / 2) - 1, anInt10 - (int_7 / 2) - 1,
					anInt9 + (int_6 / 2) + 1, anInt10 + (int_7 / 2) + 1, int_0, int_1, int_2, int_3, int_4, int_5);
			if (!list_0.isEmpty()) {
				final Iterator iterator_0 = list_0.iterator();

				boolean bool_0;
				do {
					if (!iterator_0.hasNext()) {
						return;
					}

					final Class3 class3_0 = (Class3) iterator_0.next();
					final Area area_0 = Class17.anAreaArray1[class3_0.anInt19];
					bool_0 = false;

					for (int int_8 = anIntArray1.length - 1; int_8 >= 0; --int_8) {
						if (area_0.aStringArray4[int_8] != null) {
							Class7.addMenuEntry(area_0.aStringArray4[int_8], area_0.aString28, anIntArray1[int_8],
									class3_0.anInt19, class3_0.aCoordinates1.method489(),
									class3_0.aCoordinates2.method489());
							bool_0 = true;
						}
					}
				} while (!bool_0);

			}
		}
	}

	public void method38(final int int_0) {
		final WorldMapData worldmapdata_0 = method18(int_0);
		if (worldmapdata_0 != null) {
			method21(worldmapdata_0);
		}

	}

	public void method39(final int int_0) {
		aFloat1 = method17(int_0);
	}

	public int method40() {
		return aFloat1 == 1.0D ? 25
				: (aFloat1 == 1.5D ? 37
						: (aFloat1 == 2.0D ? 50 : (aFloat1 == 3.0D ? 75 : (aFloat1 == 4.0D ? 100 : 200))));
	}

	public boolean method41() {
		return aClass109_1.method511();
	}

	public Coordinates method42() {
		return aWorldMapData1 == null ? null : aWorldMapData1.method289(method20(), method25());
	}

	public void method43(final int int_0, final int int_1, final int int_2) {
		if (aWorldMapData1 != null) {
			final int[] ints_0 = aWorldMapData1.method285(int_0, int_1, int_2);
			if (ints_0 != null) {
				method27(ints_0[0], ints_0[1]);
			}

		}
	}

	public void method44(final int int_0, final int int_1, final boolean bool_0) {
		if (anInt5 == -1) {
			anInt5 = int_0;
		}

		if (anInt7 == -1) {
			anInt7 = int_1;
		}

		final int int_2 = int_0 - anInt5;
		final int int_3 = int_1 - anInt7;
		anInt5 = int_0;
		anInt7 = int_1;
		if (bool_0 && !method15()) {
			anInt9 -= (int) (int_2 / aFloat1);
			anInt10 += (int) (int_3 / aFloat1);
		}

	}

	public void method45(final int int_0, final int int_1, final int int_2) {
		if (aWorldMapData1 != null) {
			final int[] ints_0 = aWorldMapData1.method285(int_0, int_1, int_2);
			if (ints_0 != null) {
				method28(ints_0[0], ints_0[1]);
			}

		}
	}

	public int method46() {
		return aWorldMapData1 == null ? -1 : aWorldMapData1.method284();
	}

	public WorldMapData method47() {
		return aWorldMapData1;
	}

	public void method48() {
		anInt3 = 3;
	}

	public void method49() {
		anInt4 = 50;
	}

	public int method50() {
		return anInt2;
	}

	public void method51(final int int_0) {
		if (int_0 >= 1) {
			anInt3 = int_0;
		}

	}

	public void method52(final int int_0) {
		if (int_0 >= 1) {
			anInt4 = int_0;
		}

	}

	public void method53() {
		aHashSet4 = null;
	}

	public void method54(final int int_0) {
		aHashSet4 = new HashSet();
		aHashSet4.add(Integer.valueOf(int_0));
		anInt11 = 0;
		anInt12 = 0;
	}

	public void method55(final boolean bool_0) {
		aBool1 = bool_0;
	}

	public void method56(final int int_0) {
		aHashSet4 = new HashSet();
		anInt11 = 0;
		anInt12 = 0;

		for (int int_1 = 0; int_1 < Class17.anAreaArray1.length; int_1++) {
			if ((Class17.anAreaArray1[int_1] != null) && (Class17.anAreaArray1[int_1].anInt474 == int_0)) {
				aHashSet4.add(Integer.valueOf(Class17.anAreaArray1[int_1].anInt468));
			}
		}

	}

	public void method57(final boolean bool_0) {
		aBool2 = !bool_0;
	}

	public int method58() {
		return anInt1;
	}

	public Class3 method59() {
		if (!aClass109_1.method511()) {
			return null;
		} else if (!aClass13_1.method174()) {
			return null;
		} else {
			final HashMap hashmap_0 = aClass13_1.method175();
			aList1 = new LinkedList();
			final Iterator iterator_0 = hashmap_0.values().iterator();

			while (iterator_0.hasNext()) {
				final List list_0 = (List) iterator_0.next();
				aList1.addAll(list_0);
			}

			anIterator1 = aList1.iterator();
			return method29();
		}
	}

	public boolean method60() {
		return !aBool2;
	}

	public void method61(final int int_0, final boolean bool_0) {
		if (!bool_0) {
			aHashSet2.add(Integer.valueOf(int_0));
		} else {
			aHashSet2.remove(Integer.valueOf(int_0));
		}

		method23();
	}

	public void method62(final int int_0, final boolean bool_0) {
		if (!bool_0) {
			aHashSet1.add(Integer.valueOf(int_0));
		} else {
			aHashSet1.remove(Integer.valueOf(int_0));
		}

		for (int int_1 = 0; int_1 < Class17.anAreaArray1.length; int_1++) {
			if ((Class17.anAreaArray1[int_1] != null) && (Class17.anAreaArray1[int_1].anInt474 == int_0)) {
				final int int_2 = Class17.anAreaArray1[int_1].anInt468;
				if (!bool_0) {
					aHashSet5.add(Integer.valueOf(int_2));
				} else {
					aHashSet5.remove(Integer.valueOf(int_2));
				}
			}
		}

		method23();
	}

	public boolean method63(final int int_0) {
		return !aHashSet2.contains(Integer.valueOf(int_0));
	}

	public boolean method64(final int int_0) {
		return !aHashSet1.contains(Integer.valueOf(int_0));
	}

	public Coordinates method65(final int int_0, final Coordinates coordinates_0) {
		if (!aClass109_1.method511()) {
			return null;
		} else if (!aClass13_1.method174()) {
			return null;
		} else if (!aWorldMapData1.method283(coordinates_0.worldX, coordinates_0.worldY)) {
			return null;
		} else {
			final HashMap hashmap_0 = aClass13_1.method175();
			final List list_0 = (List) hashmap_0.get(Integer.valueOf(int_0));
			if ((list_0 != null) && !list_0.isEmpty()) {
				Class3 class3_0 = null;
				int int_1 = -1;
				final Iterator iterator_0 = list_0.iterator();

				while (true) {
					Class3 class3_1;
					int int_4;
					do {
						if (!iterator_0.hasNext()) {
							return class3_0.aCoordinates2;
						}

						class3_1 = (Class3) iterator_0.next();
						final int int_2 = class3_1.aCoordinates2.worldX - coordinates_0.worldX;
						final int int_3 = class3_1.aCoordinates2.worldY - coordinates_0.worldY;
						int_4 = (int_2 * int_2) + (int_3 * int_3);
						if (int_4 == 0) {
							return class3_1.aCoordinates2;
						}
					} while ((int_4 >= int_1) && (class3_0 != null));

					class3_0 = class3_1;
					int_1 = int_4;
				}
			} else {
				return null;
			}
		}
	}

	public void method66(final WorldMapData worldmapdata_0, final Coordinates coordinates_0,
			final Coordinates coordinates_1, final boolean bool_0) {
		if (worldmapdata_0 != null) {
			if ((aWorldMapData1 == null) || (worldmapdata_0 != aWorldMapData1)) {
				method19(worldmapdata_0);
			}

			if (!bool_0 && aWorldMapData1.method288(coordinates_0.plane, coordinates_0.worldX, coordinates_0.worldY)) {
				method24(coordinates_0.plane, coordinates_0.worldX, coordinates_0.worldY);
			} else {
				method24(coordinates_1.plane, coordinates_1.worldX, coordinates_1.worldY);
			}
		}
	}

}
