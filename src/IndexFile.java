import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

public final class IndexFile {

	static byte[] aByteArray1;
	CacheFile dataFile;
	CacheFile indexFile;
	int maxSize;
	int index;

	static {
		aByteArray1 = new byte[520];
	}

	public IndexFile(final int int_0, final CacheFile cachefile_0, final CacheFile cachefile_1, final int int_1) {
		dataFile = null;
		indexFile = null;
		maxSize = 65000;
		index = int_0;
		dataFile = cachefile_0;
		indexFile = cachefile_1;
		maxSize = int_1;
	}

	boolean method67(final int int_0, final byte[] bytes_0, final int int_1, boolean bool_0) {
		synchronized (dataFile) {
			try {
				int int_2;
				boolean bool_1;
				if (bool_0) {
					if (indexFile.method531() < (int_0 * 6) + 6) {
						bool_1 = false;
						return bool_1;
					}

					indexFile.seek(int_0 * 6);
					indexFile.method530(aByteArray1, 0, 6);
					int_2 = ((aByteArray1[3] & 0xFF) << 16) + ((aByteArray1[4] & 0xFF) << 8) + (aByteArray1[5] & 0xFF);
					if ((int_2 <= 0) || (int_2 > (dataFile.method531() / 520L))) {
						bool_1 = false;
						return bool_1;
					}
				} else {
					int_2 = (int) ((dataFile.method531() + 519L) / 520L);
					if (int_2 == 0) {
						int_2 = 1;
					}
				}

				aByteArray1[0] = (byte) (int_1 >> 16);
				aByteArray1[1] = (byte) (int_1 >> 8);
				aByteArray1[2] = (byte) int_1;
				aByteArray1[3] = (byte) (int_2 >> 16);
				aByteArray1[4] = (byte) (int_2 >> 8);
				aByteArray1[5] = (byte) int_2;
				indexFile.seek(int_0 * 6);
				indexFile.write(aByteArray1, 0, 6);
				int int_3 = 0;
				int int_4 = 0;

				while (true) {
					if (int_3 < int_1) {
						label118: {
							int int_5 = 0;
							int int_6;
							if (bool_0) {
								label135: {
									dataFile.seek(int_2 * 520);

									try {
										dataFile.method530(aByteArray1, 0, 8);
									} catch (final EOFException eofexception_0) {
										break label118;
									}

									int_6 = ((aByteArray1[0] & 0xFF) << 8) + (aByteArray1[1] & 0xFF);
									final int int_7 = (aByteArray1[3] & 0xFF) + ((aByteArray1[2] & 0xFF) << 8);
									int_5 = (aByteArray1[6] & 0xFF) + ((aByteArray1[5] & 0xFF) << 8)
											+ ((aByteArray1[4] & 0xFF) << 16);
									final int int_8 = aByteArray1[7] & 0xFF;
									if ((int_6 == int_0) && (int_4 == int_7) && (int_8 == index)) {
										if ((int_5 >= 0) && (int_5 <= (dataFile.method531() / 520L))) {
											break label135;
										}

										bool_1 = false;
										return bool_1;
									}

									bool_1 = false;
									return bool_1;
								}
							}

							if (int_5 == 0) {
								bool_0 = false;
								int_5 = (int) ((dataFile.method531() + 519L) / 520L);
								if (int_5 == 0) {
									++int_5;
								}

								if (int_2 == int_5) {
									++int_5;
								}
							}

							if ((int_1 - int_3) <= 512) {
								int_5 = 0;
							}

							aByteArray1[0] = (byte) (int_0 >> 8);
							aByteArray1[1] = (byte) int_0;
							aByteArray1[2] = (byte) (int_4 >> 8);
							aByteArray1[3] = (byte) int_4;
							aByteArray1[4] = (byte) (int_5 >> 16);
							aByteArray1[5] = (byte) (int_5 >> 8);
							aByteArray1[6] = (byte) int_5;
							aByteArray1[7] = (byte) index;
							dataFile.seek(int_2 * 520);
							dataFile.write(aByteArray1, 0, 8);
							int_6 = int_1 - int_3;
							if (int_6 > 512) {
								int_6 = 512;
							}

							dataFile.write(bytes_0, int_3, int_6);
							int_3 += int_6;
							int_2 = int_5;
							++int_4;
							continue;
						}
					}

					bool_1 = true;
					return bool_1;
				}
			} catch (final IOException ioexception_0) {
				return false;
			}
		}
	}

