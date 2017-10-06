import java.io.EOFException;

public class Varcs {

	static Enum6 anEnum6_1;
	static int[] anIntArray59;
	boolean changed;
	String[] varcstrings;
	int[] varcs;
	long lastSerialize;
	boolean[] varcSerials;
	boolean[] varcstringSerials;

	Varcs() {
		changed = false;
		varcs = new int[Tile.configsIndex.fileCount(19)];
		varcstrings = new String[Tile.configsIndex.fileCount(15)];
		varcSerials = new boolean[varcs.length];

		int int_0;
		for (int_0 = 0; int_0 < varcs.length; int_0++) {
			CacheableNode_Sub5 cacheablenode_sub5_0 = (CacheableNode_Sub5) CacheableNode_Sub5.aNodeCache17.get(int_0);
			CacheableNode_Sub5 cacheablenode_sub5_1;
			if (cacheablenode_sub5_0 != null) {
				cacheablenode_sub5_1 = cacheablenode_sub5_0;
			} else {
				final byte[] bytes_0 = CacheableNode_Sub5.anIndexDataBase26.getConfigData(19, int_0);
				cacheablenode_sub5_0 = new CacheableNode_Sub5();
				if (bytes_0 != null) {
					cacheablenode_sub5_0.method829(new Buffer(bytes_0));
				}

				CacheableNode_Sub5.aNodeCache17.put(cacheablenode_sub5_0, int_0);
				cacheablenode_sub5_1 = cacheablenode_sub5_0;
			}

			varcSerials[int_0] = cacheablenode_sub5_1.aBool56;
		}

		varcstringSerials = new boolean[varcstrings.length];

		for (int_0 = 0; int_0 < varcstrings.length; int_0++) {
			final CacheableNode_Sub6 cacheablenode_sub6_0 = Class66.getVarClientStringType(int_0);
			varcstringSerials[int_0] = cacheablenode_sub6_0.aBool57;
		}

		for (int_0 = 0; int_0 < varcs.length; int_0++) {
			varcs[int_0] = -1;
		}

		deserialize();
	}

	FileOnDisk getVarPrefs(final boolean bool_0) {
		return RuntimeException_Sub1.getPreferencesFile("2", anEnum6_1.aString19, bool_0);
	}

	boolean changed() {
		return changed;
	}

	void serialize() {
		final FileOnDisk fileondisk_0 = getVarPrefs(true);

		try {
			int int_0 = 3;
			int int_1 = 0;

			int int_2;
			for (int_2 = 0; int_2 < varcs.length; int_2++) {
				if (varcSerials[int_2] && (varcs[int_2] != -1)) {
					int_0 += 6;
					++int_1;
				}
			}

			int_0 += 2;
			int_2 = 0;

			for (int int_3 = 0; int_3 < varcstrings.length; int_3++) {
				if (varcstringSerials[int_3] && (varcstrings[int_3] != null)) {
					int_0 += 2 + DecorativeObject.getLength(varcstrings[int_3]);
					++int_2;
				}
			}

			final Buffer buffer_0 = new Buffer(int_0);
			buffer_0.putByte(1);
			buffer_0.putShort(int_1);

			int int_4;
			for (int_4 = 0; int_4 < varcs.length; int_4++) {
				if (varcSerials[int_4] && (varcs[int_4] != -1)) {
					buffer_0.putShort(int_4);
					buffer_0.putInt(varcs[int_4]);
				}
			}

			buffer_0.putShort(int_2);

			for (int_4 = 0; int_4 < varcstrings.length; int_4++) {
				if (varcstringSerials[int_4] && (varcstrings[int_4] != null)) {
					buffer_0.putShort(int_4);
					buffer_0.putString(varcstrings[int_4]);
				}
			}

			fileondisk_0.write(buffer_0.payload, 0, buffer_0.offset);
		} catch (final Exception exception_0) {
			;
		} finally {
			try {
				fileondisk_0.close();
			} catch (final Exception exception_1) {
				;
			}

		}

		changed = false;
		lastSerialize = Class6.currentTimeMs();
	}

