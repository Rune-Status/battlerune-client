public final class DecorativeObject {

	static int anInt189;
	public int hash;
	int renderInfoBitPacked;
	int offsetX;
	int anInt190;
	int offsetY;
	int anInt191;
	int floor;
	public Renderable renderable1;
	public Renderable renderable2;
	int renderFlag;
	int rotation;

	DecorativeObject() {
		hash = 0;
		renderInfoBitPacked = 0;
	}

	public static int getLength(final String string_0) {
		return string_0.length() + 1;
	}

	static final void method460(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6) {
		if ((int_2 >= 1) && (int_3 >= 1) && (int_2 <= 102) && (int_3 <= 102)) {
			if (Client.lowMemory && (int_0 != AClass1_Sub1.plane)) {
				return;
			}

			int int_7 = 0;
			if (int_1 == 0) {
				int_7 = Class8.region.method361(int_0, int_2, int_3);
			}

			if (int_1 == 1) {
				int_7 = Class8.region.method362(int_0, int_2, int_3);
			}

			if (int_1 == 2) {
				int_7 = Class8.region.method365(int_0, int_2, int_3);
			}

			if (int_1 == 3) {
				int_7 = Class8.region.method363(int_0, int_2, int_3);
			}

			int int_8;
			if (int_7 != 0) {
				int_8 = Class8.region.method364(int_0, int_2, int_3, int_7);
				final int int_23 = (int_7 >> 14) & 0x7FFF;
				final int int_24 = int_8 & 0x1F;
				final int int_25 = (int_8 >> 6) & 0x3;
				ObjectComposition objectcomposition_0;
				if (int_1 == 0) {
					Class8.region.method367(int_0, int_2, int_3);
					objectcomposition_0 = PlayerComposition.getObjectDefinition(int_23);
					if (objectcomposition_0.interactType != 0) {
						Client.collisionMaps[int_0].removeWall(int_2, int_3, int_24, int_25,
								objectcomposition_0.aBool53);
					}
				}

				if (int_1 == 1) {
					Class8.region.method368(int_0, int_2, int_3);
				}

				if (int_1 == 2) {
					Class8.region.method369(int_0, int_2, int_3);
					objectcomposition_0 = PlayerComposition.getObjectDefinition(int_23);
					if (((int_2 + objectcomposition_0.sizeX) > 103) || ((int_3 + objectcomposition_0.sizeX) > 103)
							|| ((int_2 + objectcomposition_0.sizeY) > 103)) {
						return;
					}

					if ((int_3 + objectcomposition_0.sizeY) > 103) {
						return;
					}

					if (objectcomposition_0.interactType != 0) {
						Client.collisionMaps[int_0].removeObject(int_2, int_3, objectcomposition_0.sizeX,
								objectcomposition_0.sizeY, int_25, objectcomposition_0.aBool53);
					}
				}

				if (int_1 == 3) {
					Class8.region.method370(int_0, int_2, int_3);
					objectcomposition_0 = PlayerComposition.getObjectDefinition(int_23);
					if (objectcomposition_0.interactType == 1) {
						Client.collisionMaps[int_0].unblock(int_2, int_3);
					}
				}
			}

			if (int_4 >= 0) {
				int_8 = int_0;
				if ((int_0 < 3) && ((Class18.tileSettings[1][int_2][int_3] & 0x2) == 2)) {
					int_8 = int_0 + 1;
				}

				final Region region_0 = Class8.region;
				final CollisionData collisiondata_0 = Client.collisionMaps[int_0];
				final ObjectComposition objectcomposition_1 = PlayerComposition.getObjectDefinition(int_4);
				int int_9;
				int int_10;
				if ((int_5 != 1) && (int_5 != 3)) {
					int_9 = objectcomposition_1.sizeX;
					int_10 = objectcomposition_1.sizeY;
				} else {
					int_9 = objectcomposition_1.sizeY;
					int_10 = objectcomposition_1.sizeX;
				}

				int int_11;
				int int_12;
				if ((int_9 + int_2) <= 104) {
					int_11 = int_2 + (int_9 >> 1);
					int_12 = ((1 + int_9) >> 1) + int_2;
				} else {
					int_11 = int_2;
					int_12 = int_2 + 1;
				}

				int int_13;
				int int_14;
				if ((int_3 + int_10) <= 104) {
					int_13 = int_3 + (int_10 >> 1);
					int_14 = int_3 + ((int_10 + 1) >> 1);
				} else {
					int_13 = int_3;
					int_14 = int_3 + 1;
				}

				final int[][] ints_0 = Class18.tileHeights[int_8];
				final int int_15 = (ints_0[int_12][int_13] + ints_0[int_11][int_13] + ints_0[int_11][int_14]
						+ ints_0[int_12][int_14]) >> 2;
				final int int_16 = (int_2 << 7) + (int_9 << 6);
				final int int_17 = (int_3 << 7) + (int_10 << 6);
				int int_18 = (int_3 << 7) + int_2 + (int_4 << 14) + 1073741824;
				if (objectcomposition_1.anInt491 == 0) {
					int_18 -= Integer.MIN_VALUE;
				}

				int int_19 = (int_5 << 6) + int_6;
				if (objectcomposition_1.anInt492 == 1) {
					int_19 += 256;
				}

				Object object_0;
				if (int_6 == 22) {
					if ((objectcomposition_1.animationId == -1) && (objectcomposition_1.impostorIds == null)) {
						object_0 = objectcomposition_1.method801(22, int_5, ints_0, int_16, int_15, int_17);
					} else {
						object_0 = new DynamicObject(int_4, 22, int_5, int_8, int_2, int_3,
								objectcomposition_1.animationId, true, (Renderable) null);
					}

					region_0.groundObjectSpawned(int_0, int_2, int_3, int_15, (Renderable) object_0, int_18, int_19);
					if (objectcomposition_1.interactType == 1) {
						collisiondata_0.block(int_2, int_3);
						return;
					}
				} else if ((int_6 != 10) && (int_6 != 11)) {
					if (int_6 >= 12) {
						if ((objectcomposition_1.animationId == -1) && (objectcomposition_1.impostorIds == null)) {
							object_0 = objectcomposition_1.method801(int_6, int_5, ints_0, int_16, int_15, int_17);
						} else {
							object_0 = new DynamicObject(int_4, int_6, int_5, int_8, int_2, int_3,
									objectcomposition_1.animationId, true, (Renderable) null);
						}

						region_0.method371(int_0, int_2, int_3, int_15, 1, 1, (Renderable) object_0, 0, int_18, int_19);
						if (objectcomposition_1.interactType != 0) {
							collisiondata_0.addObject(int_2, int_3, int_9, int_10, objectcomposition_1.aBool53);
							return;
						}
					} else if (int_6 == 0) {
						if ((objectcomposition_1.animationId == -1) && (objectcomposition_1.impostorIds == null)) {
							object_0 = objectcomposition_1.method801(0, int_5, ints_0, int_16, int_15, int_17);
						} else {
							object_0 = new DynamicObject(int_4, 0, int_5, int_8, int_2, int_3,
									objectcomposition_1.animationId, true, (Renderable) null);
						}

						region_0.addBoundary(int_0, int_2, int_3, int_15, (Renderable) object_0, (Renderable) null,
								Class18.anIntArray2[int_5], 0, int_18, int_19);
						if (objectcomposition_1.interactType != 0) {
							collisiondata_0.addWall(int_2, int_3, int_6, int_5, objectcomposition_1.aBool53);
							return;
						}
					} else if (int_6 == 1) {
						if ((objectcomposition_1.animationId == -1) && (objectcomposition_1.impostorIds == null)) {
							object_0 = objectcomposition_1.method801(1, int_5, ints_0, int_16, int_15, int_17);
						} else {
							object_0 = new DynamicObject(int_4, 1, int_5, int_8, int_2, int_3,
									objectcomposition_1.animationId, true, (Renderable) null);
						}

						region_0.addBoundary(int_0, int_2, int_3, int_15, (Renderable) object_0, (Renderable) null,
								Class18.anIntArray3[int_5], 0, int_18, int_19);
						if (objectcomposition_1.interactType != 0) {
							collisiondata_0.addWall(int_2, int_3, int_6, int_5, objectcomposition_1.aBool53);
							return;
						}
					} else {
						int int_20;
						Object object_2;
						if (int_6 == 2) {
							int_20 = (int_5 + 1) & 0x3;
							Object object_1;
							if ((objectcomposition_1.animationId == -1) && (objectcomposition_1.impostorIds == null)) {
								object_1 = objectcomposition_1.method801(2, int_5 + 4, ints_0, int_16, int_15, int_17);
								object_2 = objectcomposition_1.method801(2, int_20, ints_0, int_16, int_15, int_17);
							} else {
								object_1 = new DynamicObject(int_4, 2, int_5 + 4, int_8, int_2, int_3,
										objectcomposition_1.animationId, true, (Renderable) null);
								object_2 = new DynamicObject(int_4, 2, int_20, int_8, int_2, int_3,
										objectcomposition_1.animationId, true, (Renderable) null);
							}

							region_0.addBoundary(int_0, int_2, int_3, int_15, (Renderable) object_1,
									(Renderable) object_2, Class18.anIntArray2[int_5], Class18.anIntArray2[int_20],
									int_18, int_19);
							if (objectcomposition_1.interactType != 0) {
								collisiondata_0.addWall(int_2, int_3, int_6, int_5, objectcomposition_1.aBool53);
								return;
							}
						} else if (int_6 == 3) {
							if ((objectcomposition_1.animationId == -1) && (objectcomposition_1.impostorIds == null)) {
								object_0 = objectcomposition_1.method801(3, int_5, ints_0, int_16, int_15, int_17);
							} else {
								object_0 = new DynamicObject(int_4, 3, int_5, int_8, int_2, int_3,
										objectcomposition_1.animationId, true, (Renderable) null);
							}

							region_0.addBoundary(int_0, int_2, int_3, int_15, (Renderable) object_0, (Renderable) null,
									Class18.anIntArray3[int_5], 0, int_18, int_19);
							if (objectcomposition_1.interactType != 0) {
								collisiondata_0.addWall(int_2, int_3, int_6, int_5, objectcomposition_1.aBool53);
								return;
							}
						} else if (int_6 == 9) {
							if ((objectcomposition_1.animationId == -1) && (objectcomposition_1.impostorIds == null)) {
								object_0 = objectcomposition_1.method801(int_6, int_5, ints_0, int_16, int_15, int_17);
							} else {
								object_0 = new DynamicObject(int_4, int_6, int_5, int_8, int_2, int_3,
										objectcomposition_1.animationId, true, (Renderable) null);
							}

							region_0.method371(int_0, int_2, int_3, int_15, 1, 1, (Renderable) object_0, 0, int_18,
									int_19);
							if (objectcomposition_1.interactType != 0) {
								collisiondata_0.addObject(int_2, int_3, int_9, int_10, objectcomposition_1.aBool53);
								return;
							}
						} else {
							if (int_6 == 4) {
								if ((objectcomposition_1.animationId == -1)
										&& (objectcomposition_1.impostorIds == null)) {
									object_0 = objectcomposition_1.method801(4, int_5, ints_0, int_16, int_15, int_17);
								} else {
									object_0 = new DynamicObject(int_4, 4, int_5, int_8, int_2, int_3,
											objectcomposition_1.animationId, true, (Renderable) null);
								}

								region_0.addBoundaryDecoration(int_0, int_2, int_3, int_15, (Renderable) object_0,
										(Renderable) null, Class18.anIntArray2[int_5], 0, 0, 0, int_18, int_19);
								return;
							}

							int int_21;
							if (int_6 == 5) {
								int_20 = 16;
								int_21 = region_0.method361(int_0, int_2, int_3);
								if (int_21 != 0) {
									int_20 = PlayerComposition.getObjectDefinition((int_21 >> 14) & 0x7FFF).anInt497;
								}

								if ((objectcomposition_1.animationId == -1)
										&& (objectcomposition_1.impostorIds == null)) {
									object_2 = objectcomposition_1.method801(4, int_5, ints_0, int_16, int_15, int_17);
								} else {
									object_2 = new DynamicObject(int_4, 4, int_5, int_8, int_2, int_3,
											objectcomposition_1.animationId, true, (Renderable) null);
								}

								region_0.addBoundaryDecoration(int_0, int_2, int_3, int_15, (Renderable) object_2,
										(Renderable) null, Class18.anIntArray2[int_5], 0,
										int_20 * Class18.anIntArray4[int_5], int_20 * Class18.anIntArray5[int_5],
										int_18, int_19);
								return;
							}

							if (int_6 == 6) {
								int_20 = 8;
								int_21 = region_0.method361(int_0, int_2, int_3);
								if (int_21 != 0) {
									int_20 = PlayerComposition.getObjectDefinition((int_21 >> 14) & 0x7FFF).anInt497
											/ 2;
								}

								if ((objectcomposition_1.animationId == -1)
										&& (objectcomposition_1.impostorIds == null)) {
									object_2 = objectcomposition_1.method801(4, int_5 + 4, ints_0, int_16, int_15,
											int_17);
								} else {
									object_2 = new DynamicObject(int_4, 4, int_5 + 4, int_8, int_2, int_3,
											objectcomposition_1.animationId, true, (Renderable) null);
								}

								region_0.addBoundaryDecoration(int_0, int_2, int_3, int_15, (Renderable) object_2,
										(Renderable) null, 256, int_5, int_20 * Class18.anIntArray6[int_5],
										int_20 * Class18.anIntArray7[int_5], int_18, int_19);
								return;
							}

							if (int_6 == 7) {
								int_21 = (int_5 + 2) & 0x3;
								if ((objectcomposition_1.animationId == -1)
										&& (objectcomposition_1.impostorIds == null)) {
									object_0 = objectcomposition_1.method801(4, int_21 + 4, ints_0, int_16, int_15,
											int_17);
								} else {
									object_0 = new DynamicObject(int_4, 4, int_21 + 4, int_8, int_2, int_3,
											objectcomposition_1.animationId, true, (Renderable) null);
								}

								region_0.addBoundaryDecoration(int_0, int_2, int_3, int_15, (Renderable) object_0,
										(Renderable) null, 256, int_21, 0, 0, int_18, int_19);
								return;
							}

							if (int_6 == 8) {
								int_20 = 8;
								int_21 = region_0.method361(int_0, int_2, int_3);
								if (int_21 != 0) {
									int_20 = PlayerComposition.getObjectDefinition((int_21 >> 14) & 0x7FFF).anInt497
											/ 2;
								}

								final int int_22 = (int_5 + 2) & 0x3;
								Object object_3;
								if ((objectcomposition_1.animationId == -1)
										&& (objectcomposition_1.impostorIds == null)) {
									object_2 = objectcomposition_1.method801(4, int_5 + 4, ints_0, int_16, int_15,
											int_17);
									object_3 = objectcomposition_1.method801(4, int_22 + 4, ints_0, int_16, int_15,
											int_17);
								} else {
									object_2 = new DynamicObject(int_4, 4, int_5 + 4, int_8, int_2, int_3,
											objectcomposition_1.animationId, true, (Renderable) null);
									object_3 = new DynamicObject(int_4, 4, int_22 + 4, int_8, int_2, int_3,
											objectcomposition_1.animationId, true, (Renderable) null);
								}

								region_0.addBoundaryDecoration(int_0, int_2, int_3, int_15, (Renderable) object_2,
										(Renderable) object_3, 256, int_5, int_20 * Class18.anIntArray6[int_5],
										int_20 * Class18.anIntArray7[int_5], int_18, int_19);
								return;
							}
						}
					}
				} else {
					if ((objectcomposition_1.animationId == -1) && (objectcomposition_1.impostorIds == null)) {
						object_0 = objectcomposition_1.method801(10, int_5, ints_0, int_16, int_15, int_17);
					} else {
						object_0 = new DynamicObject(int_4, 10, int_5, int_8, int_2, int_3,
								objectcomposition_1.animationId, true, (Renderable) null);
					}

					if (object_0 != null) {
						region_0.method371(int_0, int_2, int_3, int_15, int_9, int_10, (Renderable) object_0,
								int_6 == 11 ? 256 : 0, int_18, int_19);
					}

					if (objectcomposition_1.interactType != 0) {
						collisiondata_0.addObject(int_2, int_3, int_9, int_10, objectcomposition_1.aBool53);
						return;
					}
				}
			}
		}

	}

}