	public boolean method68(final int int_0, final byte[] bytes_0, final int int_1) {
		synchronized (dataFile) {
			if ((int_1 >= 0) && (int_1 <= maxSize)) {
				boolean bool_0 = method67(int_0, bytes_0, int_1, true);
				if (!bool_0) {
					bool_0 = method67(int_0, bytes_0, int_1, false);
				}

				return bool_0;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	public byte[] method69(final int int_0) {
		synchronized (dataFile) {
			Object object_0;
			try {
				if (indexFile.method531() < (int_0 * 6) + 6) {
					object_0 = null;
					return (byte[]) object_0;
				}

				indexFile.seek(int_0 * 6);
				indexFile.method530(aByteArray1, 0, 6);
				final int int_1 = ((aByteArray1[0] & 0xFF) << 16) + ((aByteArray1[1] & 0xFF) << 8)
						+ (aByteArray1[2] & 0xFF);
				int int_2 = ((aByteArray1[4] & 0xFF) << 8) + ((aByteArray1[3] & 0xFF) << 16) + (aByteArray1[5] & 0xFF);
				if ((int_1 < 0) || (int_1 > maxSize)) {
					object_0 = null;
					return (byte[]) object_0;
				}

				if ((int_2 > 0) && (int_2 <= (dataFile.method531() / 520L))) {
					final byte[] bytes_0 = new byte[int_1];
					int int_3 = 0;
					int int_4 = 0;

					while (int_3 < int_1) {
						if (int_2 == 0) {
							object_0 = null;
							return (byte[]) object_0;
						}

						dataFile.seek(int_2 * 520);
						int int_5 = int_1 - int_3;
						if (int_5 > 512) {
							int_5 = 512;
						}

						dataFile.method530(aByteArray1, 0, int_5 + 8);
						final int int_6 = ((aByteArray1[0] & 0xFF) << 8) + (aByteArray1[1] & 0xFF);
						final int int_7 = (aByteArray1[3] & 0xFF) + ((aByteArray1[2] & 0xFF) << 8);
						final int int_8 = (aByteArray1[6] & 0xFF) + ((aByteArray1[5] & 0xFF) << 8)
								+ ((aByteArray1[4] & 0xFF) << 16);
						final int int_9 = aByteArray1[7] & 0xFF;
						if ((int_6 == int_0) && (int_7 == int_4) && (int_9 == index)) {
							if ((int_8 >= 0) && (int_8 <= (dataFile.method531() / 520L))) {
								for (int int_10 = 0; int_10 < int_5; int_10++) {
									bytes_0[int_3++] = aByteArray1[int_10 + 8];
								}

								int_2 = int_8;
								++int_4;
								continue;
							}

							object_0 = null;
							return (byte[]) object_0;
						}

						object_0 = null;
						return (byte[]) object_0;
					}

					final byte[] bytes_1 = bytes_0;
					return bytes_1;
				}

				object_0 = null;
			} catch (final IOException ioexception_0) {
				return null;
			}

			return (byte[]) object_0;
		}
	}

	static String method70(final Class70 class70_0, final int int_0, final String string_0) {
		if (class70_0 == null) {
			return string_0;
		} else {
			final Node_Sub3 node_sub3_0 = (Node_Sub3) class70_0.method419(int_0);
			return node_sub3_0 == null ? string_0 : (String) node_sub3_0.anObject4;
		}
	}

	static void method71(final ScriptEvent scriptevent_0, final int int_0) {
		final Object[] objects_0 = scriptevent_0.anObjectArray22;
		final Class91 class91_0 = scriptevent_0.aClass91_11;
		final boolean bool_0 = (class91_0 == Class91.aClass91_1) || (class91_0 == Class91.aClass91_3)
				|| (class91_0 == Class91.aClass91_4) || (class91_0 == Class91.aClass91_5)
				|| (class91_0 == Class91.aClass91_6) || (class91_0 == Class91.aClass91_7)
				|| (class91_0 == Class91.aClass91_8) || (class91_0 == Class91.aClass91_9);
		int int_1;
		int int_2;
		int int_3;
		int int_4;
		Script script_1;
		Script script_2;
		int int_5;
		if (bool_0) {
			Class45.aClass9_1 = (Class9) objects_0[0];
			final Area area_0 = Class17.anAreaArray1[Class45.aClass9_1.anInt32];
			final Class91 class91_1 = scriptevent_0.aClass91_11;
			int_1 = area_0.anInt468;
			int_2 = area_0.anInt474;
			int_3 = (int_1 << 8) + class91_1.anInt199;
			Script script_0 = GameEngine.method1030(int_3, class91_1);
			if (script_0 != null) {
				script_1 = script_0;
			} else {
				int_4 = Script.method844(int_2, class91_1);
				script_0 = GameEngine.method1030(int_4, class91_1);
				if (script_0 != null) {
					script_1 = script_0;
				} else {
					script_1 = null;
				}
			}

			script_2 = script_1;
		} else {
			int_5 = ((Integer) objects_0[0]).intValue();
			Script script_3 = (Script) Script.aNodeCache19.get(int_5);
			if (script_3 != null) {
				script_1 = script_3;
			} else {
				final byte[] bytes_1 = Class99.indexScripts.getConfigData(int_5, 0);
				if (bytes_1 == null) {
					script_1 = null;
				} else {
					script_3 = NPC.method1003(bytes_1);
					Script.aNodeCache19.put(script_3, int_5);
					script_1 = script_3;
				}
			}

			script_2 = script_1;
		}

		if (script_2 != null) {
			WorldMapType2.intStackSize = 0;
			BaseVarType.scriptStringStackSize = 0;
			int_5 = -1;
			int[] ints_2 = script_2.instructions;
			int[] ints_1 = script_2.intOperands;
			final byte byte_1 = -1;
			Class45.scriptStackCount = 0;

			try {
				Class45.scriptLocalInts = new int[script_2.localIntCount];
				int_2 = 0;
				Class45.scriptLocalStrings = new String[script_2.localStringCount];
				int_3 = 0;

				int int_6;
				String string_2;
				for (int_4 = 1; int_4 < objects_0.length; int_4++) {
					if (objects_0[int_4] instanceof Integer) {
						int_6 = ((Integer) objects_0[int_4]).intValue();
						if (int_6 == -2147483647) {
							int_6 = scriptevent_0.anInt415;
						}

						if (int_6 == -2147483646) {
							int_6 = scriptevent_0.anInt416;
						}

						if (int_6 == -2147483645) {
							int_6 = scriptevent_0.widget != null ? scriptevent_0.widget.anInt289 : -1;
						}

						if (int_6 == -2147483644) {
							int_6 = scriptevent_0.anInt418;
						}

						if (int_6 == -2147483643) {
							int_6 = scriptevent_0.widget != null ? scriptevent_0.widget.index : -1;
						}

						if (int_6 == -2147483642) {
							int_6 = scriptevent_0.aWidget8 != null ? scriptevent_0.aWidget8.anInt289 : -1;
						}

						if (int_6 == -2147483641) {
							int_6 = scriptevent_0.aWidget8 != null ? scriptevent_0.aWidget8.index : -1;
						}

						if (int_6 == -2147483640) {
							int_6 = scriptevent_0.anInt419;
						}

						if (int_6 == -2147483639) {
							int_6 = scriptevent_0.anInt420;
						}

						Class45.scriptLocalInts[int_2++] = int_6;
					} else if (objects_0[int_4] instanceof String) {
						string_2 = (String) objects_0[int_4];
						if (string_2.equals("event_opbase")) {
							string_2 = scriptevent_0.aString26;
						}

						Class45.scriptLocalStrings[int_3++] = string_2;
					}
				}

				int_4 = 0;
				Class45.anInt102 = scriptevent_0.anInt417;

				while (true) {
					while (true) {
						while (true) {
							while (true) {
								while (true) {
									while (true) {
										while (true) {
											while (true) {
												while (true) {
													while (true) {
														while (true) {
															while (true) {
																while (true) {
																	while (true) {
																		while (true) {
																			while (true) {
																				while (true) {
																					while (true) {
																						while (true) {
																							while (true) {
																								while (true) {
																									while (true) {
																										while (true) {
																											while (true) {
																												while (true) {
																													label1917: while (true) {
																														++int_4;
																														if (int_4 > int_0) {
																															throw new RuntimeException();
																														}

																														++int_5;
																														int_1 = ints_2[int_5];
																														int int_7;
																														int int_9;
																														int int_10;
																														int int_11;
																														int int_12;
																														int[] ints_3;
																														if (int_1 < 100) {
																															if (int_1 != 0) {
																																if (int_1 != 1) {
																																	if (int_1 != 2) {
																																		if (int_1 != 3) {
																																			if (int_1 != 6) {
																																				if (int_1 != 7) {
																																					if (int_1 != 8) {
																																						if (int_1 != 9) {
																																							if (int_1 != 10) {
																																								if (int_1 != 21) {
																																									if (int_1 != 25) {
																																										if (int_1 != 27) {
																																											if (int_1 != 31) {
																																												if (int_1 != 32) {
																																													if (int_1 != 33) {
																																														if (int_1 != 34) {
																																															if (int_1 != 35) {
																																																if (int_1 != 36) {
																																																	if (int_1 != 37) {
																																																		if (int_1 != 38) {
																																																			if (int_1 != 39) {
																																																				if (int_1 != 40) {
																																																					if (int_1 != 42) {
																																																						if (int_1 != 43) {
																																																							if (int_1 == 44) {
																																																								int_6 = ints_1[int_5] >> 16;
																																																								int_7 = ints_1[int_5]
																																																										& 0xFFFF;
																																																								final int int_15 = Class45.intStack[--WorldMapType2.intStackSize];
																																																								if ((int_15 >= 0)
																																																										&& (int_15 <= 5000)) {
																																																									Class45.anIntArray23[int_6] = int_15;
																																																									byte byte_5 = -1;
																																																									if (int_7 == 105) {
																																																										byte_5 = 0;
																																																									}

																																																									int_10 = 0;

																																																									while (true) {
																																																										if (int_10 >= int_15) {
																																																											continue label1917;
																																																										}

																																																										Class45.SHAPE_VERTICIES[int_6][int_10] = byte_5;
																																																										++int_10;
																																																									}
																																																								}

																																																								throw new RuntimeException();
																																																							} else if (int_1 == 45) {
																																																								int_6 = ints_1[int_5];
																																																								int_7 = Class45.intStack[--WorldMapType2.intStackSize];
																																																								if ((int_7 < 0)
																																																										|| (int_7 >= Class45.anIntArray23[int_6])) {
																																																									throw new RuntimeException();
																																																								}

																																																								Class45.intStack[++WorldMapType2.intStackSize
																																																										- 1] = Class45.SHAPE_VERTICIES[int_6][int_7];
																																																							} else if (int_1 == 46) {
																																																								int_6 = ints_1[int_5];
																																																								WorldMapType2.intStackSize -= 2;
																																																								int_7 = Class45.intStack[WorldMapType2.intStackSize];
																																																								if ((int_7 < 0)
																																																										|| (int_7 >= Class45.anIntArray23[int_6])) {
																																																									throw new RuntimeException();
																																																								}

																																																								Class45.SHAPE_VERTICIES[int_6][int_7] = Class45.intStack[WorldMapType2.intStackSize
																																																										+ 1];
																																																							} else if (int_1 == 47) {
																																																								string_2 = Class6.chatMessages
																																																										.getVarcString(
																																																												ints_1[int_5]);
																																																								if (string_2 == null) {
																																																									string_2 = "null";
																																																								}

																																																								Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																																										- 1] = string_2;
																																																							} else if (int_1 == 48) {
																																																								Class6.chatMessages
																																																										.putVarcString(
																																																												ints_1[int_5],
																																																												Class45.scriptStringStack[--BaseVarType.scriptStringStackSize]);
																																																							} else {
																																																								if (int_1 != 60) {
																																																									throw new IllegalStateException();
																																																								}

																																																								final Class70 class70_0 = script_2.switches[ints_1[int_5]];
																																																								final WidgetConfig widgetconfig_0 = (WidgetConfig) class70_0
																																																										.method419(
																																																												Class45.intStack[--WorldMapType2.intStackSize]);
																																																								if (widgetconfig_0 != null) {
																																																									int_5 += widgetconfig_0.config;
																																																								}
																																																							}
																																																						} else {
																																																							Class6.chatMessages
																																																									.putVarc(
																																																											ints_1[int_5],
																																																											Class45.intStack[--WorldMapType2.intStackSize]);
																																																						}
																																																					} else {
																																																						Class45.intStack[++WorldMapType2.intStackSize
																																																								- 1] = Class6.chatMessages
																																																										.getVarc(
																																																												ints_1[int_5]);
																																																					}
																																																				} else {
																																																					int_6 = ints_1[int_5];
																																																					Script script_4 = (Script) Script.aNodeCache19
																																																							.get(int_6);
																																																					Script script_5;
																																																					if (script_4 != null) {
																																																						script_5 = script_4;
																																																					} else {
																																																						final byte[] bytes_5 = Class99.indexScripts
																																																								.getConfigData(
																																																										int_6,
																																																										0);
																																																						if (bytes_5 == null) {
																																																							script_5 = null;
																																																						} else {
																																																							script_4 = NPC
																																																									.method1003(
																																																											bytes_5);
																																																							Script.aNodeCache19
																																																									.put(script_4,
																																																											int_6);
																																																							script_5 = script_4;
																																																						}
																																																					}

																																																					script_4 = script_5;
																																																					ints_3 = new int[script_5.localIntCount];
																																																					final String[] strings_0 = new String[script_5.localStringCount];

																																																					for (int_9 = 0; int_9 < script_4.intStackCount; int_9++) {
																																																						ints_3[int_9] = Class45.intStack[int_9
																																																								+ (WorldMapType2.intStackSize
																																																										- script_4.intStackCount)];
																																																					}

																																																					for (int_9 = 0; int_9 < script_4.stringStackCount; int_9++) {
																																																						strings_0[int_9] = Class45.scriptStringStack[int_9
																																																								+ (BaseVarType.scriptStringStackSize
																																																										- script_4.stringStackCount)];
																																																					}

																																																					WorldMapType2.intStackSize -= script_4.intStackCount;
																																																					BaseVarType.scriptStringStackSize -= script_4.stringStackCount;
																																																					final ScriptState scriptstate_1 = new ScriptState();
																																																					scriptstate_1.invokedFromScript = script_2;
																																																					scriptstate_1.invokedFromPc = int_5;
																																																					scriptstate_1.savedLocalInts = Class45.scriptLocalInts;
																																																					scriptstate_1.savedLocalStrings = Class45.scriptLocalStrings;
																																																					Class45.scriptStack[++Class45.scriptStackCount
																																																							- 1] = scriptstate_1;
																																																					script_2 = script_4;
																																																					ints_2 = script_4.instructions;
																																																					ints_1 = script_4.intOperands;
																																																					int_5 = -1;
																																																					Class45.scriptLocalInts = ints_3;
																																																					Class45.scriptLocalStrings = strings_0;
																																																				}
																																																			} else {
																																																				--BaseVarType.scriptStringStackSize;
																																																			}
																																																		} else {
																																																			--WorldMapType2.intStackSize;
																																																		}
																																																	} else {
																																																		int_6 = ints_1[int_5];
																																																		BaseVarType.scriptStringStackSize -= int_6;
																																																		final String string_0 = AbstractByteBuffer
																																																				.method260(
																																																						Class45.scriptStringStack,
																																																						BaseVarType.scriptStringStackSize,
																																																						int_6);
																																																		Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																																				- 1] = string_0;
																																																	}
																																																} else {
																																																	Class45.scriptLocalStrings[ints_1[int_5]] = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																																}
																																															} else {
																																																Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																																		- 1] = Class45.scriptLocalStrings[ints_1[int_5]];
																																															}
																																														} else {
																																															Class45.scriptLocalInts[ints_1[int_5]] = Class45.intStack[--WorldMapType2.intStackSize];
																																														}
																																													} else {
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = Class45.scriptLocalInts[ints_1[int_5]];
																																													}
																																												} else {
																																													WorldMapType2.intStackSize -= 2;
																																													if (Class45.intStack[WorldMapType2.intStackSize] >= Class45.intStack[WorldMapType2.intStackSize
																																															+ 1]) {
																																														int_5 += ints_1[int_5];
																																													}
																																												}
																																											} else {
																																												WorldMapType2.intStackSize -= 2;
																																												if (Class45.intStack[WorldMapType2.intStackSize] <= Class45.intStack[WorldMapType2.intStackSize
																																														+ 1]) {
																																													int_5 += ints_1[int_5];
																																												}
																																											}
																																										} else {
																																											int_6 = ints_1[int_5];
																																											int_7 = Class45.intStack[--WorldMapType2.intStackSize];
																																											Varbit varbit_1 = (Varbit) Varbit.varbits
																																													.get(int_6);
																																											Varbit varbit_0;
																																											if (varbit_1 != null) {
																																												varbit_0 = varbit_1;
																																											} else {
																																												final byte[] bytes_3 = Varbit.varbit_ref
																																														.getConfigData(
																																																14,
																																																int_6);
																																												varbit_1 = new Varbit();
																																												if (bytes_3 != null) {
																																													varbit_1.decode(
																																															new Buffer(
																																																	bytes_3));
																																												}

																																												Varbit.varbits
																																														.put(varbit_1,
																																																int_6);
																																												varbit_0 = varbit_1;
																																											}

																																											int_10 = varbit_0.configId;
																																											int_9 = varbit_0.leastSignificantBit;
																																											int_11 = varbit_0.mostSignificantBit;
																																											int_12 = Class86.anIntArray46[int_11
																																													- int_9];
																																											if ((int_7 < 0)
																																													|| (int_7 > int_12)) {
																																												int_7 = 0;
																																											}

																																											int_12 <<= int_9;
																																											Class86.widgetSettings[int_10] = (Class86.widgetSettings[int_10]
																																													& ~int_12)
																																													| ((int_7 << int_9)
																																															& int_12);
																																										}
																																									} else {
																																										int_6 = ints_1[int_5];
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = Class38
																																														.method254(
																																																int_6);
																																									}
																																								} else {
																																									if (Class45.scriptStackCount == 0) {
																																										return;
																																									}

																																									final ScriptState scriptstate_0 = Class45.scriptStack[--Class45.scriptStackCount];
																																									script_2 = scriptstate_0.invokedFromScript;
																																									ints_2 = script_2.instructions;
																																									ints_1 = script_2.intOperands;
																																									int_5 = scriptstate_0.invokedFromPc;
																																									Class45.scriptLocalInts = scriptstate_0.savedLocalInts;
																																									Class45.scriptLocalStrings = scriptstate_0.savedLocalStrings;
																																								}
																																							} else {
																																								WorldMapType2.intStackSize -= 2;
																																								if (Class45.intStack[WorldMapType2.intStackSize] > Class45.intStack[WorldMapType2.intStackSize
																																										+ 1]) {
																																									int_5 += ints_1[int_5];
																																								}
																																							}
																																						} else {
																																							WorldMapType2.intStackSize -= 2;
																																							if (Class45.intStack[WorldMapType2.intStackSize] < Class45.intStack[WorldMapType2.intStackSize
																																									+ 1]) {
																																								int_5 += ints_1[int_5];
																																							}
																																						}
																																					} else {
																																						WorldMapType2.intStackSize -= 2;
																																						if (Class45.intStack[WorldMapType2.intStackSize] == Class45.intStack[WorldMapType2.intStackSize
																																								+ 1]) {
																																							int_5 += ints_1[int_5];
																																						}
																																					}
																																				} else {
																																					WorldMapType2.intStackSize -= 2;
																																					if (Class45.intStack[WorldMapType2.intStackSize] != Class45.intStack[WorldMapType2.intStackSize
																																							+ 1]) {
																																						int_5 += ints_1[int_5];
																																					}
																																				}
																																			} else {
																																				int_5 += ints_1[int_5];
																																			}
																																		} else {
																																			Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																					- 1] = script_2.stringOperands[int_5];
																																		}
																																	} else {
																																		int_6 = ints_1[int_5];
																																		Class86.widgetSettings[int_6] = Class45.intStack[--WorldMapType2.intStackSize];
																																		Class44.method266(
																																				int_6);
																																	}
																																} else {
																																	int_6 = ints_1[int_5];
																																	Class45.intStack[++WorldMapType2.intStackSize
																																			- 1] = Class86.widgetSettings[int_6];
																																}
																															} else {
																																Class45.intStack[++WorldMapType2.intStackSize
																																		- 1] = ints_1[int_5];
																															}
																														} else {
																															boolean bool_1;
																															if (script_2.intOperands[int_5] == 1) {
																																bool_1 = true;
																															} else {
																																bool_1 = false;
																															}

																															if (int_1 < 1000) {
																																int_7 = Class9
																																		.method121(
																																				int_1,
																																				script_2,
																																				bool_1);
																															} else if (int_1 < 1100) {
																																int_7 = Varcs
																																		.method508(
																																				int_1,
																																				script_2,
																																				bool_1);
																															} else if (int_1 < 1200) {
																																int_7 = Class62
																																		.method386(
																																				int_1,
																																				script_2,
																																				bool_1);
																															} else if (int_1 < 1300) {
																																int_7 = Class35
																																		.method244(
																																				int_1,
																																				script_2,
																																				bool_1);
																															} else if (int_1 < 1400) {
																																int_7 = ScriptVarType
																																		.method462(
																																				int_1,
																																				script_2,
																																				bool_1);
																															} else if (int_1 < 1500) {
																																int_7 = Huffman
																																		.method544(
																																				int_1,
																																				script_2,
																																				bool_1);
																															} else {
																																byte byte_0;
																																Widget widget_0;
																																if (int_1 < 1600) {
																																	widget_0 = bool_1
																																			? Class45.aWidget6
																																			: Class38.aWidget5;
																																	if (int_1 == 1500) {
																																		Class45.intStack[++WorldMapType2.intStackSize
																																				- 1] = widget_0.relativeX;
																																		byte_0 = 1;
																																	} else if (int_1 == 1501) {
																																		Class45.intStack[++WorldMapType2.intStackSize
																																				- 1] = widget_0.relativeY;
																																		byte_0 = 1;
																																	} else if (int_1 == 1502) {
																																		Class45.intStack[++WorldMapType2.intStackSize
																																				- 1] = widget_0.width;
																																		byte_0 = 1;
																																	} else if (int_1 == 1503) {
																																		Class45.intStack[++WorldMapType2.intStackSize
																																				- 1] = widget_0.height;
																																		byte_0 = 1;
																																	} else if (int_1 == 1504) {
																																		Class45.intStack[++WorldMapType2.intStackSize
																																				- 1] = widget_0.isHidden
																																						? 1
																																						: 0;
																																		byte_0 = 1;
																																	} else if (int_1 == 1505) {
																																		Class45.intStack[++WorldMapType2.intStackSize
																																				- 1] = widget_0.parentId;
																																		byte_0 = 1;
																																	} else {
																																		byte_0 = 2;
																																	}

																																	int_7 = byte_0;
																																} else if (int_1 < 1700) {
																																	int_7 = Class88
																																			.method469(
																																					int_1,
																																					script_2,
																																					bool_1);
																																} else if (int_1 < 1800) {
																																	widget_0 = bool_1
																																			? Class45.aWidget6
																																			: Class38.aWidget5;
																																	if (int_1 == 1700) {
																																		Class45.intStack[++WorldMapType2.intStackSize
																																				- 1] = widget_0.itemId;
																																		byte_0 = 1;
																																	} else if (int_1 == 1701) {
																																		if (widget_0.itemId != -1) {
																																			Class45.intStack[++WorldMapType2.intStackSize
																																					- 1] = widget_0.itemQuantity;
																																		} else {
																																			Class45.intStack[++WorldMapType2.intStackSize
																																					- 1] = 0;
																																		}

																																		byte_0 = 1;
																																	} else if (int_1 == 1702) {
																																		Class45.intStack[++WorldMapType2.intStackSize
																																				- 1] = widget_0.index;
																																		byte_0 = 1;
																																	} else {
																																		byte_0 = 2;
																																	}

																																	int_7 = byte_0;
																																} else {
																																	int[] ints_0;
																																	if (int_1 < 1900) {
																																		final Widget widget_1 = bool_1
																																				? Class45.aWidget6
																																				: Class38.aWidget5;
																																		if (int_1 == 1800) {
																																			ints_0 = Class45.intStack;
																																			int_9 = ++WorldMapType2.intStackSize
																																					- 1;
																																			int_12 = Class6
																																					.getWidgetConfig(
																																							widget_1);
																																			int_11 = (int_12 >> 11)
																																					& 0x3F;
																																			ints_0[int_9] = int_11;
																																			byte_0 = 1;
																																		} else if (int_1 != 1801) {
																																			if (int_1 == 1802) {
																																				if (widget_1.name == null) {
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = "";
																																				} else {
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = widget_1.name;
																																				}

																																				byte_0 = 1;
																																			} else {
																																				byte_0 = 2;
																																			}
																																		} else {
																																			int_10 = Class45.intStack[--WorldMapType2.intStackSize];
																																			--int_10;
																																			if ((widget_1.actions != null)
																																					&& (int_10 < widget_1.actions.length)
																																					&& (widget_1.actions[int_10] != null)) {
																																				Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																						- 1] = widget_1.actions[int_10];
																																			} else {
																																				Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																						- 1] = "";
																																			}

																																			byte_0 = 1;
																																		}

																																		int_7 = byte_0;
																																	} else if (int_1 < 2000) {
																																		int_7 = Class35
																																				.method245(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2100) {
																																		int_7 = Varcs
																																				.method508(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2200) {
																																		int_7 = Class62
																																				.method386(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2300) {
																																		int_7 = Class35
																																				.method244(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2400) {
																																		int_7 = ScriptVarType
																																				.method462(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2500) {
																																		int_7 = Huffman
																																				.method544(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2600) {
																																		int_7 = XClanMember
																																				.method573(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2700) {
																																		int_7 = CombatInfo1
																																				.method651(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2800) {
																																		int_7 = Class14
																																				.method193(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 2900) {
																																		int_7 = Class5
																																				.method92(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 3000) {
																																		int_7 = Class35
																																				.method245(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 3200) {
																																		int_7 = Projectile
																																				.method940(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 3300) {
																																		int_7 = ScriptVarType
																																				.method463(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else if (int_1 < 3400) {
																																		int_7 = Class87
																																				.method468(
																																						int_1,
																																						script_2,
																																						bool_1);
																																	} else {
																																		int int_8;
																																		int int_13;
																																		if (int_1 < 3500) {
																																			if (int_1 == 3400) {
																																				WorldMapType2.intStackSize -= 2;
																																				int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																				int_10 = Class45.intStack[WorldMapType2.intStackSize
																																						+ 1];
																																				Enum enum_0 = AClass4
																																						.method612(
																																								int_8);
																																				if (enum_0.valType != 115) {
																																					;
																																				}

																																				for (int_11 = 0; int_11 < enum_0.size; int_11++) {
																																					if (int_10 == enum_0.keys[int_11]) {
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = enum_0.stringVals[int_11];
																																						enum_0 = null;
																																						break;
																																					}
																																				}

																																				if (enum_0 != null) {
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = enum_0.defaultString;
																																				}

																																				byte_0 = 1;
																																			} else if (int_1 != 3408) {
																																				byte_0 = 2;
																																			} else {
																																				WorldMapType2.intStackSize -= 4;
																																				int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																				int_10 = Class45.intStack[WorldMapType2.intStackSize
																																						+ 1];
																																				int_9 = Class45.intStack[WorldMapType2.intStackSize
																																						+ 2];
																																				int_11 = Class45.intStack[WorldMapType2.intStackSize
																																						+ 3];
																																				Enum enum_1 = AClass4
																																						.method612(
																																								int_9);
																																				if ((int_8 == enum_1.keyType)
																																						&& (int_10 == enum_1.valType)) {
																																					for (int_13 = 0; int_13 < enum_1.size; int_13++) {
																																						if (int_11 == enum_1.keys[int_13]) {
																																							if (int_10 == 115) {
																																								Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																										- 1] = enum_1.stringVals[int_13];
																																							} else {
																																								Class45.intStack[++WorldMapType2.intStackSize
																																										- 1] = enum_1.intVals[int_13];
																																							}

																																							enum_1 = null;
																																							break;
																																						}
																																					}

																																					if (enum_1 != null) {
																																						if (int_10 == 115) {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = enum_1.defaultString;
																																						} else {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = enum_1.defaultInt;
																																						}
																																					}

																																					byte_0 = 1;
																																				} else {
																																					if (int_10 == 115) {
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "null";
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = 0;
																																					}

																																					byte_0 = 1;
																																				}
																																			}

																																			int_7 = byte_0;
																																		} else {
																																			String string_3;
																																			String string_4;
																																			if (int_1 < 3700) {
																																				if (int_1 == 3600) {
																																					if (Client.anInt696 == 0) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = -2;
																																					} else if (Client.anInt696 == 1) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = -1;
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Client.friendCount;
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 3601) {
																																					int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																					if ((Client.anInt696 == 2)
																																							&& (int_8 < Client.friendCount)) {
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = Client.friends[int_8].name;
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = Client.friends[int_8].previousName;
																																					} else {
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "";
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 3602) {
																																					int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																					if ((Client.anInt696 == 2)
																																							&& (int_8 < Client.friendCount)) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Client.friends[int_8].world;
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = 0;
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 3603) {
																																					int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																					if ((Client.anInt696 == 2)
																																							&& (int_8 < Client.friendCount)) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Client.friends[int_8].rank;
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = 0;
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 3604) {
																																					string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																					int_10 = Class45.intStack[--WorldMapType2.intStackSize];
																																					GroundObject
																																							.method538(
																																									string_4,
																																									int_10);
																																					byte_0 = 1;
																																				} else {
																																					String string_1;
																																					Ignore ignore_0;
																																					Friend friend_0;
																																					String string_6;
																																					if (int_1 == 3605) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						if (string_4 != null) {
																																							if (((Client.friendCount < 200)
																																									|| (Client.anInt717 == 1))
																																									&& (Client.friendCount < 400)) {
																																								string_3 = Class75
																																										.method446(
																																												string_4,
																																												Class59.aClass110_1);
																																								if (string_3 != null) {
																																									int_9 = 0;

																																									label1727: while (true) {
																																										if (int_9 >= Client.friendCount) {
																																											for (int_9 = 0; int_9 < Client.ignoreCount; int_9++) {
																																												ignore_0 = Client.ignores[int_9];
																																												string_6 = Class75
																																														.method446(
																																																ignore_0.name,
																																																Class59.aClass110_1);
																																												if ((string_6 != null)
																																														&& string_6
																																																.equals(string_3)) {
																																													WidgetNode
																																															.sendGameMessage(
																																																	30,
																																																	"",
																																																	"Please remove "
																																																			+ string_4
																																																			+ " from your ignore list first");
																																													break label1727;
																																												}

																																												if (ignore_0.previousName != null) {
																																													string_1 = Class75
																																															.method446(
																																																	ignore_0.previousName,
																																																	Class59.aClass110_1);
																																													if ((string_1 != null)
																																															&& string_1
																																																	.equals(string_3)) {
																																														WidgetNode
																																																.sendGameMessage(
																																																		30,
																																																		"",
																																																		"Please remove "
																																																				+ string_4
																																																				+ " from your ignore list first");
																																														break label1727;
																																													}
																																												}
																																											}

																																											if (Class75
																																													.method446(
																																															Script.localPlayer.name,
																																															Class59.aClass110_1)
																																													.equals(string_3)) {
																																												WidgetNode
																																														.sendGameMessage(
																																																30,
																																																"",
																																																"You can\'t add yourself to your own friend list");
																																											} else {
																																												Client.secretPacketBuffer1
																																														.putOpcode(
																																																6);
																																												Client.secretPacketBuffer1
																																														.putByte(
																																																DecorativeObject
																																																		.getLength(
																																																				string_4));
																																												Client.secretPacketBuffer1
																																														.putString(
																																																string_4);
																																											}
																																											break;
																																										}

																																										friend_0 = Client.friends[int_9];
																																										string_6 = Class75
																																												.method446(
																																														friend_0.name,
																																														Class59.aClass110_1);
																																										if ((string_6 != null)
																																												&& string_6
																																														.equals(string_3)) {
																																											WidgetNode
																																													.sendGameMessage(
																																															30,
																																															"",
																																															string_4 + " is already on your friend list");
																																											break;
																																										}

																																										if (friend_0.previousName != null) {
																																											string_1 = Class75
																																													.method446(
																																															friend_0.previousName,
																																															Class59.aClass110_1);
																																											if ((string_1 != null)
																																													&& string_1
																																															.equals(string_3)) {
																																												WidgetNode
																																														.sendGameMessage(
																																																30,
																																																"",
																																																string_4 + " is already on your friend list");
																																												break;
																																											}
																																										}

																																										++int_9;
																																									}
																																								}
																																							} else {
																																								WidgetNode
																																										.sendGameMessage(
																																												30,
																																												"",
																																												"Your friend list is full. Max of 200 for free users, and 400 for members");
																																							}
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3606) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						AClass1_Sub1
																																								.method587(
																																										string_4);
																																						byte_0 = 1;
																																					} else if (int_1 == 3607) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						if (string_4 != null) {
																																							if (((Client.ignoreCount < 100)
																																									|| (Client.anInt717 == 1))
																																									&& (Client.ignoreCount < 400)) {
																																								string_3 = Class75
																																										.method446(
																																												string_4,
																																												Class59.aClass110_1);
																																								if (string_3 != null) {
																																									int_9 = 0;

																																									label1761: while (true) {
																																										if (int_9 >= Client.ignoreCount) {
																																											for (int_9 = 0; int_9 < Client.friendCount; int_9++) {
																																												friend_0 = Client.friends[int_9];
																																												string_6 = Class75
																																														.method446(
																																																friend_0.name,
																																																Class59.aClass110_1);
																																												if ((string_6 != null)
																																														&& string_6
																																																.equals(string_3)) {
																																													WidgetNode
																																															.sendGameMessage(
																																																	31,
																																																	"",
																																																	"Please remove "
																																																			+ string_4
																																																			+ " from your friend list first");
																																													break label1761;
																																												}

																																												if (friend_0.previousName != null) {
																																													string_1 = Class75
																																															.method446(
																																																	friend_0.previousName,
																																																	Class59.aClass110_1);
																																													if ((string_1 != null)
																																															&& string_1
																																																	.equals(string_3)) {
																																														WidgetNode
																																																.sendGameMessage(
																																																		31,
																																																		"",
																																																		"Please remove "
																																																				+ string_4
																																																				+ " from your friend list first");
																																														break label1761;
																																													}
																																												}
																																											}

																																											if (Class75
																																													.method446(
																																															Script.localPlayer.name,
																																															Class59.aClass110_1)
																																													.equals(string_3)) {
																																												WidgetNode
																																														.sendGameMessage(
																																																31,
																																																"",
																																																"You can\'t add yourself to your own ignore list");
																																											} else {
																																												Client.secretPacketBuffer1
																																														.putOpcode(
																																																195);
																																												Client.secretPacketBuffer1
																																														.putByte(
																																																DecorativeObject
																																																		.getLength(
																																																				string_4));
																																												Client.secretPacketBuffer1
																																														.putString(
																																																string_4);
																																											}
																																											break;
																																										}

																																										ignore_0 = Client.ignores[int_9];
																																										string_6 = Class75
																																												.method446(
																																														ignore_0.name,
																																														Class59.aClass110_1);
																																										if ((string_6 != null)
																																												&& string_6
																																														.equals(string_3)) {
																																											WidgetNode
																																													.sendGameMessage(
																																															31,
																																															"",
																																															string_4 + " is already on your ignore list");
																																											break;
																																										}

																																										if (ignore_0.previousName != null) {
																																											string_1 = Class75
																																													.method446(
																																															ignore_0.previousName,
																																															Class59.aClass110_1);
																																											if ((string_1 != null)
																																													&& string_1
																																															.equals(string_3)) {
																																												WidgetNode
																																														.sendGameMessage(
																																																31,
																																																"",
																																																string_4 + " is already on your ignore list");
																																												break;
																																											}
																																										}

																																										++int_9;
																																									}
																																								}
																																							} else {
																																								WidgetNode
																																										.sendGameMessage(
																																												31,
																																												"",
																																												"Your ignore list is full. Max of 100 for free users, and 400 for members");
																																							}
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3608) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						Script.method845(
																																								string_4);
																																						byte_0 = 1;
																																					} else if (int_1 == 3609) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						final Permission[] permissions_0 = new Permission[] {
																																								Permission.aPermission1,
																																								Permission.aPermission4,
																																								Permission.aPermission2,
																																								Permission.aPermission6,
																																								Permission.aPermission5,
																																								Permission.aPermission3 };
																																						final Permission[] permissions_1 = permissions_0;

																																						for (int_11 = 0; int_11 < permissions_1.length; int_11++) {
																																							final Permission permission_0 = permissions_1[int_11];
																																							if ((permission_0.anInt322 != -1)
																																									&& string_4
																																											.startsWith(
																																													CombatInfo1
																																															.method650(
																																																	permission_0.anInt322))) {
																																								string_4 = string_4
																																										.substring(
																																												6 + Integer
																																														.toString(
																																																permission_0.anInt322)
																																														.length());
																																								break;
																																							}
																																						}

																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = WorldMapType3
																																										.isFriended(
																																												string_4,
																																												false) ? 1
																																														: 0;
																																						byte_0 = 1;
																																					} else if (int_1 == 3611) {
																																						if (Client.clanChatOwner != null) {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = VarPlayerType
																																											.method878(
																																													Client.clanChatOwner);
																																						} else {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = "";
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3612) {
																																						if (Client.clanChatOwner != null) {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = Signlink.clanChatCount;
																																						} else {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = 0;
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3613) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						if ((Client.clanChatOwner != null)
																																								&& (int_8 < Signlink.clanChatCount)) {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = WorldMapData_Sub1.clanMembers[int_8].username;
																																						} else {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = "";
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3614) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						if ((Client.clanChatOwner != null)
																																								&& (int_8 < Signlink.clanChatCount)) {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = WorldMapData_Sub1.clanMembers[int_8].world;
																																						} else {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = 0;
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3615) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						if ((Client.clanChatOwner != null)
																																								&& (int_8 < Signlink.clanChatCount)) {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = WorldMapData_Sub1.clanMembers[int_8].rank;
																																						} else {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = 0;
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3616) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = FaceNormal.aByte2;
																																						byte_0 = 1;
																																					} else if (int_1 == 3617) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						if (WorldMapData_Sub1.clanMembers != null) {
																																							Client.secretPacketBuffer1
																																									.putOpcode(
																																											182);
																																							Client.secretPacketBuffer1
																																									.putByte(
																																											DecorativeObject
																																													.getLength(
																																															string_4));
																																							Client.secretPacketBuffer1
																																									.putString(
																																											string_4);
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3618) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Enum1.clanChatRank;
																																						byte_0 = 1;
																																					} else if (int_1 == 3619) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						BaseVarType
																																								.method614(
																																										string_4);
																																						byte_0 = 1;
																																					} else if (int_1 == 3620) {
																																						CombatInfo1
																																								.method652();
																																						byte_0 = 1;
																																					} else if (int_1 == 3621) {
																																						if (Client.anInt696 == 0) {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = -1;
																																						} else {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = Client.ignoreCount;
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3622) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						if ((Client.anInt696 != 0)
																																								&& (int_8 < Client.ignoreCount)) {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = Client.ignores[int_8].name;
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = Client.ignores[int_8].previousName;
																																						} else {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = "";
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = "";
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3623) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						if (string_4
																																								.startsWith(
																																										CombatInfo1
																																												.method650(
																																														0))
																																								|| string_4
																																										.startsWith(
																																												CombatInfo1
																																														.method650(
																																																1))) {
																																							string_4 = string_4
																																									.substring(
																																											7);
																																						}

																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = MilliTimer
																																										.isIgnored(
																																												string_4)
																																														? 1
																																														: 0;
																																						byte_0 = 1;
																																					} else if (int_1 == 3624) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						if ((WorldMapData_Sub1.clanMembers != null)
																																								&& (int_8 < Signlink.clanChatCount)
																																								&& WorldMapData_Sub1.clanMembers[int_8].username
																																										.equalsIgnoreCase(
																																												Script.localPlayer.name)) {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = 1;
																																						} else {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = 0;
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 3625) {
																																						if (Client.clanChatName != null) {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = VarPlayerType
																																											.method878(
																																													Client.clanChatName);
																																						} else {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = "";
																																						}

																																						byte_0 = 1;
																																					} else {
																																						byte_0 = 2;
																																					}
																																				}

																																				int_7 = byte_0;
																																			} else if (int_1 < 4000) {
																																				int_7 = Class51
																																						.method309(
																																								int_1,
																																								script_2,
																																								bool_1);
																																			} else if (int_1 < 4100) {
																																				if (int_1 == 4000) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_10
																																									+ int_8;
																																					byte_0 = 1;
																																				} else if (int_1 == 4001) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									- int_10;
																																					byte_0 = 1;
																																				} else if (int_1 == 4002) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_10
																																									* int_8;
																																					byte_0 = 1;
																																				} else if (int_1 == 4003) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									/ int_10;
																																					byte_0 = 1;
																																				} else if (int_1 == 4004) {
																																					int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = (int) (Math
																																									.random()
																																									* int_8);
																																					byte_0 = 1;
																																				} else if (int_1 == 4005) {
																																					int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = (int) (Math
																																									.random()
																																									* (int_8 + 1));
																																					byte_0 = 1;
																																				} else if (int_1 == 4006) {
																																					WorldMapType2.intStackSize -= 5;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					int_9 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 2];
																																					int_11 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 3];
																																					int_12 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 4];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									+ (((int_12
																																											- int_9)
																																											* (int_10
																																													- int_8))
																																											/ (int_11
																																													- int_9));
																																					byte_0 = 1;
																																				} else if (int_1 == 4007) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									+ ((int_8
																																											* int_10)
																																											/ 100);
																																					byte_0 = 1;
																																				} else if (int_1 == 4008) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									| (1 << int_10);
																																					byte_0 = 1;
																																				} else if (int_1 == 4009) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									& (-1 - (1 << int_10));
																																					byte_0 = 1;
																																				} else if (int_1 == 4010) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = (int_8
																																									& (1 << int_10)) != 0
																																											? 1
																																											: 0;
																																					byte_0 = 1;
																																				} else if (int_1 == 4011) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									% int_10;
																																					byte_0 = 1;
																																				} else if (int_1 == 4012) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					if (int_8 == 0) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = 0;
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = (int) Math
																																										.pow(int_8,
																																												int_10);
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 4013) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					if (int_8 == 0) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = 0;
																																					} else if (int_10 == 0) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Integer.MAX_VALUE;
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = (int) Math
																																										.pow(int_8,
																																												1.0D / int_10);
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 4014) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									& int_10;
																																					byte_0 = 1;
																																				} else if (int_1 == 4015) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = int_8
																																									| int_10;
																																					byte_0 = 1;
																																				} else if (int_1 == 4018) {
																																					WorldMapType2.intStackSize -= 3;
																																					final long long_1 = Class45.intStack[WorldMapType2.intStackSize];
																																					final long long_2 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					final long long_3 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 2];
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = (int) ((long_3
																																									* long_1)
																																									/ long_2);
																																					byte_0 = 1;
																																				} else {
																																					byte_0 = 2;
																																				}

																																				int_7 = byte_0;
																																			} else if (int_1 < 4200) {
																																				if (int_1 == 4100) {
																																					string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																					int_10 = Class45.intStack[--WorldMapType2.intStackSize];
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = string_4
																																									+ int_10;
																																					byte_0 = 1;
																																				} else if (int_1 == 4101) {
																																					BaseVarType.scriptStringStackSize -= 2;
																																					string_4 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize];
																																					string_3 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize
																																							+ 1];
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = string_4
																																									+ string_3;
																																					byte_0 = 1;
																																				} else if (int_1 == 4102) {
																																					string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																					int_10 = Class45.intStack[--WorldMapType2.intStackSize];
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = string_4
																																									+ GameEngine
																																											.method1028(
																																													int_10,
																																													true);
																																					byte_0 = 1;
																																				} else if (int_1 == 4103) {
																																					string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = string_4
																																									.toLowerCase();
																																					byte_0 = 1;
																																				} else if (int_1 == 4104) {
																																					int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																					final long long_0 = (int_8
																																							+ 11745L)
																																							* 86400000L;
																																					Class45.aCalendar1
																																							.setTime(
																																									new Date(
																																											long_0));
																																					int_11 = Class45.aCalendar1
																																							.get(5);
																																					int_12 = Class45.aCalendar1
																																							.get(2);
																																					int_13 = Class45.aCalendar1
																																							.get(1);
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = int_11
																																									+ "-"
																																									+ Class45.aStringArray2[int_12]
																																									+ "-"
																																									+ int_13;
																																					byte_0 = 1;
																																				} else if (int_1 == 4105) {
																																					BaseVarType.scriptStringStackSize -= 2;
																																					string_4 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize];
																																					string_3 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize
																																							+ 1];
																																					if ((Script.localPlayer.composition != null)
																																							&& Script.localPlayer.composition.isFemale) {
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = string_3;
																																					} else {
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = string_4;
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 4106) {
																																					int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = Integer
																																									.toString(
																																											int_8);
																																					byte_0 = 1;
																																				} else if (int_1 == 4107) {
																																					BaseVarType.scriptStringStackSize -= 2;
																																					ints_3 = Class45.intStack;
																																					int_10 = ++WorldMapType2.intStackSize
																																							- 1;
																																					int_11 = Projectile
																																							.method941(
																																									Class45.scriptStringStack[BaseVarType.scriptStringStackSize],
																																									Class45.scriptStringStack[BaseVarType.scriptStringStackSize
																																											+ 1],
																																									Client.languageId);
																																					byte byte_2;
																																					if (int_11 > 0) {
																																						byte_2 = 1;
																																					} else if (int_11 < 0) {
																																						byte_2 = -1;
																																					} else {
																																						byte_2 = 0;
																																					}

																																					ints_3[int_10] = byte_2;
																																					byte_0 = 1;
																																				} else {
																																					byte[] bytes_2;
																																					Font font_0;
																																					if (int_1 == 4108) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						WorldMapType2.intStackSize -= 2;
																																						int_10 = Class45.intStack[WorldMapType2.intStackSize];
																																						int_9 = Class45.intStack[WorldMapType2.intStackSize
																																								+ 1];
																																						bytes_2 = Player.anIndexData5
																																								.getConfigData(
																																										int_9,
																																										0);
																																						font_0 = new Font(
																																								bytes_2);
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = font_0
																																										.method970(
																																												string_4,
																																												int_10);
																																						byte_0 = 1;
																																					} else if (int_1 == 4109) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						WorldMapType2.intStackSize -= 2;
																																						int_10 = Class45.intStack[WorldMapType2.intStackSize];
																																						int_9 = Class45.intStack[WorldMapType2.intStackSize
																																								+ 1];
																																						bytes_2 = Player.anIndexData5
																																								.getConfigData(
																																										int_9,
																																										0);
																																						font_0 = new Font(
																																								bytes_2);
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = font_0
																																										.method973(
																																												string_4,
																																												int_10);
																																						byte_0 = 1;
																																					} else if (int_1 == 4110) {
																																						BaseVarType.scriptStringStackSize -= 2;
																																						string_4 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize];
																																						string_3 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize
																																								+ 1];
																																						if (Class45.intStack[--WorldMapType2.intStackSize] == 1) {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = string_4;
																																						} else {
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = string_3;
																																						}

																																						byte_0 = 1;
																																					} else if (int_1 == 4111) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = FontTypeFace
																																										.appendTags(
																																												string_4);
																																						byte_0 = 1;
																																					} else if (int_1 == 4112) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						int_10 = Class45.intStack[--WorldMapType2.intStackSize];
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = string_4
																																										+ (char) int_10;
																																						byte_0 = 1;
																																					} else if (int_1 == 4113) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Permission
																																										.method574(
																																												(char) int_8)
																																														? 1
																																														: 0;
																																						byte_0 = 1;
																																					} else {
																																						char char_0;
																																						boolean bool_3;
																																						if (int_1 == 4114) {
																																							int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																							ints_0 = Class45.intStack;
																																							int_9 = ++WorldMapType2.intStackSize
																																									- 1;
																																							char_0 = (char) int_8;
																																							bool_3 = ((char_0 >= 48)
																																									&& (char_0 <= 57))
																																									|| ((char_0 >= 65)
																																											&& (char_0 <= 90))
																																									|| ((char_0 >= 97)
																																											&& (char_0 <= 122));
																																							ints_0[int_9] = bool_3
																																									? 1
																																									: 0;
																																							byte_0 = 1;
																																						} else if (int_1 == 4115) {
																																							int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																							ints_0 = Class45.intStack;
																																							int_9 = ++WorldMapType2.intStackSize
																																									- 1;
																																							char_0 = (char) int_8;
																																							bool_3 = ((char_0 >= 65)
																																									&& (char_0 <= 90))
																																									|| ((char_0 >= 97)
																																											&& (char_0 <= 122));
																																							ints_0[int_9] = bool_3
																																									? 1
																																									: 0;
																																							byte_0 = 1;
																																						} else if (int_1 == 4116) {
																																							int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = Huffman
																																											.method543(
																																													(char) int_8)
																																															? 1
																																															: 0;
																																							byte_0 = 1;
																																						} else if (int_1 == 4117) {
																																							string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																							if (string_4 != null) {
																																								Class45.intStack[++WorldMapType2.intStackSize
																																										- 1] = string_4
																																												.length();
																																							} else {
																																								Class45.intStack[++WorldMapType2.intStackSize
																																										- 1] = 0;
																																							}

																																							byte_0 = 1;
																																						} else if (int_1 == 4118) {
																																							string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																							WorldMapType2.intStackSize -= 2;
																																							int_10 = Class45.intStack[WorldMapType2.intStackSize];
																																							int_9 = Class45.intStack[WorldMapType2.intStackSize
																																									+ 1];
																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = string_4
																																											.substring(
																																													int_10,
																																													int_9);
																																							byte_0 = 1;
																																						} else if (int_1 != 4119) {
																																							if (int_1 == 4120) {
																																								string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																								int_10 = Class45.intStack[--WorldMapType2.intStackSize];
																																								Class45.intStack[++WorldMapType2.intStackSize
																																										- 1] = string_4
																																												.indexOf(
																																														int_10);
																																								byte_0 = 1;
																																							} else if (int_1 == 4121) {
																																								BaseVarType.scriptStringStackSize -= 2;
																																								string_4 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize];
																																								string_3 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize
																																										+ 1];
																																								int_9 = Class45.intStack[--WorldMapType2.intStackSize];
																																								Class45.intStack[++WorldMapType2.intStackSize
																																										- 1] = string_4
																																												.indexOf(
																																														string_3,
																																														int_9);
																																								byte_0 = 1;
																																							} else {
																																								byte_0 = 2;
																																							}
																																						} else {
																																							string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																							final StringBuilder stringbuilder_1 = new StringBuilder(
																																									string_4.length());
																																							boolean bool_2 = false;

																																							for (int_11 = 0; int_11 < string_4
																																									.length(); int_11++) {
																																								char_0 = string_4
																																										.charAt(int_11);
																																								if (char_0 == 60) {
																																									bool_2 = true;
																																								} else if (char_0 == 62) {
																																									bool_2 = false;
																																								} else if (!bool_2) {
																																									stringbuilder_1
																																											.append(char_0);
																																								}
																																							}

																																							Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																									- 1] = stringbuilder_1
																																											.toString();
																																							byte_0 = 1;
																																						}
																																					}
																																				}

																																				int_7 = byte_0;
																																			} else if (int_1 < 4300) {
																																				int_7 = Class19
																																						.method207(
																																								int_1,
																																								script_2,
																																								bool_1);
																																			} else if (int_1 < 5100) {
																																				if (int_1 == 5000) {
																																					Class45.intStack[++WorldMapType2.intStackSize
																																							- 1] = Client.anInt727;
																																					byte_0 = 1;
																																				} else if (int_1 == 5001) {
																																					WorldMapType2.intStackSize -= 3;
																																					Client.anInt727 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					final Class103[] class103s_1 = new Class103[] {
																																							Class103.aClass103_3,
																																							Class103.aClass103_1,
																																							Class103.aClass103_2 };
																																					final Class103[] class103s_0 = class103s_1;
																																					int_12 = 0;

																																					Class103 class103_1;
																																					while (true) {
																																						if (int_12 >= class103s_0.length) {
																																							class103_1 = null;
																																							break;
																																						}

																																						final Class103 class103_0 = class103s_0[int_12];
																																						if (int_10 == class103_0.anInt214) {
																																							class103_1 = class103_0;
																																							break;
																																						}

																																						++int_12;
																																					}

																																					MouseInput.aClass103_4 = class103_1;
																																					if (MouseInput.aClass103_4 == null) {
																																						MouseInput.aClass103_4 = Class103.aClass103_2;
																																					}

																																					Client.anInt729 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 2];
																																					Client.secretPacketBuffer1
																																							.putOpcode(
																																									153);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									Client.anInt727);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									MouseInput.aClass103_4.anInt214);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									Client.anInt729);
																																					byte_0 = 1;
																																				} else if (int_1 == 5002) {
																																					string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																					WorldMapType2.intStackSize -= 2;
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_9 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					Client.secretPacketBuffer1
																																							.putOpcode(
																																									166);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									DecorativeObject
																																											.getLength(
																																													string_4)
																																											+ 2);
																																					Client.secretPacketBuffer1
																																							.putString(
																																									string_4);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									int_10 - 1);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									int_9);
																																					byte_0 = 1;
																																				} else if (int_1 == 5003) {
																																					WorldMapType2.intStackSize -= 2;
																																					int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																					int_10 = Class45.intStack[WorldMapType2.intStackSize
																																							+ 1];
																																					final MessageNode messagenode_1 = Class73_Sub1
																																							.method602(
																																									int_8,
																																									int_10);
																																					if (messagenode_1 != null) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = messagenode_1.anInt538;
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = messagenode_1.tick;
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = messagenode_1.name != null
																																										? messagenode_1.name
																																										: "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = messagenode_1.sender != null
																																										? messagenode_1.sender
																																										: "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = messagenode_1.value != null
																																										? messagenode_1.value
																																										: "";
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = -1;
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = 0;
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "";
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 5004) {
																																					int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																					final MessageNode messagenode_0 = AbstractSoundSystem
																																							.method342(
																																									int_8);
																																					if (messagenode_0 != null) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = messagenode_0.type;
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = messagenode_0.tick;
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = messagenode_0.name != null
																																										? messagenode_0.name
																																										: "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = messagenode_0.sender != null
																																										? messagenode_0.sender
																																										: "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = messagenode_0.value != null
																																										? messagenode_0.value
																																										: "";
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = -1;
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = 0;
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "";
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = "";
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 5005) {
																																					if (MouseInput.aClass103_4 == null) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = -1;
																																					} else {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = MouseInput.aClass103_4.anInt214;
																																					}

																																					byte_0 = 1;
																																				} else if (int_1 == 5008) {
																																					string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																					int_10 = Class45.intStack[--WorldMapType2.intStackSize];
																																					String string_5 = string_4
																																							.toLowerCase();
																																					byte byte_4 = 0;
																																					if (string_5
																																							.startsWith(
																																									"yellow:")) {
																																						byte_4 = 0;
																																						string_4 = string_4
																																								.substring(
																																										"yellow:"
																																												.length());
																																					} else if (string_5
																																							.startsWith(
																																									"red:")) {
																																						byte_4 = 1;
																																						string_4 = string_4
																																								.substring(
																																										"red:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"green:")) {
																																						byte_4 = 2;
																																						string_4 = string_4
																																								.substring(
																																										"green:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"cyan:")) {
																																						byte_4 = 3;
																																						string_4 = string_4
																																								.substring(
																																										"cyan:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"purple:")) {
																																						byte_4 = 4;
																																						string_4 = string_4
																																								.substring(
																																										"purple:"
																																												.length());
																																					} else if (string_5
																																							.startsWith(
																																									"white:")) {
																																						byte_4 = 5;
																																						string_4 = string_4
																																								.substring(
																																										"white:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"flash1:")) {
																																						byte_4 = 6;
																																						string_4 = string_4
																																								.substring(
																																										"flash1:"
																																												.length());
																																					} else if (string_5
																																							.startsWith(
																																									"flash2:")) {
																																						byte_4 = 7;
																																						string_4 = string_4
																																								.substring(
																																										"flash2:"
																																												.length());
																																					} else if (string_5
																																							.startsWith(
																																									"flash3:")) {
																																						byte_4 = 8;
																																						string_4 = string_4
																																								.substring(
																																										"flash3:"
																																												.length());
																																					} else if (string_5
																																							.startsWith(
																																									"glow1:")) {
																																						byte_4 = 9;
																																						string_4 = string_4
																																								.substring(
																																										"glow1:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"glow2:")) {
																																						byte_4 = 10;
																																						string_4 = string_4
																																								.substring(
																																										"glow2:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"glow3:")) {
																																						byte_4 = 11;
																																						string_4 = string_4
																																								.substring(
																																										"glow3:".length());
																																					} else if (Client.languageId != 0) {
																																						if (string_5
																																								.startsWith(
																																										"yellow:")) {
																																							byte_4 = 0;
																																							string_4 = string_4
																																									.substring(
																																											"yellow:"
																																													.length());
																																						} else if (string_5
																																								.startsWith(
																																										"red:")) {
																																							byte_4 = 1;
																																							string_4 = string_4
																																									.substring(
																																											"red:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"green:")) {
																																							byte_4 = 2;
																																							string_4 = string_4
																																									.substring(
																																											"green:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"cyan:")) {
																																							byte_4 = 3;
																																							string_4 = string_4
																																									.substring(
																																											"cyan:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"purple:")) {
																																							byte_4 = 4;
																																							string_4 = string_4
																																									.substring(
																																											"purple:"
																																													.length());
																																						} else if (string_5
																																								.startsWith(
																																										"white:")) {
																																							byte_4 = 5;
																																							string_4 = string_4
																																									.substring(
																																											"white:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"flash1:")) {
																																							byte_4 = 6;
																																							string_4 = string_4
																																									.substring(
																																											"flash1:"
																																													.length());
																																						} else if (string_5
																																								.startsWith(
																																										"flash2:")) {
																																							byte_4 = 7;
																																							string_4 = string_4
																																									.substring(
																																											"flash2:"
																																													.length());
																																						} else if (string_5
																																								.startsWith(
																																										"flash3:")) {
																																							byte_4 = 8;
																																							string_4 = string_4
																																									.substring(
																																											"flash3:"
																																													.length());
																																						} else if (string_5
																																								.startsWith(
																																										"glow1:")) {
																																							byte_4 = 9;
																																							string_4 = string_4
																																									.substring(
																																											"glow1:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"glow2:")) {
																																							byte_4 = 10;
																																							string_4 = string_4
																																									.substring(
																																											"glow2:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"glow3:")) {
																																							byte_4 = 11;
																																							string_4 = string_4
																																									.substring(
																																											"glow3:".length());
																																						}
																																					}

																																					string_5 = string_4
																																							.toLowerCase();
																																					byte byte_3 = 0;
																																					if (string_5
																																							.startsWith(
																																									"wave:")) {
																																						byte_3 = 1;
																																						string_4 = string_4
																																								.substring(
																																										"wave:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"wave2:")) {
																																						byte_3 = 2;
																																						string_4 = string_4
																																								.substring(
																																										"wave2:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"shake:")) {
																																						byte_3 = 3;
																																						string_4 = string_4
																																								.substring(
																																										"shake:".length());
																																					} else if (string_5
																																							.startsWith(
																																									"scroll:")) {
																																						byte_3 = 4;
																																						string_4 = string_4
																																								.substring(
																																										"scroll:"
																																												.length());
																																					} else if (string_5
																																							.startsWith(
																																									"slide:")) {
																																						byte_3 = 5;
																																						string_4 = string_4
																																								.substring(
																																										"slide:".length());
																																					} else if (Client.languageId != 0) {
																																						if (string_5
																																								.startsWith(
																																										"wave:")) {
																																							byte_3 = 1;
																																							string_4 = string_4
																																									.substring(
																																											"wave:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"wave2:")) {
																																							byte_3 = 2;
																																							string_4 = string_4
																																									.substring(
																																											"wave2:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"shake:")) {
																																							byte_3 = 3;
																																							string_4 = string_4
																																									.substring(
																																											"shake:".length());
																																						} else if (string_5
																																								.startsWith(
																																										"scroll:")) {
																																							byte_3 = 4;
																																							string_4 = string_4
																																									.substring(
																																											"scroll:"
																																													.length());
																																						} else if (string_5
																																								.startsWith(
																																										"slide:")) {
																																							byte_3 = 5;
																																							string_4 = string_4
																																									.substring(
																																											"slide:".length());
																																						}
																																					}

																																					Client.secretPacketBuffer1
																																							.putOpcode(
																																									174);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									0);
																																					int_13 = Client.secretPacketBuffer1.offset;
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									int_10);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									byte_4);
																																					Client.secretPacketBuffer1
																																							.putByte(
																																									byte_3);
																																					final PacketBuffer packetbuffer_0 = Client.secretPacketBuffer1;
																																					final byte[] bytes_0 = AClass1_Sub1
																																							.method588(
																																									string_4);
																																					packetbuffer_0
																																							.putShortSmart(
																																									bytes_0.length);
																																					packetbuffer_0.offset += Class99.aHuffman1
																																							.compress(
																																									bytes_0,
																																									0,
																																									bytes_0.length,
																																									packetbuffer_0.payload,
																																									packetbuffer_0.offset);
																																					Client.secretPacketBuffer1
																																							.putLength(
																																									Client.secretPacketBuffer1.offset
																																											- int_13);
																																					byte_0 = 1;
																																				} else if (int_1 == 5009) {
																																					BaseVarType.scriptStringStackSize -= 2;
																																					string_4 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize];
																																					string_3 = Class45.scriptStringStack[BaseVarType.scriptStringStackSize
																																							+ 1];
																																					Client.secretPacketBuffer1
																																							.putOpcode(
																																									246);
																																					Client.secretPacketBuffer1
																																							.putShort(
																																									0);
																																					int_9 = Client.secretPacketBuffer1.offset;
																																					Client.secretPacketBuffer1
																																							.putString(
																																									string_4);
																																					final PacketBuffer packetbuffer_1 = Client.secretPacketBuffer1;
																																					int_12 = packetbuffer_1.offset;
																																					final byte[] bytes_4 = AClass1_Sub1
																																							.method588(
																																									string_3);
																																					packetbuffer_1
																																							.putShortSmart(
																																									bytes_4.length);
																																					packetbuffer_1.offset += Class99.aHuffman1
																																							.compress(
																																									bytes_4,
																																									0,
																																									bytes_4.length,
																																									packetbuffer_1.payload,
																																									packetbuffer_1.offset);
																																					Client.secretPacketBuffer1
																																							.putShortLength(
																																									Client.secretPacketBuffer1.offset
																																											- int_9);
																																					byte_0 = 1;
																																				} else if (int_1 != 5015) {
																																					if (int_1 == 5016) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Client.anInt729;
																																						byte_0 = 1;
																																					} else if (int_1 == 5017) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Class80
																																										.method461(
																																												int_8);
																																						byte_0 = 1;
																																					} else if (int_1 == 5018) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Class16
																																										.method200(
																																												int_8);
																																						byte_0 = 1;
																																					} else if (int_1 == 5019) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = FrameMap
																																										.method655(
																																												int_8);
																																						byte_0 = 1;
																																					} else if (int_1 == 5020) {
																																						string_4 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
																																						if (string_4
																																								.equalsIgnoreCase(
																																										"toggleroof")) {
																																							Class28.preferences.hideRoofs = !Class28.preferences.hideRoofs;
																																							PendingSpawn
																																									.method635();
																																							if (Class28.preferences.hideRoofs) {
																																								WidgetNode
																																										.sendGameMessage(
																																												99,
																																												"",
																																												"Roofs are now all hidden");
																																							} else {
																																								WidgetNode
																																										.sendGameMessage(
																																												99,
																																												"",
																																												"Roofs will only be removed selectively");
																																							}
																																						}

																																						if (string_4
																																								.equalsIgnoreCase(
																																										"displayfps")) {
																																							Client.displayFps = !Client.displayFps;
																																						}

																																						if (string_4
																																								.equalsIgnoreCase(
																																										"clickbox")) {
																																							Model.aBool65 = !Model.aBool65;
																																							WidgetNode
																																									.sendGameMessage(
																																											99,
																																											"",
																																											"Clickbox Mode: "
																																													+ (Model.aBool65
																																															? "AABB"
																																															: "Legacy"));
																																						}

																																						if (Client.rights >= 2) {
																																							if (string_4
																																									.equalsIgnoreCase(
																																											"aabb")) {
																																								if (!Class46.aBool11) {
																																									Class46.aBool11 = true;
																																									Class46.aClass49_1 = Class49.aClass49_3;
																																									WidgetNode
																																											.sendGameMessage(
																																													99,
																																													"",
																																													"AABB boxes: All");
																																								} else if (Class46.aClass49_1 == Class49.aClass49_3) {
																																									Class46.aBool11 = true;
																																									Class46.aClass49_1 = Class49.aClass49_2;
																																									WidgetNode
																																											.sendGameMessage(
																																													99,
																																													"",
																																													"AABB boxes: Mouse Over");
																																								} else {
																																									Class46.aBool11 = false;
																																									WidgetNode
																																											.sendGameMessage(
																																													99,
																																													"",
																																													"AABB boxes: Off");
																																								}
																																							}

																																							if (string_4
																																									.equalsIgnoreCase(
																																											"legacyboxes")) {
																																								Class46.aBool12 = !Class46.aBool12;
																																								WidgetNode
																																										.sendGameMessage(
																																												99,
																																												"",
																																												"Show legacy boxes: "
																																														+ Class46.aBool12);
																																							}

																																							if (string_4
																																									.equalsIgnoreCase(
																																											"geotests")) {
																																								Class46.aBool13 = !Class46.aBool13;
																																								WidgetNode
																																										.sendGameMessage(
																																												99,
																																												"",
																																												"Show geometry tests: "
																																														+ Class46.aBool13);
																																							}

																																							if (string_4
																																									.equalsIgnoreCase(
																																											"fpson")) {
																																								Client.displayFps = true;
																																							}

																																							if (string_4
																																									.equalsIgnoreCase(
																																											"fpsoff")) {
																																								Client.displayFps = false;
																																							}

																																							if (string_4
																																									.equalsIgnoreCase(
																																											"gc")) {
																																								System.gc();
																																							}

																																							if (string_4
																																									.equalsIgnoreCase(
																																											"clientdrop")) {
																																								if (Client.anInt646 > 0) {
																																									Node_Sub6
																																											.method645();
																																								} else {
																																									WorldMapType2
																																											.setGameState(
																																													40);
																																									Class101.aRSSocket2 = Occluder.rssocket;
																																									Occluder.rssocket = null;
																																								}
																																							}

																																							if (string_4
																																									.equalsIgnoreCase(
																																											"errortest")
																																									&& (Client.socketType == 2)) {
																																								throw new RuntimeException();
																																							}
																																						}

																																						Client.secretPacketBuffer1
																																								.putOpcode(
																																										255);
																																						Client.secretPacketBuffer1
																																								.putByte(
																																										string_4.length()
																																												+ 1);
																																						Client.secretPacketBuffer1
																																								.putString(
																																										string_4);
																																						byte_0 = 1;
																																					} else if (int_1 == 5021) {
																																						Client.aString35 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize]
																																								.toLowerCase()
																																								.trim();
																																						byte_0 = 1;
																																					} else if (int_1 == 5022) {
																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = Client.aString35;
																																						byte_0 = 1;
																																					} else {
																																						byte_0 = 2;
																																					}
																																				} else {
																																					if ((Script.localPlayer != null)
																																							&& (Script.localPlayer.name != null)) {
																																						string_4 = Script.localPlayer.name;
																																					} else {
																																						string_4 = "";
																																					}

																																					Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																							- 1] = string_4;
																																					byte_0 = 1;
																																				}

																																				int_7 = byte_0;
																																			} else if (int_1 < 5400) {
																																				int_7 = Class9
																																						.method122(
																																								int_1,
																																								script_2,
																																								bool_1);
																																			} else if (int_1 < 5600) {
																																				int_7 = Class33
																																						.method239(
																																								int_1,
																																								script_2,
																																								bool_1);
																																			} else if (int_1 < 5700) {
																																				if (int_1 == 5630) {
																																					Client.anInt646 = 250;
																																					byte_0 = 1;
																																				} else {
																																					byte_0 = 2;
																																				}

																																				int_7 = byte_0;
																																			} else if (int_1 < 6300) {
																																				int_7 = SceneTilePaint
																																						.method318(
																																								int_1,
																																								script_2,
																																								bool_1);
																																			} else if (int_1 < 6600) {
																																				int_7 = MessageNode
																																						.method880(
																																								int_1,
																																								script_2,
																																								bool_1);
																																			} else if (int_1 < 6700) {
																																				if (int_1 == 6600) {
																																					int_8 = AClass1_Sub1.plane;
																																					int_10 = (Script.localPlayer.anInt547 >> 7)
																																							+ AClass2.baseX;
																																					int_9 = (Script.localPlayer.anInt550 >> 7)
																																							+ AClass4_Sub1.baseY;
																																					Class3.method86()
																																							.method34(
																																									int_8,
																																									int_10,
																																									int_9,
																																									true);
																																					byte_0 = 1;
																																				} else {
																																					WorldMapData worldmapdata_1;
																																					if (int_1 == 6601) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						string_3 = "";
																																						worldmapdata_1 = Class3
																																								.method86()
																																								.method18(
																																										int_8);
																																						if (worldmapdata_1 != null) {
																																							string_3 = worldmapdata_1
																																									.method300();
																																						}

																																						Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																								- 1] = string_3;
																																						byte_0 = 1;
																																					} else if (int_1 == 6602) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						Class3.method86()
																																								.method38(
																																										int_8);
																																						byte_0 = 1;
																																					} else if (int_1 == 6603) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Class3
																																										.method86()
																																										.method40();
																																						byte_0 = 1;
																																					} else if (int_1 == 6604) {
																																						int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																						Class3.method86()
																																								.method39(
																																										int_8);
																																						byte_0 = 1;
																																					} else if (int_1 == 6605) {
																																						Class45.intStack[++WorldMapType2.intStackSize
																																								- 1] = Class3
																																										.method86()
																																										.method41()
																																												? 1
																																												: 0;
																																						byte_0 = 1;
																																					} else {
																																						Coordinates coordinates_2;
																																						if (int_1 == 6606) {
																																							coordinates_2 = new Coordinates(
																																									Class45.intStack[--WorldMapType2.intStackSize]);
																																							Class3.method86()
																																									.method27(
																																											coordinates_2.worldX,
																																											coordinates_2.worldY);
																																							byte_0 = 1;
																																						} else if (int_1 == 6607) {
																																							coordinates_2 = new Coordinates(
																																									Class45.intStack[--WorldMapType2.intStackSize]);
																																							Class3.method86()
																																									.method28(
																																											coordinates_2.worldX,
																																											coordinates_2.worldY);
																																							byte_0 = 1;
																																						} else if (int_1 == 6608) {
																																							coordinates_2 = new Coordinates(
																																									Class45.intStack[--WorldMapType2.intStackSize]);
																																							Class3.method86()
																																									.method43(
																																											coordinates_2.plane,
																																											coordinates_2.worldX,
																																											coordinates_2.worldY);
																																							byte_0 = 1;
																																						} else if (int_1 == 6609) {
																																							coordinates_2 = new Coordinates(
																																									Class45.intStack[--WorldMapType2.intStackSize]);
																																							Class3.method86()
																																									.method45(
																																											coordinates_2.plane,
																																											coordinates_2.worldX,
																																											coordinates_2.worldY);
																																							byte_0 = 1;
																																						} else if (int_1 == 6610) {
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = Class3
																																											.method86()
																																											.method20();
																																							Class45.intStack[++WorldMapType2.intStackSize
																																									- 1] = Class3
																																											.method86()
																																											.method25();
																																							byte_0 = 1;
																																						} else {
																																							WorldMapData worldmapdata_0;
																																							if (int_1 == 6611) {
																																								int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																								worldmapdata_0 = Class3
																																										.method86()
																																										.method18(
																																												int_8);
																																								if (worldmapdata_0 == null) {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = 0;
																																								} else {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = worldmapdata_0
																																													.method301()
																																													.method489();
																																								}

																																								byte_0 = 1;
																																							} else if (int_1 == 6612) {
																																								int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																								worldmapdata_0 = Class3
																																										.method86()
																																										.method18(
																																												int_8);
																																								if (worldmapdata_0 == null) {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = 0;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = 0;
																																								} else {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = ((worldmapdata_0
																																													.method297()
																																													- worldmapdata_0
																																															.method286())
																																													+ 1)
																																													* 64;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = ((worldmapdata_0
																																													.method298()
																																													- worldmapdata_0
																																															.method287())
																																													+ 1)
																																													* 64;
																																								}

																																								byte_0 = 1;
																																							} else if (int_1 == 6613) {
																																								int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																								worldmapdata_0 = Class3
																																										.method86()
																																										.method18(
																																												int_8);
																																								if (worldmapdata_0 == null) {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = 0;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = 0;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = 0;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = 0;
																																								} else {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = worldmapdata_0
																																													.method286()
																																													* 64;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = worldmapdata_0
																																													.method287()
																																													* 64;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = ((worldmapdata_0
																																													.method297()
																																													* 64)
																																													+ 64)
																																													- 1;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = ((worldmapdata_0
																																													.method298()
																																													* 64)
																																													+ 64)
																																													- 1;
																																								}

																																								byte_0 = 1;
																																							} else if (int_1 == 6614) {
																																								int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																								worldmapdata_0 = Class3
																																										.method86()
																																										.method18(
																																												int_8);
																																								if (worldmapdata_0 == null) {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = -1;
																																								} else {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = worldmapdata_0
																																													.method293();
																																								}

																																								byte_0 = 1;
																																							} else if (int_1 == 6615) {
																																								coordinates_2 = Class3
																																										.method86()
																																										.method42();
																																								if (coordinates_2 == null) {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = -1;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = -1;
																																								} else {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = coordinates_2.worldX;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = coordinates_2.worldY;
																																								}

																																								byte_0 = 1;
																																							} else if (int_1 == 6616) {
																																								Class45.intStack[++WorldMapType2.intStackSize
																																										- 1] = Class3
																																												.method86()
																																												.method46();
																																								byte_0 = 1;
																																							} else if (int_1 == 6617) {
																																								coordinates_2 = new Coordinates(
																																										Class45.intStack[--WorldMapType2.intStackSize]);
																																								worldmapdata_0 = Class3
																																										.method86()
																																										.method47();
																																								if (worldmapdata_0 == null) {
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = -1;
																																									Class45.intStack[++WorldMapType2.intStackSize
																																											- 1] = -1;
																																									byte_0 = 1;
																																								} else {
																																									final int[] ints_4 = worldmapdata_0
																																											.method285(
																																													coordinates_2.plane,
																																													coordinates_2.worldX,
																																													coordinates_2.worldY);
																																									if (ints_4 == null) {
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = -1;
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = -1;
																																									} else {
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = ints_4[0];
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = ints_4[1];
																																									}

																																									byte_0 = 1;
																																								}
																																							} else {
																																								Coordinates coordinates_1;
																																								if (int_1 == 6618) {
																																									coordinates_2 = new Coordinates(
																																											Class45.intStack[--WorldMapType2.intStackSize]);
																																									worldmapdata_0 = Class3
																																											.method86()
																																											.method47();
																																									if (worldmapdata_0 == null) {
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = -1;
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = -1;
																																										byte_0 = 1;
																																									} else {
																																										coordinates_1 = worldmapdata_0
																																												.method289(
																																														coordinates_2.worldX,
																																														coordinates_2.worldY);
																																										if (coordinates_1 == null) {
																																											Class45.intStack[++WorldMapType2.intStackSize
																																													- 1] = -1;
																																										} else {
																																											Class45.intStack[++WorldMapType2.intStackSize
																																													- 1] = coordinates_1
																																															.method489();
																																										}

																																										byte_0 = 1;
																																									}
																																								} else {
																																									Coordinates coordinates_0;
																																									if (int_1 == 6619) {
																																										WorldMapType2.intStackSize -= 2;
																																										int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																										coordinates_0 = new Coordinates(
																																												Class45.intStack[WorldMapType2.intStackSize
																																														+ 1]);
																																										Class36.method249(
																																												int_8,
																																												coordinates_0,
																																												false);
																																										byte_0 = 1;
																																									} else if (int_1 == 6620) {
																																										WorldMapType2.intStackSize -= 2;
																																										int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																										coordinates_0 = new Coordinates(
																																												Class45.intStack[WorldMapType2.intStackSize
																																														+ 1]);
																																										Class36.method249(
																																												int_8,
																																												coordinates_0,
																																												true);
																																										byte_0 = 1;
																																									} else if (int_1 == 6621) {
																																										WorldMapType2.intStackSize -= 2;
																																										int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																										coordinates_0 = new Coordinates(
																																												Class45.intStack[WorldMapType2.intStackSize
																																														+ 1]);
																																										worldmapdata_1 = Class3
																																												.method86()
																																												.method18(
																																														int_8);
																																										if (worldmapdata_1 == null) {
																																											Class45.intStack[++WorldMapType2.intStackSize
																																													- 1] = 0;
																																											byte_0 = 1;
																																										} else {
																																											Class45.intStack[++WorldMapType2.intStackSize
																																													- 1] = worldmapdata_1
																																															.method288(
																																																	coordinates_0.plane,
																																																	coordinates_0.worldX,
																																																	coordinates_0.worldY)
																																																			? 1
																																																			: 0;
																																											byte_0 = 1;
																																										}
																																									} else if (int_1 == 6622) {
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = Class3
																																														.method86()
																																														.method50();
																																										Class45.intStack[++WorldMapType2.intStackSize
																																												- 1] = Class3
																																														.method86()
																																														.method58();
																																										byte_0 = 1;
																																									} else if (int_1 == 6623) {
																																										coordinates_2 = new Coordinates(
																																												Class45.intStack[--WorldMapType2.intStackSize]);
																																										worldmapdata_0 = Class3
																																												.method86()
																																												.method16(
																																														coordinates_2.plane,
																																														coordinates_2.worldX,
																																														coordinates_2.worldY);
																																										if (worldmapdata_0 == null) {
																																											Class45.intStack[++WorldMapType2.intStackSize
																																													- 1] = -1;
																																										} else {
																																											Class45.intStack[++WorldMapType2.intStackSize
																																													- 1] = worldmapdata_0
																																															.method284();
																																										}

																																										byte_0 = 1;
																																									} else if (int_1 == 6624) {
																																										Class3.method86()
																																												.method51(
																																														Class45.intStack[--WorldMapType2.intStackSize]);
																																										byte_0 = 1;
																																									} else if (int_1 == 6625) {
																																										Class3.method86()
																																												.method48();
																																										byte_0 = 1;
																																									} else if (int_1 == 6626) {
																																										Class3.method86()
																																												.method52(
																																														Class45.intStack[--WorldMapType2.intStackSize]);
																																										byte_0 = 1;
																																									} else if (int_1 == 6627) {
																																										Class3.method86()
																																												.method49();
																																										byte_0 = 1;
																																									} else {
																																										boolean bool_4;
																																										if (int_1 == 6628) {
																																											bool_4 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
																																											Class3.method86()
																																													.method55(
																																															bool_4);
																																											byte_0 = 1;
																																										} else if (int_1 == 6629) {
																																											int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																											Class3.method86()
																																													.method54(
																																															int_8);
																																											byte_0 = 1;
																																										} else if (int_1 == 6630) {
																																											int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																											Class3.method86()
																																													.method56(
																																															int_8);
																																											byte_0 = 1;
																																										} else if (int_1 == 6631) {
																																											Class3.method86()
																																													.method53();
																																											byte_0 = 1;
																																										} else if (int_1 == 6632) {
																																											bool_4 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
																																											Class3.method86()
																																													.method57(
																																															bool_4);
																																											byte_0 = 1;
																																										} else {
																																											boolean bool_5;
																																											if (int_1 == 6633) {
																																												WorldMapType2.intStackSize -= 2;
																																												int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																												bool_5 = Class45.intStack[WorldMapType2.intStackSize
																																														+ 1] == 1;
																																												Class3.method86()
																																														.method61(
																																																int_8,
																																																bool_5);
																																												byte_0 = 1;
																																											} else if (int_1 == 6634) {
																																												WorldMapType2.intStackSize -= 2;
																																												int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																												bool_5 = Class45.intStack[1
																																														+ WorldMapType2.intStackSize] == 1;
																																												Class3.method86()
																																														.method62(
																																																int_8,
																																																bool_5);
																																												byte_0 = 1;
																																											} else if (int_1 == 6635) {
																																												Class45.intStack[++WorldMapType2.intStackSize
																																														- 1] = Class3
																																																.method86()
																																																.method60()
																																																		? 1
																																																		: 0;
																																												byte_0 = 1;
																																											} else if (int_1 == 6636) {
																																												int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																												Class45.intStack[++WorldMapType2.intStackSize
																																														- 1] = Class3
																																																.method86()
																																																.method63(
																																																		int_8) ? 1
																																																				: 0;
																																												byte_0 = 1;
																																											} else if (int_1 == 6637) {
																																												int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																												Class45.intStack[++WorldMapType2.intStackSize
																																														- 1] = Class3
																																																.method86()
																																																.method64(
																																																		int_8) ? 1
																																																				: 0;
																																												byte_0 = 1;
																																											} else if (int_1 == 6638) {
																																												WorldMapType2.intStackSize -= 2;
																																												int_8 = Class45.intStack[WorldMapType2.intStackSize];
																																												coordinates_0 = new Coordinates(
																																														Class45.intStack[WorldMapType2.intStackSize
																																																+ 1]);
																																												coordinates_1 = Class3
																																														.method86()
																																														.method65(
																																																int_8,
																																																coordinates_0);
																																												if (coordinates_1 == null) {
																																													Class45.intStack[++WorldMapType2.intStackSize
																																															- 1] = -1;
																																												} else {
																																													Class45.intStack[++WorldMapType2.intStackSize
																																															- 1] = coordinates_1
																																																	.method489();
																																												}

																																												byte_0 = 1;
																																											} else {
																																												Class3 class3_0;
																																												if (int_1 == 6639) {
																																													class3_0 = Class3
																																															.method86()
																																															.method59();
																																													if (class3_0 == null) {
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = -1;
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = -1;
																																													} else {
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = class3_0.anInt19;
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = class3_0.aCoordinates2
																																																		.method489();
																																													}

																																													byte_0 = 1;
																																												} else if (int_1 == 6640) {
																																													class3_0 = Class3
																																															.method86()
																																															.method29();
																																													if (class3_0 == null) {
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = -1;
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = -1;
																																													} else {
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = class3_0.anInt19;
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = class3_0.aCoordinates2
																																																		.method489();
																																													}

																																													byte_0 = 1;
																																												} else {
																																													Area area_1;
																																													if (int_1 == 6693) {
																																														int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																														area_1 = Class17.anAreaArray1[int_8];
																																														if (area_1.name == null) {
																																															Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																																	- 1] = "";
																																														} else {
																																															Class45.scriptStringStack[++BaseVarType.scriptStringStackSize
																																																	- 1] = area_1.name;
																																														}

																																														byte_0 = 1;
																																													} else if (int_1 == 6694) {
																																														int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																														area_1 = Class17.anAreaArray1[int_8];
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = area_1.anInt472;
																																														byte_0 = 1;
																																													} else if (int_1 == 6695) {
																																														int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																														area_1 = Class17.anAreaArray1[int_8];
																																														if (area_1 == null) {
																																															Class45.intStack[++WorldMapType2.intStackSize
																																																	- 1] = -1;
																																														} else {
																																															Class45.intStack[++WorldMapType2.intStackSize
																																																	- 1] = area_1.anInt474;
																																														}

																																														byte_0 = 1;
																																													} else if (int_1 == 6696) {
																																														int_8 = Class45.intStack[--WorldMapType2.intStackSize];
																																														area_1 = Class17.anAreaArray1[int_8];
																																														if (area_1 == null) {
																																															Class45.intStack[++WorldMapType2.intStackSize
																																																	- 1] = -1;
																																														} else {
																																															Class45.intStack[++WorldMapType2.intStackSize
																																																	- 1] = area_1.spriteId;
																																														}

																																														byte_0 = 1;
																																													} else if (int_1 == 6697) {
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = Class45.aClass9_1.anInt32;
																																														byte_0 = 1;
																																													} else if (int_1 == 6698) {
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = Class45.aClass9_1.aCoordinates3
																																																		.method489();
																																														byte_0 = 1;
																																													} else if (int_1 == 6699) {
																																														Class45.intStack[++WorldMapType2.intStackSize
																																																- 1] = Class45.aClass9_1.aCoordinates4
																																																		.method489();
																																														byte_0 = 1;
																																													} else {
																																														byte_0 = 2;
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}

																																				int_7 = byte_0;
																																			} else {
																																				int_7 = 2;
																																			}
																																		}
																																	}
																																}
																															}

																															switch (int_7) {
																															case 0:
																																return;
																															case 1:
																															default:
																																break;
																															case 2:
																																throw new IllegalStateException();
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} catch (final Exception exception_0) {
				final StringBuilder stringbuilder_0 = new StringBuilder(30);
				stringbuilder_0.append("").append(script_2.hash).append(" ");

				for (int_4 = Class45.scriptStackCount - 1; int_4 >= 0; --int_4) {
					stringbuilder_0.append("").append(Class45.scriptStack[int_4].invokedFromScript.hash).append(" ");
				}

				stringbuilder_0.append("").append(byte_1);
				Class17.method201(stringbuilder_0.toString(), exception_0);
			}
		}
	}

	static void method72(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1, final boolean bool_0,
			final int int_0) {
		if (Class26.aBool8) {
			if (int_0 == 4) {
				Class26.loginIndex = 4;
			}

		} else {
			Class26.loginIndex = int_0;
			Rasterizer2D.reset();
			final byte[] bytes_0 = indexdatabase_0.method438("title.jpg", "");
			BufferedImage bufferedimage_0 = null;

			SpritePixels spritepixels_0;
			label143: {
				try {
					bufferedimage_0 = ImageIO.read(new ByteArrayInputStream(bytes_0));
					final int int_1 = bufferedimage_0.getWidth();
					final int int_2 = bufferedimage_0.getHeight();
					final int[] ints_0 = new int[int_2 * int_1];
					final PixelGrabber pixelgrabber_0 = new PixelGrabber(bufferedimage_0, 0, 0, int_1, int_2, ints_0, 0,
							int_1);
					pixelgrabber_0.grabPixels();
					spritepixels_0 = new SpritePixels(ints_0, int_1, int_2);
					break label143;
				} catch (final IOException ioexception_0) {
					;
				} catch (final InterruptedException interruptedexception_0) {
					;
				}

				spritepixels_0 = new SpritePixels(0, 0);
			}

			XItemContainer.aSpritePixels4 = spritepixels_0;
			AClass4_Sub2.aSpritePixels5 = XItemContainer.aSpritePixels4.method927();
			if ((Client.flags & 0x20000000) != 0) {
				Class58.logoSprite = ISAACCipher.getSprite(indexdatabase_1, "logo_deadman_mode", "");
			} else {
				Class58.logoSprite = ISAACCipher.getSprite(indexdatabase_1, "logo", "");
			}

			Class26.aModIcon1 = ISAACCipher.getSprite(indexdatabase_1, "titlebox", "");
			AClass5_Sub4.aModIcon5 = ISAACCipher.getSprite(indexdatabase_1, "titlebutton", "");
			Frames.aModIconArray9 = Class98.method494(indexdatabase_1, "runes", "");
			XClanMember.titlemuteSprite = Class98.method494(indexdatabase_1, "title_mute", "");
			ISAACCipher.aModIcon2 = ISAACCipher.getSprite(indexdatabase_1, "options_radio_buttons,0", "");
			Enum5.aModIcon4 = ISAACCipher.getSprite(indexdatabase_1, "options_radio_buttons,2", "");
			Class26.anIntArray13 = new int[256];

			int int_3;
			for (int_3 = 0; int_3 < 64; int_3++) {
				Class26.anIntArray13[int_3] = int_3 * 262144;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				Class26.anIntArray13[int_3 + 64] = (int_3 * 1024) + 16711680;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				Class26.anIntArray13[int_3 + 128] = (int_3 * 4) + 16776960;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				Class26.anIntArray13[int_3 + 192] = 16777215;
			}

			AClass2_Sub1.anIntArray75 = new int[256];

			for (int_3 = 0; int_3 < 64; int_3++) {
				AClass2_Sub1.anIntArray75[int_3] = int_3 * 1024;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				AClass2_Sub1.anIntArray75[int_3 + 64] = (int_3 * 4) + 65280;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				AClass2_Sub1.anIntArray75[int_3 + 128] = (int_3 * 262144) + 65535;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				AClass2_Sub1.anIntArray75[int_3 + 192] = 16777215;
			}

			World.anIntArray63 = new int[256];

			for (int_3 = 0; int_3 < 64; int_3++) {
				World.anIntArray63[int_3] = int_3 * 4;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				World.anIntArray63[int_3 + 64] = (int_3 * 262144) + 255;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				World.anIntArray63[int_3 + 128] = (int_3 * 1024) + 16711935;
			}

			for (int_3 = 0; int_3 < 64; int_3++) {
				World.anIntArray63[int_3 + 192] = 16777215;
			}

			Class26.anIntArray14 = new int[256];
			Spotanim.anIntArray83 = new int[32768];
			Class32.anIntArray15 = new int[32768];
			Class23.method214((ModIcon) null);
			Class61.anIntArray40 = new int[32768];
			Class50.anIntArray24 = new int[32768];
			if (bool_0) {
				Class26.username = "";
				Class26.password = "";
			}

			Class44.authCodeForLogin = 0;
			WallObject.authCode = "";
			Class26.aBool7 = true;
			Class26.worldSelectShown = false;
			if (!Class28.preferences.muted) {
				Class89.method470(2, Class68.indexTrack1, "scape main", "", 255, false);
			} else {
				Class76.anInt186 = 1;
				Class76.anIndexDataBase3 = null;
				Class76.anInt187 = -1;
				MilliTimer.anInt422 = -1;
				Class76.anInt188 = 0;
				Class76.aBool21 = false;
				AClass2_Sub1.anInt334 = 2;
			}

			Actor.sendConInfo(false);
			Class26.aBool8 = true;
			Class26.anInt79 = (Class25.canvasWidth - 765) / 2;
			Class26.loginWindowX = Class26.anInt79 + 202;
			XItemContainer.aSpritePixels4.method914(Class26.anInt79, 0);
			AClass4_Sub2.aSpritePixels5.method914(Class26.anInt79 + 382, 0);
			Class58.logoSprite.method886((Class26.anInt79 + 382) - (Class58.logoSprite.originalWidth / 2), 18);
		}
	}

	static final void method73(final String string_0, final String string_1, final int int_0, final int int_1,
			final int int_2, final int int_3, final boolean bool_0) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionCount < 500) {
				Client.menuOptions[Client.menuOptionCount] = string_0;
				Client.menuTargets[Client.menuOptionCount] = string_1;
				Client.menuTypes[Client.menuOptionCount] = int_0;
				Client.menuIdentifiers[Client.menuOptionCount] = int_1;
				Client.menuActionParams0[Client.menuOptionCount] = int_2;
				Client.menuActionParams1[Client.menuOptionCount] = int_3;
				if (bool_0) {
					Client.anInt654 = Client.menuOptionCount;
				}

				++Client.menuOptionCount;
			}

		}
	}

}
