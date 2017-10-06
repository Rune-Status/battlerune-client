public class MessageNode extends CacheableNode {

	int anInt538;
	int tick;
	int type;
	String name;
	String sender;
	String value;

	MessageNode(final int int_0, final String string_0, final String string_1, final String string_2) {
		anInt538 = NPC.method1001();
		tick = Client.gameCycle;
		type = int_0;
		name = string_0;
		sender = string_1;
		value = string_2;
	}

	void method879(final int int_0, final String string_0, final String string_1, final String string_2) {
		anInt538 = NPC.method1001();
		tick = Client.gameCycle;
		type = int_0;
		name = string_0;
		sender = string_1;
		value = string_2;
	}

	static int method880(final int int_0, final Script script_0, final boolean bool_0) {
		if (int_0 == 6500) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Class80.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World world_0;
			if (int_0 == 6501) {
				world_0 = WorldMapType1.method551();
				if (world_0 != null) {
					Class45.intStack[++WorldMapType2.intStackSize - 1] = world_0.anInt227;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = world_0.mask;
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = world_0.activity;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = world_0.location;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = world_0.playerCount;
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = world_0.address;
				} else {
					Class45.intStack[++WorldMapType2.intStackSize - 1] = -1;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
					Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
				}

				return 1;
			} else if (int_0 == 6502) {
				if (World.anInt226 < World.worldCount) {
					world_0 = World.worldList[++World.anInt226 - 1];
				} else {
					world_0 = null;
				}

				if (world_0 != null) {
					Class45.intStack[++WorldMapType2.intStackSize - 1] = world_0.anInt227;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = world_0.mask;
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = world_0.activity;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = world_0.location;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = world_0.playerCount;
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = world_0.address;
				} else {
					Class45.intStack[++WorldMapType2.intStackSize - 1] = -1;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
					Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
					Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
				}

				return 1;
			} else {
				World world_1;
				int int_1;
				int int_2;
				if (int_0 == 6506) {
					int_1 = Class45.intStack[--WorldMapType2.intStackSize];
					world_1 = null;

					for (int_2 = 0; int_2 < World.worldCount; int_2++) {
						if (int_1 == World.worldList[int_2].anInt227) {
							world_1 = World.worldList[int_2];
							break;
						}
					}

					if (world_1 != null) {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = world_1.anInt227;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = world_1.mask;
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = world_1.activity;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = world_1.location;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = world_1.playerCount;
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = world_1.address;
					} else {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = -1;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
						Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
					}

					return 1;
				} else if (int_0 == 6507) {
					WorldMapType2.intStackSize -= 4;
					int_1 = Class45.intStack[WorldMapType2.intStackSize];
					final boolean bool_2 = Class45.intStack[WorldMapType2.intStackSize + 1] == 1;
					int_2 = Class45.intStack[WorldMapType2.intStackSize + 2];
					final boolean bool_1 = Class45.intStack[WorldMapType2.intStackSize + 3] == 1;
					if (World.worldList != null) {
						GroundObject.method539(0, World.worldList.length - 1, int_1, bool_2, int_2, bool_1);
					}

					return 1;
				} else if (int_0 != 6511) {
					if (int_0 == 6512) {
						Client.aBool90 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
						return 1;
					} else {
						int int_3;
						CacheableNode_Sub4 cacheablenode_sub4_0;
						if (int_0 == 6513) {
							WorldMapType2.intStackSize -= 2;
							int_1 = Class45.intStack[WorldMapType2.intStackSize];
							int_3 = Class45.intStack[WorldMapType2.intStackSize + 1];
							cacheablenode_sub4_0 = Enum5.method656(int_3);
							if (cacheablenode_sub4_0.method825()) {
								Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = Class81
										.getNpcDefinition(int_1).method839(int_3, cacheablenode_sub4_0.aString30);
							} else {
								Class45.intStack[++WorldMapType2.intStackSize - 1] = Class81.getNpcDefinition(int_1)
										.method838(int_3, cacheablenode_sub4_0.anInt516);
							}

							return 1;
						} else if (int_0 == 6514) {
							WorldMapType2.intStackSize -= 2;
							int_1 = Class45.intStack[WorldMapType2.intStackSize];
							int_3 = Class45.intStack[WorldMapType2.intStackSize + 1];
							cacheablenode_sub4_0 = Enum5.method656(int_3);
							if (cacheablenode_sub4_0.method825()) {
								Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = PlayerComposition
										.getObjectDefinition(int_1).method803(int_3, cacheablenode_sub4_0.aString30);
							} else {
								Class45.intStack[++WorldMapType2.intStackSize - 1] = PlayerComposition
										.getObjectDefinition(int_1).method802(int_3, cacheablenode_sub4_0.anInt516);
							}

							return 1;
						} else if (int_0 == 6515) {
							WorldMapType2.intStackSize -= 2;
							int_1 = Class45.intStack[WorldMapType2.intStackSize];
							int_3 = Class45.intStack[WorldMapType2.intStackSize + 1];
							cacheablenode_sub4_0 = Enum5.method656(int_3);
							if (cacheablenode_sub4_0.method825()) {
								Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = Class45
										.getItemDefinition(int_1).method877(int_3, cacheablenode_sub4_0.aString30);
							} else {
								Class45.intStack[++WorldMapType2.intStackSize - 1] = Class45.getItemDefinition(int_1)
										.method876(int_3, cacheablenode_sub4_0.anInt516);
							}

							return 1;
						} else if (int_0 == 6516) {
							WorldMapType2.intStackSize -= 2;
							int_1 = Class45.intStack[WorldMapType2.intStackSize];
							int_3 = Class45.intStack[WorldMapType2.intStackSize + 1];
							cacheablenode_sub4_0 = Enum5.method656(int_3);
							int int_4;
							CacheableNode_Sub2 cacheablenode_sub2_0;
							CacheableNode_Sub2 cacheablenode_sub2_1;
							byte[] bytes_0;
							if (cacheablenode_sub4_0.method825()) {
								final String[] strings_0 = Class45.scriptStringStack;
								int_4 = ++BaseVarType.scriptStringStackSize - 1;
								cacheablenode_sub2_0 = (CacheableNode_Sub2) CacheableNode_Sub2.aNodeCache12.get(int_1);
								if (cacheablenode_sub2_0 != null) {
									cacheablenode_sub2_1 = cacheablenode_sub2_0;
								} else {
									bytes_0 = Class80.anIndexDataBase7.getConfigData(34, int_1);
									cacheablenode_sub2_0 = new CacheableNode_Sub2();
									if (bytes_0 != null) {
										cacheablenode_sub2_0.method813(new Buffer(bytes_0));
									}

									cacheablenode_sub2_0.method812();
									CacheableNode_Sub2.aNodeCache12.put(cacheablenode_sub2_0, int_1);
									cacheablenode_sub2_1 = cacheablenode_sub2_0;
								}

								strings_0[int_4] = cacheablenode_sub2_1.method811(int_3,
										cacheablenode_sub4_0.aString30);
							} else {
								final int[] ints_0 = Class45.intStack;
								int_4 = ++WorldMapType2.intStackSize - 1;
								cacheablenode_sub2_0 = (CacheableNode_Sub2) CacheableNode_Sub2.aNodeCache12.get(int_1);
								if (cacheablenode_sub2_0 != null) {
									cacheablenode_sub2_1 = cacheablenode_sub2_0;
								} else {
									bytes_0 = Class80.anIndexDataBase7.getConfigData(34, int_1);
									cacheablenode_sub2_0 = new CacheableNode_Sub2();
									if (bytes_0 != null) {
										cacheablenode_sub2_0.method813(new Buffer(bytes_0));
									}

									cacheablenode_sub2_0.method812();
									CacheableNode_Sub2.aNodeCache12.put(cacheablenode_sub2_0, int_1);
									cacheablenode_sub2_1 = cacheablenode_sub2_0;
								}

								ints_0[int_4] = cacheablenode_sub2_1.method810(int_3, cacheablenode_sub4_0.anInt516);
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					int_1 = Class45.intStack[--WorldMapType2.intStackSize];
					if ((int_1 >= 0) && (int_1 < World.worldCount)) {
						world_1 = World.worldList[int_1];
						Class45.intStack[++WorldMapType2.intStackSize - 1] = world_1.anInt227;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = world_1.mask;
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = world_1.activity;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = world_1.location;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = world_1.playerCount;
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = world_1.address;
					} else {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = -1;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
						Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
						Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

}
