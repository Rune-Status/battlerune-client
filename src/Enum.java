public class Enum extends CacheableNode {

	static NodeCache aNodeCache11;
	public String defaultString;
	public char keyType;
	public char valType;
	public int size;
	public int defaultInt;
	public int[] keys;
	public String[] stringVals;
	public int[] intVals;

	static {
		aNodeCache11 = new NodeCache(64);
	}

	Enum() {
		defaultString = "null";
		size = 0;
	}

	void method806(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			keyType = (char) buffer_0.readUnsignedByte();
		} else {
			if (int_0 == 2) {
				valType = (char) buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 3) {
				defaultString = buffer_0.readString();
				return;
			}

			if (int_0 == 4) {
				defaultInt = buffer_0.readInt();
				return;
			}

			int int_1;
			if (int_0 == 5) {
				size = buffer_0.readUnsignedShort();
				keys = new int[size];
				stringVals = new String[size];

				for (int_1 = 0; int_1 < size; int_1++) {
					keys[int_1] = buffer_0.readInt();
					stringVals[int_1] = buffer_0.readString();
				}

				return;
			}

			if (int_0 == 6) {
				size = buffer_0.readUnsignedShort();
				keys = new int[size];
				intVals = new int[size];

				for (int_1 = 0; int_1 < size; int_1++) {
					keys[int_1] = buffer_0.readInt();
					intVals[int_1] = buffer_0.readInt();
				}
			}
		}

	}

	void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method806(buffer_0, int_0);
		}
	}

}