	void deserialize() {
		final FileOnDisk fileondisk_0 = getVarPrefs(false);

		label175: {
			try {
				final byte[] bytes_0 = new byte[(int) fileondisk_0.length()];

				int int_1;
				for (int int_0 = 0; int_0 < bytes_0.length; int_0 += int_1) {
					int_1 = fileondisk_0.read(bytes_0, int_0, bytes_0.length - int_0);
					if (int_1 == -1) {
						throw new EOFException();
					}
				}

				final Buffer buffer_0 = new Buffer(bytes_0);
				if ((buffer_0.payload.length - buffer_0.offset) < 1) {
					return;
				}

				final int int_2 = buffer_0.readUnsignedByte();
				if ((int_2 >= 0) && (int_2 <= 1)) {
					final int int_3 = buffer_0.readUnsignedShort();

					int int_4;
					int int_5;
					int int_6;
					for (int_4 = 0; int_4 < int_3; int_4++) {
						int_5 = buffer_0.readUnsignedShort();
						int_6 = buffer_0.readInt();
						if (varcSerials[int_5]) {
							varcs[int_5] = int_6;
						}
					}

					int_4 = buffer_0.readUnsignedShort();
					int_5 = 0;

					while (true) {
						if (int_5 >= int_4) {
							break label175;
						}

						int_6 = buffer_0.readUnsignedShort();
						final String string_0 = buffer_0.readString();
						if (varcstringSerials[int_6]) {
							varcstrings[int_6] = string_0;
						}

						++int_5;
					}
				}
			} catch (final Exception exception_0) {
				break label175;
			} finally {
				try {
					fileondisk_0.close();
				} catch (final Exception exception_1) {
					;
				}

			}

			return;
		}

		changed = false;
	}

	void reset() {
		int int_0;
		for (int_0 = 0; int_0 < varcs.length; int_0++) {
			if (!varcSerials[int_0]) {
				varcs[int_0] = -1;
			}
		}

		for (int_0 = 0; int_0 < varcstrings.length; int_0++) {
			if (!varcstringSerials[int_0]) {
				varcstrings[int_0] = null;
			}
		}

	}

	void process() {
		if (changed && (lastSerialize < (Class6.currentTimeMs() - 60000L))) {
			serialize();
		}

	}

	String getVarcString(final int int_0) {
		return varcstrings[int_0];
	}

	int getVarc(final int int_0) {
		return varcs[int_0];
	}

	void putVarc(final int int_0, final int int_1) {
		varcs[int_0] = int_1;
		if (varcSerials[int_0]) {
			changed = true;
		}

	}

	void putVarcString(final int int_0, final String string_0) {
		varcstrings[int_0] = string_0;
		if (varcstringSerials[int_0]) {
			changed = true;
		}

	}

	public static void method505() {
		Varbit.varbits.reset();
	}

