public class Class73_Sub1 extends Class73 {

	int anInt335;
	String aString18;
	short aShort1;

	Class73_Sub1(final String string_0, final int int_0) {
		anInt335 = (int) (Class6.currentTimeMs() / 1000L);
		aString18 = string_0;
		aShort1 = (short) int_0;
	}

	public static int method601(final int int_0, final int int_1) {
		final int int_2 = int_0 >>> 31;
		return ((int_0 + int_2) / int_1) - int_2;
	}

	static MessageNode method602(final int int_0, final int int_1) {
		final ChatLineBuffer chatlinebuffer_0 = (ChatLineBuffer) Class42.chatLineMap.get(Integer.valueOf(int_0));
		return chatlinebuffer_0.method12(int_1);
	}

}
