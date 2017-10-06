public class CacheableNode_Sub6 extends CacheableNode {

	static NodeCache aNodeCache18;
	public static IndexDataBase anIndexDataBase27;
	public boolean aBool57;

	static {
		aNodeCache18 = new NodeCache(64);
	}

	CacheableNode_Sub6() {
		aBool57 = false;
	}

	void method832(final Buffer buffer_0, final int int_0) {
		if (int_0 == 2) {
			aBool57 = true;
		}

	}

	void method833(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method832(buffer_0, int_0);
		}
	}

}
