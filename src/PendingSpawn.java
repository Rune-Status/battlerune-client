public final class PendingSpawn extends Node {

	static int anInt362;
	int delay;
	int hitpoints;
	int anInt363;
	int anInt364;
	int level;
	int anInt365;
	int type;
	int anInt366;
	int anInt367;
	int anInt368;
	int orientation;
	int anInt369;

	PendingSpawn() {
		delay = 0;
		hitpoints = -1;
	}

	public static RSEnum forOrdinal(final RSEnum[] rsenums_0, final int int_0) {
		final RSEnum[] rsenums_1 = rsenums_0;

		for (int int_1 = 0; int_1 < rsenums_1.length; int_1++) {
			final RSEnum rsenum_0 = rsenums_1[int_1];
			if (int_0 == rsenum_0.rsOrdinal()) {
				return rsenum_0;
			}
		}

		return null;
	}

	static void method635() {
		FileOnDisk fileondisk_0 = null;

		try {
			fileondisk_0 = RuntimeException_Sub1.getPreferencesFile("", Varcs.anEnum6_1.aString19, true);
			final Buffer buffer_0 = Class28.preferences.serialize();
			fileondisk_0.write(buffer_0.payload, 0, buffer_0.offset);
		} catch (final Exception exception_0) {
			;
		}

		try {
			if (fileondisk_0 != null) {
				fileondisk_0.close();
			}

		} catch (final Exception exception_1) {
			;
		}
	}

	public static void method636(final IndexDataBase indexdatabase_0) {
		InvType.anIndexDataBase18 = indexdatabase_0;
	}

	static final void method637(final Region region_0, final CollisionData[] collisiondatas_0) {
		int int_0;
		int int_1;
		int int_2;
		int int_3;
		for (int_0 = 0; int_0 < 4; int_0++) {
			for (int_1 = 0; int_1 < 104; int_1++) {
				for (int_2 = 0; int_2 < 104; int_2++) {
					if ((Class18.tileSettings[int_0][int_1][int_2] & 0x1) == 1) {
						int_3 = int_0;
						if ((Class18.tileSettings[1][int_1][int_2] & 0x2) == 2) {
							int_3 = int_0 - 1;
						}

						if (int_3 >= 0) {
							collisiondatas_0[int_3].method553(int_1, int_2);
						}
					}
				}
			}
		}

		Class18.anInt72 += (int) (Math.random() * 5.0D) - 2;
		if (Class18.anInt72 < -8) {
			Class18.anInt72 = -8;
		}

		if (Class18.anInt72 > 8) {
			Class18.anInt72 = 8;
		}

		Class18.anInt73 += (int) (Math.random() * 5.0D) - 2;
		if (Class18.anInt73 < -16) {
			Class18.anInt73 = -16;
		}

		if (Class18.anInt73 > 16) {
			Class18.anInt73 = 16;
		}

		int int_4;
		int int_5;
		int int_6;
		int int_7;
		int int_8;
		int int_9;
		int int_10;
		int int_11;
		int int_12;
		int int_13;
		for (int_0 = 0; int_0 < 4; int_0++) {
			final byte[][] bytes_0 = Class18.aByteArrayArrayArray4[int_0];
			int_4 = (int) Math.sqrt(5100.0D);
			int_5 = (int_4 * 768) >> 8;

			int int_14;
			int int_15;
			for (int_6 = 1; int_6 < 103; int_6++) {
				for (int_7 = 1; int_7 < 103; int_7++) {
					int_8 = Class18.tileHeights[int_0][int_7 + 1][int_6] - Class18.tileHeights[int_0][int_7 - 1][int_6];
					int_9 = Class18.tileHeights[int_0][int_7][int_6 + 1] - Class18.tileHeights[int_0][int_7][int_6 - 1];
					int_10 = (int) Math.sqrt(65536 + (int_8 * int_8) + (int_9 * int_9));
					int_11 = (int_8 << 8) / int_10;
					int_12 = 65536 / int_10;
					int_13 = (int_9 << 8) / int_10;
					int_14 = (((int_11 * -50) + (int_12 * -10) + (int_13 * -50)) / int_5) + 96;
					int_15 = (bytes_0[int_7][int_6] >> 1) + (bytes_0[int_7 + 1][int_6] >> 3)
							+ (bytes_0[int_7 - 1][int_6] >> 2) + (bytes_0[int_7][int_6 - 1] >> 2)
							+ (bytes_0[int_7][1 + int_6] >> 3);
					FileRequest.anIntArrayArray14[int_7][int_6] = int_14 - int_15;
				}
			}

			for (int_6 = 0; int_6 < 104; int_6++) {
				Class18.blendedHue[int_6] = 0;
				Class42.blendedSaturation[int_6] = 0;
				AClass4_Sub1.anIntArray82[int_6] = 0;
				Class18.anIntArray8[int_6] = 0;
				Varcs.anIntArray59[int_6] = 0;
			}

			for (int_6 = -5; int_6 < 109; int_6++) {
				for (int_7 = 0; int_7 < 104; int_7++) {
					int_8 = int_6 + 5;
					if ((int_8 >= 0) && (int_8 < 104)) {
						int_9 = Item.underlayIds[int_0][int_8][int_7] & 0xFF;
						if (int_9 > 0) {
							final FloorUnderlayDefinition floorunderlaydefinition_0 = Class53.method322(int_9 - 1);
							Class18.blendedHue[int_7] += floorunderlaydefinition_0.hue;
							Class42.blendedSaturation[int_7] += floorunderlaydefinition_0.saturation;
							AClass4_Sub1.anIntArray82[int_7] += floorunderlaydefinition_0.lightness;
							Class18.anIntArray8[int_7] += floorunderlaydefinition_0.hueMultiplier;
							++Varcs.anIntArray59[int_7];
						}
					}

					int_9 = int_6 - 5;
					if ((int_9 >= 0) && (int_9 < 104)) {
						int_10 = Item.underlayIds[int_0][int_9][int_7] & 0xFF;
						if (int_10 > 0) {
							final FloorUnderlayDefinition floorunderlaydefinition_1 = Class53.method322(int_10 - 1);
							Class18.blendedHue[int_7] -= floorunderlaydefinition_1.hue;
							Class42.blendedSaturation[int_7] -= floorunderlaydefinition_1.saturation;
							AClass4_Sub1.anIntArray82[int_7] -= floorunderlaydefinition_1.lightness;
							Class18.anIntArray8[int_7] -= floorunderlaydefinition_1.hueMultiplier;
							--Varcs.anIntArray59[int_7];
						}
					}
				}

				if ((int_6 >= 1) && (int_6 < 103)) {
					int_7 = 0;
					int_8 = 0;
					int_9 = 0;
					int_10 = 0;
					int_11 = 0;

					for (int_12 = -5; int_12 < 109; int_12++) {
						int_13 = int_12 + 5;
						if ((int_13 >= 0) && (int_13 < 104)) {
							int_7 += Class18.blendedHue[int_13];
							int_8 += Class42.blendedSaturation[int_13];
							int_9 += AClass4_Sub1.anIntArray82[int_13];
							int_10 += Class18.anIntArray8[int_13];
							int_11 += Varcs.anIntArray59[int_13];
						}

						int_14 = int_12 - 5;
						if ((int_14 >= 0) && (int_14 < 104)) {
							int_7 -= Class18.blendedHue[int_14];
							int_8 -= Class42.blendedSaturation[int_14];
							int_9 -= AClass4_Sub1.anIntArray82[int_14];
							int_10 -= Class18.anIntArray8[int_14];
							int_11 -= Varcs.anIntArray59[int_14];
						}

						if ((int_12 >= 1) && (int_12 < 103)
								&& (!Client.lowMemory || ((Class18.tileSettings[0][int_6][int_12] & 0x2) != 0)
										|| ((Class18.tileSettings[int_0][int_6][int_12] & 0x10) == 0))) {
							if (int_0 < Class18.anInt71) {
								Class18.anInt71 = int_0;
							}

							int_15 = Item.underlayIds[int_0][int_6][int_12] & 0xFF;
							final int int_19 = Class18.overlayIds[int_0][int_6][int_12] & 0xFF;
							if ((int_15 > 0) || (int_19 > 0)) {
								final int int_20 = Class18.tileHeights[int_0][int_6][int_12];
								final int int_21 = Class18.tileHeights[int_0][int_6 + 1][int_12];
								final int int_22 = Class18.tileHeights[int_0][int_6 + 1][int_12 + 1];
								final int int_23 = Class18.tileHeights[int_0][int_6][int_12 + 1];
								final int int_24 = FileRequest.anIntArrayArray14[int_6][int_12];
								final int int_25 = FileRequest.anIntArrayArray14[int_6 + 1][int_12];
								final int int_26 = FileRequest.anIntArrayArray14[int_6 + 1][int_12 + 1];
								final int int_27 = FileRequest.anIntArrayArray14[int_6][int_12 + 1];
								int int_28 = -1;
								int int_29 = -1;
								int int_30;
								int int_31;
								if (int_15 > 0) {
									int_30 = (int_7 * 256) / int_10;
									int_31 = int_8 / int_11;
									int int_32 = int_9 / int_11;
									int_28 = Player.hsl24to16(int_30, int_31, int_32);
									int_30 = (int_30 + Class18.anInt72) & 0xFF;
									int_32 += Class18.anInt73;
									if (int_32 < 0) {
										int_32 = 0;
									} else if (int_32 > 255) {
										int_32 = 255;
									}

									int_29 = Player.hsl24to16(int_30, int_31, int_32);
								}

								if (int_0 > 0) {
									boolean bool_0 = true;
									if ((int_15 == 0) && (Class33.overlayPaths[int_0][int_6][int_12] != 0)) {
										bool_0 = false;
									}

									if ((int_19 > 0) && !CacheableNode_Sub5.method830(int_19 - 1).isHidden) {
										bool_0 = false;
									}

									if (bool_0 && (int_20 == int_21) && (int_20 == int_22) && (int_23 == int_20)) {
										AClass4.anIntArrayArrayArray1[int_0][int_6][int_12] |= 0x924;
									}
								}

								int_30 = 0;
								if (int_29 != -1) {
									int_30 = Graphics3D.colorPalette[method639(int_29, 96)];
								}

								if (int_19 == 0) {
									region_0.addTile(int_0, int_6, int_12, 0, 0, -1, int_20, int_21, int_22, int_23,
											method639(int_28, int_24), method639(int_28, int_25),
											method639(int_28, int_26), method639(int_28, int_27), 0, 0, 0, 0, int_30,
											0);
								} else {
									int_31 = Class33.overlayPaths[int_0][int_6][int_12] + 1;
									final byte byte_0 = Class18.overlayRotations[int_0][int_6][int_12];
									final Overlay overlay_0 = CacheableNode_Sub5.method830(int_19 - 1);
									int int_33 = overlay_0.texture;
									int int_34;
									int int_35;
									int int_36;
									int int_37;
									if (int_33 >= 0) {
										int_34 = Graphics3D.textureLoader.getAverageTextureRGB(int_33);
										int_35 = -1;
									} else if (overlay_0.color == 16711935) {
										int_35 = -2;
										int_33 = -1;
										int_34 = -2;
									} else {
										int_35 = Player.hsl24to16(overlay_0.hue, overlay_0.saturation,
												overlay_0.lightness);
										int_36 = (overlay_0.hue + Class18.anInt72) & 0xFF;
										int_37 = overlay_0.lightness + Class18.anInt73;
										if (int_37 < 0) {
											int_37 = 0;
										} else if (int_37 > 255) {
											int_37 = 255;
										}

										int_34 = Player.hsl24to16(int_36, overlay_0.saturation, int_37);
									}

									int_36 = 0;
									if (int_34 != -2) {
										int_36 = Graphics3D.colorPalette[Class53.adjustHSLListness0(int_34, 96)];
									}

									if (overlay_0.otherRgbColor != -1) {
										int_37 = (overlay_0.otherHue + Class18.anInt72) & 0xFF;
										int int_38 = overlay_0.otherLightness + Class18.anInt73;
										if (int_38 < 0) {
											int_38 = 0;
										} else if (int_38 > 255) {
											int_38 = 255;
										}

										int_34 = Player.hsl24to16(int_37, overlay_0.otherSaturation, int_38);
										int_36 = Graphics3D.colorPalette[Class53.adjustHSLListness0(int_34, 96)];
									}

									region_0.addTile(int_0, int_6, int_12, int_31, byte_0, int_33, int_20, int_21,
											int_22, int_23, method639(int_28, int_24), method639(int_28, int_25),
											method639(int_28, int_26), method639(int_28, int_27),
											Class53.adjustHSLListness0(int_35, int_24),
											Class53.adjustHSLListness0(int_35, int_25),
											Class53.adjustHSLListness0(int_35, int_26),
											Class53.adjustHSLListness0(int_35, int_27), int_30, int_36);
								}
							}
						}
					}
				}
			}

			for (int_6 = 1; int_6 < 103; int_6++) {
				for (int_7 = 1; int_7 < 103; int_7++) {
					region_0.setPhysicalLevel(int_0, int_7, int_6, Class14.method194(int_0, int_7, int_6));
				}
			}

			Item.underlayIds[int_0] = null;
			Class18.overlayIds[int_0] = null;
			Class33.overlayPaths[int_0] = null;
			Class18.overlayRotations[int_0] = null;
			Class18.aByteArrayArrayArray4[int_0] = null;
		}

		region_0.applyLighting(-50, -10, -50);

		for (int_0 = 0; int_0 < 104; int_0++) {
			for (int_1 = 0; int_1 < 104; int_1++) {
				if ((Class18.tileSettings[1][int_0][int_1] & 0x2) == 2) {
					region_0.setBridge(int_0, int_1);
				}
			}
		}

		int_0 = 1;
		int_1 = 2;
		int_2 = 4;

		for (int_3 = 0; int_3 < 4; int_3++) {
			if (int_3 > 0) {
				int_0 <<= 3;
				int_1 <<= 3;
				int_2 <<= 3;
			}

			for (int int_16 = 0; int_16 <= int_3; int_16++) {
				for (int int_17 = 0; int_17 <= 104; int_17++) {
					for (int int_18 = 0; int_18 <= 104; int_18++) {
						short short_0;
						if ((AClass4.anIntArrayArrayArray1[int_16][int_18][int_17] & int_0) != 0) {
							int_4 = int_17;
							int_5 = int_17;
							int_6 = int_16;

							for (int_7 = int_16; (int_4 > 0)
									&& ((AClass4.anIntArrayArrayArray1[int_16][int_18][int_4 - 1]
											& int_0) != 0); --int_4) {
								;
							}

							while ((int_5 < 104)
									&& ((AClass4.anIntArrayArrayArray1[int_16][int_18][int_5 + 1] & int_0) != 0)) {
								++int_5;
							}

							label338: while (int_6 > 0) {
								for (int_8 = int_4; int_8 <= int_5; int_8++) {
									if ((AClass4.anIntArrayArrayArray1[int_6 - 1][int_18][int_8] & int_0) == 0) {
										break label338;
									}
								}

								--int_6;
							}

							label327: while (int_7 < int_3) {
								for (int_8 = int_4; int_8 <= int_5; int_8++) {
									if ((AClass4.anIntArrayArrayArray1[int_7 + 1][int_18][int_8] & int_0) == 0) {
										break label327;
									}
								}

								++int_7;
							}

							int_8 = ((int_5 - int_4) + 1) * ((int_7 + 1) - int_6);
							if (int_8 >= 8) {
								short_0 = 240;
								int_10 = Class18.tileHeights[int_7][int_18][int_4] - short_0;
								int_11 = Class18.tileHeights[int_6][int_18][int_4];
								Region.addOcclude(int_3, 1, int_18 * 128, int_18 * 128, int_4 * 128,
										(int_5 * 128) + 128, int_10, int_11);

								for (int_12 = int_6; int_12 <= int_7; int_12++) {
									for (int_13 = int_4; int_13 <= int_5; int_13++) {
										AClass4.anIntArrayArrayArray1[int_12][int_18][int_13] &= ~int_0;
									}
								}
							}
						}

						if ((AClass4.anIntArrayArrayArray1[int_16][int_18][int_17] & int_1) != 0) {
							int_4 = int_18;
							int_5 = int_18;
							int_6 = int_16;

							for (int_7 = int_16; (int_4 > 0)
									&& ((AClass4.anIntArrayArrayArray1[int_16][int_4 - 1][int_17]
											& int_1) != 0); --int_4) {
								;
							}

							while ((int_5 < 104)
									&& ((AClass4.anIntArrayArrayArray1[int_16][int_5 + 1][int_17] & int_1) != 0)) {
								++int_5;
							}

							label391: while (int_6 > 0) {
								for (int_8 = int_4; int_8 <= int_5; int_8++) {
									if ((AClass4.anIntArrayArrayArray1[int_6 - 1][int_8][int_17] & int_1) == 0) {
										break label391;
									}
								}

								--int_6;
							}

							label380: while (int_7 < int_3) {
								for (int_8 = int_4; int_8 <= int_5; int_8++) {
									if ((AClass4.anIntArrayArrayArray1[int_7 + 1][int_8][int_17] & int_1) == 0) {
										break label380;
									}
								}

								++int_7;
							}

							int_8 = ((int_7 + 1) - int_6) * ((int_5 - int_4) + 1);
							if (int_8 >= 8) {
								short_0 = 240;
								int_10 = Class18.tileHeights[int_7][int_4][int_17] - short_0;
								int_11 = Class18.tileHeights[int_6][int_4][int_17];
								Region.addOcclude(int_3, 2, int_4 * 128, (int_5 * 128) + 128, int_17 * 128,
										int_17 * 128, int_10, int_11);

								for (int_12 = int_6; int_12 <= int_7; int_12++) {
									for (int_13 = int_4; int_13 <= int_5; int_13++) {
										AClass4.anIntArrayArrayArray1[int_12][int_13][int_17] &= ~int_1;
									}
								}
							}
						}

						if ((AClass4.anIntArrayArrayArray1[int_16][int_18][int_17] & int_2) != 0) {
							int_4 = int_18;
							int_5 = int_18;
							int_6 = int_17;

							for (int_7 = int_17; (int_6 > 0)
									&& ((AClass4.anIntArrayArrayArray1[int_16][int_18][int_6 - 1]
											& int_2) != 0); --int_6) {
								;
							}

							while ((int_7 < 104)
									&& ((AClass4.anIntArrayArrayArray1[int_16][int_18][1 + int_7] & int_2) != 0)) {
								++int_7;
							}

							label444: while (int_4 > 0) {
								for (int_8 = int_6; int_8 <= int_7; int_8++) {
									if ((AClass4.anIntArrayArrayArray1[int_16][int_4 - 1][int_8] & int_2) == 0) {
										break label444;
									}
								}

								--int_4;
							}

							label433: while (int_5 < 104) {
								for (int_8 = int_6; int_8 <= int_7; int_8++) {
									if ((AClass4.anIntArrayArrayArray1[int_16][1 + int_5][int_8] & int_2) == 0) {
										break label433;
									}
								}

								++int_5;
							}

							if ((((int_7 - int_6) + 1) * ((int_5 - int_4) + 1)) >= 4) {
								int_8 = Class18.tileHeights[int_16][int_4][int_6];
								Region.addOcclude(int_3, 4, int_4 * 128, (128 * int_5) + 128, int_6 * 128,
										(int_7 * 128) + 128, int_8, int_8);

								for (int_9 = int_4; int_9 <= int_5; int_9++) {
									for (int_10 = int_6; int_10 <= int_7; int_10++) {
										AClass4.anIntArrayArrayArray1[int_16][int_9][int_10] &= ~int_2;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public static String method638(long long_0) {
		if ((long_0 > 0L) && (long_0 < 6582952005840035281L)) {
			if ((long_0 % 37L) == 0L) {
				return null;
			} else {
				int int_0 = 0;

				for (long long_1 = long_0; long_1 != 0L; long_1 /= 37L) {
					++int_0;
				}

				StringBuilder stringbuilder_0;
				char char_0;
				for (stringbuilder_0 = new StringBuilder(int_0); long_0 != 0L; stringbuilder_0.append(char_0)) {
					final long long_2 = long_0;
					long_0 /= 37L;
					char_0 = Class94.aCharArray2[(int) (long_2 - (long_0 * 37L))];
					if (char_0 == 95) {
						final int int_1 = stringbuilder_0.length() - 1;
						stringbuilder_0.setCharAt(int_1, Character.toUpperCase(stringbuilder_0.charAt(int_1)));
						char_0 = 160;
					}
				}

				stringbuilder_0.reverse();
				stringbuilder_0.setCharAt(0, Character.toUpperCase(stringbuilder_0.charAt(0)));
				return stringbuilder_0.toString();
			}
		} else {
			return null;
		}
	}

	static final int method639(final int int_0, int int_1) {
		if (int_0 == -1) {
			return 12345678;
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
