public class WorldMapType1 implements WorldMapSectionBase {

	int anInt263;
	int anInt264;
	int anInt265;
	int anInt266;
	int anInt267;
	int anInt268;
	int anInt269;
	int anInt270;
	int anInt271;
	int anInt272;

	@Override
	public boolean method5(final int int_0, final int int_1) {
		return ((int_0 >> 6) >= anInt263) && ((int_0 >> 6) <= anInt265) && ((int_1 >> 6) >= anInt267)
				&& ((int_1 >> 6) <= anInt269);
	}

	@Override
	public boolean method6(final int int_0, final int int_1, final int int_2) {
		return (int_0 >= anInt264) && (int_0 < (anInt264 + anInt266)) ? ((int_1 >> 6) >= anInt268)
				&& ((int_1 >> 6) <= anInt270) && ((int_2 >> 6) >= anInt271) && ((int_2 >> 6) <= anInt272) : false;
	}

	@Override
	public void method7(final WorldMapData worldmapdata_0) {
		if (worldmapdata_0.anInt110 > anInt263) {
			worldmapdata_0.anInt110 = anInt263;
		}

		if (worldmapdata_0.anInt108 < anInt265) {
			worldmapdata_0.anInt108 = anInt265;
		}

		if (worldmapdata_0.anInt111 > anInt267) {
			worldmapdata_0.anInt111 = anInt267;
		}

		if (worldmapdata_0.anInt109 < anInt269) {
			worldmapdata_0.anInt109 = anInt269;
		}

	}

	@Override
	public Coordinates method8(final int int_0, final int int_1) {
		if (!method5(int_0, int_1)) {
			return null;
		} else {
			final int int_2 = ((anInt268 * 64) - (anInt263 * 64)) + int_0;
			final int int_3 = ((anInt271 * 64) - (anInt267 * 64)) + int_1;
			return new Coordinates(anInt264, int_2, int_3);
		}
	}

	@Override
	public int[] method9(final int int_0, final int int_1, final int int_2) {
		if (!method6(int_0, int_1, int_2)) {
			return null;
		} else {
			final int[] ints_0 = new int[] { ((anInt263 * 64) - (anInt268 * 64)) + int_1,
					int_2 + ((anInt267 * 64) - (anInt271 * 64)) };
			return ints_0;
		}
	}

	@Override
	public void method10(final Buffer buffer_0) {
		anInt264 = buffer_0.readUnsignedByte();
		anInt266 = buffer_0.readUnsignedByte();
		anInt268 = buffer_0.readUnsignedShort();
		anInt271 = buffer_0.readUnsignedShort();
		anInt270 = buffer_0.readUnsignedShort();
		anInt272 = buffer_0.readUnsignedShort();
		anInt263 = buffer_0.readUnsignedShort();
		anInt267 = buffer_0.readUnsignedShort();
		anInt265 = buffer_0.readUnsignedShort();
		anInt269 = buffer_0.readUnsignedShort();
		method548();
	}

	void method548() {
	}

	public static SpritePixels[] method549(final IndexDataBase indexdatabase_0, final String string_0,
			final String string_1) {
		final int int_0 = indexdatabase_0.getFile(string_0);
		final int int_1 = indexdatabase_0.getChild(int_0, string_1);
		SpritePixels[] spritepixelss_0;
		if (!IndexData.method597(indexdatabase_0, int_0, int_1)) {
			spritepixelss_0 = null;
		} else {
			spritepixelss_0 = KitDefinition.method753();
		}

		return spritepixelss_0;
	}

