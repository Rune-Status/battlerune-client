import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Class11 {

	static final Coordinates aCoordinates5;
	int[][] anIntArrayArray5;
	SpritePixels aSpritePixels1;
	List aList2;
	LinkedList aLinkedList1;
	HashMap aHashMap3;
	AClass1_Sub2 anAClass1_Sub2_1;
	int anInt34;
	int anInt35;
	int anInt36;
	final HashMap aHashMap4;
	int anInt37;

	static {
		aCoordinates5 = new Coordinates();
	}

	Class11(final int int_0, final int int_1, final int int_2, final HashMap hashmap_0) {
		anInt34 = int_0;
		anInt37 = int_1;
		aLinkedList1 = new LinkedList();
		aList2 = new LinkedList();
		aHashMap3 = new HashMap();
		anInt36 = int_2 | 0xFF000000;
		aHashMap4 = hashmap_0;
	}

	boolean method126(final int int_0) {
		if ((aSpritePixels1 != null) && (anInt35 == int_0)) {
			return false;
		} else {
			anInt35 = int_0;
			aSpritePixels1 = new SpritePixels(anInt35 * 64, anInt35 * 64);
			return true;
		}
	}

	void method127(final int int_0, final int int_1, final AClass1 aclass1_0) {
		for (int int_2 = 0; int_2 < aclass1_0.anInt50; int_2++) {
			final Class12[] class12s_0 = aclass1_0.aClass12ArrayArrayArrayArray1[int_2][int_0][int_1];
			if ((class12s_0 != null) && (class12s_0.length != 0)) {
				final Class12[] class12s_1 = class12s_0;

				for (int int_3 = 0; int_3 < class12s_1.length; int_3++) {
					final Class12 class12_0 = class12s_1[int_3];
					if (XClanMember.method572(class12_0.anInt41)) {
						final ObjectComposition objectcomposition_0 = PlayerComposition
								.getObjectDefinition(class12_0.anInt40);
						final int int_4 = objectcomposition_0.anInt491 != 0 ? -3407872 : -3355444;
						if (class12_0.anInt41 == Enum4.anEnum4_1.anInt396) {
							method158(int_0, int_1, class12_0.anInt42, int_4);
						}

						if (class12_0.anInt41 == Enum4.anEnum4_3.anInt396) {
							method158(int_0, int_1, class12_0.anInt42, -3355444);
							method158(int_0, int_1, class12_0.anInt42 + 1, int_4);
						}

						if (class12_0.anInt41 == Enum4.anEnum4_4.anInt396) {
							if (class12_0.anInt42 == 0) {
								Rasterizer2D.method854(anInt35 * int_0, anInt35 * (63 - int_1), 1, int_4);
							}

							if (class12_0.anInt42 == 1) {
								Rasterizer2D.method854(((anInt35 * int_0) + anInt35) - 1, anInt35 * (63 - int_1), 1,
										int_4);
							}

							if (class12_0.anInt42 == 2) {
								Rasterizer2D.method854((anInt35 + (anInt35 * int_0)) - 1,
										((anInt35 * (63 - int_1)) + anInt35) - 1, 1, int_4);
							}

							if (class12_0.anInt42 == 3) {
								Rasterizer2D.method854(anInt35 * int_0, (((63 - int_1) * anInt35) + anInt35) - 1, 1,
										int_4);
							}
						}

						if (class12_0.anInt41 == Enum4.anEnum4_5.anInt396) {
							final int int_5 = class12_0.anInt42 % 2;
							int int_6;
							if (int_5 == 0) {
								for (int_6 = 0; int_6 < anInt35; int_6++) {
									Rasterizer2D.method854(int_6 + (anInt35 * int_0),
											((64 - int_1) * anInt35) - 1 - int_6, 1, int_4);
								}
							} else {
								for (int_6 = 0; int_6 < anInt35; int_6++) {
									Rasterizer2D.method854(int_6 + (anInt35 * int_0), int_6 + (anInt35 * (63 - int_1)),
											1, int_4);
								}
							}
						}
					}
				}
			}
		}

	}

	void method128(final int int_0, final int int_1, final HashSet hashset_0, final int int_2) {
		final float float_0 = int_2 / 64.0F;
		final float float_1 = float_0 / 2.0F;
		final Iterator iterator_0 = aHashMap3.entrySet().iterator();

		while (iterator_0.hasNext()) {
			final Entry map$entry_0 = (Entry) iterator_0.next();
			final Coordinates coordinates_0 = (Coordinates) map$entry_0.getKey();
			final int int_3 = (int) ((int_0 + (float_0 * coordinates_0.worldX)) - float_1);
			final int int_4 = (int) (int_1 + int_2 - (float_0 * coordinates_0.worldY) - float_1);
			final Class3 class3_0 = (Class3) map$entry_0.getValue();
			if (class3_0 != null) {
				class3_0.anInt20 = int_3;
				class3_0.anInt22 = int_4;
				final Area area_0 = Class17.anAreaArray1[class3_0.anInt19];
				if (!hashset_0.contains(Integer.valueOf(area_0.method758()))) {
					method156(class3_0, int_3, int_4, float_0);
				}
			}
		}

	}

	Class14 method129(final Area area_0) {
		if ((area_0.name != null) && (aHashMap4 != null) && (aHashMap4.get(Class43.aClass43_2) != null)) {
			final int int_0 = area_0.anInt472;
			final Class43[] class43s_0 = new Class43[] { Class43.aClass43_2, Class43.aClass43_3, Class43.aClass43_4 };
			final Class43[] class43s_1 = class43s_0;
			int int_1 = 0;

			Class43 class43_1;
			while (true) {
				if (int_1 >= class43s_1.length) {
					class43_1 = null;
					break;
				}

				final Class43 class43_0 = class43s_1[int_1];
				if (int_0 == class43_0.anInt100) {
					class43_1 = class43_0;
					break;
				}

				++int_1;
			}

			if (class43_1 == null) {
				return null;
			} else {
				final Font font_0 = (Font) aHashMap4.get(class43_1);
				if (font_0 == null) {
					return null;
				} else {
					int_1 = font_0.method970(area_0.name, 1000000);
					final String[] strings_1 = new String[int_1];
					font_0.method966(area_0.name, (int[]) null, strings_1);
					final int int_2 = (strings_1.length * font_0.verticalSpace) / 2;
					int int_3 = 0;
					final String[] strings_0 = strings_1;

					for (int int_4 = 0; int_4 < strings_0.length; int_4++) {
						final String string_0 = strings_0[int_4];
						final int int_5 = font_0.method965(string_0);
						if (int_5 > int_3) {
							int_3 = int_5;
						}
					}

					return new Class14(area_0.name, int_3, int_2, class43_1);
				}
			}
		} else {
			return null;
		}
	}

	void method130(final int int_0, final int int_1, final AClass1 aclass1_0, final ModIcon[] modicons_0) {
		for (int int_2 = 0; int_2 < aclass1_0.anInt50; int_2++) {
			final Class12[] class12s_0 = aclass1_0.aClass12ArrayArrayArrayArray1[int_2][int_0][int_1];
			if ((class12s_0 != null) && (class12s_0.length != 0)) {
				final Class12[] class12s_1 = class12s_0;

				for (int int_3 = 0; int_3 < class12s_1.length; int_3++) {
					final Class12 class12_0 = class12s_1[int_3];
					final int int_4 = class12_0.anInt41;
					final boolean bool_0 = (int_4 >= Enum4.anEnum4_21.anInt396) && (int_4 <= Enum4.anEnum4_22.anInt396);
					if (bool_0 || Tile.method641(class12_0.anInt41)) {
						final ObjectComposition objectcomposition_0 = PlayerComposition
								.getObjectDefinition(class12_0.anInt40);
						if (objectcomposition_0.mapSceneId != -1) {
							if ((objectcomposition_0.mapSceneId != 46) && (objectcomposition_0.mapSceneId != 52)) {
								modicons_0[objectcomposition_0.mapSceneId].method887(anInt35 * int_0,
										anInt35 * (63 - int_1), anInt35 * 2, anInt35 * 2);
							} else {
								modicons_0[objectcomposition_0.mapSceneId].method887(anInt35 * int_0,
										anInt35 * (63 - int_1), (anInt35 * 2) + 1, (anInt35 * 2) + 1);
							}
						}
					}
				}
			}
		}

	}

	void method131(final Area area_0, final int int_0, final int int_1) {
		final SpritePixels spritepixels_0 = area_0.method755(false);
		if (spritepixels_0 != null) {
			final int int_2 = method134(spritepixels_0, area_0.anEnum7_4);
			final int int_3 = method144(spritepixels_0, area_0.anEnum8_4);
			spritepixels_0.method916(int_2 + int_0, int_1 + int_3);
		}

	}

	void method132(final int int_0, final int int_1, final AClass1 aclass1_0, final Class6 class6_0) {
		final int int_2 = aclass1_0.aShortArrayArrayArray1[0][int_0][int_1] - 1;
		final int int_3 = aclass1_0.aShortArrayArrayArray2[0][int_0][int_1] - 1;
		if ((int_2 == -1) && (int_3 == -1)) {
			Rasterizer2D.method853(anInt35 * int_0, anInt35 * (63 - int_1), anInt35, anInt35, anInt36);
		}

		int int_4 = 16711935;
		if (int_3 != -1) {
			int_4 = WorldMapData.method302(int_3, anInt36);
		}

		if ((int_3 > -1) && (aclass1_0.aByteArrayArrayArray2[0][int_0][int_1] == 0)) {
			Rasterizer2D.method853(anInt35 * int_0, anInt35 * (63 - int_1), anInt35, anInt35, int_4);
		} else {
			final int int_5 = method146(int_0, int_1, aclass1_0);
			if (int_3 == -1) {
				Rasterizer2D.method853(anInt35 * int_0, anInt35 * (63 - int_1), anInt35, anInt35, int_5);
			} else {
				class6_0.method102(anInt35 * int_0, anInt35 * (63 - int_1), int_5, int_4, anInt35, anInt35,
						aclass1_0.aByteArrayArrayArray2[0][int_0][int_1],
						aclass1_0.aByteArrayArrayArray3[0][int_0][int_1]);
			}
		}
	}

	void method133(final int int_0, final int int_1, final HashSet hashset_0, final int int_2) {
		final float float_0 = int_2 / 64.0F;
		final Iterator iterator_0 = aList2.iterator();

		while (iterator_0.hasNext()) {
			final Class3 class3_0 = (Class3) iterator_0.next();
			final int int_3 = class3_0.aCoordinates2.worldX % 64;
			final int int_4 = class3_0.aCoordinates2.worldY % 64;
			class3_0.anInt20 = (int) ((int_3 * float_0) + int_0);
			class3_0.anInt22 = (int) (int_1 + ((63 - int_4) * float_0));
			if (!hashset_0.contains(Integer.valueOf(class3_0.anInt19))) {
				method156(class3_0, class3_0.anInt20, class3_0.anInt22, float_0);
			}
		}

	}

	int method134(final SpritePixels spritepixels_0, final Enum7 enum7_0) {
		switch (enum7_0.anInt410) {
		case 0:
			return 0;
		case 1:
			return -spritepixels_0.width / 2;
		default:
			return -spritepixels_0.width;
		}
	}

	int method135(final int int_0, final int int_1) {
		if (anAClass1_Sub2_1 != null) {
			return anAClass1_Sub2_1.method183(int_0, int_1);
		} else {
			if (!aLinkedList1.isEmpty()) {
				final Iterator iterator_0 = aLinkedList1.iterator();

				while (iterator_0.hasNext()) {
					final AClass1_Sub1 aclass1_sub1_0 = (AClass1_Sub1) iterator_0.next();
					if (aclass1_sub1_0.method580(int_0, int_1)) {
						return aclass1_sub1_0.method183(int_0, int_1);
					}
				}
			}

			return -1;
		}
	}

	void method136(final int int_0, final int int_1, final AClass1 aclass1_0, final Class6 class6_0,
			final ModIcon[] modicons_0) {
		method127(int_0, int_1, aclass1_0);
		method130(int_0, int_1, aclass1_0, modicons_0);
	}

	void method137(final Class3 class3_0, final Area area_0, final int int_0, final int int_1, final float float_0) {
		if (class3_0.aClass14_1 != null) {
			if (class3_0.aClass14_1.aClass43_1.method264(float_0)) {
				final Font font_0 = (Font) aHashMap4.get(class3_0.aClass14_1.aClass43_1);
				font_0.method971(class3_0.aClass14_1.aString1, int_0 - (class3_0.aClass14_1.anInt56 / 2), int_1,
						class3_0.aClass14_1.anInt56, class3_0.aClass14_1.anInt57, 0xFF000000 | area_0.anInt471, 0, 1, 0,
						font_0.verticalSpace / 2);
			}
		}
	}

	void method138(final HashSet hashset_0, final int int_0, final int int_1) {
		final Iterator iterator_0 = aList2.iterator();

		while (iterator_0.hasNext()) {
			final Class3 class3_0 = (Class3) iterator_0.next();
			final Area area_0 = Class17.anAreaArray1[class3_0.anInt19];
			if ((area_0 != null) && hashset_0.contains(Integer.valueOf(area_0.method758()))) {
				method153(area_0, class3_0.anInt20, class3_0.anInt22, int_0, int_1);
			}
		}

	}

	boolean method139(final Class11[] class11s_0) {
		if (anIntArrayArray5 != null) {
			return false;
		} else {
			final Class2 class2_0 = new Class2(64, 64);
			if (anAClass1_Sub2_1 != null) {
				method145(0, 0, 64, 64, anAClass1_Sub2_1, class2_0);
			} else {
				final Iterator iterator_0 = aLinkedList1.iterator();

				while (iterator_0.hasNext()) {
					final AClass1_Sub1 aclass1_sub1_0 = (AClass1_Sub1) iterator_0.next();
					method145(aclass1_sub1_0.method579() * 8, aclass1_sub1_0.method581() * 8, 8, 8, aclass1_sub1_0,
							class2_0);
				}
			}

			method147(class11s_0, class2_0);
			method149(class2_0);
			return true;
		}
	}

	void method140(final int int_0, final int int_1, final int int_2, final int int_3, final AClass1 aclass1_0) {
		for (int int_4 = int_0; int_4 < (int_2 + int_0); int_4++) {
			label50: for (int int_5 = int_1; int_5 < (int_1 + int_3); int_5++) {
				final Coordinates coordinates_0 = new Coordinates(0, int_4, int_5);

				for (int int_6 = 0; int_6 < aclass1_0.anInt50; int_6++) {
					final Class12[] class12s_0 = aclass1_0.aClass12ArrayArrayArrayArray1[int_6][int_4][int_5];
					if ((class12s_0 != null) && (class12s_0.length != 0)) {
						final Class12[] class12s_1 = class12s_0;

						for (int int_7 = 0; int_7 < class12s_1.length; int_7++) {
							final Class12 class12_0 = class12s_1[int_7];
							final Area area_0 = method148(class12_0.anInt40);
							if (area_0 != null) {
								final Coordinates coordinates_1 = new Coordinates(int_6, int_4 + (anInt34 * 64),
										int_5 + (anInt37 * 64));
								Coordinates coordinates_2 = null;
								if (anAClass1_Sub2_1 != null) {
									coordinates_2 = new Coordinates(anAClass1_Sub2_1.anInt51 + int_6,
											int_4 + (anAClass1_Sub2_1.anInt52 * 64),
											int_5 + (anAClass1_Sub2_1.anInt53 * 64));
								} else {
									final AClass1_Sub1 aclass1_sub1_0 = (AClass1_Sub1) aclass1_0;
									coordinates_2 = new Coordinates(int_6 + aclass1_sub1_0.anInt51,
											int_4 + (aclass1_sub1_0.anInt52 * 64) + (aclass1_sub1_0.method583() * 8),
											int_5 + (aclass1_sub1_0.anInt53 * 64) + (aclass1_sub1_0.method584() * 8));
								}

								final Class3 class3_0 = new Class3(area_0.anInt468, coordinates_2, coordinates_1,
										method129(area_0));
								aHashMap3.put(coordinates_0, class3_0);
								continue label50;
							}
						}
					}
				}
			}
		}

	}

	void method141(final List list_0) {
		final Iterator iterator_0 = list_0.iterator();

		while (iterator_0.hasNext()) {
			final Class51 class51_0 = (Class51) iterator_0.next();
			if (((class51_0.aCoordinates7.worldX >> 6) == anInt34)
					&& ((class51_0.aCoordinates7.worldY >> 6) == anInt37)) {
				final Class3 class3_0 = new Class3(class51_0.anInt113, class51_0.aCoordinates7, class51_0.aCoordinates7,
						method154(class51_0.anInt113));
				aList2.add(class3_0);
			}
		}

	}

	void method142(final int int_0, final int int_1, final AClass1 aclass1_0) {
		aCoordinates5.method490(0, int_0, int_1);

		for (int int_2 = 0; int_2 < aclass1_0.anInt50; int_2++) {
			final Class12[] class12s_0 = aclass1_0.aClass12ArrayArrayArrayArray1[int_2][int_0][int_1];
			if ((class12s_0 != null) && (class12s_0.length != 0)) {
				final Class12[] class12s_1 = class12s_0;

				for (int int_3 = 0; int_3 < class12s_1.length; int_3++) {
					final Class12 class12_0 = class12s_1[int_3];
					final Area area_0 = method148(class12_0.anInt40);
					if (area_0 != null) {
						Class3 class3_0 = (Class3) aHashMap3.get(aCoordinates5);
						if (class3_0 != null) {
							if (area_0.anInt468 != class3_0.anInt19) {
								final Class3 class3_1 = new Class3(area_0.anInt468, class3_0.aCoordinates1,
										class3_0.aCoordinates2, method129(area_0));
								aHashMap3.put(new Coordinates(aCoordinates5), class3_1);
								class3_0 = class3_1;
							}

							final int int_4 = class3_0.aCoordinates1.plane - class3_0.aCoordinates2.plane;
							class3_0.aCoordinates2.plane = int_2;
							class3_0.aCoordinates1.plane = int_4 + int_2;
							return;
						}

						final Coordinates coordinates_0 = new Coordinates(int_2, (anInt34 * 64) + int_0,
								(anInt37 * 64) + int_1);
						Coordinates coordinates_1 = null;
						if (anAClass1_Sub2_1 != null) {
							coordinates_1 = new Coordinates(anAClass1_Sub2_1.anInt51 + int_2,
									(anAClass1_Sub2_1.anInt52 * 64) + int_0, (anAClass1_Sub2_1.anInt53 * 64) + int_1);
						} else {
							final Iterator iterator_0 = aLinkedList1.iterator();

							while (iterator_0.hasNext()) {
								final AClass1_Sub1 aclass1_sub1_0 = (AClass1_Sub1) iterator_0.next();
								if (aclass1_sub1_0.method580(int_0, int_1)) {
									coordinates_1 = new Coordinates(int_2 + aclass1_sub1_0.anInt51,
											(aclass1_sub1_0.anInt52 * 64) + int_0 + (aclass1_sub1_0.method583() * 8),
											(aclass1_sub1_0.anInt53 * 64) + int_1 + (aclass1_sub1_0.method584() * 8));
									break;
								}
							}
						}

						if (coordinates_1 != null) {
							class3_0 = new Class3(area_0.anInt468, coordinates_1, coordinates_0, method129(area_0));
							aHashMap3.put(new Coordinates(aCoordinates5), class3_0);
							return;
						}
					}
				}
			}
		}

		aHashMap3.remove(aCoordinates5);
	}

	void method143(final int int_0, final int int_1, final AClass1 aclass1_0, final Class6 class6_0) {
		for (int int_2 = 1; int_2 < aclass1_0.anInt50; int_2++) {
			final int int_3 = aclass1_0.aShortArrayArrayArray2[int_2][int_0][int_1] - 1;
			if (int_3 > -1) {
				final int int_4 = WorldMapData.method302(int_3, anInt36);
				if (aclass1_0.aByteArrayArrayArray2[int_2][int_0][int_1] == 0) {
					Rasterizer2D.method853(anInt35 * int_0, anInt35 * (63 - int_1), anInt35, anInt35, int_4);
				} else {
					class6_0.method102(anInt35 * int_0, anInt35 * (63 - int_1), 0, int_4, anInt35, anInt35,
							aclass1_0.aByteArrayArrayArray2[int_2][int_0][int_1],
							aclass1_0.aByteArrayArrayArray3[int_2][int_0][int_1]);
				}
			}
		}

	}

	int method144(final SpritePixels spritepixels_0, final Enum8 enum8_0) {
		switch (enum8_0.anInt411) {
		case 1:
			return -spritepixels_0.height / 2;
		case 2:
			return 0;
		default:
			return -spritepixels_0.height;
		}
	}

	void method145(final int int_0, final int int_1, final int int_2, final int int_3, final AClass1 aclass1_0,
			final Class2 class2_0) {
		for (int int_4 = int_0; int_4 < (int_2 + int_0); int_4++) {
			for (int int_5 = int_1; int_5 < (int_1 + int_3); int_5++) {
				final int int_6 = aclass1_0.aShortArrayArrayArray1[0][int_4][int_5] - 1;
				if (int_6 != -1) {
					final FloorUnderlayDefinition floorunderlaydefinition_0 = Class53.method322(int_6);
					class2_0.method78(int_4, int_5, 5, floorunderlaydefinition_0);
				}
			}
		}

	}

	int method146(final int int_0, final int int_1, final AClass1 aclass1_0) {
		return aclass1_0.aShortArrayArrayArray1[0][int_0][int_1] == 0 ? anInt36 : anIntArrayArray5[int_0][int_1];
	}

	void method147(final Class11[] class11s_0, final Class2 class2_0) {
		final Enum5[] enum5s_0 = new Enum5[] { Enum5.anEnum5_5, Enum5.anEnum5_7, Enum5.anEnum5_6, Enum5.anEnum5_1,
				Enum5.anEnum5_3, Enum5.anEnum5_2, Enum5.anEnum5_4, Enum5.anEnum5_8 };
		final Enum5[] enum5s_1 = enum5s_0;

		for (int int_0 = 0; int_0 < enum5s_1.length; int_0++) {
			final Enum5 enum5_0 = enum5s_1[int_0];
			if (class11s_0[enum5_0.rsOrdinal()] != null) {
				byte byte_0 = 0;
				byte byte_1 = 0;
				byte byte_2 = 64;
				byte byte_3 = 64;
				byte byte_4 = 0;
				byte byte_5 = 0;
				switch (enum5_0.anInt398) {
				case 0:
					byte_1 = 59;
					byte_3 = 5;
					byte_4 = 59;
					byte_2 = 5;
					break;
				case 1:
					byte_5 = 59;
					byte_3 = 5;
					byte_0 = 59;
					byte_2 = 5;
					break;
				case 2:
					byte_0 = 59;
					byte_2 = 5;
					break;
				case 3:
					byte_4 = 59;
					byte_5 = 59;
					byte_2 = 5;
					byte_3 = 5;
					break;
				case 4:
					byte_5 = 59;
					byte_3 = 5;
					break;
				case 5:
					byte_1 = 59;
					byte_3 = 5;
					byte_0 = 59;
					byte_2 = 5;
					break;
				case 6:
					byte_1 = 59;
					byte_3 = 5;
					break;
				case 7:
					byte_4 = 59;
					byte_2 = 5;
				}

				method162(byte_4, byte_5, byte_0, byte_1, byte_2, byte_3, class11s_0[enum5_0.rsOrdinal()], class2_0);
			}
		}

	}

	Area method148(final int int_0) {
		ObjectComposition objectcomposition_0 = PlayerComposition.getObjectDefinition(int_0);
		if (objectcomposition_0.impostorIds != null) {
			objectcomposition_0 = objectcomposition_0.getImpostor();
			if (objectcomposition_0 == null) {
				return null;
			}
		}

		return objectcomposition_0.mapIconId != -1 ? Class17.anAreaArray1[objectcomposition_0.mapIconId] : null;
	}

	void method149(final Class2 class2_0) {
		anIntArrayArray5 = new int[64][64];

		for (int int_0 = 0; int_0 < 64; int_0++) {
			for (int int_1 = 0; int_1 < 64; int_1++) {
				anIntArrayArray5[int_0][int_1] = class2_0.method77(int_0, int_1) | 0xFF000000;
			}
		}

	}

	void method150(final Class6 class6_0, final Class11[] class11s_0, final ModIcon[] modicons_0) {
		int int_0;
		int int_1;
		for (int_0 = 0; int_0 < 64; int_0++) {
			for (int_1 = 0; int_1 < 64; int_1++) {
				method132(int_0, int_1, anAClass1_Sub2_1, class6_0);
				method143(int_0, int_1, anAClass1_Sub2_1, class6_0);
			}
		}

		for (int_0 = 0; int_0 < 64; int_0++) {
			for (int_1 = 0; int_1 < 64; int_1++) {
				method136(int_0, int_1, anAClass1_Sub2_1, class6_0, modicons_0);
			}
		}

	}

	void method151(final Class6 class6_0, final ModIcon[] modicons_0) {
		Iterator iterator_0 = aLinkedList1.iterator();

		AClass1_Sub1 aclass1_sub1_0;
		int int_0;
		int int_1;
		while (iterator_0.hasNext()) {
			aclass1_sub1_0 = (AClass1_Sub1) iterator_0.next();

			for (int_0 = aclass1_sub1_0.method579() * 8; int_0 < ((aclass1_sub1_0.method579() * 8) + 8); int_0++) {
				for (int_1 = aclass1_sub1_0.method581() * 8; int_1 < ((aclass1_sub1_0.method581() * 8) + 8); int_1++) {
					method132(int_0, int_1, aclass1_sub1_0, class6_0);
					method143(int_0, int_1, aclass1_sub1_0, class6_0);
				}
			}
		}

		iterator_0 = aLinkedList1.iterator();

		while (iterator_0.hasNext()) {
			aclass1_sub1_0 = (AClass1_Sub1) iterator_0.next();

			for (int_0 = aclass1_sub1_0.method579() * 8; int_0 < ((aclass1_sub1_0.method579() * 8) + 8); int_0++) {
				for (int_1 = aclass1_sub1_0.method581() * 8; int_1 < ((aclass1_sub1_0.method581() * 8) + 8); int_1++) {
					method136(int_0, int_1, aclass1_sub1_0, class6_0, modicons_0);
				}
			}
		}

	}

	List method152() {
		final LinkedList linkedlist_0 = new LinkedList();
		linkedlist_0.addAll(aList2);
		linkedlist_0.addAll(aHashMap3.values());
		return linkedlist_0;
	}

	void method153(final Area area_0, final int int_0, final int int_1, final int int_2, final int int_3) {
		final SpritePixels spritepixels_0 = area_0.method755(false);
		if (spritepixels_0 != null) {
			spritepixels_0.method916(int_0 - (spritepixels_0.width / 2), int_1 - (spritepixels_0.height / 2));
			if ((int_2 % int_3) < (int_3 / 2)) {
				Rasterizer2D.method856(int_0, int_1, 15, 16776960, 128);
				Rasterizer2D.method856(int_0, int_1, 7, 16777215, 256);
			}

		}
	}

	Class14 method154(final int int_0) {
		final Area area_0 = Class17.anAreaArray1[int_0];
		return method129(area_0);
	}

	void method155() {
		if (anAClass1_Sub2_1 != null) {
			for (int int_0 = 0; int_0 < 64; int_0++) {
				for (int int_1 = 0; int_1 < 64; int_1++) {
					method142(int_0, int_1, anAClass1_Sub2_1);
				}
			}

		} else {
			final Iterator iterator_0 = aLinkedList1.iterator();

			while (iterator_0.hasNext()) {
				final AClass1_Sub1 aclass1_sub1_0 = (AClass1_Sub1) iterator_0.next();

				for (int int_2 = aclass1_sub1_0.method579() * 8; int_2 < ((aclass1_sub1_0.method579() * 8)
						+ 8); int_2++) {
					for (int int_3 = aclass1_sub1_0.method581() * 8; int_3 < ((aclass1_sub1_0.method581() * 8)
							+ 8); int_3++) {
						method142(int_2, int_3, aclass1_sub1_0);
					}
				}
			}

		}
	}

	void method156(final Class3 class3_0, final int int_0, final int int_1, final float float_0) {
		final Area area_0 = Class17.anAreaArray1[class3_0.anInt19];
		method131(area_0, int_0, int_1);
		method137(class3_0, area_0, int_0, int_1, float_0);
	}

	void method157(final HashSet hashset_0, final int int_0, final int int_1) {
		final Iterator iterator_0 = aHashMap3.values().iterator();

		while (iterator_0.hasNext()) {
			final Class3 class3_0 = (Class3) iterator_0.next();
			if (hashset_0.contains(Integer.valueOf(class3_0.anInt19))) {
				final Area area_0 = Class17.anAreaArray1[class3_0.anInt19];
				method153(area_0, class3_0.anInt20, class3_0.anInt22, int_0, int_1);
			}
		}

		method138(hashset_0, int_0, int_1);
	}

	void method158(final int int_0, final int int_1, int int_2, final int int_3) {
		int_2 %= 4;
		if (int_2 == 0) {
			Rasterizer2D.method852(anInt35 * int_0, anInt35 * (63 - int_1), anInt35, int_3);
		}

		if (int_2 == 1) {
			Rasterizer2D.method854(anInt35 * int_0, anInt35 * (63 - int_1), anInt35, int_3);
		}

		if (int_2 == 2) {
			Rasterizer2D.method852((anInt35 + (anInt35 * int_0)) - 1, anInt35 * (63 - int_1), anInt35, int_3);
		}

		if (int_2 == 3) {
			Rasterizer2D.method854(anInt35 * int_0, ((anInt35 * (63 - int_1)) + anInt35) - 1, anInt35, int_3);
		}

	}

	void method159(final int int_0, final int int_1, final int int_2, HashSet hashset_0) {
		if (hashset_0 == null) {
			hashset_0 = new HashSet();
		}

		method128(int_0, int_1, hashset_0, int_2);
		method133(int_0, int_1, hashset_0, int_2);
	}

	List method160(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4) {
		final LinkedList linkedlist_0 = new LinkedList();
		if ((int_3 >= int_0) && (int_4 >= int_1)) {
			if ((int_3 < (int_2 + int_0)) && (int_4 < (int_2 + int_1))) {
				Iterator iterator_0 = aHashMap3.values().iterator();

				Class3 class3_0;
				while (iterator_0.hasNext()) {
					class3_0 = (Class3) iterator_0.next();
					if (class3_0.method84(int_3, int_4)) {
						linkedlist_0.add(class3_0);
					}
				}

				iterator_0 = aList2.iterator();

				while (iterator_0.hasNext()) {
					class3_0 = (Class3) iterator_0.next();
					if (class3_0.method84(int_3, int_4)) {
						linkedlist_0.add(class3_0);
					}
				}

				return linkedlist_0;
			} else {
				return linkedlist_0;
			}
		} else {
			return linkedlist_0;
		}
	}

	boolean method161(final int int_0, final Class6 class6_0, final Class11[] class11s_0, final ModIcon[] modicons_0) {
		if (!method126(int_0)) {
			return false;
		} else if ((anAClass1_Sub2_1 == null) && aLinkedList1.isEmpty()) {
			return false;
		} else {
			method139(class11s_0);
			aSpritePixels1.method915();
			if (anAClass1_Sub2_1 != null) {
				method150(class6_0, class11s_0, modicons_0);
			} else {
				method151(class6_0, modicons_0);
			}

			return true;
		}
	}

	void method162(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final Class11 class11_1, final Class2 class2_0) {
		for (int int_6 = 0; int_6 < int_4; int_6++) {
			for (int int_7 = 0; int_7 < int_5; int_7++) {
				final int int_8 = class11_1.method135(int_6 + int_0, int_7 + int_1);
				if (int_8 != -1) {
					final FloorUnderlayDefinition floorunderlaydefinition_0 = Class53.method322(int_8);
					class2_0.method78(int_2 + int_6, int_7 + int_3, 5, floorunderlaydefinition_0);
				}
			}
		}

	}

	void method163(final int int_0, final int int_1, final int int_2) {
		if (aSpritePixels1 != null) {
			if (int_2 == (anInt35 * 64)) {
				aSpritePixels1.method914(int_0, int_1);
			} else {
				aSpritePixels1.method913(int_0, int_1, int_2, int_2);
			}
		}
	}

	void method164(final AClass1_Sub2 aclass1_sub2_0, final List list_0) {
		aHashMap3.clear();
		anAClass1_Sub2_1 = aclass1_sub2_0;
		method140(0, 0, 64, 64, anAClass1_Sub2_1);
		method141(list_0);
	}

	void method165(final HashSet hashset_0, final List list_0) {
		aHashMap3.clear();
		final Iterator iterator_0 = hashset_0.iterator();

		while (iterator_0.hasNext()) {
			final AClass1_Sub1 aclass1_sub1_0 = (AClass1_Sub1) iterator_0.next();
			if ((aclass1_sub1_0.method186() == anInt34) && (aclass1_sub1_0.method187() == anInt37)) {
				aLinkedList1.add(aclass1_sub1_0);
				method140(aclass1_sub1_0.method579() * 8, aclass1_sub1_0.method581() * 8, 8, 8, aclass1_sub1_0);
			}
		}

		method141(list_0);
	}

	static final void menuAction(final int int_0, final int int_1, int int_2, final int int_3, final String string_0,
			final String string_1, final int int_4, final int int_5) {
		if (int_2 >= 2000) {
			int_2 -= 2000;
		}

		Widget widget_0;

		if (int_2 == 1005) {
			widget_0 = Class18.method202(int_1);
			if ((widget_0 != null) && (widget_0.itemQuantities[int_0] >= 100000)) {
				WidgetNode.sendGameMessage(27, "",
						widget_0.itemQuantities[int_0] + " x " + Class45.getItemDefinition(int_3).name);
			} else {
				Client.secretPacketBuffer1.putOpcode(101);
				Client.secretPacketBuffer1.putShort(int_3);
			}

			Client.anInt676 = 0;
			Class1.aWidget1 = Class18.method202(int_1);
			Client.anInt680 = int_0;
		}

		Player player_0;
		if (int_2 == 45) {
			player_0 = Client.cachedPlayers[int_3];
			if (player_0 != null) {
				Client.anInt685 = int_4;
				Client.anInt686 = int_5;
				Client.cursorState = 2;
				Client.anInt688 = 0;
				Client.destinationX = int_0;
				Client.destinationY = int_1;
				Client.secretPacketBuffer1.putOpcode(231);
				Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
				Client.secretPacketBuffer1.putShortOb2(int_3);
			}
		}

		if (int_2 == 1) {
			Client.anInt685 = int_4;
			Client.anInt686 = int_5;
			Client.cursorState = 2;
			Client.anInt688 = 0;
			Client.destinationX = int_0;
			Client.destinationY = int_1;
			Client.secretPacketBuffer1.putOpcode(63);
			Client.secretPacketBuffer1.method666(Class44.anInt101);
			Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
			Client.secretPacketBuffer1.putShortOb2(Class49.selectedItemIndex);
			Client.secretPacketBuffer1.putLEShortA(Class34.anInt92);
			Client.secretPacketBuffer1.method670(int_0 + AClass2.baseX);
			Client.secretPacketBuffer1.putShort(AClass4_Sub1.baseY + int_1);
			Client.secretPacketBuffer1.putShort((int_3 >> 14) & 0x7FFF);
		}

		if (int_2 == 39) {
			Client.secretPacketBuffer1.putOpcode(33);
			Client.secretPacketBuffer1.method668(int_1);
			Client.secretPacketBuffer1.putLEShortA(int_3);
			Client.secretPacketBuffer1.putShortOb2(int_0);
			Client.anInt676 = 0;
			Class1.aWidget1 = Class18.method202(int_1);
			Client.anInt680 = int_0;
		}

		NPC npc_0;
		if (int_2 == 13) {
			npc_0 = Client.cachedNPCs[int_3];
			if (npc_0 != null) {
				Client.anInt685 = int_4;
				Client.anInt686 = int_5;
				Client.cursorState = 2;
				Client.anInt688 = 0;
				Client.destinationX = int_0;
				Client.destinationY = int_1;
				Client.secretPacketBuffer1.putOpcode(129);
				Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
				Client.secretPacketBuffer1.method670(int_3);
			}
		}

		if (int_2 == 26) {
			Client.secretPacketBuffer1.putOpcode(89);

			for (WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable
					.method515(); widgetnode_0 != null; widgetnode_0 = (WidgetNode) Client.componentTable.method516()) {
				if ((widgetnode_0.owner == 0) || (widgetnode_0.owner == 3)) {
					MilliTimer.method690(widgetnode_0, true);
				}
			}

			if (Client.aWidget12 != null) {
				Class15.method196(Client.aWidget12);
				Client.aWidget12 = null;
			}
		}

		if (int_2 == 1003) {
			Client.anInt685 = int_4;
			Client.anInt686 = int_5;
			Client.cursorState = 2;
			Client.anInt688 = 0;
			npc_0 = Client.cachedNPCs[int_3];
			if (npc_0 != null) {
				NPCComposition npccomposition_0 = npc_0.composition;
				if (npccomposition_0.configs != null) {
					npccomposition_0 = npccomposition_0.transform();
				}

				if (npccomposition_0 != null) {
					Client.secretPacketBuffer1.putOpcode(54);
					Client.secretPacketBuffer1.putLEShortA(npccomposition_0.anInt517);
				}
			}
		}

		if ((int_2 == 1008) || (int_2 == 1009) || (int_2 == 1010) || (int_2 == 1011) || (int_2 == 1012)) {
			Class49.renderOverview.method33(int_2, int_3, new Coordinates(int_0), new Coordinates(int_1));
		}

		if (int_2 == 7) {
			npc_0 = Client.cachedNPCs[int_3];
			if (npc_0 != null) {
				Client.anInt685 = int_4;
				Client.anInt686 = int_5;
				Client.cursorState = 2;
				Client.anInt688 = 0;
				Client.destinationX = int_0;
				Client.destinationY = int_1;
				Client.secretPacketBuffer1.putOpcode(209);
				Client.secretPacketBuffer1.method676(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
				Client.secretPacketBuffer1.putLEShortA(Class49.selectedItemIndex);
				Client.secretPacketBuffer1.method670(int_3);
				Client.secretPacketBuffer1.method666(Class44.anInt101);
				Client.secretPacketBuffer1.putShort(Class34.anInt92);
			}
		}

		if (int_2 == 40) {
			Client.secretPacketBuffer1.putOpcode(97);
			Client.secretPacketBuffer1.putShortOb2(int_3);
			Client.secretPacketBuffer1.method670(int_0);
			Client.secretPacketBuffer1.putLEInt(int_1);
			Client.anInt676 = 0;
			Class1.aWidget1 = Class18.method202(int_1);
			Client.anInt680 = int_0;
		}

		if (int_2 == 38) {
			Class23.method215();
			widget_0 = Class18.method202(int_1);
			Client.itemSelectionState = 1;
			Class49.selectedItemIndex = int_0;
			Class44.anInt101 = int_1;
			Class34.anInt92 = int_3;
			Class15.method196(widget_0);
			Client.selectedItemName = Class6.getColTags(16748608) + Class45.getItemDefinition(int_3).name
					+ Class6.getColTags(16777215);
			if (Client.selectedItemName == null) {
				Client.selectedItemName = "null";
			}

		} else {
			if (int_2 == 15) {
				player_0 = Client.cachedPlayers[int_3];
				if (player_0 != null) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(221);
					Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.putShortOb2(Client.anInt750);
					Client.secretPacketBuffer1.putLEShortA(int_3);
					Client.secretPacketBuffer1.putLEInt(Class13.anInt43);
				}
			}

			if (int_2 == 6) {
				Client.anInt685 = int_4;
				Client.anInt686 = int_5;
				Client.cursorState = 2;
				Client.anInt688 = 0;
				Client.destinationX = int_0;
				Client.destinationY = int_1;
				Client.secretPacketBuffer1.putOpcode(197);
				Client.secretPacketBuffer1.method670(int_0 + AClass2.baseX);
				Client.secretPacketBuffer1.putShortOb2(AClass4_Sub1.baseY + int_1);
				Client.secretPacketBuffer1.putShort((int_3 >> 14) & 0x7FFF);
				Client.secretPacketBuffer1.method676(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
			}

			if (int_2 == 43) {
				Client.secretPacketBuffer1.putOpcode(103);
				Client.secretPacketBuffer1.putShort(int_0);
				Client.secretPacketBuffer1.putLEInt(int_1);
				Client.secretPacketBuffer1.putLEShortA(int_3);
				Client.anInt676 = 0;
				Class1.aWidget1 = Class18.method202(int_1);
				Client.anInt680 = int_0;
			}

			if (int_2 == 16) {
				Client.anInt685 = int_4;
				Client.anInt686 = int_5;
				Client.cursorState = 2;
				Client.anInt688 = 0;
				Client.destinationX = int_0;
				Client.destinationY = int_1;
				Client.secretPacketBuffer1.putOpcode(180);
				Client.secretPacketBuffer1.putLEShortA(Class49.selectedItemIndex);
				Client.secretPacketBuffer1.putShort(int_0 + AClass2.baseX);
				Client.secretPacketBuffer1.method670(Class34.anInt92);
				Client.secretPacketBuffer1.method670(int_3);
				Client.secretPacketBuffer1.putLEInt(Class44.anInt101);
				Client.secretPacketBuffer1.method675(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
				Client.secretPacketBuffer1.putLEShortA(AClass4_Sub1.baseY + int_1);
			}

			if (int_2 == 2) {
				Client.anInt685 = int_4;
				Client.anInt686 = int_5;
				Client.cursorState = 2;
				Client.anInt688 = 0;
				Client.destinationX = int_0;
				Client.destinationY = int_1;
				Client.secretPacketBuffer1.putOpcode(119);
				Client.secretPacketBuffer1.putLEShortA(int_0 + AClass2.baseX);
				Client.secretPacketBuffer1.putShortOb2((int_3 >> 14) & 0x7FFF);
				Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
				Client.secretPacketBuffer1.putShortOb2(Client.anInt750);
				Client.secretPacketBuffer1.method666(Class13.anInt43);
				Client.secretPacketBuffer1.putShortOb2(AClass4_Sub1.baseY + int_1);
			}

			if (int_2 == 1004) {
				Client.anInt685 = int_4;
				Client.anInt686 = int_5;
				Client.cursorState = 2;
				Client.anInt688 = 0;
				Client.secretPacketBuffer1.putOpcode(101);
				Client.secretPacketBuffer1.putShort(int_3);
			}

			if (int_2 == 42) {
				Client.secretPacketBuffer1.putOpcode(178);
				Client.secretPacketBuffer1.putShort(int_0);
				Client.secretPacketBuffer1.method666(int_1);
				Client.secretPacketBuffer1.method670(int_3);
				Client.anInt676 = 0;
				Class1.aWidget1 = Class18.method202(int_1);
				Client.anInt680 = int_0;
			}

			if ((int_2 == 30) && (Client.aWidget12 == null)) {
				Client.secretPacketBuffer1.putOpcode(213);
				Client.secretPacketBuffer1.putLEInt(int_1);
				Client.secretPacketBuffer1.putLEShortA(int_0);
				Client.aWidget12 = Class33.method238(int_1, int_0);
				Class15.method196(Client.aWidget12);
			}

			if (int_2 == 35) {
				Client.secretPacketBuffer1.putOpcode(251);
				Client.secretPacketBuffer1.putLEInt(int_1);
				Client.secretPacketBuffer1.putLEShortA(int_0);
				Client.secretPacketBuffer1.putLEShortA(int_3);
				Client.anInt676 = 0;
				Class1.aWidget1 = Class18.method202(int_1);
				Client.anInt680 = int_0;
			}

			if (int_2 == 33) {
				Client.secretPacketBuffer1.putOpcode(39);
				Client.secretPacketBuffer1.method670(int_3);
				Client.secretPacketBuffer1.putLEShortA(int_0);
				Client.secretPacketBuffer1.putLEInt(int_1);
				Client.anInt676 = 0;
				Class1.aWidget1 = Class18.method202(int_1);
				Client.anInt680 = int_0;
			}

			if (int_2 == 51) {
				player_0 = Client.cachedPlayers[int_3];
				if (player_0 != null) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(205);
					Client.secretPacketBuffer1.putShortOb2(int_3);
					Client.secretPacketBuffer1.method675(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
				}
			}

			int int_6;
			if (int_2 == 28) {
				Client.secretPacketBuffer1.putOpcode(9);
				Client.secretPacketBuffer1.putInt(int_1);
				widget_0 = Class18.method202(int_1);
				if ((widget_0.dynamicValues != null) && (widget_0.dynamicValues[0][0] == 5)) {
					int_6 = widget_0.dynamicValues[0][1];
					Class86.widgetSettings[int_6] = 1 - Class86.widgetSettings[int_6];
					Class44.method266(int_6);
				}
			}

			if (int_2 == 31) {
				Client.secretPacketBuffer1.putOpcode(219);
				Client.secretPacketBuffer1.method670(Class34.anInt92);
				Client.secretPacketBuffer1.method668(Class44.anInt101);
				Client.secretPacketBuffer1.putLEShortA(int_0);
				Client.secretPacketBuffer1.putLEShortA(Class49.selectedItemIndex);
				Client.secretPacketBuffer1.putInt(int_1);
				Client.secretPacketBuffer1.putShortOb2(int_3);
				Client.anInt676 = 0;
				Class1.aWidget1 = Class18.method202(int_1);
				Client.anInt680 = int_0;
			}

			if (int_2 == 25) {
				widget_0 = Class33.method238(int_1, int_0);
				if (widget_0 != null) {
					Class23.method215();
					final int int_7 = Class6.getWidgetConfig(widget_0);
					int_6 = (int_7 >> 11) & 0x3F;
					final int int_8 = widget_0.itemId;
					final Widget widget_1 = Class33.method238(int_1, int_0);
					if ((widget_1 != null) && (widget_1.anObjectArray7 != null)) {
						final ScriptEvent scriptevent_0 = new ScriptEvent();
						scriptevent_0.widget = widget_1;
						scriptevent_0.anObjectArray22 = widget_1.anObjectArray7;
						Class30.method229(scriptevent_0);
					}

					Client.anInt752 = int_8;
					Client.spellSelected = true;
					Class13.anInt43 = int_1;
					Client.anInt750 = int_0;
					Class53.anInt131 = int_6;
					Class15.method196(widget_1);
					Client.itemSelectionState = 0;
					Client.aString33 = MouseInput.method555(widget_0);
					if (Client.aString33 == null) {
						Client.aString33 = "Null";
					}

					if (widget_0.hasScript) {
						Client.aString34 = widget_0.name + Class6.getColTags(16777215);
					} else {
						Client.aString34 = Class6.getColTags(65280) + widget_0.aString16 + Class6.getColTags(16777215);
					}
				}
			} else {
				if (int_2 == 36) {
					Client.secretPacketBuffer1.putOpcode(56);
					Client.secretPacketBuffer1.putShortOb2(int_3);
					Client.secretPacketBuffer1.putShort(int_0);
					Client.secretPacketBuffer1.putLEInt(int_1);
					Client.anInt676 = 0;
					Class1.aWidget1 = Class18.method202(int_1);
					Client.anInt680 = int_0;
				}

				if (int_2 == 5) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(156);
					Client.secretPacketBuffer1.putShort(AClass4_Sub1.baseY + int_1);
					Client.secretPacketBuffer1.putLEShortA((int_3 >> 14) & 0x7FFF);
					Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.putLEShortA(int_0 + AClass2.baseX);
				}

				if (int_2 == 1002) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.secretPacketBuffer1.putOpcode(152);
					Client.secretPacketBuffer1.putLEShortA((int_3 >> 14) & 0x7FFF);
				}

				if (int_2 == 12) {
					npc_0 = Client.cachedNPCs[int_3];
					if (npc_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(242);
						Client.secretPacketBuffer1.putShortOb2(int_3);
						Client.secretPacketBuffer1.method675(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					}
				}

				if (int_2 == 9) {
					npc_0 = Client.cachedNPCs[int_3];
					if (npc_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(250);
						Client.secretPacketBuffer1.putShort(int_3);
						Client.secretPacketBuffer1.method675(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					}
				}

				if (int_2 == 34) {
					Client.secretPacketBuffer1.putOpcode(172);
					Client.secretPacketBuffer1.putShortOb2(int_0);
					Client.secretPacketBuffer1.method668(int_1);
					Client.secretPacketBuffer1.putLEShortA(int_3);
					Client.anInt676 = 0;
					Class1.aWidget1 = Class18.method202(int_1);
					Client.anInt680 = int_0;
				}

				if (int_2 == 58) {
					widget_0 = Class33.method238(int_1, int_0);
					if (widget_0 != null) {
						Client.secretPacketBuffer1.putOpcode(248);
						Client.secretPacketBuffer1.method670(int_0);
						Client.secretPacketBuffer1.putLEInt(Class13.anInt43);
						Client.secretPacketBuffer1.method668(int_1);
						Client.secretPacketBuffer1.method670(Client.anInt752);
						Client.secretPacketBuffer1.putShort(widget_0.itemId);
						Client.secretPacketBuffer1.putShortOb2(Client.anInt750);
					}
				}

				if (int_2 == 48) {
					player_0 = Client.cachedPlayers[int_3];
					if (player_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(69);
						Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
						Client.secretPacketBuffer1.putShortOb2(int_3);
					}
				}

				if (int_2 == 11) {
					npc_0 = Client.cachedNPCs[int_3];
					if (npc_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(217);
						Client.secretPacketBuffer1.putLEShortA(int_3);
						Client.secretPacketBuffer1.method676(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					}
				}

				if (int_2 == 19) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(1);
					Client.secretPacketBuffer1.method676(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.method670(int_3);
					Client.secretPacketBuffer1.method670(AClass4_Sub1.baseY + int_1);
					Client.secretPacketBuffer1.method670(int_0 + AClass2.baseX);
				}

				if (int_2 == 24) {
					widget_0 = Class18.method202(int_1);
					boolean bool_1 = true;
					if (widget_0.contentType > 0) {
						bool_1 = SoundTask.method313(widget_0);
					}

					if (bool_1) {
						Client.secretPacketBuffer1.putOpcode(9);
						Client.secretPacketBuffer1.putInt(int_1);
						System.out.println("buttonClick_24(" + (int_1 >> 16) + ", " + (int_1 & 0xFFFF) + "); int_1: " + int_1);
					}
				}

				if (int_2 == 8) {
					npc_0 = Client.cachedNPCs[int_3];
					if (npc_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(175);
						Client.secretPacketBuffer1.putShortOb2(int_3);
						Client.secretPacketBuffer1.method670(Client.anInt750);
						Client.secretPacketBuffer1.putLEInt(Class13.anInt43);
						Client.secretPacketBuffer1.method676(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					}
				}

				if (int_2 == 41) {
					Client.secretPacketBuffer1.putOpcode(66);
					Client.secretPacketBuffer1.putLEShortA(int_3);
					Client.secretPacketBuffer1.method666(int_1);
					Client.secretPacketBuffer1.putShortOb2(int_0);
					Client.anInt676 = 0;
					Class1.aWidget1 = Class18.method202(int_1);
					Client.anInt680 = int_0;
				}

				if (int_2 == 20) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(59);
					Client.secretPacketBuffer1.method670(int_3);
					Client.secretPacketBuffer1.method670(int_0 + AClass2.baseX);
					Client.secretPacketBuffer1.putShortOb2(AClass4_Sub1.baseY + int_1);
					Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
				}

				if (int_2 == 37) {
					Client.secretPacketBuffer1.putOpcode(58);
					Client.secretPacketBuffer1.method670(int_0);
					Client.secretPacketBuffer1.method668(int_1);
					Client.secretPacketBuffer1.putShort(int_3);
					Client.anInt676 = 0;
					Class1.aWidget1 = Class18.method202(int_1);
					Client.anInt680 = int_0;
				}

				if (int_2 == 29) {
					Client.secretPacketBuffer1.putOpcode(9);
					Client.secretPacketBuffer1.putInt(int_1);
					widget_0 = Class18.method202(int_1);
					if ((widget_0.dynamicValues != null) && (widget_0.dynamicValues[0][0] == 5)) {
						int_6 = widget_0.dynamicValues[0][1];
						if (Class86.widgetSettings[int_6] != widget_0.anIntArray69[0]) {
							Class86.widgetSettings[int_6] = widget_0.anIntArray69[0];
							Class44.method266(int_6);
						}
					}
				}

				if (int_2 == 22) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(105);
					Client.secretPacketBuffer1.putLEShortA(int_0 + AClass2.baseX);
					Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.putShort(AClass4_Sub1.baseY + int_1);
					Client.secretPacketBuffer1.method670(int_3);
				}

				if (int_2 == 4) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(25);
					Client.secretPacketBuffer1.putLEShortA(AClass4_Sub1.baseY + int_1);
					Client.secretPacketBuffer1.putShort((int_3 >> 14) & 0x7FFF);
					Client.secretPacketBuffer1.method675(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.method670(int_0 + AClass2.baseX);
				}

				if (int_2 == 18) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(144);
					Client.secretPacketBuffer1.method670(int_0 + AClass2.baseX);
					Client.secretPacketBuffer1.putShort(int_3);
					Client.secretPacketBuffer1.putShort(AClass4_Sub1.baseY + int_1);
					Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
				}

				if (int_2 == 32) {
					Client.secretPacketBuffer1.putOpcode(88);
					Client.secretPacketBuffer1.putLEInt(Class13.anInt43);
					Client.secretPacketBuffer1.putShortOb2(int_3);
					Client.secretPacketBuffer1.putLEShortA(Client.anInt750);
					Client.secretPacketBuffer1.putLEInt(int_1);
					Client.secretPacketBuffer1.method670(int_0);
					Client.anInt676 = 0;
					Class1.aWidget1 = Class18.method202(int_1);
					Client.anInt680 = int_0;
				}

				if ((int_2 == 57) || (int_2 == 1007)) {
					widget_0 = Class33.method238(int_1, int_0);
					if (widget_0 != null) {
						int_6 = widget_0.itemId;
						final Widget widget_2 = Class33.method238(int_1, int_0);
						if (widget_2 != null) {
							if (widget_2.anObjectArray8 != null) {
								final ScriptEvent scriptevent_1 = new ScriptEvent();
								scriptevent_1.widget = widget_2;
								scriptevent_1.anInt418 = int_3;
								scriptevent_1.aString26 = string_1;
								scriptevent_1.anObjectArray22 = widget_2.anObjectArray8;
								Class30.method229(scriptevent_1);
							}

							boolean bool_0 = true;
							if (widget_2.contentType > 0) {
								bool_0 = SoundTask.method313(widget_2);
							}

							if (bool_0 && Class37.method253(Class6.getWidgetConfig(widget_2), int_3 - 1)) {
								if (int_3 == 1) {
									Client.secretPacketBuffer1.putOpcode(215);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 2) {
									Client.secretPacketBuffer1.putOpcode(85);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 3) {
									Client.secretPacketBuffer1.putOpcode(61);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 4) {
									Client.secretPacketBuffer1.putOpcode(149);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 5) {
									Client.secretPacketBuffer1.putOpcode(200);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 6) {
									Client.secretPacketBuffer1.putOpcode(191);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 7) {
									Client.secretPacketBuffer1.putOpcode(98);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 8) {
									Client.secretPacketBuffer1.putOpcode(31);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 9) {
									Client.secretPacketBuffer1.putOpcode(76);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}

								if (int_3 == 10) {
									Client.secretPacketBuffer1.putOpcode(108);
									Client.secretPacketBuffer1.putInt(int_1);
									Client.secretPacketBuffer1.putShort(int_0);
									Client.secretPacketBuffer1.putShort(int_6);
								}
							}
						}
					}
				}

				if (int_2 == 23) {
					if (Client.isMenuOpen) {
						Class8.region.method373();
					} else {
						Class8.region.method352(AClass1_Sub1.plane, int_0, int_1, true);
					}
				}

				if (int_2 == 14) {
					player_0 = Client.cachedPlayers[int_3];
					if (player_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(170);
						Client.secretPacketBuffer1.method670(Class34.anInt92);
						Client.secretPacketBuffer1.putShort(int_3);
						Client.secretPacketBuffer1.putInt(Class44.anInt101);
						Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
						Client.secretPacketBuffer1.method670(Class49.selectedItemIndex);
					}
				}

				if (int_2 == 44) {
					player_0 = Client.cachedPlayers[int_3];
					if (player_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(143);
						Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
						Client.secretPacketBuffer1.putShortOb2(int_3);
					}
				}

				if (int_2 == 50) {
					player_0 = Client.cachedPlayers[int_3];
					if (player_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(93);
						Client.secretPacketBuffer1.method675(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
						Client.secretPacketBuffer1.putLEShortA(int_3);
					}
				}

				if (int_2 == 46) {
					player_0 = Client.cachedPlayers[int_3];
					if (player_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(157);
						Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
						Client.secretPacketBuffer1.putLEShortA(int_3);
					}
				}

				if (int_2 == 49) {
					player_0 = Client.cachedPlayers[int_3];
					if (player_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(20);
						Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
						Client.secretPacketBuffer1.putShort(int_3);
					}
				}

				if (int_2 == 3) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(113);
					Client.secretPacketBuffer1.method676(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.putShort(int_0 + AClass2.baseX);
					Client.secretPacketBuffer1.putShort((int_3 >> 14) & 0x7FFF);
					Client.secretPacketBuffer1.putLEShortA(AClass4_Sub1.baseY + int_1);
				}

				if (int_2 == 47) {
					player_0 = Client.cachedPlayers[int_3];
					if (player_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(49);
						Client.secretPacketBuffer1.putShort(int_3);
						Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					}
				}

				if (int_2 == 1001) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(5);
					Client.secretPacketBuffer1.putShort(int_0 + AClass2.baseX);
					Client.secretPacketBuffer1.putByte(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.method670(AClass4_Sub1.baseY + int_1);
					Client.secretPacketBuffer1.putLEShortA((int_3 >> 14) & 0x7FFF);
				}

				if (int_2 == 21) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(107);
					Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.putShort(int_3);
					Client.secretPacketBuffer1.method670(int_0 + AClass2.baseX);
					Client.secretPacketBuffer1.putShortOb2(AClass4_Sub1.baseY + int_1);
				}

				if (int_2 == 17) {
					Client.anInt685 = int_4;
					Client.anInt686 = int_5;
					Client.cursorState = 2;
					Client.anInt688 = 0;
					Client.destinationX = int_0;
					Client.destinationY = int_1;
					Client.secretPacketBuffer1.putOpcode(177);
					Client.secretPacketBuffer1.putShortOb2(Client.anInt750);
					Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
					Client.secretPacketBuffer1.putShortOb2(int_3);
					Client.secretPacketBuffer1.putShort(AClass4_Sub1.baseY + int_1);
					Client.secretPacketBuffer1.putLEShortA(int_0 + AClass2.baseX);
					Client.secretPacketBuffer1.method668(Class13.anInt43);
				}

				if (int_2 == 10) {
					npc_0 = Client.cachedNPCs[int_3];
					if (npc_0 != null) {
						Client.anInt685 = int_4;
						Client.anInt686 = int_5;
						Client.cursorState = 2;
						Client.anInt688 = 0;
						Client.destinationX = int_0;
						Client.destinationY = int_1;
						Client.secretPacketBuffer1.putOpcode(74);
						Client.secretPacketBuffer1.method676(KeyFocusListener.aBoolArray3[82] ? 1 : 0);
						Client.secretPacketBuffer1.method670(int_3);
					}
				}

				if (Client.itemSelectionState != 0) {
					Client.itemSelectionState = 0;
					Class15.method196(Class18.method202(Class44.anInt101));
				}

				if (Client.spellSelected) {
					Class23.method215();
				}

				if ((Class1.aWidget1 != null) && (Client.anInt676 == 0)) {
					Class15.method196(Class1.aWidget1);
				}
			}
		}
	}

	static void method166() {
		Client.secretPacketBuffer1.putOpcode(220);
		final PacketBuffer packetbuffer_0 = Client.secretPacketBuffer1;
		final int int_0 = Client.isResized ? 2 : 1;
		packetbuffer_0.putByte(int_0);
		Client.secretPacketBuffer1.putShort(Class25.canvasWidth);
		Client.secretPacketBuffer1.putShort(FloorUnderlayDefinition.canvasHeight);
	}

	public static int method167(int int_0, int int_1) {
		int int_2;
		for (int_2 = 0; int_1 > 0; --int_1) {
			int_2 = (int_2 << 1) | (int_0 & 0x1);
			int_0 >>>= 1;
		}

		return int_2;
	}

	static final String[] method168(final String[] strings_0) {
		final String[] strings_1 = new String[5];

		for (int int_0 = 0; int_0 < 5; int_0++) {
			strings_1[int_0] = int_0 + ": ";
			if ((strings_0 != null) && (strings_0[int_0] != null)) {
				strings_1[int_0] = strings_1[int_0] + strings_0[int_0];
			}
		}

		return strings_1;
	}

}
