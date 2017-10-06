public class XGrandExchangeOffer {

	static Widget aWidget3;
	byte progress;
	public int price;
	public int totalQuantity;
	public int itemId;
	public int quantitySold;
	public int spent;

	public XGrandExchangeOffer() {
	}

	public XGrandExchangeOffer(final Buffer buffer_0, final boolean bool_0) {
		progress = buffer_0.readByte();
		itemId = buffer_0.readUnsignedShort();
		price = buffer_0.readInt();
		totalQuantity = buffer_0.readInt();
		quantitySold = buffer_0.readInt();
		spent = buffer_0.readInt();
	}

	void method108(final int int_0) {
		progress &= 0xFFFFFFF8;
		progress = (byte) (progress | (int_0 & 0x7));
	}

	void method109(final int int_0) {
		progress &= 0xFFFFFFF7;
		if (int_0 == 1) {
			progress = (byte) (progress | 0x8);
		}

	}

	public int method110() {
		return (progress & 0x8) == 8 ? 1 : 0;
	}

	public int method111() {
		return progress & 0x7;
	}

	static int method112(final int int_0, int int_1, final int int_2) {
		if (int_2 > 179) {
			int_1 /= 2;
		}

		if (int_2 > 192) {
			int_1 /= 2;
		}

		if (int_2 > 217) {
			int_1 /= 2;
		}

		if (int_2 > 243) {
			int_1 /= 2;
		}

		final int int_3 = ((int_0 / 4) << 10) + ((int_1 / 32) << 7) + (int_2 / 2);
		return int_3;
	}

	public static String method113(final String string_0) {
		final int int_0 = string_0.length();
		final char[] chars_0 = new char[int_0];
		byte byte_0 = 2;

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			char char_0 = string_0.charAt(int_1);
			if (byte_0 == 0) {
				char_0 = Character.toLowerCase(char_0);
			} else if ((byte_0 == 2) || Character.isUpperCase(char_0)) {
				char char_1;
				if ((char_0 != 181) && (char_0 != 131)) {
					char_1 = Character.toTitleCase(char_0);
				} else {
					char_1 = char_0;
				}

				char_0 = char_1;
			}

			if (Character.isLetter(char_0)) {
				byte_0 = 0;
			} else if ((char_0 != 46) && (char_0 != 63) && (char_0 != 33)) {
				if (Character.isSpaceChar(char_0)) {
					if (byte_0 != 2) {
						byte_0 = 1;
					}
				} else {
					byte_0 = 1;
				}
			} else {
				byte_0 = 2;
			}

			chars_0[int_1] = char_0;
		}

		return new String(chars_0);
	}

	static final void method114(final int int_0, final int int_1, final int int_2) {
		int int_3;
		for (int_3 = 0; int_3 < 8; int_3++) {
			for (int int_4 = 0; int_4 < 8; int_4++) {
				Class18.tileHeights[int_0][int_3 + int_1][int_4 + int_2] = 0;
			}
		}

		if (int_1 > 0) {
			for (int_3 = 1; int_3 < 8; int_3++) {
				Class18.tileHeights[int_0][int_1][int_3 + int_2] = Class18.tileHeights[int_0][int_1 - 1][int_3 + int_2];
			}
		}

		if (int_2 > 0) {
			for (int_3 = 1; int_3 < 8; int_3++) {
				Class18.tileHeights[int_0][int_3 + int_1][int_2] = Class18.tileHeights[int_0][int_3 + int_1][int_2 - 1];
			}
		}

		if ((int_1 > 0) && (Class18.tileHeights[int_0][int_1 - 1][int_2] != 0)) {
			Class18.tileHeights[int_0][int_1][int_2] = Class18.tileHeights[int_0][int_1 - 1][int_2];
		} else {
			if ((int_2 > 0) && (Class18.tileHeights[int_0][int_1][int_2 - 1] != 0)) {
				Class18.tileHeights[int_0][int_1][int_2] = Class18.tileHeights[int_0][int_1][int_2 - 1];
				return;
			}

			if ((int_1 > 0) && (int_2 > 0) && (Class18.tileHeights[int_0][int_1 - 1][int_2 - 1] != 0)) {
				Class18.tileHeights[int_0][int_1][int_2] = Class18.tileHeights[int_0][int_1 - 1][int_2 - 1];
				return;
			}
		}

	}

}
