import java.io.EOFException;
import java.io.IOException;

public class CacheFile {

	long aLong14;
	int anInt228;
	long aLong15;
	long aLong16;
	long position;
	long aLong17;
	FileOnDisk aFileOnDisk1;
	int anInt229;
	byte[] writePayload;
	byte[] readPayload;
	long length;

	public CacheFile(final FileOnDisk fileondisk_0, final int int_0, final int int_1) throws IOException {
		aLong17 = -1L;
		aLong16 = -1L;
		anInt229 = 0;
		aFileOnDisk1 = fileondisk_0;
		aLong14 = length = fileondisk_0.length();
		readPayload = new byte[int_0];
		writePayload = new byte[int_1];
		position = 0L;
	}

	void method529() throws IOException {
		if (aLong16 != -1L) {
			if (aLong15 != aLong16) {
				aFileOnDisk1.seek(aLong16);
				aLong15 = aLong16;
			}

			aFileOnDisk1.write(writePayload, 0, anInt229);
			aLong15 += -1032130717L * anInt229 * -344585653;
			if (aLong15 > length) {
				length = aLong15;
			}

			long long_0 = -1L;
			long long_1 = -1L;
			if ((aLong16 >= aLong17) && (aLong16 < (anInt228 + aLong17))) {
				long_0 = aLong16;
			} else if ((aLong17 >= aLong16) && (aLong17 < (aLong16 + anInt229))) {
				long_0 = aLong17;
			}

			if (((anInt229 + aLong16) > aLong17) && ((aLong16 + anInt229) <= (anInt228 + aLong17))) {
				long_1 = anInt229 + aLong16;
			} else if (((aLong17 + anInt228) > aLong16) && ((aLong17 + anInt228) <= (aLong16 + anInt229))) {
				long_1 = aLong17 + anInt228;
			}

			if ((long_0 > -1L) && (long_1 > long_0)) {
				final int int_0 = (int) (long_1 - long_0);
				System.arraycopy(writePayload, (int) (long_0 - aLong16), readPayload, (int) (long_0 - aLong17), int_0);
			}

			aLong16 = -1L;
			anInt229 = 0;
		}

	}

	public void method530(final byte[] bytes_0, int int_0, int int_1) throws IOException {
		try {
			if ((int_1 + int_0) > bytes_0.length) {
				throw new ArrayIndexOutOfBoundsException((int_1 + int_0) - bytes_0.length);
			}

			if ((aLong16 != -1L) && (position >= aLong16) && ((position + int_1) <= (aLong16 + anInt229))) {
				System.arraycopy(writePayload, (int) (position - aLong16), bytes_0, int_0, int_1);
				position += int_1;
				return;
			}

			final long long_0 = position;
			final int int_2 = int_1;
			int int_3;
			if ((position >= aLong17) && (position < (anInt228 + aLong17))) {
				int_3 = (int) (anInt228 - (position - aLong17));
				if (int_3 > int_1) {
					int_3 = int_1;
				}

				System.arraycopy(readPayload, (int) (position - aLong17), bytes_0, int_0, int_3);
				position += int_3;
				int_0 += int_3;
				int_1 -= int_3;
			}

			if (int_1 > readPayload.length) {
				aFileOnDisk1.seek(position);

				for (aLong15 = position; int_1 > 0; int_1 -= int_3) {
					int_3 = aFileOnDisk1.read(bytes_0, int_0, int_1);
					if (int_3 == -1) {
						break;
					}

					aLong15 += int_3;
					position += int_3;
					int_0 += int_3;
				}
			} else if (int_1 > 0) {
				method532();
				int_3 = int_1;
				if (int_1 > anInt228) {
					int_3 = anInt228;
				}

				System.arraycopy(readPayload, 0, bytes_0, int_0, int_3);
				int_0 += int_3;
				int_1 -= int_3;
				position += int_3;
			}

			if (aLong16 != -1L) {
				if ((aLong16 > position) && (int_1 > 0)) {
					int_3 = int_0 + (int) (aLong16 - position);
					if (int_3 > (int_1 + int_0)) {
						int_3 = int_1 + int_0;
					}

					while (int_0 < int_3) {
						bytes_0[int_0++] = 0;
						--int_1;
						++position;
					}
				}

				long long_1 = -1L;
				long long_2 = -1L;
				if ((aLong16 >= long_0) && (aLong16 < (long_0 + int_2))) {
					long_1 = aLong16;
				} else if ((long_0 >= aLong16) && (long_0 < (anInt229 + aLong16))) {
					long_1 = long_0;
				}

				if (((anInt229 + aLong16) > long_0) && ((anInt229 + aLong16) <= (int_2 + long_0))) {
					long_2 = anInt229 + aLong16;
				} else if (((int_2 + long_0) > aLong16) && ((int_2 + long_0) <= (anInt229 + aLong16))) {
					long_2 = int_2 + long_0;
				}

				if ((long_1 > -1L) && (long_2 > long_1)) {
					final int int_4 = (int) (long_2 - long_1);
					System.arraycopy(writePayload, (int) (long_1 - aLong16), bytes_0, (int) (long_1 - long_0) + int_0,
							int_4);
					if (long_2 > position) {
						int_1 = (int) (int_1 - (long_2 - position));
						position = long_2;
					}
				}
			}
		} catch (final IOException ioexception_0) {
			aLong15 = -1L;
			throw ioexception_0;
		}

		if (int_1 > 0) {
			throw new EOFException();
		}
	}

