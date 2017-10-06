import java.applet.Applet;
import java.io.File;
import java.io.IOException;

public class RuntimeException_Sub1 extends RuntimeException {

	public static int revision;
	public static Applet anApplet2;
	public static String aString31;
	String aString32;
	Throwable aThrowable1;

	public static FileOnDisk getPreferencesFile(final String string_0, final String string_1, final boolean bool_0) {
		final File file_0 = new File(Class57.aFile1, "preferences" + string_0 + ".dat");
		if (file_0.exists()) {
			try {
				final FileOnDisk fileondisk_1 = new FileOnDisk(file_0, "rw", 10000L);
				return fileondisk_1;
			} catch (final IOException ioexception_1) {
				;
			}
		}

		String string_2 = "";
		if (WorldMapType2.anInt241 == 33) {
			string_2 = "_rc";
		} else if (WorldMapType2.anInt241 == 34) {
			string_2 = "_wip";
		}

		final File file_1 = new File(Class23.userHome,
				"jagex_" + string_1 + "_preferences" + string_0 + string_2 + ".dat");
		FileOnDisk fileondisk_0;
		if (!bool_0 && file_1.exists()) {
			try {
				fileondisk_0 = new FileOnDisk(file_1, "rw", 10000L);
				return fileondisk_0;
			} catch (final IOException ioexception_2) {
				;
			}
		}

		try {
			fileondisk_0 = new FileOnDisk(file_0, "rw", 10000L);
			return fileondisk_0;
		} catch (final IOException ioexception_0) {
			throw new RuntimeException();
		}
	}

	public static int method891(int int_0) {
		--int_0;
		int_0 |= int_0 >>> 1;
		int_0 |= int_0 >>> 2;
		int_0 |= int_0 >>> 4;
		int_0 |= int_0 >>> 8;
		int_0 |= int_0 >>> 16;
		return int_0 + 1;
	}

	public static byte[] toByteArray(final Object object_0, final boolean bool_0) {
		if (object_0 == null) {
			return null;
		} else if (object_0 instanceof byte[]) {
			final byte[] bytes_1 = ((byte[]) object_0);
			if (bool_0) {
				final int int_0 = bytes_1.length;
				final byte[] bytes_0 = new byte[int_0];
				System.arraycopy(bytes_1, 0, bytes_0, 0, int_0);
				return bytes_0;
			} else {
				return bytes_1;
			}
		} else if (object_0 instanceof AbstractByteBuffer) {
			final AbstractByteBuffer abstractbytebuffer_0 = (AbstractByteBuffer) object_0;
			return abstractbytebuffer_0.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static void method892() {
		synchronized (Class92.anObject2) {
			if (Class92.anInt202 != 0) {
				Class92.anInt202 = 1;

				try {
					Class92.anObject2.wait();
				} catch (final InterruptedException interruptedexception_0) {
					;
				}
			}

		}
	}

	static final void method893() {
		if (!Class56.aBool17) {
			final int int_0 = Region.pitchSin;
			final int int_1 = Region.pitchCos;
			final int int_2 = Region.yawSin;
			final int int_3 = Region.yawCos;
			final byte byte_0 = 50;
			final short short_0 = 3500;
			int int_4 = ((Class56.anInt143 - Graphics3D.centerX) * byte_0) / Graphics3D.anInt578;
			int int_5 = ((Class56.anInt144 - Graphics3D.centerY) * byte_0) / Graphics3D.anInt578;
			final int int_6 = ((Class56.anInt143 - Graphics3D.centerX) * short_0) / Graphics3D.anInt578;
			int int_7 = ((Class56.anInt144 - Graphics3D.centerY) * short_0) / Graphics3D.anInt578;
			int int_8 = Graphics3D.method904(int_5, byte_0, int_1, int_0);
			int int_9 = Graphics3D.method905(int_5, byte_0, int_1, int_0);
			int_5 = int_8;
			int_8 = Graphics3D.method904(int_7, short_0, int_1, int_0);
			int int_10 = Graphics3D.method905(int_7, short_0, int_1, int_0);
			int_7 = int_8;
			int_8 = Graphics3D.method906(int_4, int_9, int_3, int_2);
			int_9 = Graphics3D.method907(int_4, int_9, int_3, int_2);
			int_4 = int_8;
			int_8 = Graphics3D.method906(int_6, int_10, int_3, int_2);
			int_10 = Graphics3D.method907(int_6, int_10, int_3, int_2);
			Class56.anInt146 = (int_4 + int_8) / 2;
			Class56.anInt147 = (int_5 + int_7) / 2;
			Class32.anInt91 = (int_10 + int_9) / 2;
			FileRequest.anInt477 = (int_8 - int_4) / 2;
			Class22.anInt75 = (int_7 - int_5) / 2;
			Class67.anInt170 = (int_10 - int_9) / 2;
			FileOnDisk.anInt15 = Math.abs(FileRequest.anInt477);
			Class56.anInt148 = Math.abs(Class22.anInt75);
			Class56.anInt149 = Math.abs(Class67.anInt170);
		}
	}

}
