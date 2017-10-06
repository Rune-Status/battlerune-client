public final class SpritePixels extends Rasterizer2D {

	public int maxWidth;
	public int offsetX;
	public int height;
	public int[] image;
	public int width;
	public int maxHeight;
	int offsetY;

	public SpritePixels(final int[] ints_0, final int int_0, final int int_1) {
		image = ints_0;
		width = maxWidth = int_0;
		height = maxHeight = int_1;
		offsetY = 0;
		offsetX = 0;
	}

	public SpritePixels(final int int_0, final int int_1) {
		this(new int[int_1 * int_0], int_0, int_1);
	}

	SpritePixels() {
	}

	void method911(int int_0, int int_1, final int int_2, final int int_3, final int int_4, final int int_5) {
		if (int_5 != 0) {
			int_0 -= offsetX << 4;
			int_1 -= offsetY << 4;
			final double double_0 = (int_4 & 0xFFFF) * 9.587379924285257E-5D;
			final int int_6 = (int) Math.floor((Math.sin(double_0) * int_5) + 0.5D);
			final int int_7 = (int) Math.floor((Math.cos(double_0) * int_5) + 0.5D);
			final int int_8 = (int_7 * -int_0) + (-int_1 * int_6);
			final int int_9 = (-int_1 * int_7) + (int_6 * -(-int_0));
			final int int_10 = (-int_1 * int_6) + (((width << 4) - int_0) * int_7);
			final int int_11 = (int_6 * -((width << 4) - int_0)) + (-int_1 * int_7);
			final int int_12 = (((height << 4) - int_1) * int_6) + (-int_0 * int_7);
			final int int_13 = (int_7 * ((height << 4) - int_1)) + (-(-int_0) * int_6);
			final int int_14 = (((height << 4) - int_1) * int_6) + (((width << 4) - int_0) * int_7);
			final int int_15 = (int_6 * -((width << 4) - int_0)) + (int_7 * ((height << 4) - int_1));
			int int_16;
			int int_17;
			if (int_8 < int_10) {
				int_16 = int_8;
				int_17 = int_10;
			} else {
				int_16 = int_10;
				int_17 = int_8;
			}

			if (int_12 < int_16) {
				int_16 = int_12;
			}

			if (int_14 < int_16) {
				int_16 = int_14;
			}

			if (int_12 > int_17) {
				int_17 = int_12;
			}

			if (int_14 > int_17) {
				int_17 = int_14;
			}

			int int_18;
			int int_19;
			if (int_9 < int_11) {
				int_18 = int_9;
				int_19 = int_11;
			} else {
				int_18 = int_11;
				int_19 = int_9;
			}

			if (int_13 < int_18) {
				int_18 = int_13;
			}

			if (int_15 < int_18) {
				int_18 = int_15;
			}

			if (int_13 > int_19) {
				int_19 = int_13;
			}

			if (int_15 > int_19) {
				int_19 = int_15;
			}

			int_16 >>= 12;
			int_17 = (int_17 + 4095) >> 12;
			int_18 >>= 12;
			int_19 = (int_19 + 4095) >> 12;
			int_16 += int_2;
			int_17 += int_2;
			int_18 += int_3;
			int_19 += int_3;
			int_16 >>= 4;
			int_17 = (int_17 + 15) >> 4;
			int_18 >>= 4;
			int_19 = (int_19 + 15) >> 4;
			if (int_16 < Rasterizer2D.draw_region_x) {
				int_16 = Rasterizer2D.draw_region_x;
			}

			if (int_17 > Rasterizer2D.drawingAreaBottom) {
				int_17 = Rasterizer2D.drawingAreaBottom;
			}

			if (int_18 < Rasterizer2D.drawingAreaTop) {
				int_18 = Rasterizer2D.drawingAreaTop;
			}

			if (int_19 > Rasterizer2D.drawingAreaRight) {
				int_19 = Rasterizer2D.drawingAreaRight;
			}

			int_17 = int_16 - int_17;
			if (int_17 < 0) {
				int_19 = int_18 - int_19;
				if (int_19 < 0) {
					int int_20 = int_16 + (int_18 * Rasterizer2D.graphicsPixelsWidth);
					final double double_1 = 1.6777216E7D / int_5;
					final int int_21 = (int) Math.floor((Math.sin(double_0) * double_1) + 0.5D);
					final int int_22 = (int) Math.floor((Math.cos(double_0) * double_1) + 0.5D);
					final int int_23 = ((int_16 << 4) + 8) - int_2;
					final int int_24 = ((int_18 << 4) + 8) - int_3;
					int int_25 = (int_0 << 8) - ((int_24 * int_21) >> 4);
					int int_26 = ((int_24 * int_22) >> 4) + (int_1 << 8);
					int int_27;
					int int_28;
					int int_29;
					int int_30;
					int int_31;
					int int_32;
					int int_33;
					if (int_22 == 0) {
						if (int_21 == 0) {
							for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
								int_28 = int_20;
								int_29 = int_25;
								int_30 = int_26;
								int_31 = int_17;
								if ((int_25 >= 0) && (int_26 >= 0) && ((int_25 - (width << 12)) < 0)
										&& ((int_26 - (height << 12)) < 0)) {
									for (; int_31 < 0; int_31++) {
										int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
										if (int_33 != 0) {
											Rasterizer2D.graphicsPixels[int_28++] = int_33;
										} else {
											++int_28;
										}
									}
								}

								++int_27;
							}

						} else if (int_21 < 0) {
							for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
								int_28 = int_20;
								int_29 = int_25;
								int_30 = ((int_23 * int_21) >> 4) + int_26;
								int_31 = int_17;
								if ((int_25 >= 0) && ((int_25 - (width << 12)) < 0)) {
									if ((int_32 = int_30 - (height << 12)) >= 0) {
										int_32 = (int_21 - int_32) / int_21;
										int_31 = int_17 + int_32;
										int_30 += int_21 * int_32;
										int_28 = int_20 + int_32;
									}

									if ((int_32 = (int_30 - int_21) / int_21) > int_31) {
										int_31 = int_32;
									}

									while (int_31 < 0) {
										int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
										if (int_33 != 0) {
											Rasterizer2D.graphicsPixels[int_28++] = int_33;
										} else {
											++int_28;
										}

										int_30 += int_21;
										++int_31;
									}
								}

								++int_27;
								int_25 -= int_21;
							}

						} else {
							for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
								int_28 = int_20;
								int_29 = int_25;
								int_30 = ((int_23 * int_21) >> 4) + int_26;
								int_31 = int_17;
								if ((int_25 >= 0) && ((int_25 - (width << 12)) < 0)) {
									if (int_30 < 0) {
										int_32 = (int_21 - 1 - int_30) / int_21;
										int_31 = int_17 + int_32;
										int_30 += int_21 * int_32;
										int_28 = int_20 + int_32;
									}

									if ((int_32 = ((int_30 + 1) - (height << 12) - int_21) / int_21) > int_31) {
										int_31 = int_32;
									}

									while (int_31 < 0) {
										int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
										if (int_33 != 0) {
											Rasterizer2D.graphicsPixels[int_28++] = int_33;
										} else {
											++int_28;
										}

										int_30 += int_21;
										++int_31;
									}
								}

								++int_27;
								int_25 -= int_21;
							}

						}
					} else if (int_22 < 0) {
						if (int_21 == 0) {
							for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
								int_28 = int_20;
								int_29 = ((int_23 * int_22) >> 4) + int_25;
								int_30 = int_26;
								int_31 = int_17;
								if ((int_26 >= 0) && ((int_26 - (height << 12)) < 0)) {
									if ((int_32 = int_29 - (width << 12)) >= 0) {
										int_32 = (int_22 - int_32) / int_22;
										int_31 = int_17 + int_32;
										int_29 += int_22 * int_32;
										int_28 = int_20 + int_32;
									}

									if ((int_32 = (int_29 - int_22) / int_22) > int_31) {
										int_31 = int_32;
									}

									while (int_31 < 0) {
										int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
										if (int_33 != 0) {
											Rasterizer2D.graphicsPixels[int_28++] = int_33;
										} else {
											++int_28;
										}

										int_29 += int_22;
										++int_31;
									}
								}

								++int_27;
								int_26 += int_22;
							}

						} else if (int_21 < 0) {
							for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
								int_28 = int_20;
								int_29 = ((int_23 * int_22) >> 4) + int_25;
								int_30 = ((int_23 * int_21) >> 4) + int_26;
								int_31 = int_17;
								if ((int_32 = int_29 - (width << 12)) >= 0) {
									int_32 = (int_22 - int_32) / int_22;
									int_31 = int_17 + int_32;
									int_29 += int_22 * int_32;
									int_30 += int_21 * int_32;
									int_28 = int_20 + int_32;
								}

								if ((int_32 = (int_29 - int_22) / int_22) > int_31) {
									int_31 = int_32;
								}

								if ((int_32 = int_30 - (height << 12)) >= 0) {
									int_32 = (int_21 - int_32) / int_21;
									int_31 += int_32;
									int_29 += int_22 * int_32;
									int_30 += int_21 * int_32;
									int_28 += int_32;
								}

								if ((int_32 = (int_30 - int_21) / int_21) > int_31) {
									int_31 = int_32;
								}

								while (int_31 < 0) {
									int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
									if (int_33 != 0) {
										Rasterizer2D.graphicsPixels[int_28++] = int_33;
									} else {
										++int_28;
									}

									int_29 += int_22;
									int_30 += int_21;
									++int_31;
								}

								++int_27;
								int_25 -= int_21;
								int_26 += int_22;
							}

						} else {
							for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
								int_28 = int_20;
								int_29 = ((int_23 * int_22) >> 4) + int_25;
								int_30 = ((int_23 * int_21) >> 4) + int_26;
								int_31 = int_17;
								if ((int_32 = int_29 - (width << 12)) >= 0) {
									int_32 = (int_22 - int_32) / int_22;
									int_31 = int_17 + int_32;
									int_29 += int_22 * int_32;
									int_30 += int_21 * int_32;
									int_28 = int_20 + int_32;
								}

								if ((int_32 = (int_29 - int_22) / int_22) > int_31) {
									int_31 = int_32;
								}

								if (int_30 < 0) {
									int_32 = (int_21 - 1 - int_30) / int_21;
									int_31 += int_32;
									int_29 += int_22 * int_32;
									int_30 += int_21 * int_32;
									int_28 += int_32;
								}

								if ((int_32 = ((int_30 + 1) - (height << 12) - int_21) / int_21) > int_31) {
									int_31 = int_32;
								}

								while (int_31 < 0) {
									int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
									if (int_33 != 0) {
										Rasterizer2D.graphicsPixels[int_28++] = int_33;
									} else {
										++int_28;
									}

									int_29 += int_22;
									int_30 += int_21;
									++int_31;
								}

								++int_27;
								int_25 -= int_21;
								int_26 += int_22;
							}

						}
					} else if (int_21 == 0) {
						for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
							int_28 = int_20;
							int_29 = ((int_23 * int_22) >> 4) + int_25;
							int_30 = int_26;
							int_31 = int_17;
							if ((int_26 >= 0) && ((int_26 - (height << 12)) < 0)) {
								if (int_29 < 0) {
									int_32 = (int_22 - 1 - int_29) / int_22;
									int_31 = int_17 + int_32;
									int_29 += int_22 * int_32;
									int_28 = int_20 + int_32;
								}

								if ((int_32 = ((int_29 + 1) - (width << 12) - int_22) / int_22) > int_31) {
									int_31 = int_32;
								}

								while (int_31 < 0) {
									int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
									if (int_33 != 0) {
										Rasterizer2D.graphicsPixels[int_28++] = int_33;
									} else {
										++int_28;
									}

									int_29 += int_22;
									++int_31;
								}
							}

							++int_27;
							int_26 += int_22;
						}

					} else if (int_21 < 0) {
						for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
							int_28 = int_20;
							int_29 = ((int_23 * int_22) >> 4) + int_25;
							int_30 = ((int_23 * int_21) >> 4) + int_26;
							int_31 = int_17;
							if (int_29 < 0) {
								int_32 = (int_22 - 1 - int_29) / int_22;
								int_31 = int_17 + int_32;
								int_29 += int_22 * int_32;
								int_30 += int_21 * int_32;
								int_28 = int_20 + int_32;
							}

							if ((int_32 = ((int_29 + 1) - (width << 12) - int_22) / int_22) > int_31) {
								int_31 = int_32;
							}

							if ((int_32 = int_30 - (height << 12)) >= 0) {
								int_32 = (int_21 - int_32) / int_21;
								int_31 += int_32;
								int_29 += int_22 * int_32;
								int_30 += int_21 * int_32;
								int_28 += int_32;
							}

							if ((int_32 = (int_30 - int_21) / int_21) > int_31) {
								int_31 = int_32;
							}

							while (int_31 < 0) {
								int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
								if (int_33 != 0) {
									Rasterizer2D.graphicsPixels[int_28++] = int_33;
								} else {
									++int_28;
								}

								int_29 += int_22;
								int_30 += int_21;
								++int_31;
							}

							++int_27;
							int_25 -= int_21;
							int_26 += int_22;
						}

					} else {
						for (int_27 = int_19; int_27 < 0; int_20 += Rasterizer2D.graphicsPixelsWidth) {
							int_28 = int_20;
							int_29 = ((int_23 * int_22) >> 4) + int_25;
							int_30 = ((int_23 * int_21) >> 4) + int_26;
							int_31 = int_17;
							if (int_29 < 0) {
								int_32 = (int_22 - 1 - int_29) / int_22;
								int_31 = int_17 + int_32;
								int_29 += int_22 * int_32;
								int_30 += int_21 * int_32;
								int_28 = int_20 + int_32;
							}

							if ((int_32 = ((int_29 + 1) - (width << 12) - int_22) / int_22) > int_31) {
								int_31 = int_32;
							}

							if (int_30 < 0) {
								int_32 = (int_21 - 1 - int_30) / int_21;
								int_31 += int_32;
								int_29 += int_22 * int_32;
								int_30 += int_21 * int_32;
								int_28 += int_32;
							}

							if ((int_32 = ((int_30 + 1) - (height << 12) - int_21) / int_21) > int_31) {
								int_31 = int_32;
							}

							while (int_31 < 0) {
								int_33 = image[(int_29 >> 12) + ((int_30 >> 12) * width)];
								if (int_33 != 0) {
									Rasterizer2D.graphicsPixels[int_28++] = int_33;
								} else {
									++int_28;
								}

								int_29 += int_22;
								int_30 += int_21;
								++int_31;
							}

							++int_27;
							int_25 -= int_21;
							int_26 += int_22;
						}

					}
				}
			}
		}
	}

	public void method912(int int_0, int int_1, int int_2, int int_3) {
		if ((int_2 > 0) && (int_3 > 0)) {
			final int int_4 = width;
			final int int_5 = height;
			int int_6 = 0;
			int int_7 = 0;
			final int int_8 = maxWidth;
			final int int_9 = maxHeight;
			final int int_10 = (int_8 << 16) / int_2;
			final int int_11 = (int_9 << 16) / int_3;
			int int_12;
			if (offsetX > 0) {
				int_12 = ((int_10 + (offsetX << 16)) - 1) / int_10;
				int_0 += int_12;
				int_6 += (int_12 * int_10) - (offsetX << 16);
			}

			if (offsetY > 0) {
				int_12 = ((int_11 + (offsetY << 16)) - 1) / int_11;
				int_1 += int_12;
				int_7 += (int_12 * int_11) - (offsetY << 16);
			}

			if (int_4 < int_8) {
				int_2 = ((int_10 + ((int_4 << 16) - int_6)) - 1) / int_10;
			}

			if (int_5 < int_9) {
				int_3 = ((int_11 + ((int_5 << 16) - int_7)) - 1) / int_11;
			}

			int_12 = int_0 + (int_1 * Rasterizer2D.graphicsPixelsWidth);
			int int_13 = Rasterizer2D.graphicsPixelsWidth - int_2;
			if ((int_1 + int_3) > Rasterizer2D.drawingAreaRight) {
				int_3 -= (int_1 + int_3) - Rasterizer2D.drawingAreaRight;
			}

			int int_14;
			if (int_1 < Rasterizer2D.drawingAreaTop) {
				int_14 = Rasterizer2D.drawingAreaTop - int_1;
				int_3 -= int_14;
				int_12 += int_14 * Rasterizer2D.graphicsPixelsWidth;
				int_7 += int_11 * int_14;
			}

			if ((int_2 + int_0) > Rasterizer2D.drawingAreaBottom) {
				int_14 = (int_2 + int_0) - Rasterizer2D.drawingAreaBottom;
				int_2 -= int_14;
				int_13 += int_14;
			}

			if (int_0 < Rasterizer2D.draw_region_x) {
				int_14 = Rasterizer2D.draw_region_x - int_0;
				int_2 -= int_14;
				int_12 += int_14;
				int_6 += int_10 * int_14;
				int_13 += int_14;
			}

			method936(Rasterizer2D.graphicsPixels, image, 0, int_6, int_7, int_12, int_13, int_2, int_3, int_10, int_11,
					int_4);
		}
	}

	public void method913(final int int_0, final int int_1, final int int_2, final int int_3) {
		if ((int_2 <= maxWidth) && (int_3 <= maxHeight)) {
			int int_4 = ((int_2 * offsetX) / maxWidth) + int_0;
			int int_5 = ((((int_2 * (offsetX + width)) + maxWidth) - 1) / maxWidth) + int_0;
			int int_6 = int_1 + ((int_3 * offsetY) / maxHeight);
			int int_7 = int_1 + (((maxHeight + ((offsetY + height) * int_3)) - 1) / maxHeight);
			if (int_4 < Rasterizer2D.draw_region_x) {
				int_4 = Rasterizer2D.draw_region_x;
			}

			if (int_5 > Rasterizer2D.drawingAreaBottom) {
				int_5 = Rasterizer2D.drawingAreaBottom;
			}

			if (int_6 < Rasterizer2D.drawingAreaTop) {
				int_6 = Rasterizer2D.drawingAreaTop;
			}

			if (int_7 > Rasterizer2D.drawingAreaRight) {
				int_7 = Rasterizer2D.drawingAreaRight;
			}

			if ((int_4 < int_5) && (int_6 < int_7)) {
				int int_8 = int_4 + (int_6 * Rasterizer2D.graphicsPixelsWidth);
				final int int_9 = Rasterizer2D.graphicsPixelsWidth - (int_5 - int_4);
				if (int_8 < Rasterizer2D.graphicsPixels.length) {
					for (int int_10 = int_6; int_10 < int_7; int_10++) {
						for (int int_11 = int_4; int_11 < int_5; int_11++) {
							final int int_12 = (int_11 - int_0) << 4;
							final int int_13 = (int_10 - int_1) << 4;
							int int_14 = ((int_12 * maxWidth) / int_2) - (offsetX << 4);
							int int_15 = (((int_12 + 16) * maxWidth) / int_2) - (offsetX << 4);
							int int_16 = ((int_13 * maxHeight) / int_3) - (offsetY << 4);
							int int_17 = (((int_13 + 16) * maxHeight) / int_3) - (offsetY << 4);
							final int int_18 = ((int_15 - int_14) * (int_17 - int_16)) >> 1;
							if (int_18 != 0) {
								if (int_14 < 0) {
									int_14 = 0;
								}

								if (int_15 >= (width << 4)) {
									int_15 = width << 4;
								}

								if (int_16 < 0) {
									int_16 = 0;
								}

								if (int_17 >= (height << 4)) {
									int_17 = height << 4;
								}

								--int_15;
								--int_17;
								final int int_19 = 16 - (int_14 & 0xF);
								final int int_20 = (int_15 & 0xF) + 1;
								final int int_21 = 16 - (int_16 & 0xF);
								final int int_22 = (int_17 & 0xF) + 1;
								int_14 >>= 4;
								int_15 >>= 4;
								int_16 >>= 4;
								int_17 >>= 4;
								int int_23 = 0;
								int int_24 = 0;
								int int_25 = 0;
								int int_26 = 0;

								int int_27;
								for (int_27 = int_16; int_27 <= int_17; int_27++) {
									int int_28 = 16;
									if (int_27 == int_16) {
										int_28 = int_21;
									}

									if (int_27 == int_17) {
										int_28 = int_22;
									}

									for (int int_29 = int_14; int_29 <= int_15; int_29++) {
										final int int_30 = image[int_29 + (int_27 * width)];
										if (int_30 != 0) {
											int int_31;
											if (int_29 == int_14) {
												int_31 = int_28 * int_19;
											} else if (int_29 == int_15) {
												int_31 = int_28 * int_20;
											} else {
												int_31 = int_28 << 4;
											}

											int_26 += int_31;
											int_23 += ((int_30 >> 16) & 0xFF) * int_31;
											int_24 += int_31 * ((int_30 >> 8) & 0xFF);
											int_25 += (int_30 & 0xFF) * int_31;
										}
									}
								}

								if (int_26 >= int_18) {
									int_27 = (int_25 / int_26) + ((int_23 / int_26) << 16) + ((int_24 / int_26) << 8);
									if (int_27 == 0) {
										int_27 = 1;
									}

									Rasterizer2D.graphicsPixels[int_8] = int_27;
								}

								++int_8;
							}
						}

						int_8 += int_9;
					}

				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method914(int int_0, int int_1) {
		int_0 += offsetX;
		int_1 += offsetY;
		int int_2 = int_0 + (int_1 * Rasterizer2D.graphicsPixelsWidth);
		int int_3 = 0;
		int int_4 = height;
		int int_5 = width;
		int int_6 = Rasterizer2D.graphicsPixelsWidth - int_5;
		int int_7 = 0;
		int int_8;
		if (int_1 < Rasterizer2D.drawingAreaTop) {
			int_8 = Rasterizer2D.drawingAreaTop - int_1;
			int_4 -= int_8;
			int_1 = Rasterizer2D.drawingAreaTop;
			int_3 += int_8 * int_5;
			int_2 += int_8 * Rasterizer2D.graphicsPixelsWidth;
		}

		if ((int_4 + int_1) > Rasterizer2D.drawingAreaRight) {
			int_4 -= (int_4 + int_1) - Rasterizer2D.drawingAreaRight;
		}

		if (int_0 < Rasterizer2D.draw_region_x) {
			int_8 = Rasterizer2D.draw_region_x - int_0;
			int_5 -= int_8;
			int_0 = Rasterizer2D.draw_region_x;
			int_3 += int_8;
			int_2 += int_8;
			int_7 += int_8;
			int_6 += int_8;
		}

		if ((int_5 + int_0) > Rasterizer2D.drawingAreaBottom) {
			int_8 = (int_5 + int_0) - Rasterizer2D.drawingAreaBottom;
			int_5 -= int_8;
			int_7 += int_8;
			int_6 += int_8;
		}

		if (int_5 > 0) {
			if (int_4 > 0) {
				method932(Rasterizer2D.graphicsPixels, image, int_3, int_2, int_5, int_4, int_6, int_7);
			}
		}
	}

	public void method915() {
		Rasterizer2D.setRasterBuffer(image, width, height);
	}

	public void method916(int int_0, int int_1) {
		int_0 += offsetX;
		int_1 += offsetY;
		int int_2 = int_0 + (int_1 * Rasterizer2D.graphicsPixelsWidth);
		int int_3 = 0;
		int int_4 = height;
		int int_5 = width;
		int int_6 = Rasterizer2D.graphicsPixelsWidth - int_5;
		int int_7 = 0;
		int int_8;
		if (int_1 < Rasterizer2D.drawingAreaTop) {
			int_8 = Rasterizer2D.drawingAreaTop - int_1;
			int_4 -= int_8;
			int_1 = Rasterizer2D.drawingAreaTop;
			int_3 += int_8 * int_5;
			int_2 += int_8 * Rasterizer2D.graphicsPixelsWidth;
		}

		if ((int_4 + int_1) > Rasterizer2D.drawingAreaRight) {
			int_4 -= (int_4 + int_1) - Rasterizer2D.drawingAreaRight;
		}

		if (int_0 < Rasterizer2D.draw_region_x) {
			int_8 = Rasterizer2D.draw_region_x - int_0;
			int_5 -= int_8;
			int_0 = Rasterizer2D.draw_region_x;
			int_3 += int_8;
			int_2 += int_8;
			int_7 += int_8;
			int_6 += int_8;
		}

		if ((int_5 + int_0) > Rasterizer2D.drawingAreaBottom) {
			int_8 = (int_5 + int_0) - Rasterizer2D.drawingAreaBottom;
			int_5 -= int_8;
			int_7 += int_8;
			int_6 += int_8;
		}

		if ((int_5 > 0) && (int_4 > 0)) {
			method934(Rasterizer2D.graphicsPixels, image, 0, int_3, int_2, int_5, int_4, int_6, int_7);
		}
	}

	public SpritePixels copy() {
		final SpritePixels spritepixels_1 = new SpritePixels(maxWidth, maxHeight);

		for (int int_0 = 0; int_0 < height; int_0++) {
			for (int int_1 = 0; int_1 < width; int_1++) {
				spritepixels_1.image[((int_0 + offsetY) * maxWidth) + int_1 + offsetX] = image[int_1 + (int_0 * width)];
			}
		}

		return spritepixels_1;
	}

	public void method917() {
		final int[] ints_0 = new int[width * height];
		int int_0 = 0;

		for (int int_1 = height - 1; int_1 >= 0; --int_1) {
			for (int int_2 = 0; int_2 < width; int_2++) {
				ints_0[int_0++] = image[int_2 + (int_1 * width)];
			}
		}

		image = ints_0;
		offsetY = maxHeight - height - offsetY;
	}

	public void method918() {
		final int[] ints_0 = new int[width * height];
		int int_0 = 0;

		for (int int_1 = 0; int_1 < height; int_1++) {
			for (int int_2 = width - 1; int_2 >= 0; --int_2) {
				ints_0[int_0++] = image[int_2 + (int_1 * width)];
			}
		}

		image = ints_0;
		offsetX = maxWidth - width - offsetX;
	}

	public void method919(final int int_0) {
		if ((width != maxWidth) || (height != maxHeight)) {
			int int_1 = int_0;
			if (int_0 > offsetX) {
				int_1 = offsetX;
			}

			int int_2 = int_0;
			if ((int_0 + offsetX + width) > maxWidth) {
				int_2 = maxWidth - offsetX - width;
			}

			int int_3 = int_0;
			if (int_0 > offsetY) {
				int_3 = offsetY;
			}

			int int_4 = int_0;
			if ((int_0 + offsetY + height) > maxHeight) {
				int_4 = maxHeight - offsetY - height;
			}

			final int int_5 = int_2 + int_1 + width;
			final int int_6 = int_4 + int_3 + height;
			final int[] ints_0 = new int[int_5 * int_6];

			for (int int_7 = 0; int_7 < height; int_7++) {
				for (int int_8 = 0; int_8 < width; int_8++) {
					ints_0[(int_5 * (int_7 + int_3)) + int_8 + int_1] = image[int_8 + (int_7 * width)];
				}
			}

			image = ints_0;
			width = int_5;
			height = int_6;
			offsetX -= int_1;
			offsetY -= int_3;
		}
	}

	public void method920(final int int_0) {
		final int[] ints_0 = new int[width * height];
		int int_1 = 0;

		for (int int_2 = 0; int_2 < height; int_2++) {
			for (int int_3 = 0; int_3 < width; int_3++) {
				int int_4 = image[int_1];
				if (int_4 == 0) {
					if ((int_3 > 0) && (image[int_1 - 1] != 0)) {
						int_4 = int_0;
					} else if ((int_2 > 0) && (image[int_1 - width] != 0)) {
						int_4 = int_0;
					} else if ((int_3 < (width - 1)) && (image[int_1 + 1] != 0)) {
						int_4 = int_0;
					} else if ((int_2 < (height - 1)) && (image[int_1 + width] != 0)) {
						int_4 = int_0;
					}
				}

				ints_0[int_1++] = int_4;
			}
		}

		image = ints_0;
	}

	public void method921(final int int_0) {
		for (int int_1 = height - 1; int_1 > 0; --int_1) {
			final int int_2 = int_1 * width;

			for (int int_3 = width - 1; int_3 > 0; --int_3) {
				if ((image[int_3 + int_2] == 0) && (image[(int_3 + int_2) - 1 - width] != 0)) {
					image[int_3 + int_2] = int_0;
				}
			}
		}

	}

	public void method922() {
		if ((width != maxWidth) || (height != maxHeight)) {
			final int[] ints_0 = new int[maxWidth * maxHeight];

			for (int int_0 = 0; int_0 < height; int_0++) {
				for (int int_1 = 0; int_1 < width; int_1++) {
					ints_0[((int_0 + offsetY) * maxWidth) + int_1 + offsetX] = image[int_1 + (int_0 * width)];
				}
			}

			image = ints_0;
			width = maxWidth;
			height = maxHeight;
			offsetX = 0;
			offsetY = 0;
		}
	}

	public void method923(int int_0, int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final int int_6, final int int_7, final int[] ints_0, final int[] ints_1) {
		try {
			final int int_8 = -int_2 / 2;
			final int int_9 = -int_3 / 2;
			int int_10 = (int) (Math.sin(int_6 / 326.11D) * 65536.0D);
			int int_11 = (int) (Math.cos(int_6 / 326.11D) * 65536.0D);
			int_10 = (int_10 * int_7) >> 8;
			int_11 = (int_11 * int_7) >> 8;
			int int_12 = (int_4 << 16) + (int_9 * int_10) + (int_8 * int_11);
			int int_13 = ((int_9 * int_11) - (int_8 * int_10)) + (int_5 << 16);
			int int_14 = int_0 + (int_1 * Rasterizer2D.graphicsPixelsWidth);

			for (int_1 = 0; int_1 < int_3; int_1++) {
				final int int_15 = ints_0[int_1];
				int int_16 = int_14 + int_15;
				int int_17 = int_12 + (int_11 * int_15);
				int int_18 = int_13 - (int_10 * int_15);

				for (int_0 = -ints_1[int_1]; int_0 < 0; int_0++) {
					Rasterizer2D.graphicsPixels[int_16++] = image[((int_18 >> 16) * width) + (int_17 >> 16)];
					int_17 += int_11;
					int_18 -= int_10;
				}

				int_12 += int_10;
				int_13 += int_11;
				int_14 += Rasterizer2D.graphicsPixelsWidth;
			}

		} catch (final Exception exception_0) {
			;
		}
	}

	public void method924(int int_0, int int_1, int int_2, int int_3, final int int_4) {
		if ((int_2 > 0) && (int_3 > 0)) {
			final int int_5 = width;
			final int int_6 = height;
			int int_7 = 0;
			int int_8 = 0;
			final int int_9 = maxWidth;
			final int int_10 = maxHeight;
			final int int_11 = (int_9 << 16) / int_2;
			final int int_12 = (int_10 << 16) / int_3;
			int int_13;
			if (offsetX > 0) {
				int_13 = ((int_11 + (offsetX << 16)) - 1) / int_11;
				int_0 += int_13;
				int_7 += (int_13 * int_11) - (offsetX << 16);
			}

			if (offsetY > 0) {
				int_13 = ((int_12 + (offsetY << 16)) - 1) / int_12;
				int_1 += int_13;
				int_8 += (int_13 * int_12) - (offsetY << 16);
			}

			if (int_5 < int_9) {
				int_2 = ((int_11 + ((int_5 << 16) - int_7)) - 1) / int_11;
			}

			if (int_6 < int_10) {
				int_3 = ((int_12 + ((int_6 << 16) - int_8)) - 1) / int_12;
			}

			int_13 = int_0 + (int_1 * Rasterizer2D.graphicsPixelsWidth);
			int int_14 = Rasterizer2D.graphicsPixelsWidth - int_2;
			if ((int_1 + int_3) > Rasterizer2D.drawingAreaRight) {
				int_3 -= (int_1 + int_3) - Rasterizer2D.drawingAreaRight;
			}

			int int_15;
			if (int_1 < Rasterizer2D.drawingAreaTop) {
				int_15 = Rasterizer2D.drawingAreaTop - int_1;
				int_3 -= int_15;
				int_13 += int_15 * Rasterizer2D.graphicsPixelsWidth;
				int_8 += int_12 * int_15;
			}

			if ((int_2 + int_0) > Rasterizer2D.drawingAreaBottom) {
				int_15 = (int_2 + int_0) - Rasterizer2D.drawingAreaBottom;
				int_2 -= int_15;
				int_14 += int_15;
			}

			if (int_0 < Rasterizer2D.draw_region_x) {
				int_15 = Rasterizer2D.draw_region_x - int_0;
				int_2 -= int_15;
				int_13 += int_15;
				int_7 += int_11 * int_15;
				int_14 += int_15;
			}

			method935(Rasterizer2D.graphicsPixels, image, 0, int_7, int_8, int_13, int_14, int_2, int_3, int_11, int_12,
					int_5, int_4);
		}
	}

	public void method925(final int int_0, final int int_1, final int int_2, final int int_3) {
		method911(maxWidth << 3, maxHeight << 3, int_0 << 4, int_1 << 4, int_2, int_3);
	}

	public void method926(int int_0, int int_1, final int int_2) {
		int_0 += offsetX;
		int_1 += offsetY;
		int int_3 = int_0 + (int_1 * Rasterizer2D.graphicsPixelsWidth);
		int int_4 = 0;
		int int_5 = height;
		int int_6 = width;
		int int_7 = Rasterizer2D.graphicsPixelsWidth - int_6;
		int int_8 = 0;
		int int_9;
		if (int_1 < Rasterizer2D.drawingAreaTop) {
			int_9 = Rasterizer2D.drawingAreaTop - int_1;
			int_5 -= int_9;
			int_1 = Rasterizer2D.drawingAreaTop;
			int_4 += int_9 * int_6;
			int_3 += int_9 * Rasterizer2D.graphicsPixelsWidth;
		}

		if ((int_5 + int_1) > Rasterizer2D.drawingAreaRight) {
			int_5 -= (int_5 + int_1) - Rasterizer2D.drawingAreaRight;
		}

		if (int_0 < Rasterizer2D.draw_region_x) {
			int_9 = Rasterizer2D.draw_region_x - int_0;
			int_6 -= int_9;
			int_0 = Rasterizer2D.draw_region_x;
			int_4 += int_9;
			int_3 += int_9;
			int_8 += int_9;
			int_7 += int_9;
		}

		if ((int_6 + int_0) > Rasterizer2D.drawingAreaBottom) {
			int_9 = (int_6 + int_0) - Rasterizer2D.drawingAreaBottom;
			int_6 -= int_9;
			int_8 += int_9;
			int_7 += int_9;
		}

		if ((int_6 > 0) && (int_5 > 0)) {
			method933(Rasterizer2D.graphicsPixels, image, 0, int_4, int_3, int_6, int_5, int_7, int_8, int_2);
		}
	}

	public SpritePixels method927() {
		final SpritePixels spritepixels_1 = new SpritePixels(width, height);
		spritepixels_1.maxWidth = maxWidth;
		spritepixels_1.maxHeight = maxHeight;
		spritepixels_1.offsetX = maxWidth - width - offsetX;
		spritepixels_1.offsetY = offsetY;

		for (int int_0 = 0; int_0 < height; int_0++) {
			for (int int_1 = 0; int_1 < width; int_1++) {
				spritepixels_1.image[int_1 + (int_0 * width)] = image[((int_0 * width) + width) - 1 - int_1];
			}
		}

		return spritepixels_1;
	}

	public void method928(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int[] ints_0, final int[] ints_1) {
		final int int_6 = int_1 < 0 ? -int_1 : 0;
		final int int_7 = (int_1 + height) <= int_5 ? height : int_5 - int_1;
		final int int_8 = int_0 < 0 ? -int_0 : 0;
		if ((width + int_0) <= int_4) {
		} else {
		}

		int int_10 = ((int_3 + int_1 + int_6) * Rasterizer2D.graphicsPixelsWidth) + int_2 + int_0 + int_8;
		int int_11 = int_6 + int_1;

		for (int int_12 = int_6; int_12 < int_7; int_12++) {
			final int int_14 = ints_0[int_11];
			final int int_15 = ints_1[int_11++];
			int int_16 = int_10;
			int int_17;
			if (int_0 < int_14) {
				int_17 = int_14 - int_0;
				int_16 = int_10 + (int_17 - int_8);
			} else {
				int_17 = int_8;
			}

			int int_9;
			if ((width + int_0) <= (int_14 + int_15)) {
				int_9 = width;
			} else {
				int_9 = (int_14 + int_15) - int_0;
			}

			for (int int_18 = int_17; int_18 < int_9; int_18++) {
				final int int_19 = image[int_18 + (int_12 * width)];
				if (int_19 != 0) {
					Rasterizer2D.graphicsPixels[int_16++] = int_19;
				} else {
					++int_16;
				}
			}

			int_10 += Rasterizer2D.graphicsPixelsWidth;
		}

	}

	public void method929(int int_0, int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final double double_0, final int int_6) {
		try {
			final int int_7 = -int_2 / 2;
			final int int_8 = -int_3 / 2;
			int int_9 = (int) (Math.sin(double_0) * 65536.0D);
			int int_10 = (int) (Math.cos(double_0) * 65536.0D);
			int_9 = (int_9 * int_6) >> 8;
			int_10 = (int_10 * int_6) >> 8;
			int int_11 = (int_4 << 16) + (int_8 * int_9) + (int_7 * int_10);
			int int_12 = ((int_8 * int_10) - (int_7 * int_9)) + (int_5 << 16);
			int int_13 = int_0 + (int_1 * Rasterizer2D.graphicsPixelsWidth);

			for (int_1 = 0; int_1 < int_3; int_1++) {
				int int_14 = int_13;
				int int_15 = int_11;
				int int_16 = int_12;

				for (int_0 = -int_2; int_0 < 0; int_0++) {
					final int int_17 = image[(width * (int_16 >> 16)) + (int_15 >> 16)];
					if (int_17 != 0) {
						Rasterizer2D.graphicsPixels[int_14++] = int_17;
					} else {
						++int_14;
					}

					int_15 += int_10;
					int_16 -= int_9;
				}

				int_11 += int_9;
				int_12 += int_10;
				int_13 += Rasterizer2D.graphicsPixelsWidth;
			}

		} catch (final Exception exception_0) {
			;
		}
	}

	public void method930(int int_0, int int_1, final int int_2, final int int_3) {
		int_0 += offsetX;
		int_1 += offsetY;
		int int_4 = int_0 + (int_1 * Rasterizer2D.graphicsPixelsWidth);
		int int_5 = 0;
		int int_6 = height;
		int int_7 = width;
		int int_8 = Rasterizer2D.graphicsPixelsWidth - int_7;
		int int_9 = 0;
		int int_10;
		if (int_1 < Rasterizer2D.drawingAreaTop) {
			int_10 = Rasterizer2D.drawingAreaTop - int_1;
			int_6 -= int_10;
			int_1 = Rasterizer2D.drawingAreaTop;
			int_5 += int_10 * int_7;
			int_4 += int_10 * Rasterizer2D.graphicsPixelsWidth;
		}

		if ((int_6 + int_1) > Rasterizer2D.drawingAreaRight) {
			int_6 -= (int_6 + int_1) - Rasterizer2D.drawingAreaRight;
		}

		if (int_0 < Rasterizer2D.draw_region_x) {
			int_10 = Rasterizer2D.draw_region_x - int_0;
			int_7 -= int_10;
			int_0 = Rasterizer2D.draw_region_x;
			int_5 += int_10;
			int_4 += int_10;
			int_9 += int_10;
			int_8 += int_10;
		}

		if ((int_7 + int_0) > Rasterizer2D.drawingAreaBottom) {
			int_10 = (int_7 + int_0) - Rasterizer2D.drawingAreaBottom;
			int_7 -= int_10;
			int_9 += int_10;
			int_8 += int_10;
		}

		if ((int_7 > 0) && (int_6 > 0)) {
			method931(Rasterizer2D.graphicsPixels, image, 0, int_5, int_4, int_7, int_6, int_8, int_9, int_2, int_3);
		}
	}

	static void method931(final int[] ints_0, final int[] ints_1, int int_0, int int_1, int int_2, final int int_3,
			final int int_4, final int int_5, final int int_6, final int int_7, int int_8) {
		final int int_9 = 256 - int_7;
		int int_10 = ((int_8 & 0xFF00FF) * int_9) & 0xFF00FF00;
		int int_11 = (int_9 * (int_8 & 0xFF00)) & 0xFF0000;
		int_8 = (int_10 | int_11) >>> 8;

		for (int int_12 = -int_4; int_12 < 0; int_12++) {
			for (int int_13 = -int_3; int_13 < 0; int_13++) {
				int_0 = ints_1[int_1++];
				if (int_0 != 0) {
					int_10 = ((int_0 & 0xFF00FF) * int_7) & 0xFF00FF00;
					int_11 = (int_7 * (int_0 & 0xFF00)) & 0xFF0000;
					ints_0[int_2++] = int_8 + ((int_10 | int_11) >>> 8);
				} else {
					++int_2;
				}
			}

			int_2 += int_5;
			int_1 += int_6;
		}

	}

	static void method932(final int[] ints_0, final int[] ints_1, int int_0, int int_1, final int int_2,
			final int int_3, final int int_4, final int int_5) {
		for (int int_6 = -int_3; int_6 < 0; int_6++) {
			int int_7;
			for (int_7 = (int_1 + int_2) - 3; int_1 < int_7; ints_0[int_1++] = ints_1[int_0++]) {
				ints_0[int_1++] = ints_1[int_0++];
				ints_0[int_1++] = ints_1[int_0++];
				ints_0[int_1++] = ints_1[int_0++];
			}

			for (int_7 += 3; int_1 < int_7; ints_0[int_1++] = ints_1[int_0++]) {
				;
			}

			int_1 += int_4;
			int_0 += int_5;
		}

	}

	static void method933(final int[] ints_0, final int[] ints_1, int int_0, int int_1, int int_2, final int int_3,
			final int int_4, final int int_5, final int int_6, final int int_7) {
		final int int_8 = 256 - int_7;

		for (int int_9 = -int_4; int_9 < 0; int_9++) {
			for (int int_10 = -int_3; int_10 < 0; int_10++) {
				int_0 = ints_1[int_1++];
				if (int_0 != 0) {
					final int int_11 = ints_0[int_2];
					ints_0[int_2++] = (((((int_11 & 0xFF00FF) * int_8) + ((int_0 & 0xFF00FF) * int_7)) & 0xFF00FF00)
							+ ((((int_11 & 0xFF00) * int_8) + ((int_0 & 0xFF00) * int_7)) & 0xFF0000)) >> 8;
				} else {
					++int_2;
				}
			}

			int_2 += int_5;
			int_1 += int_6;
		}

	}

	static void method934(final int[] ints_0, final int[] ints_1, int int_0, int int_1, int int_2, int int_3,
			final int int_4, final int int_5, final int int_6) {
		final int int_7 = -(int_3 >> 2);
		int_3 = -(int_3 & 0x3);

		for (int int_8 = -int_4; int_8 < 0; int_8++) {
			int int_9;
			for (int_9 = int_7; int_9 < 0; int_9++) {
				int_0 = ints_1[int_1++];
				if (int_0 != 0) {
					ints_0[int_2++] = int_0;
				} else {
					++int_2;
				}

				int_0 = ints_1[int_1++];
				if (int_0 != 0) {
					ints_0[int_2++] = int_0;
				} else {
					++int_2;
				}

				int_0 = ints_1[int_1++];
				if (int_0 != 0) {
					ints_0[int_2++] = int_0;
				} else {
					++int_2;
				}

				int_0 = ints_1[int_1++];
				if (int_0 != 0) {
					ints_0[int_2++] = int_0;
				} else {
					++int_2;
				}
			}

			for (int_9 = int_3; int_9 < 0; int_9++) {
				int_0 = ints_1[int_1++];
				if (int_0 != 0) {
					ints_0[int_2++] = int_0;
				} else {
					++int_2;
				}
			}

			int_2 += int_5;
			int_1 += int_6;
		}

	}

	static void method935(final int[] ints_0, final int[] ints_1, int int_0, int int_1, int int_2, int int_3,
			final int int_4, final int int_5, final int int_6, final int int_7, final int int_8, final int int_9,
			final int int_10) {
		final int int_11 = 256 - int_10;
		final int int_12 = int_1;

		for (int int_13 = -int_6; int_13 < 0; int_13++) {
			final int int_14 = int_9 * (int_2 >> 16);

			for (int int_15 = -int_5; int_15 < 0; int_15++) {
				int_0 = ints_1[(int_1 >> 16) + int_14];
				if (int_0 != 0) {
					final int int_16 = ints_0[int_3];
					ints_0[int_3++] = ((((int_11 * (int_16 & 0xFF00)) + ((int_0 & 0xFF00) * int_10)) & 0xFF0000)
							+ ((((int_0 & 0xFF00FF) * int_10) + (int_11 * (int_16 & 0xFF00FF))) & 0xFF00FF00)) >> 8;
				} else {
					++int_3;
				}

				int_1 += int_7;
			}

			int_2 += int_8;
			int_1 = int_12;
			int_3 += int_4;
		}

	}

	static void method936(final int[] ints_0, final int[] ints_1, int int_0, int int_1, int int_2, int int_3,
			final int int_4, final int int_5, final int int_6, final int int_7, final int int_8, final int int_9) {
		final int int_10 = int_1;

		for (int int_11 = -int_6; int_11 < 0; int_11++) {
			final int int_12 = int_9 * (int_2 >> 16);

			for (int int_13 = -int_5; int_13 < 0; int_13++) {
				int_0 = ints_1[(int_1 >> 16) + int_12];
				if (int_0 != 0) {
					ints_0[int_3++] = int_0;
				} else {
					++int_3;
				}

				int_1 += int_7;
			}

			int_2 += int_8;
			int_1 = int_10;
			int_3 += int_4;
		}

	}

}