	static final void method550(final Actor actor_0) {
		int int_0;
		int int_1;
		int int_2;
		if (actor_0.anInt565 > Client.gameCycle) {
			int_0 = actor_0.anInt565 - Client.gameCycle;
			int_1 = (actor_0.anInt567 * 128) + (actor_0.anInt542 * 64);
			int_2 = (actor_0.anInt568 * 128) + (actor_0.anInt542 * 64);
			actor_0.anInt547 += (int_1 - actor_0.anInt547) / int_0;
			actor_0.anInt550 += (int_2 - actor_0.anInt550) / int_0;
			actor_0.anInt541 = 0;
			actor_0.orientation = actor_0.anInt571;
		} else if (actor_0.anInt566 >= Client.gameCycle) {
			Class101.method499(actor_0);
		} else {
			WallObject.method344(actor_0);
		}

		if ((actor_0.anInt547 < 128) || (actor_0.anInt550 < 128) || (actor_0.anInt547 >= 13184)
				|| (actor_0.anInt550 >= 13184)) {
			actor_0.animation = -1;
			actor_0.graphic = -1;
			actor_0.anInt565 = 0;
			actor_0.anInt566 = 0;
			actor_0.anInt547 = (128 * actor_0.pathX[0]) + (actor_0.anInt542 * 64);
			actor_0.anInt550 = (actor_0.pathY[0] * 128) + (actor_0.anInt542 * 64);
			actor_0.method883();
		}

		if ((Script.localPlayer == actor_0) && ((actor_0.anInt547 < 1536) || (actor_0.anInt550 < 1536)
				|| (actor_0.anInt547 >= 11776) || (actor_0.anInt550 >= 11776))) {
			actor_0.animation = -1;
			actor_0.graphic = -1;
			actor_0.anInt565 = 0;
			actor_0.anInt566 = 0;
			actor_0.anInt547 = (actor_0.pathX[0] * 128) + (actor_0.anInt542 * 64);
			actor_0.anInt550 = (actor_0.pathY[0] * 128) + (actor_0.anInt542 * 64);
			actor_0.method883();
		}

		if (actor_0.anInt564 != 0) {
			if (actor_0.interacting != -1) {
				Object object_0 = null;
				if (actor_0.interacting < 32768) {
					object_0 = Client.cachedNPCs[actor_0.interacting];
				} else if (actor_0.interacting >= 32768) {
					object_0 = Client.cachedPlayers[actor_0.interacting - 32768];
				}

				if (object_0 != null) {
					int_1 = actor_0.anInt547 - ((Actor) object_0).anInt547;
					int_2 = actor_0.anInt550 - ((Actor) object_0).anInt550;
					if ((int_1 != 0) || (int_2 != 0)) {
						actor_0.orientation = (int) (Math.atan2(int_1, int_2) * 325.949D) & 0x7FF;
					}
				} else if (actor_0.aBool62) {
					actor_0.interacting = -1;
					actor_0.aBool62 = false;
				}
			}

			if ((actor_0.anInt539 != -1) && ((actor_0.queueSize == 0) || (actor_0.anInt541 > 0))) {
				actor_0.orientation = actor_0.anInt539;
				actor_0.anInt539 = -1;
			}

			int_0 = (actor_0.orientation - actor_0.angle) & 0x7FF;
			if ((int_0 == 0) && actor_0.aBool62) {
				actor_0.interacting = -1;
				actor_0.aBool62 = false;
			}

			if (int_0 != 0) {
				++actor_0.anInt563;
				boolean bool_0;
				if (int_0 > 1024) {
					actor_0.angle -= actor_0.anInt564;
					bool_0 = true;
					if ((int_0 < actor_0.anInt564) || (int_0 > (2048 - actor_0.anInt564))) {
						actor_0.angle = actor_0.orientation;
						bool_0 = false;
					}

					if ((actor_0.idlePoseAnimation == actor_0.poseAnimation) && ((actor_0.anInt563 > 25) || bool_0)) {
						if (actor_0.anInt543 != -1) {
							actor_0.poseAnimation = actor_0.anInt543;
						} else {
							actor_0.poseAnimation = actor_0.anInt545;
						}
					}
				} else {
					actor_0.angle += actor_0.anInt564;
					bool_0 = true;
					if ((int_0 < actor_0.anInt564) || (int_0 > (2048 - actor_0.anInt564))) {
						actor_0.angle = actor_0.orientation;
						bool_0 = false;
					}

					if ((actor_0.poseAnimation == actor_0.idlePoseAnimation) && ((actor_0.anInt563 > 25) || bool_0)) {
						if (actor_0.anInt544 != -1) {
							actor_0.poseAnimation = actor_0.anInt544;
						} else {
							actor_0.poseAnimation = actor_0.anInt545;
						}
					}
				}

				actor_0.angle &= 0x7FF;
			} else {
				actor_0.anInt563 = 0;
			}
		}

		actor_0.aBool61 = false;
		Sequence sequence_1;
		if (actor_0.poseAnimation != -1) {
			sequence_1 = Class54.getAnimation(actor_0.poseAnimation);
			if ((sequence_1 != null) && (sequence_1.frameIDs != null)) {
				++actor_0.anInt558;
				if ((actor_0.poseFrame < sequence_1.frameIDs.length)
						&& (actor_0.anInt558 > sequence_1.frameLenghts[actor_0.poseFrame])) {
					actor_0.anInt558 = 1;
					++actor_0.poseFrame;
					Class49.method281(sequence_1, actor_0.poseFrame, actor_0.anInt547, actor_0.anInt550);
				}

				if (actor_0.poseFrame >= sequence_1.frameIDs.length) {
					actor_0.anInt558 = 0;
					actor_0.poseFrame = 0;
					Class49.method281(sequence_1, actor_0.poseFrame, actor_0.anInt547, actor_0.anInt550);
				}
			} else {
				actor_0.poseAnimation = -1;
			}
		}

		if ((actor_0.graphic != -1) && (Client.gameCycle >= actor_0.graphicsDelay)) {
			if (actor_0.anInt553 < 0) {
				actor_0.anInt553 = 0;
			}

			int_0 = InvType.getSpotAnimType(actor_0.graphic).anInt441;
			if (int_0 != -1) {
				final Sequence sequence_0 = Class54.getAnimation(int_0);
				if ((sequence_0 != null) && (sequence_0.frameIDs != null)) {
					++actor_0.anInt561;
					if ((actor_0.anInt553 < sequence_0.frameIDs.length)
							&& (actor_0.anInt561 > sequence_0.frameLenghts[actor_0.anInt553])) {
						actor_0.anInt561 = 1;
						++actor_0.anInt553;
						Class49.method281(sequence_0, actor_0.anInt553, actor_0.anInt547, actor_0.anInt550);
					}

					if ((actor_0.anInt553 >= sequence_0.frameIDs.length)
							&& ((actor_0.anInt553 < 0) || (actor_0.anInt553 >= sequence_0.frameIDs.length))) {
						actor_0.graphic = -1;
					}
				} else {
					actor_0.graphic = -1;
				}
			} else {
				actor_0.graphic = -1;
			}
		}

		if ((actor_0.animation != -1) && (actor_0.actionAnimationDisable <= 1)) {
			sequence_1 = Class54.getAnimation(actor_0.animation);
			if ((sequence_1.precedenceAnimating == 1) && (actor_0.anInt540 > 0)
					&& (actor_0.anInt565 <= Client.gameCycle) && (actor_0.anInt566 < Client.gameCycle)) {
				actor_0.actionAnimationDisable = 1;
				return;
			}
		}

		if ((actor_0.animation != -1) && (actor_0.actionAnimationDisable == 0)) {
			sequence_1 = Class54.getAnimation(actor_0.animation);
			if ((sequence_1 != null) && (sequence_1.frameIDs != null)) {
				++actor_0.anInt559;
				if ((actor_0.actionFrame < sequence_1.frameIDs.length)
						&& (actor_0.anInt559 > sequence_1.frameLenghts[actor_0.actionFrame])) {
					actor_0.anInt559 = 1;
					++actor_0.actionFrame;
					Class49.method281(sequence_1, actor_0.actionFrame, actor_0.anInt547, actor_0.anInt550);
				}

				if (actor_0.actionFrame >= sequence_1.frameIDs.length) {
					actor_0.actionFrame -= sequence_1.frameStep;
					++actor_0.anInt560;
					if (actor_0.anInt560 >= sequence_1.maxLoops) {
						actor_0.animation = -1;
					} else if ((actor_0.actionFrame >= 0) && (actor_0.actionFrame < sequence_1.frameIDs.length)) {
						Class49.method281(sequence_1, actor_0.actionFrame, actor_0.anInt547, actor_0.anInt550);
					} else {
						actor_0.animation = -1;
					}
				}

				actor_0.aBool61 = sequence_1.stretches;
			} else {
				actor_0.animation = -1;
			}
		}

		if (actor_0.actionAnimationDisable > 0) {
			--actor_0.actionAnimationDisable;
		}
	}

	static World method551() {
		World.anInt226 = 0;
		World world_0;
		if (World.anInt226 < World.worldCount) {
			world_0 = World.worldList[++World.anInt226 - 1];
		} else {
			world_0 = null;
		}

		return world_0;
	}

}
