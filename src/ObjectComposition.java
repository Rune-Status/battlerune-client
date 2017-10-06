public class ObjectComposition extends CacheableNode {

	public static boolean aBool52;
	public static NodeCache objects;
	public static IndexDataBase anIndexDataBase21;
	public static IndexDataBase objects_ref;
	public static NodeCache aNodeCache9;
	public static NodeCache cachedModels;
	public static NodeCache aNodeCache10;
	static ModelData[] aModelDataArray1;
	Class70 aClass70_3;
	int varpId;
	public int anInt491;
	int[] objectModels;
	int[] objectTypes;
	public int[] impostorIds;
	public String name;
	public int ambientSoundId;
	public int anInt492;
	int configId;
	public int anInt493;
	public int mapIconId;
	public int[] anIntArray101;
	public int sizeX;
	public int interactType;
	boolean isRotated;
	public int sizeY;
	public boolean aBool53;
	public int anInt494;
	boolean nonFlatShading;
	int clipType;
	public int anInt495;
	public boolean modelClipped;
	int ambient;
	public String[] actions;
	int contrast;
	public int anInt496;
	boolean isSolid;
	public int animationId;
	int modelSizeX;
	public int anInt497;
	int modelSizeHeight;
	int modelSizeY;
	short[] recolorToFind;
	public int mapSceneId;
	public boolean clipped;
	short[] textureToFind;
	short[] recolorToReplace;
	int offsetX;
	short[] textureToReplace;
	int offsetHeight;
	int offsetY;
	public boolean aBool54;

	static {
		aBool52 = false;
		objects = new NodeCache(4096);
		aNodeCache10 = new NodeCache(500);
		cachedModels = new NodeCache(30);
		aNodeCache9 = new NodeCache(30);
		aModelDataArray1 = new ModelData[4];
	}

	ObjectComposition() {
		name = "null";
		sizeX = 1;
		sizeY = 1;
		interactType = 2;
		aBool53 = true;
		anInt491 = -1;
		clipType = -1;
		nonFlatShading = false;
		modelClipped = false;
		animationId = -1;
		anInt497 = 16;
		ambient = 0;
		contrast = 0;
		actions = new String[5];
		mapIconId = -1;
		mapSceneId = -1;
		isRotated = false;
		clipped = true;
		modelSizeX = 128;
		modelSizeHeight = 128;
		modelSizeY = 128;
		offsetX = 0;
		offsetHeight = 0;
		offsetY = 0;
		aBool54 = false;
		isSolid = false;
		anInt492 = -1;
		varpId = -1;
		configId = -1;
		ambientSoundId = -1;
		anInt494 = 0;
		anInt495 = 0;
		anInt496 = 0;
	}

	public final ObjectComposition getImpostor() {
		int int_0 = -1;
		if (varpId != -1) {
			int_0 = Class38.method254(varpId);
		} else if (configId != -1) {
			int_0 = Class86.widgetSettings[configId];
		}

		int int_1;
		if ((int_0 >= 0) && (int_0 < (impostorIds.length - 1))) {
			int_1 = impostorIds[int_0];
		} else {
			int_1 = impostorIds[impostorIds.length - 1];
		}

		return int_1 != -1 ? PlayerComposition.getObjectDefinition(int_1) : null;
	}

	void loadData(final Buffer buffer_0, final int int_0) {
		int int_1;
		int int_2;
		if (int_0 == 1) {
			int_1 = buffer_0.readUnsignedByte();
			if (int_1 > 0) {
				if ((objectModels == null) || aBool52) {
					objectTypes = new int[int_1];
					objectModels = new int[int_1];

					for (int_2 = 0; int_2 < int_1; int_2++) {
						objectModels[int_2] = buffer_0.readUnsignedShort();
						objectTypes[int_2] = buffer_0.readUnsignedByte();
					}

					return;
				}

				buffer_0.offset += int_1 * 3;
			}
		} else {
			if (int_0 == 2) {
				name = buffer_0.readString();
				return;
			}

			if (int_0 == 5) {
				int_1 = buffer_0.readUnsignedByte();
				if (int_1 > 0) {
					if ((objectModels == null) || aBool52) {
						objectTypes = null;
						objectModels = new int[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							objectModels[int_2] = buffer_0.readUnsignedShort();
						}

						return;
					}

					buffer_0.offset += int_1 * 2;
				}

				return;
			}

			if (int_0 == 14) {
				sizeX = buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 15) {
				sizeY = buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 17) {
				interactType = 0;
				aBool53 = false;
				return;
			}

			if (int_0 == 18) {
				aBool53 = false;
				return;
			}

			if (int_0 == 19) {
				anInt491 = buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 21) {
				clipType = 0;
				return;
			}

			if (int_0 == 22) {
				nonFlatShading = true;
				return;
			}

			if (int_0 == 23) {
				modelClipped = true;
				return;
			}

			if (int_0 == 24) {
				animationId = buffer_0.readUnsignedShort();
				if (animationId == 65535) {
					animationId = -1;
					return;
				}
			} else {
				if (int_0 == 27) {
					interactType = 1;
					return;
				}

				if (int_0 == 28) {
					anInt497 = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 29) {
					ambient = buffer_0.readByte();
					return;
				}

				if (int_0 == 39) {
					contrast = buffer_0.readByte() * 25;
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
						recolorToFind = new short[int_1];
						recolorToReplace = new short[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							recolorToFind[int_2] = (short) buffer_0.readUnsignedShort();
							recolorToReplace[int_2] = (short) buffer_0.readUnsignedShort();
						}

						return;
					}

					if (int_0 == 41) {
						int_1 = buffer_0.readUnsignedByte();
						textureToFind = new short[int_1];
						textureToReplace = new short[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							textureToFind[int_2] = (short) buffer_0.readUnsignedShort();
							textureToReplace[int_2] = (short) buffer_0.readUnsignedShort();
						}

						return;
					}

					if (int_0 == 62) {
						isRotated = true;
						return;
					}

					if (int_0 == 64) {
						clipped = false;
						return;
					}

					if (int_0 == 65) {
						modelSizeX = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 66) {
						modelSizeHeight = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 67) {
						modelSizeY = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 68) {
						mapSceneId = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 69) {
						buffer_0.readUnsignedByte();
						return;
					}

					if (int_0 == 70) {
						offsetX = buffer_0.readShort();
						return;
					}

					if (int_0 == 71) {
						offsetHeight = buffer_0.readShort();
						return;
					}

					if (int_0 == 72) {
						offsetY = buffer_0.readShort();
						return;
					}

					if (int_0 == 73) {
						aBool54 = true;
						return;
					}

					if (int_0 == 74) {
						isSolid = true;
						return;
					}

					if (int_0 == 75) {
						anInt492 = buffer_0.readUnsignedByte();
						return;
					}

					if ((int_0 == 77) || (int_0 == 92)) {
						varpId = buffer_0.readUnsignedShort();
						if (varpId == 65535) {
							varpId = -1;
						}

						configId = buffer_0.readUnsignedShort();
						if (configId == 65535) {
							configId = -1;
						}

						int_1 = -1;
						if (int_0 == 92) {
							int_1 = buffer_0.readUnsignedShort();
							if (int_1 == 65535) {
								int_1 = -1;
							}
						}

						int_2 = buffer_0.readUnsignedByte();
						impostorIds = new int[int_2 + 2];

						for (int int_3 = 0; int_3 <= int_2; int_3++) {
							impostorIds[int_3] = buffer_0.readUnsignedShort();
							if (impostorIds[int_3] == 65535) {
								impostorIds[int_3] = -1;
							}
						}

						impostorIds[int_2 + 1] = int_1;
						return;
					}

					if (int_0 == 78) {
						ambientSoundId = buffer_0.readUnsignedShort();
						anInt494 = buffer_0.readUnsignedByte();
						return;
					}

					if (int_0 == 79) {
						anInt495 = buffer_0.readUnsignedShort();
						anInt496 = buffer_0.readUnsignedShort();
						anInt494 = buffer_0.readUnsignedByte();
						int_1 = buffer_0.readUnsignedByte();
						anIntArray101 = new int[int_1];

						for (int_2 = 0; int_2 < int_1; int_2++) {
							anIntArray101[int_2] = buffer_0.readUnsignedShort();
						}

						return;
					}

					if (int_0 == 81) {
						clipType = buffer_0.readUnsignedByte() * 256;
						return;
					}

					if (int_0 == 82) {
						mapIconId = buffer_0.readUnsignedShort();
						return;
					}

					if (int_0 == 249) {
						aClass70_3 = World.method526(buffer_0, aClass70_3);
						return;
					}
				}
			}
		}

	}

	final ModelData getModel(final int int_0, int int_1) {
		ModelData modeldata_0 = null;
		boolean bool_0;
		int int_2;
		int int_4;
		if (objectTypes == null) {
			if (int_0 != 10) {
				return null;
			}

			if (objectModels == null) {
				return null;
			}

			bool_0 = isRotated;
			if ((int_0 == 2) && (int_1 > 3)) {
				bool_0 = !bool_0;
			}

			int_2 = objectModels.length;

			for (int int_3 = 0; int_3 < int_2; int_3++) {
				int_4 = objectModels[int_3];
				if (bool_0) {
					int_4 += 65536;
				}

				modeldata_0 = (ModelData) aNodeCache10.get(int_4);
				if (modeldata_0 == null) {
					modeldata_0 = ModelData.method995(anIndexDataBase21, int_4 & 0xFFFF, 0);
					if (modeldata_0 == null) {
						return null;
					}

					if (bool_0) {
						modeldata_0.method989();
					}

					aNodeCache10.put(modeldata_0, int_4);
				}

				if (int_2 > 1) {
					aModelDataArray1[int_3] = modeldata_0;
				}
			}

			if (int_2 > 1) {
				modeldata_0 = new ModelData(aModelDataArray1, int_2);
			}
		} else {
			int int_5 = -1;

			for (int_2 = 0; int_2 < objectTypes.length; int_2++) {
				if (objectTypes[int_2] == int_0) {
					int_5 = int_2;
					break;
				}
			}

			if (int_5 == -1) {
				return null;
			}

			int_2 = objectModels[int_5];
			final boolean bool_1 = isRotated ^ (int_1 > 3);
			if (bool_1) {
				int_2 += 65536;
			}

			modeldata_0 = (ModelData) aNodeCache10.get(int_2);
			if (modeldata_0 == null) {
				modeldata_0 = ModelData.method995(anIndexDataBase21, int_2 & 0xFFFF, 0);
				if (modeldata_0 == null) {
					return null;
				}

				if (bool_1) {
					modeldata_0.method989();
				}

				aNodeCache10.put(modeldata_0, int_2);
			}
		}

		if ((modelSizeX == 128) && (modelSizeHeight == 128) && (modelSizeY == 128)) {
			bool_0 = false;
		} else {
			bool_0 = true;
		}

		boolean bool_2;
		if ((offsetX == 0) && (offsetHeight == 0) && (offsetY == 0)) {
			bool_2 = false;
		} else {
			bool_2 = true;
		}

		final ModelData modeldata_1 = new ModelData(modeldata_0, (int_1 == 0) && !bool_0 && !bool_2,
				recolorToFind == null, textureToFind == null, true);
		if ((int_0 == 4) && (int_1 > 3)) {
			modeldata_1.method990(256);
			modeldata_1.method987(45, 0, -45);
		}

		int_1 &= 0x3;
		if (int_1 == 1) {
			modeldata_1.method991();
		} else if (int_1 == 2) {
			modeldata_1.method992();
		} else if (int_1 == 3) {
			modeldata_1.method993();
		}

		if (recolorToFind != null) {
			for (int_4 = 0; int_4 < recolorToFind.length; int_4++) {
				modeldata_1.recolor(recolorToFind[int_4], recolorToReplace[int_4]);
			}
		}

		if (textureToFind != null) {
			for (int_4 = 0; int_4 < textureToFind.length; int_4++) {
				modeldata_1.method985(textureToFind[int_4], textureToReplace[int_4]);
			}
		}

		if (bool_0) {
			modeldata_1.method986(modelSizeX, modelSizeHeight, modelSizeY);
		}

		if (bool_2) {
			modeldata_1.method987(offsetX, offsetHeight, offsetY);
		}

		return modeldata_1;
	}

	void post() {
		if (anInt491 == -1) {
			anInt491 = 0;
			if ((objectModels != null) && ((objectTypes == null) || (objectTypes[0] == 10))) {
				anInt491 = 1;
			}

			for (int int_0 = 0; int_0 < 5; int_0++) {
				if (actions[int_0] != null) {
					anInt491 = 1;
				}
			}
		}

		if (anInt492 == -1) {
			anInt492 = interactType != 0 ? 1 : 0;
		}

	}

	void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			loadData(buffer_0, int_0);
		}
	}

	public final Model method797(final int int_0, final int int_1, final int[][] ints_0, final int int_2,
			final int int_3, final int int_4, final Sequence sequence_0, final int int_5) {
		long long_0;
		if (objectTypes == null) {
			long_0 = int_1 + (anInt493 << 10);
		} else {
			long_0 = (int_0 << 3) + (anInt493 << 10) + int_1;
		}

		Model model_0 = (Model) aNodeCache9.get(long_0);
		if (model_0 == null) {
			final ModelData modeldata_0 = this.getModel(int_0, int_1);
			if (modeldata_0 == null) {
				return null;
			}

			model_0 = modeldata_0.light(ambient + 64, contrast + 768, -50, -10, -50);
			aNodeCache9.put(model_0, long_0);
		}

		if ((sequence_0 == null) && (clipType == -1)) {
			return model_0;
		} else {
			if (sequence_0 != null) {
				model_0 = sequence_0.method849(model_0, int_5, int_1);
			} else {
				model_0 = model_0.method948(true);
			}

			if (clipType >= 0) {
				model_0 = model_0.method952(ints_0, int_2, int_3, int_4, false, clipType);
			}

			return model_0;
		}
	}

	public final boolean method798() {
		if (objectModels == null) {
			return true;
		} else {
			boolean bool_0 = true;

			for (int int_0 = 0; int_0 < objectModels.length; int_0++) {
				bool_0 &= anIndexDataBase21.method431(objectModels[int_0] & 0xFFFF, 0);
			}

			return bool_0;
		}
	}

	public final boolean method799(final int int_0) {
		if (objectTypes != null) {
			for (int int_2 = 0; int_2 < objectTypes.length; int_2++) {
				if (objectTypes[int_2] == int_0) {
					return anIndexDataBase21.method431(objectModels[int_2] & 0xFFFF, 0);
				}
			}

			return true;
		} else if (objectModels == null) {
			return true;
		} else if (int_0 != 10) {
			return true;
		} else {
			boolean bool_0 = true;

			for (int int_1 = 0; int_1 < objectModels.length; int_1++) {
				bool_0 &= anIndexDataBase21.method431(objectModels[int_1] & 0xFFFF, 0);
			}

			return bool_0;
		}
	}

	public boolean method800() {
		if (impostorIds == null) {
			return (ambientSoundId != -1) || (anIntArray101 != null);
		} else {
			for (int int_0 = 0; int_0 < impostorIds.length; int_0++) {
				if (impostorIds[int_0] != -1) {
					final ObjectComposition objectcomposition_1 = PlayerComposition
							.getObjectDefinition(impostorIds[int_0]);
					if ((objectcomposition_1.ambientSoundId != -1) || (objectcomposition_1.anIntArray101 != null)) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public final Model method801(final int int_0, final int int_1, final int[][] ints_0, final int int_2,
			final int int_3, final int int_4) {
		long long_0;
		if (objectTypes == null) {
			long_0 = int_1 + (anInt493 << 10);
		} else {
			long_0 = int_1 + (int_0 << 3) + (anInt493 << 10);
		}

		Model model_0 = (Model) aNodeCache9.get(long_0);
		if (model_0 == null) {
			final ModelData modeldata_0 = this.getModel(int_0, int_1);
			if (modeldata_0 == null) {
				return null;
			}

			model_0 = modeldata_0.light(ambient + 64, contrast + 768, -50, -10, -50);
			aNodeCache9.put(model_0, long_0);
		}

		if (clipType >= 0) {
			model_0 = model_0.method952(ints_0, int_2, int_3, int_4, true, clipType);
		}

		return model_0;
	}

	public final Renderable getModel(final int int_0, final int int_1, final int[][] ints_0, final int int_2,
			final int int_3, final int int_4) {
		long long_0;
		if (objectTypes == null) {
			long_0 = int_1 + (anInt493 << 10);
		} else {
			long_0 = (int_0 << 3) + (anInt493 << 10) + int_1;
		}

		Object object_0 = cachedModels.get(long_0);
		if (object_0 == null) {
			final ModelData modeldata_0 = this.getModel(int_0, int_1);
			if (modeldata_0 == null) {
				return null;
			}

			if (!nonFlatShading) {
				object_0 = modeldata_0.light(ambient + 64, contrast + 768, -50, -10, -50);
			} else {
				modeldata_0.aShort2 = (short) (ambient + 64);
				modeldata_0.contrast = (short) (contrast + 768);
				modeldata_0.computeNormals();
				object_0 = modeldata_0;
			}

			cachedModels.put((CacheableNode) object_0, long_0);
		}

		if (nonFlatShading) {
			object_0 = ((ModelData) object_0).method984();
		}

		if (clipType >= 0) {
			if (object_0 instanceof Model) {
				object_0 = ((Model) object_0).method952(ints_0, int_2, int_3, int_4, true, clipType);
			} else if (object_0 instanceof ModelData) {
				object_0 = ((ModelData) object_0).method988(ints_0, int_2, int_3, int_4, true, clipType);
			}
		}

		return (Renderable) object_0;
	}

	public int method802(final int int_0, final int int_1) {
		return Timer.method558(aClass70_3, int_0, int_1);
	}

	public String method803(final int int_0, final String string_0) {
		return IndexFile.method70(aClass70_3, int_0, string_0);
	}

}
