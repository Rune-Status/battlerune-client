public abstract class AClass4 extends Node {

	static int myWorldPort;
	static int[][][] anIntArrayArrayArray1;

	abstract void method611();

	static void resetItemTable(final int int_0) {
		final XItemContainer xitemcontainer_0 = (XItemContainer) XItemContainer.itemContainers.get(int_0);
		if (xitemcontainer_0 != null) {
			for (int int_1 = 0; int_1 < xitemcontainer_0.itemIds.length; int_1++) {
				xitemcontainer_0.itemIds[int_1] = -1;
				xitemcontainer_0.stackSizes[int_1] = 0;
			}

		}
	}

	public static Enum method612(final int int_0) {
		Enum enum_0 = (Enum) Enum.aNodeCache11.get(int_0);
		if (enum_0 != null) {
			return enum_0;
		} else {
			final byte[] bytes_0 = VarPlayerType.anIndexDataBase30.getConfigData(8, int_0);
			enum_0 = new Enum();
			if (bytes_0 != null) {
				enum_0.decode(new Buffer(bytes_0));
			}

			Enum.aNodeCache11.put(enum_0, int_0);
			return enum_0;
		}
	}

}
