public final class Class22 {

	static int anInt75;

	public static int method210(final CharSequence charsequence_0, final int int_0) {
		return Class104.parseInt(charsequence_0, int_0, true);
	}

	static final void method211(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6, final int int_7, final int int_8) {
		PendingSpawn pendingspawn_0 = null;

		for (PendingSpawn pendingspawn_1 = (PendingSpawn) Client.pendingSpawns
				.getFront(); pendingspawn_1 != null; pendingspawn_1 = (PendingSpawn) Client.pendingSpawns.getNext()) {
			if ((int_0 == pendingspawn_1.level) && (pendingspawn_1.anInt363 == int_1)
					&& (int_2 == pendingspawn_1.anInt364) && (int_3 == pendingspawn_1.type)) {
				pendingspawn_0 = pendingspawn_1;
				break;
			}
		}

		if (pendingspawn_0 == null) {
			pendingspawn_0 = new PendingSpawn();
			pendingspawn_0.level = int_0;
			pendingspawn_0.type = int_3;
			pendingspawn_0.anInt363 = int_1;
			pendingspawn_0.anInt364 = int_2;
			Signlink.method478(pendingspawn_0);
			Client.pendingSpawns.addFront(pendingspawn_0);
		}

		pendingspawn_0.anInt366 = int_4;
		pendingspawn_0.anInt368 = int_5;
		pendingspawn_0.orientation = int_6;
		pendingspawn_0.delay = int_7;
		pendingspawn_0.hitpoints = int_8;
	}

