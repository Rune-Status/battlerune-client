import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileOnDisk {

	static int anInt15;
	long position;
	RandomAccessFile file;
	long length;

	public FileOnDisk(final File file_0, final String string_0, long long_0) throws IOException {
		if (long_0 == -1L) {
			long_0 = Long.MAX_VALUE;
		}

		if (file_0.length() >= long_0) {
			file_0.delete();
		}

		file = new RandomAccessFile(file_0, string_0);
		length = long_0;
		position = 0L;
		final int int_0 = file.read();
		if ((int_0 != -1) && !string_0.equals("r")) {
			file.seek(0L);
			file.write(int_0);
		}

		file.seek(0L);
	}

	public final long length() throws IOException {
		return file.length();
	}

	public final void close() throws IOException {
		if (file != null) {
			file.close();
			file = null;
		}

	}

	public final int read(final byte[] bytes_0, final int int_0, final int int_1) throws IOException {
		final int int_2 = file.read(bytes_0, int_0, int_1);
		if (int_2 > 0) {
			position += int_2;
		}

		return int_2;
	}

	final void seek(final long long_0) throws IOException {
		file.seek(long_0);
		position = long_0;
	}

	public final void write(final byte[] bytes_0, final int int_0, final int int_1) throws IOException {
		if ((int_1 + position) > length) {
			file.seek(length + 1L);
			file.write(1);
			throw new EOFException();
		} else {
			file.write(bytes_0, int_0, int_1);
			position += int_1;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		if (file != null) {
			close();
		}

	}

	static void method75(final IndexData indexdata_0, final int int_0, final int int_1, final int int_2,
			final byte byte_0, final boolean bool_0) {
		final long long_0 = (int_0 << 16) + int_1;
		FileRequest filerequest_0 = (FileRequest) Class93.aXHashTable4.get(long_0);
		if (filerequest_0 == null) {
			filerequest_0 = (FileRequest) Class93.aXHashTable5.get(long_0);
			if (filerequest_0 == null) {
				filerequest_0 = (FileRequest) Class93.aXHashTable3.get(long_0);
				if (filerequest_0 != null) {
					if (bool_0) {
						filerequest_0.unlinkDual();
						Class93.aXHashTable4.put(filerequest_0, long_0);
						--Class93.anInt209;
						++Class93.anInt206;
					}

				} else {
					if (!bool_0) {
						filerequest_0 = (FileRequest) Class93.aXHashTable6.get(long_0);
						if (filerequest_0 != null) {
							return;
						}
					}

					filerequest_0 = new FileRequest();
					filerequest_0.index = indexdata_0;
					filerequest_0.crc = int_2;
					filerequest_0.padding = byte_0;
					if (bool_0) {
						Class93.aXHashTable4.put(filerequest_0, long_0);
						++Class93.anInt206;
					} else {
						Class93.aNode2LinkedList1.push(filerequest_0);
						Class93.aXHashTable3.put(filerequest_0, long_0);
						++Class93.anInt209;
					}
				}
			}
		}
	}

	public static void method76(final IndexDataBase indexdatabase_0, final String string_0, final String string_1,
			final int int_0, final boolean bool_0) {
		final int int_1 = indexdatabase_0.getFile(string_0);
		final int int_2 = indexdatabase_0.getChild(int_1, string_1);
		Friend.method503(indexdatabase_0, int_1, int_2, int_0, bool_0);
	}

}
