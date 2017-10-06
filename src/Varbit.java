public class Varbit extends CacheableNode {

	public static NodeCache varbits;
	public static IndexDataBase varbit_ref;
	public int configId;
	public int leastSignificantBit;
	public int mostSignificantBit;

	static {
		varbits = new NodeCache(64);
	}

	void method796(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			configId = buffer_0.readUnsignedShort();
			leastSignificantBit = buffer_0.readUnsignedByte();
			mostSignificantBit = buffer_0.readUnsignedByte();
		}

	}

	public void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method796(buffer_0, int_0);
		}
	}

}
