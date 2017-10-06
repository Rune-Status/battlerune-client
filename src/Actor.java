import java.io.IOException;

public abstract class Actor extends Renderable {

	static Interface3 anInterface3_1;
	int queueSize;
	int animation;
	int[] pathX;
	int[] hitsplatCycles;
	int[] pathY;
	int anInt539;
	boolean aBool61;
	int anInt540;
	byte aByte4;
	int actionAnimationDisable;
	int anInt541;
	CombatInfoList combatInfoList;
	int poseAnimation;
	int anInt542;
	int[] hitsplatTypes;
	int idlePoseAnimation;
	int actionFrame;
	int anInt543;
	int poseFrame;
	int anInt544;
	int anInt545;
	byte[] aByteArray21;
	int anInt546;
	int anInt547;
	int[] anIntArray109;
	int anInt548;
	int anInt549;
	int anInt550;
	int[] anIntArray110;
	int anInt551;
	int anInt552;
	int[] anIntArray111;
	String overhead;
	int graphic;
	boolean inSequence;
	int anInt553;
	int anInt554;
	int anInt555;
	int anInt556;
	int anInt557;
	int interacting;
	boolean aBool62;
	int orientation;
	int anInt558;
	int anInt559;
	int anInt560;
	int anInt561;
	int anInt562;
	int anInt563;
	int anInt564;
	int angle;
	int anInt565;
	int anInt566;
	int anInt567;
	int anInt568;
	int anInt569;
	int anInt570;
	int anInt571;
	boolean aBool63;
	int graphicsDelay;

	Actor() {
		aBool61 = false;
		anInt542 = 1;
		idlePoseAnimation = -1;
		anInt543 = -1;
		anInt544 = -1;
		anInt545 = -1;
		anInt546 = -1;
		anInt548 = -1;
		anInt549 = -1;
		anInt551 = -1;
		overhead = null;
		inSequence = false;
		anInt554 = 100;
		anInt555 = 0;
		anInt556 = 0;
		aByte4 = 0;
		anIntArray109 = new int[4];
		hitsplatTypes = new int[4];
		hitsplatCycles = new int[4];
		anIntArray110 = new int[4];
		anIntArray111 = new int[4];
		combatInfoList = new CombatInfoList();
		interacting = -1;
		aBool62 = false;
		anInt539 = -1;
		poseAnimation = -1;
		poseFrame = 0;
		anInt558 = 0;
		animation = -1;
		actionFrame = 0;
		anInt559 = 0;
		actionAnimationDisable = 0;
		anInt560 = 0;
		graphic = -1;
		anInt553 = 0;
		anInt561 = 0;
		anInt562 = 0;
		anInt552 = 200;
		anInt563 = 0;
		anInt564 = 32;
		queueSize = 0;
		pathX = new int[10];
		pathY = new int[10];
		aByteArray21 = new byte[10];
		anInt541 = 0;
		anInt540 = 0;
	}

	boolean hasConfig() {
		return false;
	}

	final void method881(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5) {
		boolean bool_0 = true;
		boolean bool_1 = true;

		int int_6;
		for (int_6 = 0; int_6 < 4; int_6++) {
			if (hitsplatCycles[int_6] > int_4) {
				bool_0 = false;
			} else {
				bool_1 = false;
			}
		}

		int_6 = -1;
		int int_7 = -1;
		int int_8 = 0;
		if (int_0 >= 0) {
			final CacheableNode_Sub3 cacheablenode_sub3_0 = Class36.method246(int_0);
			int_7 = cacheablenode_sub3_0.anInt508;
			int_8 = cacheablenode_sub3_0.anInt510;
		}

		int int_9;
		if (bool_1) {
			if (int_7 == -1) {
				return;
			}

			int_6 = 0;
			int_9 = 0;
			if (int_7 == 0) {
				int_9 = hitsplatCycles[0];
			} else if (int_7 == 1) {
				int_9 = hitsplatTypes[0];
			}

			for (int int_10 = 1; int_10 < 4; int_10++) {
				if (int_7 == 0) {
					if (hitsplatCycles[int_10] < int_9) {
						int_6 = int_10;
						int_9 = hitsplatCycles[int_10];
					}
				} else if ((int_7 == 1) && (hitsplatTypes[int_10] < int_9)) {
					int_6 = int_10;
					int_9 = hitsplatTypes[int_10];
				}
			}

			if ((int_7 == 1) && (int_9 >= int_1)) {
				return;
			}
		} else {
			if (bool_0) {
				aByte4 = 0;
			}

			for (int_9 = 0; int_9 < 4; int_9++) {
				final byte byte_0 = aByte4;
				aByte4 = (byte) ((aByte4 + 1) % 4);
				if (hitsplatCycles[byte_0] <= int_4) {
					int_6 = byte_0;
					break;
				}
			}
		}

		if (int_6 >= 0) {
			anIntArray109[int_6] = int_0;
			hitsplatTypes[int_6] = int_1;
			anIntArray110[int_6] = int_2;
			anIntArray111[int_6] = int_3;
			hitsplatCycles[int_6] = int_4 + int_8 + int_5;
		}
	}

