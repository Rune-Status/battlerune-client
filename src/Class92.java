public class Class92 implements Runnable {

	static Deque aDeque1;
	static Deque aDeque2;
	static Object anObject2;
	static int anInt202;

	static {
		aDeque1 = new Deque();
		aDeque2 = new Deque();
		anInt202 = 0;
		anObject2 = new Object();
	}

	@Override
	public void run() {
		try {
			while (true) {
				FileSystem filesystem_0;
				synchronized (aDeque1) {
					filesystem_0 = (FileSystem) aDeque1.getFront();
				}

				if (filesystem_0 != null) {
					if (filesystem_0.anInt361 == 0) {
						filesystem_0.index.method68((int) filesystem_0.hash, filesystem_0.aByteArray13,
								filesystem_0.aByteArray13.length);
						synchronized (aDeque1) {
							filesystem_0.unlink();
						}
					} else if (filesystem_0.anInt361 == 1) {
						filesystem_0.aByteArray13 = filesystem_0.index.method69((int) filesystem_0.hash);
						synchronized (aDeque1) {
							aDeque2.addFront(filesystem_0);
						}
					}

					synchronized (anObject2) {
						if (anInt202 <= 1) {
							anInt202 = 0;
							anObject2.notifyAll();
							return;
						}

						anInt202 = 600;
					}
				} else {
					Class14.method189(100L);
					synchronized (anObject2) {
						if (anInt202 <= 1) {
							anInt202 = 0;
							anObject2.notifyAll();
							return;
						}

						--anInt202;
					}
				}
			}
		} catch (final Exception exception_0) {
			Class17.method201((String) null, exception_0);
		}
	}

	static final void method476() {
		int int_0;
		int int_1;
		int int_2;
		int int_3;
		int int_4;
		int int_5;
		int int_6;
		if (Client.packetType == 109) {
			int_0 = Client.secretPacketBuffer2.readUByteN();
			int_1 = int_0 >> 2;
			int_2 = int_0 & 0x3;
			int_3 = Client.anIntArray154[int_1];
			int_4 = Client.secretPacketBuffer2.readUByteN();
			int_5 = ((int_4 >> 4) & 0x7) + WorldMapType2.anInt242;
			int_6 = (int_4 & 0x7) + CacheableNode_Sub4.anInt515;
			if ((int_5 >= 0) && (int_6 >= 0) && (int_5 < 104) && (int_6 < 104)) {
				Class22.method211(AClass1_Sub1.plane, int_5, int_6, int_3, -1, int_1, int_2, 0, -1);
			}

		} else {
			Item item_0;
			if (Client.packetType == 56) {
				int_0 = Client.secretPacketBuffer2.readUnsignedShort();
				int_1 = Client.secretPacketBuffer2.method669();
				int_2 = ((int_1 >> 4) & 0x7) + WorldMapType2.anInt242;
				int_3 = (int_1 & 0x7) + CacheableNode_Sub4.anInt515;
				if ((int_2 >= 0) && (int_3 >= 0) && (int_2 < 104) && (int_3 < 104)) {
					final Deque deque_1 = Client.groundItemDeque[AClass1_Sub1.plane][int_2][int_3];
					if (deque_1 != null) {
						for (item_0 = (Item) deque_1.getFront(); item_0 != null; item_0 = (Item) deque_1.getNext()) {
							if ((int_0 & 0x7FFF) == item_0.anInt584) {
								item_0.unlink();
								break;
							}
						}

						if (deque_1.getFront() == null) {
							Client.groundItemDeque[AClass1_Sub1.plane][int_2][int_3] = null;
						}

						Class9.groundItemSpawned(int_2, int_3);
						return;
					}
				}

			} else {
				int int_7;
				int int_8;
				if (Client.packetType == 34) {
					int_0 = Client.secretPacketBuffer2.readUnsignedShort();
					int_1 = Client.secretPacketBuffer2.method669();
					int_2 = ((int_1 >> 4) & 0x7) + WorldMapType2.anInt242;
					int_3 = (int_1 & 0x7) + CacheableNode_Sub4.anInt515;
					int_4 = Client.secretPacketBuffer2.method673();
					int_5 = int_4 >> 2;
					int_6 = int_4 & 0x3;
					int_7 = Client.anIntArray154[int_5];
					if ((int_2 >= 0) && (int_3 >= 0) && (int_2 < 103) && (int_3 < 103)) {
						if (int_7 == 0) {
							final WallObject wallobject_0 = Class8.region.method355(AClass1_Sub1.plane, int_2, int_3);
							if (wallobject_0 != null) {
								int_8 = (wallobject_0.hash >> 14) & 0x7FFF;
								if (int_5 == 2) {
									wallobject_0.renderable1 = new DynamicObject(int_8, 2, int_6 + 4,
											AClass1_Sub1.plane, int_2, int_3, int_0, false, wallobject_0.renderable1);
									wallobject_0.renderable2 = new DynamicObject(int_8, 2, (int_6 + 1) & 0x3,
											AClass1_Sub1.plane, int_2, int_3, int_0, false, wallobject_0.renderable2);
								} else {
									wallobject_0.renderable1 = new DynamicObject(int_8, int_5, int_6,
											AClass1_Sub1.plane, int_2, int_3, int_0, false, wallobject_0.renderable1);
								}
							}
						}

						if (int_7 == 1) {
							final DecorativeObject decorativeobject_0 = Class8.region.method357(AClass1_Sub1.plane,
									int_2, int_3);
							if (decorativeobject_0 != null) {
								int_8 = (decorativeobject_0.hash >> 14) & 0x7FFF;
								if ((int_5 != 4) && (int_5 != 5)) {
									if (int_5 == 6) {
										decorativeobject_0.renderable1 = new DynamicObject(int_8, 4, int_6 + 4,
												AClass1_Sub1.plane, int_2, int_3, int_0, false,
												decorativeobject_0.renderable1);
									} else if (int_5 == 7) {
										decorativeobject_0.renderable1 = new DynamicObject(int_8, 4,
												((int_6 + 2) & 0x3) + 4, AClass1_Sub1.plane, int_2, int_3, int_0, false,
												decorativeobject_0.renderable1);
									} else if (int_5 == 8) {
										decorativeobject_0.renderable1 = new DynamicObject(int_8, 4, int_6 + 4,
												AClass1_Sub1.plane, int_2, int_3, int_0, false,
												decorativeobject_0.renderable1);
										decorativeobject_0.renderable2 = new DynamicObject(int_8, 4,
												((int_6 + 2) & 0x3) + 4, AClass1_Sub1.plane, int_2, int_3, int_0, false,
												decorativeobject_0.renderable2);
									}
								} else {
									decorativeobject_0.renderable1 = new DynamicObject(int_8, 4, int_6,
											AClass1_Sub1.plane, int_2, int_3, int_0, false,
											decorativeobject_0.renderable1);
								}
							}
						}

						if (int_7 == 2) {
							final GameObject gameobject_0 = Class8.region.method360(AClass1_Sub1.plane, int_2, int_3);
							if (int_5 == 11) {
								int_5 = 10;
							}

							if (gameobject_0 != null) {
								gameobject_0.renderable = new DynamicObject((gameobject_0.hash >> 14) & 0x7FFF, int_5,
										int_6, AClass1_Sub1.plane, int_2, int_3, int_0, false, gameobject_0.renderable);
							}
						}

						if (int_7 == 3) {
							final GroundObject groundobject_0 = Class8.region.method366(AClass1_Sub1.plane, int_2,
									int_3);
							if (groundobject_0 != null) {
								groundobject_0.renderable = new DynamicObject((groundobject_0.hash >> 14) & 0x7FFF, 22,
										int_6, AClass1_Sub1.plane, int_2, int_3, int_0, false,
										groundobject_0.renderable);
								return;
							}
						}
					}

				} else if (Client.packetType == 121) {
					int_0 = Client.secretPacketBuffer2.method669();
					int_1 = ((int_0 >> 4) & 0x7) + WorldMapType2.anInt242;
					int_2 = (int_0 & 0x7) + CacheableNode_Sub4.anInt515;
					int_3 = Client.secretPacketBuffer2.method673();
					int_4 = int_3 >> 2;
					int_5 = int_3 & 0x3;
					int_6 = Client.anIntArray154[int_4];
					int_7 = Client.secretPacketBuffer2.readUShortLEA();
					if ((int_1 >= 0) && (int_2 >= 0) && (int_1 < 104) && (int_2 < 104)) {
						Class22.method211(AClass1_Sub1.plane, int_1, int_2, int_6, int_7, int_4, int_5, 0, -1);
					}
				} else if (Client.packetType == 105) {
					int_0 = Client.secretPacketBuffer2.method673();
					int_1 = ((int_0 >> 4) & 0x7) + WorldMapType2.anInt242;
					int_2 = (int_0 & 0x7) + CacheableNode_Sub4.anInt515;
					int_3 = Client.secretPacketBuffer2.readUnsignedShort();
					int_4 = Client.secretPacketBuffer2.readUByte();
					if ((int_1 >= 0) && (int_2 >= 0) && (int_1 < 104) && (int_2 < 104)) {
						item_0 = new Item();
						item_0.anInt584 = int_3;
						item_0.quantity = int_4;
						if (Client.groundItemDeque[AClass1_Sub1.plane][int_1][int_2] == null) {
							Client.groundItemDeque[AClass1_Sub1.plane][int_1][int_2] = new Deque();
						}

						Client.groundItemDeque[AClass1_Sub1.plane][int_1][int_2].addFront(item_0);
						Class9.groundItemSpawned(int_1, int_2);
					}

				} else {
					int int_9;
					if (Client.packetType == 248) {
						int_0 = Client.secretPacketBuffer2.readUnsignedByte();
						int_1 = ((int_0 >> 4) & 0x7) + WorldMapType2.anInt242;
						int_2 = (int_0 & 0x7) + CacheableNode_Sub4.anInt515;
						int_3 = Client.secretPacketBuffer2.readUnsignedShort();
						int_4 = Client.secretPacketBuffer2.readUnsignedByte();
						int_5 = (int_4 >> 4) & 0xF;
						int_6 = int_4 & 0x7;
						int_7 = Client.secretPacketBuffer2.readUnsignedByte();
						if ((int_1 >= 0) && (int_2 >= 0) && (int_1 < 104) && (int_2 < 104)) {
							int_9 = int_5 + 1;
							if ((Script.localPlayer.pathX[0] >= (int_1 - int_9))
									&& (Script.localPlayer.pathX[0] <= (int_1 + int_9))
									&& (Script.localPlayer.pathY[0] >= (int_2 - int_9))
									&& (Script.localPlayer.pathY[0] <= (int_2 + int_9)) && (Client.anInt684 != 0)
									&& (int_6 > 0) && (Client.anInt700 < 50)) {
								Client.anIntArray148[Client.anInt700] = int_3;
								Client.anIntArray150[Client.anInt700] = int_6;
								Client.anIntArray151[Client.anInt700] = int_7;
								Client.audioEffects[Client.anInt700] = null;
								Client.anIntArray153[Client.anInt700] = int_5 + (int_2 << 8) + (int_1 << 16);
								++Client.anInt700;
								return;
							}
						}

					} else if (Client.packetType == 102) {
						int_0 = Client.secretPacketBuffer2.readUnsignedByte();
						int_1 = ((int_0 >> 4) & 0x7) + WorldMapType2.anInt242;
						int_2 = (int_0 & 0x7) + CacheableNode_Sub4.anInt515;
						int_3 = Client.secretPacketBuffer2.readUnsignedShort();
						int_4 = Client.secretPacketBuffer2.readUnsignedByte();
						int_5 = Client.secretPacketBuffer2.readUnsignedShort();
						if ((int_1 >= 0) && (int_2 >= 0) && (int_1 < 104) && (int_2 < 104)) {
							int_1 = (128 * int_1) + 64;
							int_2 = (int_2 * 128) + 64;
							final GraphicsObject graphicsobject_0 = new GraphicsObject(int_3, AClass1_Sub1.plane, int_1,
									int_2, Actor.getTileHeight(int_1, int_2, AClass1_Sub1.plane) - int_4, int_5,
									Client.gameCycle);
							Client.graphicsObjectDeque.addFront(graphicsobject_0);
						}

					} else if (Client.packetType == 214) {
						int_0 = Client.secretPacketBuffer2.readUnsignedByte();
						int_1 = ((int_0 >> 4) & 0x7) + WorldMapType2.anInt242;
						int_2 = (int_0 & 0x7) + CacheableNode_Sub4.anInt515;
						int_3 = Client.secretPacketBuffer2.readUnsignedShort();
						int_4 = Client.secretPacketBuffer2.readUnsignedShort();
						int_5 = Client.secretPacketBuffer2.readUnsignedShort();
						if ((int_1 >= 0) && (int_2 >= 0) && (int_1 < 104) && (int_2 < 104)) {
							final Deque deque_0 = Client.groundItemDeque[AClass1_Sub1.plane][int_1][int_2];
							if (deque_0 != null) {
								for (Item item_1 = (Item) deque_0.getFront(); item_1 != null; item_1 = (Item) deque_0
										.getNext()) {
									if (((int_3 & 0x7FFF) == item_1.anInt584) && (int_4 == item_1.quantity)) {
										item_1.quantity = int_5;
										break;
									}
								}

								Class9.groundItemSpawned(int_1, int_2);
								return;
							}
						}

					} else {
						int int_10;
						int int_11;
						int int_12;
						if (Client.packetType == 122) {
							byte byte_1 = Client.secretPacketBuffer2.method680();
							byte byte_2 = Client.secretPacketBuffer2.method681();
							byte byte_3 = Client.secretPacketBuffer2.readByte();
							int_3 = Client.secretPacketBuffer2.readUnsignedByte();
							int_4 = int_3 >> 2;
							int_5 = int_3 & 0x3;
							int_6 = Client.anIntArray154[int_4];
							byte byte_4 = Client.secretPacketBuffer2.method680();
							int_9 = Client.secretPacketBuffer2.readUByte();
							int_8 = Client.secretPacketBuffer2.readUShortA();
							int_10 = Client.secretPacketBuffer2.readUShortLEA();
							int_11 = Client.secretPacketBuffer2.readUByte();
							int_12 = Client.secretPacketBuffer2.method669();
							final int int_13 = ((int_12 >> 4) & 0x7) + WorldMapType2.anInt242;
							final int int_14 = (int_12 & 0x7) + CacheableNode_Sub4.anInt515;
							Player player_0;
							if (int_11 == Client.localInteractingIndex) {
								player_0 = Script.localPlayer;
							} else {
								player_0 = Client.cachedPlayers[int_11];
							}

							if (player_0 != null) {
								final ObjectComposition objectcomposition_0 = PlayerComposition
										.getObjectDefinition(int_9);
								int int_15;
								int int_16;
								if ((int_5 != 1) && (int_5 != 3)) {
									int_15 = objectcomposition_0.sizeX;
									int_16 = objectcomposition_0.sizeY;
								} else {
									int_15 = objectcomposition_0.sizeY;
									int_16 = objectcomposition_0.sizeX;
								}

								final int int_17 = int_13 + (int_15 >> 1);
								final int int_18 = int_13 + ((int_15 + 1) >> 1);
								final int int_19 = int_14 + (int_16 >> 1);
								final int int_20 = int_14 + ((int_16 + 1) >> 1);
								final int[][] ints_0 = Class18.tileHeights[AClass1_Sub1.plane];
								final int int_21 = (ints_0[int_18][int_20] + ints_0[int_17][int_20]
										+ ints_0[int_17][int_19] + ints_0[int_18][int_19]) >> 2;
								final int int_22 = (int_13 << 7) + (int_15 << 6);
								final int int_23 = (int_14 << 7) + (int_16 << 6);
								final Model model_0 = objectcomposition_0.method801(int_4, int_5, ints_0, int_22,
										int_21, int_23);
								if (model_0 != null) {
									Class22.method211(AClass1_Sub1.plane, int_13, int_14, int_6, -1, 0, 0, int_10 + 1,
											int_8 + 1);
									player_0.anInt630 = int_10 + Client.gameCycle;
									player_0.anInt631 = int_8 + Client.gameCycle;
									player_0.model = model_0;
									player_0.anInt633 = (int_13 * 128) + (64 * int_15);
									player_0.anInt636 = (int_14 * 128) + (int_16 * 64);
									player_0.anInt634 = int_21;
									byte byte_0;
									if (byte_2 > byte_1) {
										byte_0 = byte_2;
										byte_2 = byte_1;
										byte_1 = byte_0;
									}

									if (byte_3 > byte_4) {
										byte_0 = byte_3;
										byte_3 = byte_4;
										byte_4 = byte_0;
									}

									player_0.anInt638 = byte_2 + int_13;
									player_0.anInt640 = int_13 + byte_1;
									player_0.anInt639 = int_14 + byte_3;
									player_0.anInt641 = int_14 + byte_4;
									return;
								}
							}

						} else if (Client.packetType == 221) {
							int_0 = Client.secretPacketBuffer2.readUnsignedByte();
							int_1 = ((int_0 >> 4) & 0x7) + WorldMapType2.anInt242;
							int_2 = (int_0 & 0x7) + CacheableNode_Sub4.anInt515;
							int_3 = int_1 + Client.secretPacketBuffer2.readByte();
							int_4 = int_2 + Client.secretPacketBuffer2.readByte();
							int_5 = Client.secretPacketBuffer2.readShort();
							int_6 = Client.secretPacketBuffer2.readUnsignedShort();
							int_7 = Client.secretPacketBuffer2.readUnsignedByte() * 4;
							int_9 = Client.secretPacketBuffer2.readUnsignedByte() * 4;
							int_8 = Client.secretPacketBuffer2.readUnsignedShort();
							int_10 = Client.secretPacketBuffer2.readUnsignedShort();
							int_11 = Client.secretPacketBuffer2.readUnsignedByte();
							int_12 = Client.secretPacketBuffer2.readUnsignedByte();
							if ((int_1 >= 0) && (int_2 >= 0) && (int_1 < 104) && (int_2 < 104) && (int_3 >= 0)
									&& (int_4 >= 0) && (int_3 < 104) && (int_4 < 104) && (int_6 != 65535)) {
								int_1 = (int_1 * 128) + 64;
								int_2 = (128 * int_2) + 64;
								int_3 = (int_3 * 128) + 64;
								int_4 = (int_4 * 128) + 64;
								final Projectile projectile_0 = new Projectile(int_6, AClass1_Sub1.plane, int_1, int_2,
										Actor.getTileHeight(int_1, int_2, AClass1_Sub1.plane) - int_7,
										int_8 + Client.gameCycle, int_10 + Client.gameCycle, int_11, int_12, int_5,
										int_9);
								projectile_0.method938(int_3, int_4,
										Actor.getTileHeight(int_3, int_4, AClass1_Sub1.plane) - int_9,
										int_8 + Client.gameCycle);
								Client.projectiles.addFront(projectile_0);
							}
						}
					}
				}
			}
		}
	}

}
