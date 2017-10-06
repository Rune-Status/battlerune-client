public class DynamicObject extends Renderable {

	Sequence aSequence2;
	int anInt616;
	int anInt617;
	int type;
	int orientation;
	int level;
	int anInt618;
	int sceneX;
	int sceneY;

	DynamicObject(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final int int_6, final boolean bool_0, final Renderable renderable_0) {
		anInt616 = int_0;
		type = int_1;
		orientation = int_2;
		level = int_3;
		sceneX = int_4;
		sceneY = int_5;
		if (int_6 != -1) {
			aSequence2 = Class54.getAnimation(int_6);
			anInt618 = 0;
			anInt617 = Client.gameCycle - 1;
			if ((aSequence2.replyMode == 0) && (renderable_0 != null) && (renderable_0 instanceof DynamicObject)) {
				final DynamicObject dynamicobject_1 = (DynamicObject) renderable_0;
				if (aSequence2 == dynamicobject_1.aSequence2) {
					anInt618 = dynamicobject_1.anInt618;
					anInt617 = dynamicobject_1.anInt617;
					return;
				}
			}

			if (bool_0 && (aSequence2.frameStep != -1)) {
				anInt618 = (int) (Math.random() * aSequence2.frameIDs.length);
				anInt617 -= (int) (Math.random() * aSequence2.frameLenghts[anInt618]);
			}
		}

	}

	@Override
	protected final Model getModel() {
		if (aSequence2 != null) {
			int int_0 = Client.gameCycle - anInt617;
			if ((int_0 > 100) && (aSequence2.frameStep > 0)) {
				int_0 = 100;
			}

			label48: {
				do {
					do {
						if (int_0 <= aSequence2.frameLenghts[anInt618]) {
							break label48;
						}

						int_0 -= aSequence2.frameLenghts[anInt618];
						++anInt618;
					} while (anInt618 < aSequence2.frameIDs.length);

					anInt618 -= aSequence2.frameStep;
				} while ((anInt618 >= 0) && (anInt618 < aSequence2.frameIDs.length));

				aSequence2 = null;
			}

			anInt617 = Client.gameCycle - int_0;
		}

		ObjectComposition objectcomposition_0 = PlayerComposition.getObjectDefinition(anInt616);
		if (objectcomposition_0.impostorIds != null) {
			objectcomposition_0 = objectcomposition_0.getImpostor();
		}

		if (objectcomposition_0 == null) {
			return null;
		} else {
			int int_1;
			int int_2;
			if ((orientation != 1) && (orientation != 3)) {
				int_1 = objectcomposition_0.sizeX;
				int_2 = objectcomposition_0.sizeY;
			} else {
				int_1 = objectcomposition_0.sizeY;
				int_2 = objectcomposition_0.sizeX;
			}

			final int int_3 = sceneX + (int_1 >> 1);
			final int int_4 = ((1 + int_1) >> 1) + sceneX;
			final int int_5 = sceneY + (int_2 >> 1);
			final int int_6 = ((int_2 + 1) >> 1) + sceneY;
			final int[][] ints_0 = Class18.tileHeights[level];
			final int int_7 = (ints_0[int_4][int_5] + ints_0[int_3][int_5] + ints_0[int_3][int_6]
					+ ints_0[int_4][int_6]) >> 2;
			final int int_8 = (sceneX << 7) + (int_1 << 6);
			final int int_9 = (sceneY << 7) + (int_2 << 6);
			return objectcomposition_0.method797(type, orientation, ints_0, int_8, int_7, int_9, aSequence2, anInt618);
		}
	}

}
