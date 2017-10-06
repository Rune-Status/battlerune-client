public class Huffman {

	static ModIcon aModIcon3;
	int[] masks;
	byte[] bits;
	int[] keys;

	public Huffman(final byte[] bytes_0) {
		final int int_0 = bytes_0.length;
		masks = new int[int_0];
		bits = bytes_0;
		final int[] ints_0 = new int[33];
		keys = new int[8];
		int int_1 = 0;

		for (int int_2 = 0; int_2 < int_0; int_2++) {
			final byte byte_0 = bytes_0[int_2];
			if (byte_0 != 0) {
				final int int_3 = 1 << (32 - byte_0);
				final int int_4 = ints_0[byte_0];
				masks[int_2] = int_4;
				int int_5;
				int int_6;
				int int_7;
				int int_8;
				if ((int_4 & int_3) != 0) {
					int_5 = ints_0[byte_0 - 1];
				} else {
					int_5 = int_4 | int_3;

					for (int_6 = byte_0 - 1; int_6 >= 1; --int_6) {
						int_7 = ints_0[int_6];
						if (int_4 != int_7) {
							break;
						}

						int_8 = 1 << (32 - int_6);
						if ((int_7 & int_8) != 0) {
							ints_0[int_6] = ints_0[int_6 - 1];
							break;
						}

						ints_0[int_6] = int_7 | int_8;
					}
				}

				ints_0[byte_0] = int_5;

				for (int_6 = byte_0 + 1; int_6 <= 32; int_6++) {
					if (int_4 == ints_0[int_6]) {
						ints_0[int_6] = int_5;
					}
				}

				int_6 = 0;

				for (int_7 = 0; int_7 < byte_0; int_7++) {
					int_8 = Integer.MIN_VALUE >>> int_7;
					if ((int_4 & int_8) != 0) {
						if (keys[int_6] == 0) {
							keys[int_6] = int_1;
						}

						int_6 = keys[int_6];
					} else {
						++int_6;
					}

					if (int_6 >= keys.length) {
						final int[] ints_1 = new int[keys.length * 2];

						for (int int_9 = 0; int_9 < keys.length; int_9++) {
							ints_1[int_9] = keys[int_9];
						}

						keys = ints_1;
					}

					int_8 >>>= 1;
				}

				keys[int_6] = ~int_2;
				if (int_6 >= int_1) {
					int_1 = int_6 + 1;
				}
			}
		}

	}

	public int decompress(final byte[] bytes_0, final int int_0, final byte[] bytes_1, int int_1, int int_2) {
		if (int_2 == 0) {
			return 0;
		} else {
			int int_3 = 0;
			int_2 += int_1;
			int int_4 = int_0;

			while (true) {
				final byte byte_0 = bytes_0[int_4];
				if (byte_0 < 0) {
					int_3 = keys[int_3];
				} else {
					++int_3;
				}

				int int_5;
				if ((int_5 = keys[int_3]) < 0) {
					bytes_1[int_1++] = (byte) (~int_5);
					if (int_1 >= int_2) {
						break;
					}

					int_3 = 0;
				}

				if ((byte_0 & 0x40) != 0) {
					int_3 = keys[int_3];
				} else {
					++int_3;
				}

				if ((int_5 = keys[int_3]) < 0) {
					bytes_1[int_1++] = (byte) (~int_5);
					if (int_1 >= int_2) {
						break;
					}

					int_3 = 0;
				}

				if ((byte_0 & 0x20) != 0) {
					int_3 = keys[int_3];
				} else {
					++int_3;
				}

				if ((int_5 = keys[int_3]) < 0) {
					bytes_1[int_1++] = (byte) (~int_5);
					if (int_1 >= int_2) {
						break;
					}

					int_3 = 0;
				}

				if ((byte_0 & 0x10) != 0) {
					int_3 = keys[int_3];
				} else {
					++int_3;
				}

				if ((int_5 = keys[int_3]) < 0) {
					bytes_1[int_1++] = (byte) (~int_5);
					if (int_1 >= int_2) {
						break;
					}

					int_3 = 0;
				}

				if ((byte_0 & 0x8) != 0) {
					int_3 = keys[int_3];
				} else {
					++int_3;
				}

				if ((int_5 = keys[int_3]) < 0) {
					bytes_1[int_1++] = (byte) (~int_5);
					if (int_1 >= int_2) {
						break;
					}

					int_3 = 0;
				}

				if ((byte_0 & 0x4) != 0) {
					int_3 = keys[int_3];
				} else {
					++int_3;
				}

				if ((int_5 = keys[int_3]) < 0) {
					bytes_1[int_1++] = (byte) (~int_5);
					if (int_1 >= int_2) {
						break;
					}

					int_3 = 0;
				}

				if ((byte_0 & 0x2) != 0) {
					int_3 = keys[int_3];
				} else {
					++int_3;
				}

				if ((int_5 = keys[int_3]) < 0) {
					bytes_1[int_1++] = (byte) (~int_5);
					if (int_1 >= int_2) {
						break;
					}

					int_3 = 0;
				}

				if ((byte_0 & 0x1) != 0) {
					int_3 = keys[int_3];
				} else {
					++int_3;
				}

				if ((int_5 = keys[int_3]) < 0) {
					bytes_1[int_1++] = (byte) (~int_5);
					if (int_1 >= int_2) {
						break;
					}

					int_3 = 0;
				}

				++int_4;
			}

			return (int_4 + 1) - int_0;
		}
	}

	public int compress(final byte[] bytes_0, int int_0, int int_1, final byte[] bytes_1, final int int_2) {
		int int_3 = 0;
		int int_4 = int_2 << 3;

		for (int_1 += int_0; int_0 < int_1; int_0++) {
			final int int_5 = bytes_0[int_0] & 0xFF;
			final int int_6 = masks[int_5];
			final byte byte_0 = bits[int_5];
			if (byte_0 == 0) {
				throw new RuntimeException("");
			}

			int int_7 = int_4 >> 3;
			int int_8 = int_4 & 0x7;
			int_3 &= -int_8 >> 31;
			final int int_9 = (((int_8 + byte_0) - 1) >> 3) + int_7;
			int_8 += 24;
			bytes_1[int_7] = (byte) (int_3 |= int_6 >>> int_8);
			if (int_7 < int_9) {
				++int_7;
				int_8 -= 8;
				bytes_1[int_7] = (byte) (int_3 = int_6 >>> int_8);
				if (int_7 < int_9) {
					++int_7;
					int_8 -= 8;
					bytes_1[int_7] = (byte) (int_3 = int_6 >>> int_8);
					if (int_7 < int_9) {
						++int_7;
						int_8 -= 8;
						bytes_1[int_7] = (byte) (int_3 = int_6 >>> int_8);
						if (int_7 < int_9) {
							++int_7;
							int_8 -= 8;
							bytes_1[int_7] = (byte) (int_3 = int_6 << -int_8);
						}
					}
				}
			}

			int_4 += byte_0;
		}

		return ((int_4 + 7) >> 3) - int_2;
	}

	public static boolean method543(final char char_0) {
		return (char_0 >= 48) && (char_0 <= 57);
	}

	static IndexData openCacheIndex(final int int_0, final boolean bool_0, final boolean bool_1, final boolean bool_2) {
		IndexFile indexfile_0 = null;
		if (Class57.aCacheFile2 != null) {
			indexfile_0 = new IndexFile(int_0, Class57.aCacheFile2, Class57.aCacheFileArray1[int_0], 1000000);
		}

		return new IndexData(indexfile_0, World.anIndexFile1, int_0, bool_0, bool_1, bool_2);
	}

	static int method544(int int_0, final Script script_0, final boolean bool_0) {
		Widget widget_0;
		if (int_0 >= 2000) {
			int_0 -= 1000;
			widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
		} else {
			widget_0 = bool_0 ? Class45.aWidget6 : Class38.aWidget5;
		}

		String string_0 = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
		int[] ints_0 = null;
		if ((string_0.length() > 0) && (string_0.charAt(string_0.length() - 1) == 89)) {
			int int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			if (int_1 > 0) {
				for (ints_0 = new int[int_1]; int_1-- > 0; ints_0[int_1] = Class45.intStack[--WorldMapType2.intStackSize]) {
					;
				}
			}

			string_0 = string_0.substring(0, string_0.length() - 1);
		}

		Object[] objects_0 = new Object[string_0.length() + 1];

		int int_2;
		for (int_2 = objects_0.length - 1; int_2 >= 1; --int_2) {
			if (string_0.charAt(int_2 - 1) == 115) {
				objects_0[int_2] = Class45.scriptStringStack[--BaseVarType.scriptStringStackSize];
			} else {
				objects_0[int_2] = new Integer(Class45.intStack[--WorldMapType2.intStackSize]);
			}
		}

		int_2 = Class45.intStack[--WorldMapType2.intStackSize];
		if (int_2 != -1) {
			objects_0[0] = new Integer(int_2);
		} else {
			objects_0 = null;
		}

		if (int_0 == 1400) {
			widget_0.anObjectArray9 = objects_0;
		} else if (int_0 == 1401) {
			widget_0.anObjectArray12 = objects_0;
		} else if (int_0 == 1402) {
			widget_0.anObjectArray11 = objects_0;
		} else if (int_0 == 1403) {
			widget_0.mouseEnterListener = objects_0;
		} else if (int_0 == 1404) {
			widget_0.mouseExitListener = objects_0;
		} else if (int_0 == 1405) {
			widget_0.anObjectArray3 = objects_0;
		} else if (int_0 == 1406) {
			widget_0.anObjectArray6 = objects_0;
		} else if (int_0 == 1407) {
			widget_0.configListenerArgs = objects_0;
			widget_0.configTriggers = ints_0;
		} else if (int_0 == 1408) {
			widget_0.renderListener = objects_0;
		} else if (int_0 == 1409) {
			widget_0.anObjectArray8 = objects_0;
		} else if (int_0 == 1410) {
			widget_0.anObjectArray4 = objects_0;
		} else if (int_0 == 1411) {
			widget_0.anObjectArray10 = objects_0;
		} else if (int_0 == 1412) {
			widget_0.mouseHoverListener = objects_0;
		} else if (int_0 == 1414) {
			widget_0.tableListenerArgs = objects_0;
			widget_0.tableModTriggers = ints_0;
		} else if (int_0 == 1415) {
			widget_0.skillListenerArgs = objects_0;
			widget_0.skillTriggers = ints_0;
		} else if (int_0 == 1416) {
			widget_0.anObjectArray7 = objects_0;
		} else if (int_0 == 1417) {
			widget_0.scrollListener = objects_0;
		} else if (int_0 == 1418) {
			widget_0.anObjectArray13 = objects_0;
		} else if (int_0 == 1419) {
			widget_0.anObjectArray14 = objects_0;
		} else if (int_0 == 1420) {
			widget_0.anObjectArray15 = objects_0;
		} else if (int_0 == 1421) {
			widget_0.anObjectArray16 = objects_0;
		} else if (int_0 == 1422) {
			widget_0.anObjectArray17 = objects_0;
		} else if (int_0 == 1423) {
			widget_0.anObjectArray18 = objects_0;
		} else if (int_0 == 1424) {
			widget_0.anObjectArray19 = objects_0;
		} else if (int_0 == 1425) {
			widget_0.anObjectArray20 = objects_0;
		} else if (int_0 == 1426) {
			widget_0.anObjectArray21 = objects_0;
		} else {
			if (int_0 != 1427) {
				return 2;
			}

			widget_0.anObjectArray2 = objects_0;
		}

		widget_0.aBool27 = true;
		return 1;
	}

}
