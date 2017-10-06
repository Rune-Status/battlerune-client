public class VarPlayerType extends CacheableNode {

	static NodeCache varplayers;
	public static int anInt537;
	public static IndexDataBase anIndexDataBase30;
	public int configType;

	static {
		varplayers = new NodeCache(64);
	}

	VarPlayerType() {
		configType = 0;
	}

	void decode(final Buffer buffer_0, final int int_0) {
		if (int_0 == 5) {
			configType = buffer_0.readUnsignedShort();
		}

	}

	void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			this.decode(buffer_0, int_0);
		}
	}

	public static String method878(final CharSequence charsequence_0) {
		String string_0 = PendingSpawn.method638(Node_Sub1.method610(charsequence_0));
		if (string_0 == null) {
			string_0 = "";
		}

		return string_0;
	}

}
