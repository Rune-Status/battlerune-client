public class Class48 {

	String aString7;
	String aString8;
	public final long aLong4;
	public final int anInt105;
	public final XGrandExchangeOffer aXGrandExchangeOffer1;

	Class48(final Buffer buffer_0, final byte byte_0, final int int_0) {
		aString8 = buffer_0.readString();
		aString7 = buffer_0.readString();
		anInt105 = buffer_0.readUnsignedShort();
		aLong4 = buffer_0.readLong();
		final int int_1 = buffer_0.readInt();
		final int int_2 = buffer_0.readInt();
		aXGrandExchangeOffer1 = new XGrandExchangeOffer();
		aXGrandExchangeOffer1.method108(2);
		aXGrandExchangeOffer1.method109(byte_0);
		aXGrandExchangeOffer1.price = int_1;
		aXGrandExchangeOffer1.totalQuantity = int_2;
		aXGrandExchangeOffer1.quantitySold = 0;
		aXGrandExchangeOffer1.spent = 0;
		aXGrandExchangeOffer1.itemId = int_0;
	}

	public String method276() {
		return aString8;
	}

	public String method277() {
		return aString7;
	}

	protected static final void method278() {
		Class15.timer.method557();

		int int_0;
		for (int_0 = 0; int_0 < 32; int_0++) {
			GameEngine.aLongArray3[int_0] = 0L;
		}

		for (int_0 = 0; int_0 < 32; int_0++) {
			GameEngine.aLongArray2[int_0] = 0L;
		}

		Class105.anInt215 = 0;
	}

	static int method279(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1) {
		int int_0 = 0;
		if (indexdatabase_0.method432("title.jpg", "")) {
			++int_0;
		}

		if (indexdatabase_1.method432("logo", "")) {
			++int_0;
		}

		if (indexdatabase_1.method432("logo_deadman_mode", "")) {
			++int_0;
		}

		if (indexdatabase_1.method432("titlebox", "")) {
			++int_0;
		}

		if (indexdatabase_1.method432("titlebutton", "")) {
			++int_0;
		}

		if (indexdatabase_1.method432("runes", "")) {
			++int_0;
		}

		if (indexdatabase_1.method432("title_mute", "")) {
			++int_0;
		}

		if (indexdatabase_1.method432("options_radio_buttons,0", "")) {
			++int_0;
		}

		if (indexdatabase_1.method432("options_radio_buttons,2", "")) {
			++int_0;
		}

		indexdatabase_1.method432("sl_back", "");
		indexdatabase_1.method432("sl_flags", "");
		indexdatabase_1.method432("sl_arrows", "");
		indexdatabase_1.method432("sl_stars", "");
		indexdatabase_1.method432("sl_button", "");
		return int_0;
	}

}
