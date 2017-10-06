import java.net.MalformedURLException;
import java.net.URL;

public class Widget extends Node {

	public static boolean aBool26;
	static NodeCache aNodeCache2;
	public static boolean[] validInterfaces;
	public static Widget[][] widgets;
	static NodeCache aNodeCache3;
	static NodeCache aNodeCache4;
	static NodeCache aNodeCache5;
	public int anInt286;
	public String[] actions;
	public int parentId;
	public int[] itemIds;
	public boolean hasScript;
	public int loopCycle;
	public int fontId;
	int anInt287;
	public int[] anIntArray68;
	public int spriteId;
	public int modelType;
	public int width;
	int anInt288;
	public int modelId;
	public boolean aBool27;
	public int anInt289;
	public int type;
	public int height;
	public boolean flippedHorizontally;
	public int sprite2;
	public int boundsIndex;
	public int[] itemQuantities;
	public int borderThickness;
	public int index;
	public int anInt290;
	public int anInt291;
	public boolean flippedVertically;
	public int anInt292;
	public int originalX;
	public int originalWidth;
	public int relativeX;
	public int contentType;
	public int buttonType;
	public int anInt293;
	public int originalY;
	public int anInt294;
	public boolean isHidden;
	public int relativeY;
	public int scrollX;
	public int scrollWidth;
	public int anInt295;
	public int anInt296;
	public int[] tableActions;
	public Widget[] children;
	public int anInt297;
	public int anInt298;
	public int anInt299;
	public int scrollY;
	public int[] anIntArray69;
	public int[][] dynamicValues;
	public int scrollHeight;
	public int config;
	public int rotationX;
	public int anInt300;
	public int opacity;
	public int rotationZ;
	public int anInt301;
	public int anInt302;
	public Object[] anObjectArray2;
	public int textColor;
	public int anInt303;
	public int anInt304;
	public int anInt305;
	public int anInt306;
	public int anInt307;
	public boolean aBool28;
	public Enum9 anEnum9_1;
	public int anInt308;
	public int anInt309;
	public boolean aBool29;
	public boolean aBool30;
	public int textureId;
	public Object[] anObjectArray3;
	public boolean aBool31;
	public int anInt310;
	public int anInt311;
	public Object[] anObjectArray4;
	public int anInt312;
	public boolean aBool32;
	public int anInt313;
	public int anInt314;
	public int rotationY;
	public int paddingX;
	public boolean textShadowed;
	public int modelZoom;
	public int anInt315;
	public int paddingY;
	public int[] xSprites;
	public boolean aBool33;
	public int[] anIntArray70;
	public int anInt316;
	public String text;
	public int itemId;
	public String aString15;
	public int itemQuantity;
	public String[] configActions;
	public String name;
	public Widget dragParent;
	public String selectedAction;
	public String aString16;
	public String tooltip;
	public boolean aBool34;
	public boolean aBool35;
	public int anInt317;
	public int anInt318;
	public int anInt319;
	public int anInt320;
	public boolean aBool36;
	public Object[] anObjectArray5;
	public Object[] mouseEnterListener;
	public Object[] mouseExitListener;
	public Object[] anObjectArray6;
	public Object[] anObjectArray7;
	public Object[] configListenerArgs;
	public Object[] tableListenerArgs;
	public Object[] skillListenerArgs;
	public Object[] renderListener;
	public Object[] anObjectArray8;
	public Object[] mouseHoverListener;
	public Object[] anObjectArray9;
	public Object[] anObjectArray10;
	public Object[] anObjectArray11;
	public Object[] anObjectArray12;
	public Object[] scrollListener;
	public int[] configTriggers;
	public int[] tableModTriggers;
	public int[] skillTriggers;
	public Object[] anObjectArray13;
	public Object[] anObjectArray14;
	public Object[] anObjectArray15;
	public Object[] anObjectArray16;
	public Object[] anObjectArray17;
	public Object[] anObjectArray18;
	public Object[] anObjectArray19;
	public Object[] anObjectArray20;
	public Object[] anObjectArray21;

	static {
		aNodeCache2 = new NodeCache(200);
		aNodeCache4 = new NodeCache(50);
		aNodeCache3 = new NodeCache(20);
		aNodeCache5 = new NodeCache(8);
		aBool26 = false;
	}

