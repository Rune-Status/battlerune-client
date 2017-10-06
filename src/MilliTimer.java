public class MilliTimer extends Timer {

	public static int anInt422;
	int anInt423;
	long[] aLongArray1;
	int sleepTime;
	int anInt424;
	long milliTime;
	int anInt425;

	public MilliTimer() {
		aLongArray1 = new long[10];
		anInt423 = 256;
		sleepTime = 1;
		anInt424 = 0;
		milliTime = Class6.currentTimeMs();

		for (int int_0 = 0; int_0 < 10; int_0++) {
			aLongArray1[int_0] = milliTime;
		}

	}

	@Override
	public int method556(final int int_0, final int int_1) {
		final int int_2 = anInt423;
		final int int_3 = sleepTime;
		anInt423 = 300;
		sleepTime = 1;
		milliTime = Class6.currentTimeMs();
		if (aLongArray1[anInt425] == 0L) {
			anInt423 = int_2;
			sleepTime = int_3;
		} else if (milliTime > aLongArray1[anInt425]) {
			anInt423 = (int) (int_0 * 2560 / (milliTime - aLongArray1[anInt425]));
		}

		if (anInt423 < 25) {
			anInt423 = 25;
		}

		if (anInt423 > 256) {
			anInt423 = 256;
			sleepTime = (int) (int_0 - ((milliTime - aLongArray1[anInt425]) / 10L));
		}

		if (sleepTime > int_0) {
			sleepTime = int_0;
		}

		aLongArray1[anInt425] = milliTime;
		anInt425 = (anInt425 + 1) % 10;
		int int_4;
		if (sleepTime > 1) {
			for (int_4 = 0; int_4 < 10; int_4++) {
				if (aLongArray1[int_4] != 0L) {
					aLongArray1[int_4] += sleepTime;
				}
			}
		}

		if (sleepTime < int_1) {
			sleepTime = int_1;
		}

		Class14.method189(sleepTime);

		for (int_4 = 0; anInt424 < 256; anInt424 += anInt423) {
			++int_4;
		}

		anInt424 &= 0xFF;
		return int_4;
	}

	@Override
	public void method557() {
		for (int int_0 = 0; int_0 < 10; int_0++) {
			aLongArray1[int_0] = 0L;
		}

	}

	static final void method687() {
		Overlay.overlays.reset();
		FloorUnderlayDefinition.underlays.reset();
		KitDefinition.identKits.reset();
		ObjectComposition.objects.reset();
		ObjectComposition.aNodeCache10.reset();
		ObjectComposition.cachedModels.reset();
		ObjectComposition.aNodeCache9.reset();
		NPCComposition.npcs.reset();
		NPCComposition.npcModelCache.reset();
		ItemComposition.items.reset();
		ItemComposition.itemModelCache.reset();
		ItemComposition.itemSpriteCache.reset();
		Sequence.sequences.reset();
		Sequence.skeletons.reset();
		Spotanim.spotanims.reset();
		Spotanim.aNodeCache6.reset();
		Varcs.method505();
		Class32.method233();
		CacheableNode_Sub3.aNodeCache13.reset();
		CacheableNode_Sub3.aNodeCache15.reset();
		CacheableNode_Sub3.aNodeCache14.reset();
		method689();
		Class75.method445();
		Preferences.method401();
		Area.skeletonsIndex.reset();
		PlayerComposition.aNodeCache1.reset();
		GZipDecompressor.method552();
		((TextureProvider) Graphics3D.textureLoader).reset();
		Script.aNodeCache19.reset();
		Class12.indexInterfaces.reset();
		Client.indexSoundEffects.reset();
		BuildType.anIndexData3.reset();
		WorldMapType2.anIndexData4.reset();
		Class33.indexMaps.reset();
		Class68.indexTrack1.reset();
		Renderable.indexModels.reset();
		Class50.indexSprites.reset();
		Client.indexTextures.reset();
		Class17.anIndexData1.reset();
		AClass4_Sub1.indexTrack2.reset();
		Class99.indexScripts.reset();
	}

	public static boolean method688(final int int_0) {
		return ((int_0 >> 29) & 0x1) != 0;
	}

	public static void method689() {
		CombatInfo2.aNodeCache8.reset();
		CombatInfo2.spriteCache.reset();
	}

	static final void method690(final WidgetNode widgetnode_0, final boolean bool_0) {
		final int int_0 = widgetnode_0.anInt392;
		final int int_1 = (int) widgetnode_0.hash;
		widgetnode_0.unlink();
		if (bool_0 && (int_0 != -1) && Widget.validInterfaces[int_0]) {
			Class49.widgetIndex.method441(int_0);
			if (Widget.widgets[int_0] != null) {
				boolean bool_1 = true;

				for (int int_2 = 0; int_2 < Widget.widgets[int_0].length; int_2++) {
					if (Widget.widgets[int_0][int_2] != null) {
						if (Widget.widgets[int_0][int_2].type != 2) {
							Widget.widgets[int_0][int_2] = null;
						} else {
							bool_1 = false;
						}
					}
				}

				if (bool_1) {
					Widget.widgets[int_0] = null;
				}

				Widget.validInterfaces[int_0] = false;
			}
		}

		WorldMapData.method303(int_0);
		final Widget widget_0 = Class18.method202(int_1);
		if (widget_0 != null) {
			Class15.method196(widget_0);
		}

		Class5.method90();
		if (Client.widgetRoot != -1) {
			Class12.method170(Client.widgetRoot, 1);
		}

	}

	static boolean isIgnored(final String string_0) {
		if (string_0 == null) {
			return false;
		} else {
			final String string_1 = Class75.method446(string_0, Class59.aClass110_1);

			for (int int_0 = 0; int_0 < Client.ignoreCount; int_0++) {
				final Ignore ignore_0 = Client.ignores[int_0];
				if (string_1.equalsIgnoreCase(Class75.method446(ignore_0.name, Class59.aClass110_1))) {
					return true;
				}

				if (string_1.equalsIgnoreCase(Class75.method446(ignore_0.previousName, Class59.aClass110_1))) {
					return true;
				}
			}

			return false;
		}
	}

	public static final SpritePixels createSprite(final int int_0, final int int_1, final int int_2, final int int_3,
			int int_4, final boolean bool_0) {
		if (int_1 == -1) {
			int_4 = 0;
		} else if ((int_4 == 2) && (int_1 != 1)) {
			int_4 = 1;
		}

		final long long_0 = ((long) int_4 << 40) + ((long) int_2 << 38) + int_0 + ((long) int_1 << 16)
				+ ((long) int_3 << 42);
		SpritePixels spritepixels_0;
		if (!bool_0) {
			spritepixels_0 = (SpritePixels) ItemComposition.itemSpriteCache.get(long_0);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			}
		}

		ItemComposition itemcomposition_0 = Class45.getItemDefinition(int_0);
		if ((int_1 > 1) && (itemcomposition_0.countObj != null)) {
			int int_5 = -1;

			for (int int_6 = 0; int_6 < 10; int_6++) {
				if ((int_1 >= itemcomposition_0.countCo[int_6]) && (itemcomposition_0.countCo[int_6] != 0)) {
					int_5 = itemcomposition_0.countObj[int_6];
				}
			}

			if (int_5 != -1) {
				itemcomposition_0 = Class45.getItemDefinition(int_5);
			}
		}

		final Model model_0 = itemcomposition_0.getModel(1);
		if (model_0 == null) {
			return null;
		} else {
			SpritePixels spritepixels_1 = null;
			if (itemcomposition_0.notedTemplate != -1) {
				spritepixels_1 = createSprite(itemcomposition_0.note, 10, 1, 0, 0, true);
				if (spritepixels_1 == null) {
					return null;
				}
			} else if (itemcomposition_0.notedId != -1) {
				spritepixels_1 = createSprite(itemcomposition_0.unnotedId, int_1, int_2, int_3, 0, false);
				if (spritepixels_1 == null) {
					return null;
				}
			} else if (itemcomposition_0.anInt535 != -1) {
				spritepixels_1 = createSprite(itemcomposition_0.anInt536, int_1, 0, 0, 0, false);
				if (spritepixels_1 == null) {
					return null;
				}
			}

			final int[] ints_0 = Rasterizer2D.graphicsPixels;
			final int int_7 = Rasterizer2D.graphicsPixelsWidth;
			final int int_8 = Rasterizer2D.graphicsPixelsHeight;
			final int[] ints_1 = new int[4];
			Rasterizer2D.copyDrawRegion(ints_1);
			spritepixels_0 = new SpritePixels(36, 32);
			Rasterizer2D.setRasterBuffer(spritepixels_0.image, 36, 32);
			Rasterizer2D.reset();
			Graphics3D.method898();
			Graphics3D.method908(16, 16);
			Graphics3D.rasterGouraudLowRes = false;
			if (itemcomposition_0.anInt535 != -1) {
				spritepixels_1.method916(0, 0);
			}

			int int_9 = itemcomposition_0.zoom2d;
			if (bool_0) {
				int_9 = (int) (int_9 * 1.5D);
			} else if (int_2 == 2) {
				int_9 = (int) (1.04D * int_9);
			}

			final int int_10 = (int_9 * Graphics3D.SINE[itemcomposition_0.xan2d]) >> 16;
			final int int_11 = (int_9 * Graphics3D.COSINE[itemcomposition_0.xan2d]) >> 16;
			model_0.method942();
			model_0.method962(0, itemcomposition_0.yan2d, itemcomposition_0.zan2d, itemcomposition_0.xan2d,
					itemcomposition_0.offsetX2d, int_10 + (model_0.modelHeight / 2) + itemcomposition_0.offsetY2d,
					int_11 + itemcomposition_0.offsetY2d);
			if (itemcomposition_0.notedId != -1) {
				spritepixels_1.method916(0, 0);
			}

			if (int_2 >= 1) {
				spritepixels_0.method920(1);
			}

			if (int_2 >= 2) {
				spritepixels_0.method920(16777215);
			}

			if (int_3 != 0) {
				spritepixels_0.method921(int_3);
			}

			Rasterizer2D.setRasterBuffer(spritepixels_0.image, 36, 32);
			if (itemcomposition_0.notedTemplate != -1) {
				spritepixels_1.method916(0, 0);
			}

			if ((int_4 == 1) || ((int_4 == 2) && (itemcomposition_0.isStackable == 1))) {
				final Font font_0 = ItemComposition.aFont5;
				String string_0;
				if (int_1 < 100000) {
					string_0 = "<col=ffff00>" + int_1 + "</col>";
				} else if (int_1 < 10000000) {
					string_0 = "<col=ffffff>" + (int_1 / 1000) + "K" + "</col>";
				} else {
					string_0 = "<col=00ff80>" + (int_1 / 1000000) + "M" + "</col>";
				}

				font_0.method975(string_0, 0, 9, 16776960, 1);
			}

			if (!bool_0) {
				ItemComposition.itemSpriteCache.put(spritepixels_0, long_0);
			}

			Rasterizer2D.setRasterBuffer(ints_0, int_7, int_8);
			Rasterizer2D.setDrawRegion(ints_1);
			Graphics3D.method898();
			Graphics3D.rasterGouraudLowRes = true;
			return spritepixels_0;
		}
	}

}
