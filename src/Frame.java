public class Frame {

	static int[] anIntArray50;
	static int[] anIntArray51;
	static int[] anIntArray52;
	static int[] anIntArray53;
	boolean showing;
	FrameMap skin;
	int anInt213;
	int[] anIntArray54;
	int[] translator_x;
	int[] translator_y;
	int[] translator_z;

	static {
		anIntArray50 = new int[500];
		anIntArray51 = new int[500];
		anIntArray52 = new int[500];
		anIntArray53 = new int[500];
	}

	Frame(final byte[] bytes_0, final FrameMap framemap_0) {
		skin = null;
		anInt213 = -1;
		showing = false;
		skin = framemap_0;
		final Buffer buffer_0 = new Buffer(bytes_0);
		final Buffer buffer_1 = new Buffer(bytes_0);
		buffer_0.offset = 2;
		final int int_0 = buffer_0.readUnsignedByte();
		int int_1 = -1;
		int int_2 = 0;
		buffer_1.offset = int_0 + buffer_0.offset;

		int int_3;
		for (int_3 = 0; int_3 < int_0; int_3++) {
			final int int_4 = buffer_0.readUnsignedByte();
			if (int_4 > 0) {
				if (skin.types[int_3] != 0) {
					for (int int_5 = int_3 - 1; int_5 > int_1; --int_5) {
						if (skin.types[int_5] == 0) {
							anIntArray50[int_2] = int_5;
							anIntArray51[int_2] = 0;
							anIntArray52[int_2] = 0;
							anIntArray53[int_2] = 0;
							++int_2;
							break;
						}
					}
				}

				anIntArray50[int_2] = int_3;
				short short_0 = 0;
				if (skin.types[int_3] == 3) {
					short_0 = 128;
				}

				if ((int_4 & 0x1) != 0) {
					anIntArray51[int_2] = buffer_1.readShortSmart();
				} else {
					anIntArray51[int_2] = short_0;
				}

				if ((int_4 & 0x2) != 0) {
					anIntArray52[int_2] = buffer_1.readShortSmart();
				} else {
					anIntArray52[int_2] = short_0;
				}

				if ((int_4 & 0x4) != 0) {
					anIntArray53[int_2] = buffer_1.readShortSmart();
				} else {
					anIntArray53[int_2] = short_0;
				}

				int_1 = int_3;
				++int_2;
				if (skin.types[int_3] == 5) {
					showing = true;
				}
			}
		}

		if (bytes_0.length != buffer_1.offset) {
			throw new RuntimeException();
		} else {
			anInt213 = int_2;
			anIntArray54 = new int[int_2];
			translator_x = new int[int_2];
			translator_y = new int[int_2];
			translator_z = new int[int_2];

			for (int_3 = 0; int_3 < int_2; int_3++) {
				anIntArray54[int_3] = anIntArray50[int_3];
				translator_x[int_3] = anIntArray51[int_3];
				translator_y[int_3] = anIntArray52[int_3];
				translator_z[int_3] = anIntArray53[int_3];
			}

		}
	}

}
