public class CacheableNode_Sub4 extends CacheableNode {

	static NodeCache aNodeCache16;
	static int anInt515;
	public static IndexDataBase anIndexDataBase25;
	char aChar2;
	boolean aBool55;
	public int anInt516;
	public String aString30;

	static {
		aNodeCache16 = new NodeCache(64);
	}

	CacheableNode_Sub4() {
		aBool55 = true;
	}

	void method824(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			aChar2 = Class107.method502(buffer_0.readByte());
		} else {
			if (int_0 == 2) {
				anInt516 = buffer_0.readInt();
				return;
			}

			if (int_0 == 4) {
				aBool55 = false;
				return;
			}

			if (int_0 == 5) {
				aString30 = buffer_0.readString();
				return;
			}
		}

	}

	public boolean method825() {
		return aChar2 == 115;
	}

	void method826() {
	}

	void method827(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method824(buffer_0, int_0);
		}
	}

}
