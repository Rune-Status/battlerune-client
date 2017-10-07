import java.math.BigInteger;

public class Buffer extends Node {

	static int[] crc32Table;
	static long[] crc64Table;
	public byte[] payload;
	public int offset;

	static {
		crc32Table = new int[256];

		int int_2;
		for (int int_0 = 0; int_0 < 256; int_0++) {
			int int_1 = int_0;

			for (int_2 = 0; int_2 < 8; int_2++) {
				if ((int_1 & 0x1) == 1) {
					int_1 = (int_1 >>> 1) ^ 0xEDB88320;
				} else {
					int_1 >>>= 1;
				}
			}

			crc32Table[int_0] = int_1;
		}

		crc64Table = new long[256];

		for (int_2 = 0; int_2 < 256; int_2++) {
			long long_0 = int_2;

			for (int int_3 = 0; int_3 < 8; int_3++) {
				if ((long_0 & 0x1L) == 1L) {
					long_0 = (long_0 >>> 1) ^ 0xC96C5795D7870F42L;
				} else {
					long_0 >>>= 1;
				}
			}

			crc64Table[int_2] = long_0;
		}

	}

	public Buffer(final int int_0) {
		payload = Class62.method384(int_0);
		offset = 0;
	}

	public Buffer(final byte[] bytes_0) {
		payload = bytes_0;
		offset = 0;
	}

	public int readInt() {
		offset += 4;
		return ((payload[offset - 4] & 0xFF) << 24) + ((payload[offset - 3] & 0xFF) << 16)
				+ ((payload[offset - 2] & 0xFF) << 8) + (payload[offset - 1] & 0xFF);
	}

	public void putByte(final int int_0) {
		payload[offset++] = (byte) int_0;
	}

	public int readUnsignedByte() {
		return payload[offset++] & 0xFF;
	}

	public int method661() {
		if (payload[offset] < 0) {
			return readInt() & 0x7FFFFFFF;
		} else {
			final int int_0 = readUnsignedShort();
			return int_0 == 32767 ? -1 : int_0;
		}
	}

	public int read24BitInt() {
		offset += 3;
		return ((payload[offset - 2] & 0xFF) << 8) + ((payload[offset - 3] & 0xFF) << 16)
				+ (payload[offset - 1] & 0xFF);
	}

	public int readVarInt() {
		byte byte_0 = payload[offset++];

		int int_0;
		for (int_0 = 0; byte_0 < 0; byte_0 = payload[offset++]) {
			int_0 = (int_0 | (byte_0 & 0x7F)) << 7;
		}

		return int_0 | byte_0;
	}

	public String readString() {
		final int int_0 = offset;

		while (payload[offset++] != 0) {
			;
		}

		final int int_1 = offset - int_0 - 1;
		return int_1 == 0 ? "" : Class46.getString(payload, int_0, int_1);
	}

	public byte readByte() {
		return payload[offset++];
	}

	public int readUnsignedShort() {
		offset += 2;
		return ((payload[offset - 2] & 0xFF) << 8) + (payload[offset - 1] & 0xFF);
	}

	public void readBytes(final byte[] bytes_0, final int int_0, final int int_1) {
		for (int int_2 = int_0; int_2 < (int_1 + int_0); int_2++) {
			bytes_0[int_2] = payload[offset++];
		}

	}

	public void putInt(final int int_0) {
		payload[offset++] = (byte) (int_0 >> 24);
		payload[offset++] = (byte) (int_0 >> 16);
		payload[offset++] = (byte) (int_0 >> 8);
		payload[offset++] = (byte) int_0;
	}

	public void putShort(final int int_0) {
		payload[offset++] = (byte) (int_0 >> 8);
		payload[offset++] = (byte) int_0;
	}

	public int readShort() {
		offset += 2;
		int int_0 = ((payload[offset - 2] & 0xFF) << 8) + (payload[offset - 1] & 0xFF);
		if (int_0 > 32767) {
			int_0 -= 65536;
		}

		return int_0;
	}

	public String getJagString() {
		final byte byte_0 = payload[offset++];
		if (byte_0 != 0) {
			throw new IllegalStateException("");
		} else {
			final int int_0 = offset;

			while (payload[offset++] != 0) {
				;
			}

			final int int_1 = offset - int_0 - 1;
			return int_1 == 0 ? "" : Class46.getString(payload, int_0, int_1);
		}
	}

