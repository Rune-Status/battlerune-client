public class WorldMapType3 implements WorldMapSectionBase {

	int anInt249;
	int anInt250;
	int anInt251;
	int anInt252;
	int anInt253;
	int anInt254;
	int anInt255;
	int anInt256;
	int anInt257;
	int anInt258;
	int anInt259;
	int anInt260;
	int anInt261;
	int anInt262;

	@Override
	public boolean method5(final int int_0, final int int_1) {
		return (int_0 >= ((anInt250 << 6) + (anInt251 << 3))) && (int_0 <= ((anInt250 << 6) + (anInt253 << 3) + 7))
				&& (int_1 >= ((anInt256 << 6) + (anInt258 << 3))) && (int_1 <= ((anInt256 << 6) + (anInt259 << 3) + 7));
	}

	@Override
	public boolean method6(final int int_0, final int int_1, final int int_2) {
		return (int_0 >= anInt249) && (int_0 < (anInt252 + anInt249)) ? (int_1 >= ((anInt254 << 6) + (anInt255 << 3)))
				&& (int_1 <= ((anInt257 << 3) + (anInt254 << 6) + 7)) && (int_2 >= ((anInt261 << 6) + (anInt260 << 3)))
				&& (int_2 <= ((anInt262 << 3) + (anInt261 << 6) + 7)) : false;
	}

	@Override
	public void method7(final WorldMapData worldmapdata_0) {
		if (worldmapdata_0.anInt110 > anInt250) {
			worldmapdata_0.anInt110 = anInt250;
		}

		if (worldmapdata_0.anInt108 < anInt250) {
			worldmapdata_0.anInt108 = anInt250;
		}

		if (worldmapdata_0.anInt111 > anInt256) {
			worldmapdata_0.anInt111 = anInt256;
		}

		if (worldmapdata_0.anInt109 < anInt256) {
			worldmapdata_0.anInt109 = anInt256;
		}

	}

	@Override
	public Coordinates method8(final int int_0, final int int_1) {
		if (!method5(int_0, int_1)) {
			return null;
		} else {
			final int int_2 = ((anInt254 * 64) - (anInt250 * 64)) + int_0 + ((anInt255 * 8) - (anInt251 * 8));
			final int int_3 = ((((anInt260 * 8) - (anInt258 * 8)) + (anInt261 * 64)) - (anInt256 * 64)) + int_1;
			return new Coordinates(anInt249, int_2, int_3);
		}
	}

	@Override
	public int[] method9(final int int_0, final int int_1, final int int_2) {
		if (!method6(int_0, int_1, int_2)) {
			return null;
		} else {
			final int[] ints_0 = new int[] {
					((((anInt251 * 8) - (anInt255 * 8)) + (anInt250 * 64)) - (anInt254 * 64)) + int_1,
					((anInt258 * 8) - (anInt260 * 8)) + int_2 + ((anInt256 * 64) - (anInt261 * 64)) };
			return ints_0;
		}
	}

	@Override
	public void method10(final Buffer buffer_0) {
		anInt249 = buffer_0.readUnsignedByte();
		anInt252 = buffer_0.readUnsignedByte();
		anInt254 = buffer_0.readUnsignedShort();
		anInt255 = buffer_0.readUnsignedByte();
		anInt257 = buffer_0.readUnsignedByte();
		anInt261 = buffer_0.readUnsignedShort();
		anInt260 = buffer_0.readUnsignedByte();
		anInt262 = buffer_0.readUnsignedByte();
		anInt250 = buffer_0.readUnsignedShort();
		anInt251 = buffer_0.readUnsignedByte();
		anInt253 = buffer_0.readUnsignedByte();
		anInt256 = buffer_0.readUnsignedShort();
		anInt258 = buffer_0.readUnsignedByte();
		anInt259 = buffer_0.readUnsignedByte();
		method547();
	}

	void method547() {
	}

	static boolean isFriended(final String string_0, final boolean bool_0) {
		if (string_0 == null) {
			return false;
		} else {
			final String string_1 = Class75.method446(string_0, Class59.aClass110_1);

			for (int int_0 = 0; int_0 < Client.friendCount; int_0++) {
				if (string_1.equalsIgnoreCase(Class75.method446(Client.friends[int_0].name, Class59.aClass110_1))
						&& (!bool_0 || (Client.friends[int_0].world != 0))) {
					return true;
				}
			}

			if (string_1.equalsIgnoreCase(Class75.method446(Script.localPlayer.name, Class59.aClass110_1))) {
				return true;
			} else {
				return false;
			}
		}
	}

}