	static final void method506(final int int_0, final int int_1, final boolean bool_0) {
		if (!bool_0 || (int_0 != Class7.anInt27) || (Class12.anInt39 != int_1)) {
			Class7.anInt27 = int_0;
			Class12.anInt39 = int_1;
			WorldMapType2.setGameState(25);
			Class30.drawStatusBox("Loading - please wait.", true);
			int int_2 = AClass2.baseX;
			int int_3 = AClass4_Sub1.baseY;
			AClass2.baseX = (int_0 - 6) * 8;
			AClass4_Sub1.baseY = (int_1 - 6) * 8;
			final int int_4 = AClass2.baseX - int_2;
			final int int_5 = AClass4_Sub1.baseY - int_3;
			int_2 = AClass2.baseX;
			int_3 = AClass4_Sub1.baseY;

			int int_6;
			int int_7;
			for (int_6 = 0; int_6 < 32768; int_6++) {
				final NPC npc_0 = Client.cachedNPCs[int_6];
				if (npc_0 != null) {
					for (int_7 = 0; int_7 < 10; int_7++) {
						npc_0.pathX[int_7] -= int_4;
						npc_0.pathY[int_7] -= int_5;
					}

					npc_0.anInt547 -= int_4 * 128;
					npc_0.anInt550 -= int_5 * 128;
				}
			}

			for (int_6 = 0; int_6 < 2048; int_6++) {
				final Player player_0 = Client.cachedPlayers[int_6];
				if (player_0 != null) {
					for (int_7 = 0; int_7 < 10; int_7++) {
						player_0.pathX[int_7] -= int_4;
						player_0.pathY[int_7] -= int_5;
					}

					player_0.anInt547 -= int_4 * 128;
					player_0.anInt550 -= int_5 * 128;
				}
			}

			byte byte_4 = 0;
			byte byte_0 = 104;
			byte byte_5 = 1;
			if (int_4 < 0) {
				byte_4 = 103;
				byte_0 = -1;
				byte_5 = -1;
			}

			byte byte_1 = 0;
			byte byte_2 = 104;
			byte byte_3 = 1;
			if (int_5 < 0) {
				byte_1 = 103;
				byte_2 = -1;
				byte_3 = -1;
			}

			int int_9;
			for (int int_8 = byte_4; int_8 != byte_0; int_8 += byte_5) {
				for (int_9 = byte_1; int_9 != byte_2; int_9 += byte_3) {
					final int int_10 = int_8 + int_4;
					final int int_11 = int_5 + int_9;

					for (int int_12 = 0; int_12 < 4; int_12++) {
						if ((int_10 >= 0) && (int_11 >= 0) && (int_10 < 104) && (int_11 < 104)) {
							Client.groundItemDeque[int_12][int_8][int_9] = Client.groundItemDeque[int_12][int_10][int_11];
						} else {
							Client.groundItemDeque[int_12][int_8][int_9] = null;
						}
					}
				}
			}

			for (PendingSpawn pendingspawn_0 = (PendingSpawn) Client.pendingSpawns
					.getFront(); pendingspawn_0 != null; pendingspawn_0 = (PendingSpawn) Client.pendingSpawns
							.getNext()) {
				pendingspawn_0.anInt363 -= int_4;
				pendingspawn_0.anInt364 -= int_5;
				if ((pendingspawn_0.anInt363 < 0) || (pendingspawn_0.anInt364 < 0) || (pendingspawn_0.anInt363 >= 104)
						|| (pendingspawn_0.anInt364 >= 104)) {
					pendingspawn_0.unlink();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= int_4;
				Client.destinationY -= int_5;
			}

			Client.anInt700 = 0;
			Client.aBool85 = false;
			Client.anInt722 = -1;
			Client.graphicsObjectDeque.clear();
			Client.projectiles.clear();

			for (int_9 = 0; int_9 < 4; int_9++) {
				Client.collisionMaps[int_9].reset();
			}

		}
	}

	static final int method507(final int int_0, final int int_1) {
		int int_2 = (int_1 * 57) + int_0;
		int_2 ^= int_2 << 13;
		final int int_3 = ((int_2 * (789221 + (15731 * int_2 * int_2))) + 1376312589) & 0x7FFFFFFF;
		return (int_3 >> 19) & 0xFF;
	}

	static int method508(int int_0, final Script script_0, final boolean bool_0) {
		int int_1 = -1;
		Widget widget_0;
		if (int_0 >= 2000) {
			int_0 -= 1000;
			int_1 = Class45.intStack[--WorldMapType2.intStackSize];
			widget_0 = Class18.method202(int_1);
		} else {
			widget_0 = bool_0 ? Class45.aWidget6 : Class38.aWidget5;
		}

		if (int_0 == 1000) {
			WorldMapType2.intStackSize -= 4;
			widget_0.originalX = Class45.intStack[WorldMapType2.intStackSize];
			widget_0.originalY = Class45.intStack[WorldMapType2.intStackSize + 1];
			widget_0.anInt290 = Class45.intStack[WorldMapType2.intStackSize + 2];
			widget_0.anInt293 = Class45.intStack[WorldMapType2.intStackSize + 3];
			Class15.method196(widget_0);
			AClass1.clientInstance.method1045(widget_0);
			if ((int_1 != -1) && (widget_0.type == 0)) {
				Class5.method89(Widget.widgets[int_1 >> 16], widget_0, false);
			}

			return 1;
		} else if (int_0 == 1001) {
			WorldMapType2.intStackSize -= 4;
			widget_0.originalWidth = Class45.intStack[WorldMapType2.intStackSize];
			widget_0.anInt294 = Class45.intStack[WorldMapType2.intStackSize + 1];
			widget_0.anInt291 = Class45.intStack[WorldMapType2.intStackSize + 2];
			widget_0.buttonType = Class45.intStack[WorldMapType2.intStackSize + 3];
			Class15.method196(widget_0);
			AClass1.clientInstance.method1045(widget_0);
			if ((int_1 != -1) && (widget_0.type == 0)) {
				Class5.method89(Widget.widgets[int_1 >> 16], widget_0, false);
			}

			return 1;
		} else if (int_0 == 1003) {
			final boolean bool_1 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
			if (bool_1 != widget_0.isHidden) {
				widget_0.isHidden = bool_1;
				Class15.method196(widget_0);
			}

			return 1;
		} else if (int_0 == 1005) {
			widget_0.aBool30 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
			return 1;
		} else if (int_0 == 1006) {
			widget_0.aBool36 = Class45.intStack[--WorldMapType2.intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

}
