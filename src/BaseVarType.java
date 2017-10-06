public enum BaseVarType implements RSEnum {

	INTEGER(2, 0, Integer.class, new Class41()), LONG(1, 1, Long.class, new Class44()), STRING(0, 2, String.class,
			new Class31());

	static int scriptStringStackSize;
	final int anInt347;
	final int anInt348;
	static Task socket;
	static int anInt349;

	BaseVarType(final int int_1, final int int_2, final Class class_0, final Interface1 interface1_0) {
		anInt347 = int_1;
		anInt348 = int_2;
	}

	@Override
	public int rsOrdinal() {
		return anInt348;
	}

	static void load() {
		int int_0;

		if (Client.loadingStage == 0) {
			Class8.region = new Region(4, 104, 104, Class18.tileHeights);

			for (int_0 = 0; int_0 < 4; int_0++) {
				Client.collisionMaps[int_0] = new CollisionData(104, 104);
			}

			Enum4.aSpritePixels3 = new SpritePixels(512, 512);
			Class26.loadingText = "Starting game engine...";
			Class26.loadingBarPercentage = 5;
			Client.loadingStage = 20;
		} else {
			int int_1;
			int int_2;
			int int_3;
			int int_4;
			if (Client.loadingStage == 20) {
				final int[] ints_0 = new int[9];

				for (int_1 = 0; int_1 < 9; int_1++) {
					int_2 = (int_1 * 32) + 128 + 15;
					int_3 = (int_2 * 3) + 600;
					int_4 = Graphics3D.SINE[int_2];
					ints_0[int_1] = (int_3 * int_4) >> 16;
				}

				Region.method376(ints_0, 500, 800, 512, 334);
				Class26.loadingText = "Prepared visibility map";
				Class26.loadingBarPercentage = 10;
				Client.loadingStage = 30;
			} else if (Client.loadingStage == 30) {
				Class12.indexInterfaces = Huffman.openCacheIndex(0, false, true, true);
				Client.indexSoundEffects = Huffman.openCacheIndex(1, false, true, true);
				Tile.configsIndex = Huffman.openCacheIndex(2, true, false, true);
				BuildType.anIndexData3 = Huffman.openCacheIndex(3, false, true, true);
				WorldMapType2.anIndexData4 = Huffman.openCacheIndex(4, false, true, true);
				Class33.indexMaps = Huffman.openCacheIndex(5, true, true, true);
				Class68.indexTrack1 = Huffman.openCacheIndex(6, true, true, false);
				Renderable.indexModels = Huffman.openCacheIndex(7, false, true, true);
				Class50.indexSprites = Huffman.openCacheIndex(8, false, true, true);
				Client.indexTextures = Huffman.openCacheIndex(9, false, true, true);
				Class17.anIndexData1 = Huffman.openCacheIndex(10, false, true, true);
				AClass4_Sub1.indexTrack2 = Huffman.openCacheIndex(11, false, true, true);
				Class99.indexScripts = Huffman.openCacheIndex(12, false, true, true);
				Player.anIndexData5 = Huffman.openCacheIndex(13, true, false, true);
				Class21.vorbisIndex = Huffman.openCacheIndex(14, false, true, false);
				Class19.anIndexData2 = Huffman.openCacheIndex(15, false, true, true);
				Class44.indexWorldMap = Huffman.openCacheIndex(16, false, true, false);
				Class26.loadingText = "Connecting to update server";
				Class26.loadingBarPercentage = 20;
				Client.loadingStage = 40;
			} else if (Client.loadingStage == 40) {
				final byte byte_0 = 0;
				int_0 = byte_0 + ((Class12.indexInterfaces.percentage() * 4) / 100);
				int_0 += (Client.indexSoundEffects.percentage() * 4) / 100;
				int_0 += (Tile.configsIndex.percentage() * 2) / 100;
				int_0 += (BuildType.anIndexData3.percentage() * 2) / 100;
				int_0 += (WorldMapType2.anIndexData4.percentage() * 6) / 100;
				int_0 += (Class33.indexMaps.percentage() * 4) / 100;
				int_0 += (Class68.indexTrack1.percentage() * 2) / 100;
				int_0 += (Renderable.indexModels.percentage() * 58) / 100;
				int_0 += (Class50.indexSprites.percentage() * 2) / 100;
				int_0 += (Client.indexTextures.percentage() * 2) / 100;
				int_0 += (Class17.anIndexData1.percentage() * 2) / 100;
				int_0 += (AClass4_Sub1.indexTrack2.percentage() * 2) / 100;
				int_0 += (Class99.indexScripts.percentage() * 2) / 100;
				int_0 += (Player.anIndexData5.percentage() * 2) / 100;
				int_0 += (Class21.vorbisIndex.percentage() * 2) / 100;
				int_0 += (Class19.anIndexData2.percentage() * 2) / 100;
				int_0 += (Class44.indexWorldMap.percentage() * 2) / 100;
				if (int_0 != 100) {
					if (int_0 != 0) {
						Class26.loadingText = "Checking for updates - " + int_0 + "%";
					}

					Class26.loadingBarPercentage = 30;
				} else {
					Class26.loadingText = "Loaded update list";
					Class26.loadingBarPercentage = 30;
					Client.loadingStage = 45;
				}
			} else {
				IndexData indexdata_0;
				IndexData indexdata_2;
				if (Client.loadingStage == 45) {
					final boolean bool_1 = !Client.lowMemory;
					ChatLineBuffer.sampleRate = 22050;
					AbstractSoundSystem.highMemory = bool_1;
					Class49.priority = 2;
					final AClass5_Sub3 aclass5_sub3_0 = new AClass5_Sub3();
					aclass5_sub3_0.method790(9, 128);
					AClass3.soundSystem0 = TextureProvider.method542(GameEngine.taskManager, 0, 22050);
					AClass3.soundSystem0.method339(aclass5_sub3_0);
					indexdata_0 = Class19.anIndexData2;
					final IndexData indexdata_1 = Class21.vorbisIndex;
					indexdata_2 = WorldMapType2.anIndexData4;
					Class76.anIndexDataBase6 = indexdata_0;
					Class96.anIndexDataBase9 = indexdata_1;
					Class76.anIndexDataBase4 = indexdata_2;
					Class76.anAClass5_Sub3_1 = aclass5_sub3_0;
					KeyFocusListener.soundSystem1 = TextureProvider.method542(GameEngine.taskManager, 1, 2048);
					Class76.anAClass5_Sub1_1 = new AClass5_Sub1();
					KeyFocusListener.soundSystem1.method339(Class76.anAClass5_Sub1_1);
					Overlay.aClass53_1 = new Class53(22050, ChatLineBuffer.sampleRate);
					Class26.loadingText = "Prepared sound engine";
					Class26.loadingBarPercentage = 35;
					Client.loadingStage = 50;
					CombatInfoListHolder.aClass107_1 = new Class107(Class50.indexSprites, Player.anIndexData5);
				} else if (Client.loadingStage == 50) {
					int_0 = Class101.method498().length;
					Client.aHashMap9 = CombatInfoListHolder.aClass107_1.method501(Class101.method498());
					if (Client.aHashMap9.size() < int_0) {
						Class26.loadingText = "Loading fonts - " + ((Client.aHashMap9.size() * 100) / int_0) + "%";
						Class26.loadingBarPercentage = 40;
					} else {
						Class82.aFont4 = (Font) Client.aHashMap9.get(Class101.aClass101_5);
						Class31.font_p12full = (Font) Client.aHashMap9.get(Class101.aClass101_8);
						Class36.aFont3 = (Font) Client.aHashMap9.get(Class101.aClass101_9);
						Class75.aMachineInfo1 = new MachineInfo(true);
						Class26.loadingText = "Loaded fonts";
						Class26.loadingBarPercentage = 40;
						Client.loadingStage = 60;
					}
				} else if (Client.loadingStage == 60) {
					int_0 = Class48.method279(Class17.anIndexData1, Class50.indexSprites);
					int_1 = WidgetNode.method646();
					if (int_0 < int_1) {
						Class26.loadingText = "Loading title screen - " + ((int_0 * 100) / int_1) + "%";
						Class26.loadingBarPercentage = 50;
					} else {
						Class26.loadingText = "Loaded title screen";
						Class26.loadingBarPercentage = 50;
						WorldMapType2.setGameState(5);
						Client.loadingStage = 70;
					}
				} else if (Client.loadingStage == 70) {
					if (!Tile.configsIndex.method439()) {
						Class26.loadingText = "Loading config - " + Tile.configsIndex.method595() + "%";
						Class26.loadingBarPercentage = 60;
					} else {
						FloorUnderlayDefinition.method840(Tile.configsIndex);
						final IndexData indexdata_19 = Tile.configsIndex;
						FloorUnderlayDefinition.underlay_ref = indexdata_19;
						CombatInfo1.method649(Tile.configsIndex, Renderable.indexModels);
						final IndexData indexdata_20 = Tile.configsIndex;
						indexdata_0 = Renderable.indexModels;
						final boolean bool_0 = Client.lowMemory;
						ObjectComposition.objects_ref = indexdata_20;
						ObjectComposition.anIndexDataBase21 = indexdata_0;
						ObjectComposition.aBool52 = bool_0;
						indexdata_2 = Tile.configsIndex;
						final IndexData indexdata_3 = Renderable.indexModels;
						NPCComposition.anIndexDataBase28 = indexdata_2;
						Class76.anIndexDataBase5 = indexdata_3;
						final IndexData indexdata_4 = Tile.configsIndex;
						Class80.anIndexDataBase7 = indexdata_4;
						Class14.method191(Tile.configsIndex, Renderable.indexModels, Client.isMembers, Class82.aFont4);
						Client.method1048(Tile.configsIndex, Class12.indexInterfaces, Client.indexSoundEffects);
						Class90.method472(Tile.configsIndex, Renderable.indexModels);
						final IndexData indexdata_5 = Tile.configsIndex;
						Varbit.varbit_ref = indexdata_5;
						Class66.method398(Tile.configsIndex);
						final IndexData indexdata_6 = BuildType.anIndexData3;
						final IndexData indexdata_7 = Renderable.indexModels;
						final IndexData indexdata_8 = Class50.indexSprites;
						final IndexData indexdata_9 = Player.anIndexData5;
						Class49.widgetIndex = indexdata_6;
						Class9.anIndexDataBase2 = indexdata_7;
						Class89.anIndexDataBase8 = indexdata_8;
						Class106.anIndexDataBase10 = indexdata_9;
						Widget.widgets = new Widget[Class49.widgetIndex.size()][];
						Widget.validInterfaces = new boolean[Class49.widgetIndex.size()];
						PendingSpawn.method636(Tile.configsIndex);
						final IndexData indexdata_10 = Tile.configsIndex;
						VarPlayerType.anIndexDataBase30 = indexdata_10;
						final IndexData indexdata_11 = Tile.configsIndex;
						CacheableNode_Sub5.anIndexDataBase26 = indexdata_11;
						final IndexData indexdata_12 = Tile.configsIndex;
						CacheableNode_Sub6.anIndexDataBase27 = indexdata_12;
						final IndexData indexdata_13 = Tile.configsIndex;
						CacheableNode_Sub4.anIndexDataBase25 = indexdata_13;
						Class6.chatMessages = new Varcs();
						final IndexData indexdata_14 = Tile.configsIndex;
						final IndexData indexdata_15 = Class50.indexSprites;
						final IndexData indexdata_16 = Player.anIndexData5;
						CacheableNode_Sub3.anIndexDataBase22 = indexdata_14;
						CacheableNode_Sub3.anIndexDataBase23 = indexdata_15;
						CacheableNode_Sub3.anIndexDataBase24 = indexdata_16;
						Occluder.method383(Tile.configsIndex, Class50.indexSprites);
						final IndexData indexdata_17 = Tile.configsIndex;
						final IndexData indexdata_18 = Class50.indexSprites;
						Area.anIndexDataBase19 = indexdata_18;
						if (indexdata_17.method439()) {
							Area.anInt467 = indexdata_17.fileCount(35);
							Class17.anAreaArray1 = new Area[Area.anInt467];

							for (int int_5 = 0; int_5 < Area.anInt467; int_5++) {
								final byte[] bytes_0 = indexdata_17.getConfigData(35, int_5);
								if (bytes_0 != null) {
									Class17.anAreaArray1[int_5] = new Area(int_5);
									Class17.anAreaArray1[int_5].method759(new Buffer(bytes_0));
									Class17.anAreaArray1[int_5].method760();
								}
							}
						}

						Class26.loadingText = "Loaded config";
						Class26.loadingBarPercentage = 60;
						Client.loadingStage = 80;
					}
				} else if (Client.loadingStage == 80) {
					int_0 = 0;
					SpritePixels spritepixels_0;
					if (Class47.compass == null) {
						indexdata_0 = Class50.indexSprites;
						int_3 = indexdata_0.getFile("compass");
						int_4 = indexdata_0.getChild(int_3, "");
						spritepixels_0 = Enum1.method577(indexdata_0, int_3, int_4);
						Class47.compass = spritepixels_0;
					} else {
						++int_0;
					}

					if (Class76.mapedge == null) {
						indexdata_0 = Class50.indexSprites;
						int_3 = indexdata_0.getFile("mapedge");
						int_4 = indexdata_0.getChild(int_3, "");
						spritepixels_0 = Enum1.method577(indexdata_0, int_3, int_4);
						Class76.mapedge = spritepixels_0;
					} else {
						++int_0;
					}

					if (GZipDecompressor.aModIconArray6 == null) {
						GZipDecompressor.aModIconArray6 = Class98.method494(Class50.indexSprites, "mapscene", "");
					} else {
						++int_0;
					}

					if (Class2.mapfunctions == null) {
						Class2.mapfunctions = WorldMapType1.method549(Class50.indexSprites, "headicons_pk", "");
					} else {
						++int_0;
					}

					if (XItemContainer.hitmarks == null) {
						XItemContainer.hitmarks = WorldMapType1.method549(Class50.indexSprites, "headicons_prayer", "");
					} else {
						++int_0;
					}

					if (Class28.pkIcons == null) {
						Class28.pkIcons = WorldMapType1.method549(Class50.indexSprites, "headicons_hint", "");
					} else {
						++int_0;
					}

					if (Class24.aSpritePixelsArray1 == null) {
						Class24.aSpritePixelsArray1 = WorldMapType1.method549(Class50.indexSprites, "mapmarker", "");
					} else {
						++int_0;
					}

					if (CombatInfoListHolder.aSpritePixelsArray3 == null) {
						CombatInfoListHolder.aSpritePixelsArray3 = WorldMapType1.method549(Class50.indexSprites,
								"cross", "");
					} else {
						++int_0;
					}

					if (AClass2.mapDots == null) {
						AClass2.mapDots = WorldMapType1.method549(Class50.indexSprites, "mapdots", "");
					} else {
						++int_0;
					}

					if (Class85.aModIconArray5 == null) {
						Class85.aModIconArray5 = Class98.method494(Class50.indexSprites, "scrollbar", "");
					} else {
						++int_0;
					}

					if (AClass5_Sub4.aModIconArray8 == null) {
						AClass5_Sub4.aModIconArray8 = Class98.method494(Class50.indexSprites, "mod_icons", "");
					} else {
						++int_0;
					}

					if (int_0 < 11) {
						Class26.loadingText = "Loading sprites - " + ((int_0 * 100) / 12) + "%";
						Class26.loadingBarPercentage = 70;
					} else {
						FontTypeFace.modIcons = AClass5_Sub4.aModIconArray8;
						Class76.mapedge.method922();
						int_1 = (int) (Math.random() * 21.0D) - 10;
						int_2 = (int) (Math.random() * 21.0D) - 10;
						int_3 = (int) (Math.random() * 21.0D) - 10;
						int_4 = (int) (Math.random() * 41.0D) - 20;
						GZipDecompressor.aModIconArray6[0].method888(int_1 + int_4, int_2 + int_4, int_4 + int_3);
						Class26.loadingText = "Loaded sprites";
						Class26.loadingBarPercentage = 70;
						Client.loadingStage = 90;
					}
				} else if (Client.loadingStage == 90) {
					if (!Client.indexTextures.method439()) {
						Class26.loadingText = "Loading textures - " + Client.indexTextures.method595() + "%";
						Class26.loadingBarPercentage = 90;
					} else {
						final TextureProvider textureprovider_0 = new TextureProvider(Client.indexTextures,
								Class50.indexSprites, 20, 0.8D, Client.lowMemory ? 64 : 128);
						Graphics3D.setTextureLoader(textureprovider_0);
						Graphics3D.setBrightness(0.8D);
						Class26.loadingText = "Loaded textures";
						Class26.loadingBarPercentage = 90;
						Client.loadingStage = 110;
					}
				} else if (Client.loadingStage == 110) {
					KeyFocusListener.aClass21_1 = new Class21();
					GameEngine.taskManager.createRunnable(KeyFocusListener.aClass21_1, 10);
					Class26.loadingText = "Loaded input handler";
					Class26.loadingBarPercentage = 94;
					Client.loadingStage = 120;
				} else if (Client.loadingStage == 120) {
					if (!Class17.anIndexData1.method432("huffman", "")) {
						Class26.loadingText = "Loading wordpack - " + 0 + "%";
						Class26.loadingBarPercentage = 96;
					} else {
						final Huffman huffman_0 = new Huffman(Class17.anIndexData1.method438("huffman", ""));
						Player.method1037(huffman_0);
						Class26.loadingText = "Loaded wordpack";
						Class26.loadingBarPercentage = 96;
						Client.loadingStage = 130;
					}
				} else if (Client.loadingStage == 130) {
					if (!BuildType.anIndexData3.method439()) {
						Class26.loadingText = "Loading interfaces - " + ((BuildType.anIndexData3.method595() * 4) / 5)
								+ "%";
						Class26.loadingBarPercentage = 100;
					} else if (!Class99.indexScripts.method439()) {
						Class26.loadingText = "Loading interfaces - " + (80 + (Class99.indexScripts.method595() / 6))
								+ "%";
						Class26.loadingBarPercentage = 100;
					} else if (!Player.anIndexData5.method439()) {
						Class26.loadingText = "Loading interfaces - " + (96 + (Player.anIndexData5.method595() / 50))
								+ "%";
						Class26.loadingBarPercentage = 100;
					} else {
						Class26.loadingText = "Loaded interfaces";
						Class26.loadingBarPercentage = 98;
						Client.loadingStage = 140;
					}
				} else if (Client.loadingStage == 140) {
					if (!Class44.indexWorldMap.method440(Class16.aClass16_1.aString2)) {
						Class26.loadingText = "Loading world map - "
								+ (Class44.indexWorldMap.method437(Class16.aClass16_1.aString2) / 10) + "%";
					} else {
						if (Class49.renderOverview == null) {
							Class49.renderOverview = new RenderOverview();
							Class49.renderOverview.method32(Class44.indexWorldMap, Class36.aFont3, Client.aHashMap9,
									GZipDecompressor.aModIconArray6);
						}

						int_0 = Class49.renderOverview.method31();
						if (int_0 < 100) {
							Class26.loadingText = "Loading world map - " + (((int_0 * 9) / 10) + 10) + "%";
						} else {
							Class26.loadingText = "Loaded world map";
							Class26.loadingBarPercentage = 100;
							Client.loadingStage = 150;
						}
					}
				} else if (Client.loadingStage == 150) {
					WorldMapType2.setGameState(10);
				}
			}
		}
	}

	static int method613(final int int_0, final int int_1) {
		final XItemContainer xitemcontainer_0 = (XItemContainer) XItemContainer.itemContainers.get(int_0);
		return xitemcontainer_0 == null ? -1
				: ((int_1 >= 0) && (int_1 < xitemcontainer_0.itemIds.length) ? xitemcontainer_0.itemIds[int_1] : -1);
	}

	static final void method614(final String string_0) {
		if (!string_0.equals("")) {
			Client.secretPacketBuffer1.putOpcode(44);
			Client.secretPacketBuffer1.putByte(DecorativeObject.getLength(string_0));
			Client.secretPacketBuffer1.putString(string_0);
		}
	}

}
