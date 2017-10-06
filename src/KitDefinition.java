public class KitDefinition extends CacheableNode {

	public static int anInt465;
	public static NodeCache identKits;
	static IndexDataBase anIndexDataBase17;
	static IndexDataBase identKit_ref;
	int[] modelIds;
	int[] models;
	public int bodyPartId;
	public boolean nonSelectable;
	short[] recolorToFind;
	short[] retextureToFind;
	short[] recolorToReplace;
	short[] retextureToReplace;

	static {
		identKits = new NodeCache(64);
	}

	KitDefinition() {
		bodyPartId = -1;
		models = new int[] { -1, -1, -1, -1, -1 };
		nonSelectable = false;
	}

	void method750(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			bodyPartId = buffer_0.readUnsignedByte();
		} else {
			int int_1;
			int int_2;
			if (int_0 == 2) {
				int_1 = buffer_0.readUnsignedByte();
				modelIds = new int[int_1];

				for (int_2 = 0; int_2 < int_1; int_2++) {
					modelIds[int_2] = buffer_0.readUnsignedShort();
				}

				return;
			}

			if (int_0 == 3) {
				nonSelectable = true;
				return;
			}

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
				retextureToFind = new short[int_1];
				retextureToReplace = new short[int_1];

				for (int_2 = 0; int_2 < int_1; int_2++) {
					retextureToFind[int_2] = (short) buffer_0.readUnsignedShort();
					retextureToReplace[int_2] = (short) buffer_0.readUnsignedShort();
				}

				return;
			}

			if ((int_0 >= 60) && (int_0 < 70)) {
				models[int_0 - 60] = buffer_0.readUnsignedShort();
				return;
			}
		}

	}

	public boolean method751() {
		boolean bool_0 = true;

		for (int int_0 = 0; int_0 < 5; int_0++) {
			if ((models[int_0] != -1) && !anIndexDataBase17.method431(models[int_0], 0)) {
				bool_0 = false;
			}
		}

		return bool_0;
	}

	public ModelData method752() {
		final ModelData[] modeldatas_0 = new ModelData[5];
		int int_0 = 0;

		for (int int_1 = 0; int_1 < 5; int_1++) {
			if (models[int_1] != -1) {
				modeldatas_0[int_0++] = ModelData.method995(anIndexDataBase17, models[int_1], 0);
			}
		}

		final ModelData modeldata_0 = new ModelData(modeldatas_0, int_0);
		int int_2;
		if (recolorToFind != null) {
			for (int_2 = 0; int_2 < recolorToFind.length; int_2++) {
				modeldata_0.recolor(recolorToFind[int_2], recolorToReplace[int_2]);
			}
		}

		if (retextureToFind != null) {
			for (int_2 = 0; int_2 < retextureToFind.length; int_2++) {
				modeldata_0.method985(retextureToFind[int_2], retextureToReplace[int_2]);
			}
		}

		return modeldata_0;
	}

	public boolean ready() {
		if (modelIds == null) {
			return true;
		} else {
			boolean bool_0 = true;

			for (int int_0 = 0; int_0 < modelIds.length; int_0++) {
				if (!anIndexDataBase17.method431(modelIds[int_0], 0)) {
					bool_0 = false;
				}
			}

			return bool_0;
		}
	}

	void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method750(buffer_0, int_0);
		}
	}

	public ModelData getModelData() {
		if (modelIds == null) {
			return null;
		} else {
			final ModelData[] modeldatas_0 = new ModelData[modelIds.length];

			for (int int_0 = 0; int_0 < modelIds.length; int_0++) {
				modeldatas_0[int_0] = ModelData.method995(anIndexDataBase17, modelIds[int_0], 0);
			}

			ModelData modeldata_0;
			if (modeldatas_0.length == 1) {
				modeldata_0 = modeldatas_0[0];
			} else {
				modeldata_0 = new ModelData(modeldatas_0, modeldatas_0.length);
			}

			int int_1;
			if (recolorToFind != null) {
				for (int_1 = 0; int_1 < recolorToFind.length; int_1++) {
					modeldata_0.recolor(recolorToFind[int_1], recolorToReplace[int_1]);
				}
			}

			if (retextureToFind != null) {
				for (int_1 = 0; int_1 < retextureToFind.length; int_1++) {
					modeldata_0.method985(retextureToFind[int_1], retextureToReplace[int_1]);
				}
			}

			return modeldata_0;
		}
	}

	static SpritePixels[] method753() {
		final SpritePixels[] spritepixelss_0 = new SpritePixels[Class108.anInt218];

		for (int int_0 = 0; int_0 < Class108.anInt218; int_0++) {
			final SpritePixels spritepixels_0 = spritepixelss_0[int_0] = new SpritePixels();
			spritepixels_0.maxWidth = Class108.anInt216;
			spritepixels_0.maxHeight = Class108.anInt217;
			spritepixels_0.offsetX = Class108.anIntArray56[int_0];
			spritepixels_0.offsetY = Class12.offsetsY[int_0];
			spritepixels_0.width = Class108.anIntArray57[int_0];
			spritepixels_0.height = Class37.anIntArray16[int_0];
			final int int_1 = spritepixels_0.width * spritepixels_0.height;
			final byte[] bytes_0 = Class66.spritePixels[int_0];
			spritepixels_0.image = new int[int_1];

			for (int int_2 = 0; int_2 < int_1; int_2++) {
				spritepixels_0.image[int_2] = Class108.anIntArray58[bytes_0[int_2] & 0xFF];
			}
		}

		Class32.method232();
		return spritepixelss_0;
	}

}
