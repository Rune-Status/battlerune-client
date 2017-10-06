import java.lang.management.GarbageCollectorMXBean;

public final class Player extends Actor {

	static IndexData anIndexData5;
	static GarbageCollectorMXBean aGarbageCollectorMXBean1;
	PlayerComposition composition;
	int skullIcon;
	int overheadIcon;
	boolean aBool73;
	String[] actions;
	int combatLevel;
	int totalLevel;
	int team;
	int anInt630;
	int anInt631;
	boolean hidden;
	boolean aBool74;
	Model model;
	int anInt632;
	int anInt633;
	int anInt634;
	int anInt635;
	int anInt636;
	String name;
	int anInt637;
	int anInt638;
	int anInt639;
	int anInt640;
	int anInt641;
	int anInt642;
	int anInt643;

	Player() {
		skullIcon = -1;
		overheadIcon = -1;
		actions = new String[3];

		for (int int_0 = 0; int_0 < 3; int_0++) {
			actions[int_0] = "";
		}

		combatLevel = 0;
		totalLevel = 0;
		anInt630 = 0;
		anInt631 = 0;
		aBool73 = false;
		team = 0;
		hidden = false;
		aBool74 = false;
	}

	@Override
	protected final Model getModel() {
		if (composition == null) {
			return null;
		} else {
			final Sequence sequence_0 = (super.animation != -1) && (super.actionAnimationDisable == 0)
					? Class54.getAnimation(super.animation) : null;
			final Sequence sequence_1 = (super.poseAnimation == -1) || aBool73
					|| ((super.idlePoseAnimation == super.poseAnimation) && (sequence_0 != null)) ? null
							: Class54.getAnimation(super.poseAnimation);
			Model model_0 = composition.method481(sequence_0, super.actionFrame, sequence_1, super.poseFrame);
			if (model_0 == null) {
				return null;
			} else {
				model_0.method942();
				super.anInt552 = model_0.modelHeight;
				Model model_1;
				Model[] models_0;
				if (!aBool73 && (super.graphic != -1) && (super.anInt553 != -1)) {
					model_1 = InvType.getSpotAnimType(super.graphic).method708(super.anInt553);
					if (model_1 != null) {
						model_1.method961(0, -super.anInt557, 0);
						models_0 = new Model[] { model_0, model_1 };
						model_0 = new Model(models_0, 2);
					}
				}

				if (!aBool73 && (model != null)) {
					if (Client.gameCycle >= anInt631) {
						model = null;
					}

					if ((Client.gameCycle >= anInt630) && (Client.gameCycle < anInt631)) {
						model_1 = model;
						model_1.method961(anInt633 - super.anInt547, anInt634 - anInt635, anInt636 - super.anInt550);
						if (super.orientation == 512) {
							model_1.method956();
							model_1.method956();
							model_1.method956();
						} else if (super.orientation == 1024) {
							model_1.method956();
							model_1.method956();
						} else if (super.orientation == 1536) {
							model_1.method956();
						}

						models_0 = new Model[] { model_0, model_1 };
						model_0 = new Model(models_0, 2);
						if (super.orientation == 512) {
							model_1.method956();
						} else if (super.orientation == 1024) {
							model_1.method956();
							model_1.method956();
						} else if (super.orientation == 1536) {
							model_1.method956();
							model_1.method956();
							model_1.method956();
						}

						model_1.method961(super.anInt547 - anInt633, anInt635 - anInt634, super.anInt550 - anInt636);
					}
				}

				model_0.aBool66 = true;
				return model_0;
			}
		}
	}

	void method1032(final int int_0, final int int_1) {
		super.queueSize = 0;
		super.anInt540 = 0;
		super.anInt541 = 0;
		super.pathX[0] = int_0;
		super.pathY[0] = int_1;
		final int int_2 = getSize();
		super.anInt547 = (int_2 * 64) + (super.pathX[0] * 128);
		super.anInt550 = (64 * int_2) + (128 * super.pathY[0]);
	}

	int getSize() {
		return (composition != null) && (composition.transformedNpcId != -1)
				? Class81.getNpcDefinition(composition.transformedNpcId).anInt518 : 1;
	}

