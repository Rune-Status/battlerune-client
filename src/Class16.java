public class Class16 {

	public static final Class16 aClass16_1;
	public static final Class16 aClass16_2;
	public static final Class16 aClass16_3;
	public static final Class16 aClass16_4;
	public static final Class16 aClass16_5;
	static int anInt69;
	public final String aString2;

	static {
		aClass16_1 = new Class16("details");
		aClass16_2 = new Class16("compositemap");
		aClass16_4 = new Class16("compositetexture");
		aClass16_3 = new Class16("area");
		aClass16_5 = new Class16("labels");
	}

	Class16(final String string_0) {
		aString2 = string_0;
	}

	static final void method198() {
		final short short_0 = 256;
		int int_0;
		if (Class26.anInt80 > 0) {
			for (int_0 = 0; int_0 < 256; int_0++) {
				if (Class26.anInt80 > 768) {
					Class26.anIntArray14[int_0] = Class55.method346(Class26.anIntArray13[int_0],
							AClass2_Sub1.anIntArray75[int_0], 1024 - Class26.anInt80);
				} else if (Class26.anInt80 > 256) {
					Class26.anIntArray14[int_0] = AClass2_Sub1.anIntArray75[int_0];
				} else {
					Class26.anIntArray14[int_0] = Class55.method346(AClass2_Sub1.anIntArray75[int_0],
							Class26.anIntArray13[int_0], 256 - Class26.anInt80);
				}
			}
		} else if (Class26.anInt81 > 0) {
			for (int_0 = 0; int_0 < 256; int_0++) {
				if (Class26.anInt81 > 768) {
					Class26.anIntArray14[int_0] = Class55.method346(Class26.anIntArray13[int_0],
							World.anIntArray63[int_0], 1024 - Class26.anInt81);
				} else if (Class26.anInt81 > 256) {
					Class26.anIntArray14[int_0] = World.anIntArray63[int_0];
				} else {
					Class26.anIntArray14[int_0] = Class55.method346(World.anIntArray63[int_0],
							Class26.anIntArray13[int_0], 256 - Class26.anInt81);
				}
			}
		} else {
			for (int_0 = 0; int_0 < 256; int_0++) {
				Class26.anIntArray14[int_0] = Class26.anIntArray13[int_0];
			}
		}

		Rasterizer2D.setDrawRegion(Class26.anInt79, 9, Class26.anInt79 + 128, short_0 + 7);
		XItemContainer.aSpritePixels4.method914(Class26.anInt79, 0);
		Rasterizer2D.noClip();
		int_0 = 0;
		int int_1 = (GZipDecompressor.aBufferProvider1.width * 9) + Class26.anInt79;

		int int_2;
		int int_3;
		int int_4;
		int int_5;
		int int_6;
		int int_7;
		int int_8;
		int int_9;
		for (int_2 = 1; int_2 < (short_0 - 1); int_2++) {
			int_3 = (Class26.anIntArray12[int_2] * (short_0 - int_2)) / short_0;
			int_4 = int_3 + 22;
			if (int_4 < 0) {
				int_4 = 0;
			}

			int_0 += int_4;

			for (int_5 = int_4; int_5 < 128; int_5++) {
				int_6 = Class61.anIntArray40[int_0++];
				if (int_6 != 0) {
					int_7 = int_6;
					int_8 = 256 - int_6;
					int_6 = Class26.anIntArray14[int_6];
					int_9 = GZipDecompressor.aBufferProvider1.pixels[int_1];
					GZipDecompressor.aBufferProvider1.pixels[int_1++] = ((((int_7 * (int_6 & 0xFF00))
							+ (int_8 * (int_9 & 0xFF00))) & 0xFF0000)
							+ (((int_8 * (int_9 & 0xFF00FF)) + ((int_6 & 0xFF00FF) * int_7)) & 0xFF00FF00)) >> 8;
				} else {
					++int_1;
				}
			}

			int_1 += (int_4 + GZipDecompressor.aBufferProvider1.width) - 128;
		}

		Rasterizer2D.setDrawRegion((Class26.anInt79 + 765) - 128, 9, Class26.anInt79 + 765, short_0 + 7);
		AClass4_Sub2.aSpritePixels5.method914(Class26.anInt79 + 382, 0);
		Rasterizer2D.noClip();
		int_0 = 0;
		int_1 = 637 + 24 + (GZipDecompressor.aBufferProvider1.width * 9) + Class26.anInt79;

		for (int_2 = 1; int_2 < (short_0 - 1); int_2++) {
			int_3 = (Class26.anIntArray12[int_2] * (short_0 - int_2)) / short_0;
			int_4 = 103 - int_3;
			int_1 += int_3;

			for (int_5 = 0; int_5 < int_4; int_5++) {
				int_6 = Class61.anIntArray40[int_0++];
				if (int_6 != 0) {
					int_7 = int_6;
					int_8 = 256 - int_6;
					int_6 = Class26.anIntArray14[int_6];
					int_9 = GZipDecompressor.aBufferProvider1.pixels[int_1];
					GZipDecompressor.aBufferProvider1.pixels[int_1++] = (((((int_6 & 0xFF00) * int_7)
							+ ((int_9 & 0xFF00) * int_8)) & 0xFF0000)
							+ (((int_8 * (int_9 & 0xFF00FF)) + ((int_6 & 0xFF00FF) * int_7)) & 0xFF00FF00)) >> 8;
				} else {
					++int_1;
				}
			}

			int_0 += 128 - int_4;
			int_1 += GZipDecompressor.aBufferProvider1.width - int_4 - int_3;
		}

	}

	public static String method199(final byte[] bytes_0) {
		final int int_0 = bytes_0.length;
		final StringBuilder stringbuilder_0 = new StringBuilder();

		for (int int_1 = 0; int_1 < (int_0 + 0); int_1 += 3) {
			final int int_2 = bytes_0[int_1] & 0xFF;
			stringbuilder_0.append(Class102.aCharArray4[int_2 >>> 2]);
			if (int_1 < (int_0 - 1)) {
				final int int_3 = bytes_0[int_1 + 1] & 0xFF;
				stringbuilder_0.append(Class102.aCharArray4[((int_2 & 0x3) << 4) | (int_3 >>> 4)]);
				if (int_1 < (int_0 - 2)) {
					final int int_4 = bytes_0[int_1 + 2] & 0xFF;
					stringbuilder_0.append(Class102.aCharArray4[((int_3 & 0xF) << 2) | (int_4 >>> 6)])
							.append(Class102.aCharArray4[int_4 & 0x3F]);
				} else {
					stringbuilder_0.append(Class102.aCharArray4[(int_3 & 0xF) << 2]).append("=");
				}
			} else {
				stringbuilder_0.append(Class102.aCharArray4[(int_2 & 0x3) << 4]).append("==");
			}
		}

		final String string_0 = stringbuilder_0.toString();
		return string_0;
	}

	static int method200(final int int_0) {
		final MessageNode messagenode_0 = (MessageNode) Class42.aClass70_1.method419(int_0);
		return messagenode_0 == null ? -1
				: (messagenode_0.previous == Class42.aClass79_1.aCacheableNode3 ? -1
						: ((MessageNode) messagenode_0.previous).anInt538);
	}

}