	public long method531() {
		return aLong14;
	}

	public void seek(final long long_0) throws IOException {
		if (long_0 < 0L) {
			throw new IOException("");
		} else {
			position = long_0;
		}
	}

	public void write(final byte[] bytes_0, int int_0, int int_1) throws IOException {
		try {
			if ((int_1 + position) > aLong14) {
				aLong14 = position + int_1;
			}

			if ((aLong16 != -1L) && ((position < aLong16) || (position > (anInt229 + aLong16)))) {
				method529();
			}

			if ((aLong16 != -1L) && ((int_1 + position) > (aLong16 + writePayload.length))) {
				final int int_2 = (int) (writePayload.length - (position - aLong16));
				System.arraycopy(bytes_0, int_0, writePayload, (int) (position - aLong16), int_2);
				position += int_2;
				int_0 += int_2;
				int_1 -= int_2;
				anInt229 = writePayload.length;
				method529();
			}

			if (int_1 <= writePayload.length) {
				if (int_1 > 0) {
					if (aLong16 == -1L) {
						aLong16 = position;
					}

					System.arraycopy(bytes_0, int_0, writePayload, (int) (position - aLong16), int_1);
					position += int_1;
					if ((position - aLong16) > anInt229) {
						anInt229 = (int) (position - aLong16);
					}
				}
			} else {
				if (position != aLong15) {
					aFileOnDisk1.seek(position);
					aLong15 = position;
				}

				aFileOnDisk1.write(bytes_0, int_0, int_1);
				aLong15 += int_1;
				if (aLong15 > length) {
					length = aLong15;
				}

				long long_0 = -1L;
				long long_1 = -1L;
				if ((position >= aLong17) && (position < (aLong17 + anInt228))) {
					long_0 = position;
				} else if ((aLong17 >= position) && (aLong17 < (int_1 + position))) {
					long_0 = aLong17;
				}

				if (((int_1 + position) > aLong17) && ((position + int_1) <= (aLong17 + anInt228))) {
					long_1 = position + int_1;
				} else if (((aLong17 + anInt228) > position) && ((aLong17 + anInt228) <= (int_1 + position))) {
					long_1 = aLong17 + anInt228;
				}

				if ((long_0 > -1L) && (long_1 > long_0)) {
					final int int_3 = (int) (long_1 - long_0);
					System.arraycopy(bytes_0, (int) ((long_0 + int_0) - position), readPayload,
							(int) (long_0 - aLong17), int_3);
				}

				position += int_1;
			}
		} catch (final IOException ioexception_0) {
			aLong15 = -1L;
			throw ioexception_0;
		}
	}

	void method532() throws IOException {
		anInt228 = 0;
		if (aLong15 != position) {
			aFileOnDisk1.seek(position);
			aLong15 = position;
		}

		int int_0;
		for (aLong17 = position; anInt228 < readPayload.length; anInt228 += int_0) {
			int_0 = aFileOnDisk1.read(readPayload, anInt228, readPayload.length - anInt228);
			if (int_0 == -1) {
				return;
			}

			aLong15 += int_0;
		}

	}

	public void method533() throws IOException {
		method529();
		aFileOnDisk1.close();
	}

	public void read(final byte[] bytes_0) throws IOException {
		method530(bytes_0, 0, bytes_0.length);
	}

	static final void method534(final int int_0, final int int_1, final int int_2, final int int_3) {
		for (int int_4 = int_1; int_4 <= (int_3 + int_1); int_4++) {
			for (int int_5 = int_0; int_5 <= (int_0 + int_2); int_5++) {
				if ((int_5 >= 0) && (int_5 < 104) && (int_4 >= 0) && (int_4 < 104)) {
					Class18.aByteArrayArrayArray4[0][int_5][int_4] = 127;
					if ((int_0 == int_5) && (int_5 > 0)) {
						Class18.tileHeights[0][int_5][int_4] = Class18.tileHeights[0][int_5 - 1][int_4];
					}

					if ((int_5 == (int_0 + int_2)) && (int_5 < 103)) {
						Class18.tileHeights[0][int_5][int_4] = Class18.tileHeights[0][int_5 + 1][int_4];
					}

					if ((int_4 == int_1) && (int_4 > 0)) {
						Class18.tileHeights[0][int_5][int_4] = Class18.tileHeights[0][int_5][int_4 - 1];
					}

					if ((int_4 == (int_3 + int_1)) && (int_4 < 103)) {
						Class18.tileHeights[0][int_5][int_4] = Class18.tileHeights[0][int_5][int_4 + 1];
					}
				}
			}
		}

	}

}
