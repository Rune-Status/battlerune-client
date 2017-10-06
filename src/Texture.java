public class Texture extends Node {

	static int[] anIntArray71;
	int[] fileIds;
	int[] pixels;
	boolean aBool41;
	boolean loaded;
	int anInt331;
	int anInt332;
	int[] anIntArray72;
	int anInt333;
	int[] anIntArray73;
	int[] anIntArray74;

	Texture(final Buffer buffer_0) {
		loaded = false;
		anInt332 = buffer_0.readUnsignedShort();
		aBool41 = buffer_0.readUnsignedByte() == 1;
		final int int_0 = buffer_0.readUnsignedByte();
		if ((int_0 >= 1) && (int_0 <= 4)) {
			fileIds = new int[int_0];

			int int_1;
			for (int_1 = 0; int_1 < int_0; int_1++) {
				fileIds[int_1] = buffer_0.readUnsignedShort();
			}

			if (int_0 > 1) {
				anIntArray73 = new int[int_0 - 1];

				for (int_1 = 0; int_1 < (int_0 - 1); int_1++) {
					anIntArray73[int_1] = buffer_0.readUnsignedByte();
				}
			}

			if (int_0 > 1) {
				anIntArray74 = new int[int_0 - 1];

				for (int_1 = 0; int_1 < (int_0 - 1); int_1++) {
					anIntArray74[int_1] = buffer_0.readUnsignedByte();
				}
			}

			anIntArray72 = new int[int_0];

			for (int_1 = 0; int_1 < int_0; int_1++) {
				anIntArray72[int_1] = buffer_0.readInt();
			}

			anInt331 = buffer_0.readUnsignedByte();
			anInt333 = buffer_0.readUnsignedByte();
			pixels = null;
		} else {
			throw new RuntimeException();
		}
	}

	void resetPixels() {
		pixels = null;
	}

	boolean method599(final double double_0, final int int_0, final IndexDataBase indexdatabase_0) {
		int int_1;
		for (int_1 = 0; int_1 < fileIds.length; int_1++) {
			if (indexdatabase_0.method428(fileIds[int_1]) == null) {
				return false;
			}
		}

		int_1 = int_0 * int_0;
		pixels = new int[int_1];

		for (int int_2 = 0; int_2 < fileIds.length; int_2++) {
			final int int_3 = fileIds[int_2];
			byte[] bytes_0 = indexdatabase_0.method434(int_3);
			boolean bool_0;
			if (bytes_0 == null) {
				bool_0 = false;
			} else {
				Class5.decodeSprite(bytes_0);
				bool_0 = true;
			}

			ModIcon modicon_0;
			if (!bool_0) {
				modicon_0 = null;
			} else {
				final ModIcon modicon_1 = new ModIcon();
				modicon_1.width = Class108.anInt216;
				modicon_1.originalHeight = Class108.anInt217;
				modicon_1.offsetX = Class108.anIntArray56[0];
				modicon_1.offsetY = Class12.offsetsY[0];
				modicon_1.originalWidth = Class108.anIntArray57[0];
				modicon_1.height = Class37.anIntArray16[0];
				modicon_1.palette = Class108.anIntArray58;
				modicon_1.pixels = Class66.spritePixels[0];
				Class32.method232();
				modicon_0 = modicon_1;
			}

			modicon_0.method885();
			bytes_0 = modicon_0.pixels;
			final int[] ints_0 = modicon_0.palette;
			final int int_4 = anIntArray72[int_2];
			if ((int_4 & 0xFF000000) == 16777216) {
				;
			}

			if ((int_4 & 0xFF000000) == 33554432) {
				;
			}

			int int_5;
			int int_6;
			int int_7;
			int int_8;
			if ((int_4 & 0xFF000000) == 50331648) {
				int_5 = int_4 & 0xFF00FF;
				int_6 = (int_4 >> 8) & 0xFF;

				for (int_7 = 0; int_7 < ints_0.length; int_7++) {
					int_8 = ints_0[int_7];
					if ((int_8 & 0xFFFF) == (int_8 >> 8)) {
						int_8 &= 0xFF;
						ints_0[int_7] = (((int_5 * int_8) >> 8) & 0xFF00FF) | ((int_6 * int_8) & 0xFF00);
					}
				}
			}

			for (int_5 = 0; int_5 < ints_0.length; int_5++) {
				ints_0[int_5] = Graphics3D.adjustRGB(ints_0[int_5], double_0);
			}

			if (int_2 == 0) {
				int_5 = 0;
			} else {
				int_5 = anIntArray73[int_2 - 1];
			}

			if (int_5 == 0) {
				if (int_0 == modicon_0.originalWidth) {
					for (int_6 = 0; int_6 < int_1; int_6++) {
						pixels[int_6] = ints_0[bytes_0[int_6] & 0xFF];
					}
				} else if ((modicon_0.originalWidth == 64) && (int_0 == 128)) {
					int_6 = 0;

					for (int_7 = 0; int_7 < int_0; int_7++) {
						for (int_8 = 0; int_8 < int_0; int_8++) {
							pixels[int_6++] = ints_0[bytes_0[((int_7 >> 1) << 6) + (int_8 >> 1)] & 0xFF];
						}
					}
				} else {
					if ((modicon_0.originalWidth != 128) || (int_0 != 64)) {
						throw new RuntimeException();
					}

					int_6 = 0;

					for (int_7 = 0; int_7 < int_0; int_7++) {
						for (int_8 = 0; int_8 < int_0; int_8++) {
							pixels[int_6++] = ints_0[bytes_0[(int_8 << 1) + (int_7 << 1 << 7)] & 0xFF];
						}
					}
				}
			}

			if (int_5 == 1) {
				;
			}

			if (int_5 == 2) {
				;
			}

			if (int_5 == 3) {
				;
			}
		}

		return true;
	}

	void method600(final int int_0) {
		if (pixels != null) {
			short short_0;
			int int_1;
			int int_2;
			int int_3;
			int int_4;
			int int_5;
			int[] ints_0;
			if ((anInt331 == 1) || (anInt331 == 3)) {
				if ((anIntArray71 == null) || (anIntArray71.length < pixels.length)) {
					anIntArray71 = new int[pixels.length];
				}

				if (pixels.length == 4096) {
					short_0 = 64;
				} else {
					short_0 = 128;
				}

				int_1 = pixels.length;
				int_2 = short_0 * int_0 * anInt333;
				int_3 = int_1 - 1;
				if (anInt331 == 1) {
					int_2 = -int_2;
				}

				for (int_4 = 0; int_4 < int_1; int_4++) {
					int_5 = (int_4 + int_2) & int_3;
					anIntArray71[int_4] = pixels[int_5];
				}

				ints_0 = pixels;
				pixels = anIntArray71;
				anIntArray71 = ints_0;
			}

			if ((anInt331 == 2) || (anInt331 == 4)) {
				if ((anIntArray71 == null) || (anIntArray71.length < pixels.length)) {
					anIntArray71 = new int[pixels.length];
				}

				if (pixels.length == 4096) {
					short_0 = 64;
				} else {
					short_0 = 128;
				}

				int_1 = pixels.length;
				int_2 = anInt333 * int_0;
				int_3 = short_0 - 1;
				if (anInt331 == 2) {
					int_2 = -int_2;
				}

				for (int_4 = 0; int_4 < int_1; int_4 += short_0) {
					for (int_5 = 0; int_5 < short_0; int_5++) {
						final int int_6 = int_4 + int_5;
						final int int_7 = int_4 + ((int_5 + int_2) & int_3);
						anIntArray71[int_6] = pixels[int_7];
					}
				}

				ints_0 = pixels;
				pixels = anIntArray71;
				anIntArray71 = ints_0;
			}
		}
	}

}
