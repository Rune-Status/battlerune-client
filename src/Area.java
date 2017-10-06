public class Area extends CacheableNode {

	public static NodeCache skeletonsIndex;
	public static IndexDataBase anIndexDataBase19;
	public static int anInt467;
	public int spriteId;
	int[] anIntArray84;
	public final int anInt468;
	public String name;
	public Enum7 anEnum7_4;
	int anInt469;
	int anInt470;
	public Enum8 anEnum8_4;
	public int anInt471;
	public int anInt472;
	int anInt473;
	public String[] aStringArray4;
	public int anInt474;
	int anInt475;
	public String aString28;
	int anInt476;
	int[] anIntArray85;
	byte[] aByteArray20;

	static {
		skeletonsIndex = new NodeCache(256);
	}

	public Area(final int int_0) {
		spriteId = -1;
		anInt469 = -1;
		anInt472 = 0;
		aStringArray4 = new String[5];
		anInt470 = Integer.MAX_VALUE;
		anInt475 = Integer.MAX_VALUE;
		anInt473 = Integer.MIN_VALUE;
		anInt476 = Integer.MIN_VALUE;
		anEnum7_4 = Enum7.anEnum7_2;
		anEnum8_4 = Enum8.anEnum8_2;
		anInt474 = -1;
		anInt468 = int_0;
	}

	public SpritePixels method755(final boolean bool_0) {
		final int int_0 = spriteId;
		return method756(int_0);
	}

	SpritePixels method756(final int int_0) {
		if (int_0 < 0) {
			return null;
		} else {
			SpritePixels spritepixels_0 = (SpritePixels) skeletonsIndex.get(int_0);
			if (spritepixels_0 != null) {
				return spritepixels_0;
			} else {
				spritepixels_0 = Enum1.method577(anIndexDataBase19, int_0, 0);
				if (spritepixels_0 != null) {
					skeletonsIndex.put(spritepixels_0, int_0);
				}

				return spritepixels_0;
			}
		}
	}

	void method757(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			spriteId = buffer_0.method661();
		} else {
			if (int_0 == 2) {
				anInt469 = buffer_0.method661();
				return;
			}

			if (int_0 == 3) {
				name = buffer_0.readString();
				return;
			}

			if (int_0 == 4) {
				anInt471 = buffer_0.read24BitInt();
				return;
			}

			if (int_0 == 5) {
				buffer_0.read24BitInt();
				return;
			}

			if (int_0 == 6) {
				anInt472 = buffer_0.readUnsignedByte();
				return;
			}

			int int_1;
			if (int_0 == 7) {
				int_1 = buffer_0.readUnsignedByte();
				if ((int_1 & 0x1) == 0) {
					;
				}

				if ((int_1 & 0x2) == 2) {
					return;
				}

				return;
			}

			if (int_0 == 8) {
				buffer_0.readUnsignedByte();
				return;
			}

			if ((int_0 >= 10) && (int_0 <= 14)) {
				aStringArray4[int_0 - 10] = buffer_0.readString();
				return;
			}

			if (int_0 == 15) {
				int_1 = buffer_0.readUnsignedByte();
				anIntArray84 = new int[int_1 * 2];

				int int_2;
				for (int_2 = 0; int_2 < (int_1 * 2); int_2++) {
					anIntArray84[int_2] = buffer_0.readShort();
				}

				buffer_0.readInt();
				int_2 = buffer_0.readUnsignedByte();
				anIntArray85 = new int[int_2];

				int int_3;
				for (int_3 = 0; int_3 < anIntArray85.length; int_3++) {
					anIntArray85[int_3] = buffer_0.readInt();
				}

				aByteArray20 = new byte[int_1];

				for (int_3 = 0; int_3 < int_1; int_3++) {
					aByteArray20[int_3] = buffer_0.readByte();
				}

				return;
			}

			if (int_0 == 16) {
				return;
			}

			if (int_0 == 17) {
				aString28 = buffer_0.readString();
				return;
			}

			if (int_0 == 18) {
				buffer_0.method661();
				return;
			}

			if (int_0 == 19) {
				anInt474 = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 21) {
				buffer_0.readInt();
				return;
			}

			if (int_0 == 22) {
				buffer_0.readInt();
				return;
			}

			if (int_0 == 23) {
				buffer_0.readUnsignedByte();
				buffer_0.readUnsignedByte();
				buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 24) {
				buffer_0.readShort();
				buffer_0.readShort();
				return;
			}

			if (int_0 == 25) {
				buffer_0.method661();
				return;
			}

			if (int_0 == 28) {
				buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 29) {
				final Enum7[] enum7s_0 = new Enum7[] { Enum7.anEnum7_1, Enum7.anEnum7_2, Enum7.anEnum7_3 };
				anEnum7_4 = (Enum7) PendingSpawn.forOrdinal(enum7s_0, buffer_0.readUnsignedByte());
				return;
			}

			if (int_0 == 30) {
				anEnum8_4 = (Enum8) PendingSpawn.forOrdinal(Class33.method235(), buffer_0.readUnsignedByte());
				return;
			}
		}

	}

	public int method758() {
		return anInt468;
	}

	public void method759(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method757(buffer_0, int_0);
		}
	}

	public void method760() {
		if (anIntArray84 != null) {
			for (int int_0 = 0; int_0 < anIntArray84.length; int_0 += 2) {
				if (anIntArray84[int_0] < anInt470) {
					anInt470 = anIntArray84[int_0];
				} else if (anIntArray84[int_0] > anInt473) {
					anInt473 = anIntArray84[int_0];
				}

				if (anIntArray84[int_0 + 1] < anInt475) {
					anInt475 = anIntArray84[int_0 + 1];
				} else if (anIntArray84[int_0 + 1] > anInt476) {
					anInt476 = anIntArray84[int_0 + 1];
				}
			}
		}

	}

}