	final void method1033(final int int_0, final int int_1, final byte byte_0) {
		if (super.queueSize < 9) {
			++super.queueSize;
		}

		for (int int_2 = super.queueSize; int_2 > 0; --int_2) {
			super.pathX[int_2] = super.pathX[int_2 - 1];
			super.pathY[int_2] = super.pathY[int_2 - 1];
			super.aByteArray21[int_2] = super.aByteArray21[int_2 - 1];
		}

		super.pathX[0] = int_0;
		super.pathY[0] = int_1;
		super.aByteArray21[0] = byte_0;
	}

	@Override
	final boolean hasConfig() {
		return composition != null;
	}

	final void decodeApperance(final Buffer buffer_0) {
		buffer_0.offset = 0;
		final int int_0 = buffer_0.readUnsignedByte();
		skullIcon = buffer_0.readByte();
		overheadIcon = buffer_0.readByte();
		int int_1 = -1;
		team = 0;
		final int[] ints_0 = new int[12];

		int int_3;
		int int_4;
		for (int int_2 = 0; int_2 < 12; int_2++) {
			int_3 = buffer_0.readUnsignedByte();
			if (int_3 == 0) {
				ints_0[int_2] = 0;
			} else {
				int_4 = buffer_0.readUnsignedByte();
				ints_0[int_2] = int_4 + (int_3 << 8);
				if ((int_2 == 0) && (ints_0[0] == 65535)) {
					int_1 = buffer_0.readUnsignedShort();
					break;
				}

				if (ints_0[int_2] >= 512) {
					final int int_5 = Class45.getItemDefinition(ints_0[int_2] - 512).anInt534;
					if (int_5 != 0) {
						team = int_5;
					}
				}
			}
		}

		final int[] ints_1 = new int[5];

		for (int_3 = 0; int_3 < 5; int_3++) {
			int_4 = buffer_0.readUnsignedByte();
			if ((int_4 < 0) || (int_4 >= Class76.colorsToReplace[int_3].length)) {
				int_4 = 0;
			}

			ints_1[int_3] = int_4;
		}

		super.idlePoseAnimation = buffer_0.readUnsignedShort();
		if (super.idlePoseAnimation == 65535) {
			super.idlePoseAnimation = -1;
		}

		super.anInt543 = buffer_0.readUnsignedShort();
		if (super.anInt543 == 65535) {
			super.anInt543 = -1;
		}

		super.anInt544 = super.anInt543;
		super.anInt545 = buffer_0.readUnsignedShort();
		if (super.anInt545 == 65535) {
			super.anInt545 = -1;
		}

		super.anInt546 = buffer_0.readUnsignedShort();
		if (super.anInt546 == 65535) {
			super.anInt546 = -1;
		}

		super.anInt548 = buffer_0.readUnsignedShort();
		if (super.anInt548 == 65535) {
			super.anInt548 = -1;
		}

		super.anInt549 = buffer_0.readUnsignedShort();
		if (super.anInt549 == 65535) {
			super.anInt549 = -1;
		}

		super.anInt551 = buffer_0.readUnsignedShort();
		if (super.anInt551 == 65535) {
			super.anInt551 = -1;
		}

		name = buffer_0.readString();
		if (this == Script.localPlayer) {
			RuntimeException_Sub1.aString31 = name;
		}

		combatLevel = buffer_0.readUnsignedByte();
		totalLevel = buffer_0.readUnsignedShort();
		hidden = buffer_0.readUnsignedByte() == 1;
		if ((Client.socketType == 0) && (Client.rights >= 2)) {
			hidden = false;
		}

		if (composition == null) {
			composition = new PlayerComposition();
		}

		composition.method480(ints_0, ints_1, int_0 == 1, int_1);
	}