	public void putVarInt(final int int_0) {
		if ((int_0 & 0xFFFFFF80) != 0) {
			if ((int_0 & 0xFFFFC000) != 0) {
				if ((int_0 & 0xFFE00000) != 0) {
					if ((int_0 & 0xF0000000) != 0) {
						putByte((int_0 >>> 28) | 0x80);
					}

					putByte((int_0 >>> 21) | 0x80);
				}

				putByte((int_0 >>> 14) | 0x80);
			}

			putByte((int_0 >>> 7) | 0x80);
		}

		putByte(int_0 & 0x7F);
	}

	public void putBytes(final byte[] bytes_0, final int int_0, final int int_1) {
		for (int int_2 = int_0; int_2 < (int_1 + int_0); int_2++) {
			payload[offset++] = bytes_0[int_2];
		}

	}

	public long readLong() {
		final long long_0 = readInt() & 0xFFFFFFFFL;
		final long long_1 = readInt() & 0xFFFFFFFFL;
		return long_1 + (long_0 << 32);
	}

	public void decryptXtea(final int[] ints_0, final int int_0, final int int_1) {
		final int int_2 = offset;
		offset = int_0;
		final int int_3 = (int_1 - int_0) / 8;

		for (int int_4 = 0; int_4 < int_3; int_4++) {
			int int_5 = readInt();
			int int_6 = readInt();
			int int_7 = -957401312;
			final int int_8 = -1640531527;

			for (int int_9 = 32; int_9-- > 0; int_5 -= (int_6 + ((int_6 << 4) ^ (int_6 >>> 5)))
					^ (int_7 + ints_0[int_7 & 0x3])) {
				int_6 -= (int_5 + ((int_5 << 4) ^ (int_5 >>> 5))) ^ (ints_0[(int_7 >>> 11) & 0x3] + int_7);
				int_7 -= int_8;
			}

			offset -= 8;
			putInt(int_5);
			putInt(int_6);
		}

		offset = int_2;
	}

	public int getLargeSmart() {
		return payload[offset] < 0 ? readInt() & 0x7FFFFFFF : readUnsignedShort();
	}

	public void putString(final String string_0) {
		final int int_0 = string_0.indexOf(0);
		if (int_0 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			offset += BuildType.method504(string_0, 0, string_0.length(), payload, offset);
			payload[offset++] = 0;
		}
	}

	public void put24bitInt(final int int_0) {
		payload[offset++] = (byte) (int_0 >> 16);
		payload[offset++] = (byte) (int_0 >> 8);
		payload[offset++] = (byte) int_0;
	}

	public int readShortSmart() {
		final int int_0 = payload[offset] & 0xFF;
		return int_0 < 128 ? readUnsignedByte() - 64 : readUnsignedShort() - 49152;
	}

	public void putJagString(final String string_0) {
		final int int_0 = string_0.indexOf(0);
		if (int_0 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			payload[offset++] = 0;
			offset += BuildType.method504(string_0, 0, string_0.length(), payload, offset);
			payload[offset++] = 0;
		}
	}

	public void putLength(final int int_0) {
		payload[offset - int_0 - 1] = (byte) int_0;
	}

	public int getUSmart() {
		final int int_0 = payload[offset] & 0xFF;
		return int_0 < 128 ? readUnsignedByte() : readUnsignedShort() - 32768;
	}

	public int putCrc(final int int_0) {
		final byte[] bytes_0 = payload;
		final int int_1 = offset;
		int int_2 = -1;

		for (int int_3 = int_0; int_3 < int_1; int_3++) {
			int_2 = (int_2 >>> 8) ^ crc32Table[(int_2 ^ bytes_0[int_3]) & 0xFF];
		}

		int_2 = ~int_2;
		putInt(int_2);
		return int_2;
	}

	public void putShortOb2(final int int_0) {
		payload[offset++] = (byte) (int_0 + 128);
		payload[offset++] = (byte) (int_0 >> 8);
	}

