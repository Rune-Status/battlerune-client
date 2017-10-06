import java.net.URL;

public class Class80 {

	public static IndexDataBase anIndexDataBase7;

	static final byte[] decodeContainer(final byte[] bytes_0) {
		final Buffer buffer_0 = new Buffer(bytes_0);
		final int int_0 = buffer_0.readUnsignedByte();
		final int int_1 = buffer_0.readInt();
		if ((int_1 >= 0) && ((IndexDataBase.anInt177 == 0) || (int_1 <= IndexDataBase.anInt177))) {
			if (int_0 == 0) {
				final byte[] bytes_1 = new byte[int_1];
				buffer_0.readBytes(bytes_1, 0, int_1);
				return bytes_1;
			} else {
				final int int_2 = buffer_0.readInt();
				if ((int_2 < 0) || ((IndexDataBase.anInt177 != 0) && (int_2 > IndexDataBase.anInt177))) {
					throw new RuntimeException();
				} else {
					final byte[] bytes_2 = new byte[int_2];
					if (int_0 == 1) {
						Class64.method388(bytes_2, int_2, bytes_0, int_1, 9);
					} else {
						IndexDataBase.gzip.decompress(buffer_0, bytes_2);
					}

					return bytes_2;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	static boolean loadWorlds() {
		try {
			if (Class54.worldServersDownload == null) {
				Class54.worldServersDownload = new Class25(GameEngine.taskManager, new URL(MouseInput.aString14));
			} else {
				final byte[] bytes_0 = Class54.worldServersDownload.method218();
				if (bytes_0 != null) {
					final Buffer buffer_0 = new Buffer(bytes_0);
					World.worldCount = buffer_0.readUnsignedShort();
					World.worldList = new World[World.worldCount];

					World world_0;
					for (int int_0 = 0; int_0 < World.worldCount; world_0.index = int_0++) {
						world_0 = World.worldList[int_0] = new World();
						world_0.anInt227 = buffer_0.readUnsignedShort();
						world_0.mask = buffer_0.readInt();
						world_0.address = buffer_0.readString();
						world_0.activity = buffer_0.readString();
						world_0.location = buffer_0.readUnsignedByte();
						world_0.playerCount = buffer_0.readShort();
					}

					PacketBuffer.method842(World.worldList, 0, World.worldList.length - 1, World.anIntArray62,
							World.anIntArray61);
					Class54.worldServersDownload = null;
					return true;
				}
			}
		} catch (final Exception exception_0) {
			exception_0.printStackTrace();
			Class54.worldServersDownload = null;
		}

		return false;
	}

	static int method461(final int int_0) {
		final ChatLineBuffer chatlinebuffer_0 = (ChatLineBuffer) Class42.chatLineMap.get(Integer.valueOf(int_0));
		return chatlinebuffer_0 == null ? 0 : chatlinebuffer_0.method13();
	}

}
