import java.io.File;
import java.util.Hashtable;

public class Class58 {

	public static boolean aBool18;
	static Hashtable aHashtable1;
	static ModIcon logoSprite;
	public static File aFile3;

	static {
		aBool18 = false;
		aHashtable1 = new Hashtable(16);
	}

	public static byte method380(final char char_0) {
		byte byte_0;
		if (((char_0 <= 0) || (char_0 >= 128)) && ((char_0 < 160) || (char_0 > 255))) {
			if (char_0 == 8364) {
				byte_0 = -128;
			} else if (char_0 == 8218) {
				byte_0 = -126;
			} else if (char_0 == 402) {
				byte_0 = -125;
			} else if (char_0 == 8222) {
				byte_0 = -124;
			} else if (char_0 == 8230) {
				byte_0 = -123;
			} else if (char_0 == 8224) {
				byte_0 = -122;
			} else if (char_0 == 8225) {
				byte_0 = -121;
			} else if (char_0 == 710) {
				byte_0 = -120;
			} else if (char_0 == 8240) {
				byte_0 = -119;
			} else if (char_0 == 352) {
				byte_0 = -118;
			} else if (char_0 == 8249) {
				byte_0 = -117;
			} else if (char_0 == 338) {
				byte_0 = -116;
			} else if (char_0 == 381) {
				byte_0 = -114;
			} else if (char_0 == 8216) {
				byte_0 = -111;
			} else if (char_0 == 8217) {
				byte_0 = -110;
			} else if (char_0 == 8220) {
				byte_0 = -109;
			} else if (char_0 == 8221) {
				byte_0 = -108;
			} else if (char_0 == 8226) {
				byte_0 = -107;
			} else if (char_0 == 8211) {
				byte_0 = -106;
			} else if (char_0 == 8212) {
				byte_0 = -105;
			} else if (char_0 == 732) {
				byte_0 = -104;
			} else if (char_0 == 8482) {
				byte_0 = -103;
			} else if (char_0 == 353) {
				byte_0 = -102;
			} else if (char_0 == 8250) {
				byte_0 = -101;
			} else if (char_0 == 339) {
				byte_0 = -100;
			} else if (char_0 == 382) {
				byte_0 = -98;
			} else if (char_0 == 376) {
				byte_0 = -97;
			} else {
				byte_0 = 63;
			}
		} else {
			byte_0 = (byte) char_0;
		}

		return byte_0;
	}

	static boolean decodeRegionHash(final PacketBuffer packetbuffer_0, final int int_0) {
		final int int_1 = packetbuffer_0.getBits(2);
		int int_2;
		int int_3;
		int int_5;
		int int_6;
		int int_7;
		int int_8;
		if (int_1 == 0) {
			if (packetbuffer_0.getBits(1) != 0) {
				decodeRegionHash(packetbuffer_0, int_0);
			}

			int_2 = packetbuffer_0.getBits(13);
			int_3 = packetbuffer_0.getBits(13);
			final boolean bool_0 = packetbuffer_0.getBits(1) == 1;
			if (bool_0) {
				Class40.anIntArray22[++Class40.anInt96 - 1] = int_0;
			}

			if (Client.cachedPlayers[int_0] != null) {
				throw new RuntimeException();
			} else {
				final Player player_0 = Client.cachedPlayers[int_0] = new Player();
				player_0.anInt637 = int_0;
				if (Class40.aBufferArray1[int_0] != null) {
					player_0.decodeApperance(Class40.aBufferArray1[int_0]);
				}

				player_0.orientation = Class40.anIntArray20[int_0];
				player_0.interacting = Class40.anIntArray21[int_0];
				int_5 = Class40.anIntArray19[int_0];
				int_6 = int_5 >> 28;
				int_7 = (int_5 >> 14) & 0xFF;
				int_8 = int_5 & 0xFF;
				player_0.aByteArray21[0] = Class40.aByteArray5[int_0];
				player_0.anInt632 = (byte) int_6;
				player_0.method1032(((int_7 << 13) + int_2) - AClass2.baseX,
						((int_8 << 13) + int_3) - AClass4_Sub1.baseY);
				player_0.aBool74 = false;
				return true;
			}
		} else if (int_1 == 1) {
			int_2 = packetbuffer_0.getBits(2);
			int_3 = Class40.anIntArray19[int_0];
			Class40.anIntArray19[int_0] = ((((int_3 >> 28) + int_2) & 0x3) << 28) + (int_3 & 0xFFFFFFF);
			return false;
		} else {
			int int_4;
			int int_9;
			if (int_1 == 2) {
				int_2 = packetbuffer_0.getBits(5);
				int_3 = int_2 >> 3;
				int_4 = int_2 & 0x7;
				int_9 = Class40.anIntArray19[int_0];
				int_5 = ((int_9 >> 28) + int_3) & 0x3;
				int_6 = (int_9 >> 14) & 0xFF;
				int_7 = int_9 & 0xFF;
				if (int_4 == 0) {
					--int_6;
					--int_7;
				}

				if (int_4 == 1) {
					--int_7;
				}

				if (int_4 == 2) {
					++int_6;
					--int_7;
				}

				if (int_4 == 3) {
					--int_6;
				}

				if (int_4 == 4) {
					++int_6;
				}

				if (int_4 == 5) {
					--int_6;
					++int_7;
				}

				if (int_4 == 6) {
					++int_7;
				}

				if (int_4 == 7) {
					++int_6;
					++int_7;
				}

				Class40.anIntArray19[int_0] = (int_6 << 14) + (int_5 << 28) + int_7;
				return false;
			} else {
				int_2 = packetbuffer_0.getBits(18);
				int_3 = int_2 >> 16;
				int_4 = (int_2 >> 8) & 0xFF;
				int_9 = int_2 & 0xFF;
				int_5 = Class40.anIntArray19[int_0];
				int_6 = ((int_5 >> 28) + int_3) & 0x3;
				int_7 = (int_4 + (int_5 >> 14)) & 0xFF;
				int_8 = (int_5 + int_9) & 0xFF;
				Class40.anIntArray19[int_0] = (int_7 << 14) + (int_6 << 28) + int_8;
				return false;
			}
		}
	}

}