	static final void addObject(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final Region region_0, final CollisionData collisiondata_0) {
		if (!Client.lowMemory || ((Class18.tileSettings[0][int_1][int_2] & 0x2) != 0)
				|| ((Class18.tileSettings[int_0][int_1][int_2] & 0x10) == 0)) {
			if (int_0 < Class18.anInt71) {
				Class18.anInt71 = int_0;
			}

			final ObjectComposition objectcomposition_0 = PlayerComposition.getObjectDefinition(int_3);
			int int_6;
			int int_7;
			if ((int_4 != 1) && (int_4 != 3)) {
				int_6 = objectcomposition_0.sizeX;
				int_7 = objectcomposition_0.sizeY;
			} else {
				int_6 = objectcomposition_0.sizeY;
				int_7 = objectcomposition_0.sizeX;
			}

			int int_8;
			int int_9;
			if ((int_6 + int_1) <= 104) {
				int_8 = int_1 + (int_6 >> 1);
				int_9 = ((int_6 + 1) >> 1) + int_1;
			} else {
				int_8 = int_1;
				int_9 = int_1 + 1;
			}

			int int_10;
			int int_11;
			if ((int_7 + int_2) <= 104) {
				int_10 = int_2 + (int_7 >> 1);
				int_11 = ((int_7 + 1) >> 1) + int_2;
			} else {
				int_10 = int_2;
				int_11 = int_2 + 1;
			}

			final int[][] ints_0 = Class18.tileHeights[int_0];
			final int int_12 = (ints_0[int_9][int_11] + ints_0[int_8][int_11] + ints_0[int_9][int_10]
					+ ints_0[int_8][int_10]) >> 2;
			final int int_13 = (int_1 << 7) + (int_6 << 6);
			final int int_14 = (int_2 << 7) + (int_7 << 6);
			int int_15 = (int_3 << 14) + (int_2 << 7) + int_1 + 1073741824;
			if (objectcomposition_0.anInt491 == 0) {
				int_15 -= Integer.MIN_VALUE;
			}

			int int_16 = int_5 + (int_4 << 6);
			if (objectcomposition_0.anInt492 == 1) {
				int_16 += 256;
			}

			int int_17;
			int int_18;
			if (objectcomposition_0.method800()) {
				final Node_Sub1 node_sub1_0 = new Node_Sub1();
				node_sub1_0.anInt345 = int_0;
				node_sub1_0.anInt342 = int_1 * 128;
				node_sub1_0.anInt344 = int_2 * 128;
				int_17 = objectcomposition_0.sizeX;
				int_18 = objectcomposition_0.sizeY;
				if ((int_4 == 1) || (int_4 == 3)) {
					int_17 = objectcomposition_0.sizeY;
					int_18 = objectcomposition_0.sizeX;
				}

				node_sub1_0.anInt341 = (int_17 + int_1) * 128;
				node_sub1_0.anInt343 = (int_18 + int_2) * 128;
				node_sub1_0.anInt337 = objectcomposition_0.ambientSoundId;
				node_sub1_0.anInt338 = objectcomposition_0.anInt494 * 128;
				node_sub1_0.anInt339 = objectcomposition_0.anInt495;
				node_sub1_0.anInt340 = objectcomposition_0.anInt496;
				node_sub1_0.anIntArray76 = objectcomposition_0.anIntArray101;
				if (objectcomposition_0.impostorIds != null) {
					node_sub1_0.anObjectComposition1 = objectcomposition_0;
					node_sub1_0.method608();
				}

				Node_Sub1.aDeque3.addFront(node_sub1_0);
				if (node_sub1_0.anIntArray76 != null) {
					node_sub1_0.anInt346 = node_sub1_0.anInt339
							+ (int) (Math.random() * (node_sub1_0.anInt340 - node_sub1_0.anInt339));
				}
			}

			Object object_3;
			if (int_5 == 22) {
				if (!Client.lowMemory || (objectcomposition_0.anInt491 != 0) || (objectcomposition_0.interactType == 1)
						|| objectcomposition_0.aBool54) {
					if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
						object_3 = objectcomposition_0.getModel(22, int_4, ints_0, int_13, int_12, int_14);
					} else {
						object_3 = new DynamicObject(int_3, 22, int_4, int_0, int_1, int_2,
								objectcomposition_0.animationId, true, (Renderable) null);
					}

					region_0.groundObjectSpawned(int_0, int_1, int_2, int_12, (Renderable) object_3, int_15, int_16);
					if ((objectcomposition_0.interactType == 1) && (collisiondata_0 != null)) {
						collisiondata_0.block(int_1, int_2);
					}

				}
			} else if ((int_5 != 10) && (int_5 != 11)) {
				if (int_5 >= 12) {
					if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
						object_3 = objectcomposition_0.getModel(int_5, int_4, ints_0, int_13, int_12, int_14);
					} else {
						object_3 = new DynamicObject(int_3, int_5, int_4, int_0, int_1, int_2,
								objectcomposition_0.animationId, true, (Renderable) null);
					}

					region_0.method371(int_0, int_1, int_2, int_12, 1, 1, (Renderable) object_3, 0, int_15, int_16);
					if ((int_5 >= 12) && (int_5 <= 17) && (int_5 != 13) && (int_0 > 0)) {
						AClass4.anIntArrayArrayArray1[int_0][int_1][int_2] |= 0x924;
					}

					if ((objectcomposition_0.interactType != 0) && (collisiondata_0 != null)) {
						collisiondata_0.addObject(int_1, int_2, int_6, int_7, objectcomposition_0.aBool53);
					}

				} else if (int_5 == 0) {
					if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
						object_3 = objectcomposition_0.getModel(0, int_4, ints_0, int_13, int_12, int_14);
					} else {
						object_3 = new DynamicObject(int_3, 0, int_4, int_0, int_1, int_2,
								objectcomposition_0.animationId, true, (Renderable) null);
					}

					region_0.addBoundary(int_0, int_1, int_2, int_12, (Renderable) object_3, (Renderable) null,
							Class18.anIntArray2[int_4], 0, int_15, int_16);
					if (int_4 == 0) {
						if (objectcomposition_0.clipped) {
							Class18.aByteArrayArrayArray4[int_0][int_1][int_2] = 50;
							Class18.aByteArrayArrayArray4[int_0][int_1][int_2 + 1] = 50;
						}

						if (objectcomposition_0.modelClipped) {
							AClass4.anIntArrayArrayArray1[int_0][int_1][int_2] |= 0x249;
						}
					} else if (int_4 == 1) {
						if (objectcomposition_0.clipped) {
							Class18.aByteArrayArrayArray4[int_0][int_1][int_2 + 1] = 50;
							Class18.aByteArrayArrayArray4[int_0][int_1 + 1][int_2 + 1] = 50;
						}

						if (objectcomposition_0.modelClipped) {
							AClass4.anIntArrayArrayArray1[int_0][int_1][1 + int_2] |= 0x492;
						}
					} else if (int_4 == 2) {
						if (objectcomposition_0.clipped) {
							Class18.aByteArrayArrayArray4[int_0][int_1 + 1][int_2] = 50;
							Class18.aByteArrayArrayArray4[int_0][int_1 + 1][int_2 + 1] = 50;
						}

						if (objectcomposition_0.modelClipped) {
							AClass4.anIntArrayArrayArray1[int_0][int_1 + 1][int_2] |= 0x249;
						}
					} else if (int_4 == 3) {
						if (objectcomposition_0.clipped) {
							Class18.aByteArrayArrayArray4[int_0][int_1][int_2] = 50;
							Class18.aByteArrayArrayArray4[int_0][int_1 + 1][int_2] = 50;
						}

						if (objectcomposition_0.modelClipped) {
							AClass4.anIntArrayArrayArray1[int_0][int_1][int_2] |= 0x492;
						}
					}

					if ((objectcomposition_0.interactType != 0) && (collisiondata_0 != null)) {
						collisiondata_0.addWall(int_1, int_2, int_5, int_4, objectcomposition_0.aBool53);
					}

					if (objectcomposition_0.anInt497 != 16) {
						region_0.method372(int_0, int_1, int_2, objectcomposition_0.anInt497);
					}

				} else if (int_5 == 1) {
					if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
						object_3 = objectcomposition_0.getModel(1, int_4, ints_0, int_13, int_12, int_14);
					} else {
						object_3 = new DynamicObject(int_3, 1, int_4, int_0, int_1, int_2,
								objectcomposition_0.animationId, true, (Renderable) null);
					}