	public void putLong(final long long_0) {
		payload[offset++] = (byte) ((int) (long_0 >> 56));
		payload[offset++] = (byte) ((int) (long_0 >> 48));
		payload[offset++] = (byte) ((int) (long_0 >> 40));
		payload[offset++] = (byte) ((int) (long_0 >> 32));
		payload[offset++] = (byte) ((int) (long_0 >> 24));
		payload[offset++] = (byte) ((int) (long_0 >> 16));
		payload[offset++] = (byte) ((int) (long_0 >> 8));
		payload[offset++] = (byte) ((int) long_0);
	}

	public int readIntLE() {
		offset += 4;
		return (payload[offset - 4] & 0xFF) + ((payload[offset - 1] & 0xFF) << 24)
				+ ((payload[offset - 2] & 0xFF) << 16) + ((payload[offset - 3] & 0xFF) << 8);
	}

	public int method663() {
		offset += 2;
		int int_0 = ((payload[offset - 1] & 0xFF) << 8) + ((payload[offset - 2] - 128) & 0xFF);
		if (int_0 > 32767) {
			int_0 -= 65536;
		}

		return int_0;
	}

	public int readUShortLE() {
		offset += 2;
		return ((payload[offset - 1] & 0xFF) << 8) + (payload[offset - 2] & 0xFF);
	}

	public int readIntIM() {
		offset += 4;
		return ((payload[offset - 1] & 0xFF) << 8) + ((payload[offset - 4] & 0xFF) << 16) + ((payload[offset - 3] & 0xFF) << 24) + (payload[offset - 2] & 0xFF);
	}

	public int readUShortA() {
		offset += 2;
		return ((payload[offset - 2] & 0xFF) << 8) + ((payload[offset - 1] - 128) & 0xFF);
	}

	public int readIntME() {
		offset += 4;
		return (payload[offset - 3] & 0xFF) + ((payload[offset - 4] & 0xFF) << 8) + ((payload[offset - 1] & 0xFF) << 16)
				+ ((payload[offset - 2] & 0xFF) << 24);
	}

	public void method666(final int int_0) {
		payload[offset++] = (byte) int_0;
		payload[offset++] = (byte) (int_0 >> 8);
		payload[offset++] = (byte) (int_0 >> 16);
		payload[offset++] = (byte) (int_0 >> 24);
	}

	public int readUByteN() {
		return (0 - payload[offset++]) & 0xFF;
	}

	public void putShortLE(final int int_0) {
		payload[offset++] = (byte) (int_0 + 128);
	}

	public void method668(final int int_0) {
		payload[offset++] = (byte) (int_0 >> 8);
		payload[offset++] = (byte) int_0;
		payload[offset++] = (byte) (int_0 >> 24);
		payload[offset++] = (byte) (int_0 >> 16);
	}

	public boolean checkCrc() {
		offset -= 4;
		final byte[] bytes_0 = payload;
		final int int_0 = offset;
		int int_1 = -1;

		int int_2;
		for (int_2 = 0; int_2 < int_0; int_2++) {
			int_1 = (int_1 >>> 8) ^ crc32Table[(int_1 ^ bytes_0[int_2]) & 0xFF];
		}

		int_1 = ~int_1;
		int_2 = readInt();
		return int_2 == int_1;
	}

	public int method669() {
		return (128 - payload[offset++]) & 0xFF;
	}

	public void method670(final int int_0) {
		payload[offset++] = (byte) int_0;
		payload[offset++] = (byte) (int_0 >> 8);
	}

	public void putLEShortA(final int int_0) {
		payload[offset++] = (byte) (int_0 >> 8);
		payload[offset++] = (byte) (int_0 + 128);
	}

	public int readUShortLEA() {
		offset += 2;
		return ((payload[offset - 1] & 0xFF) << 8) + ((payload[offset - 2] - 128) & 0xFF);
	}

	public void putLEInt(final int int_0) {
		payload[offset++] = (byte) (int_0 >> 16);
		payload[offset++] = (byte) (int_0 >> 24);
		payload[offset++] = (byte) int_0;
		payload[offset++] = (byte) (int_0 >> 8);
	}

	public byte readByteN() {
		return (byte) (0 - payload[offset++]);
	}

