public class CombatInfoListHolder extends Node {

	static Class107 aClass107_1;
	static int[] landRegionFielIds;
	static SpritePixels[] aSpritePixelsArray3;
	CombatInfoList combatInfo1;
	CombatInfo2 combatInfo2;

	CombatInfoListHolder(final CombatInfo2 combatinfo2_0) {
		combatInfo1 = new CombatInfoList();
		combatInfo2 = combatinfo2_0;
	}

	void method615(final int int_0, final int int_1, final int int_2, final int int_3) {
		CombatInfo1 combatinfo1_0 = null;
		int int_4 = 0;

		for (CombatInfo1 combatinfo1_1 = (CombatInfo1) combatInfo1
				.method452(); combatinfo1_1 != null; combatinfo1_1 = (CombatInfo1) combatInfo1.method453()) {
			++int_4;
			if (combatinfo1_1.anInt393 == int_0) {
				combatinfo1_1.method648(int_0, int_1, int_2, int_3);
				return;
			}

			if (combatinfo1_1.anInt393 <= int_0) {
				combatinfo1_0 = combatinfo1_1;
			}
		}

		if (combatinfo1_0 == null) {
			if (int_4 < 4) {
				combatInfo1.method454(new CombatInfo1(int_0, int_1, int_2, int_3));
			}

		} else {
			CombatInfoList.method457(new CombatInfo1(int_0, int_1, int_2, int_3), combatinfo1_0);
			if (int_4 >= 4) {
				combatInfo1.method452().unlink();
			}

		}
	}

	CombatInfo1 method616(final int int_0) {
		CombatInfo1 combatinfo1_0 = (CombatInfo1) combatInfo1.method452();
		if ((combatinfo1_0 != null) && (combatinfo1_0.anInt393 <= int_0)) {
			for (CombatInfo1 combatinfo1_1 = (CombatInfo1) combatInfo1.method453(); (combatinfo1_1 != null)
					&& (combatinfo1_1.anInt393 <= int_0); combatinfo1_1 = (CombatInfo1) combatInfo1.method453()) {
				combatinfo1_0.unlink();
				combatinfo1_0 = combatinfo1_1;
			}

			if ((combatInfo2.anInt487 + combatinfo1_0.anInt393 + combatinfo1_0.anInt394) > int_0) {
				return combatinfo1_0;
			} else {
				combatinfo1_0.unlink();
				return null;
			}
		} else {
			return null;
		}
	}

	boolean method617() {
		return combatInfo1.method451();
	}

	static final void method618(final int int_0) {
		Class56.anIntArray35[++Class56.anInt145 - 1] = int_0;
	}

}
