public class NPCComposition extends CacheableNode {

	public static NodeCache npcModelCache;
	public static NodeCache npcs;
	public static IndexDataBase anIndexDataBase28;
	Class70 aClass70_5;
	int varpIndex;
	public int[] configs;
	public String name;
	int varp32Index;
	int[] anIntArray105;
	public int anInt517;
	int[] models;
	public int anInt518;
	public int anInt519;
	public int anInt520;
	public int anInt521;
	public int anInt522;
	public String[] actions;
	int anInt523;
	short[] colors;
	public boolean isMinimapVisible;
	int anInt524;
	short[] aShortArray9;
	public int anInt525;
	short[] modifiedColors;
	short[] aShortArray10;
	public int anInt526;
	public int combatLevel;
	public boolean isVisible;
	public int anInt527;
	int anInt528;
	int anInt529;
	public int anInt530;
	public int anInt531;
	public boolean aBool58;
	public boolean isClickable;
	public boolean aBool59;

	static {
		npcs = new NodeCache(64);
		npcModelCache = new NodeCache(50);
	}

	NPCComposition() {
		name = "null";
		anInt518 = 1;
		anInt519 = -1;
		anInt521 = -1;
		anInt522 = -1;
		anInt520 = -1;
		anInt525 = -1;
		anInt526 = -1;
		anInt527 = -1;
		actions = new String[5];
		isMinimapVisible = true;
		combatLevel = -1;
		anInt523 = 128;
		anInt524 = 128;
		isVisible = false;
		anInt528 = 0;
		anInt529 = 0;
		anInt530 = -1;
		anInt531 = 32;
		varpIndex = -1;
		varp32Index = -1;
		aBool58 = true;
		isClickable = true;
		aBool59 = false;
	}

	public final NPCComposition transform() {
		int int_0 = -1;
		if (varpIndex != -1) {
			int_0 = Class38.method254(varpIndex);
		} else if (varp32Index != -1) {
			int_0 = Class86.widgetSettings[varp32Index];
		}

		int int_1;
		if ((int_0 >= 0) && (int_0 < (configs.length - 1))) {
			int_1 = configs[int_0];
		} else {
			int_1 = configs[configs.length - 1];
		}

		return int_1 != -1 ? Class81.getNpcDefinition(int_1) : null;
	}

	void method834(final Buffer buffer_0, final int int_0) {
		int int_1;
		int int_2;
		if (int_0 == 1) {
			int_1 = buffer_0.readUnsignedByte();
			models = new int[int_1];

			for (int_2 = 0; int_2 < int_1; int_2++) {
				models[int_2] = buffer_0.readUnsignedShort();
			}

		} else {
			if (int_0 == 2) {
				name = buffer_0.readString();
			} else {
				if (int_0 == 12) {
					anInt518 = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 13) {
					anInt519 = buffer_0.readUnsignedShort();
					return;
				}

				if (int_0 == 14) {
					anInt520 = buffer_0.readUnsignedShort();
					return;
				}

				if (int_0 == 15) {
					anInt521 = buffer_0.readUnsignedShort();
					return;
				}

				if (int_0 == 16) {
					anInt522 = buffer_0.readUnsignedShort();
					return;
				}

				if (int_0 == 17) {
					anInt520 = buffer_0.readUnsignedShort();
					anInt525 = buffer_0.readUnsignedShort();
					anInt526 = buffer_0.readUnsignedShort();
					anInt527 = buffer_0.readUnsignedShort();
					return;
				}

				if ((int_0 >= 30) && (int_0 < 35)) {
					actions[int_0 - 30] = buffer_0.readString();
					if (actions[int_0 - 30].equalsIgnoreCase("Hidden")) {
						actions[int_0 - 30] = null;
						return;
					}
				} else {
					if (int_0 == 40) {
						int_1 = buffer_0.readUnsignedByte();
						colors = new short[int_1];
						modifiedColors = new short[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							colors[int_2] = (short) buffer_0.readUnsignedShort();
							modifiedColors[int_2] = (short) buffer_0.readUnsignedShort();
						}

						return;
					}

					if (int_0 == 41) {
						int_1 = buffer_0.readUnsignedByte();
						aShortArray9 = new short[int_1];
						aShortArray10 = new short[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							aShortArray9[int_2] = (short) buffer_0.readUnsignedShort();
							aShortArray10[int_2] = (short) buffer_0.readUnsignedShort();
						}

						return;
					}

					if (int_0 == 60) {
						int_1 = buffer_0.readUnsignedByte();
						anIntArray105 = new int[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							anIntArray105[int_2] = buffer_0.readUnsignedShort();
						}

						return;
					}

					if (int_0 == 93) {
						isMinimapVisible = false;
						return;
					}

					if (int_0 == 95) {
						combatLevel = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 97) {
						anInt523 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 98) {
						anInt524 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 99) {
						isVisible = true;
						return;
					}

					if (int_0 == 100) {
						anInt528 = buffer_0.readByte();
						return;
					}

					if (int_0 == 101) {
						anInt529 = buffer_0.readByte() * 5;
						return;
					}

					if (int_0 == 102) {
						anInt530 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 103) {
						anInt531 = buffer_0.readUnsignedShort();
						return;
					}

					if ((int_0 == 106) || (int_0 == 118)) {
						varpIndex = buffer_0.readUnsignedShort();
						if (varpIndex == 65535) {
							varpIndex = -1;
						}

						varp32Index = buffer_0.readUnsignedShort();
						if (varp32Index == 65535) {
							varp32Index = -1;
						}

						int_1 = -1;
						if (int_0 == 118) {
							int_1 = buffer_0.readUnsignedShort();
							if (int_1 == 65535) {
								int_1 = -1;
							}
						}

						int_2 = buffer_0.readUnsignedByte();
						configs = new int[int_2 + 2];

						for (int int_3 = 0; int_3 <= int_2; int_3++) {
							configs[int_3] = buffer_0.readUnsignedShort();
							if (configs[int_3] == 65535) {
								configs[int_3] = -1;
							}
						}

						configs[int_2 + 1] = int_1;
						return;
					}

					if (int_0 == 107) {
						aBool58 = false;
						return;
					}

					if (int_0 == 109) {
						isClickable = false;
						return;
					}

					if (int_0 == 111) {
						aBool59 = true;
						return;
					}

					if (int_0 == 249) {
						aClass70_5 = World.method526(buffer_0, aClass70_5);
						return;
					}
				}
			}

		}
	}