	public void encryptRsa(final BigInteger biginteger_0, final BigInteger biginteger_1) {
		final int int_0 = offset;
		offset = 0;
		final byte[] bytes_0 = new byte[int_0];
		readBytes(bytes_0, 0, int_0);
		final BigInteger biginteger_2 = new BigInteger(bytes_0);
		final BigInteger biginteger_3 = biginteger_2.modPow(biginteger_0, biginteger_1);
		final byte[] bytes_1 = biginteger_3.toByteArray();
		offset = 0;
		putShort(bytes_1.length);
		putBytes(bytes_1, 0, bytes_1.length);
	}

	public int method673() {
		return (payload[offset++] - 128) & 0xFF;
	}

	public void method674(final long long_0) {
		payload[offset++] = (byte) ((int) (long_0 >> 40));
		payload[offset++] = (byte) ((int) (long_0 >> 32));
		payload[offset++] = (byte) ((int) (long_0 >> 24));
		payload[offset++] = (byte) ((int) (long_0 >> 16));
		payload[offset++] = (byte) ((int) (long_0 >> 8));
		payload[offset++] = (byte) ((int) long_0);
	}

	public void putShortLength(final int int_0) {
		payload[offset - int_0 - 2] = (byte) (int_0 >> 8);
		payload[offset - int_0 - 1] = (byte) int_0;
	}

	public String getCESU8() {
		final byte byte_0 = payload[offset++];
		if (byte_0 != 0) {
			throw new IllegalStateException("");
		} else {
			final int int_0 = readVarInt();
			if ((int_0 + offset) > payload.length) {
				throw new IllegalStateException("");
			} else {
				final byte[] bytes_0 = payload;
				final int int_1 = offset;
				final char[] chars_0 = new char[int_0];
				int int_2 = 0;
				int int_3 = int_1;

				int int_6;
				for (final int int_4 = int_1 + int_0; int_3 < int_4; chars_0[int_2++] = (char) int_6) {
					final int int_5 = bytes_0[int_3++] & 0xFF;
					if (int_5 < 128) {
						if (int_5 == 0) {
							int_6 = 65533;
						} else {
							int_6 = int_5;
						}
					} else if (int_5 < 192) {
						int_6 = 65533;
					} else if (int_5 < 224) {
						if ((int_3 < int_4) && ((bytes_0[int_3] & 0xC0) == 128)) {
							int_6 = ((int_5 & 0x1F) << 6) | (bytes_0[int_3++] & 0x3F);
							if (int_6 < 128) {
								int_6 = 65533;
							}
						} else {
							int_6 = 65533;
						}
					} else if (int_5 < 240) {
						if (((int_3 + 1) < int_4) && ((bytes_0[int_3] & 0xC0) == 128)
								&& ((bytes_0[int_3 + 1] & 0xC0) == 128)) {
							int_6 = ((int_5 & 0xF) << 12) | ((bytes_0[int_3++] & 0x3F) << 6)
									| (bytes_0[int_3++] & 0x3F);
							if (int_6 < 2048) {
								int_6 = 65533;
							}
						} else {
							int_6 = 65533;
						}
					} else if (int_5 < 248) {
						if (((int_3 + 2) < int_4) && ((bytes_0[int_3] & 0xC0) == 128)
								&& ((bytes_0[int_3 + 1] & 0xC0) == 128) && ((bytes_0[int_3 + 2] & 0xC0) == 128)) {
							int_6 = ((int_5 & 0x7) << 18) | ((bytes_0[int_3++] & 0x3F) << 12)
									| ((bytes_0[int_3++] & 0x3F) << 6) | (bytes_0[int_3++] & 0x3F);
							if ((int_6 >= 65536) && (int_6 <= 1114111)) {
								int_6 = 65533;
							} else {
								int_6 = 65533;
							}
						} else {
							int_6 = 65533;
						}
					} else {
						int_6 = 65533;
					}
				}

				final String string_0 = new String(chars_0, 0, int_2);
				offset += int_0;
				return string_0;
			}
		}
	}

	public void putCESU8(final CharSequence charsequence_0) {
		final int int_0 = charsequence_0.length();
		int int_1 = 0;

		for (int int_2 = 0; int_2 < int_0; int_2++) {
			final char char_0 = charsequence_0.charAt(int_2);
			if (char_0 <= 127) {
				++int_1;
			} else if (char_0 <= 2047) {
				int_1 += 2;
			} else {
				int_1 += 3;
			}
		}

		payload[offset++] = 0;
		putVarInt(int_1);
		offset += Class54.method328(payload, offset, charsequence_0);
	}

