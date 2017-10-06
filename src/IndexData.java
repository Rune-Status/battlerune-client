import java.util.zip.CRC32;

public class IndexData extends IndexDataBase {

	static CRC32 crc32;
	IndexFile anIndexFile2;
	int crcValue;
	IndexFile anIndexFile3;
	volatile boolean aBool39;
	int index;
	volatile boolean[] aBoolArray5;
	int anInt329;
	int anInt330;
	boolean aBool40;

	static {
		crc32 = new CRC32();
	}

	public IndexData(final IndexFile indexfile_0, final IndexFile indexfile_1, final int int_0, final boolean bool_0,
			final boolean bool_1, final boolean bool_2) {
		super(bool_0, bool_1);
		aBool39 = false;
		aBool40 = false;
		anInt330 = -1;
		anIndexFile3 = indexfile_0;
		anIndexFile2 = indexfile_1;
		index = int_0;
		aBool40 = bool_2;
		Class36.method247(this, index);
	}

	@Override
	void method427(final int int_0) {
		if ((anIndexFile3 != null) && (aBoolArray5 != null) && aBoolArray5[int_0]) {
			Occluder.method382(int_0, anIndexFile3, this);
		} else {
			FileOnDisk.method75(this, index, int_0, super.archiveCrcs[int_0], (byte) 2, true);
		}
	}

	@Override
	int method429(final int int_0) {
		if (super.anObjectArray1[int_0] != null) {
			return 100;
		} else if (aBoolArray5[int_0]) {
			return 100;
		} else {
			final int int_1 = index;
			final long long_0 = (int_1 << 16) + int_0;
			int int_2;
			if ((Class94.currentRequest != null) && (long_0 == Class94.currentRequest.hash)) {
				int_2 = ((Class38.aBuffer1.offset * 99)
						/ (Class38.aBuffer1.payload.length - Class94.currentRequest.padding)) + 1;
			} else {
				int_2 = 0;
			}

			return int_2;
		}
	}

	void method593() {
		aBoolArray5 = new boolean[super.anObjectArray1.length];

		int int_0;
		for (int_0 = 0; int_0 < aBoolArray5.length; int_0++) {
			aBoolArray5[int_0] = false;
		}

		if (anIndexFile3 == null) {
			aBool39 = true;
		} else {
			anInt330 = -1;

			for (int_0 = 0; int_0 < aBoolArray5.length; int_0++) {
				if (super.archiveNumberOfFiles[int_0] > 0) {
					final IndexFile indexfile_0 = anIndexFile3;
					final FileSystem filesystem_0 = new FileSystem();
					filesystem_0.anInt361 = 1;
					filesystem_0.hash = int_0;
					filesystem_0.index = indexfile_0;
					filesystem_0.data = this;
					synchronized (Class92.aDeque1) {
						Class92.aDeque1.addFront(filesystem_0);
					}

					World.method527();
					anInt330 = int_0;
				}
			}

			if (anInt330 == -1) {
				aBool39 = true;
			}

		}
	}

	@Override
	void method433(final int int_0) {
		Enum1.method575(index, int_0);
	}

	void method594(final IndexFile indexfile_0, final int int_0, final byte[] bytes_0, final boolean bool_0) {
		int int_1;
		if (indexfile_0 == anIndexFile2) {
			if (aBool39) {
				throw new RuntimeException();
			} else if (bytes_0 == null) {
				FileOnDisk.method75(this, 255, index, crcValue, (byte) 0, true);
			} else {
				crc32.reset();
				crc32.update(bytes_0, 0, bytes_0.length);
				int_1 = (int) crc32.getValue();
				final Buffer buffer_0 = new Buffer(Class80.decodeContainer(bytes_0));
				final int int_3 = buffer_0.readUnsignedByte();
				if ((int_3 != 5) && (int_3 != 6)) {
					throw new RuntimeException(int_3 + "," + index + "," + int_0);
				} else {
					int int_4 = 0;
					if (int_3 >= 6) {
						int_4 = buffer_0.readInt();
					}

					if ((int_1 != crcValue) || (int_4 != anInt329)) {
						FileOnDisk.method75(this, 255, index, crcValue, (byte) 0, true);
					} else {
						method430(bytes_0);
						method593();
					}
				}
			}
		} else {
			if (!bool_0 && (int_0 == anInt330)) {
				aBool39 = true;
			}

			if ((bytes_0 != null) && (bytes_0.length > 2)) {
				crc32.reset();
				crc32.update(bytes_0, 0, bytes_0.length - 2);
				int_1 = (int) crc32.getValue();
				final int int_2 = (bytes_0[bytes_0.length - 1] & 0xFF) + ((bytes_0[bytes_0.length - 2] & 0xFF) << 8);
				if ((int_1 == super.archiveCrcs[int_0]) && (int_2 == super.archiveRevisions[int_0])) {
					aBoolArray5[int_0] = true;
					if (bool_0) {
						super.anObjectArray1[int_0] = Class45.method269(bytes_0, false);
					}
				} else {
					aBoolArray5[int_0] = false;
					if (aBool40 || bool_0) {
						FileOnDisk.method75(this, index, int_0, super.archiveCrcs[int_0], (byte) 2, bool_0);
					}

				}
			} else {
				aBoolArray5[int_0] = false;
				if (aBool40 || bool_0) {
					FileOnDisk.method75(this, index, int_0, super.archiveCrcs[int_0], (byte) 2, bool_0);
				}

			}
		}
	}

