public class WidgetNode extends Node {

	boolean aBool46;
	int anInt392;
	int owner;

	WidgetNode() {
		aBool46 = false;
	}

	static void sendGameMessage(final int int_0, final String string_0, final String string_1) {
		Class32.addChatMessage(int_0, string_0, string_1, (String) null);
	}

	static int method646() {
		return 9;
	}

	static String method647(String string_0, final boolean bool_0) {
		final String string_1 = bool_0 ? "https://" : "http://";
		if (Client.socketType == 1) {
			string_0 = string_0 + "-wtrc";
		} else if (Client.socketType == 2) {
			string_0 = string_0 + "-wtqa";
		} else if (Client.socketType == 3) {
			string_0 = string_0 + "-wtwip";
		} else if (Client.socketType == 5) {
			string_0 = string_0 + "-wti";
		} else if (Client.socketType == 4) {
			string_0 = "local";
		}

		String string_2 = "";
		if (AClass4_Sub2.sessionToken != null) {
			string_2 = "/p=" + AClass4_Sub2.sessionToken;
		}

		final String string_3 = "runescape.com";
		return string_1 + string_0 + "." + string_3 + "/l=" + Client.languageId + "/a=" + Class51.anInt112 + string_2
				+ "/";
	}

}