	public void method675(final int int_0) {
		payload[offset++] = (byte) (128 - int_0);
	}

	public void encryptXtea2(final int[] ints_0) {
		final int int_0 = offset / 8;
		offset = 0;

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			int int_2 = readInt();
			int int_3 = readInt();
			int int_4 = 0;
			final int int_5 = -1640531527;

			for (int int_6 = 32; int_6-- > 0; int_3 += (int_2 + ((int_2 << 4) ^ (int_2 >>> 5)))
					^ (int_4 + ints_0[(int_4 >>> 11) & 0x3])) {
				int_2 += (int_3 + ((int_3 << 4) ^ (int_3 >>> 5))) ^ (ints_0[int_4 & 0x3] + int_4);
				int_4 += int_5;
			}

			offset -= 8;
			putInt(int_2);
			putInt(int_3);
		}

	}

	public void method676(final int int_0) {
		payload[offset++] = (byte) (0 - int_0);
	}

	public void putLengthInt(final int int_0) {
		payload[offset - int_0 - 4] = (byte) (int_0 >> 24);
		payload[offset - int_0 - 3] = (byte) (int_0 >> 16);
		payload[offset - int_0 - 2] = (byte) (int_0 >> 8);
		payload[offset - int_0 - 1] = (byte) int_0;
	}

	public int method677() {
		offset += 2;
		int int_0 = ((payload[offset - 1] & 0xFF) << 8) + (payload[offset - 2] & 0xFF);
		if (int_0 > 32767) {
			int_0 -= 65536;
		}

		return int_0;
	}

	public int method678() {
		offset += 2;
		int int_0 = ((payload[offset - 2] & 0xFF) << 8) + ((payload[offset - 1] - 128) & 0xFF);
		if (int_0 > 32767) {
			int_0 -= 65536;
		}

		return int_0;
	}

	public int method679() {
		offset += 3;
		return (payload[offset - 3] & 0xFF) + ((payload[offset - 2] & 0xFF) << 8)
				+ ((payload[offset - 1] & 0xFF) << 16);
	}

	public byte method680() {
		return (byte) (128 - payload[offset++]);
	}

	public byte method681() {
		return (byte) (payload[offset++] - 128);
	}

	public void decryptXtea(final int[] ints_0) {
		final int int_0 = offset / 8;
		offset = 0;

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			int int_2 = readInt();
			int int_3 = readInt();
			int int_4 = -957401312;
			final int int_5 = -1640531527;

			for (int int_6 = 32; int_6-- > 0; int_2 -= (int_3 + ((int_3 << 4) ^ (int_3 >>> 5)))
					^ (int_4 + ints_0[int_4 & 0x3])) {
				int_3 -= (int_2 + ((int_2 << 4) ^ (int_2 >>> 5))) ^ (ints_0[(int_4 >>> 11) & 0x3] + int_4);
				int_4 -= int_5;
			}

			offset -= 8;
			putInt(int_2);
			putInt(int_3);
		}

	}

	public void encryptXtea(final int[] ints_0, final int int_0, final int int_1) {
		final int int_2 = offset;
		offset = int_0;
		final int int_3 = (int_1 - int_0) / 8;

		for (int int_4 = 0; int_4 < int_3; int_4++) {
			int int_5 = readInt();
			int int_6 = readInt();
			int int_7 = 0;
			final int int_8 = -1640531527;

			for (int int_9 = 32; int_9-- > 0; int_6 += (int_5 + ((int_5 << 4) ^ (int_5 >>> 5)))
					^ (ints_0[(int_7 >>> 11) & 0x3] + int_7)) {
				int_5 += (int_6 + ((int_6 << 4) ^ (int_6 >>> 5))) ^ (int_7 + ints_0[int_7 & 0x3]);
				int_7 += int_8;
			}

			offset -= 8;
			putInt(int_5);
			putInt(int_6);
		}

		offset = int_2;
	}

	public String getNullString() {
		if (payload[offset] == 0) {
			++offset;
			return null;
		} else {
			return readString();
		}
	}

	public void putShortSmart(final int int_0) {
		if ((int_0 >= 0) && (int_0 < 128)) {
			putByte(int_0);
		} else if ((int_0 >= 0) && (int_0 < 32768)) {
			putShort(int_0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

}
