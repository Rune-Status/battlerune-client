public class Class81 {

	public static NPCComposition getNpcDefinition(final int int_0) {
		NPCComposition npccomposition_0 = (NPCComposition) NPCComposition.npcs.get(int_0);
		if (npccomposition_0 != null) {
			return npccomposition_0;
		} else {
			final byte[] bytes_0 = NPCComposition.anIndexDataBase28.getConfigData(9, int_0);
			npccomposition_0 = new NPCComposition();
			npccomposition_0.anInt517 = int_0;
			if (bytes_0 != null) {
				npccomposition_0.decode(new Buffer(bytes_0));
			}

			npccomposition_0.post();
			NPCComposition.npcs.put(npccomposition_0, int_0);
			return npccomposition_0;
		}
	}

}
