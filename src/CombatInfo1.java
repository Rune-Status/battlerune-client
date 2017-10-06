public class CombatInfo1 extends Node {

	int anInt393;
	int healthRatio;
	int health;
	int anInt394;

	CombatInfo1(final int int_0, final int int_1, final int int_2, final int int_3) {
		anInt393 = int_0;
		healthRatio = int_1;
		health = int_2;
		anInt394 = int_3;
	}

	void method648(final int int_0, final int int_1, final int int_2, final int int_3) {
		anInt393 = int_0;
		healthRatio = int_1;
		health = int_2;
		anInt394 = int_3;
	}

	public static void method649(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1) {
		KitDefinition.identKit_ref = indexdatabase_0;
		KitDefinition.anIndexDataBase17 = indexdatabase_1;
		KitDefinition.anInt465 = KitDefinition.identKit_ref.fileCount(3);
	}

	static String method650(final int int_0) {
		return "<img=" + int_0 + ">";
	}

	static int method651(final int int_0, final Script script_0, final boolean bool_0) {
		final Widget widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
		if (int_0 == 2600) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.scrollX;
			return 1;
		} else if (int_0 == 2601) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.scrollY;
			return 1;
		} else if (int_0 == 2602) {
			Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = widget_0.text;
			return 1;
		} else if (int_0 == 2603) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.scrollWidth;
			return 1;
		} else if (int_0 == 2604) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.scrollHeight;
			return 1;
		} else if (int_0 == 2605) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.modelZoom;
			return 1;
		} else if (int_0 == 2606) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.rotationX;
			return 1;
		} else if (int_0 == 2607) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.rotationY;
			return 1;
		} else if (int_0 == 2608) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.rotationZ;
			return 1;
		} else if (int_0 == 2609) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.opacity;
			return 1;
		} else if (int_0 == 2610) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.anInt308;
			return 1;
		} else if (int_0 == 2611) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.textColor;
			return 1;
		} else if (int_0 == 2612) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.anInt303;
			return 1;
		} else if (int_0 == 2613) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = widget_0.anEnum9_1.rsOrdinal();
			return 1;
		} else {
			return 2;
		}
	}

	static final void method652() {
		Client.secretPacketBuffer1.putOpcode(44);
		Client.secretPacketBuffer1.putByte(0);
	}

	static int method653(final World world_0, final World world_1, final int int_0, final boolean bool_0) {
		if (int_0 == 1) {
			int int_1 = world_0.playerCount;
			int int_2 = world_1.playerCount;
			if (!bool_0) {
				if (int_1 == -1) {
					int_1 = 2001;
				}

				if (int_2 == -1) {
					int_2 = 2001;
				}
			}

			return int_1 - int_2;
		} else {
			return int_0 == 2 ? world_0.location - world_1.location
					: (int_0 == 3
							? (world_0.activity.equals("-") ? (world_1.activity.equals("-") ? 0 : (bool_0 ? -1 : 1))
									: (world_1.activity.equals("-") ? (bool_0 ? 1 : -1)
											: world_0.activity.compareTo(world_1.activity)))
							: (int_0 == 4
									? (world_0.method523() ? (world_1.method523() ? 0 : 1)
											: (world_1.method523() ? -1 : 0))
									: (int_0 == 5
											? (world_0.method524() ? (world_1.method524() ? 0 : 1)
													: (world_1.method524() ? -1 : 0))
											: (int_0 == 6
													? (world_0.method522() ? (world_1.method522() ? 0 : 1)
															: (world_1.method522() ? -1 : 0))
													: (int_0 == 7
															? (world_0.method519() ? (world_1.method519() ? 0 : 1)
																	: (world_1.method519() ? -1 : 0))
															: world_0.anInt227 - world_1.anInt227)))));
		}
	}

}