					region_0.addBoundary(int_0, int_1, int_2, int_12, (Renderable) object_3, (Renderable) null,
							Class18.anIntArray3[int_4], 0, int_15, int_16);
					if (objectcomposition_0.clipped) {
						if (int_4 == 0) {
							Class18.aByteArrayArrayArray4[int_0][int_1][int_2 + 1] = 50;
						} else if (int_4 == 1) {
							Class18.aByteArrayArrayArray4[int_0][int_1 + 1][int_2 + 1] = 50;
						} else if (int_4 == 2) {
							Class18.aByteArrayArrayArray4[int_0][int_1 + 1][int_2] = 50;
						} else if (int_4 == 3) {
							Class18.aByteArrayArrayArray4[int_0][int_1][int_2] = 50;
						}
					}

					if ((objectcomposition_0.interactType != 0) && (collisiondata_0 != null)) {
						collisiondata_0.addWall(int_1, int_2, int_5, int_4, objectcomposition_0.aBool53);
					}

				} else {
					int int_20;
					Object object_1;
					if (int_5 == 2) {
						int_20 = (int_4 + 1) & 0x3;
						Object object_0;
						if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
							object_0 = objectcomposition_0.getModel(2, int_4 + 4, ints_0, int_13, int_12, int_14);
							object_1 = objectcomposition_0.getModel(2, int_20, ints_0, int_13, int_12, int_14);
						} else {
							object_0 = new DynamicObject(int_3, 2, int_4 + 4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
							object_1 = new DynamicObject(int_3, 2, int_20, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
						}

						region_0.addBoundary(int_0, int_1, int_2, int_12, (Renderable) object_0, (Renderable) object_1,
								Class18.anIntArray2[int_4], Class18.anIntArray2[int_20], int_15, int_16);
						if (objectcomposition_0.modelClipped) {
							if (int_4 == 0) {
								AClass4.anIntArrayArrayArray1[int_0][int_1][int_2] |= 0x249;
								AClass4.anIntArrayArrayArray1[int_0][int_1][int_2 + 1] |= 0x492;
							} else if (int_4 == 1) {
								AClass4.anIntArrayArrayArray1[int_0][int_1][1 + int_2] |= 0x492;
								AClass4.anIntArrayArrayArray1[int_0][int_1 + 1][int_2] |= 0x249;
							} else if (int_4 == 2) {
								AClass4.anIntArrayArrayArray1[int_0][int_1 + 1][int_2] |= 0x249;
								AClass4.anIntArrayArrayArray1[int_0][int_1][int_2] |= 0x492;
							} else if (int_4 == 3) {
								AClass4.anIntArrayArrayArray1[int_0][int_1][int_2] |= 0x492;
								AClass4.anIntArrayArrayArray1[int_0][int_1][int_2] |= 0x249;
							}
						}

						if ((objectcomposition_0.interactType != 0) && (collisiondata_0 != null)) {
							collisiondata_0.addWall(int_1, int_2, int_5, int_4, objectcomposition_0.aBool53);
						}

						if (objectcomposition_0.anInt497 != 16) {
							region_0.method372(int_0, int_1, int_2, objectcomposition_0.anInt497);
						}

					} else if (int_5 == 3) {
						if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
							object_3 = objectcomposition_0.getModel(3, int_4, ints_0, int_13, int_12, int_14);
						} else {
							object_3 = new DynamicObject(int_3, 3, int_4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
						}

						region_0.addBoundary(int_0, int_1, int_2, int_12, (Renderable) object_3, (Renderable) null,
								Class18.anIntArray3[int_4], 0, int_15, int_16);
						if (objectcomposition_0.clipped) {
							if (int_4 == 0) {
								Class18.aByteArrayArrayArray4[int_0][int_1][int_2 + 1] = 50;
							} else if (int_4 == 1) {
								Class18.aByteArrayArrayArray4[int_0][int_1 + 1][int_2 + 1] = 50;
							} else if (int_4 == 2) {
								Class18.aByteArrayArrayArray4[int_0][int_1 + 1][int_2] = 50;
							} else if (int_4 == 3) {
								Class18.aByteArrayArrayArray4[int_0][int_1][int_2] = 50;
							}
						}

						if ((objectcomposition_0.interactType != 0) && (collisiondata_0 != null)) {
							collisiondata_0.addWall(int_1, int_2, int_5, int_4, objectcomposition_0.aBool53);
						}

					} else if (int_5 == 9) {
						if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
							object_3 = objectcomposition_0.getModel(int_5, int_4, ints_0, int_13, int_12, int_14);
						} else {
							object_3 = new DynamicObject(int_3, int_5, int_4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
						}

						region_0.method371(int_0, int_1, int_2, int_12, 1, 1, (Renderable) object_3, 0, int_15, int_16);
						if ((objectcomposition_0.interactType != 0) && (collisiondata_0 != null)) {
							collisiondata_0.addObject(int_1, int_2, int_6, int_7, objectcomposition_0.aBool53);
						}

						if (objectcomposition_0.anInt497 != 16) {
							region_0.method372(int_0, int_1, int_2, objectcomposition_0.anInt497);
						}

					} else if (int_5 == 4) {
						if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
							object_3 = objectcomposition_0.getModel(4, int_4, ints_0, int_13, int_12, int_14);
						} else {
							object_3 = new DynamicObject(int_3, 4, int_4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
						}

						region_0.addBoundaryDecoration(int_0, int_1, int_2, int_12, (Renderable) object_3,
								(Renderable) null, Class18.anIntArray2[int_4], 0, 0, 0, int_15, int_16);
					} else if (int_5 == 5) {
						int_20 = 16;
						int_17 = region_0.method361(int_0, int_1, int_2);
						if (int_17 != 0) {
							int_20 = PlayerComposition.getObjectDefinition((int_17 >> 14) & 0x7FFF).anInt497;
						}

						if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
							object_1 = objectcomposition_0.getModel(4, int_4, ints_0, int_13, int_12, int_14);
						} else {
							object_1 = new DynamicObject(int_3, 4, int_4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
						}

						region_0.addBoundaryDecoration(int_0, int_1, int_2, int_12, (Renderable) object_1,
								(Renderable) null, Class18.anIntArray2[int_4], 0, int_20 * Class18.anIntArray4[int_4],
								int_20 * Class18.anIntArray5[int_4], int_15, int_16);
					} else if (int_5 == 6) {
						int_20 = 8;
						int_17 = region_0.method361(int_0, int_1, int_2);
						if (int_17 != 0) {
							int_20 = PlayerComposition.getObjectDefinition((int_17 >> 14) & 0x7FFF).anInt497 / 2;
						}

						if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
							object_1 = objectcomposition_0.getModel(4, int_4 + 4, ints_0, int_13, int_12, int_14);
						} else {
							object_1 = new DynamicObject(int_3, 4, int_4 + 4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
						}

						region_0.addBoundaryDecoration(int_0, int_1, int_2, int_12, (Renderable) object_1,
								(Renderable) null, 256, int_4, int_20 * Class18.anIntArray6[int_4],
								int_20 * Class18.anIntArray7[int_4], int_15, int_16);
					} else if (int_5 == 7) {
						int_17 = (int_4 + 2) & 0x3;
						if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
							object_3 = objectcomposition_0.getModel(4, int_17 + 4, ints_0, int_13, int_12, int_14);
						} else {
							object_3 = new DynamicObject(int_3, 4, int_17 + 4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
						}

						region_0.addBoundaryDecoration(int_0, int_1, int_2, int_12, (Renderable) object_3,
								(Renderable) null, 256, int_17, 0, 0, int_15, int_16);
					} else if (int_5 == 8) {
						int_20 = 8;
						int_17 = region_0.method361(int_0, int_1, int_2);
						if (int_17 != 0) {
							int_20 = PlayerComposition.getObjectDefinition((int_17 >> 14) & 0x7FFF).anInt497 / 2;
						}

						final int int_21 = (int_4 + 2) & 0x3;
						Object object_2;
						if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
							object_1 = objectcomposition_0.getModel(4, int_4 + 4, ints_0, int_13, int_12, int_14);
							object_2 = objectcomposition_0.getModel(4, int_21 + 4, ints_0, int_13, int_12, int_14);
						} else {
							object_1 = new DynamicObject(int_3, 4, int_4 + 4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
							object_2 = new DynamicObject(int_3, 4, int_21 + 4, int_0, int_1, int_2,
									objectcomposition_0.animationId, true, (Renderable) null);
						}

						region_0.addBoundaryDecoration(int_0, int_1, int_2, int_12, (Renderable) object_1,
								(Renderable) object_2, 256, int_4, int_20 * Class18.anIntArray6[int_4],
								int_20 * Class18.anIntArray7[int_4], int_15, int_16);
					}
				}
			} else {
				if ((objectcomposition_0.animationId == -1) && (objectcomposition_0.impostorIds == null)) {
					object_3 = objectcomposition_0.getModel(10, int_4, ints_0, int_13, int_12, int_14);
				} else {
					object_3 = new DynamicObject(int_3, 10, int_4, int_0, int_1, int_2, objectcomposition_0.animationId,
							true, (Renderable) null);
				}

				if ((object_3 != null) && region_0.method371(int_0, int_1, int_2, int_12, int_6, int_7,
						(Renderable) object_3, int_5 == 11 ? 256 : 0, int_15, int_16) && objectcomposition_0.clipped) {
					int_17 = 15;
					if (object_3 instanceof Model) {
						int_17 = ((Model) object_3).method964() / 4;
						if (int_17 > 30) {
							int_17 = 30;
						}
					}

					for (int_18 = 0; int_18 <= int_6; int_18++) {
						for (int int_19 = 0; int_19 <= int_7; int_19++) {
							if (int_17 > Class18.aByteArrayArrayArray4[int_0][int_18 + int_1][int_19 + int_2]) {
								Class18.aByteArrayArrayArray4[int_0][int_18 + int_1][int_19 + int_2] = (byte) int_17;
							}
						}
					}
				}

				if ((objectcomposition_0.interactType != 0) && (collisiondata_0 != null)) {
					collisiondata_0.addObject(int_1, int_2, int_6, int_7, objectcomposition_0.aBool53);
				}

			}
		}
	}

	static String method212(final Widget widget_0, final int int_0) {
		return !Class37.method253(Class6.getWidgetConfig(widget_0), int_0)
				&& (widget_0.anObjectArray8 == null)
						? null
						: ((widget_0.actions != null) && (widget_0.actions.length > int_0)
								&& (widget_0.actions[int_0] != null) && (widget_0.actions[int_0].trim().length() != 0)
										? widget_0.actions[int_0] : null);
	}

}