	final void method882(final int int_0) {
		CombatInfo2 combatinfo2_0 = (CombatInfo2) CombatInfo2.aNodeCache8.get(int_0);
		CombatInfo2 combatinfo2_1;
		if (combatinfo2_0 != null) {
			combatinfo2_1 = combatinfo2_0;
		} else {
			final byte[] bytes_0 = CombatInfo2.anIndexDataBase20.getConfigData(33, int_0);
			combatinfo2_0 = new CombatInfo2();
			if (bytes_0 != null) {
				combatinfo2_0.method793(new Buffer(bytes_0));
			}

			CombatInfo2.aNodeCache8.put(combatinfo2_0, int_0);
			combatinfo2_1 = combatinfo2_0;
		}

		combatinfo2_0 = combatinfo2_1;

		for (CombatInfoListHolder combatinfolistholder_0 = (CombatInfoListHolder) combatInfoList
				.method452(); combatinfolistholder_0 != null; combatinfolistholder_0 = (CombatInfoListHolder) combatInfoList
						.method453()) {
			if (combatinfo2_0 == combatinfolistholder_0.combatInfo2) {
				combatinfolistholder_0.unlink();
				return;
			}
		}

	}

	final void method883() {
		queueSize = 0;
		anInt540 = 0;
	}

	final void method884(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5) {
		CombatInfo2 combatinfo2_0 = (CombatInfo2) CombatInfo2.aNodeCache8.get(int_0);
		CombatInfo2 combatinfo2_1;
		if (combatinfo2_0 != null) {
			combatinfo2_1 = combatinfo2_0;
		} else {
			final byte[] bytes_0 = CombatInfo2.anIndexDataBase20.getConfigData(33, int_0);
			combatinfo2_0 = new CombatInfo2();
			if (bytes_0 != null) {
				combatinfo2_0.method793(new Buffer(bytes_0));
			}

			CombatInfo2.aNodeCache8.put(combatinfo2_0, int_0);
			combatinfo2_1 = combatinfo2_0;
		}

		combatinfo2_0 = combatinfo2_1;
		CombatInfoListHolder combatinfolistholder_2 = null;
		CombatInfoListHolder combatinfolistholder_0 = null;
		int int_6 = combatinfo2_1.anInt486;
		int int_7 = 0;

		CombatInfoListHolder combatinfolistholder_1;
		for (combatinfolistholder_1 = (CombatInfoListHolder) combatInfoList
				.method452(); combatinfolistholder_1 != null; combatinfolistholder_1 = (CombatInfoListHolder) combatInfoList
						.method453()) {
			++int_7;
			if (combatinfolistholder_1.combatInfo2.anInt489 == combatinfo2_0.anInt489) {
				combatinfolistholder_1.method615(int_1 + int_3, int_4, int_5, int_2);
				return;
			}

			if (combatinfolistholder_1.combatInfo2.anInt484 <= combatinfo2_0.anInt484) {
				combatinfolistholder_2 = combatinfolistholder_1;
			}

			if (combatinfolistholder_1.combatInfo2.anInt486 > int_6) {
				combatinfolistholder_0 = combatinfolistholder_1;
				int_6 = combatinfolistholder_1.combatInfo2.anInt486;
			}
		}

		if ((combatinfolistholder_0 != null) || (int_7 < 4)) {
			combatinfolistholder_1 = new CombatInfoListHolder(combatinfo2_0);
			if (combatinfolistholder_2 == null) {
				combatInfoList.method454(combatinfolistholder_1);
			} else {
				CombatInfoList.method457(combatinfolistholder_1, combatinfolistholder_2);
			}

			combatinfolistholder_1.method615(int_1 + int_3, int_4, int_5, int_2);
			if (int_7 >= 4) {
				combatinfolistholder_0.unlink();
			}

		}
	}

	public static void sendConInfo(final boolean bool_0) {
		if (Class93.aRSSocket1 != null) {
			try {
				final Buffer buffer_0 = new Buffer(4);
				buffer_0.putByte(bool_0 ? 2 : 3);
				buffer_0.put24bitInt(0);
				Class93.aRSSocket1.queueForWrite(buffer_0.payload, 0, 4);
			} catch (final IOException ioexception_0) {
				try {
					Class93.aRSSocket1.close();
				} catch (final Exception exception_0) {
					;
				}

				++Class93.anInt205;
				Class93.aRSSocket1 = null;
			}
		}
	}

	static final int getTileHeight(final int int_0, final int int_1, final int int_2) {
		final int int_3 = int_0 >> 7;
		final int int_4 = int_1 >> 7;
		if ((int_3 >= 0) && (int_4 >= 0) && (int_3 <= 103) && (int_4 <= 103)) {
			int int_5 = int_2;
			if ((int_2 < 3) && ((Class18.tileSettings[1][int_3][int_4] & 0x2) == 2)) {
				int_5 = int_2 + 1;
			}

			final int int_6 = int_0 & 0x7F;
			final int int_7 = int_1 & 0x7F;
			final int int_8 = (((128 - int_6) * Class18.tileHeights[int_5][int_3][int_4])
					+ (int_6 * Class18.tileHeights[int_5][1 + int_3][int_4])) >> 7;
			final int int_9 = ((Class18.tileHeights[int_5][int_3][int_4 + 1] * (128 - int_6))
					+ (int_6 * Class18.tileHeights[int_5][int_3 + 1][int_4 + 1])) >> 7;
			return ((int_9 * int_7) + (int_8 * (128 - int_7))) >> 7;
		} else {
			return 0;
		}
	}

}
