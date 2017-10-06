public class CombatInfo2 extends CacheableNode {

	public static NodeCache aNodeCache8;
	static NodeCache spriteCache;
	public static IndexDataBase anIndexDataBase20;
	int anInt482;
	int anInt483;
	public int anInt484;
	public int anInt485;
	public int anInt486;
	public int anInt487;
	public int anInt488;
	public int anInt489;
	public int healthScale;
	public int anInt490;

	static {
		aNodeCache8 = new NodeCache(64);
		spriteCache = new NodeCache(64);
	}

	public CombatInfo2() {
		anInt484 = 255;
		anInt486 = 255;
		anInt485 = -1;
		anInt488 = 1;
		anInt487 = 70;
		anInt483 = -1;
		anInt482 = -1;
		healthScale = 30;
		anInt490 = 0;
	}

	void method792(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			buffer_0.readUnsignedShort();
		} else {
			if (int_0 == 2) {
				anInt484 = buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 3) {
				anInt486 = buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 4) {
				anInt485 = 0;
				return;
			}

			if (int_0 == 5) {
				anInt487 = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 6) {
				buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 7) {
				anInt483 = buffer_0.method661();
				return;
			}

			if (int_0 == 8) {
				anInt482 = buffer_0.method661();
				return;
			}

			if (int_0 == 11) {
				anInt485 = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 14) {
				healthScale = buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 15) {
				anInt490 = buffer_0.readUnsignedByte();
				return;
			}
		}

	}

	public void method793(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method792(buffer_0, int_0);
		}
	}

	public SpritePixels method794() {
		if (anInt482 < 0) {
			return null;
		} else {
			SpritePixels spritepixels_0 = (SpritePixels) spriteCache.get(anInt482);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			} else {
				spritepixels_0 = Enum1.method577(Class111.anIndexDataBase14, anInt482, 0);
				if (spritepixels_0 != null) {
					spriteCache.put(spritepixels_0, anInt482);
				}

				return spritepixels_0;
			}
		}
	}

	public SpritePixels method795() {
		if (anInt483 < 0) {
			return null;
		} else {
			SpritePixels spritepixels_0 = (SpritePixels) spriteCache.get(anInt483);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			} else {
				spritepixels_0 = Enum1.method577(Class111.anIndexDataBase14, anInt483, 0);
				if (spritepixels_0 != null) {
					spriteCache.put(spritepixels_0, anInt483);
				}

				return spritepixels_0;
			}
		}
	}

	static final int getSmoothNoise2D(final int int_0, final int int_1) {
		final int int_2 = Varcs.method507(int_0 - 1, int_1 - 1) + Varcs.method507(int_0 + 1, int_1 - 1)
				+ Varcs.method507(int_0 - 1, int_1 + 1) + Varcs.method507(int_0 + 1, int_1 + 1);
		final int int_3 = Varcs.method507(int_0 - 1, int_1) + Varcs.method507(int_0 + 1, int_1)
				+ Varcs.method507(int_0, int_1 - 1) + Varcs.method507(int_0, int_1 + 1);
		final int int_4 = Varcs.method507(int_0, int_1);
		return (int_3 / 8) + (int_2 / 16) + (int_4 / 4);
	}

}
