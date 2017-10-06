public final class GroundObject {

	public Renderable renderable;
	public int hash;
	int anInt233;
	int anInt234;
	int floor;
	int renderInfoBitPacked;

	static String method536(final char char_0, final int int_0) {
		final char[] chars_0 = new char[int_0];

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			chars_0[int_1] = char_0;
		}

		return new String(chars_0);
	}

	static final void method537(final PacketBuffer packetbuffer_0, final int int_0) {
		final int int_1 = packetbuffer_0.offset;
		Class40.anInt96 = 0;
		int int_2 = 0;
		packetbuffer_0.bitAccess();

		int int_3;
		int int_4;
		int int_5;
		for (int_3 = 0; int_3 < Class40.anInt94; int_3++) {
			int_4 = Class40.anIntArray17[int_3];
			if ((Class40.aByteArray4[int_4] & 0x1) == 0) {
				if (int_2 > 0) {
					--int_2;
					Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
				} else {
					int_5 = packetbuffer_0.getBits(1);
					if (int_5 == 0) {
						int_2 = Class7.method115(packetbuffer_0);
						Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
					} else {
						Class19.decodeMovement(packetbuffer_0, int_4);
					}
				}
			}
		}

		packetbuffer_0.byteAccess();
		if (int_2 != 0) {
			throw new RuntimeException();
		} else {
			packetbuffer_0.bitAccess();

			for (int_3 = 0; int_3 < Class40.anInt94; int_3++) {
				int_4 = Class40.anIntArray17[int_3];
				if ((Class40.aByteArray4[int_4] & 0x1) != 0) {
					if (int_2 > 0) {
						--int_2;
						Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
					} else {
						int_5 = packetbuffer_0.getBits(1);
						if (int_5 == 0) {
							int_2 = Class7.method115(packetbuffer_0);
							Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
						} else {
							Class19.decodeMovement(packetbuffer_0, int_4);
						}
					}
				}
			}

			packetbuffer_0.byteAccess();
			if (int_2 != 0) {
				throw new RuntimeException();
			} else {
				packetbuffer_0.bitAccess();

				for (int_3 = 0; int_3 < Class40.anInt95; int_3++) {
					int_4 = Class40.anIntArray18[int_3];
					if ((Class40.aByteArray4[int_4] & 0x1) != 0) {
						if (int_2 > 0) {
							--int_2;
							Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
						} else {
							int_5 = packetbuffer_0.getBits(1);
							if (int_5 == 0) {
								int_2 = Class7.method115(packetbuffer_0);
								Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
							} else if (Class58.decodeRegionHash(packetbuffer_0, int_4)) {
								Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
							}
						}
					}
				}

				packetbuffer_0.byteAccess();
				if (int_2 != 0) {
					throw new RuntimeException();
				} else {
					packetbuffer_0.bitAccess();

					for (int_3 = 0; int_3 < Class40.anInt95; int_3++) {
						int_4 = Class40.anIntArray18[int_3];
						if ((Class40.aByteArray4[int_4] & 0x1) == 0) {
							if (int_2 > 0) {
								--int_2;
								Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
							} else {
								int_5 = packetbuffer_0.getBits(1);
								if (int_5 == 0) {
									int_2 = Class7.method115(packetbuffer_0);
									Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
								} else if (Class58.decodeRegionHash(packetbuffer_0, int_4)) {
									Class40.aByteArray4[int_4] = (byte) (Class40.aByteArray4[int_4] | 0x2);
								}
							}
						}
					}

					packetbuffer_0.byteAccess();
					if (int_2 != 0) {
						throw new RuntimeException();
					} else {
						Class40.anInt94 = 0;
						Class40.anInt95 = 0;

						Player player_0;
						for (int_3 = 1; int_3 < 2048; int_3++) {
							Class40.aByteArray4[int_3] = (byte) (Class40.aByteArray4[int_3] >> 1);
							player_0 = Client.cachedPlayers[int_3];
							if (player_0 != null) {
								Class40.anIntArray17[++Class40.anInt94 - 1] = int_3;
							} else {
								Class40.anIntArray18[++Class40.anInt95 - 1] = int_3;
							}
						}

						for (int_2 = 0; int_2 < Class40.anInt96; int_2++) {
							int_3 = Class40.anIntArray22[int_2];
							player_0 = Client.cachedPlayers[int_3];
							int_5 = packetbuffer_0.readUnsignedByte();
							if ((int_5 & 0x2) != 0) {
								int_5 += packetbuffer_0.readUnsignedByte() << 8;
							}

							byte byte_0 = -1;
							int int_6;
							if ((int_5 & 0x40) != 0) {
								int_6 = packetbuffer_0.readUnsignedByte();
								final byte[] bytes_0 = new byte[int_6];
								final Buffer buffer_0 = new Buffer(bytes_0);
								packetbuffer_0.readBytes(bytes_0, 0, int_6);
								Class40.aBufferArray1[int_3] = buffer_0;
								player_0.decodeApperance(buffer_0);
							}

							int int_7;
							if ((int_5 & 0x1) != 0) {
								int_6 = packetbuffer_0.readUnsignedShort();
								if (int_6 == 65535) {
									int_6 = -1;
								}

								int_7 = packetbuffer_0.readUnsignedByte();
								Timer.method560(player_0, int_6, int_7);
							}

							if ((int_5 & 0x20) != 0) {
								player_0.interacting = packetbuffer_0.readUnsignedShort();
								if (player_0.interacting == 65535) {
									player_0.interacting = -1;
								}
							}

							if ((int_5 & 0x10) != 0) {
								player_0.overhead = packetbuffer_0.readString();
								if (player_0.overhead.charAt(0) == 126) {
									player_0.overhead = player_0.overhead.substring(1);
									WidgetNode.sendGameMessage(2, player_0.name, player_0.overhead);
								} else if (player_0 == Script.localPlayer) {
									WidgetNode.sendGameMessage(2, player_0.name, player_0.overhead);
								}

								player_0.aBool63 = false;
								player_0.anInt555 = 0;
								player_0.anInt556 = 0;
								player_0.anInt554 = 150;
							}

							int int_9;
							int int_10;
							if ((int_5 & 0x8) != 0) {
								int_6 = packetbuffer_0.readUnsignedByte();
								int int_8;
								int int_11;
								int int_12;
								if (int_6 > 0) {
									for (int_7 = 0; int_7 < int_6; int_7++) {
										int_8 = -1;
										int_9 = -1;
										int_10 = -1;
										int_11 = packetbuffer_0.getUSmart();
										if (int_11 == 32767) {
											int_11 = packetbuffer_0.getUSmart();
											int_9 = packetbuffer_0.getUSmart();
											int_8 = packetbuffer_0.getUSmart();
											int_10 = packetbuffer_0.getUSmart();
										} else if (int_11 != 32766) {
											int_9 = packetbuffer_0.getUSmart();
										} else {
											int_11 = -1;
										}

										int_12 = packetbuffer_0.getUSmart();
										player_0.method881(int_11, int_9, int_8, int_10, Client.gameCycle, int_12);
									}
								}

								int_7 = packetbuffer_0.readUnsignedByte();
								if (int_7 > 0) {
									for (int_11 = 0; int_11 < int_7; int_11++) {
										int_8 = packetbuffer_0.getUSmart();
										int_9 = packetbuffer_0.getUSmart();
										if (int_9 != 32767) {
											int_10 = packetbuffer_0.getUSmart();
											int_12 = packetbuffer_0.readUnsignedByte();
											final int int_13 = int_9 > 0 ? packetbuffer_0.readUnsignedByte() : int_12;
											player_0.method884(int_8, Client.gameCycle, int_9, int_10, int_12, int_13);
										} else {
											player_0.method882(int_8);
										}
									}
								}
							}

							if ((int_5 & 0x80) != 0) {
								player_0.anInt539 = packetbuffer_0.readUnsignedShort();
								if (player_0.queueSize == 0) {
									player_0.orientation = player_0.anInt539;
									player_0.anInt539 = -1;
								}
							}

							if ((int_5 & 0x4) != 0) {
								int_6 = packetbuffer_0.readUnsignedShort();
								final Permission[] permissions_0 = new Permission[] { Permission.aPermission1,
										Permission.aPermission4, Permission.aPermission2, Permission.aPermission6,
										Permission.aPermission5, Permission.aPermission3 };
								final Permission permission_0 = (Permission) PendingSpawn.forOrdinal(permissions_0,
										packetbuffer_0.readUnsignedByte());
								final boolean bool_0 = packetbuffer_0.readUnsignedByte() == 1;
								int_9 = packetbuffer_0.readUnsignedByte();
								int_10 = packetbuffer_0.offset;
								if ((player_0.name != null) && (player_0.composition != null)) {
									boolean bool_1 = false;
									if (permission_0.aBool38 && MilliTimer.isIgnored(player_0.name)) {
										bool_1 = true;
									}

									if (!bool_1 && (Client.anInt715 == 0) && !player_0.hidden) {
										Class40.aBuffer2.offset = 0;
										packetbuffer_0.readBytes(Class40.aBuffer2.payload, 0, int_9);
										Class40.aBuffer2.offset = 0;
										final Buffer buffer_1 = Class40.aBuffer2;

										int int_14;
										String string_1;
										try {
											int_14 = buffer_1.getUSmart();
											if (int_14 > 32767) {
												int_14 = 32767;
											}

											final byte[] bytes_1 = new byte[int_14];
											buffer_1.offset += Class99.aHuffman1.decompress(buffer_1.payload,
													buffer_1.offset, bytes_1, 0, int_14);
											final String string_0 = Class46.getString(bytes_1, 0, int_14);
											string_1 = string_0;
										} catch (final Exception exception_0) {
											string_1 = "Cabbage";
										}

										string_1 = FontTypeFace.appendTags(XGrandExchangeOffer.method113(string_1));
										player_0.overhead = string_1.trim();
										player_0.anInt555 = int_6 >> 8;
										player_0.anInt556 = int_6 & 0xFF;
										player_0.anInt554 = 150;
										player_0.aBool63 = bool_0;
										player_0.inSequence = (player_0 != Script.localPlayer) && permission_0.aBool38
												&& ("" != Client.aString35)
												&& (string_1.toLowerCase().indexOf(Client.aString35) == -1);
										if (permission_0.aBool37) {
											int_14 = bool_0 ? 91 : 1;
										} else {
											int_14 = bool_0 ? 90 : 2;
										}

										if (permission_0.anInt322 != -1) {
											WidgetNode.sendGameMessage(int_14,
													CombatInfo1.method650(permission_0.anInt322) + player_0.name,
													string_1);
										} else {
											WidgetNode.sendGameMessage(int_14, player_0.name, string_1);
										}
									}
								}

								packetbuffer_0.offset = int_9 + int_10;
							}

							if ((int_5 & 0x200) != 0) {
								player_0.graphic = packetbuffer_0.readUnsignedShort();
								int_6 = packetbuffer_0.readInt();
								player_0.anInt557 = int_6 >> 16;
								player_0.graphicsDelay = (int_6 & 0xFFFF) + Client.gameCycle;
								player_0.anInt553 = 0;
								player_0.anInt561 = 0;
								if (player_0.graphicsDelay > Client.gameCycle) {
									player_0.anInt553 = -1;
								}

								if (player_0.graphic == 65535) {
									player_0.graphic = -1;
								}
							}

							if ((int_5 & 0x400) != 0) {
								player_0.anInt567 = packetbuffer_0.readByte();
								player_0.anInt568 = packetbuffer_0.readByte();
								player_0.anInt569 = packetbuffer_0.readByte();
								player_0.anInt570 = packetbuffer_0.readByte();
								player_0.anInt565 = packetbuffer_0.readUnsignedShort() + Client.gameCycle;
								player_0.anInt566 = packetbuffer_0.readUnsignedShort() + Client.gameCycle;
								player_0.anInt571 = packetbuffer_0.readUnsignedShort();
								if (player_0.aBool74) {
									player_0.anInt567 += player_0.anInt642;
									player_0.anInt568 += player_0.anInt643;
									player_0.anInt569 += player_0.anInt642;
									player_0.anInt570 += player_0.anInt643;
									player_0.queueSize = 0;
								} else {
									player_0.anInt567 += player_0.pathX[0];
									player_0.anInt568 += player_0.pathY[0];
									player_0.anInt569 += player_0.pathX[0];
									player_0.anInt570 += player_0.pathY[0];
									player_0.queueSize = 1;
								}

								player_0.anInt540 = 0;
							}

							if ((int_5 & 0x100) != 0) {
								Class40.aByteArray5[int_3] = packetbuffer_0.readByte();
							}

							if ((int_5 & 0x1000) != 0) {
								byte_0 = packetbuffer_0.readByte();
							}

							if ((int_5 & 0x800) != 0) {
								for (int_6 = 0; int_6 < 3; int_6++) {
									player_0.actions[int_6] = packetbuffer_0.readString();
								}
							}

							if (player_0.aBool74) {
								if (byte_0 == 127) {
									player_0.method1032(player_0.anInt642, player_0.anInt643);
								} else {
									byte byte_1;
									if (byte_0 != -1) {
										byte_1 = byte_0;
									} else {
										byte_1 = Class40.aByteArray5[int_3];
									}

									player_0.method1034(player_0.anInt642, player_0.anInt643, byte_1);
								}
							}
						}

						if ((packetbuffer_0.offset - int_1) != int_0) {
							throw new RuntimeException((packetbuffer_0.offset - int_1) + " " + int_0);
						}
					}
				}
			}
		}
	}

	static final void method538(final String string_0, final int int_0) {
		Client.secretPacketBuffer1.putOpcode(179);
		Client.secretPacketBuffer1.putByte(DecorativeObject.getLength(string_0) + 1);
		Client.secretPacketBuffer1.method676(int_0);
		Client.secretPacketBuffer1.putString(string_0);
	}

	static void method539(final int int_0, final int int_1, final int int_2, final boolean bool_0, final int int_3,
			final boolean bool_1) {
		if (int_0 < int_1) {
			final int int_4 = (int_0 + int_1) / 2;
			int int_5 = int_0;
			final World world_0 = World.worldList[int_4];
			World.worldList[int_4] = World.worldList[int_1];
			World.worldList[int_1] = world_0;

			for (int int_6 = int_0; int_6 < int_1; int_6++) {
				final World world_1 = World.worldList[int_6];
				final int int_7 = CombatInfo1.method653(world_1, world_0, int_2, bool_0);
				int int_8;
				if (int_7 != 0) {
					if (bool_0) {
						int_8 = -int_7;
					} else {
						int_8 = int_7;
					}
				} else if (int_3 == -1) {
					int_8 = 0;
				} else {
					final int int_9 = CombatInfo1.method653(world_1, world_0, int_3, bool_1);
					if (bool_1) {
						int_8 = -int_9;
					} else {
						int_8 = int_9;
					}
				}

				if (int_8 <= 0) {
					final World world_2 = World.worldList[int_6];
					World.worldList[int_6] = World.worldList[int_5];
					World.worldList[int_5++] = world_2;
				}
			}

			World.worldList[int_1] = World.worldList[int_5];
			World.worldList[int_5] = world_0;
			method539(int_0, int_5 - 1, int_2, bool_0, int_3, bool_1);
			method539(int_5 + 1, int_1, int_2, bool_0, int_3, bool_1);
		}
	}

}
