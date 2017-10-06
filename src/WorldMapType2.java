public class WorldMapType2 implements WorldMapSectionBase {

	public static int anInt241;
	static IndexData anIndexData4;
	static int anInt242;
	static int intStackSize;
	int anInt243;
	int anInt244;
	int anInt245;
	int anInt246;
	int anInt247;
	int anInt248;

	@Override
	public boolean method5(final int int_0, final int int_1) {
		return ((int_0 >> 6) == anInt244) && ((int_1 >> 6) == anInt246);
	}

	@Override
	public boolean method6(final int int_0, final int int_1, final int int_2) {
		return (int_0 >= anInt243) && (int_0 < (anInt245 + anInt243))
				? ((int_1 >> 6) == anInt247) && ((int_2 >> 6) == anInt248) : false;
	}

	@Override
	public void method7(final WorldMapData worldmapdata_0) {
		if (worldmapdata_0.anInt110 > anInt244) {
			worldmapdata_0.anInt110 = anInt244;
		}

		if (worldmapdata_0.anInt108 < anInt244) {
			worldmapdata_0.anInt108 = anInt244;
		}

		if (worldmapdata_0.anInt111 > anInt246) {
			worldmapdata_0.anInt111 = anInt246;
		}

		if (worldmapdata_0.anInt109 < anInt246) {
			worldmapdata_0.anInt109 = anInt246;
		}

	}

	@Override
	public Coordinates method8(final int int_0, final int int_1) {
		if (!method5(int_0, int_1)) {
			return null;
		} else {
			final int int_2 = ((anInt247 * 64) - (anInt244 * 64)) + int_0;
			final int int_3 = ((anInt248 * 64) - (anInt246 * 64)) + int_1;
			return new Coordinates(anInt243, int_2, int_3);
		}
	}

	@Override
	public int[] method9(final int int_0, final int int_1, final int int_2) {
		if (!method6(int_0, int_1, int_2)) {
			return null;
		} else {
			final int[] ints_0 = new int[] { ((anInt244 * 64) - (anInt247 * 64)) + int_1,
					int_2 + ((anInt246 * 64) - (anInt248 * 64)) };
			return ints_0;
		}
	}

	void method545() {
	}

	@Override
	public void method10(final Buffer buffer_0) {
		anInt243 = buffer_0.readUnsignedByte();
		anInt245 = buffer_0.readUnsignedByte();
		anInt247 = buffer_0.readUnsignedShort();
		anInt248 = buffer_0.readUnsignedShort();
		anInt244 = buffer_0.readUnsignedShort();
		anInt246 = buffer_0.readUnsignedShort();
		method545();
	}

	static void setGameState(final int int_0) {
		if (int_0 != Client.gameState) {
			if (Client.gameState == 0) {
				AClass1.clientInstance.method1011();
			}

			if ((int_0 == 20) || (int_0 == 40) || (int_0 == 45)) {
				Client.loginState = 0;
				Client.anInt653 = 0;
				Client.anInt645 = 0;
			}

			if ((int_0 != 20) && (int_0 != 40) && (Class101.aRSSocket2 != null)) {
				Class101.aRSSocket2.close();
				Class101.aRSSocket2 = null;
			}

			if (Client.gameState == 25) {
				Client.anInt664 = 0;
				Client.anInt668 = 0;
				Client.anInt670 = 1;
				Client.anInt672 = 0;
				Client.anInt674 = 1;
			}

			if ((int_0 != 5) && (int_0 != 10)) {
				if (int_0 == 20) {
					IndexFile.method72(Class17.anIndexData1, Class50.indexSprites, true,
							Client.gameState == 11 ? 4 : 0);
				} else if (int_0 == 11) {
					IndexFile.method72(Class17.anIndexData1, Class50.indexSprites, false, 4);
				} else if (Class26.aBool8) {
					Class26.aModIcon1 = null;
					AClass5_Sub4.aModIcon5 = null;
					Frames.aModIconArray9 = null;
					XItemContainer.aSpritePixels4 = null;
					AClass4_Sub2.aSpritePixels5 = null;
					Class58.logoSprite = null;
					XClanMember.titlemuteSprite = null;
					ISAACCipher.aModIcon2 = null;
					Enum5.aModIcon4 = null;
					Class26.aSpritePixelsArray2 = null;
					Class26.aModIconArray3 = null;
					Class63.aModIconArray4 = null;
					AClass4_Sub1.aModIconArray7 = null;
					Huffman.aModIcon3 = null;
					Class26.anIntArray13 = null;
					AClass2_Sub1.anIntArray75 = null;
					World.anIntArray63 = null;
					Class26.anIntArray14 = null;
					Spotanim.anIntArray83 = null;
					Class32.anIntArray15 = null;
					Class61.anIntArray40 = null;
					Class50.anIntArray24 = null;
					Class76.anInt186 = 1;
					Class76.anIndexDataBase3 = null;
					Class76.anInt187 = -1;
					MilliTimer.anInt422 = -1;
					Class76.anInt188 = 0;
					Class76.aBool21 = false;
					AClass2_Sub1.anInt334 = 2;
					Actor.sendConInfo(true);
					Class26.aBool8 = false;
				}
			} else {
				IndexFile.method72(Class17.anIndexData1, Class50.indexSprites, true, 0);
			}

			Client.gameState = int_0;
		}
	}

	static final int method546() {
		if (Class28.preferences.hideRoofs) {
			return AClass1_Sub1.plane;
		} else {
			final int int_0 = Actor.getTileHeight(Class13.cameraX, Class46.cameraY, AClass1_Sub1.plane);
			return ((int_0 - XItemContainer.cameraZ) < 800)
					&& ((Class18.tileSettings[AClass1_Sub1.plane][Class13.cameraX >> 7][Class46.cameraY >> 7]
							& 0x4) != 0) ? AClass1_Sub1.plane : 3;
		}
	}

}
