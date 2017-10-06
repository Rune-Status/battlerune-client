public class World {

	static int worldCount;
	static int anInt226;
	static int[] anIntArray61;
	static int[] anIntArray62;
	static IndexFile anIndexFile1;
	static World[] worldList;
	static int[] anIntArray63;
	int mask;
	int index;
	int playerCount;
	int anInt227;
	String address;
	String activity;
	int location;

	static {
		worldCount = 0;
		anInt226 = 0;
		anIntArray61 = new int[] { 1, 1, 1, 1 };
		anIntArray62 = new int[] { 0, 1, 2, 3 };
	}

	boolean method519() {
		return (0x1 & mask) != 0;
	}

	boolean method520() {
		return (0x2000000 & mask) != 0;
	}

	boolean method521() {
		return (0x20000000 & mask) != 0;
	}

	boolean method522() {
		return (0x4 & mask) != 0;
	}

	boolean method523() {
		return (0x8 & mask) != 0;
	}

	boolean method524() {
		return (0x2 & mask) != 0;
	}

	static final void method525() {
		boolean bool_0 = false;

		while (!bool_0) {
			bool_0 = true;

			for (int int_0 = 0; int_0 < (Client.menuOptionCount - 1); int_0++) {
				if ((Client.menuTypes[int_0] < 1000) && (Client.menuTypes[int_0 + 1] > 1000)) {
					final String string_0 = Client.menuTargets[int_0];
					Client.menuTargets[int_0] = Client.menuTargets[int_0 + 1];
					Client.menuTargets[int_0 + 1] = string_0;
					final String string_1 = Client.menuOptions[int_0];
					Client.menuOptions[int_0] = Client.menuOptions[int_0 + 1];
					Client.menuOptions[int_0 + 1] = string_1;
					int int_1 = Client.menuTypes[int_0];
					Client.menuTypes[int_0] = Client.menuTypes[int_0 + 1];
					Client.menuTypes[int_0 + 1] = int_1;
					int_1 = Client.menuActionParams0[int_0];
					Client.menuActionParams0[int_0] = Client.menuActionParams0[int_0 + 1];
					Client.menuActionParams0[int_0 + 1] = int_1;
					int_1 = Client.menuActionParams1[int_0];
					Client.menuActionParams1[int_0] = Client.menuActionParams1[int_0 + 1];
					Client.menuActionParams1[int_0 + 1] = int_1;
					int_1 = Client.menuIdentifiers[int_0];
					Client.menuIdentifiers[int_0] = Client.menuIdentifiers[int_0 + 1];
					Client.menuIdentifiers[int_0 + 1] = int_1;
					if (Client.anInt654 != -1) {
						if (int_0 == Client.anInt654) {
							Client.anInt654 = int_0 + 1;
						} else if ((1 + int_0) == Client.anInt654) {
							Client.anInt654 = int_0;
						}
					}

					bool_0 = false;
				}
			}
		}

	}

	static final Class70 method526(final Buffer buffer_0, Class70 class70_0) {
		final int int_0 = buffer_0.readUnsignedByte();
		int int_1;
		if (class70_0 == null) {
			int_1 = RuntimeException_Sub1.method891(int_0);
			class70_0 = new Class70(int_1);
		}

		for (int_1 = 0; int_1 < int_0; int_1++) {
			final boolean bool_0 = buffer_0.readUnsignedByte() == 1;
			final int int_2 = buffer_0.read24BitInt();
			Object object_0;
			if (bool_0) {
				object_0 = new Node_Sub3(buffer_0.readString());
			} else {
				object_0 = new WidgetConfig(buffer_0.readInt());
			}

			class70_0.method421((Node) object_0, (long) int_2);
		}

		return class70_0;
	}

	static void method527() {
		synchronized (Class92.anObject2) {
			if (Class92.anInt202 == 0) {
				FrameMap.aThread1 = new Thread(new Class92());
				FrameMap.aThread1.setDaemon(true);
				FrameMap.aThread1.start();
				FrameMap.aThread1.setPriority(5);
			}

			Class92.anInt202 = 600;
		}
	}

	static void method528() {
		if (Class80.loadWorlds()) {
			Class26.worldSelectShown = true;
		}

	}

}
