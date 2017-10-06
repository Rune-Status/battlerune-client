public class Class4 implements Interface2 {

	@Override
	public AbstractSoundSystem method3() {
		return new SourceDataSoundSystem();
	}

	static final void method87(final Widget widget_0, final int int_0, final int int_1) {
		final CacheableNode_Sub1 cacheablenode_sub1_0 = widget_0.method562(false);
		if (cacheablenode_sub1_0 != null) {
			if (Client.anInt701 < 3) {
				Class47.compass.method923(int_0, int_1, cacheablenode_sub1_0.anInt498, cacheablenode_sub1_0.anInt499,
						25, 25, Client.mapAngle, 256, cacheablenode_sub1_0.anIntArray102,
						cacheablenode_sub1_0.anIntArray103);
			} else {
				Rasterizer2D.method860(int_0, int_1, 0, cacheablenode_sub1_0.anIntArray102,
						cacheablenode_sub1_0.anIntArray103);
			}
		}
	}

	static final void method88(final boolean bool_0) {
		Client.anInt748 = 0;
		Client.pendingNpcFlagsCount = 0;
		Class6.method106();
		GameEngine.method1029(bool_0);

		int int_0;
		int int_1;
		for (int_0 = 0; int_0 < Client.pendingNpcFlagsCount; int_0++) {
			int_1 = Client.pendingNpcFlagsIndices[int_0];
			final NPC npc_0 = Client.cachedNPCs[int_1];
			final int int_2 = Client.secretPacketBuffer2.readUnsignedByte();
			int int_3;
			int int_4;
			int int_5;
			int int_8;
			if ((int_2 & 0x10) != 0) {
				int_3 = Client.secretPacketBuffer2.readUnsignedByte();
				int int_6;
				int int_7;
				int int_9;
				if (int_3 > 0) {
					for (int_4 = 0; int_4 < int_3; int_4++) {
						int_5 = -1;
						int_6 = -1;
						int_7 = -1;
						int_8 = Client.secretPacketBuffer2.getUSmart();
						if (int_8 == 32767) {
							int_8 = Client.secretPacketBuffer2.getUSmart();
							int_6 = Client.secretPacketBuffer2.getUSmart();
							int_5 = Client.secretPacketBuffer2.getUSmart();
							int_7 = Client.secretPacketBuffer2.getUSmart();
						} else if (int_8 != 32766) {
							int_6 = Client.secretPacketBuffer2.getUSmart();
						} else {
							int_8 = -1;
						}

						int_9 = Client.secretPacketBuffer2.getUSmart();
						npc_0.method881(int_8, int_6, int_5, int_7, Client.gameCycle, int_9);
					}
				}

				int_4 = Client.secretPacketBuffer2.method669();
				if (int_4 > 0) {
					for (int_8 = 0; int_8 < int_4; int_8++) {
						int_5 = Client.secretPacketBuffer2.getUSmart();
						int_6 = Client.secretPacketBuffer2.getUSmart();
						if (int_6 != 32767) {
							int_7 = Client.secretPacketBuffer2.getUSmart();
							int_9 = Client.secretPacketBuffer2.readUnsignedByte();
							final int int_10 = int_6 > 0 ? Client.secretPacketBuffer2.method667() : int_9;
							npc_0.method884(int_5, Client.gameCycle, int_6, int_7, int_9, int_10);
						} else {
							npc_0.method882(int_5);
						}
					}
				}
			}

			if ((int_2 & 0x1) != 0) {
				npc_0.interacting = Client.secretPacketBuffer2.readUnsignedShort();
				if (npc_0.interacting == 65535) {
					npc_0.interacting = -1;
				}
			}

			if ((int_2 & 0x20) != 0) {
				npc_0.overhead = Client.secretPacketBuffer2.readString();
				npc_0.anInt554 = 100;
			}

			if ((int_2 & 0x40) != 0) {
				int_3 = Client.secretPacketBuffer2.readUnsignedShortOb1();
				if (int_3 == 65535) {
					int_3 = -1;
				}

				int_4 = Client.secretPacketBuffer2.method669();
				if ((int_3 == npc_0.animation) && (int_3 != -1)) {
					int_8 = Class54.getAnimation(int_3).replyMode;
					if (int_8 == 1) {
						npc_0.actionFrame = 0;
						npc_0.anInt559 = 0;
						npc_0.actionAnimationDisable = int_4;
						npc_0.anInt560 = 0;
					}

					if (int_8 == 2) {
						npc_0.anInt560 = 0;
					}
				} else if ((int_3 == -1) || (npc_0.animation == -1) || (Class54
						.getAnimation(int_3).forcedPriority >= Class54.getAnimation(npc_0.animation).forcedPriority)) {
					npc_0.animation = int_3;
					npc_0.actionFrame = 0;
					npc_0.anInt559 = 0;
					npc_0.actionAnimationDisable = int_4;
					npc_0.anInt560 = 0;
					npc_0.anInt540 = npc_0.queueSize;
				}
			}

			if ((int_2 & 0x8) != 0) {
				int_3 = Client.secretPacketBuffer2.readByteOb1();
				int_4 = Client.secretPacketBuffer2.readByteOb1();
				int_8 = npc_0.anInt547 - ((int_3 - AClass2.baseX - AClass2.baseX) * 64);
				int_5 = npc_0.anInt550 - ((int_4 - AClass4_Sub1.baseY - AClass4_Sub1.baseY) * 64);
				if ((int_8 != 0) || (int_5 != 0)) {
					npc_0.anInt539 = (int) (Math.atan2(int_8, int_5) * 325.949D) & 0x7FF;
				}
			}

			if ((int_2 & 0x4) != 0) {
				npc_0.graphic = Client.secretPacketBuffer2.readByteOb1();
				int_3 = Client.secretPacketBuffer2.method662();
				npc_0.anInt557 = int_3 >> 16;
				npc_0.graphicsDelay = (int_3 & 0xFFFF) + Client.gameCycle;
				npc_0.anInt553 = 0;
				npc_0.anInt561 = 0;
				if (npc_0.graphicsDelay > Client.gameCycle) {
					npc_0.anInt553 = -1;
				}

				if (npc_0.graphic == 65535) {
					npc_0.graphic = -1;
				}
			}

			if ((int_2 & 0x2) != 0) {
				npc_0.composition = Class81.getNpcDefinition(Client.secretPacketBuffer2.readByteOb1());
				npc_0.anInt542 = npc_0.composition.anInt518;
				npc_0.anInt564 = npc_0.composition.anInt531;
				npc_0.anInt545 = npc_0.composition.anInt520;
				npc_0.anInt546 = npc_0.composition.anInt525;
				npc_0.anInt548 = npc_0.composition.anInt526;
				npc_0.anInt549 = npc_0.composition.anInt527;
				npc_0.idlePoseAnimation = npc_0.composition.anInt519;
				npc_0.anInt543 = npc_0.composition.anInt521;
				npc_0.anInt544 = npc_0.composition.anInt522;
			}
		}

		for (int_0 = 0; int_0 < Client.anInt748; int_0++) {
			int_1 = Client.anIntArray166[int_0];
			if (Client.cachedNPCs[int_1].anInt562 != Client.gameCycle) {
				Client.cachedNPCs[int_1].composition = null;
				Client.cachedNPCs[int_1] = null;
			}
		}

		if (Client.packetLength != Client.secretPacketBuffer2.offset) {
			throw new RuntimeException(Client.secretPacketBuffer2.offset + "," + Client.packetLength);
		} else {
			for (int_0 = 0; int_0 < Client.anInt690; int_0++) {
				if (Client.cachedNPCs[Client.npcIndices[int_0]] == null) {
					throw new RuntimeException(int_0 + "," + Client.anInt690);
				}
			}

		}
	}

}