	public Widget() {
		hasScript = false;
		anInt289 = -1;
		index = -1;
		anInt292 = 0;
		contentType = 0;
		anInt290 = 0;
		anInt293 = 0;
		anInt291 = 0;
		buttonType = 0;
		originalX = 0;
		originalY = 0;
		originalWidth = 0;
		anInt294 = 0;
		relativeX = 0;
		relativeY = 0;
		width = 0;
		height = 0;
		anInt297 = 1;
		anInt298 = 1;
		parentId = -1;
		isHidden = false;
		scrollX = 0;
		scrollY = 0;
		scrollWidth = 0;
		scrollHeight = 0;
		textColor = 0;
		anInt303 = 0;
		anInt305 = 0;
		anInt307 = 0;
		aBool28 = false;
		anEnum9_1 = Enum9.anEnum9_2;
		opacity = 0;
		anInt308 = 0;
		anInt309 = 1;
		aBool29 = false;
		spriteId = -1;
		anInt286 = -1;
		textureId = 0;
		aBool31 = false;
		borderThickness = 0;
		sprite2 = 0;
		modelType = 1;
		modelId = -1;
		anInt287 = 1;
		anInt288 = -1;
		anInt295 = -1;
		anInt296 = -1;
		anInt313 = 0;
		anInt314 = 0;
		rotationX = 0;
		rotationZ = 0;
		rotationY = 0;
		modelZoom = 100;
		anInt315 = 0;
		anInt299 = 0;
		aBool33 = false;
		anInt316 = 2;
		fontId = -1;
		text = "";
		aString15 = "";
		anInt312 = 0;
		anInt310 = 0;
		anInt311 = 0;
		textShadowed = false;
		paddingX = 0;
		paddingY = 0;
		config = 0;
		name = "";
		dragParent = null;
		anInt304 = 0;
		anInt306 = 0;
		aBool32 = false;
		selectedAction = "";
		aBool27 = false;
		anInt302 = -1;
		aString16 = "";
		tooltip = "Ok";
		itemId = -1;
		itemQuantity = 0;
		anInt301 = 0;
		anInt300 = 0;
		aBool34 = false;
		aBool35 = false;
		anInt317 = -1;
		anInt318 = 0;
		anInt319 = 0;
		anInt320 = 0;
		boundsIndex = -1;
		loopCycle = -1;
		aBool30 = false;
		aBool36 = false;
	}