	public final ModelData method835() {
		if (configs != null) {
			final NPCComposition npccomposition_1 = transform();
			return npccomposition_1 == null ? null : npccomposition_1.method835();
		} else if (anIntArray105 == null) {
			return null;
		} else {
			boolean bool_0 = false;

			for (int int_0 = 0; int_0 < anIntArray105.length; int_0++) {
				if (!Class76.anIndexDataBase5.method431(anIntArray105[int_0], 0)) {
					bool_0 = true;
				}
			}

			if (bool_0) {
				return null;
			} else {
				final ModelData[] modeldatas_0 = new ModelData[anIntArray105.length];

				for (int int_1 = 0; int_1 < anIntArray105.length; int_1++) {
					modeldatas_0[int_1] = ModelData.method995(Class76.anIndexDataBase5, anIntArray105[int_1], 0);
				}

				ModelData modeldata_0;
				if (modeldatas_0.length == 1) {
					modeldata_0 = modeldatas_0[0];
				} else {
					modeldata_0 = new ModelData(modeldatas_0, modeldatas_0.length);
				}

				int int_2;
				if (colors != null) {
					for (int_2 = 0; int_2 < colors.length; int_2++) {
						modeldata_0.recolor(colors[int_2], modifiedColors[int_2]);
					}
				}

				if (aShortArray9 != null) {
					for (int_2 = 0; int_2 < aShortArray9.length; int_2++) {
						modeldata_0.method985(aShortArray9[int_2], aShortArray10[int_2]);
					}
				}

				return modeldata_0;
			}
		}
	}

	public final Model method836(final Sequence sequence_0, final int int_0, final Sequence sequence_1,
			final int int_1) {
		if (configs != null) {
			final NPCComposition npccomposition_1 = transform();
			return npccomposition_1 == null ? null : npccomposition_1.method836(sequence_0, int_0, sequence_1, int_1);
		} else {
			Model model_0 = (Model) npcModelCache.get(anInt517);
			if (model_0 == null) {
				boolean bool_0 = false;

				for (int int_2 = 0; int_2 < models.length; int_2++) {
					if (!Class76.anIndexDataBase5.method431(models[int_2], 0)) {
						bool_0 = true;
					}
				}

				if (bool_0) {
					return null;
				}

				final ModelData[] modeldatas_0 = new ModelData[models.length];

				int int_3;
				for (int_3 = 0; int_3 < models.length; int_3++) {
					modeldatas_0[int_3] = ModelData.method995(Class76.anIndexDataBase5, models[int_3], 0);
				}

				ModelData modeldata_0;
				if (modeldatas_0.length == 1) {
					modeldata_0 = modeldatas_0[0];
				} else {
					modeldata_0 = new ModelData(modeldatas_0, modeldatas_0.length);
				}

				if (colors != null) {
					for (int_3 = 0; int_3 < colors.length; int_3++) {
						modeldata_0.recolor(colors[int_3], modifiedColors[int_3]);
					}
				}

				if (aShortArray9 != null) {
					for (int_3 = 0; int_3 < aShortArray9.length; int_3++) {
						modeldata_0.method985(aShortArray9[int_3], aShortArray10[int_3]);
					}
				}

				model_0 = modeldata_0.light(anInt528 + 64, anInt529 + 850, -30, -50, -30);
				npcModelCache.put(model_0, anInt517);
			}

			Model model_1;
			if ((sequence_0 != null) && (sequence_1 != null)) {
				model_1 = sequence_0.method848(model_0, int_0, sequence_1, int_1);
			} else if (sequence_0 != null) {
				model_1 = sequence_0.method847(model_0, int_0);
			} else if (sequence_1 != null) {
				model_1 = sequence_1.method847(model_0, int_1);
			} else {
				model_1 = model_0.method948(true);
			}

			if ((anInt523 != 128) || (anInt524 != 128)) {
				model_1.method955(anInt523, anInt524, anInt523);
			}

			return model_1;
		}
	}

	void post() {
	}

	void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method834(buffer_0, int_0);
		}
	}

	public boolean method837() {
		if (configs == null) {
			return true;
		} else {
			int int_0 = -1;
			if (varpIndex != -1) {
				int_0 = Class38.method254(varpIndex);
			} else if (varp32Index != -1) {
				int_0 = Class86.widgetSettings[varp32Index];
			}

			return (int_0 >= 0) && (int_0 < configs.length) ? configs[int_0] != -1 : configs[configs.length - 1] != -1;
		}
	}

	public int method838(final int int_0, final int int_1) {
		return Timer.method558(aClass70_5, int_0, int_1);
	}

	public String method839(final int int_0, final String string_0) {
		return IndexFile.method70(aClass70_5, int_0, string_0);
	}

}
