public final class SceneTilePaint {

	boolean flatShade;
	int swColor;
	int rgb;
	int seColor;
	int neColor;
	int nwColor;
	int texture;

	SceneTilePaint(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final boolean bool_0) {
		flatShade = true;
		swColor = int_0;
		seColor = int_1;
		neColor = int_2;
		nwColor = int_3;
		texture = int_4;
		rgb = int_5;
		flatShade = bool_0;
	}

	static int method318(final int int_0, final Script script_0, final boolean bool_0) {
		if (int_0 == 6200) {
			WorldMapType2.intStackSize -= 2;
			Client.aShort4 = (short) Class45.intStack[WorldMapType2.intStackSize];
			if (Client.aShort4 <= 0) {
				Client.aShort4 = 256;
			}

			Client.aShort3 = (short) Class45.intStack[WorldMapType2.intStackSize + 1];
			if (Client.aShort3 <= 0) {
				Client.aShort3 = 205;
			}

			return 1;
		} else if (int_0 == 6201) {
			WorldMapType2.intStackSize -= 2;
			Client.aShort9 = (short) Class45.intStack[WorldMapType2.intStackSize];
			if (Client.aShort9 <= 0) {
				Client.aShort9 = 256;
			}

			Client.aShort8 = (short) Class45.intStack[WorldMapType2.intStackSize + 1];
			if (Client.aShort8 <= 0) {
				Client.aShort8 = 320;
			}

			return 1;
		} else if (int_0 == 6202) {
			WorldMapType2.intStackSize -= 4;
			Client.aShort10 = (short) Class45.intStack[WorldMapType2.intStackSize];
			if (Client.aShort10 <= 0) {
				Client.aShort10 = 1;
			}

			Client.aShort7 = (short) Class45.intStack[WorldMapType2.intStackSize + 1];
			if (Client.aShort7 <= 0) {
				Client.aShort7 = 32767;
			} else if (Client.aShort7 < Client.aShort10) {
				Client.aShort7 = Client.aShort10;
			}

			Client.aShort5 = (short) Class45.intStack[WorldMapType2.intStackSize + 2];
			if (Client.aShort5 <= 0) {
				Client.aShort5 = 1;
			}

			Client.aShort6 = (short) Class45.intStack[WorldMapType2.intStackSize + 3];
			if (Client.aShort6 <= 0) {
				Client.aShort6 = 32767;
			} else if (Client.aShort6 < Client.aShort5) {
				Client.aShort6 = Client.aShort5;
			}

			return 1;
		} else if (int_0 == 6203) {
			if (Client.aWidget11 != null) {
				Class51.method308(0, 0, Client.aWidget11.width, Client.aWidget11.height, false);
				Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.viewportHeight;
				Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.viewportWidth;
			} else {
				Class45.intStack[++WorldMapType2.intStackSize - 1] = -1;
				Class45.intStack[++WorldMapType2.intStackSize - 1] = -1;
			}

			return 1;
		} else if (int_0 == 6204) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.aShort9;
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.aShort8;
			return 1;
		} else if (int_0 == 6205) {
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.aShort4;
			Class45.intStack[++WorldMapType2.intStackSize - 1] = Client.aShort3;
			return 1;
		} else {
			return 2;
		}
	}

}