	void setInformation(final int int_0, final int int_1) {
		crcValue = int_0;
		anInt329 = int_1;
		if (anIndexFile2 != null) {
			Occluder.method382(index, anIndexFile2, this);
		} else {
			FileOnDisk.method75(this, 255, index, crcValue, (byte) 0, true);
		}
	}

	public int percentage() {
		if (aBool39) {
			return 100;
		} else if (super.anObjectArray1 != null) {
			return 99;
		} else {
			final int int_0 = index;
			final long long_0 = int_0 + 16711680;
			int int_1;
			if ((Class94.currentRequest != null) && (long_0 == Class94.currentRequest.hash)) {
				int_1 = ((Class38.aBuffer1.offset * 99)
						/ (Class38.aBuffer1.payload.length - Class94.currentRequest.padding)) + 1;
			} else {
				int_1 = 0;
			}

			int int_2 = int_1;
			if (int_1 >= 100) {
				int_2 = 99;
			}

			return int_2;
		}
	}

	public int method595() {
		int int_0 = 0;
		int int_1 = 0;

		int int_2;
		for (int_2 = 0; int_2 < super.anObjectArray1.length; int_2++) {
			if (super.archiveNumberOfFiles[int_2] > 0) {
				int_0 += 100;
				int_1 += method429(int_2);
			}
		}

		if (int_0 == 0) {
			return 100;
		} else {
			int_2 = (int_1 * 100) / int_0;
			return int_2;
		}
	}

	void method596(final int int_0, final byte[] bytes_0, final boolean bool_0, final boolean bool_1) {
		if (bool_0) {
			if (aBool39) {
				throw new RuntimeException();
			} else {
				if (anIndexFile2 != null) {
					final int int_1 = index;
					final IndexFile indexfile_1 = anIndexFile2;
					final FileSystem filesystem_1 = new FileSystem();
					filesystem_1.anInt361 = 0;
					filesystem_1.hash = int_1;
					filesystem_1.aByteArray13 = bytes_0;
					filesystem_1.index = indexfile_1;
					synchronized (Class92.aDeque1) {
						Class92.aDeque1.addFront(filesystem_1);
					}

					World.method527();
				}

				method430(bytes_0);
				method593();
			}
		} else {
			bytes_0[bytes_0.length - 2] = (byte) (super.archiveRevisions[int_0] >> 8);
			bytes_0[bytes_0.length - 1] = (byte) super.archiveRevisions[int_0];
			if (anIndexFile3 != null) {
				final IndexFile indexfile_0 = anIndexFile3;
				final FileSystem filesystem_0 = new FileSystem();
				filesystem_0.anInt361 = 0;
				filesystem_0.hash = int_0;
				filesystem_0.aByteArray13 = bytes_0;
				filesystem_0.index = indexfile_0;
				synchronized (Class92.aDeque1) {
					Class92.aDeque1.addFront(filesystem_0);
				}

				World.method527();
				aBoolArray5[int_0] = true;
			}

			if (bool_1) {
				super.anObjectArray1[int_0] = Class45.method269(bytes_0, false);
			}

		}
	}

	public static boolean method597(final IndexDataBase indexdatabase_0, final int int_0, final int int_1) {
		final byte[] bytes_0 = indexdatabase_0.getConfigData(int_0, int_1);
		if (bytes_0 == null) {
			return false;
		} else {
			Class5.decodeSprite(bytes_0);
			return true;
		}
	}

}