	public SpritePixels method561(final boolean bool_0) {
		aBool26 = false;
		int int_0;
		if (bool_0) {
			int_0 = anInt286;
		} else {
			int_0 = spriteId;
		}

		if (int_0 == -1) {
			return null;
		} else {
			final long long_0 = ((flippedHorizontally ? 1L : 0L) << 39) + int_0 + ((long) borderThickness << 36)
					+ ((flippedVertically ? 1L : 0L) << 38) + ((long) sprite2 << 40);
			SpritePixels spritepixels_0 = (SpritePixels) aNodeCache2.get(long_0);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			} else {
				spritepixels_0 = Enum1.method577(Class89.anIndexDataBase8, int_0, 0);
				if (spritepixels_0 == null) {
					aBool26 = true;
					return null;
				} else {
					if (flippedVertically) {
						spritepixels_0.method917();
					}

					if (flippedHorizontally) {
						spritepixels_0.method918();
					}

					if (borderThickness > 0) {
						spritepixels_0.method919(borderThickness);
					}

					if (borderThickness >= 1) {
						spritepixels_0.method920(1);
					}

					if (borderThickness >= 2) {
						spritepixels_0.method920(16777215);
					}

					if (sprite2 != 0) {
						spritepixels_0.method921(sprite2);
					}

					aNodeCache2.put(spritepixels_0, long_0);
					return spritepixels_0;
				}
			}
		}
	}

	void decode(final Buffer buffer_0) {
		hasScript = false;
		type = buffer_0.readUnsignedByte();
		anInt292 = buffer_0.readUnsignedByte();
		contentType = buffer_0.readUnsignedShort();
		originalX = buffer_0.readShort();
		originalY = buffer_0.readShort();
		originalWidth = buffer_0.readUnsignedShort();
		anInt294 = buffer_0.readUnsignedShort();
		opacity = buffer_0.readUnsignedByte();
		parentId = buffer_0.readUnsignedShort();
		if (parentId == 65535) {
			parentId = -1;
		} else {
			parentId += anInt289 & 0xFFFF0000;
		}

		anInt302 = buffer_0.readUnsignedShort();
		if (anInt302 == 65535) {
			anInt302 = -1;
		}

		final int int_0 = buffer_0.readUnsignedByte();
		int int_1;
		if (int_0 > 0) {
			tableActions = new int[int_0];
			anIntArray69 = new int[int_0];

			for (int_1 = 0; int_1 < int_0; int_1++) {
				tableActions[int_1] = buffer_0.readUnsignedByte();
				anIntArray69[int_1] = buffer_0.readUnsignedShort();
			}
		}

		int_1 = buffer_0.readUnsignedByte();
		int int_2;
		int int_3;
		int int_4;
		if (int_1 > 0) {
			dynamicValues = new int[int_1][];

			for (int_2 = 0; int_2 < int_1; int_2++) {
				int_3 = buffer_0.readUnsignedShort();
				dynamicValues[int_2] = new int[int_3];

				for (int_4 = 0; int_4 < int_3; int_4++) {
					dynamicValues[int_2][int_4] = buffer_0.readUnsignedShort();
					if (dynamicValues[int_2][int_4] == 65535) {
						dynamicValues[int_2][int_4] = -1;
					}
				}
			}
		}

		if (type == 0) {
			scrollHeight = buffer_0.readUnsignedShort();
			isHidden = buffer_0.readUnsignedByte() == 1;
		}

		if (type == 1) {
			buffer_0.readUnsignedShort();
			buffer_0.readUnsignedByte();
		}

		if (type == 2) {
			itemIds = new int[originalWidth * anInt294];
			itemQuantities = new int[anInt294 * originalWidth];
			int_2 = buffer_0.readUnsignedByte();
			if (int_2 == 1) {
				config |= 0x10000000;
			}

			int_3 = buffer_0.readUnsignedByte();
			if (int_3 == 1) {
				config |= 0x40000000;
			}

			int_4 = buffer_0.readUnsignedByte();
			if (int_4 == 1) {
				config |= 0x80000000;
			}

			final int int_5 = buffer_0.readUnsignedByte();
			if (int_5 == 1) {
				config |= 0x20000000;
			}

			paddingX = buffer_0.readUnsignedByte();
			paddingY = buffer_0.readUnsignedByte();
			xSprites = new int[20];
			anIntArray70 = new int[20];
			anIntArray68 = new int[20];

			int int_6;
			for (int_6 = 0; int_6 < 20; int_6++) {
				final int int_7 = buffer_0.readUnsignedByte();
				if (int_7 == 1) {
					xSprites[int_6] = buffer_0.readShort();
					anIntArray70[int_6] = buffer_0.readShort();
					anIntArray68[int_6] = buffer_0.readInt();
				} else {
					anIntArray68[int_6] = -1;
				}
			}

			configActions = new String[5];

			for (int_6 = 0; int_6 < 5; int_6++) {
				final String string_0 = buffer_0.readString();
				if (string_0.length() > 0) {
					configActions[int_6] = string_0;
					config |= 1 << (int_6 + 23);
				}
			}
		}

		if (type == 3) {
			aBool28 = buffer_0.readUnsignedByte() == 1;
		}

		if ((type == 4) || (type == 1)) {
			anInt310 = buffer_0.readUnsignedByte();
			anInt311 = buffer_0.readUnsignedByte();
			anInt312 = buffer_0.readUnsignedByte();
			fontId = buffer_0.readUnsignedShort();
			if (fontId == 65535) {
				fontId = -1;
			}

			textShadowed = buffer_0.readUnsignedByte() == 1;
		}

		if (type == 4) {
			text = buffer_0.readString();
			aString15 = buffer_0.readString();
		}

		if ((type == 1) || (type == 3) || (type == 4)) {
			textColor = buffer_0.readInt();
		}

		if ((type == 3) || (type == 4)) {
			anInt303 = buffer_0.readInt();
			anInt305 = buffer_0.readInt();
			anInt307 = buffer_0.readInt();
		}

		if (type == 5) {
			spriteId = buffer_0.readInt();
			anInt286 = buffer_0.readInt();
		}

		if (type == 6) {
			modelType = 1;
			modelId = buffer_0.readUnsignedShort();
			if (modelId == 65535) {
				modelId = -1;
			}

			anInt287 = 1;
			anInt288 = buffer_0.readUnsignedShort();
			if (anInt288 == 65535) {
				anInt288 = -1;
			}

			anInt295 = buffer_0.readUnsignedShort();
			if (anInt295 == 65535) {
				anInt295 = -1;
			}

			anInt296 = buffer_0.readUnsignedShort();
			if (anInt296 == 65535) {
				anInt296 = -1;
			}

			modelZoom = buffer_0.readUnsignedShort();
			rotationX = buffer_0.readUnsignedShort();
			rotationZ = buffer_0.readUnsignedShort();
		}

		if (type == 7) {
			itemIds = new int[anInt294 * originalWidth];
			itemQuantities = new int[anInt294 * originalWidth];
			anInt310 = buffer_0.readUnsignedByte();
			fontId = buffer_0.readUnsignedShort();
			if (fontId == 65535) {
				fontId = -1;
			}

			textShadowed = buffer_0.readUnsignedByte() == 1;
			textColor = buffer_0.readInt();
			paddingX = buffer_0.readShort();
			paddingY = buffer_0.readShort();
			int_2 = buffer_0.readUnsignedByte();
			if (int_2 == 1) {
				config |= 0x40000000;
			}

			configActions = new String[5];

			for (int_3 = 0; int_3 < 5; int_3++) {
				final String string_1 = buffer_0.readString();
				if (string_1.length() > 0) {
					configActions[int_3] = string_1;
					config |= 1 << (int_3 + 23);
				}
			}
		}

		if (type == 8) {
			text = buffer_0.readString();
		}

		if ((anInt292 == 2) || (type == 2)) {
			selectedAction = buffer_0.readString();
			aString16 = buffer_0.readString();
			int_2 = buffer_0.readUnsignedShort() & 0x3F;
			config |= int_2 << 11;
		}

		if ((anInt292 == 1) || (anInt292 == 4) || (anInt292 == 5) || (anInt292 == 6)) {
			tooltip = buffer_0.readString();
			if (tooltip.length() == 0) {
				if (anInt292 == 1) {
					tooltip = "Ok";
				}

				if (anInt292 == 4) {
					tooltip = "Select";
				}

				if (anInt292 == 5) {
					tooltip = "Select";
				}

				if (anInt292 == 6) {
					tooltip = "Continue";
				}
			}
		}

		if ((anInt292 == 1) || (anInt292 == 4) || (anInt292 == 5)) {
			config |= 0x400000;
		}

		if (anInt292 == 6) {
			config |= 0x1;
		}

	}

	void decodeActive(final Buffer buffer_0) {
		buffer_0.readUnsignedByte();
		hasScript = true;
		type = buffer_0.readUnsignedByte();
		contentType = buffer_0.readUnsignedShort();
		originalX = buffer_0.readShort();
		originalY = buffer_0.readShort();
		originalWidth = buffer_0.readUnsignedShort();
		if (type == 9) {
			anInt294 = buffer_0.readShort();
		} else {
			anInt294 = buffer_0.readUnsignedShort();
		}

		anInt291 = buffer_0.readByte();
		buttonType = buffer_0.readByte();
		anInt290 = buffer_0.readByte();
		anInt293 = buffer_0.readByte();
		parentId = buffer_0.readUnsignedShort();
		if (parentId == 65535) {
			parentId = -1;
		} else {
			parentId += anInt289 & 0xFFFF0000;
		}

		isHidden = buffer_0.readUnsignedByte() == 1;
		if (type == 0) {
			scrollWidth = buffer_0.readUnsignedShort();
			scrollHeight = buffer_0.readUnsignedShort();
			aBool30 = buffer_0.readUnsignedByte() == 1;
		}

		if (type == 5) {
			spriteId = buffer_0.readInt();
			textureId = buffer_0.readUnsignedShort();
			aBool31 = buffer_0.readUnsignedByte() == 1;
			opacity = buffer_0.readUnsignedByte();
			borderThickness = buffer_0.readUnsignedByte();
			sprite2 = buffer_0.readInt();
			flippedVertically = buffer_0.readUnsignedByte() == 1;
			flippedHorizontally = buffer_0.readUnsignedByte() == 1;
		}

		if (type == 6) {
			modelType = 1;
			modelId = buffer_0.readUnsignedShort();
			if (modelId == 65535) {
				modelId = -1;
			}

			anInt313 = buffer_0.readShort();
			anInt314 = buffer_0.readShort();
			rotationX = buffer_0.readUnsignedShort();
			rotationZ = buffer_0.readUnsignedShort();
			rotationY = buffer_0.readUnsignedShort();
			modelZoom = buffer_0.readUnsignedShort();
			anInt295 = buffer_0.readUnsignedShort();
			if (anInt295 == 65535) {
				anInt295 = -1;
			}

			aBool33 = buffer_0.readUnsignedByte() == 1;
			buffer_0.readUnsignedShort();
			if (anInt291 != 0) {
				anInt315 = buffer_0.readUnsignedShort();
			}

			if (buttonType != 0) {
				buffer_0.readUnsignedShort();
			}
		}

		if (type == 4) {
			fontId = buffer_0.readUnsignedShort();
			if (fontId == 65535) {
				fontId = -1;
			}

			text = buffer_0.readString();
			anInt312 = buffer_0.readUnsignedByte();
			anInt310 = buffer_0.readUnsignedByte();
			anInt311 = buffer_0.readUnsignedByte();
			textShadowed = buffer_0.readUnsignedByte() == 1;
			textColor = buffer_0.readInt();
		}

		if (type == 3) {
			textColor = buffer_0.readInt();
			aBool28 = buffer_0.readUnsignedByte() == 1;
			opacity = buffer_0.readUnsignedByte();
		}

		if (type == 9) {
			anInt309 = buffer_0.readUnsignedByte();
			textColor = buffer_0.readInt();
			aBool29 = buffer_0.readUnsignedByte() == 1;
		}

		config = buffer_0.read24BitInt();
		name = buffer_0.readString();
		final int int_0 = buffer_0.readUnsignedByte();
		if (int_0 > 0) {
			actions = new String[int_0];

			for (int int_1 = 0; int_1 < int_0; int_1++) {
				actions[int_1] = buffer_0.readString();
			}
		}

		anInt304 = buffer_0.readUnsignedByte();
		anInt306 = buffer_0.readUnsignedByte();
		aBool32 = buffer_0.readUnsignedByte() == 1;
		selectedAction = buffer_0.readString();
		anObjectArray5 = method566(buffer_0);
		mouseEnterListener = method566(buffer_0);
		mouseExitListener = method566(buffer_0);
		anObjectArray6 = method566(buffer_0);
		anObjectArray7 = method566(buffer_0);
		configListenerArgs = method566(buffer_0);
		tableListenerArgs = method566(buffer_0);
		skillListenerArgs = method566(buffer_0);
		renderListener = method566(buffer_0);
		anObjectArray8 = method566(buffer_0);
		mouseHoverListener = method566(buffer_0);
		anObjectArray9 = method566(buffer_0);
		anObjectArray10 = method566(buffer_0);
		anObjectArray11 = method566(buffer_0);
		anObjectArray12 = method566(buffer_0);
		anObjectArray3 = method566(buffer_0);
		anObjectArray4 = method566(buffer_0);
		scrollListener = method566(buffer_0);
		configTriggers = method569(buffer_0);
		tableModTriggers = method569(buffer_0);
		skillTriggers = method569(buffer_0);
	}

	public CacheableNode_Sub1 method562(boolean bool_0) {
		if (anInt286 == -1) {
			bool_0 = false;
		}

		final int int_0 = bool_0 ? anInt286 : spriteId;
		if (int_0 == -1) {
			return null;
		} else {
			final long long_0 = ((long) sprite2 << 40) + int_0 + ((long) borderThickness << 36)
					+ ((flippedVertically ? 1L : 0L) << 38) + ((flippedHorizontally ? 1L : 0L) << 39);
			CacheableNode_Sub1 cacheablenode_sub1_0 = (CacheableNode_Sub1) aNodeCache5.get(long_0);
			if (cacheablenode_sub1_0 != null) {
				return cacheablenode_sub1_0;
			} else {
				final SpritePixels spritepixels_0 = method561(bool_0);
				if (spritepixels_0 == null) {
					return null;
				} else {
					final SpritePixels spritepixels_1 = spritepixels_0.copy();
					final int[] ints_0 = new int[spritepixels_1.height];
					final int[] ints_1 = new int[spritepixels_1.height];

					for (int int_1 = 0; int_1 < spritepixels_1.height; int_1++) {
						int int_2 = 0;
						int int_3 = spritepixels_1.width;

						int int_4;
						for (int_4 = 0; int_4 < spritepixels_1.width; int_4++) {
							if (spritepixels_1.image[int_4 + (spritepixels_1.width * int_1)] == 0) {
								int_2 = int_4;
								break;
							}
						}

						for (int_4 = spritepixels_1.width - 1; int_4 >= int_2; --int_4) {
							if (spritepixels_1.image[int_4 + (int_1 * spritepixels_1.width)] == 0) {
								int_3 = int_4 + 1;
								break;
							}
						}

						ints_0[int_1] = int_2;
						ints_1[int_1] = int_3 - int_2;
					}

					cacheablenode_sub1_0 = new CacheableNode_Sub1(spritepixels_1.width, spritepixels_1.height, ints_1,
							ints_0, int_0);
					aNodeCache5.put(cacheablenode_sub1_0, long_0);
					return cacheablenode_sub1_0;
				}
			}
		}
	}

	public Font method563() {
		aBool26 = false;
		if (fontId == -1) {
			return null;
		} else {
			final Font font_0 = (Font) aNodeCache3.get(fontId);
			if (font_0 != null) {
				return font_0;
			} else {
				final IndexDataBase indexdatabase_0 = Class89.anIndexDataBase8;
				final IndexDataBase indexdatabase_1 = Class106.anIndexDataBase10;
				final int int_0 = fontId;
				Font font_1;
				if (!IndexData.method597(indexdatabase_0, int_0, 0)) {
					font_1 = null;
				} else {
					final byte[] bytes_0 = indexdatabase_1.getConfigData(int_0, 0);
					Font font_2;
					if (bytes_0 == null) {
						font_2 = null;
					} else {
						final Font font_3 = new Font(bytes_0, Class108.anIntArray56, Class12.offsetsY,
								Class108.anIntArray57, Class37.anIntArray16, Class108.anIntArray58,
								Class66.spritePixels);
						Class32.method232();
						font_2 = font_3;
					}

					font_1 = font_2;
				}

				if (font_1 != null) {
					aNodeCache3.put(font_1, fontId);
				} else {
					aBool26 = true;
				}

				return font_1;
			}
		}
	}

	public SpritePixels method564(final int int_0) {
		aBool26 = false;
		if ((int_0 >= 0) && (int_0 < anIntArray68.length)) {
			final int int_1 = anIntArray68[int_0];
			if (int_1 == -1) {
				return null;
			} else {
				SpritePixels spritepixels_0 = (SpritePixels) aNodeCache2.get(int_1);
				if (spritepixels_0 != null) {
					return spritepixels_0;
				} else {
					spritepixels_0 = Enum1.method577(Class89.anIndexDataBase8, int_1, 0);
					if (spritepixels_0 != null) {
						aNodeCache2.put(spritepixels_0, int_1);
					} else {
						aBool26 = true;
					}

					return spritepixels_0;
				}
			}
		} else {
			return null;
		}
	}

	public Model method565(final Sequence sequence_0, final int int_0, final boolean bool_0,
			final PlayerComposition playercomposition_0) {
		aBool26 = false;
		int int_1;
		int int_2;
		if (bool_0) {
			int_1 = anInt287;
			int_2 = anInt288;
		} else {
			int_1 = modelType;
			int_2 = modelId;
		}

		if (int_1 == 0) {
			return null;
		} else if ((int_1 == 1) && (int_2 == -1)) {
			return null;
		} else {
			Model model_0 = (Model) aNodeCache4.get(int_2 + (int_1 << 16));
			if (model_0 == null) {
				ModelData modeldata_0;
				if (int_1 == 1) {
					modeldata_0 = ModelData.method995(Class9.anIndexDataBase2, int_2, 0);
					if (modeldata_0 == null) {
						aBool26 = true;
						return null;
					}

					model_0 = modeldata_0.light(64, 768, -50, -10, -50);
				}

				if (int_1 == 2) {
					modeldata_0 = Class81.getNpcDefinition(int_2).method835();
					if (modeldata_0 == null) {
						aBool26 = true;
						return null;
					}

					model_0 = modeldata_0.light(64, 768, -50, -10, -50);
				}

				if (int_1 == 3) {
					if (playercomposition_0 == null) {
						return null;
					}

					modeldata_0 = playercomposition_0.method482();
					if (modeldata_0 == null) {
						aBool26 = true;
						return null;
					}

					model_0 = modeldata_0.light(64, 768, -50, -10, -50);
				}

				if (int_1 == 4) {
					final ItemComposition itemcomposition_0 = Class45.getItemDefinition(int_2);
					modeldata_0 = itemcomposition_0.method868(10);
					if (modeldata_0 == null) {
						aBool26 = true;
						return null;
					}

					model_0 = modeldata_0.light(itemcomposition_0.ambient + 64, itemcomposition_0.contrast + 768, -50,
							-10, -50);
				}

				aNodeCache4.put(model_0, int_2 + (int_1 << 16));
			}

			if (sequence_0 != null) {
				model_0 = sequence_0.method851(model_0, int_0);
			}

			return model_0;
		}
	}

	Object[] method566(final Buffer buffer_0) {
		final int int_0 = buffer_0.readUnsignedByte();
		if (int_0 == 0) {
			return null;
		} else {
			final Object[] objects_0 = new Object[int_0];

			for (int int_1 = 0; int_1 < int_0; int_1++) {
				final int int_2 = buffer_0.readUnsignedByte();
				if (int_2 == 0) {
					objects_0[int_1] = new Integer(buffer_0.readInt());
				} else if (int_2 == 1) {
					objects_0[int_1] = buffer_0.readString();
				}
			}

			aBool27 = true;
			return objects_0;
		}
	}

	public void method567(final int int_0, final int int_1) {
		int int_2 = itemIds[int_1];
		itemIds[int_1] = itemIds[int_0];
		itemIds[int_0] = int_2;
		int_2 = itemQuantities[int_1];
		itemQuantities[int_1] = itemQuantities[int_0];
		itemQuantities[int_0] = int_2;
	}

	public void method568(final int int_0, final String string_0) {
		if ((actions == null) || (actions.length <= int_0)) {
			final String[] strings_0 = new String[int_0 + 1];
			if (actions != null) {
				for (int int_1 = 0; int_1 < actions.length; int_1++) {
					strings_0[int_1] = actions[int_1];
				}
			}

			actions = strings_0;
		}

		actions[int_0] = string_0;
	}

	int[] method569(final Buffer buffer_0) {
		final int int_0 = buffer_0.readUnsignedByte();
		if (int_0 == 0) {
			return null;
		} else {
			final int[] ints_0 = new int[int_0];

			for (int int_1 = 0; int_1 < int_0; int_1++) {
				ints_0[int_1] = buffer_0.readInt();
			}

			return ints_0;
		}
	}

	static final void method570(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4) {
		Class85.aModIconArray5[0].method886(int_0, int_1);
		Class85.aModIconArray5[1].method886(int_0, (int_3 + int_1) - 16);
		Rasterizer2D.method853(int_0, int_1 + 16, 16, int_3 - 32, Client.anInt708);
		int int_5 = (int_3 * (int_3 - 32)) / int_4;
		if (int_5 < 8) {
			int_5 = 8;
		}

		final int int_6 = ((int_3 - 32 - int_5) * int_2) / (int_4 - int_3);
		Rasterizer2D.method853(int_0, int_6 + int_1 + 16, 16, int_5, Client.anInt719);
		Rasterizer2D.method852(int_0, int_6 + int_1 + 16, int_5, Client.anInt724);
		Rasterizer2D.method852(int_0 + 1, int_6 + int_1 + 16, int_5, Client.anInt724);
		Rasterizer2D.method854(int_0, int_6 + int_1 + 16, 16, Client.anInt724);
		Rasterizer2D.method854(int_0, int_6 + int_1 + 17, 16, Client.anInt724);
		Rasterizer2D.method852(int_0 + 15, int_6 + int_1 + 16, int_5, Client.anInt732);
		Rasterizer2D.method852(int_0 + 14, int_6 + 17 + int_1, int_5 - 1, Client.anInt732);
		Rasterizer2D.method854(int_0, int_6 + int_1 + 15 + int_5, 16, Client.anInt732);
		Rasterizer2D.method854(int_0 + 1, int_5 + 14 + int_1 + int_6, 15, Client.anInt732);
	}

	static boolean method571(final String string_0) {
		if (string_0 == null) {
			return false;
		} else {
			try {
				new URL(string_0);
				return true;
			} catch (final MalformedURLException malformedurlexception_0) {
				return false;
			}
		}
	}

}
