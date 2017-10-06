public class ItemComposition extends CacheableNode {

	public static NodeCache items;
	static IndexDataBase anIndexDataBase29;
	public static NodeCache itemModelCache;
	public static NodeCache itemSpriteCache;
	static boolean isMembersWorld;
	public static int anInt532;
	static Font aFont5;
	int maleHeadModel;
	int maleModel;
	int inventoryModel;
	int[] countObj;
	int team;
	Class70 aClass70_6;
	int maleHeadModel2;
	int maleModel1;
	int maleModel2;
	public String[] inventoryActions;
	public String name;
	int femaleHeadModel;
	public int zoom2d;
	public int anInt533;
	int femaleHeadModel2;
	int femaleModel;
	int[] countCo;
	int femaleModel1;
	int femaleModel2;
	public int xan2d;
	int resizeX;
	public int yan2d;
	public int offsetX2d;
	public int isStackable;
	int resizeY;
	public int offsetY2d;
	public int zan2d;
	public boolean isMembers;
	public int price;
	int resizeZ;
	short[] colourToReplace;
	int maleOffset;
	public int notedTemplate;
	public String[] groundActions;
	int femaleOffset;
	public boolean aBool60;
	short[] textureToReplace;
	public int ambient;
	short[] colourToReplaceWith;
	int notedId;
	short[] textToReplaceWith;
	public int contrast;
	public int note;
	public int anInt534;
	public int anInt535;
	int unnotedId;
	public int anInt536;

	static {
		items = new NodeCache(64);
		itemModelCache = new NodeCache(50);
		itemSpriteCache = new NodeCache(200);
	}

	ItemComposition() {
		name = "null";
		zoom2d = 2000;
		xan2d = 0;
		yan2d = 0;
		zan2d = 0;
		offsetX2d = 0;
		offsetY2d = 0;
		isStackable = 0;
		price = 1;
		isMembers = false;
		groundActions = new String[] { null, null, "Take", null, null };
		inventoryActions = new String[] { null, null, null, null, "Drop" };
		team = -2;
		maleModel = -1;
		maleModel1 = -1;
		maleOffset = 0;
		femaleModel = -1;
		femaleModel1 = -1;
		femaleOffset = 0;
		maleModel2 = -1;
		femaleModel2 = -1;
		maleHeadModel = -1;
		maleHeadModel2 = -1;
		femaleHeadModel = -1;
		femaleHeadModel2 = -1;
		note = -1;
		notedTemplate = -1;
		resizeX = 128;
		resizeY = 128;
		resizeZ = 128;
		ambient = 0;
		contrast = 0;
		anInt534 = 0;
		aBool60 = false;
		unnotedId = -1;
		notedId = -1;
		anInt536 = -1;
		anInt535 = -1;
	}

	void populateFromBuffer(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			inventoryModel = buffer_0.readUnsignedShort();
		} else {
			if (int_0 == 2) {
				name = buffer_0.readString();
				return;
			}

			if (int_0 == 4) {
				zoom2d = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 5) {
				xan2d = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 6) {
				yan2d = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 7) {
				offsetX2d = buffer_0.readUnsignedShort();
				if (offsetX2d > 32767) {
					offsetX2d -= 65536;
					return;
				}
			} else if (int_0 == 8) {
				offsetY2d = buffer_0.readUnsignedShort();
				if (offsetY2d > 32767) {
					offsetY2d -= 65536;
					return;
				}
			} else {
				if (int_0 == 11) {
					isStackable = 1;
					return;
				}

				if (int_0 == 12) {
					price = buffer_0.readInt();
					return;
				}

				if (int_0 == 16) {
					isMembers = true;
					return;
				}

				if (int_0 == 23) {
					maleModel = buffer_0.readUnsignedShort();
					maleOffset = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 24) {
					maleModel1 = buffer_0.readUnsignedShort();
					return;
				}

				if (int_0 == 25) {
					femaleModel = buffer_0.readUnsignedShort();
					femaleOffset = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 26) {
					femaleModel1 = buffer_0.readUnsignedShort();
					return;
				}

				if ((int_0 >= 30) && (int_0 < 35)) {
					groundActions[int_0 - 30] = buffer_0.readString();
					if (groundActions[int_0 - 30].equalsIgnoreCase("Hidden")) {
						groundActions[int_0 - 30] = null;
						return;
					}
				} else {
					if ((int_0 >= 35) && (int_0 < 40)) {
						inventoryActions[int_0 - 35] = buffer_0.readString();
						return;
					}

					int int_1;
					int int_2;
					if (int_0 == 40) {
						int_1 = buffer_0.readUnsignedByte();
						colourToReplace = new short[int_1];
						colourToReplaceWith = new short[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							colourToReplace[int_2] = (short) buffer_0.readUnsignedShort();
							colourToReplaceWith[int_2] = (short) buffer_0.readUnsignedShort();
						}

						return;
					}

					if (int_0 == 41) {
						int_1 = buffer_0.readUnsignedByte();
						textureToReplace = new short[int_1];
						textToReplaceWith = new short[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							textureToReplace[int_2] = (short) buffer_0.readUnsignedShort();
							textToReplaceWith[int_2] = (short) buffer_0.readUnsignedShort();
						}

						return;
					}

					if (int_0 == 42) {
						team = buffer_0.readByte();
						return;
					}

					if (int_0 == 65) {
						aBool60 = true;
						return;
					}

					if (int_0 == 78) {
						maleModel2 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 79) {
						femaleModel2 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 90) {
						maleHeadModel = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 91) {
						femaleHeadModel = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 92) {
						maleHeadModel2 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 93) {
						femaleHeadModel2 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 95) {
						zan2d = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 97) {
						note = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 98) {
						notedTemplate = buffer_0.readUnsignedShort();
						return;
					}

					if ((int_0 >= 100) && (int_0 < 110)) {
						if (countObj == null) {
							countObj = new int[10];
							countCo = new int[10];
						}

						countObj[int_0 - 100] = buffer_0.readUnsignedShort();
						countCo[int_0 - 100] = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 110) {
						resizeX = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 111) {
						resizeY = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 112) {
						resizeZ = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 113) {
						ambient = buffer_0.readByte();
						return;
					}

					if (int_0 == 114) {
						contrast = buffer_0.readByte() * 5;
						return;
					}

					if (int_0 == 115) {
						anInt534 = buffer_0.readUnsignedByte();
						return;
					}

					if (int_0 == 139) {
						unnotedId = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 140) {
						notedId = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 148) {
						anInt536 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 149) {
						anInt535 = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 249) {
						aClass70_6 = World.method526(buffer_0, aClass70_6);
						return;
					}
				}
			}
		}

	}

	public final Model getModel(final int int_0) {
		if ((countObj != null) && (int_0 > 1)) {
			int int_1 = -1;

			for (int int_2 = 0; int_2 < 10; int_2++) {
				if ((int_0 >= countCo[int_2]) && (countCo[int_2] != 0)) {
					int_1 = countObj[int_2];
				}
			}

			if (int_1 != -1) {
				return Class45.getItemDefinition(int_1).getModel(1);
			}
		}

		Model model_0 = (Model) itemModelCache.get(anInt533);
		if (model_0 != null) {
			return model_0;
		} else {
			final ModelData modeldata_0 = ModelData.method995(anIndexDataBase29, inventoryModel, 0);
			if (modeldata_0 == null) {
				return null;
			} else {
				if ((resizeX != 128) || (resizeY != 128) || (resizeZ != 128)) {
					modeldata_0.method986(resizeX, resizeY, resizeZ);
				}

				int int_3;
				if (colourToReplace != null) {
					for (int_3 = 0; int_3 < colourToReplace.length; int_3++) {
						modeldata_0.recolor(colourToReplace[int_3], colourToReplaceWith[int_3]);
					}
				}

				if (textureToReplace != null) {
					for (int_3 = 0; int_3 < textureToReplace.length; int_3++) {
						modeldata_0.method985(textureToReplace[int_3], textToReplaceWith[int_3]);
					}
				}

				model_0 = modeldata_0.light(ambient + 64, contrast + 768, -50, -10, -50);
				model_0.aBool66 = true;
				itemModelCache.put(model_0, anInt533);
				return model_0;
			}
		}
	}

	public final ModelData method868(final int int_0) {
		int int_2;
		if ((countObj != null) && (int_0 > 1)) {
			int int_1 = -1;

			for (int_2 = 0; int_2 < 10; int_2++) {
				if ((int_0 >= countCo[int_2]) && (countCo[int_2] != 0)) {
					int_1 = countObj[int_2];
				}
			}

			if (int_1 != -1) {
				return Class45.getItemDefinition(int_1).method868(1);
			}
		}

		final ModelData modeldata_0 = ModelData.method995(anIndexDataBase29, inventoryModel, 0);
		if (modeldata_0 == null) {
			return null;
		} else {
			if ((resizeX != 128) || (resizeY != 128) || (resizeZ != 128)) {
				modeldata_0.method986(resizeX, resizeY, resizeZ);
			}

			if (colourToReplace != null) {
				for (int_2 = 0; int_2 < colourToReplace.length; int_2++) {
					modeldata_0.recolor(colourToReplace[int_2], colourToReplaceWith[int_2]);
				}
			}

			if (textureToReplace != null) {
				for (int_2 = 0; int_2 < textureToReplace.length; int_2++) {
					modeldata_0.method985(textureToReplace[int_2], textToReplaceWith[int_2]);
				}
			}

			return modeldata_0;
		}
	}

	public final boolean method869(final boolean bool_0) {
		int int_0 = maleHeadModel;
		int int_1 = maleHeadModel2;
		if (bool_0) {
			int_0 = femaleHeadModel;
			int_1 = femaleHeadModel2;
		}

		if (int_0 == -1) {
			return true;
		} else {
			boolean bool_1 = true;
			if (!anIndexDataBase29.method431(int_0, 0)) {
				bool_1 = false;
			}

			if ((int_1 != -1) && !anIndexDataBase29.method431(int_1, 0)) {
				bool_1 = false;
			}

			return bool_1;
		}
	}

	void post() {
	}

	public final ModelData method870(final boolean bool_0) {
		int int_0 = maleHeadModel;
		int int_1 = maleHeadModel2;
		if (bool_0) {
			int_0 = femaleHeadModel;
			int_1 = femaleHeadModel2;
		}

		if (int_0 == -1) {
			return null;
		} else {
			ModelData modeldata_0 = ModelData.method995(anIndexDataBase29, int_0, 0);
			if (int_1 != -1) {
				final ModelData modeldata_1 = ModelData.method995(anIndexDataBase29, int_1, 0);
				final ModelData[] modeldatas_0 = new ModelData[] { modeldata_0, modeldata_1 };
				modeldata_0 = new ModelData(modeldatas_0, 2);
			}

			int int_2;
			if (colourToReplace != null) {
				for (int_2 = 0; int_2 < colourToReplace.length; int_2++) {
					modeldata_0.recolor(colourToReplace[int_2], colourToReplaceWith[int_2]);
				}
			}

			if (textureToReplace != null) {
				for (int_2 = 0; int_2 < textureToReplace.length; int_2++) {
					modeldata_0.method985(textureToReplace[int_2], textToReplaceWith[int_2]);
				}
			}

			return modeldata_0;
		}
	}

	void loadBuffer(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			populateFromBuffer(buffer_0, int_0);
		}
	}

	public final boolean readyWorn(final boolean bool_0) {
		int int_0 = maleModel;
		int int_1 = maleModel1;
		int int_2 = maleModel2;
		if (bool_0) {
			int_0 = femaleModel;
			int_1 = femaleModel1;
			int_2 = femaleModel2;
		}

		if (int_0 == -1) {
			return true;
		} else {
			boolean bool_1 = true;
			if (!anIndexDataBase29.method431(int_0, 0)) {
				bool_1 = false;
			}

			if ((int_1 != -1) && !anIndexDataBase29.method431(int_1, 0)) {
				bool_1 = false;
			}

			if ((int_2 != -1) && !anIndexDataBase29.method431(int_2, 0)) {
				bool_1 = false;
			}

			return bool_1;
		}
	}

	public final ModelData getWornModelData(final boolean bool_0) {
		int int_0 = maleModel;
		int int_1 = maleModel1;
		int int_2 = maleModel2;
		if (bool_0) {
			int_0 = femaleModel;
			int_1 = femaleModel1;
			int_2 = femaleModel2;
		}

		if (int_0 == -1) {
			return null;
		} else {
			ModelData modeldata_0 = ModelData.method995(anIndexDataBase29, int_0, 0);
			if (int_1 != -1) {
				final ModelData modeldata_1 = ModelData.method995(anIndexDataBase29, int_1, 0);
				if (int_2 != -1) {
					final ModelData modeldata_2 = ModelData.method995(anIndexDataBase29, int_2, 0);
					final ModelData[] modeldatas_0 = new ModelData[] { modeldata_0, modeldata_1, modeldata_2 };
					modeldata_0 = new ModelData(modeldatas_0, 3);
				} else {
					final ModelData[] modeldatas_1 = new ModelData[] { modeldata_0, modeldata_1 };
					modeldata_0 = new ModelData(modeldatas_1, 2);
				}
			}

			if (!bool_0 && (maleOffset != 0)) {
				modeldata_0.method987(0, maleOffset, 0);
			}

			if (bool_0 && (femaleOffset != 0)) {
				modeldata_0.method987(0, femaleOffset, 0);
			}

			int int_3;
			if (colourToReplace != null) {
				for (int_3 = 0; int_3 < colourToReplace.length; int_3++) {
					modeldata_0.recolor(colourToReplace[int_3], colourToReplaceWith[int_3]);
				}
			}

			if (textureToReplace != null) {
				for (int_3 = 0; int_3 < textureToReplace.length; int_3++) {
					modeldata_0.method985(textureToReplace[int_3], textToReplaceWith[int_3]);
				}
			}

			return modeldata_0;
		}
	}

	void method871(final ItemComposition itemcomposition_1, final ItemComposition itemcomposition_2) {
		inventoryModel = itemcomposition_1.inventoryModel;
		zoom2d = itemcomposition_1.zoom2d;
		xan2d = itemcomposition_1.xan2d;
		yan2d = itemcomposition_1.yan2d;
		zan2d = itemcomposition_1.zan2d;
		offsetX2d = itemcomposition_1.offsetX2d;
		offsetY2d = itemcomposition_1.offsetY2d;
		colourToReplace = itemcomposition_1.colourToReplace;
		colourToReplaceWith = itemcomposition_1.colourToReplaceWith;
		textureToReplace = itemcomposition_1.textureToReplace;
		textToReplaceWith = itemcomposition_1.textToReplaceWith;
		name = itemcomposition_2.name;
		isMembers = itemcomposition_2.isMembers;
		price = itemcomposition_2.price;
		isStackable = 1;
	}

	void method872(final ItemComposition itemcomposition_1, final ItemComposition itemcomposition_2) {
		inventoryModel = itemcomposition_1.inventoryModel;
		zoom2d = itemcomposition_1.zoom2d;
		xan2d = itemcomposition_1.xan2d;
		yan2d = itemcomposition_1.yan2d;
		zan2d = itemcomposition_1.zan2d;
		offsetX2d = itemcomposition_1.offsetX2d;
		offsetY2d = itemcomposition_1.offsetY2d;
		colourToReplace = itemcomposition_2.colourToReplace;
		colourToReplaceWith = itemcomposition_2.colourToReplaceWith;
		textureToReplace = itemcomposition_2.textureToReplace;
		textToReplaceWith = itemcomposition_2.textToReplaceWith;
		name = itemcomposition_2.name;
		isMembers = itemcomposition_2.isMembers;
		isStackable = itemcomposition_2.isStackable;
		maleModel = itemcomposition_2.maleModel;
		maleModel1 = itemcomposition_2.maleModel1;
		maleModel2 = itemcomposition_2.maleModel2;
		femaleModel = itemcomposition_2.femaleModel;
		femaleModel1 = itemcomposition_2.femaleModel1;
		femaleModel2 = itemcomposition_2.femaleModel2;
		maleHeadModel = itemcomposition_2.maleHeadModel;
		maleHeadModel2 = itemcomposition_2.maleHeadModel2;
		femaleHeadModel = itemcomposition_2.femaleHeadModel;
		femaleHeadModel2 = itemcomposition_2.femaleHeadModel2;
		anInt534 = itemcomposition_2.anInt534;
		groundActions = itemcomposition_2.groundActions;
		inventoryActions = new String[5];
		if (itemcomposition_2.inventoryActions != null) {
			for (int int_0 = 0; int_0 < 4; int_0++) {
				inventoryActions[int_0] = itemcomposition_2.inventoryActions[int_0];
			}
		}

		inventoryActions[4] = "Discard";
		price = 0;
	}

	void method873(final ItemComposition itemcomposition_1, final ItemComposition itemcomposition_2) {
		inventoryModel = itemcomposition_1.inventoryModel;
		zoom2d = itemcomposition_1.zoom2d;
		xan2d = itemcomposition_1.xan2d;
		yan2d = itemcomposition_1.yan2d;
		zan2d = itemcomposition_1.zan2d;
		offsetX2d = itemcomposition_1.offsetX2d;
		offsetY2d = itemcomposition_1.offsetY2d;
		colourToReplace = itemcomposition_1.colourToReplace;
		colourToReplaceWith = itemcomposition_1.colourToReplaceWith;
		textureToReplace = itemcomposition_1.textureToReplace;
		textToReplaceWith = itemcomposition_1.textToReplaceWith;
		isStackable = itemcomposition_1.isStackable;
		name = itemcomposition_2.name;
		price = 0;
		isMembers = false;
		aBool60 = false;
	}

	public ItemComposition method874(final int int_0) {
		if ((countObj != null) && (int_0 > 1)) {
			int int_1 = -1;

			for (int int_2 = 0; int_2 < 10; int_2++) {
				if ((int_0 >= countCo[int_2]) && (countCo[int_2] != 0)) {
					int_1 = countObj[int_2];
				}
			}

			if (int_1 != -1) {
				return Class45.getItemDefinition(int_1);
			}
		}

		return this;
	}

	public int method875() {
		return (team != -1) && (inventoryActions != null) ? (team >= 0 ? (inventoryActions[team] != null ? team : -1)
				: ("Drop".equalsIgnoreCase(inventoryActions[4]) ? 4 : -1)) : -1;
	}

	public int method876(final int int_0, final int int_1) {
		return Timer.method558(aClass70_6, int_0, int_1);
	}

	public String method877(final int int_0, final String string_0) {
		return IndexFile.method70(aClass70_6, int_0, string_0);
	}

}
