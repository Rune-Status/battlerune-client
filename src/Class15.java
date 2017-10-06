public class Class15 implements WorldMapSectionBase {

	static Timer timer;
	static long aLong1;
	static int anInt58;
	int anInt59;
	int anInt60;
	int anInt61;
	int anInt62;
	int anInt63;
	int anInt64;
	int anInt65;
	int anInt66;
	int anInt67;
	int anInt68;

	@Override
	public boolean method5(final int int_0, final int int_1) {
		return (int_0 >= ((anInt60 << 6) + (anInt61 << 3))) && (int_0 <= ((anInt60 << 6) + (anInt61 << 3) + 7))
				&& (int_1 >= ((anInt65 << 6) + (anInt66 << 3))) && (int_1 <= ((anInt65 << 6) + (anInt66 << 3) + 7));
	}

	@Override
	public boolean method6(final int int_0, final int int_1, final int int_2) {
		return (int_0 >= anInt59) && (int_0 < (anInt59 + anInt62)) ? (int_1 >= ((anInt63 << 6) + (anInt64 << 3)))
				&& (int_1 <= ((anInt63 << 6) + (anInt64 << 3) + 7)) && (int_2 >= ((anInt67 << 6) + (anInt68 << 3)))
				&& (int_2 <= ((anInt67 << 6) + (anInt68 << 3) + 7)) : false;
	}

	@Override
	public void method7(final WorldMapData worldmapdata_0) {
		if (worldmapdata_0.anInt110 > anInt60) {
			worldmapdata_0.anInt110 = anInt60;
		}

		if (worldmapdata_0.anInt108 < anInt60) {
			worldmapdata_0.anInt108 = anInt60;
		}

		if (worldmapdata_0.anInt111 > anInt65) {
			worldmapdata_0.anInt111 = anInt65;
		}

		if (worldmapdata_0.anInt109 < anInt65) {
			worldmapdata_0.anInt109 = anInt65;
		}

	}

	@Override
	public Coordinates method8(final int int_0, final int int_1) {
		if (!method5(int_0, int_1)) {
			return null;
		} else {
			final int int_2 = ((((anInt64 * 8) - (anInt61 * 8)) + (anInt63 * 64)) - (anInt60 * 64)) + int_0;
			final int int_3 = ((((anInt68 * 8) - (anInt66 * 8)) + (anInt67 * 64)) - (anInt65 * 64)) + int_1;
			return new Coordinates(anInt59, int_2, int_3);
		}
	}

	@Override
	public int[] method9(final int int_0, final int int_1, final int int_2) {
		if (!method6(int_0, int_1, int_2)) {
			return null;
		} else {
			final int[] ints_0 = new int[] {
					((anInt61 * 8) - (anInt64 * 8)) + int_1 + ((anInt60 * 64) - (anInt63 * 64)),
					((anInt66 * 8) - (anInt68 * 8)) + int_2 + ((anInt65 * 64) - (anInt67 * 64)) };
			return ints_0;
		}
	}

	@Override
	public void method10(final Buffer buffer_0) {
		anInt59 = buffer_0.readUnsignedByte();
		anInt62 = buffer_0.readUnsignedByte();
		anInt63 = buffer_0.readUnsignedShort();
		anInt64 = buffer_0.readUnsignedByte();
		anInt67 = buffer_0.readUnsignedShort();
		anInt68 = buffer_0.readUnsignedByte();
		anInt60 = buffer_0.readUnsignedShort();
		anInt61 = buffer_0.readUnsignedByte();
		anInt65 = buffer_0.readUnsignedShort();
		anInt66 = buffer_0.readUnsignedByte();
		method195();
	}

	void method195() {
	}

	static void method196(final Widget widget_0) {
		if (widget_0.loopCycle == Client.anInt648) {
			Client.aBoolArray8[widget_0.boundsIndex] = true;
		}

	}

	static final void method197(int int_0, int int_1, final int int_2) {
		if ((int_0 >= 128) && (int_1 >= 128) && (int_0 <= 13056) && (int_1 <= 13056)) {
			int int_3 = Actor.getTileHeight(int_0, int_1, AClass1_Sub1.plane) - int_2;
			int_0 -= Class13.cameraX;
			int_3 -= XItemContainer.cameraZ;
			int_1 -= Class46.cameraY;
			final int int_4 = Graphics3D.SINE[AClass4_Sub2.cameraPitch];
			final int int_5 = Graphics3D.COSINE[AClass4_Sub2.cameraPitch];
			final int int_6 = Graphics3D.SINE[Friend.cameraYaw];
			final int int_7 = Graphics3D.COSINE[Friend.cameraYaw];
			int int_8 = ((int_6 * int_1) + (int_0 * int_7)) >> 16;
			int_1 = ((int_7 * int_1) - (int_0 * int_6)) >> 16;
			int_0 = int_8;
			int_8 = ((int_3 * int_5) - (int_4 * int_1)) >> 16;
			int_1 = ((int_5 * int_1) + (int_3 * int_4)) >> 16;
			if (int_1 >= 50) {
				Client.screenY = ((int_0 * Client.scale) / int_1) + (Client.viewportHeight / 2);
				Client.screenX = ((int_8 * Client.scale) / int_1) + (Client.viewportWidth / 2);
			} else {
				Client.screenY = -1;
				Client.screenX = -1;
			}
		} else {
			Client.screenY = -1;
			Client.screenX = -1;
		}
	}

}
