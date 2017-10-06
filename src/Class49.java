public class Class49 {

	public static final Class49 aClass49_2;
	public static IndexDataBase widgetIndex;
	public static final Class49 aClass49_3;
	static BuildType aBuildType1;
	public static int priority;
	static RenderOverview renderOverview;
	static int selectedItemIndex;

	static {
		aClass49_2 = new Class49();
		aClass49_3 = new Class49();
	}

	static final void method280() {
		final int[] ints_0 = Class40.anIntArray17;

		int int_0;
		for (int_0 = 0; int_0 < Class40.anInt94; int_0++) {
			final Player player_0 = Client.cachedPlayers[ints_0[int_0]];
			if ((player_0 != null) && (player_0.anInt554 > 0)) {
				--player_0.anInt554;
				if (player_0.anInt554 == 0) {
					player_0.overhead = null;
				}
			}
		}

		for (int_0 = 0; int_0 < Client.anInt690; int_0++) {
			final int int_1 = Client.npcIndices[int_0];
			final NPC npc_0 = Client.cachedNPCs[int_1];
			if ((npc_0 != null) && (npc_0.anInt554 > 0)) {
				--npc_0.anInt554;
				if (npc_0.anInt554 == 0) {
					npc_0.overhead = null;
				}
			}
		}

	}

	static void method281(final Sequence sequence_0, final int int_0, final int int_1, final int int_2) {
		if ((Client.anInt700 < 50) && (Client.anInt684 != 0)) {
			if (sequence_0.anIntArray108 != null) {
				if (int_0 < sequence_0.anIntArray108.length) {
					final int int_3 = sequence_0.anIntArray108[int_0];
					if (int_3 != 0) {
						final int int_4 = int_3 >> 8;
						final int int_5 = (int_3 >> 4) & 0x7;
						final int int_6 = int_3 & 0xF;
						Client.anIntArray148[Client.anInt700] = int_4;
						Client.anIntArray150[Client.anInt700] = int_5;
						Client.anIntArray151[Client.anInt700] = 0;
						Client.audioEffects[Client.anInt700] = null;
						final int int_7 = (int_1 - 64) / 128;
						final int int_8 = (int_2 - 64) / 128;
						Client.anIntArray153[Client.anInt700] = int_6 + (int_8 << 8) + (int_7 << 16);
						++Client.anInt700;
					}
				}
			}
		}
	}

}
