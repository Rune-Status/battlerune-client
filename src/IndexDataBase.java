public abstract class IndexDataBase {

	static GZipDecompressor gzip;
	static int anInt177;
	int[][] archiveFileIds;
	int[] archiveIds;
	Object[] anObjectArray1;
	Object[][] childs;
	boolean aBool19;
	Identifiers[] childIdentifiers;
	Identifiers identifiers;
	int[] archiveRevisions;
	int[] archiveNumberOfFiles;
	public int crc;
	boolean aBool20;
	int[] archiveCrcs;
	int validArchivesCount;
	int[] archiveNames;
	int[][] archiveFileNames;

	static {
		gzip = new GZipDecompressor();
		anInt177 = 0;
	}

	IndexDataBase(final boolean bool_0, final boolean bool_1) {
		aBool19 = bool_0;
		aBool20 = bool_1;
	}

	public byte[] getConfigData(final int int_0, final int int_1, final int[] ints_0) {
		if ((int_0 >= 0) && (int_0 < childs.length) && (childs[int_0] != null) && (int_1 >= 0)
				&& (int_1 < childs[int_0].length)) {
			if (childs[int_0][int_1] == null) {
				boolean bool_0 = method436(int_0, ints_0);
				if (!bool_0) {
					method427(int_0);
					bool_0 = method436(int_0, ints_0);
					if (!bool_0) {
						return null;
					}
				}
			}

			final byte[] bytes_0 = RuntimeException_Sub1.toByteArray(childs[int_0][int_1], false);
			if (aBool20) {
				childs[int_0][int_1] = null;
			}

			return bytes_0;
		} else {
			return null;
		}
	}

	public int size() {
		return childs.length;
	}

	public byte[] getChild(final int int_0, final int int_1) {
		if ((int_0 >= 0) && (int_0 < childs.length) && (childs[int_0] != null) && (int_1 >= 0)
				&& (int_1 < childs[int_0].length)) {
			if (childs[int_0][int_1] == null) {
				boolean bool_0 = method436(int_0, (int[]) null);
				if (!bool_0) {
					method427(int_0);
					bool_0 = method436(int_0, (int[]) null);
					if (!bool_0) {
						return null;
					}
				}
			}

			final byte[] bytes_0 = RuntimeException_Sub1.toByteArray(childs[int_0][int_1], false);
			return bytes_0;
		} else {
			return null;
		}
	}

	void method427(final int int_0) {
	}

	public byte[] getConfigData(final int int_0, final int int_1) {
		return this.getConfigData(int_0, int_1, (int[]) null);
	}

	public byte[] method428(final int int_0) {
		if (childs.length == 1) {
			return this.getChild(0, int_0);
		} else if (childs[int_0].length == 1) {
			return this.getChild(int_0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	int method429(final int int_0) {
		return anObjectArray1[int_0] != null ? 100 : 0;
	}

	public int fileCount(final int int_0) {
		return childs[int_0].length;
	}

	void method430(final byte[] bytes_0) {
		crc = ItemLayer.method509(bytes_0, bytes_0.length);
		final Buffer buffer_0 = new Buffer(Class80.decodeContainer(bytes_0));
		final int int_0 = buffer_0.readUnsignedByte();
		if ((int_0 >= 5) && (int_0 <= 7)) {
			if (int_0 >= 6) {
				buffer_0.readInt();
			}

			final int int_1 = buffer_0.readUnsignedByte();
			if (int_0 >= 7) {
				validArchivesCount = buffer_0.getLargeSmart();
			} else {
				validArchivesCount = buffer_0.readUnsignedShort();
			}

			int int_2 = 0;
			int int_3 = -1;
			archiveIds = new int[validArchivesCount];
			int int_4;
			if (int_0 >= 7) {
				for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
					archiveIds[int_4] = int_2 += buffer_0.getLargeSmart();
					if (archiveIds[int_4] > int_3) {
						int_3 = archiveIds[int_4];
					}
				}
			} else {
				for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
					archiveIds[int_4] = int_2 += buffer_0.readUnsignedShort();
					if (archiveIds[int_4] > int_3) {
						int_3 = archiveIds[int_4];
					}
				}
			}

			archiveCrcs = new int[int_3 + 1];
			archiveRevisions = new int[int_3 + 1];
			archiveNumberOfFiles = new int[int_3 + 1];
			archiveFileIds = new int[int_3 + 1][];
			anObjectArray1 = new Object[int_3 + 1];
			childs = new Object[int_3 + 1][];
			if (int_1 != 0) {
				archiveNames = new int[int_3 + 1];

				for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
					archiveNames[archiveIds[int_4]] = buffer_0.readInt();
				}

				identifiers = new Identifiers(archiveNames);
			}

			for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
				archiveCrcs[archiveIds[int_4]] = buffer_0.readInt();
			}

			for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
				archiveRevisions[archiveIds[int_4]] = buffer_0.readInt();
			}

			for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
				archiveNumberOfFiles[archiveIds[int_4]] = buffer_0.readUnsignedShort();
			}

			int int_5;
			int int_6;
			int int_7;
			int int_8;
			int int_9;
			if (int_0 >= 7) {
				for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
					int_5 = archiveIds[int_4];
					int_6 = archiveNumberOfFiles[int_5];
					int_2 = 0;
					int_7 = -1;
					archiveFileIds[int_5] = new int[int_6];

					for (int_8 = 0; int_8 < int_6; int_8++) {
						int_9 = archiveFileIds[int_5][int_8] = int_2 += buffer_0.getLargeSmart();
						if (int_9 > int_7) {
							int_7 = int_9;
						}
					}

					childs[int_5] = new Object[int_7 + 1];
				}
			} else {
				for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
					int_5 = archiveIds[int_4];
					int_6 = archiveNumberOfFiles[int_5];
					int_2 = 0;
					int_7 = -1;
					archiveFileIds[int_5] = new int[int_6];

					for (int_8 = 0; int_8 < int_6; int_8++) {
						int_9 = archiveFileIds[int_5][int_8] = int_2 += buffer_0.readUnsignedShort();
						if (int_9 > int_7) {
							int_7 = int_9;
						}
					}

					childs[int_5] = new Object[int_7 + 1];
				}
			}

			if (int_1 != 0) {
				archiveFileNames = new int[int_3 + 1][];
				childIdentifiers = new Identifiers[int_3 + 1];

				for (int_4 = 0; int_4 < validArchivesCount; int_4++) {
					int_5 = archiveIds[int_4];
					int_6 = archiveNumberOfFiles[int_5];
					archiveFileNames[int_5] = new int[childs[int_5].length];

					for (int_7 = 0; int_7 < int_6; int_7++) {
						archiveFileNames[int_5][archiveFileIds[int_5][int_7]] = buffer_0.readInt();
					}

					childIdentifiers[int_5] = new Identifiers(archiveFileNames[int_5]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	public boolean method431(final int int_0, final int int_1) {
		if ((int_0 >= 0) && (int_0 < childs.length) && (childs[int_0] != null) && (int_1 >= 0)
				&& (int_1 < childs[int_0].length)) {
			if (childs[int_0][int_1] != null) {
				return true;
			} else if (anObjectArray1[int_0] != null) {
				return true;
			} else {
				method427(int_0);
				return anObjectArray1[int_0] != null;
			}
		} else {
			return false;
		}
	}

	public boolean containsFile(final int int_0) {
		if (anObjectArray1[int_0] != null) {
			return true;
		} else {
			method427(int_0);
			return anObjectArray1[int_0] != null;
		}
	}

	public boolean method432(String string_0, String string_1) {
		string_0 = string_0.toLowerCase();
		string_1 = string_1.toLowerCase();
		final int int_0 = identifiers.getFile(AClass5_Sub4.djb2Hash(string_0));
		final int int_1 = childIdentifiers[int_0].getFile(AClass5_Sub4.djb2Hash(string_1));
		return method431(int_0, int_1);
	}

	void method433(final int int_0) {
	}

	public byte[] method434(final int int_0) {
		if (childs.length == 1) {
			return this.getConfigData(0, int_0);
		} else if (childs[int_0].length == 1) {
			return this.getConfigData(int_0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public int[] getChilds(final int int_0) {
		return archiveFileIds[int_0];
	}

	public int getFile(String string_0) {
		string_0 = string_0.toLowerCase();
		return identifiers.getFile(AClass5_Sub4.djb2Hash(string_0));
	}

	public boolean method435(String string_0, String string_1) {
		string_0 = string_0.toLowerCase();
		string_1 = string_1.toLowerCase();
		final int int_0 = identifiers.getFile(AClass5_Sub4.djb2Hash(string_0));
		if (int_0 < 0) {
			return false;
		} else {
			final int int_1 = childIdentifiers[int_0].getFile(AClass5_Sub4.djb2Hash(string_1));
			return int_1 >= 0;
		}
	}

	boolean method436(final int int_0, final int[] ints_0) {
		if (anObjectArray1[int_0] == null) {
			return false;
		} else {
			final int int_1 = archiveNumberOfFiles[int_0];
			final int[] ints_1 = archiveFileIds[int_0];
			final Object[] objects_0 = childs[int_0];
			boolean bool_0 = true;

			for (int int_2 = 0; int_2 < int_1; int_2++) {
				if (objects_0[ints_1[int_2]] == null) {
					bool_0 = false;
					break;
				}
			}

			if (bool_0) {
				return true;
			} else {
				byte[] bytes_0;
				if ((ints_0 == null)
						|| ((ints_0[0] == 0) && (ints_0[1] == 0) && (ints_0[2] == 0) && (ints_0[3] == 0))) {
					bytes_0 = RuntimeException_Sub1.toByteArray(anObjectArray1[int_0], false);
				} else {
					bytes_0 = RuntimeException_Sub1.toByteArray(anObjectArray1[int_0], true);
					final Buffer buffer_0 = new Buffer(bytes_0);
					buffer_0.decryptXtea(ints_0, 5, buffer_0.payload.length);
				}

				final byte[] bytes_2 = Class80.decodeContainer(bytes_0);
				if (aBool19) {
					anObjectArray1[int_0] = null;
				}

				if (int_1 > 1) {
					int int_3 = bytes_2.length;
					--int_3;
					final int int_4 = bytes_2[int_3] & 0xFF;
					int_3 -= int_1 * int_4 * 4;
					final Buffer buffer_1 = new Buffer(bytes_2);
					final int[] ints_2 = new int[int_1];
					buffer_1.offset = int_3;

					int int_6;
					int int_7;
					for (int int_5 = 0; int_5 < int_4; int_5++) {
						int_6 = 0;

						for (int_7 = 0; int_7 < int_1; int_7++) {
							int_6 += buffer_1.readInt();
							ints_2[int_7] += int_6;
						}
					}

					final byte[][] bytes_1 = new byte[int_1][];

					for (int_6 = 0; int_6 < int_1; int_6++) {
						bytes_1[int_6] = new byte[ints_2[int_6]];
						ints_2[int_6] = 0;
					}

					buffer_1.offset = int_3;
					int_6 = 0;

					for (int_7 = 0; int_7 < int_4; int_7++) {
						int int_8 = 0;

						for (int int_9 = 0; int_9 < int_1; int_9++) {
							int_8 += buffer_1.readInt();
							System.arraycopy(bytes_2, int_6, bytes_1[int_9], ints_2[int_9], int_8);
							ints_2[int_9] += int_8;
							int_6 += int_8;
						}
					}

					for (int_7 = 0; int_7 < int_1; int_7++) {
						if (!aBool20) {
							objects_0[ints_1[int_7]] = Class45.method269(bytes_1[int_7], false);
						} else {
							objects_0[ints_1[int_7]] = bytes_1[int_7];
						}
					}
				} else if (!aBool20) {
					objects_0[ints_1[0]] = Class45.method269(bytes_2, false);
				} else {
					objects_0[ints_1[0]] = bytes_2;
				}

				return true;
			}
		}
	}

	public int getChild(final int int_0, String string_0) {
		string_0 = string_0.toLowerCase();
		return childIdentifiers[int_0].getFile(AClass5_Sub4.djb2Hash(string_0));
	}

	public int method437(String string_0) {
		string_0 = string_0.toLowerCase();
		final int int_0 = identifiers.getFile(AClass5_Sub4.djb2Hash(string_0));
		return method429(int_0);
	}

	public byte[] method438(String string_0, String string_1) {
		string_0 = string_0.toLowerCase();
		string_1 = string_1.toLowerCase();
		final int int_0 = identifiers.getFile(AClass5_Sub4.djb2Hash(string_0));
		final int int_1 = childIdentifiers[int_0].getFile(AClass5_Sub4.djb2Hash(string_1));
		return this.getConfigData(int_0, int_1);
	}

	public boolean method439() {
		boolean bool_0 = true;

		for (int int_0 = 0; int_0 < archiveIds.length; int_0++) {
			final int int_1 = archiveIds[int_0];
			if (anObjectArray1[int_1] == null) {
				method427(int_1);
				if (anObjectArray1[int_1] == null) {
					bool_0 = false;
				}
			}
		}

		return bool_0;
	}

	public boolean method440(String string_0) {
		string_0 = string_0.toLowerCase();
		final int int_0 = identifiers.getFile(AClass5_Sub4.djb2Hash(string_0));
		return containsFile(int_0);
	}

	public void method441(final int int_0) {
		for (int int_1 = 0; int_1 < childs[int_0].length; int_1++) {
			childs[int_0][int_1] = null;
		}

	}

	public void reset() {
		for (int int_0 = 0; int_0 < childs.length; int_0++) {
			if (childs[int_0] != null) {
				for (int int_1 = 0; int_1 < childs[int_0].length; int_1++) {
					childs[int_0][int_1] = null;
				}
			}
		}

	}

	public void method442(String string_0) {
		string_0 = string_0.toLowerCase();
		final int int_0 = identifiers.getFile(AClass5_Sub4.djb2Hash(string_0));
		if (int_0 >= 0) {
			method433(int_0);
		}
	}

}
