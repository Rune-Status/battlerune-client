public class Class53 {

	static int anInt131;
	int[][] anIntArrayArray9;
	int anInt132;
	int anInt133;

	public Class53(int int_0, int int_1) {
		if (int_1 != int_0) {
			int int_2 = int_0;
			int int_3 = int_1;
			if (int_1 > int_0) {
				int_2 = int_1;
				int_3 = int_0;
			}

			while (int_3 != 0) {
				final int int_4 = int_2 % int_3;
				int_2 = int_3;
				int_3 = int_4;
			}

			int_0 /= int_2;
			int_1 /= int_2;
			anInt133 = int_0;
			anInt132 = int_1;
			anIntArrayArray9 = new int[int_0][14];

			for (int int_5 = 0; int_5 < int_0; int_5++) {
				final int[] ints_0 = anIntArrayArray9[int_5];
				final double double_0 = ((double) int_5 / (double) int_0) + 6.0D;
				int int_6 = (int) Math.floor(1.0D + (double_0 - 7.0D));
				if (int_6 < 0) {
					int_6 = 0;
				}

				int int_7 = (int) Math.ceil(double_0 + 7.0D);
				if (int_7 > 14) {
					int_7 = 14;
				}

				for (final double double_1 = (double) int_1 / (double) int_0; int_6 < int_7; int_6++) {
					final double double_2 = (int_6 - double_0) * 3.141592653589793D;
					double double_3 = double_1;
					if ((double_2 < -1.0E-4D) || (double_2 > 1.0E-4D)) {
						double_3 = double_1 * (Math.sin(double_2) / double_2);
					}

					double_3 *= 0.54D + (0.46D * Math.cos((int_6 - double_0) * 0.2243994752564138D));
					ints_0[int_6] = (int) Math.floor((double_3 * 65536.0D) + 0.5D);
				}
			}

		}
	}

	byte[] method319(byte[] bytes_0) {
		if (anIntArrayArray9 != null) {
			final int int_0 = (int) (((long) anInt132 * (long) bytes_0.length) / anInt133) + 14;
			final int[] ints_0 = new int[int_0];
			int int_1 = 0;
			int int_2 = 0;

			int int_3;
			for (int_3 = 0; int_3 < bytes_0.length; int_3++) {
				final byte byte_0 = bytes_0[int_3];
				final int[] ints_1 = anIntArrayArray9[int_2];

				int int_4;
				for (int_4 = 0; int_4 < 14; int_4++) {
					ints_0[int_1 + int_4] += byte_0 * ints_1[int_4];
				}

				int_2 += anInt132;
				int_4 = int_2 / anInt133;
				int_1 += int_4;
				int_2 -= int_4 * anInt133;
			}

			bytes_0 = new byte[int_0];

			for (int_3 = 0; int_3 < int_0; int_3++) {
				final int int_5 = (ints_0[int_3] + 32768) >> 16;
				if (int_5 < -128) {
					bytes_0[int_3] = -128;
				} else if (int_5 > 127) {
					bytes_0[int_3] = 127;
				} else {
					bytes_0[int_3] = (byte) int_5;
				}
			}
		}

		return bytes_0;
	}

	int method320(int int_0) {
		if (anIntArrayArray9 != null) {
			int_0 = (int) (((long) anInt132 * (long) int_0) / anInt133);
		}

		return int_0;
	}

	int method321(int int_0) {
		if (anIntArrayArray9 != null) {
			int_0 = (int) (((long) int_0 * (long) anInt132) / anInt133) + 6;
		}

		return int_0;
	}

	public static FloorUnderlayDefinition method322(final int int_0) {
		FloorUnderlayDefinition floorunderlaydefinition_0 = (FloorUnderlayDefinition) FloorUnderlayDefinition.underlays
				.get(int_0);
		if (floorunderlaydefinition_0 != null) {
			return floorunderlaydefinition_0;
		} else {
			final byte[] bytes_0 = FloorUnderlayDefinition.underlay_ref.getConfigData(1, int_0);
			floorunderlaydefinition_0 = new FloorUnderlayDefinition();
			if (bytes_0 != null) {
				floorunderlaydefinition_0.decode(new Buffer(bytes_0), int_0);
			}

			floorunderlaydefinition_0.post();
			FloorUnderlayDefinition.underlays.put(floorunderlaydefinition_0, int_0);
			return floorunderlaydefinition_0;
		}
	}

	static void method323() {
		Class42.chatLineMap.clear();
		Class42.aClass70_1.method423();
		Class42.aClass79_1.method458();
		Class42.anInt97 = 0;
	}

	static final int adjustHSLListness0(final int int_0, int int_1) {
		if (int_0 == -2) {
			return 12345678;
		} else if (int_0 == -1) {
			if (int_1 < 2) {
				int_1 = 2;
			} else if (int_1 > 126) {
				int_1 = 126;
			}

			return int_1;
		} else {
			int_1 = ((int_0 & 0x7F) * int_1) / 128;
			if (int_1 < 2) {
				int_1 = 2;
			} else if (int_1 > 126) {
				int_1 = 126;
			}

			return (int_0 & 0xFF80) + int_1;
		}
	}

}
