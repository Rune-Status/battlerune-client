import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Class13 {

	static int cameraX;
	static int anInt43;
	boolean aBool3;
	SpritePixels aSpritePixels2;
	boolean aBool4;
	HashMap aHashMap5;
	Class11[][] aClass11ArrayArray1;
	int anInt44;
	int anInt45;
	HashMap aHashMap6;
	ModIcon[] aModIconArray2;
	final HashMap aHashMap7;
	WorldMapData_Sub1 aWorldMapData_Sub1_1;
	int anInt46;
	int anInt47;

	public Class13(final ModIcon[] modicons_0, final HashMap hashmap_0) {
		aBool4 = false;
		aBool3 = false;
		aHashMap6 = new HashMap();
		aModIconArray2 = modicons_0;
		aHashMap7 = hashmap_0;
	}

	void method171() {
		if (aHashMap5 == null) {
			aHashMap5 = new HashMap();
		}

		aHashMap5.clear();

		for (int int_0 = 0; int_0 < aClass11ArrayArray1.length; int_0++) {
			for (int int_1 = 0; int_1 < aClass11ArrayArray1[int_0].length; int_1++) {
				final List list_0 = aClass11ArrayArray1[int_0][int_1].method152();
				final Iterator iterator_0 = list_0.iterator();

				while (iterator_0.hasNext()) {
					final Class3 class3_0 = (Class3) iterator_0.next();
					if (!aHashMap5.containsKey(Integer.valueOf(class3_0.anInt19))) {
						final LinkedList linkedlist_0 = new LinkedList();
						linkedlist_0.add(class3_0);
						aHashMap5.put(Integer.valueOf(class3_0.anInt19), linkedlist_0);
					} else {
						final List list_1 = (List) aHashMap5.get(Integer.valueOf(class3_0.anInt19));
						list_1.add(class3_0);
					}
				}
			}
		}

	}

	Class8 method172(final int int_0, final int int_1, final int int_2, final int int_3) {
		final Class8 class8_0 = new Class8(this);
		final int int_4 = anInt44 + int_0;
		final int int_5 = int_1 + anInt45;
		final int int_6 = int_2 + anInt44;
		final int int_7 = int_3 + anInt45;
		final int int_8 = int_4 / 64;
		final int int_9 = int_5 / 64;
		final int int_10 = int_6 / 64;
		final int int_11 = int_7 / 64;
		class8_0.anInt29 = (int_10 - int_8) + 1;
		class8_0.anInt31 = (int_11 - int_9) + 1;
		class8_0.anInt28 = int_8 - aWorldMapData_Sub1_1.method286();
		class8_0.anInt30 = int_9 - aWorldMapData_Sub1_1.method287();
		if (class8_0.anInt28 < 0) {
			class8_0.anInt29 += class8_0.anInt28;
			class8_0.anInt28 = 0;
		}

		if (class8_0.anInt28 > (aClass11ArrayArray1.length - class8_0.anInt29)) {
			class8_0.anInt29 = aClass11ArrayArray1.length - class8_0.anInt28;
		}

		if (class8_0.anInt30 < 0) {
			class8_0.anInt31 += class8_0.anInt30;
			class8_0.anInt30 = 0;
		}

		if (class8_0.anInt30 > (aClass11ArrayArray1[0].length - class8_0.anInt31)) {
			class8_0.anInt31 = aClass11ArrayArray1[0].length - class8_0.anInt30;
		}

		class8_0.anInt29 = Math.min(class8_0.anInt29, aClass11ArrayArray1.length);
		class8_0.anInt31 = Math.min(class8_0.anInt31, aClass11ArrayArray1[0].length);
		return class8_0;
	}

	float method173(final int int_0, final int int_1) {
		final float float_0 = (float) int_0 / (float) int_1;
		if (float_0 > 8.0F) {
			return 8.0F;
		} else if (float_0 < 1.0F) {
			return 1.0F;
		} else {
			final int int_2 = Math.round(float_0);
			return Math.abs(int_2 - float_0) < 0.05F ? (float) int_2 : float_0;
		}
	}

	public boolean method174() {
		return aBool4;
	}

	public HashMap method175() {
		method171();
		return aHashMap5;
	}

	public void method176(final int int_0, final int int_1, final int int_2, final int int_3, final HashSet hashset_0,
			final int int_4, final int int_5) {
		if (aSpritePixels2 != null) {
			aSpritePixels2.method912(int_0, int_1, int_2, int_3);
			if (int_4 > 0) {
				if ((int_4 % int_5) < (int_5 / 2)) {
					if (aHashMap5 == null) {
						method171();
					}

					final Iterator iterator_0 = hashset_0.iterator();

					while (true) {
						List list_0;
						do {
							if (!iterator_0.hasNext()) {
								return;
							}

							final int int_6 = ((Integer) iterator_0.next()).intValue();
							list_0 = (List) aHashMap5.get(Integer.valueOf(int_6));
						} while (list_0 == null);

						final Iterator iterator_1 = list_0.iterator();

						while (iterator_1.hasNext()) {
							final Class3 class3_0 = (Class3) iterator_1.next();
							final int int_7 = (int_2 * (class3_0.aCoordinates2.worldX - anInt44)) / anInt46;
							final int int_8 = int_3 - (((class3_0.aCoordinates2.worldY - anInt45) * int_3) / anInt47);
							Rasterizer2D.method856(int_7 + int_0, int_8 + int_1, 2, 16776960, 256);
						}
					}
				}
			}
		}
	}

	public void method177(final IndexDataBase indexdatabase_0, final String string_0, final boolean bool_0) {
		if (!aBool3) {
			aBool4 = false;
			aBool3 = true;
			System.nanoTime();
			final int int_0 = indexdatabase_0.getFile(Class16.aClass16_1.aString2);
			final int int_1 = indexdatabase_0.getChild(int_0, string_0);
			final Buffer buffer_0 = new Buffer(indexdatabase_0.method438(Class16.aClass16_1.aString2, string_0));
			final Buffer buffer_1 = new Buffer(indexdatabase_0.method438(Class16.aClass16_2.aString2, string_0));
			final Buffer buffer_2 = new Buffer(indexdatabase_0.method438(string_0, Class16.aClass16_3.aString2));
			System.nanoTime();
			System.nanoTime();
			aWorldMapData_Sub1_1 = new WorldMapData_Sub1();

			try {
				aWorldMapData_Sub1_1.method590(buffer_0, buffer_2, buffer_1, int_1, bool_0);
			} catch (final IllegalStateException illegalstateexception_0) {
				return;
			}

			aWorldMapData_Sub1_1.method291();
			aWorldMapData_Sub1_1.method290();
			aWorldMapData_Sub1_1.method292();
			anInt44 = aWorldMapData_Sub1_1.method286() * 64;
			anInt45 = aWorldMapData_Sub1_1.method287() * 64;
			anInt46 = ((aWorldMapData_Sub1_1.method297() - aWorldMapData_Sub1_1.method286()) + 1) * 64;
			anInt47 = ((aWorldMapData_Sub1_1.method298() - aWorldMapData_Sub1_1.method287()) + 1) * 64;
			final int int_2 = (aWorldMapData_Sub1_1.method297() - aWorldMapData_Sub1_1.method286()) + 1;
			final int int_3 = (aWorldMapData_Sub1_1.method298() - aWorldMapData_Sub1_1.method287()) + 1;
			System.nanoTime();
			System.nanoTime();
			aClass11ArrayArray1 = new Class11[int_2][int_3];
			final Iterator iterator_0 = aWorldMapData_Sub1_1.aHashSet7.iterator();

			while (iterator_0.hasNext()) {
				final AClass1_Sub2 aclass1_sub2_0 = (AClass1_Sub2) iterator_0.next();
				final int int_4 = aclass1_sub2_0.anInt52;
				final int int_5 = aclass1_sub2_0.anInt53;
				final int int_6 = int_4 - aWorldMapData_Sub1_1.method286();
				final int int_7 = int_5 - aWorldMapData_Sub1_1.method287();
				aClass11ArrayArray1[int_6][int_7] = new Class11(int_4, int_5, aWorldMapData_Sub1_1.method299(),
						aHashMap7);
				aClass11ArrayArray1[int_6][int_7].method164(aclass1_sub2_0, aWorldMapData_Sub1_1.aList4);
			}

			for (int int_8 = 0; int_8 < int_2; int_8++) {
				for (int int_9 = 0; int_9 < int_3; int_9++) {
					if (aClass11ArrayArray1[int_8][int_9] == null) {
						aClass11ArrayArray1[int_8][int_9] = new Class11(aWorldMapData_Sub1_1.method286() + int_8,
								aWorldMapData_Sub1_1.method287() + int_9, aWorldMapData_Sub1_1.method299(), aHashMap7);
						aClass11ArrayArray1[int_8][int_9].method165(aWorldMapData_Sub1_1.aHashSet8,
								aWorldMapData_Sub1_1.aList4);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (indexdatabase_0.method435(Class16.aClass16_4.aString2, string_0)) {
				final byte[] bytes_0 = indexdatabase_0.method438(Class16.aClass16_4.aString2, string_0);
				aSpritePixels2 = Class2.method80(bytes_0);
			}

			System.nanoTime();
			aBool4 = true;
		}
	}

	public List method178(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6, final int int_7, final int int_8, final int int_9) {
		final LinkedList linkedlist_0 = new LinkedList();
		if (!aBool4) {
			return linkedlist_0;
		} else {
			final Class8 class8_0 = method172(int_0, int_1, int_2, int_3);
			final float float_0 = method173(int_6, int_2 - int_0);
			final int int_10 = (int) (float_0 * 64.0F);
			final int int_11 = anInt44 + int_0;
			final int int_12 = int_1 + anInt45;

			for (int int_13 = class8_0.anInt28; int_13 < (class8_0.anInt29 + class8_0.anInt28); int_13++) {
				for (int int_14 = class8_0.anInt30; int_14 < (class8_0.anInt31 + class8_0.anInt30); int_14++) {
					final List list_0 = aClass11ArrayArray1[int_13][int_14].method160(
							int_4 + ((((aClass11ArrayArray1[int_13][int_14].anInt34 * 64) - int_11) * int_10) / 64),
							(int_7 + int_5)
									- ((int_10 * (64 + ((aClass11ArrayArray1[int_13][int_14].anInt37 * 64) - int_12)))
											/ 64),
							int_10, int_8, int_9);
					if (!list_0.isEmpty()) {
						linkedlist_0.addAll(list_0);
					}
				}
			}

			return linkedlist_0;
		}
	}

	public final void method179() {
		aHashMap5 = null;
	}

	void method180(final int int_0, final int int_1, final Class11[] class11s_0) {
		final boolean bool_0 = int_0 <= 0;
		final boolean bool_1 = int_0 >= (aClass11ArrayArray1.length - 1);
		final boolean bool_2 = int_1 <= 0;
		final boolean bool_3 = int_1 >= (aClass11ArrayArray1[0].length - 1);
		if (bool_3) {
			class11s_0[Enum5.anEnum5_1.rsOrdinal()] = null;
		} else {
			class11s_0[Enum5.anEnum5_1.rsOrdinal()] = aClass11ArrayArray1[int_0][int_1 + 1];
		}

		class11s_0[Enum5.anEnum5_2.rsOrdinal()] = !bool_3 && !bool_1 ? aClass11ArrayArray1[int_0 + 1][int_1 + 1] : null;
		class11s_0[Enum5.anEnum5_8.rsOrdinal()] = !bool_3 && !bool_0 ? aClass11ArrayArray1[int_0 - 1][int_1 + 1] : null;
		class11s_0[Enum5.anEnum5_3.rsOrdinal()] = bool_1 ? null : aClass11ArrayArray1[int_0 + 1][int_1];
		class11s_0[Enum5.anEnum5_7.rsOrdinal()] = bool_0 ? null : aClass11ArrayArray1[int_0 - 1][int_1];
		class11s_0[Enum5.anEnum5_5.rsOrdinal()] = bool_2 ? null : aClass11ArrayArray1[int_0][int_1 - 1];
		class11s_0[Enum5.anEnum5_4.rsOrdinal()] = !bool_2 && !bool_1 ? aClass11ArrayArray1[int_0 + 1][int_1 - 1] : null;
		class11s_0[Enum5.anEnum5_6.rsOrdinal()] = !bool_2 && !bool_0 ? aClass11ArrayArray1[int_0 - 1][int_1 - 1] : null;
	}

	public final void method181(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6, final int int_7) {
		final int[] ints_0 = Rasterizer2D.graphicsPixels;
		final int int_8 = Rasterizer2D.graphicsPixelsWidth;
		final int int_9 = Rasterizer2D.graphicsPixelsHeight;
		final int[] ints_1 = new int[4];
		Rasterizer2D.copyDrawRegion(ints_1);
		final Class8 class8_0 = method172(int_0, int_1, int_2, int_3);
		final float float_0 = method173(int_6 - int_4, int_2 - int_0);
		final int int_10 = (int) Math.ceil(float_0);
		if (!aHashMap6.containsKey(Integer.valueOf(int_10))) {
			final Class6 class6_0 = new Class6(int_10);
			class6_0.method104();
			aHashMap6.put(Integer.valueOf(int_10), class6_0);
		}

		final Class11[] class11s_0 = new Class11[8];

		int int_11;
		int int_12;
		for (int_11 = class8_0.anInt28; int_11 < (class8_0.anInt28 + class8_0.anInt29); int_11++) {
			for (int_12 = class8_0.anInt30; int_12 < (class8_0.anInt30 + class8_0.anInt31); int_12++) {
				method180(int_11, int_12, class11s_0);
				aClass11ArrayArray1[int_11][int_12].method161(int_10, (Class6) aHashMap6.get(Integer.valueOf(int_10)),
						class11s_0, aModIconArray2);
			}
		}

		Rasterizer2D.setRasterBuffer(ints_0, int_8, int_9);
		Rasterizer2D.setDrawRegion(ints_1);
		int_11 = (int) (float_0 * 64.0F);
		int_12 = anInt44 + int_0;
		final int int_13 = int_1 + anInt45;

		for (int int_14 = class8_0.anInt28; int_14 < (class8_0.anInt29 + class8_0.anInt28); int_14++) {
			for (int int_15 = class8_0.anInt30; int_15 < (class8_0.anInt31 + class8_0.anInt30); int_15++) {
				aClass11ArrayArray1[int_14][int_15].method163(
						int_4 + ((((aClass11ArrayArray1[int_14][int_15].anInt34 * 64) - int_12) * int_11) / 64),
						int_7 - (((((aClass11ArrayArray1[int_14][int_15].anInt37 * 64) - int_13) + 64) * int_11) / 64),
						int_11);
			}
		}

	}

	public final void method182(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6, final int int_7, final HashSet hashset_0, final HashSet hashset_1,
			final int int_8, final int int_9, final boolean bool_0) {
		final Class8 class8_0 = method172(int_0, int_1, int_2, int_3);
		final float float_0 = method173(int_6 - int_4, int_2 - int_0);
		final int int_10 = (int) (float_0 * 64.0F);
		final int int_11 = anInt44 + int_0;
		final int int_12 = int_1 + anInt45;

		int int_13;
		int int_14;
		for (int_13 = class8_0.anInt28; int_13 < (class8_0.anInt29 + class8_0.anInt28); int_13++) {
			for (int_14 = class8_0.anInt30; int_14 < (class8_0.anInt30 + class8_0.anInt31); int_14++) {
				if (bool_0) {
					aClass11ArrayArray1[int_13][int_14].method155();
				}

				aClass11ArrayArray1[int_13][int_14].method159(
						int_4 + ((((aClass11ArrayArray1[int_13][int_14].anInt34 * 64) - int_11) * int_10) / 64),
						int_7 - ((int_10 * (((aClass11ArrayArray1[int_13][int_14].anInt37 * 64) - int_12) + 64)) / 64),
						int_10, hashset_0);
			}
		}

		if ((hashset_1 != null) && (int_8 > 0)) {
			for (int_13 = class8_0.anInt28; int_13 < (class8_0.anInt29 + class8_0.anInt28); int_13++) {
				for (int_14 = class8_0.anInt30; int_14 < (class8_0.anInt31 + class8_0.anInt30); int_14++) {
					aClass11ArrayArray1[int_13][int_14].method157(hashset_1, int_8, int_9);
				}
			}
		}

	}

}
