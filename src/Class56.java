import java.io.IOException;

public class Class56 {

	static boolean aBool16;
	static int anInt143;
	static int anInt144;
	static boolean aBool17;
	public static int anInt145;
	public static int[] anIntArray35;
	static int anInt146;
	static int anInt147;
	static int anInt148;
	static int anInt149;

	static {
		aBool16 = false;
		anInt143 = 0;
		anInt144 = 0;
		aBool17 = false;
		anInt145 = 0;
		anIntArray35 = new int[1000];
	}

	static final int method347() {
		return Client.menuOptionCount <= 0 ? -1
				: (Client.aBool77 && KeyFocusListener.aBoolArray3[81] && (Client.anInt654 != -1) ? Client.anInt654
						: Client.menuOptionCount - 1);
	}

	static final void flush(final boolean bool_0) {
		Class6.method105();
		++Client.audioEffectCount;
		if ((Client.audioEffectCount >= 50) || bool_0) {
			Client.audioEffectCount = 0;
			if (!Client.socketError && (Occluder.rssocket != null)) {
				Client.secretPacketBuffer1.putOpcode(102);

				try {
					Occluder.rssocket.queueForWrite(Client.secretPacketBuffer1.payload, 0,
							Client.secretPacketBuffer1.offset);
					Client.secretPacketBuffer1.offset = 0;
				} catch (final IOException ioexception_0) {
					Client.socketError = true;
					return;
				}
			}

		}
	}

}
