public class Class65 {

	public static VarPlayerType method396(final int int_0) {
		VarPlayerType varplayertype_0 = (VarPlayerType) VarPlayerType.varplayers.get(int_0);
		if (varplayertype_0 != null) {
			return varplayertype_0;
		} else {
			final byte[] bytes_0 = Class41.varplayer_ref.getConfigData(16, int_0);
			varplayertype_0 = new VarPlayerType();
			if (bytes_0 != null) {
				varplayertype_0.decode(new Buffer(bytes_0));
			}

			VarPlayerType.varplayers.put(varplayertype_0, int_0);
			return varplayertype_0;
		}
	}

	public static int method397(final int int_0, final int int_1, int int_2, int int_3, int int_4, final int int_5) {
		if ((int_5 & 0x1) == 1) {
			final int int_6 = int_3;
			int_3 = int_4;
			int_4 = int_6;
		}

		int_2 &= 0x3;
		return int_2 == 0 ? int_1
				: (int_2 == 1 ? 7 - int_0 - (int_3 - 1) : (int_2 == 2 ? 7 - int_1 - (int_4 - 1) : int_0));
	}

}
