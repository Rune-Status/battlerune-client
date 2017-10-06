public class Model extends Renderable {

	static boolean[] aBoolArray6;
	static int[] anIntArray114;
	static int[] anIntArray115;
	static Model aModel1;
	static byte[] aByteArray22;
	static Model aModel2;
	static int anInt590;
	static byte[] aByteArray23;
	static int[] anIntArray116;
	static int anInt591;
	static boolean[] aBoolArray7;
	static int anInt592;
	static int[] anIntArray117;
	static int[] anIntArray118;
	static int[] anIntArray119;
	static int[] yViewportBuffer;
	static int[] anIntArray120;
	static int[] anIntArray121;
	static int[] anIntArray122;
	static int[][] anIntArrayArray15;
	static int[] anIntArray123;
	static int[] anIntArray124;
	static int[] anIntArray125;
	static int[] xViewportBuffer;
	static int[] anIntArray126;
	static int[] anIntArray127;
	static int[][] anIntArrayArray16;
	static int[] anIntArray128;
	static int[] anIntArray129;
	public static boolean aBool65;
	int anInt593;
	public int anInt594;
	int anInt595;
	int[][] anIntArrayArray17;
	int anInt596;
	public int anInt597;
	int[] indices1;
	int XYZMag;
	int anInt598;
	int[] verticesX;
	int[] verticesZ;
	int[] indices2;
	int[] indices3;
	int[] verticesY;
	int[][] anIntArrayArray18;
	byte aByte5;
	int anInt599;
	int anInt600;
	byte[] aByteArray24;
	public int anInt601;
	int[] anIntArray130;
	byte[] aByteArray25;
	int[] anIntArray131;
	public int anInt602;
	public boolean aBool66;
	int[] anIntArray132;
	short[] aShortArray11;
	public int anInt603;
	int anInt604;
	public int anInt605;
	byte[] aByteArray26;
	int[] anIntArray133;
	int[] anIntArray134;
	int[] anIntArray135;

	static {
		aModel2 = new Model();
		aByteArray23 = new byte[1];
		aModel1 = new Model();
		aByteArray22 = new byte[1];
		aBoolArray7 = new boolean[4700];
		aBoolArray6 = new boolean[4700];
		anIntArray121 = new int[4700];
		anIntArray124 = new int[4700];
		anIntArray126 = new int[4700];
		yViewportBuffer = new int[4700];
		anIntArray122 = new int[4700];
		anIntArray117 = new int[4700];
		anIntArray114 = new int[1600];
		anIntArrayArray15 = new int[1600][512];
		anIntArray118 = new int[12];
		anIntArrayArray16 = new int[12][2000];
		anIntArray128 = new int[2000];
		anIntArray129 = new int[2000];
		anIntArray120 = new int[12];
		anIntArray119 = new int[10];
		anIntArray123 = new int[10];
		xViewportBuffer = new int[10];
		aBool65 = true;
		anIntArray115 = Graphics3D.SINE;
		anIntArray116 = Graphics3D.COSINE;
		anIntArray127 = Graphics3D.colorPalette;
		anIntArray125 = Graphics3D.anIntArray113;
	}

	Model() {
		anInt596 = 0;
		anInt598 = 0;
		aByte5 = 0;
		anInt600 = 0;
		aBool66 = false;
		anInt594 = -1;
		anInt602 = -1;
		anInt605 = -1;
	}

	public Model(final Model[] models_0, final int int_0) {
		anInt596 = 0;
		anInt598 = 0;
		aByte5 = 0;
		anInt600 = 0;
		aBool66 = false;
		anInt594 = -1;
		anInt602 = -1;
		anInt605 = -1;
		boolean bool_0 = false;
		boolean bool_1 = false;
		boolean bool_2 = false;
		boolean bool_3 = false;
		anInt596 = 0;
		anInt598 = 0;
		anInt600 = 0;
		aByte5 = -1;

		int int_1;
		Model model_1;
		for (int_1 = 0; int_1 < int_0; int_1++) {
			model_1 = models_0[int_1];
			if (model_1 != null) {
				anInt596 += model_1.anInt596;
				anInt598 += model_1.anInt598;
				anInt600 += model_1.anInt600;
				if (model_1.aByteArray25 != null) {
					bool_0 = true;
				} else {
					if (aByte5 == -1) {
						aByte5 = model_1.aByte5;
					}

					if (aByte5 != model_1.aByte5) {
						bool_0 = true;
					}
				}

				bool_1 |= model_1.aByteArray24 != null;
				bool_2 |= model_1.aShortArray11 != null;
				bool_3 |= model_1.aByteArray26 != null;
			}
		}

		verticesX = new int[anInt596];
		verticesY = new int[anInt596];
		verticesZ = new int[anInt596];
		indices1 = new int[anInt598];
		indices2 = new int[anInt598];
		indices3 = new int[anInt598];
		anIntArray130 = new int[anInt598];
		anIntArray132 = new int[anInt598];
		anIntArray131 = new int[anInt598];
		if (bool_0) {
			aByteArray25 = new byte[anInt598];
		}

		if (bool_1) {
			aByteArray24 = new byte[anInt598];
		}

		if (bool_2) {
			aShortArray11 = new short[anInt598];
		}

		if (bool_3) {
			aByteArray26 = new byte[anInt598];
		}

		if (anInt600 > 0) {
			anIntArray133 = new int[anInt600];
			anIntArray134 = new int[anInt600];
			anIntArray135 = new int[anInt600];
		}

		anInt596 = 0;
		anInt598 = 0;
		anInt600 = 0;

		for (int_1 = 0; int_1 < int_0; int_1++) {
			model_1 = models_0[int_1];
			if (model_1 != null) {
				int int_2;
				for (int_2 = 0; int_2 < model_1.anInt598; int_2++) {
					indices1[anInt598] = anInt596 + model_1.indices1[int_2];
					indices2[anInt598] = anInt596 + model_1.indices2[int_2];
					indices3[anInt598] = anInt596 + model_1.indices3[int_2];
					anIntArray130[anInt598] = model_1.anIntArray130[int_2];
					anIntArray132[anInt598] = model_1.anIntArray132[int_2];
					anIntArray131[anInt598] = model_1.anIntArray131[int_2];
					if (bool_0) {
						if (model_1.aByteArray25 != null) {
							aByteArray25[anInt598] = model_1.aByteArray25[int_2];
						} else {
							aByteArray25[anInt598] = model_1.aByte5;
						}
					}

					if (bool_1 && (model_1.aByteArray24 != null)) {
						aByteArray24[anInt598] = model_1.aByteArray24[int_2];
					}

					if (bool_2) {
						if (model_1.aShortArray11 != null) {
							aShortArray11[anInt598] = model_1.aShortArray11[int_2];
						} else {
							aShortArray11[anInt598] = -1;
						}
					}

					if (bool_3) {
						if ((model_1.aByteArray26 != null) && (model_1.aByteArray26[int_2] != -1)) {
							aByteArray26[anInt598] = (byte) (anInt600 + model_1.aByteArray26[int_2]);
						} else {
							aByteArray26[anInt598] = -1;
						}
					}

					++anInt598;
				}

				for (int_2 = 0; int_2 < model_1.anInt600; int_2++) {
					anIntArray133[anInt600] = anInt596 + model_1.anIntArray133[int_2];
					anIntArray134[anInt600] = anInt596 + model_1.anIntArray134[int_2];
					anIntArray135[anInt600] = anInt596 + model_1.anIntArray135[int_2];
					++anInt600;
				}

				for (int_2 = 0; int_2 < model_1.anInt596; int_2++) {
					verticesX[anInt596] = model_1.verticesX[int_2];
					verticesY[anInt596] = model_1.verticesY[int_2];
					verticesZ[anInt596] = model_1.verticesZ[int_2];
					++anInt596;
				}
			}
		}

	}

	public void method942() {
		if (anInt595 != 1) {
			anInt595 = 1;
			super.modelHeight = 0;
			anInt599 = 0;
			XYZMag = 0;

			for (int int_0 = 0; int_0 < anInt596; int_0++) {
				final int int_1 = verticesX[int_0];
				final int int_2 = verticesY[int_0];
				final int int_3 = verticesZ[int_0];
				if (-int_2 > super.modelHeight) {
					super.modelHeight = -int_2;
				}

				if (int_2 > anInt599) {
					anInt599 = int_2;
				}

				final int int_4 = (int_1 * int_1) + (int_3 * int_3);
				if (int_4 > XYZMag) {
					XYZMag = int_4;
				}
			}

			XYZMag = (int) (Math.sqrt(XYZMag) + 0.99D);
			anInt604 = (int) (Math.sqrt((XYZMag * XYZMag) + (super.modelHeight * super.modelHeight)) + 0.99D);
			anInt593 = anInt604 + (int) (Math.sqrt((XYZMag * XYZMag) + (anInt599 * anInt599)) + 0.99D);
		}
	}

	final void method943(final int int_0) {
		final int int_1 = Graphics3D.centerX;
		final int int_2 = Graphics3D.centerY;
		int int_3 = 0;
		final int int_4 = indices1[int_0];
		final int int_5 = indices2[int_0];
		final int int_6 = indices3[int_0];
		final int int_7 = anIntArray117[int_4];
		final int int_8 = anIntArray117[int_5];
		final int int_9 = anIntArray117[int_6];
		if (aByteArray24 == null) {
			Graphics3D.rasterAlpha = 0;
		} else {
			Graphics3D.rasterAlpha = aByteArray24[int_0] & 0xFF;
		}

		int int_10;
		int int_11;
		int int_12;
		int int_13;
		if (int_7 >= 50) {
			anIntArray119[int_3] = anIntArray121[int_4];
			anIntArray123[int_3] = anIntArray124[int_4];
			xViewportBuffer[int_3++] = anIntArray130[int_0];
		} else {
			int_10 = yViewportBuffer[int_4];
			int_11 = anIntArray122[int_4];
			int_12 = anIntArray130[int_0];
			if (int_9 >= 50) {
				int_13 = anIntArray125[int_9 - int_7] * (50 - int_7);
				anIntArray119[int_3] = int_1
						+ ((Graphics3D.anInt578 * (int_10 + (((yViewportBuffer[int_6] - int_10) * int_13) >> 16)))
								/ 50);
				anIntArray123[int_3] = int_2
						+ ((Graphics3D.anInt578 * (int_11 + (((anIntArray122[int_6] - int_11) * int_13) >> 16))) / 50);
				xViewportBuffer[int_3++] = int_12 + (((anIntArray131[int_0] - int_12) * int_13) >> 16);
			}

			if (int_8 >= 50) {
				int_13 = anIntArray125[int_8 - int_7] * (50 - int_7);
				anIntArray119[int_3] = int_1
						+ ((Graphics3D.anInt578 * (int_10 + (((yViewportBuffer[int_5] - int_10) * int_13) >> 16)))
								/ 50);
				anIntArray123[int_3] = int_2
						+ ((Graphics3D.anInt578 * (int_11 + (((anIntArray122[int_5] - int_11) * int_13) >> 16))) / 50);
				xViewportBuffer[int_3++] = int_12 + (((anIntArray132[int_0] - int_12) * int_13) >> 16);
			}
		}

		if (int_8 >= 50) {
			anIntArray119[int_3] = anIntArray121[int_5];
			anIntArray123[int_3] = anIntArray124[int_5];
			xViewportBuffer[int_3++] = anIntArray132[int_0];
		} else {
			int_10 = yViewportBuffer[int_5];
			int_11 = anIntArray122[int_5];
			int_12 = anIntArray132[int_0];
			if (int_7 >= 50) {
				int_13 = anIntArray125[int_7 - int_8] * (50 - int_8);
				anIntArray119[int_3] = int_1
						+ ((Graphics3D.anInt578 * (int_10 + (((yViewportBuffer[int_4] - int_10) * int_13) >> 16)))
								/ 50);
				anIntArray123[int_3] = int_2
						+ ((Graphics3D.anInt578 * (int_11 + (((anIntArray122[int_4] - int_11) * int_13) >> 16))) / 50);
				xViewportBuffer[int_3++] = int_12 + (((anIntArray130[int_0] - int_12) * int_13) >> 16);
			}

			if (int_9 >= 50) {
				int_13 = anIntArray125[int_9 - int_8] * (50 - int_8);
				anIntArray119[int_3] = int_1
						+ ((Graphics3D.anInt578 * (int_10 + (((yViewportBuffer[int_6] - int_10) * int_13) >> 16)))
								/ 50);
				anIntArray123[int_3] = int_2
						+ ((Graphics3D.anInt578 * (int_11 + (((anIntArray122[int_6] - int_11) * int_13) >> 16))) / 50);
				xViewportBuffer[int_3++] = int_12 + (((anIntArray131[int_0] - int_12) * int_13) >> 16);
			}
		}

		if (int_9 >= 50) {
			anIntArray119[int_3] = anIntArray121[int_6];
			anIntArray123[int_3] = anIntArray124[int_6];
			xViewportBuffer[int_3++] = anIntArray131[int_0];
		} else {
			int_10 = yViewportBuffer[int_6];
			int_11 = anIntArray122[int_6];
			int_12 = anIntArray131[int_0];
			if (int_8 >= 50) {
				int_13 = anIntArray125[int_8 - int_9] * (50 - int_9);
				anIntArray119[int_3] = int_1
						+ ((Graphics3D.anInt578 * (int_10 + (((yViewportBuffer[int_5] - int_10) * int_13) >> 16)))
								/ 50);
				anIntArray123[int_3] = int_2
						+ ((Graphics3D.anInt578 * (int_11 + (((anIntArray122[int_5] - int_11) * int_13) >> 16))) / 50);
				xViewportBuffer[int_3++] = int_12 + (((anIntArray132[int_0] - int_12) * int_13) >> 16);
			}

			if (int_7 >= 50) {
				int_13 = anIntArray125[int_7 - int_9] * (50 - int_9);
				anIntArray119[int_3] = int_1
						+ ((Graphics3D.anInt578 * (int_10 + (((yViewportBuffer[int_4] - int_10) * int_13) >> 16)))
								/ 50);
				anIntArray123[int_3] = int_2
						+ ((Graphics3D.anInt578 * (int_11 + (((anIntArray122[int_4] - int_11) * int_13) >> 16))) / 50);
				xViewportBuffer[int_3++] = int_12 + (((anIntArray130[int_0] - int_12) * int_13) >> 16);
			}
		}

		int_10 = anIntArray119[0];
		int_11 = anIntArray119[1];
		int_12 = anIntArray119[2];
		int_13 = anIntArray123[0];
		final int int_14 = anIntArray123[1];
		final int int_15 = anIntArray123[2];
		Graphics3D.rasterClipEnable = false;
		int int_16;
		int int_17;
		int int_18;
		int int_19;
		if (int_3 == 3) {
			if ((int_10 < 0) || (int_11 < 0) || (int_12 < 0) || (int_10 > Graphics3D.rasterClipX)
					|| (int_11 > Graphics3D.rasterClipX) || (int_12 > Graphics3D.rasterClipX)) {
				Graphics3D.rasterClipEnable = true;
			}

			if ((aShortArray11 != null) && (aShortArray11[int_0] != -1)) {
				if ((aByteArray26 != null) && (aByteArray26[int_0] != -1)) {
					int_17 = aByteArray26[int_0] & 0xFF;
					int_16 = anIntArray133[int_17];
					int_18 = anIntArray134[int_17];
					int_19 = anIntArray135[int_17];
				} else {
					int_16 = int_4;
					int_18 = int_5;
					int_19 = int_6;
				}

				if (anIntArray131[int_0] == -1) {
					Graphics3D.rasterTextureAffine(int_13, int_14, int_15, int_10, int_11, int_12, anIntArray130[int_0],
							anIntArray130[int_0], anIntArray130[int_0], yViewportBuffer[int_16],
							yViewportBuffer[int_18], yViewportBuffer[int_19], anIntArray122[int_16],
							anIntArray122[int_18], anIntArray122[int_19], anIntArray117[int_16], anIntArray117[int_18],
							anIntArray117[int_19], aShortArray11[int_0]);
				} else {
					Graphics3D.rasterTextureAffine(int_13, int_14, int_15, int_10, int_11, int_12, xViewportBuffer[0],
							xViewportBuffer[1], xViewportBuffer[2], yViewportBuffer[int_16], yViewportBuffer[int_18],
							yViewportBuffer[int_19], anIntArray122[int_16], anIntArray122[int_18],
							anIntArray122[int_19], anIntArray117[int_16], anIntArray117[int_18], anIntArray117[int_19],
							aShortArray11[int_0]);
				}
			} else if (anIntArray131[int_0] == -1) {
				Graphics3D.rasterFlat(int_13, int_14, int_15, int_10, int_11, int_12,
						anIntArray127[anIntArray130[int_0]]);
			} else {
				Graphics3D.rasterGouraud(int_13, int_14, int_15, int_10, int_11, int_12, xViewportBuffer[0],
						xViewportBuffer[1], xViewportBuffer[2]);
			}
		}

		if (int_3 == 4) {
			if ((int_10 < 0) || (int_11 < 0) || (int_12 < 0) || (int_10 > Graphics3D.rasterClipX)
					|| (int_11 > Graphics3D.rasterClipX) || (int_12 > Graphics3D.rasterClipX) || (anIntArray119[3] < 0)
					|| (anIntArray119[3] > Graphics3D.rasterClipX)) {
				Graphics3D.rasterClipEnable = true;
			}

			if ((aShortArray11 != null) && (aShortArray11[int_0] != -1)) {
				if ((aByteArray26 != null) && (aByteArray26[int_0] != -1)) {
					int_17 = aByteArray26[int_0] & 0xFF;
					int_16 = anIntArray133[int_17];
					int_18 = anIntArray134[int_17];
					int_19 = anIntArray135[int_17];
				} else {
					int_16 = int_4;
					int_18 = int_5;
					int_19 = int_6;
				}

				final short short_0 = aShortArray11[int_0];
				if (anIntArray131[int_0] == -1) {
					Graphics3D.rasterTextureAffine(int_13, int_14, int_15, int_10, int_11, int_12, anIntArray130[int_0],
							anIntArray130[int_0], anIntArray130[int_0], yViewportBuffer[int_16],
							yViewportBuffer[int_18], yViewportBuffer[int_19], anIntArray122[int_16],
							anIntArray122[int_18], anIntArray122[int_19], anIntArray117[int_16], anIntArray117[int_18],
							anIntArray117[int_19], short_0);
					Graphics3D.rasterTextureAffine(int_13, int_15, anIntArray123[3], int_10, int_12, anIntArray119[3],
							anIntArray130[int_0], anIntArray130[int_0], anIntArray130[int_0], yViewportBuffer[int_16],
							yViewportBuffer[int_18], yViewportBuffer[int_19], anIntArray122[int_16],
							anIntArray122[int_18], anIntArray122[int_19], anIntArray117[int_16], anIntArray117[int_18],
							anIntArray117[int_19], short_0);
				} else {
					Graphics3D.rasterTextureAffine(int_13, int_14, int_15, int_10, int_11, int_12, xViewportBuffer[0],
							xViewportBuffer[1], xViewportBuffer[2], yViewportBuffer[int_16], yViewportBuffer[int_18],
							yViewportBuffer[int_19], anIntArray122[int_16], anIntArray122[int_18],
							anIntArray122[int_19], anIntArray117[int_16], anIntArray117[int_18], anIntArray117[int_19],
							short_0);
					Graphics3D.rasterTextureAffine(int_13, int_15, anIntArray123[3], int_10, int_12, anIntArray119[3],
							xViewportBuffer[0], xViewportBuffer[2], xViewportBuffer[3], yViewportBuffer[int_16],
							yViewportBuffer[int_18], yViewportBuffer[int_19], anIntArray122[int_16],
							anIntArray122[int_18], anIntArray122[int_19], anIntArray117[int_16], anIntArray117[int_18],
							anIntArray117[int_19], short_0);
				}
			} else if (anIntArray131[int_0] == -1) {
				int_16 = anIntArray127[anIntArray130[int_0]];
				Graphics3D.rasterFlat(int_13, int_14, int_15, int_10, int_11, int_12, int_16);
				Graphics3D.rasterFlat(int_13, int_15, anIntArray123[3], int_10, int_12, anIntArray119[3], int_16);
			} else {
				Graphics3D.rasterGouraud(int_13, int_14, int_15, int_10, int_11, int_12, xViewportBuffer[0],
						xViewportBuffer[1], xViewportBuffer[2]);
				Graphics3D.rasterGouraud(int_13, int_15, anIntArray123[3], int_10, int_12, anIntArray119[3],
						xViewportBuffer[0], xViewportBuffer[2], xViewportBuffer[3]);
			}
		}
	}

	public void method944(final Frames frames_0, final int int_0) {
		if (anIntArrayArray17 != null) {
			final Frame frame_0 = frames_0.skeletons[int_0];
			final FrameMap framemap_0 = frame_0.skin;
			anInt590 = 0;
			anInt591 = 0;
			anInt592 = 0;

			for (int int_1 = 0; int_1 < frame_0.anInt213; int_1++) {
				final int int_2 = frame_0.anIntArray54[int_1];
				method958(framemap_0.types[int_2], framemap_0.list[int_2], frame_0.translator_x[int_1],
						frame_0.translator_y[int_1], frame_0.translator_z[int_1]);
			}

			method945();
		}
	}

	void method945() {
		anInt595 = 0;
		anInt594 = -1;
	}

	Model method946(final boolean bool_0, final Model model_1, final byte[] bytes_0) {
		model_1.anInt596 = anInt596;
		model_1.anInt598 = anInt598;
		model_1.anInt600 = anInt600;
		if ((model_1.verticesX == null) || (model_1.verticesX.length < anInt596)) {
			model_1.verticesX = new int[anInt596 + 100];
			model_1.verticesY = new int[anInt596 + 100];
			model_1.verticesZ = new int[anInt596 + 100];
		}

		int int_0;
		for (int_0 = 0; int_0 < anInt596; int_0++) {
			model_1.verticesX[int_0] = verticesX[int_0];
			model_1.verticesY[int_0] = verticesY[int_0];
			model_1.verticesZ[int_0] = verticesZ[int_0];
		}

		if (bool_0) {
			model_1.aByteArray24 = aByteArray24;
		} else {
			model_1.aByteArray24 = bytes_0;
			if (aByteArray24 == null) {
				for (int_0 = 0; int_0 < anInt598; int_0++) {
					model_1.aByteArray24[int_0] = 0;
				}
			} else {
				for (int_0 = 0; int_0 < anInt598; int_0++) {
					model_1.aByteArray24[int_0] = aByteArray24[int_0];
				}
			}
		}

		model_1.indices1 = indices1;
		model_1.indices2 = indices2;
		model_1.indices3 = indices3;
		model_1.anIntArray130 = anIntArray130;
		model_1.anIntArray132 = anIntArray132;
		model_1.anIntArray131 = anIntArray131;
		model_1.aByteArray25 = aByteArray25;
		model_1.aByteArray26 = aByteArray26;
		model_1.aShortArray11 = aShortArray11;
		model_1.aByte5 = aByte5;
		model_1.anIntArray133 = anIntArray133;
		model_1.anIntArray134 = anIntArray134;
		model_1.anIntArray135 = anIntArray135;
		model_1.anIntArrayArray17 = anIntArrayArray17;
		model_1.anIntArrayArray18 = anIntArrayArray18;
		model_1.aBool66 = aBool66;
		model_1.method945();
		return model_1;
	}

	void method947(final int int_0) {
		if (anInt594 == -1) {
			int int_1 = 0;
			int int_2 = 0;
			int int_3 = 0;
			int int_4 = 0;
			int int_5 = 0;
			int int_6 = 0;
			final int int_7 = anIntArray116[int_0];
			final int int_8 = anIntArray115[int_0];

			for (int int_9 = 0; int_9 < anInt596; int_9++) {
				final int int_10 = Graphics3D.method896(verticesX[int_9], verticesZ[int_9], int_7, int_8);
				final int int_11 = verticesY[int_9];
				final int int_12 = Graphics3D.method897(verticesX[int_9], verticesZ[int_9], int_7, int_8);
				if (int_10 < int_1) {
					int_1 = int_10;
				}

				if (int_10 > int_4) {
					int_4 = int_10;
				}

				if (int_11 < int_2) {
					int_2 = int_11;
				}

				if (int_11 > int_5) {
					int_5 = int_11;
				}

				if (int_12 < int_3) {
					int_3 = int_12;
				}

				if (int_12 > int_6) {
					int_6 = int_12;
				}
			}

			anInt597 = (int_4 + int_1) / 2;
			anInt601 = (int_5 + int_2) / 2;
			anInt603 = (int_6 + int_3) / 2;
			anInt594 = ((int_4 - int_1) + 1) / 2;
			anInt602 = ((int_5 - int_2) + 1) / 2;
			anInt605 = ((int_6 - int_3) + 1) / 2;
			if (anInt594 < 32) {
				anInt594 = 32;
			}

			if (anInt605 < 32) {
				anInt605 = 32;
			}

			if (aBool66) {
				anInt594 += 8;
				anInt605 += 8;
			}

		}
	}

	public Model method948(final boolean bool_0) {
		if (!bool_0 && (aByteArray23.length < anInt598)) {
			aByteArray23 = new byte[anInt598 + 100];
		}

		return method946(bool_0, aModel2, aByteArray23);
	}

	void method949() {
		if (anInt595 != 2) {
			anInt595 = 2;
			XYZMag = 0;

			for (int int_0 = 0; int_0 < anInt596; int_0++) {
				final int int_1 = verticesX[int_0];
				final int int_2 = verticesY[int_0];
				final int int_3 = verticesZ[int_0];
				final int int_4 = (int_2 * int_2) + (int_1 * int_1) + (int_3 * int_3);
				if (int_4 > XYZMag) {
					XYZMag = int_4;
				}
			}

			XYZMag = (int) (Math.sqrt(XYZMag) + 0.99D);
			anInt604 = XYZMag;
			anInt593 = XYZMag + XYZMag;
		}
	}

	public Model method950(final boolean bool_0) {
		if (!bool_0 && (aByteArray22.length < anInt598)) {
			aByteArray22 = new byte[anInt598 + 100];
		}

		return method946(bool_0, aModel1, aByteArray22);
	}

	public void method951(final int int_0) {
		final int int_1 = anIntArray115[int_0];
		final int int_2 = anIntArray116[int_0];

		for (int int_3 = 0; int_3 < anInt596; int_3++) {
			final int int_4 = ((int_2 * verticesY[int_3]) - (int_1 * verticesZ[int_3])) >> 16;
			verticesZ[int_3] = ((int_1 * verticesY[int_3]) + (int_2 * verticesZ[int_3])) >> 16;
			verticesY[int_3] = int_4;
		}

		method945();
	}

	public Model method952(final int[][] ints_0, final int int_0, final int int_1, final int int_2,
			final boolean bool_0, final int int_3) {
		method942();
		int int_4 = int_0 - XYZMag;
		int int_5 = int_0 + XYZMag;
		int int_6 = int_2 - XYZMag;
		int int_7 = int_2 + XYZMag;
		if ((int_4 >= 0) && (((int_5 + 128) >> 7) < ints_0.length) && (int_6 >= 0)
				&& (((int_7 + 128) >> 7) < ints_0[0].length)) {
			int_4 >>= 7;
			int_5 = (int_5 + 127) >> 7;
			int_6 >>= 7;
			int_7 = (int_7 + 127) >> 7;
			if ((int_1 == ints_0[int_4][int_6]) && (int_1 == ints_0[int_5][int_6]) && (int_1 == ints_0[int_4][int_7])
					&& (int_1 == ints_0[int_5][int_7])) {
				return this;
			} else {
				Model model_1;
				if (bool_0) {
					model_1 = new Model();
					model_1.anInt596 = anInt596;
					model_1.anInt598 = anInt598;
					model_1.anInt600 = anInt600;
					model_1.verticesX = verticesX;
					model_1.verticesZ = verticesZ;
					model_1.indices1 = indices1;
					model_1.indices2 = indices2;
					model_1.indices3 = indices3;
					model_1.anIntArray130 = anIntArray130;
					model_1.anIntArray132 = anIntArray132;
					model_1.anIntArray131 = anIntArray131;
					model_1.aByteArray25 = aByteArray25;
					model_1.aByteArray24 = aByteArray24;
					model_1.aByteArray26 = aByteArray26;
					model_1.aShortArray11 = aShortArray11;
					model_1.aByte5 = aByte5;
					model_1.anIntArray133 = anIntArray133;
					model_1.anIntArray134 = anIntArray134;
					model_1.anIntArray135 = anIntArray135;
					model_1.anIntArrayArray17 = anIntArrayArray17;
					model_1.anIntArrayArray18 = anIntArrayArray18;
					model_1.aBool66 = aBool66;
					model_1.verticesY = new int[model_1.anInt596];
				} else {
					model_1 = this;
				}

				int int_8;
				int int_9;
				int int_10;
				int int_11;
				int int_12;
				int int_13;
				int int_14;
				int int_15;
				int int_16;
				int int_17;
				if (int_3 == 0) {
					for (int_8 = 0; int_8 < model_1.anInt596; int_8++) {
						int_9 = int_0 + verticesX[int_8];
						int_10 = int_2 + verticesZ[int_8];
						int_11 = int_9 & 0x7F;
						int_12 = int_10 & 0x7F;
						int_13 = int_9 >> 7;
						int_14 = int_10 >> 7;
						int_15 = ((int_11 * ints_0[int_13 + 1][int_14])
								+ (ints_0[int_13][int_14] * (128 - int_11))) >> 7;
						int_16 = ((ints_0[int_13 + 1][int_14 + 1] * int_11)
								+ (ints_0[int_13][int_14 + 1] * (128 - int_11))) >> 7;
						int_17 = ((int_15 * (128 - int_12)) + (int_16 * int_12)) >> 7;
						model_1.verticesY[int_8] = (int_17 + verticesY[int_8]) - int_1;
					}
				} else {
					for (int_8 = 0; int_8 < model_1.anInt596; int_8++) {
						int_9 = (-verticesY[int_8] << 16) / super.modelHeight;
						if (int_9 < int_3) {
							int_10 = int_0 + verticesX[int_8];
							int_11 = int_2 + verticesZ[int_8];
							int_12 = int_10 & 0x7F;
							int_13 = int_11 & 0x7F;
							int_14 = int_10 >> 7;
							int_15 = int_11 >> 7;
							int_16 = ((int_12 * ints_0[int_14 + 1][int_15])
									+ (ints_0[int_14][int_15] * (128 - int_12))) >> 7;
							int_17 = ((int_12 * ints_0[int_14 + 1][int_15 + 1])
									+ (ints_0[int_14][int_15 + 1] * (128 - int_12))) >> 7;
							final int int_18 = ((int_16 * (128 - int_13)) + (int_17 * int_13)) >> 7;
							model_1.verticesY[int_8] = (((int_3 - int_9) * (int_18 - int_1)) / int_3)
									+ verticesY[int_8];
						}
					}
				}

				model_1.method945();
				return model_1;
			}
		} else {
			return this;
		}
	}

	public void method953() {
		for (int int_0 = 0; int_0 < anInt596; int_0++) {
			final int int_1 = verticesZ[int_0];
			verticesZ[int_0] = verticesX[int_0];
			verticesX[int_0] = -int_1;
		}

		method945();
	}

	@Override
	void draw(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final int int_6, final int int_7, final int int_8) {
		anIntArray114[0] = -1;
		if (anInt595 != 1) {
			method942();
		}

		method947(int_0);
		final int int_9 = ((int_4 * int_7) - (int_3 * int_5)) >> 16;
		final int int_10 = ((int_1 * int_6) + (int_2 * int_9)) >> 16;
		final int int_11 = (int_2 * XYZMag) >> 16;
		final int int_12 = int_10 + int_11;
		if (int_12 > 50) {
			if (int_10 < 3500) {
				final int int_13 = ((int_7 * int_3) + (int_4 * int_5)) >> 16;
				int int_14 = (int_13 - XYZMag) * Graphics3D.anInt578;
				if ((int_14 / int_12) < Graphics3D.anInt579) {
					int int_15 = (int_13 + XYZMag) * Graphics3D.anInt578;
					if ((int_15 / int_12) > Graphics3D.anInt580) {
						final int int_16 = ((int_2 * int_6) - (int_9 * int_1)) >> 16;
						final int int_17 = (int_1 * XYZMag) >> 16;
						int int_18 = (int_16 + int_17) * Graphics3D.anInt578;
						if ((int_18 / int_12) > Graphics3D.anInt581) {
							final int int_19 = ((super.modelHeight * int_2) >> 16) + int_17;
							int int_20 = (int_16 - int_19) * Graphics3D.anInt578;
							if ((int_20 / int_12) < Graphics3D.anInt583) {
								final int int_21 = int_11 + ((int_1 * super.modelHeight) >> 16);
								boolean bool_0 = false;
								boolean bool_1 = false;
								if ((int_10 - int_21) <= 50) {
									bool_1 = true;
								}

								final boolean bool_2 = bool_1 || (anInt600 > 0);
								final int int_22 = Class102.method500();
								final int int_23 = Class56.anInt144;
								final boolean bool_3 = Class2.method79();
								if (Class46.aBool11 && (int_8 > 0)) {
									if (Class44.method265(this, int_5, int_6, int_7)) {
										Class87.method467(this, int_5, int_6, int_7, -65281);
									} else if (Class49.aClass49_3 == Class46.aClass49_1) {
										Class87.method467(this, int_5, int_6, int_7, -16776961);
									}
								}

								int int_25;
								int int_26;
								int int_27;
								int int_28;
								int int_29;
								int int_30;
								int int_31;
								int int_32;
								int int_33;
								if (Class46.aBool12 && (int_8 > 0)) {
									int int_24 = int_10 - int_11;
									if (int_24 <= 50) {
										int_24 = 50;
									}

									if (int_13 > 0) {
										int_25 = int_14 / int_12;
										int_26 = int_15 / int_24;
									} else {
										int_26 = int_15 / int_12;
										int_25 = int_14 / int_24;
									}

									if (int_16 > 0) {
										int_27 = int_20 / int_12;
										int_28 = int_18 / int_24;
									} else {
										int_28 = int_18 / int_12;
										int_27 = int_20 / int_24;
									}

									int_29 = -8355840;
									int_30 = int_22 - Graphics3D.centerX;
									int_31 = int_23 - Graphics3D.centerY;
									if ((int_30 > int_25) && (int_30 < int_26) && (int_31 > int_27)
											&& (int_31 < int_28)) {
										int_29 = -256;
									}

									int_32 = int_25 + Graphics3D.centerX;
									int_33 = int_27 + Graphics3D.centerY;
									final int int_34 = int_26 + Graphics3D.centerX;
									final int int_35 = int_28 + Graphics3D.centerY;
									Class46.aCombatInfoList1
											.method455(new AClass4_Sub2(int_32, int_33, int_34, int_35, int_29));
								}

								boolean bool_4 = false;
								if ((int_8 > 0) && bool_3) {
									boolean bool_5 = false;
									if (aBool65) {
										bool_5 = Class44.method265(this, int_5, int_6, int_7);
									} else {
										int_26 = int_10 - int_11;
										if (int_26 <= 50) {
											int_26 = 50;
										}

										if (int_13 > 0) {
											int_14 /= int_12;
											int_15 /= int_26;
										} else {
											int_15 /= int_12;
											int_14 /= int_26;
										}

										if (int_16 > 0) {
											int_20 /= int_12;
											int_18 /= int_26;
										} else {
											int_18 /= int_12;
											int_20 /= int_26;
										}

										int_27 = int_22 - Graphics3D.centerX;
										int_28 = int_23 - Graphics3D.centerY;
										if ((int_27 > int_14) && (int_27 < int_15) && (int_28 > int_20)
												&& (int_28 < int_18)) {
											bool_5 = true;
										}
									}

									if (bool_5) {
										if (aBool66) {
											CombatInfoListHolder.method618(int_8);
										} else {
											bool_4 = true;
										}
									}
								}

								int_25 = Graphics3D.centerX;
								int_26 = Graphics3D.centerY;
								int_27 = 0;
								int_28 = 0;
								if (int_0 != 0) {
									int_27 = anIntArray115[int_0];
									int_28 = anIntArray116[int_0];
								}

								for (int_29 = 0; int_29 < anInt596; int_29++) {
									int_30 = verticesX[int_29];
									int_31 = verticesY[int_29];
									int_32 = verticesZ[int_29];
									if (int_0 != 0) {
										int_33 = ((int_32 * int_27) + (int_30 * int_28)) >> 16;
										int_32 = ((int_32 * int_28) - (int_30 * int_27)) >> 16;
										int_30 = int_33;
									}

									int_30 += int_5;
									int_31 += int_6;
									int_32 += int_7;
									int_33 = ((int_32 * int_3) + (int_4 * int_30)) >> 16;
									int_32 = ((int_4 * int_32) - (int_30 * int_3)) >> 16;
									int_30 = int_33;
									int_33 = ((int_2 * int_31) - (int_32 * int_1)) >> 16;
									int_32 = ((int_31 * int_1) + (int_2 * int_32)) >> 16;
									anIntArray126[int_29] = int_32 - int_10;
									if (int_32 >= 50) {
										anIntArray121[int_29] = ((int_30 * Graphics3D.anInt578) / int_32) + int_25;
										anIntArray124[int_29] = ((int_33 * Graphics3D.anInt578) / int_32) + int_26;
									} else {
										anIntArray121[int_29] = -5000;
										bool_0 = true;
									}

									if (bool_2) {
										yViewportBuffer[int_29] = int_30;
										anIntArray122[int_29] = int_33;
										anIntArray117[int_29] = int_32;
									}
								}

								try {
									method960(bool_0, bool_4, aBool66, int_8);
								} catch (final Exception exception_0) {
									;
								}
							}
						}
					}
				}
			}
		}
	}

	public void method954() {
		for (int int_0 = 0; int_0 < anInt596; int_0++) {
			verticesX[int_0] = -verticesX[int_0];
			verticesZ[int_0] = -verticesZ[int_0];
		}

		method945();
	}

	public void method955(final int int_0, final int int_1, final int int_2) {
		for (int int_3 = 0; int_3 < anInt596; int_3++) {
			verticesX[int_3] = (verticesX[int_3] * int_0) / 128;
			verticesY[int_3] = (int_1 * verticesY[int_3]) / 128;
			verticesZ[int_3] = (int_2 * verticesZ[int_3]) / 128;
		}

		method945();
	}

	public void method956() {
		for (int int_0 = 0; int_0 < anInt596; int_0++) {
			final int int_1 = verticesX[int_0];
			verticesX[int_0] = verticesZ[int_0];
			verticesZ[int_0] = -int_1;
		}

		method945();
	}

	final void method957(final int int_0) {
		if (aBoolArray6[int_0]) {
			method943(int_0);
		} else {
			final int int_1 = indices1[int_0];
			final int int_2 = indices2[int_0];
			final int int_3 = indices3[int_0];
			Graphics3D.rasterClipEnable = aBoolArray7[int_0];
			if (aByteArray24 == null) {
				Graphics3D.rasterAlpha = 0;
			} else {
				Graphics3D.rasterAlpha = aByteArray24[int_0] & 0xFF;
			}

			if ((aShortArray11 != null) && (aShortArray11[int_0] != -1)) {
				int int_5;
				int int_6;
				int int_7;
				if ((aByteArray26 != null) && (aByteArray26[int_0] != -1)) {
					final int int_4 = aByteArray26[int_0] & 0xFF;
					int_5 = anIntArray133[int_4];
					int_6 = anIntArray134[int_4];
					int_7 = anIntArray135[int_4];
				} else {
					int_5 = int_1;
					int_6 = int_2;
					int_7 = int_3;
				}

				if (anIntArray131[int_0] == -1) {
					Graphics3D.rasterTextureAffine(anIntArray124[int_1], anIntArray124[int_2], anIntArray124[int_3],
							anIntArray121[int_1], anIntArray121[int_2], anIntArray121[int_3], anIntArray130[int_0],
							anIntArray130[int_0], anIntArray130[int_0], yViewportBuffer[int_5], yViewportBuffer[int_6],
							yViewportBuffer[int_7], anIntArray122[int_5], anIntArray122[int_6], anIntArray122[int_7],
							anIntArray117[int_5], anIntArray117[int_6], anIntArray117[int_7], aShortArray11[int_0]);
				} else {
					Graphics3D.rasterTextureAffine(anIntArray124[int_1], anIntArray124[int_2], anIntArray124[int_3],
							anIntArray121[int_1], anIntArray121[int_2], anIntArray121[int_3], anIntArray130[int_0],
							anIntArray132[int_0], anIntArray131[int_0], yViewportBuffer[int_5], yViewportBuffer[int_6],
							yViewportBuffer[int_7], anIntArray122[int_5], anIntArray122[int_6], anIntArray122[int_7],
							anIntArray117[int_5], anIntArray117[int_6], anIntArray117[int_7], aShortArray11[int_0]);
				}
			} else if (anIntArray131[int_0] == -1) {
				Graphics3D.rasterFlat(anIntArray124[int_1], anIntArray124[int_2], anIntArray124[int_3],
						anIntArray121[int_1], anIntArray121[int_2], anIntArray121[int_3],
						anIntArray127[anIntArray130[int_0]]);
			} else {
				Graphics3D.rasterGouraud(anIntArray124[int_1], anIntArray124[int_2], anIntArray124[int_3],
						anIntArray121[int_1], anIntArray121[int_2], anIntArray121[int_3], anIntArray130[int_0],
						anIntArray132[int_0], anIntArray131[int_0]);
			}
		}
	}

	void method958(final int int_0, final int[] ints_0, final int int_1, final int int_2, final int int_3) {
		final int int_4 = ints_0.length;
		int int_5;
		int int_6;
		int int_8;
		int int_9;
		if (int_0 == 0) {
			int_5 = 0;
			anInt590 = 0;
			anInt591 = 0;
			anInt592 = 0;

			for (int_6 = 0; int_6 < int_4; int_6++) {
				final int int_7 = ints_0[int_6];
				if (int_7 < anIntArrayArray17.length) {
					final int[] ints_1 = anIntArrayArray17[int_7];

					for (int_8 = 0; int_8 < ints_1.length; int_8++) {
						int_9 = ints_1[int_8];
						anInt590 += verticesX[int_9];
						anInt591 += verticesY[int_9];
						anInt592 += verticesZ[int_9];
						++int_5;
					}
				}
			}

			if (int_5 > 0) {
				anInt590 = int_1 + (anInt590 / int_5);
				anInt591 = int_2 + (anInt591 / int_5);
				anInt592 = int_3 + (anInt592 / int_5);
			} else {
				anInt590 = int_1;
				anInt591 = int_2;
				anInt592 = int_3;
			}
		} else {
			int[] ints_2;
			int int_10;
			if (int_0 == 1) {
				for (int_5 = 0; int_5 < int_4; int_5++) {
					int_6 = ints_0[int_5];
					if (int_6 < anIntArrayArray17.length) {
						ints_2 = anIntArrayArray17[int_6];

						for (int_10 = 0; int_10 < ints_2.length; int_10++) {
							int_8 = ints_2[int_10];
							verticesX[int_8] += int_1;
							verticesY[int_8] += int_2;
							verticesZ[int_8] += int_3;
						}
					}
				}

			} else if (int_0 == 2) {
				for (int_5 = 0; int_5 < int_4; int_5++) {
					int_6 = ints_0[int_5];
					if (int_6 < anIntArrayArray17.length) {
						ints_2 = anIntArrayArray17[int_6];

						for (int_10 = 0; int_10 < ints_2.length; int_10++) {
							int_8 = ints_2[int_10];
							verticesX[int_8] -= anInt590;
							verticesY[int_8] -= anInt591;
							verticesZ[int_8] -= anInt592;
							int_9 = (int_1 & 0xFF) * 8;
							final int int_11 = (int_2 & 0xFF) * 8;
							final int int_12 = (int_3 & 0xFF) * 8;
							int int_13;
							int int_14;
							int int_15;
							if (int_12 != 0) {
								int_13 = anIntArray115[int_12];
								int_14 = anIntArray116[int_12];
								int_15 = ((int_13 * verticesY[int_8]) + (int_14 * verticesX[int_8])) >> 16;
								verticesY[int_8] = ((int_14 * verticesY[int_8]) - (int_13 * verticesX[int_8])) >> 16;
								verticesX[int_8] = int_15;
							}

							if (int_9 != 0) {
								int_13 = anIntArray115[int_9];
								int_14 = anIntArray116[int_9];
								int_15 = ((int_14 * verticesY[int_8]) - (int_13 * verticesZ[int_8])) >> 16;
								verticesZ[int_8] = ((int_13 * verticesY[int_8]) + (int_14 * verticesZ[int_8])) >> 16;
								verticesY[int_8] = int_15;
							}

							if (int_11 != 0) {
								int_13 = anIntArray115[int_11];
								int_14 = anIntArray116[int_11];
								int_15 = ((int_13 * verticesZ[int_8]) + (int_14 * verticesX[int_8])) >> 16;
								verticesZ[int_8] = ((int_14 * verticesZ[int_8]) - (int_13 * verticesX[int_8])) >> 16;
								verticesX[int_8] = int_15;
							}

							verticesX[int_8] += anInt590;
							verticesY[int_8] += anInt591;
							verticesZ[int_8] += anInt592;
						}
					}
				}

			} else if (int_0 == 3) {
				for (int_5 = 0; int_5 < int_4; int_5++) {
					int_6 = ints_0[int_5];
					if (int_6 < anIntArrayArray17.length) {
						ints_2 = anIntArrayArray17[int_6];

						for (int_10 = 0; int_10 < ints_2.length; int_10++) {
							int_8 = ints_2[int_10];
							verticesX[int_8] -= anInt590;
							verticesY[int_8] -= anInt591;
							verticesZ[int_8] -= anInt592;
							verticesX[int_8] = (int_1 * verticesX[int_8]) / 128;
							verticesY[int_8] = (int_2 * verticesY[int_8]) / 128;
							verticesZ[int_8] = (int_3 * verticesZ[int_8]) / 128;
							verticesX[int_8] += anInt590;
							verticesY[int_8] += anInt591;
							verticesZ[int_8] += anInt592;
						}
					}
				}

			} else if (int_0 == 5) {
				if ((anIntArrayArray18 != null) && (aByteArray24 != null)) {
					for (int_5 = 0; int_5 < int_4; int_5++) {
						int_6 = ints_0[int_5];
						if (int_6 < anIntArrayArray18.length) {
							ints_2 = anIntArrayArray18[int_6];

							for (int_10 = 0; int_10 < ints_2.length; int_10++) {
								int_8 = ints_2[int_10];
								int_9 = (aByteArray24[int_8] & 0xFF) + (int_1 * 8);
								if (int_9 < 0) {
									int_9 = 0;
								} else if (int_9 > 255) {
									int_9 = 255;
								}

								aByteArray24[int_8] = (byte) int_9;
							}
						}
					}
				}

			}
		}
	}

	public void method959(final Frames frames_0, final int int_0, final Frames frames_1, final int int_1,
			final int[] ints_0) {
		if (int_0 != -1) {
			if ((ints_0 != null) && (int_1 != -1)) {
				final Frame frame_0 = frames_0.skeletons[int_0];
				final Frame frame_1 = frames_1.skeletons[int_1];
				final FrameMap framemap_0 = frame_0.skin;
				anInt590 = 0;
				anInt591 = 0;
				anInt592 = 0;
				byte byte_0 = 0;
				int int_5 = byte_0 + 1;
				int int_2 = ints_0[byte_0];

				int int_3;
				int int_4;
				for (int_3 = 0; int_3 < frame_0.anInt213; int_3++) {
					for (int_4 = frame_0.anIntArray54[int_3]; int_4 > int_2; int_2 = ints_0[int_5++]) {
						;
					}

					if ((int_4 != int_2) || (framemap_0.types[int_4] == 0)) {
						method958(framemap_0.types[int_4], framemap_0.list[int_4], frame_0.translator_x[int_3],
								frame_0.translator_y[int_3], frame_0.translator_z[int_3]);
					}
				}

				anInt590 = 0;
				anInt591 = 0;
				anInt592 = 0;
				byte_0 = 0;
				int_5 = byte_0 + 1;
				int_2 = ints_0[byte_0];

				for (int_3 = 0; int_3 < frame_1.anInt213; int_3++) {
					for (int_4 = frame_1.anIntArray54[int_3]; int_4 > int_2; int_2 = ints_0[int_5++]) {
						;
					}

					if ((int_4 == int_2) || (framemap_0.types[int_4] == 0)) {
						method958(framemap_0.types[int_4], framemap_0.list[int_4], frame_1.translator_x[int_3],
								frame_1.translator_y[int_3], frame_1.translator_z[int_3]);
					}
				}

				method945();
			} else {
				method944(frames_0, int_0);
			}
		}
	}

	final void method960(final boolean bool_0, boolean bool_1, final boolean bool_2, final int int_0) {
		if (anInt593 < 1600) {
			int int_1;
			for (int_1 = 0; int_1 < anInt593; int_1++) {
				anIntArray114[int_1] = 0;
			}

			int_1 = bool_2 ? 20 : 5;
			int int_2;
			int int_4;
			int int_5;
			int int_6;
			int int_7;
			int int_8;
			int int_13;
			if (Class46.aBool13 && bool_1) {
				final Model model_1 = this;

				for (int_2 = 0; int_2 < model_1.anInt598; int_2++) {
					if (model_1.anIntArray131[int_2] != -2) {
						int_4 = model_1.indices1[int_2];
						int_5 = model_1.indices2[int_2];
						int_6 = model_1.indices3[int_2];
						int_7 = anIntArray121[int_4];
						int_8 = anIntArray121[int_5];
						int_13 = anIntArray121[int_6];
						WorldMapData_Sub1.method591(anIntArray124[int_4], anIntArray124[int_5], anIntArray124[int_6],
								int_7, int_8, int_13, int_1);
					}
				}
			}

			int int_3;
			int int_9;
			int int_10;
			int int_12;
			for (int_3 = 0; int_3 < anInt598; int_3++) {
				if (anIntArray131[int_3] != -2) {
					int_2 = indices1[int_3];
					int_4 = indices2[int_3];
					int_5 = indices3[int_3];
					int_6 = anIntArray121[int_2];
					int_7 = anIntArray121[int_4];
					int_8 = anIntArray121[int_5];
					int int_11;
					if (!bool_0 || ((int_6 != -5000) && (int_7 != -5000) && (int_8 != -5000))) {
						if (bool_1) {
							int_9 = anIntArray124[int_2];
							int_10 = anIntArray124[int_4];
							int_11 = anIntArray124[int_5];
							int_12 = int_1 + Class56.anInt144;
							boolean bool_3;
							if ((int_12 < int_9) && (int_12 < int_10) && (int_12 < int_11)) {
								bool_3 = false;
							} else {
								int_12 = Class56.anInt144 - int_1;
								if ((int_12 > int_9) && (int_12 > int_10) && (int_12 > int_11)) {
									bool_3 = false;
								} else {
									int_12 = int_1 + Class56.anInt143;
									if ((int_12 < int_6) && (int_12 < int_7) && (int_12 < int_8)) {
										bool_3 = false;
									} else {
										int_12 = Class56.anInt143 - int_1;
										if ((int_12 > int_6) && (int_12 > int_7) && (int_12 > int_8)) {
											bool_3 = false;
										} else {
											bool_3 = true;
										}
									}
								}
							}

							if (bool_3) {
								CombatInfoListHolder.method618(int_0);
								bool_1 = false;
							}
						}

						if ((((int_6 - int_7) * (anIntArray124[int_5] - anIntArray124[int_4]))
								- ((int_8 - int_7) * (anIntArray124[int_2] - anIntArray124[int_4]))) > 0) {
							aBoolArray6[int_3] = false;
							if ((int_6 >= 0) && (int_7 >= 0) && (int_8 >= 0) && (int_6 <= Graphics3D.rasterClipX)
									&& (int_7 <= Graphics3D.rasterClipX) && (int_8 <= Graphics3D.rasterClipX)) {
								aBoolArray7[int_3] = false;
							} else {
								aBoolArray7[int_3] = true;
							}

							int_13 = ((anIntArray126[int_5] + anIntArray126[int_2] + anIntArray126[int_4]) / 3)
									+ anInt604;
							anIntArrayArray15[int_13][anIntArray114[int_13]++] = int_3;
						}
					} else {
						int_13 = yViewportBuffer[int_2];
						int_9 = yViewportBuffer[int_4];
						int_10 = yViewportBuffer[int_5];
						int_11 = anIntArray122[int_2];
						int_12 = anIntArray122[int_4];
						int int_14 = anIntArray122[int_5];
						int int_15 = anIntArray117[int_2];
						final int int_16 = anIntArray117[int_4];
						int int_17 = anIntArray117[int_5];
						int_13 -= int_9;
						int_10 -= int_9;
						int_11 -= int_12;
						int_14 -= int_12;
						int_15 -= int_16;
						int_17 -= int_16;
						final int int_18 = (int_11 * int_17) - (int_15 * int_14);
						final int int_19 = (int_15 * int_10) - (int_13 * int_17);
						final int int_20 = (int_13 * int_14) - (int_11 * int_10);
						if (((int_16 * int_20) + (int_9 * int_18) + (int_12 * int_19)) > 0) {
							aBoolArray6[int_3] = true;
							final int int_21 = ((anIntArray126[int_5] + anIntArray126[int_2] + anIntArray126[int_4])
									/ 3) + anInt604;
							anIntArrayArray15[int_21][anIntArray114[int_21]++] = int_3;
						}
					}
				}
			}

			int[] ints_0;
			if (aByteArray25 == null) {
				for (int_3 = anInt593 - 1; int_3 >= 0; --int_3) {
					int_2 = anIntArray114[int_3];
					if (int_2 > 0) {
						ints_0 = anIntArrayArray15[int_3];

						for (int_5 = 0; int_5 < int_2; int_5++) {
							method957(ints_0[int_5]);
						}
					}
				}

			} else {
				for (int_3 = 0; int_3 < 12; int_3++) {
					anIntArray118[int_3] = 0;
					anIntArray120[int_3] = 0;
				}

				for (int_3 = anInt593 - 1; int_3 >= 0; --int_3) {
					int_2 = anIntArray114[int_3];
					if (int_2 > 0) {
						ints_0 = anIntArrayArray15[int_3];

						for (int_5 = 0; int_5 < int_2; int_5++) {
							int_6 = ints_0[int_5];
							final byte byte_0 = aByteArray25[int_6];
							int_8 = anIntArray118[byte_0]++;
							anIntArrayArray16[byte_0][int_8] = int_6;
							if (byte_0 < 10) {
								anIntArray120[byte_0] += int_3;
							} else if (byte_0 == 10) {
								anIntArray128[int_8] = int_3;
							} else {
								anIntArray129[int_8] = int_3;
							}
						}
					}
				}

				int_3 = 0;
				if ((anIntArray118[1] > 0) || (anIntArray118[2] > 0)) {
					int_3 = (anIntArray120[1] + anIntArray120[2]) / (anIntArray118[1] + anIntArray118[2]);
				}

				int_2 = 0;
				if ((anIntArray118[3] > 0) || (anIntArray118[4] > 0)) {
					int_2 = (anIntArray120[3] + anIntArray120[4]) / (anIntArray118[3] + anIntArray118[4]);
				}

				int_4 = 0;
				if ((anIntArray118[6] > 0) || (anIntArray118[8] > 0)) {
					int_4 = (anIntArray120[8] + anIntArray120[6]) / (anIntArray118[8] + anIntArray118[6]);
				}

				int_6 = 0;
				int_7 = anIntArray118[10];
				int[] ints_1 = anIntArrayArray16[10];
				int[] ints_2 = anIntArray128;
				if (int_6 == int_7) {
					int_6 = 0;
					int_7 = anIntArray118[11];
					ints_1 = anIntArrayArray16[11];
					ints_2 = anIntArray129;
				}

				if (int_6 < int_7) {
					int_5 = ints_2[int_6];
				} else {
					int_5 = -1000;
				}

				for (int_9 = 0; int_9 < 10; int_9++) {
					while ((int_9 == 0) && (int_5 > int_3)) {
						method957(ints_1[int_6++]);
						if ((int_6 == int_7) && (ints_1 != anIntArrayArray16[11])) {
							int_6 = 0;
							int_7 = anIntArray118[11];
							ints_1 = anIntArrayArray16[11];
							ints_2 = anIntArray129;
						}

						if (int_6 < int_7) {
							int_5 = ints_2[int_6];
						} else {
							int_5 = -1000;
						}
					}

					while ((int_9 == 3) && (int_5 > int_2)) {
						method957(ints_1[int_6++]);
						if ((int_6 == int_7) && (ints_1 != anIntArrayArray16[11])) {
							int_6 = 0;
							int_7 = anIntArray118[11];
							ints_1 = anIntArrayArray16[11];
							ints_2 = anIntArray129;
						}

						if (int_6 < int_7) {
							int_5 = ints_2[int_6];
						} else {
							int_5 = -1000;
						}
					}

					while ((int_9 == 5) && (int_5 > int_4)) {
						method957(ints_1[int_6++]);
						if ((int_6 == int_7) && (ints_1 != anIntArrayArray16[11])) {
							int_6 = 0;
							int_7 = anIntArray118[11];
							ints_1 = anIntArrayArray16[11];
							ints_2 = anIntArray129;
						}

						if (int_6 < int_7) {
							int_5 = ints_2[int_6];
						} else {
							int_5 = -1000;
						}
					}

					int_10 = anIntArray118[int_9];
					final int[] ints_3 = anIntArrayArray16[int_9];

					for (int_12 = 0; int_12 < int_10; int_12++) {
						method957(ints_3[int_12]);
					}
				}

				while (int_5 != -1000) {
					method957(ints_1[int_6++]);
					if ((int_6 == int_7) && (ints_1 != anIntArrayArray16[11])) {
						int_6 = 0;
						ints_1 = anIntArrayArray16[11];
						int_7 = anIntArray118[11];
						ints_2 = anIntArray129;
					}

					if (int_6 < int_7) {
						int_5 = ints_2[int_6];
					} else {
						int_5 = -1000;
					}
				}

			}
		}
	}

	public void method961(final int int_0, final int int_1, final int int_2) {
		for (int int_3 = 0; int_3 < anInt596; int_3++) {
			verticesX[int_3] += int_0;
			verticesY[int_3] += int_1;
			verticesZ[int_3] += int_2;
		}

		method945();
	}

	public final void method962(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6) {
		anIntArray114[0] = -1;
		if ((anInt595 != 2) && (anInt595 != 1)) {
			method949();
		}

		final int int_7 = Graphics3D.centerX;
		final int int_8 = Graphics3D.centerY;
		final int int_9 = anIntArray115[int_1];
		final int int_10 = anIntArray116[int_1];
		final int int_11 = anIntArray115[int_2];
		final int int_12 = anIntArray116[int_2];
		final int int_14 = anIntArray115[int_3];
		final int int_15 = anIntArray116[int_3];
		final int int_16 = ((int_14 * int_5) + (int_15 * int_6)) >> 16;

		for (int int_17 = 0; int_17 < anInt596; int_17++) {
			int int_18 = verticesX[int_17];
			int int_19 = verticesY[int_17];
			int int_20 = verticesZ[int_17];
			int int_21;
			if (int_2 != 0) {
				int_21 = ((int_19 * int_11) + (int_18 * int_12)) >> 16;
				int_19 = ((int_19 * int_12) - (int_18 * int_11)) >> 16;
				int_18 = int_21;
			}

			if (int_1 != 0) {
				int_21 = ((int_20 * int_9) + (int_18 * int_10)) >> 16;
				int_20 = ((int_20 * int_10) - (int_18 * int_9)) >> 16;
				int_18 = int_21;
			}

			int_18 += int_4;
			int_19 += int_5;
			int_20 += int_6;
			int_21 = ((int_19 * int_15) - (int_20 * int_14)) >> 16;
			int_20 = ((int_19 * int_14) + (int_20 * int_15)) >> 16;
			anIntArray126[int_17] = int_20 - int_16;
			anIntArray121[int_17] = ((int_18 * Graphics3D.anInt578) / int_20) + int_7;
			anIntArray124[int_17] = ((int_21 * Graphics3D.anInt578) / int_20) + int_8;
			if (anInt600 > 0) {
				yViewportBuffer[int_17] = int_18;
				anIntArray122[int_17] = int_21;
				anIntArray117[int_17] = int_20;
			}
		}

		try {
			method960(false, false, false, 0);
		} catch (final Exception exception_0) {
			;
		}
	}

	public final void method963(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6, final int int_7) {
		anIntArray114[0] = -1;
		if ((anInt595 != 2) && (anInt595 != 1)) {
			method949();
		}

		final int int_8 = Graphics3D.centerX;
		final int int_9 = Graphics3D.centerY;
		final int int_10 = anIntArray115[int_1];
		final int int_11 = anIntArray116[int_1];
		final int int_12 = anIntArray115[int_2];
		final int int_14 = anIntArray116[int_2];
		final int int_15 = anIntArray115[int_3];
		final int int_16 = anIntArray116[int_3];
		final int int_17 = ((int_15 * int_5) + (int_16 * int_6)) >> 16;

		for (int int_18 = 0; int_18 < anInt596; int_18++) {
			int int_19 = verticesX[int_18];
			int int_20 = verticesY[int_18];
			int int_21 = verticesZ[int_18];
			int int_22;
			if (int_2 != 0) {
				int_22 = ((int_20 * int_12) + (int_19 * int_14)) >> 16;
				int_20 = ((int_20 * int_14) - (int_19 * int_12)) >> 16;
				int_19 = int_22;
			}

			if (int_1 != 0) {
				int_22 = ((int_21 * int_10) + (int_19 * int_11)) >> 16;
				int_21 = ((int_21 * int_11) - (int_19 * int_10)) >> 16;
				int_19 = int_22;
			}

			int_19 += int_4;
			int_20 += int_5;
			int_21 += int_6;
			int_22 = ((int_20 * int_16) - (int_21 * int_15)) >> 16;
			int_21 = ((int_20 * int_15) + (int_21 * int_16)) >> 16;
			anIntArray126[int_18] = int_21 - int_17;
			anIntArray121[int_18] = int_8 + ((int_19 * Graphics3D.anInt578) / int_7);
			anIntArray124[int_18] = int_9 + ((int_22 * Graphics3D.anInt578) / int_7);
			if (anInt600 > 0) {
				yViewportBuffer[int_18] = int_19;
				anIntArray122[int_18] = int_22;
				anIntArray117[int_18] = int_21;
			}
		}

		try {
			method960(false, false, false, 0);
		} catch (final Exception exception_0) {
			;
		}
	}

	public int method964() {
		method942();
		return XYZMag;
	}

}
