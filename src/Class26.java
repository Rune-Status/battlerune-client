public class Class26 {

	static int anInt79;
	static int loginWindowX;
	static int[] anIntArray12;
	static int loginIndex;
	static int anInt80;
	static int anInt81;
	static int anInt82;
	static int anInt83;
	static int anInt84;
	static int anInt85;
	static int loadingBarPercentage;
	static String loadingText;
	static String aString4;
	static String loginMessage1;
	static String loginMessage2;
	static String loginMessage3;
	static String username;
	static String password;
	static Enum3 anEnum3_1;
	static boolean aBool7;
	static int loginIndex2;
	static boolean worldSelectShown;
	static boolean aBool8;
	static int anInt86;
	static ModIcon aModIcon1;
	static SpritePixels[] aSpritePixelsArray2;
	static ModIcon[] aModIconArray3;
	static int[] anIntArray13;
	static int[] anIntArray14;

	static {
		anInt79 = 0;
		loginWindowX = anInt79 + 202;
		anIntArray12 = new int[256];
		anInt80 = 0;
		anInt81 = 0;
		anInt82 = 0;
		anInt83 = 0;
		anInt84 = 0;
		anInt85 = 0;
		loadingBarPercentage = 10;
		loadingText = "";
		loginIndex = 0;
		aString4 = "";
		loginMessage1 = "";
		loginMessage2 = "";
		loginMessage3 = "";
		username = "";
		password = "";
		anEnum3_1 = Enum3.anEnum3_4;
		aBool7 = true;
		loginIndex2 = 0;
		worldSelectShown = false;
		anInt86 = -1;
	}

	static final void method225(final int int_0, final int int_1, final int int_2, final int int_3,
			final SpritePixels spritepixels_0, final CacheableNode_Sub1 cacheablenode_sub1_0) {
		final int int_4 = (int_3 * int_3) + (int_2 * int_2);
		if ((int_4 > 4225) && (int_4 < 90000)) {
			final int int_5 = (Client.mapScale + Client.mapAngle) & 0x7FF;
			int int_6 = Graphics3D.SINE[int_5];
			int int_7 = Graphics3D.COSINE[int_5];
			int_6 = (int_6 * 256) / (Client.mapScaleDelta + 256);
			int_7 = (int_7 * 256) / (Client.mapScaleDelta + 256);
			final int int_8 = ((int_7 * int_2) + (int_6 * int_3)) >> 16;
			final int int_9 = ((int_3 * int_7) - (int_6 * int_2)) >> 16;
			final double double_0 = Math.atan2(int_8, int_9);
			final int int_10 = (int) (Math.sin(double_0) * 63.0D);
			final int int_11 = (int) (Math.cos(double_0) * 57.0D);
			Class76.mapedge.method929((int_10 + int_0 + 94 + 4) - 10, (int_1 + 83) - int_11 - 20, 20, 20, 15, 15,
					double_0, 256);
		} else {
			ScriptVarType.drawDot(int_0, int_1, int_2, int_3, spritepixels_0, cacheablenode_sub1_0);
		}
	}

}
