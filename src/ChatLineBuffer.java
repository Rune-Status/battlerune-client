public class ChatLineBuffer {

	public static int sampleRate;
	MessageNode[] lines;
	int length;

	ChatLineBuffer() {
		lines = new MessageNode[100];
	}

	MessageNode method11(final int int_0, final String string_0, final String string_1, final String string_2) {
		MessageNode messagenode_0 = lines[99];

		for (int int_1 = length; int_1 > 0; --int_1) {
			if (int_1 != 100) {
				lines[int_1] = lines[int_1 - 1];
			}
		}

		if (messagenode_0 == null) {
			messagenode_0 = new MessageNode(int_0, string_0, string_2, string_1);
		} else {
			messagenode_0.unlink();
			messagenode_0.unlinkDual();
			messagenode_0.method879(int_0, string_0, string_2, string_1);
		}

		lines[0] = messagenode_0;
		if (length < 100) {
			++length;
		}

		return messagenode_0;
	}

	MessageNode method12(final int int_0) {
		return (int_0 >= 0) && (int_0 < length) ? lines[int_0] : null;
	}

	int method13() {
		return length;
	}

	public static void method14(final String[] strings_0, final short[] shorts_0, final int int_0, final int int_1) {
		if (int_0 < int_1) {
			final int int_2 = (int_1 + int_0) / 2;
			int int_3 = int_0;
			final String string_0 = strings_0[int_2];
			strings_0[int_2] = strings_0[int_1];
			strings_0[int_1] = string_0;
			final short short_0 = shorts_0[int_2];
			shorts_0[int_2] = shorts_0[int_1];
			shorts_0[int_1] = short_0;

			for (int int_4 = int_0; int_4 < int_1; int_4++) {
				if ((string_0 == null)
						|| ((strings_0[int_4] != null) && (strings_0[int_4].compareTo(string_0) < (int_4 & 0x1)))) {
					final String string_1 = strings_0[int_4];
					strings_0[int_4] = strings_0[int_3];
					strings_0[int_3] = string_1;
					final short short_1 = shorts_0[int_4];
					shorts_0[int_4] = shorts_0[int_3];
					shorts_0[int_3++] = short_1;
				}
			}

			strings_0[int_1] = strings_0[int_3];
			strings_0[int_3] = string_0;
			shorts_0[int_1] = shorts_0[int_3];
			shorts_0[int_3] = short_0;
			method14(strings_0, shorts_0, int_0, int_3 - 1);
			method14(strings_0, shorts_0, int_3 + 1, int_1);
		}
	}

}
