public class FrameMap extends Node {

	static IndexDataBase item_ref;
	static Thread aThread1;
	int anInt397;
	int count;
	int[] types;
	int[][] list;

	FrameMap(final int int_0, final byte[] bytes_0) {
		anInt397 = int_0;
		final Buffer buffer_0 = new Buffer(bytes_0);
		count = buffer_0.readUnsignedByte();
		types = new int[count];
		list = new int[count][];

		int int_1;
		for (int_1 = 0; int_1 < count; int_1++) {
			types[int_1] = buffer_0.readUnsignedByte();
		}

		for (int_1 = 0; int_1 < count; int_1++) {
			list[int_1] = new int[buffer_0.readUnsignedByte()];
		}

		for (int_1 = 0; int_1 < count; int_1++) {
			for (int int_2 = 0; int_2 < list[int_1].length; int_2++) {
				list[int_1][int_2] = buffer_0.readUnsignedByte();
			}
		}

	}

	public static void method654() {
		try {
			Class57.aCacheFile2.method533();

			for (int int_0 = 0; int_0 < Class57.anInt150; int_0++) {
				Class57.aCacheFileArray1[int_0].method533();
			}

			Class57.aCacheFile3.method533();
			Class57.aCacheFile1.method533();
		} catch (final Exception exception_0) {
			;
		}
	}

	static int method655(final int int_0) {
		final MessageNode messagenode_0 = (MessageNode) Class42.aClass70_1.method419(int_0);
		return messagenode_0 == null ? -1
				: (messagenode_0.next == Class42.aClass79_1.aCacheableNode3 ? -1
						: ((MessageNode) messagenode_0.next).anInt538);
	}

}
