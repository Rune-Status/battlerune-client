import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class25 {

	public static int canvasWidth;
	public static String[] aStringArray1;
	byte[] aByteArray2;
	Task aTask1;
	int anInt76;
	long aLong2;
	int anInt77;
	DataInputStream aDataInputStream1;
	byte[] aByteArray3;
	int anInt78;

	Class25(final Signlink signlink_0, final URL url_0) {
		aByteArray2 = new byte[4];
		aTask1 = signlink_0.createURL(url_0);
		anInt76 = 0;
		aLong2 = Class6.currentTimeMs() + 30000L;
	}

	byte[] method218() throws IOException {
		if (Class6.currentTimeMs() > aLong2) {
			throw new IOException();
		} else {
			if (anInt76 == 0) {
				if (aTask1.status == 2) {
					throw new IOException();
				}

				if (aTask1.status == 1) {
					aDataInputStream1 = (DataInputStream) aTask1.value;
					anInt76 = 1;
				}
			}

			if (anInt76 == 1) {
				anInt77 += aDataInputStream1.read(aByteArray2, anInt77, aByteArray2.length - anInt77);
				if (anInt77 == 4) {
					final int int_0 = (new Buffer(aByteArray2)).readInt();
					aByteArray3 = new byte[int_0];
					anInt76 = 2;
				}
			}

			if (anInt76 == 2) {
				anInt78 += aDataInputStream1.read(aByteArray3, anInt78, aByteArray3.length - anInt78);
				if (aByteArray3.length == anInt78) {
					return aByteArray3;
				}
			}

			return null;
		}
	}

	static Widget method219(Widget widget_0) {
		final int int_0 = Class6.getWidgetConfig(widget_0);
		final int int_1 = (int_0 >> 17) & 0x7;
		final int int_2 = int_1;
		if (int_1 == 0) {
			return null;
		} else {
			for (int int_3 = 0; int_3 < int_2; int_3++) {
				widget_0 = Class18.method202(widget_0.parentId);
				if (widget_0 == null) {
					return null;
				}
			}

			return widget_0;
		}
	}

}
