import java.util.zip.Inflater;

public class GZipDecompressor {

	public static BufferProvider aBufferProvider1;
	static ModIcon[] aModIconArray6;
	Inflater inflator;

	GZipDecompressor(final int int_0, final int int_1, final int int_2) {
	}

	public GZipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	public void decompress(final Buffer buffer_0, final byte[] bytes_0) {
		if ((buffer_0.payload[buffer_0.offset] == 31) && (buffer_0.payload[buffer_0.offset + 1] == -117)) {
			if (inflator == null) {
				inflator = new Inflater(true);
			}

			try {
				inflator.setInput(buffer_0.payload, buffer_0.offset + 10,
						buffer_0.payload.length - (buffer_0.offset + 10 + 8));
				inflator.inflate(bytes_0);
				inflator.reset();
			} catch (final Exception exception_0) {
				inflator.reset();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	public static void method552() {
		Widget.aNodeCache2.reset();
		Widget.aNodeCache4.reset();
		Widget.aNodeCache3.reset();
		Widget.aNodeCache5.reset();
	}

}
