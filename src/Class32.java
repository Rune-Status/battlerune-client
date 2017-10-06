import java.util.Comparator;

final class Class32 implements Comparator {

	static String host;
	static int anInt91;
	static long aLong3;
	static int[] anIntArray15;

	int method231(final Class48 class48_0, final Class48 class48_1) {
		return class48_0.method276().compareTo(class48_1.method276());
	}

	@Override
	public int compare(final Object object_0, final Object object_1) {
		return method231((Class48) object_0, (Class48) object_1);
	}

	@Override
	public boolean equals(final Object object_0) {
		return super.equals(object_0);
	}

	public static void method232() {
		Class108.anIntArray56 = null;
		Class12.offsetsY = null;
		Class108.anIntArray57 = null;
		Class37.anIntArray16 = null;
		Class108.anIntArray58 = null;
		Class66.spritePixels = null;
	}

	public static void method233() {
		VarPlayerType.varplayers.reset();
	}

	static void addChatMessage(final int int_0, final String string_0, final String string_1, final String string_2) {
		ChatLineBuffer chatlinebuffer_0 = (ChatLineBuffer) Class42.chatLineMap.get(Integer.valueOf(int_0));
		if (chatlinebuffer_0 == null) {
			chatlinebuffer_0 = new ChatLineBuffer();
			Class42.chatLineMap.put(Integer.valueOf(int_0), chatlinebuffer_0);
		}

		final MessageNode messagenode_0 = chatlinebuffer_0.method11(int_0, string_0, string_1, string_2);
		Class42.aClass70_1.method421(messagenode_0, messagenode_0.anInt538);
		Class42.aClass79_1.method459(messagenode_0);
		Client.anInt751 = Client.anInt692;
	}

}
