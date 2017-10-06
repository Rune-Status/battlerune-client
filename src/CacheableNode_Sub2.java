public class CacheableNode_Sub2 extends CacheableNode {

	public static NodeCache aNodeCache12;
	static int anInt500;
	Class70 aClass70_4;

	static {
		aNodeCache12 = new NodeCache(64);
	}

	void method809(final Buffer buffer_0, final int int_0) {
		if (int_0 == 249) {
			aClass70_4 = World.method526(buffer_0, aClass70_4);
		}

	}

	public int method810(final int int_0, final int int_1) {
		return Timer.method558(aClass70_4, int_0, int_1);
	}

	public String method811(final int int_0, final String string_0) {
		return IndexFile.method70(aClass70_4, int_0, string_0);
	}

	public void method812() {
	}

	public void method813(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method809(buffer_0, int_0);
		}
	}

}
