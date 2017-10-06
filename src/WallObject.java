public final class WallObject {

	static String authCode;
	public int hash;
	int config;
	int anInt141;
	public Renderable renderable1;
	int anInt142;
	int floor;
	public Renderable renderable2;
	int orientationA;
	int orientationB;

	WallObject() {
		hash = 0;
		config = 0;
	}

	static final void method344(final Actor actor_0) {
		actor_0.poseAnimation = actor_0.idlePoseAnimation;
		if (actor_0.queueSize == 0) {
			actor_0.anInt541 = 0;
		} else {
			if ((actor_0.animation != -1) && (actor_0.actionAnimationDisable == 0)) {
				final Sequence sequence_0 = Class54.getAnimation(actor_0.animation);
				if ((actor_0.anInt540 > 0) && (sequence_0.precedenceAnimating == 0)) {
					++actor_0.anInt541;
					return;
				}

				if ((actor_0.anInt540 <= 0) && (sequence_0.priority == 0)) {
					++actor_0.anInt541;
					return;
				}
			}

			final int int_0 = actor_0.anInt547;
			final int int_1 = actor_0.anInt550;
			final int int_2 = (128 * actor_0.pathX[actor_0.queueSize - 1]) + (actor_0.anInt542 * 64);
			final int int_3 = (actor_0.pathY[actor_0.queueSize - 1] * 128) + (actor_0.anInt542 * 64);
			if (int_0 < int_2) {
				if (int_1 < int_3) {
					actor_0.orientation = 1280;
				} else if (int_1 > int_3) {
					actor_0.orientation = 1792;
				} else {
					actor_0.orientation = 1536;
				}
			} else if (int_0 > int_2) {
				if (int_1 < int_3) {
					actor_0.orientation = 768;
				} else if (int_1 > int_3) {
					actor_0.orientation = 256;
				} else {
					actor_0.orientation = 512;
				}
			} else if (int_1 < int_3) {
				actor_0.orientation = 1024;
			} else if (int_1 > int_3) {
				actor_0.orientation = 0;
			}

			final byte byte_0 = actor_0.aByteArray21[actor_0.queueSize - 1];
			if (((int_2 - int_0) <= 256) && ((int_2 - int_0) >= -256) && ((int_3 - int_1) <= 256)
					&& ((int_3 - int_1) >= -256)) {
				int int_4 = (actor_0.orientation - actor_0.angle) & 0x7FF;
				if (int_4 > 1024) {
					int_4 -= 2048;
				}

				int int_5 = actor_0.anInt546;
				if ((int_4 >= -256) && (int_4 <= 256)) {
					int_5 = actor_0.anInt545;
				} else if ((int_4 >= 256) && (int_4 < 768)) {
					int_5 = actor_0.anInt549;
				} else if ((int_4 >= -768) && (int_4 <= -256)) {
					int_5 = actor_0.anInt548;
				}

				if (int_5 == -1) {
					int_5 = actor_0.anInt545;
				}

				actor_0.poseAnimation = int_5;
				int int_6 = 4;
				boolean bool_0 = true;
				if (actor_0 instanceof NPC) {
					bool_0 = ((NPC) actor_0).composition.isClickable;
				}

				if (bool_0) {
					if ((actor_0.orientation != actor_0.angle) && (actor_0.interacting == -1)
							&& (actor_0.anInt564 != 0)) {
						int_6 = 2;
					}

					if (actor_0.queueSize > 2) {
						int_6 = 6;
					}

					if (actor_0.queueSize > 3) {
						int_6 = 8;
					}

					if ((actor_0.anInt541 > 0) && (actor_0.queueSize > 1)) {
						int_6 = 8;
						--actor_0.anInt541;
					}
				} else {
					if (actor_0.queueSize > 1) {
						int_6 = 6;
					}

					if (actor_0.queueSize > 2) {
						int_6 = 8;
					}

					if ((actor_0.anInt541 > 0) && (actor_0.queueSize > 1)) {
						int_6 = 8;
						--actor_0.anInt541;
					}
				}

				if (byte_0 == 2) {
					int_6 <<= 1;
				}

				if ((int_6 >= 8) && (actor_0.poseAnimation == actor_0.anInt545) && (actor_0.anInt551 != -1)) {
					actor_0.poseAnimation = actor_0.anInt551;
				}

				if ((int_2 != int_0) || (int_3 != int_1)) {
					if (int_0 < int_2) {
						actor_0.anInt547 += int_6;
						if (actor_0.anInt547 > int_2) {
							actor_0.anInt547 = int_2;
						}
					} else if (int_0 > int_2) {
						actor_0.anInt547 -= int_6;
						if (actor_0.anInt547 < int_2) {
							actor_0.anInt547 = int_2;
						}
					}

					if (int_1 < int_3) {
						actor_0.anInt550 += int_6;
						if (actor_0.anInt550 > int_3) {
							actor_0.anInt550 = int_3;
						}
					} else if (int_1 > int_3) {
						actor_0.anInt550 -= int_6;
						if (actor_0.anInt550 < int_3) {
							actor_0.anInt550 = int_3;
						}
					}
				}

				if ((int_2 == actor_0.anInt547) && (int_3 == actor_0.anInt550)) {
					--actor_0.queueSize;
					if (actor_0.anInt540 > 0) {
						--actor_0.anInt540;
					}
				}

			} else {
				actor_0.anInt547 = int_2;
				actor_0.anInt550 = int_3;
				--actor_0.queueSize;
				if (actor_0.anInt540 > 0) {
					--actor_0.anInt540;
				}

			}
		}
	}

}