	final void method1034(final int int_0, final int int_1, final byte byte_0) {
		if ((super.animation != -1) && (Class54.getAnimation(super.animation).priority == 1)) {
			super.animation = -1;
		}

		super.anInt539 = -1;
		if ((int_0 >= 0) && (int_0 < 104) && (int_1 >= 0) && (int_1 < 104)) {
			if ((super.pathX[0] >= 0) && (super.pathX[0] < 104) && (super.pathY[0] >= 0) && (super.pathY[0] < 104)) {
				if (byte_0 == 2) {
					final Player player_1 = this;
					final int int_2 = super.pathX[0];
					final int int_3 = super.pathY[0];
					final int int_4 = getSize();
					if ((int_2 >= int_4) && (int_2 < (104 - int_4)) && (int_3 >= int_4) && (int_3 < (104 - int_4))
							&& (int_0 >= int_4) && (int_0 < (104 - int_4)) && (int_1 >= int_4)
							&& (int_1 < (104 - int_4))) {
						final int int_5 = getSize();
						final AClass2 aclass2_0 = RSCanvas.method694(int_0, int_1);
						final CollisionData collisiondata_0 = Client.collisionMaps[anInt632];
						final int[] ints_0 = Client.anIntArray142;
						final int[] ints_1 = Client.anIntArray143;

						int int_6;
						int int_7;
						for (int_6 = 0; int_6 < 128; int_6++) {
							for (int_7 = 0; int_7 < 128; int_7++) {
								Class60.anIntArrayArray10[int_6][int_7] = 0;
								Class60.anIntArrayArray11[int_6][int_7] = 99999999;
							}
						}

						int int_8;
						int int_9;
						byte byte_2;
						int int_10;
						int int_11;
						int int_12;
						int int_14;
						int int_15;
						int int_16;
						int int_17;
						boolean bool_0;
						int int_23;
						int int_24;
						int int_25;
						if (int_5 == 1) {
							bool_0 = Class51.method307(int_2, int_3, aclass2_0, collisiondata_0);
						} else {
							byte byte_1;
							byte byte_3;
							int[][] ints_2;
							boolean bool_1;
							if (int_5 == 2) {
								int_8 = int_2;
								int_9 = int_3;
								byte_1 = 64;
								byte_2 = 64;
								int_10 = int_2 - byte_1;
								int_11 = int_3 - byte_2;
								Class60.anIntArrayArray10[byte_1][byte_2] = 99;
								Class60.anIntArrayArray11[byte_1][byte_2] = 0;
								byte_3 = 0;
								int_12 = 0;
								Class60.anIntArray38[byte_3] = int_2;
								int_25 = byte_3 + 1;
								Class60.anIntArray39[byte_3] = int_3;
								ints_2 = collisiondata_0.flags;

								while (true) {
									if (int_12 == int_25) {
										Class60.anInt160 = int_8;
										FaceNormal.anInt235 = int_9;
										bool_1 = false;
										break;
									}

									int_8 = Class60.anIntArray38[int_12];
									int_9 = Class60.anIntArray39[int_12];
									int_12 = (int_12 + 1) & 0xFFF;
									int_23 = int_8 - int_10;
									int_24 = int_9 - int_11;
									int_14 = int_8 - collisiondata_0.anInt273;
									int_15 = int_9 - collisiondata_0.anInt274;
									if (aclass2_0.method387(2, int_8, int_9, collisiondata_0)) {
										Class60.anInt160 = int_8;
										FaceNormal.anInt235 = int_9;
										bool_1 = true;
										break;
									}

									int_16 = Class60.anIntArrayArray11[int_23][int_24] + 1;
									if ((int_23 > 0) && (Class60.anIntArrayArray10[int_23 - 1][int_24] == 0)
											&& ((ints_2[int_14 - 1][int_15] & 0x124010E) == 0)
											&& ((ints_2[int_14 - 1][int_15 + 1] & 0x1240138) == 0)) {
										Class60.anIntArray38[int_25] = int_8 - 1;
										Class60.anIntArray39[int_25] = int_9;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23 - 1][int_24] = 2;
										Class60.anIntArrayArray11[int_23 - 1][int_24] = int_16;
									}

									if ((int_23 < 126) && (Class60.anIntArrayArray10[int_23 + 1][int_24] == 0)
											&& ((ints_2[int_14 + 2][int_15] & 0x1240183) == 0)
											&& ((ints_2[int_14 + 2][int_15 + 1] & 0x12401E0) == 0)) {
										Class60.anIntArray38[int_25] = int_8 + 1;
										Class60.anIntArray39[int_25] = int_9;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23 + 1][int_24] = 8;
										Class60.anIntArrayArray11[int_23 + 1][int_24] = int_16;
									}

									if ((int_24 > 0) && (Class60.anIntArrayArray10[int_23][int_24 - 1] == 0)
											&& ((ints_2[int_14][int_15 - 1] & 0x124010E) == 0)
											&& ((ints_2[int_14 + 1][int_15 - 1] & 0x1240183) == 0)) {
										Class60.anIntArray38[int_25] = int_8;
										Class60.anIntArray39[int_25] = int_9 - 1;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23][int_24 - 1] = 1;
										Class60.anIntArrayArray11[int_23][int_24 - 1] = int_16;
									}

									if ((int_24 < 126) && (Class60.anIntArrayArray10[int_23][int_24 + 1] == 0)
											&& ((ints_2[int_14][int_15 + 2] & 0x1240138) == 0)
											&& ((ints_2[int_14 + 1][int_15 + 2] & 0x12401E0) == 0)) {
										Class60.anIntArray38[int_25] = int_8;
										Class60.anIntArray39[int_25] = int_9 + 1;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23][int_24 + 1] = 4;
										Class60.anIntArrayArray11[int_23][int_24 + 1] = int_16;
									}

									if ((int_23 > 0) && (int_24 > 0)
											&& (Class60.anIntArrayArray10[int_23 - 1][int_24 - 1] == 0)
											&& ((ints_2[int_14 - 1][int_15] & 0x124013E) == 0)
											&& ((ints_2[int_14 - 1][int_15 - 1] & 0x124010E) == 0)
											&& ((ints_2[int_14][int_15 - 1] & 0x124018F) == 0)) {
										Class60.anIntArray38[int_25] = int_8 - 1;
										Class60.anIntArray39[int_25] = int_9 - 1;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23 - 1][int_24 - 1] = 3;
										Class60.anIntArrayArray11[int_23 - 1][int_24 - 1] = int_16;
									}

									if ((int_23 < 126) && (int_24 > 0)
											&& (Class60.anIntArrayArray10[int_23 + 1][int_24 - 1] == 0)
											&& ((ints_2[int_14 + 1][int_15 - 1] & 0x124018F) == 0)
											&& ((ints_2[int_14 + 2][int_15 - 1] & 0x1240183) == 0)
											&& ((ints_2[int_14 + 2][int_15] & 0x12401E3) == 0)) {
										Class60.anIntArray38[int_25] = int_8 + 1;
										Class60.anIntArray39[int_25] = int_9 - 1;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23 + 1][int_24 - 1] = 9;
										Class60.anIntArrayArray11[int_23 + 1][int_24 - 1] = int_16;
									}

									if ((int_23 > 0) && (int_24 < 126)
											&& (Class60.anIntArrayArray10[int_23 - 1][int_24 + 1] == 0)
											&& ((ints_2[int_14 - 1][int_15 + 1] & 0x124013E) == 0)
											&& ((ints_2[int_14 - 1][int_15 + 2] & 0x1240138) == 0)
											&& ((ints_2[int_14][2 + int_15] & 0x12401F8) == 0)) {
										Class60.anIntArray38[int_25] = int_8 - 1;
										Class60.anIntArray39[int_25] = int_9 + 1;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23 - 1][int_24 + 1] = 6;
										Class60.anIntArrayArray11[int_23 - 1][int_24 + 1] = int_16;
									}

									if ((int_23 < 126) && (int_24 < 126)
											&& (Class60.anIntArrayArray10[1 + int_23][int_24 + 1] == 0)
											&& ((ints_2[int_14 + 1][int_15 + 2] & 0x12401F8) == 0)
											&& ((ints_2[int_14 + 2][int_15 + 2] & 0x12401E0) == 0)
											&& ((ints_2[int_14 + 2][int_15 + 1] & 0x12401E3) == 0)) {
										Class60.anIntArray38[int_25] = int_8 + 1;
										Class60.anIntArray39[int_25] = int_9 + 1;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23 + 1][int_24 + 1] = 12;
										Class60.anIntArrayArray11[int_23 + 1][int_24 + 1] = int_16;
									}
								}

								bool_0 = bool_1;
							} else {
								int_8 = int_2;
								int_9 = int_3;
								byte_1 = 64;
								byte_2 = 64;
								int_10 = int_2 - byte_1;
								int_11 = int_3 - byte_2;
								Class60.anIntArrayArray10[byte_1][byte_2] = 99;
								Class60.anIntArrayArray11[byte_1][byte_2] = 0;
								byte_3 = 0;
								int_12 = 0;
								Class60.anIntArray38[byte_3] = int_2;
								int_25 = byte_3 + 1;
								Class60.anIntArray39[byte_3] = int_3;
								ints_2 = collisiondata_0.flags;

								label534: while (true) {
									if (int_12 == int_25) {
										Class60.anInt160 = int_8;
										FaceNormal.anInt235 = int_9;
										bool_1 = false;
										break;
									}

									int_8 = Class60.anIntArray38[int_12];
									int_9 = Class60.anIntArray39[int_12];
									int_12 = (int_12 + 1) & 0xFFF;
									int_23 = int_8 - int_10;
									int_24 = int_9 - int_11;
									int_14 = int_8 - collisiondata_0.anInt273;
									int_15 = int_9 - collisiondata_0.anInt274;
									if (aclass2_0.method387(int_5, int_8, int_9, collisiondata_0)) {
										Class60.anInt160 = int_8;
										FaceNormal.anInt235 = int_9;
										bool_1 = true;
										break;
									}

									int_16 = Class60.anIntArrayArray11[int_23][int_24] + 1;
									if ((int_23 > 0) && (Class60.anIntArrayArray10[int_23 - 1][int_24] == 0)
											&& ((ints_2[int_14 - 1][int_15] & 0x124010E) == 0)
											&& ((ints_2[int_14 - 1][(int_15 + int_5) - 1] & 0x1240138) == 0)) {
										int_17 = 1;

										while (true) {
											if (int_17 >= (int_5 - 1)) {
												Class60.anIntArray38[int_25] = int_8 - 1;
												Class60.anIntArray39[int_25] = int_9;
												int_25 = (int_25 + 1) & 0xFFF;
												Class60.anIntArrayArray10[int_23 - 1][int_24] = 2;
												Class60.anIntArrayArray11[int_23 - 1][int_24] = int_16;
												break;
											}

											if ((ints_2[int_14 - 1][int_15 + int_17] & 0x124013E) != 0) {
												break;
											}

											++int_17;
										}
									}

									if ((int_23 < (128 - int_5)) && (Class60.anIntArrayArray10[int_23 + 1][int_24] == 0)
											&& ((ints_2[int_14 + int_5][int_15] & 0x1240183) == 0)
											&& ((ints_2[int_5 + int_14][(int_15 + int_5) - 1] & 0x12401E0) == 0)) {
										int_17 = 1;

										while (true) {
											if (int_17 >= (int_5 - 1)) {
												Class60.anIntArray38[int_25] = int_8 + 1;
												Class60.anIntArray39[int_25] = int_9;
												int_25 = (int_25 + 1) & 0xFFF;
												Class60.anIntArrayArray10[int_23 + 1][int_24] = 8;
												Class60.anIntArrayArray11[int_23 + 1][int_24] = int_16;
												break;
											}

											if ((ints_2[int_14 + int_5][int_17 + int_15] & 0x12401E3) != 0) {
												break;
											}

											++int_17;
										}
									}

									if ((int_24 > 0) && (Class60.anIntArrayArray10[int_23][int_24 - 1] == 0)
											&& ((ints_2[int_14][int_15 - 1] & 0x124010E) == 0)
											&& ((ints_2[(int_5 + int_14) - 1][int_15 - 1] & 0x1240183) == 0)) {
										int_17 = 1;

										while (true) {
											if (int_17 >= (int_5 - 1)) {
												Class60.anIntArray38[int_25] = int_8;
												Class60.anIntArray39[int_25] = int_9 - 1;
												int_25 = (int_25 + 1) & 0xFFF;
												Class60.anIntArrayArray10[int_23][int_24 - 1] = 1;
												Class60.anIntArrayArray11[int_23][int_24 - 1] = int_16;
												break;
											}

											if ((ints_2[int_14 + int_17][int_15 - 1] & 0x124018F) != 0) {
												break;
											}

											++int_17;
										}
									}

									if ((int_24 < (128 - int_5)) && (Class60.anIntArrayArray10[int_23][int_24 + 1] == 0)
											&& ((ints_2[int_14][int_15 + int_5] & 0x1240138) == 0)
											&& ((ints_2[(int_14 + int_5) - 1][int_5 + int_15] & 0x12401E0) == 0)) {
										int_17 = 1;

										while (true) {
											if (int_17 >= (int_5 - 1)) {
												Class60.anIntArray38[int_25] = int_8;
												Class60.anIntArray39[int_25] = int_9 + 1;
												int_25 = (int_25 + 1) & 0xFFF;
												Class60.anIntArrayArray10[int_23][int_24 + 1] = 4;
												Class60.anIntArrayArray11[int_23][int_24 + 1] = int_16;
												break;
											}

											if ((ints_2[int_14 + int_17][int_5 + int_15] & 0x12401F8) != 0) {
												break;
											}

											++int_17;
										}
									}

									if ((int_23 > 0) && (int_24 > 0)
											&& (Class60.anIntArrayArray10[int_23 - 1][int_24 - 1] == 0)
											&& ((ints_2[int_14 - 1][int_15 - 1] & 0x124010E) == 0)) {
										int_17 = 1;

										while (true) {
											if (int_17 >= int_5) {
												Class60.anIntArray38[int_25] = int_8 - 1;
												Class60.anIntArray39[int_25] = int_9 - 1;
												int_25 = (int_25 + 1) & 0xFFF;
												Class60.anIntArrayArray10[int_23 - 1][int_24 - 1] = 3;
												Class60.anIntArrayArray11[int_23 - 1][int_24 - 1] = int_16;
												break;
											}

											if (((ints_2[int_14 - 1][int_17 + (int_15 - 1)] & 0x124013E) != 0)
													|| ((ints_2[(int_14 - 1) + int_17][int_15 - 1] & 0x124018F) != 0)) {
												break;
											}

											++int_17;
										}
									}

									if ((int_23 < (128 - int_5)) && (int_24 > 0)
											&& (Class60.anIntArrayArray10[1 + int_23][int_24 - 1] == 0)
											&& ((ints_2[int_5 + int_14][int_15 - 1] & 0x1240183) == 0)) {
										int_17 = 1;

										while (true) {
											if (int_17 >= int_5) {
												Class60.anIntArray38[int_25] = int_8 + 1;
												Class60.anIntArray39[int_25] = int_9 - 1;
												int_25 = (int_25 + 1) & 0xFFF;
												Class60.anIntArrayArray10[int_23 + 1][int_24 - 1] = 9;
												Class60.anIntArrayArray11[int_23 + 1][int_24 - 1] = int_16;
												break;
											}

											if (((ints_2[int_5 + int_14][(int_15 - 1) + int_17] & 0x12401E3) != 0)
													|| ((ints_2[int_14 + int_17][int_15 - 1] & 0x124018F) != 0)) {
												break;
											}

											++int_17;
										}
									}

									if ((int_23 > 0) && (int_24 < (128 - int_5))
											&& (Class60.anIntArrayArray10[int_23 - 1][int_24 + 1] == 0)
											&& ((ints_2[int_14 - 1][int_15 + int_5] & 0x1240138) == 0)) {
										int_17 = 1;

										while (true) {
											if (int_17 >= int_5) {
												Class60.anIntArray38[int_25] = int_8 - 1;
												Class60.anIntArray39[int_25] = int_9 + 1;
												int_25 = (int_25 + 1) & 0xFFF;
												Class60.anIntArrayArray10[int_23 - 1][int_24 + 1] = 6;
												Class60.anIntArrayArray11[int_23 - 1][int_24 + 1] = int_16;
												break;
											}

											if (((ints_2[int_14 - 1][int_15 + int_17] & 0x124013E) != 0)
													|| ((ints_2[(int_14 - 1) + int_17][int_5 + int_15]
															& 0x12401F8) != 0)) {
												break;
											}

											++int_17;
										}
									}

									if ((int_23 < (128 - int_5)) && (int_24 < (128 - int_5))
											&& (Class60.anIntArrayArray10[1 + int_23][int_24 + 1] == 0)
											&& ((ints_2[int_5 + int_14][int_5 + int_15] & 0x12401E0) == 0)) {
										for (int_17 = 1; int_17 < int_5; int_17++) {
											if (((ints_2[int_17 + int_14][int_15 + int_5] & 0x12401F8) != 0)
													|| ((ints_2[int_5 + int_14][int_15 + int_17] & 0x12401E3) != 0)) {
												continue label534;
											}
										}

										Class60.anIntArray38[int_25] = int_8 + 1;
										Class60.anIntArray39[int_25] = int_9 + 1;
										int_25 = (int_25 + 1) & 0xFFF;
										Class60.anIntArrayArray10[int_23 + 1][int_24 + 1] = 12;
										Class60.anIntArrayArray11[int_23 + 1][int_24 + 1] = int_16;
									}
								}

								bool_0 = bool_1;
							}
						}

						int int_22;
						label586: {
							int_7 = int_2 - 64;
							int_8 = int_3 - 64;
							int_9 = Class60.anInt160;
							int_23 = FaceNormal.anInt235;
							if (!bool_0) {
								int_24 = Integer.MAX_VALUE;
								int_10 = Integer.MAX_VALUE;
								final byte byte_4 = 10;
								int_25 = aclass2_0.anInt166;
								int_12 = aclass2_0.anInt167;
								final int int_13 = aclass2_0.anInt168;
								int_14 = aclass2_0.anInt169;

								for (int_15 = int_25 - byte_4; int_15 <= (byte_4 + int_25); int_15++) {
									for (int_16 = int_12 - byte_4; int_16 <= (int_12 + byte_4); int_16++) {
										int_17 = int_15 - int_7;
										final int int_18 = int_16 - int_8;
										if ((int_17 >= 0) && (int_18 >= 0) && (int_17 < 128) && (int_18 < 128)
												&& (Class60.anIntArrayArray11[int_17][int_18] < 100)) {
											int int_19 = 0;
											if (int_15 < int_25) {
												int_19 = int_25 - int_15;
											} else if (int_15 > ((int_13 + int_25) - 1)) {
												int_19 = int_15 - ((int_25 + int_13) - 1);
											}

											int int_20 = 0;
											if (int_16 < int_12) {
												int_20 = int_12 - int_16;
											} else if (int_16 > ((int_12 + int_14) - 1)) {
												int_20 = int_16 - ((int_12 + int_14) - 1);
											}

											final int int_21 = (int_19 * int_19) + (int_20 * int_20);
											if ((int_21 < int_24) || ((int_24 == int_21)
													&& (Class60.anIntArrayArray11[int_17][int_18] < int_10))) {
												int_24 = int_21;
												int_10 = Class60.anIntArrayArray11[int_17][int_18];
												int_9 = int_15;
												int_23 = int_16;
											}
										}
									}
								}

								if (int_24 == Integer.MAX_VALUE) {
									int_22 = -1;
									break label586;
								}
							}

							if ((int_2 == int_9) && (int_23 == int_3)) {
								int_22 = 0;
							} else {
								byte_2 = 0;
								Class60.anIntArray38[byte_2] = int_9;
								int_24 = byte_2 + 1;
								Class60.anIntArray39[byte_2] = int_23;
								int_10 = int_11 = Class60.anIntArrayArray10[int_9 - int_7][int_23 - int_8];

								while (true) {
									if ((int_9 == int_2) && (int_3 == int_23)) {
										int_25 = 0;

										while (int_24-- > 0) {
											ints_0[int_25] = Class60.anIntArray38[int_24];
											ints_1[int_25++] = Class60.anIntArray39[int_24];
											if (int_25 >= ints_0.length) {
												break;
											}
										}

										int_22 = int_25;
										break;
									}

									if (int_10 != int_11) {
										int_11 = int_10;
										Class60.anIntArray38[int_24] = int_9;
										Class60.anIntArray39[int_24++] = int_23;
									}

									if ((int_10 & 0x2) != 0) {
										++int_9;
									} else if ((int_10 & 0x8) != 0) {
										--int_9;
									}

									if ((int_10 & 0x1) != 0) {
										++int_23;
									} else if ((int_10 & 0x4) != 0) {
										--int_23;
									}

									int_10 = Class60.anIntArrayArray10[int_9 - int_7][int_23 - int_8];
								}
							}
						}

						int_6 = int_22;
						if (int_22 >= 1) {
							for (int_7 = 0; int_7 < (int_6 - 1); int_7++) {
								player_1.method1033(Client.anIntArray142[int_7], Client.anIntArray143[int_7], (byte) 2);
							}
						}
					}
				}

				method1033(int_0, int_1, byte_0);
			} else {
				method1032(int_0, int_1);
			}
		} else {
			method1032(int_0, int_1);
		}
	}

	static int method1035() {
		return Client.isResized ? 2 : 1;
	}

	static final void method1036() {
		final int int_0 = Class18.menuX;
		final int int_1 = AClass4_Sub1.menuY;
		final int int_2 = AClass4_Sub1.menuWidth;
		final int int_3 = Class28.menuHeight;
		final int int_4 = 6116423;
		Rasterizer2D.method853(int_0, int_1, int_2, int_3, int_4);
		Rasterizer2D.method853(int_0 + 1, int_1 + 1, int_2 - 2, 16, 0);
		Rasterizer2D.drawRectangle(int_0 + 1, int_1 + 18, int_2 - 2, int_3 - 19, 0);
		Class36.aFont3.method975("Choose Option", int_0 + 3, int_1 + 14, int_4, -1);
		final int int_5 = MouseInput.anInt278;
		final int int_6 = MouseInput.anInt280;

		int int_7;
		int int_8;
		int int_9;
		for (int_7 = 0; int_7 < Client.menuOptionCount; int_7++) {
			int_8 = int_1 + 31 + ((Client.menuOptionCount - 1 - int_7) * 15);
			int_9 = 16777215;
			if ((int_5 > int_0) && (int_5 < (int_0 + int_2)) && (int_6 > (int_8 - 13)) && (int_6 < (int_8 + 3))) {
				int_9 = 16776960;
			}

			final Font font_0 = Class36.aFont3;
			String string_0;
			if (int_7 < 0) {
				string_0 = "";
			} else if (Client.menuTargets[int_7].length() > 0) {
				string_0 = Client.menuOptions[int_7] + " " + Client.menuTargets[int_7];
			} else {
				string_0 = Client.menuOptions[int_7];
			}

			font_0.method975(string_0, int_0 + 3, int_8, int_9, 0);
		}

		int_7 = Class18.menuX;
		int_8 = AClass4_Sub1.menuY;
		int_9 = AClass4_Sub1.menuWidth;
		final int int_10 = Class28.menuHeight;

		for (int int_11 = 0; int_11 < Client.anInt647; int_11++) {
			if (((Client.widgetBoundsWidth[int_11] + Client.widgetPositionX[int_11]) > int_7)
					&& (Client.widgetPositionX[int_11] < (int_7 + int_9))
					&& ((Client.widgetBoundsHeight[int_11] + Client.widgetPositionY[int_11]) > int_8)
					&& (Client.widgetPositionY[int_11] < (int_8 + int_10))) {
				Client.aBoolArray10[int_11] = true;
			}
		}

	}

	public static void method1037(final Huffman huffman_0) {
		Class99.aHuffman1 = huffman_0;
	}

	static final int hsl24to16(final int int_0, int int_1, final int int_2) {
		if (int_2 > 179) {
			int_1 /= 2;
		}

		if (int_2 > 192) {
			int_1 /= 2;
		}

		if (int_2 > 217) {
			int_1 /= 2;
		}

		if (int_2 > 243) {
			int_1 /= 2;
		}

		final int int_3 = ((int_1 / 32) << 7) + ((int_0 / 4) << 10) + (int_2 / 2);
		return int_3;
	}

}
