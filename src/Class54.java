public class Class54 {

	static Class25 worldServersDownload;
	IndexDataBase vorbis_index;
	IndexDataBase sfx_index;
	XHashTable aXHashTable1;
	XHashTable aXHashTable2;

	public Class54(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1) {
		aXHashTable2 = new XHashTable(256);
		aXHashTable1 = new XHashTable(256);
		sfx_index = indexdatabase_0;
		vorbis_index = indexdatabase_1;
	}

	AClass7_Sub1 method324(final int int_0, final int int_1, final int[] ints_0) {
		int int_2 = int_1 ^ (((int_0 << 4) & 0xFFFF) | (int_0 >>> 12));
		int_2 |= int_0 << 16;
		final long long_0 = int_2 ^ 0x100000000L;
		AClass7_Sub1 aclass7_sub1_0 = (AClass7_Sub1) aXHashTable1.get(long_0);
		if (aclass7_sub1_0 != null) {
			return aclass7_sub1_0;
		} else if ((ints_0 != null) && (ints_0[0] <= 0)) {
			return null;
		} else {
			Node_Sub2 node_sub2_0 = (Node_Sub2) aXHashTable2.get(long_0);
			if (node_sub2_0 == null) {
				node_sub2_0 = Node_Sub2.method623(vorbis_index, int_0, int_1);
				if (node_sub2_0 == null) {
					return null;
				}

				aXHashTable2.put(node_sub2_0, long_0);
			}

			aclass7_sub1_0 = node_sub2_0.method620(ints_0);
			if (aclass7_sub1_0 == null) {
				return null;
			} else {
				node_sub2_0.unlink();
				aXHashTable1.put(aclass7_sub1_0, long_0);
				return aclass7_sub1_0;
			}
		}
	}

	AClass7_Sub1 method325(final int int_0, final int int_1, final int[] ints_0) {
		int int_2 = int_1 ^ (((int_0 << 4) & 0xFFFF) | (int_0 >>> 12));
		int_2 |= int_0 << 16;
		final long long_0 = int_2;
		AClass7_Sub1 aclass7_sub1_0 = (AClass7_Sub1) aXHashTable1.get(long_0);
		if (aclass7_sub1_0 != null) {
			return aclass7_sub1_0;
		} else if ((ints_0 != null) && (ints_0[0] <= 0)) {
			return null;
		} else {
			final SoundEffect soundeffect_0 = SoundEffect.getTrack(sfx_index, int_0, int_1);
			if (soundeffect_0 == null) {
				return null;
			} else {
				aclass7_sub1_0 = soundeffect_0.method402();
				aXHashTable1.put(aclass7_sub1_0, long_0);
				if (ints_0 != null) {
					ints_0[0] -= aclass7_sub1_0.aByteArray19.length;
				}

				return aclass7_sub1_0;
			}
		}
	}

	public AClass7_Sub1 method326(final int int_0, final int[] ints_0) {
		if (sfx_index.size() == 1) {
			return method325(0, int_0, ints_0);
		} else if (sfx_index.fileCount(int_0) == 1) {
			return method325(int_0, 0, ints_0);
		} else {
			throw new RuntimeException();
		}
	}

	public AClass7_Sub1 method327(final int int_0, final int[] ints_0) {
		if (vorbis_index.size() == 1) {
			return method324(0, int_0, ints_0);
		} else if (vorbis_index.fileCount(int_0) == 1) {
			return method324(int_0, 0, ints_0);
		} else {
			throw new RuntimeException();
		}
	}

	public static Sequence getAnimation(final int int_0) {
		Sequence sequence_0 = (Sequence) Sequence.sequences.get(int_0);
		if (sequence_0 != null) {
			return sequence_0;
		} else {
			final byte[] bytes_0 = Sequence.seq_ref.getConfigData(12, int_0);
			sequence_0 = new Sequence();
			if (bytes_0 != null) {
				sequence_0.decode(new Buffer(bytes_0));
			}

			sequence_0.post();
			Sequence.sequences.put(sequence_0, int_0);
			return sequence_0;
		}
	}

	public static int method328(final byte[] bytes_0, final int int_0, final CharSequence charsequence_0) {
		final int int_1 = charsequence_0.length();
		int int_2 = int_0;

		for (int int_3 = 0; int_3 < int_1; int_3++) {
			final char char_0 = charsequence_0.charAt(int_3);
			if (char_0 <= 127) {
				bytes_0[int_2++] = (byte) char_0;
			} else if (char_0 <= 2047) {
				bytes_0[int_2++] = (byte) (0xC0 | (char_0 >> 6));
				bytes_0[int_2++] = (byte) (0x80 | (char_0 & 0x3F));
			} else {
				bytes_0[int_2++] = (byte) (0xE0 | (char_0 >> 12));
				bytes_0[int_2++] = (byte) (0x80 | ((char_0 >> 6) & 0x3F));
				bytes_0[int_2++] = (byte) (0x80 | (char_0 & 0x3F));
			}
		}

		return int_2 - int_0;
	}

	public static final boolean method329() {
		synchronized (KeyFocusListener.keyboard) {
			if (KeyFocusListener.anInt129 == KeyFocusListener.anInt127) {
				return false;
			} else {
				KeyFocusListener.anInt130 = KeyFocusListener.anIntArray31[KeyFocusListener.anInt127];
				Class76.aChar1 = KeyFocusListener.aCharArray1[KeyFocusListener.anInt127];
				KeyFocusListener.anInt127 = (KeyFocusListener.anInt127 + 1) & 0x7F;
				return true;
			}
		}
	}

	static final void method330(final boolean bool_0) {
		for (int int_0 = 0; int_0 < Client.anInt690; int_0++) {
			final NPC npc_0 = Client.cachedNPCs[Client.npcIndices[int_0]];
			int int_1 = (Client.npcIndices[int_0] << 14) + 536870912;
			if ((npc_0 != null) && npc_0.hasConfig() && (npc_0.composition.isVisible == bool_0)
					&& npc_0.composition.method837()) {
				final int int_2 = npc_0.anInt547 >> 7;
				final int int_3 = npc_0.anInt550 >> 7;
				if ((int_2 >= 0) && (int_2 < 104) && (int_3 >= 0) && (int_3 < 104)) {
					if ((npc_0.anInt542 == 1) && ((npc_0.anInt547 & 0x7F) == 64) && ((npc_0.anInt550 & 0x7F) == 64)) {
						if (Client.anIntArrayArray21[int_2][int_3] == Client.anInt699) {
							continue;
						}

						Client.anIntArrayArray21[int_2][int_3] = Client.anInt699;
					}

					if (!npc_0.composition.aBool58) {
						int_1 -= Integer.MIN_VALUE;
					}

					Class8.region.method356(AClass1_Sub1.plane, npc_0.anInt547, npc_0.anInt550,
							Actor.getTileHeight(((npc_0.anInt542 * 64) - 64) + npc_0.anInt547,
									((npc_0.anInt542 * 64) - 64) + npc_0.anInt550, AClass1_Sub1.plane),
							((npc_0.anInt542 * 64) - 64) + 60, npc_0, npc_0.angle, int_1, npc_0.aBool61);
				}
			}
		}

	}

}
