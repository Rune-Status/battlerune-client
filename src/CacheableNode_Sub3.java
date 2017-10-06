public class CacheableNode_Sub3 extends CacheableNode {

	public static NodeCache aNodeCache13;
	public static NodeCache aNodeCache14;
	public static NodeCache aNodeCache15;
	public static IndexDataBase anIndexDataBase22;
	public static IndexDataBase anIndexDataBase23;
	public static IndexDataBase anIndexDataBase24;
	String aString29;
	int anInt501;
	int anInt502;
	int anInt503;
	int anInt504;
	int anInt505;
	int anInt506;
	int anInt507;
	public int anInt508;
	public int anInt509;
	public int anInt510;
	public int[] anIntArray104;
	public int anInt511;
	public int anInt512;
	public int anInt513;
	public int anInt514;

	static {
		aNodeCache13 = new NodeCache(64);
		aNodeCache15 = new NodeCache(64);
		aNodeCache14 = new NodeCache(20);
	}

	CacheableNode_Sub3() {
		anInt506 = -1;
		anInt509 = 16777215;
		anInt510 = 70;
		anInt502 = -1;
		anInt503 = -1;
		anInt505 = -1;
		anInt504 = -1;
		anInt511 = 0;
		anInt513 = 0;
		anInt512 = -1;
		aString29 = "";
		anInt508 = -1;
		anInt514 = 0;
		anInt501 = -1;
		anInt507 = -1;
	}

	void method815(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			anInt506 = buffer_0.method661();
		} else {
			if (int_0 == 2) {
				anInt509 = buffer_0.read24BitInt();
				return;
			}

			if (int_0 == 3) {
				anInt502 = buffer_0.method661();
				return;
			}

			if (int_0 == 4) {
				anInt505 = buffer_0.method661();
				return;
			}

			if (int_0 == 5) {
				anInt503 = buffer_0.method661();
				return;
			}

			if (int_0 == 6) {
				anInt504 = buffer_0.method661();
				return;
			}

			if (int_0 == 7) {
				anInt511 = buffer_0.readShort();
				return;
			}

			if (int_0 == 8) {
				aString29 = buffer_0.getJagString();
				return;
			}

			if (int_0 == 9) {
				anInt510 = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 10) {
				anInt513 = buffer_0.readShort();
				return;
			}

			if (int_0 == 11) {
				anInt512 = 0;
				return;
			}

			if (int_0 == 12) {
				anInt508 = buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 13) {
				anInt514 = buffer_0.readShort();
				return;
			}

			if (int_0 == 14) {
				anInt512 = buffer_0.readUnsignedShort();
				return;
			}

			if ((int_0 == 17) || (int_0 == 18)) {
				anInt501 = buffer_0.readUnsignedShort();
				if (anInt501 == 65535) {
					anInt501 = -1;
				}

				anInt507 = buffer_0.readUnsignedShort();
				if (anInt507 == 65535) {
					anInt507 = -1;
				}

				int int_1 = -1;
				if (int_0 == 18) {
					int_1 = buffer_0.readUnsignedShort();
					if (int_1 == 65535) {
						int_1 = -1;
					}
				}

				final int int_2 = buffer_0.readUnsignedByte();
				anIntArray104 = new int[int_2 + 2];

				for (int int_3 = 0; int_3 <= int_2; int_3++) {
					anIntArray104[int_3] = buffer_0.readUnsignedShort();
					if (anIntArray104[int_3] == 65535) {
						anIntArray104[int_3] = -1;
					}
				}

				anIntArray104[int_2 + 1] = int_1;
				return;
			}
		}

	}

	void method816(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method815(buffer_0, int_0);
		}
	}

	public final CacheableNode_Sub3 method817() {
		int int_0 = -1;
		if (anInt501 != -1) {
			int_0 = Class38.method254(anInt501);
		} else if (anInt507 != -1) {
			int_0 = Class86.widgetSettings[anInt507];
		}

		int int_1;
		if ((int_0 >= 0) && (int_0 < (anIntArray104.length - 1))) {
			int_1 = anIntArray104[int_0];
		} else {
			int_1 = anIntArray104[anIntArray104.length - 1];
		}

		return int_1 != -1 ? Class36.method246(int_1) : null;
	}

	public SpritePixels method818() {
		if (anInt502 < 0) {
			return null;
		} else {
			SpritePixels spritepixels_0 = (SpritePixels) aNodeCache15.get(anInt502);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			} else {
				spritepixels_0 = Enum1.method577(anIndexDataBase23, anInt502, 0);
				if (spritepixels_0 != null) {
					aNodeCache15.put(spritepixels_0, anInt502);
				}

				return spritepixels_0;
			}
		}
	}

	public SpritePixels method819() {
		if (anInt503 < 0) {
			return null;
		} else {
			SpritePixels spritepixels_0 = (SpritePixels) aNodeCache15.get(anInt503);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			} else {
				spritepixels_0 = Enum1.method577(anIndexDataBase23, anInt503, 0);
				if (spritepixels_0 != null) {
					aNodeCache15.put(spritepixels_0, anInt503);
				}

				return spritepixels_0;
			}
		}
	}

	public SpritePixels method820() {
		if (anInt505 < 0) {
			return null;
		} else {
			SpritePixels spritepixels_0 = (SpritePixels) aNodeCache15.get(anInt505);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			} else {
				spritepixels_0 = Enum1.method577(anIndexDataBase23, anInt505, 0);
				if (spritepixels_0 != null) {
					aNodeCache15.put(spritepixels_0, anInt505);
				}

				return spritepixels_0;
			}
		}
	}

	public SpritePixels method821() {
		if (anInt504 < 0) {
			return null;
		} else {
			SpritePixels spritepixels_0 = (SpritePixels) aNodeCache15.get(anInt504);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			} else {
				spritepixels_0 = Enum1.method577(anIndexDataBase23, anInt504, 0);
				if (spritepixels_0 != null) {
					aNodeCache15.put(spritepixels_0, anInt504);
				}

				return spritepixels_0;
			}
		}
	}

	public Font method822() {
		if (anInt506 == -1) {
			return null;
		} else {
			final Font font_0 = (Font) aNodeCache14.get(anInt506);
			if (font_0 != null) {
				return font_0;
			} else {
				final IndexDataBase indexdatabase_0 = anIndexDataBase23;
				final IndexDataBase indexdatabase_1 = anIndexDataBase24;
				final int int_0 = anInt506;
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
					aNodeCache14.put(font_1, anInt506);
				}

				return font_1;
			}
		}
	}

	public String method823(final int int_0) {
		String string_0 = aString29;

		while (true) {
			final int int_1 = string_0.indexOf("%1");
			if (int_1 < 0) {
				return string_0;
			}

			string_0 = string_0.substring(0, int_1) + GameEngine.method1028(int_0, false)
					+ string_0.substring(int_1 + 2);
		}
	}

}
