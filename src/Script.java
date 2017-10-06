public class Script extends CacheableNode {

	static NodeCache aNodeCache19;
	static Player localPlayer;
	int[] instructions;
	int[] intOperands;
	int localIntCount;
	int localStringCount;
	String[] stringOperands;
	int intStackCount;
	int stringStackCount;
	Class70[] switches;

	static {
		aNodeCache19 = new NodeCache(128);
	}

	Class70[] method843(final int int_0) {
		return new Class70[int_0];
	}

	public static int method844(final int int_0, final Class91 class91_0) {
		return ((int_0 + 40000) << 8) + class91_0.anInt199;
	}

	static final void method845(final String string_0) {
		if (string_0 != null) {
			final String string_1 = Class75.method446(string_0, Class59.aClass110_1);
			if (string_1 != null) {
				for (int int_0 = 0; int_0 < Client.ignoreCount; int_0++) {
					final Ignore ignore_0 = Client.ignores[int_0];
					final String string_2 = ignore_0.name;
					final String string_3 = Class75.method446(string_2, Class59.aClass110_1);
					if (Class6.method107(string_0, string_1, string_2, string_3)) {
						--Client.ignoreCount;

						for (int int_1 = int_0; int_1 < Client.ignoreCount; int_1++) {
							Client.ignores[int_1] = Client.ignores[int_1 + 1];
						}

						Client.anInt697 = Client.anInt692;
						Client.secretPacketBuffer1.putOpcode(192);
						Client.secretPacketBuffer1.putByte(DecorativeObject.getLength(string_0));
						Client.secretPacketBuffer1.putString(string_0);
						break;
					}
				}

			}
		}
	}

}
