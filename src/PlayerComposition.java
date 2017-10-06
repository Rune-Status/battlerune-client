import java.io.IOException;

public class PlayerComposition {

	static final int[] anIntArray48;
	public static NodeCache aNodeCache1;
	public static short[] colorsToFind;
	public static short[] aShortArray3;
	public int transformedNpcId;
	int[] bodyPartColours;
	public boolean isFemale;
	long hash;
	int[] equipmentIds;
	long aLong11;

	static {
		anIntArray48 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
		aNodeCache1 = new NodeCache(260);
	}

	public void method480(int[] ints_0, final int[] ints_1, final boolean bool_0, final int int_0) {
		if (ints_0 == null) {
			ints_0 = new int[12];

			for (int int_1 = 0; int_1 < 7; int_1++) {
				for (int int_2 = 0; int_2 < KitDefinition.anInt465; int_2++) {
					final KitDefinition kitdefinition_0 = FloorUnderlayDefinition.getKitDefinition(int_2);
					if ((kitdefinition_0 != null) && !kitdefinition_0.nonSelectable
							&& (kitdefinition_0.bodyPartId == ((bool_0 ? 7 : 0) + int_1))) {
						ints_0[anIntArray48[int_1]] = int_2 + 256;
						break;
					}
				}
			}
		}

		equipmentIds = ints_0;
		bodyPartColours = ints_1;
		isFemale = bool_0;
		transformedNpcId = int_0;
		setHash();
	}

	void setHash() {
		final long long_0 = hash;
		final int int_0 = equipmentIds[5];
		final int int_1 = equipmentIds[9];
		equipmentIds[5] = int_1;
		equipmentIds[9] = int_0;
		hash = 0L;

		int int_2;
		for (int_2 = 0; int_2 < 12; int_2++) {
			hash <<= 4;
			if (equipmentIds[int_2] >= 256) {
				hash += equipmentIds[int_2] - 256;
			}
		}

		if (equipmentIds[0] >= 256) {
			hash += (equipmentIds[0] - 256) >> 4;
		}

		if (equipmentIds[1] >= 256) {
			hash += (equipmentIds[1] - 256) >> 8;
		}

		for (int_2 = 0; int_2 < 5; int_2++) {
			hash <<= 3;
			hash += bodyPartColours[int_2];
		}

		hash <<= 1;
		hash += isFemale ? 1 : 0;
		equipmentIds[5] = int_0;
		equipmentIds[9] = int_1;
		if ((long_0 != 0L) && (hash != long_0)) {
			aNodeCache1.remove(long_0);
		}

	}

	public Model method481(final Sequence sequence_0, final int int_0, final Sequence sequence_1, final int int_1) {
		if (transformedNpcId != -1) {
			return Class81.getNpcDefinition(transformedNpcId).method836(sequence_0, int_0, sequence_1, int_1);
		} else {
			long long_0 = hash;
			int[] ints_0 = equipmentIds;
			if ((sequence_0 != null) && ((sequence_0.leftHandItem >= 0) || (sequence_0.rightHandItem >= 0))) {
				ints_0 = new int[12];

				for (int int_2 = 0; int_2 < 12; int_2++) {
					ints_0[int_2] = equipmentIds[int_2];
				}

				if (sequence_0.leftHandItem >= 0) {
					long_0 += (sequence_0.leftHandItem - equipmentIds[5]) << 8;
					ints_0[5] = sequence_0.leftHandItem;
				}

				if (sequence_0.rightHandItem >= 0) {
					long_0 += (sequence_0.rightHandItem - equipmentIds[3]) << 16;
					ints_0[3] = sequence_0.rightHandItem;
				}
			}

			Model model_0 = (Model) aNodeCache1.get(long_0);
			if (model_0 == null) {
				boolean bool_0 = false;

				int int_4;
				for (int int_3 = 0; int_3 < 12; int_3++) {
					int_4 = ints_0[int_3];
					if ((int_4 >= 256) && (int_4 < 512)
							&& !FloorUnderlayDefinition.getKitDefinition(int_4 - 256).ready()) {
						bool_0 = true;
					}

					if ((int_4 >= 512) && !Class45.getItemDefinition(int_4 - 512).readyWorn(isFemale)) {
						bool_0 = true;
					}
				}

				if (bool_0) {
					if (aLong11 != -1L) {
						model_0 = (Model) aNodeCache1.get(aLong11);
					}

					if (model_0 == null) {
						return null;
					}
				}

				if (model_0 == null) {
					final ModelData[] modeldatas_0 = new ModelData[12];
					int_4 = 0;

					int int_6;
					for (int int_5 = 0; int_5 < 12; int_5++) {
						int_6 = ints_0[int_5];
						ModelData modeldata_0;
						if ((int_6 >= 256) && (int_6 < 512)) {
							modeldata_0 = FloorUnderlayDefinition.getKitDefinition(int_6 - 256).getModelData();
							if (modeldata_0 != null) {
								modeldatas_0[int_4++] = modeldata_0;
							}
						}

						if (int_6 >= 512) {
							modeldata_0 = Class45.getItemDefinition(int_6 - 512).getWornModelData(isFemale);
							if (modeldata_0 != null) {
								modeldatas_0[int_4++] = modeldata_0;
							}
						}
					}

					final ModelData modeldata_1 = new ModelData(modeldatas_0, int_4);

					for (int_6 = 0; int_6 < 5; int_6++) {
						if (bodyPartColours[int_6] < Class76.colorsToReplace[int_6].length) {
							modeldata_1.recolor(colorsToFind[int_6],
									Class76.colorsToReplace[int_6][bodyPartColours[int_6]]);
						}

						if (bodyPartColours[int_6] < Enum2.aShortArrayArray3[int_6].length) {
							modeldata_1.recolor(aShortArray3[int_6],
									Enum2.aShortArrayArray3[int_6][bodyPartColours[int_6]]);
						}
					}

					model_0 = modeldata_1.light(64, 850, -30, -50, -30);
					aNodeCache1.put(model_0, long_0);
					aLong11 = long_0;
				}
			}

			if ((sequence_0 == null) && (sequence_1 == null)) {
				return model_0;
			} else {
				Model model_1;
				if ((sequence_0 != null) && (sequence_1 != null)) {
					model_1 = sequence_0.method848(model_0, int_0, sequence_1, int_1);
				} else if (sequence_0 != null) {
					model_1 = sequence_0.method847(model_0, int_0);
				} else {
					model_1 = sequence_1.method847(model_0, int_1);
				}

				return model_1;
			}
		}
	}

	ModelData method482() {
		if (transformedNpcId != -1) {
			return Class81.getNpcDefinition(transformedNpcId).method835();
		} else {
			boolean bool_0 = false;

			int int_1;
			for (int int_0 = 0; int_0 < 12; int_0++) {
				int_1 = equipmentIds[int_0];
				if ((int_1 >= 256) && (int_1 < 512)
						&& !FloorUnderlayDefinition.getKitDefinition(int_1 - 256).method751()) {
					bool_0 = true;
				}

				if ((int_1 >= 512) && !Class45.getItemDefinition(int_1 - 512).method869(isFemale)) {
					bool_0 = true;
				}
			}

			if (bool_0) {
				return null;
			} else {
				final ModelData[] modeldatas_0 = new ModelData[12];
				int_1 = 0;

				int int_3;
				for (int int_2 = 0; int_2 < 12; int_2++) {
					int_3 = equipmentIds[int_2];
					ModelData modeldata_0;
					if ((int_3 >= 256) && (int_3 < 512)) {
						modeldata_0 = FloorUnderlayDefinition.getKitDefinition(int_3 - 256).method752();
						if (modeldata_0 != null) {
							modeldatas_0[int_1++] = modeldata_0;
						}
					}

					if (int_3 >= 512) {
						modeldata_0 = Class45.getItemDefinition(int_3 - 512).method870(isFemale);
						if (modeldata_0 != null) {
							modeldatas_0[int_1++] = modeldata_0;
						}
					}
				}

				final ModelData modeldata_1 = new ModelData(modeldatas_0, int_1);

				for (int_3 = 0; int_3 < 5; int_3++) {
					if (bodyPartColours[int_3] < Class76.colorsToReplace[int_3].length) {
						modeldata_1.recolor(colorsToFind[int_3],
								Class76.colorsToReplace[int_3][bodyPartColours[int_3]]);
					}

					if (bodyPartColours[int_3] < Enum2.aShortArrayArray3[int_3].length) {
						modeldata_1.recolor(aShortArray3[int_3],
								Enum2.aShortArrayArray3[int_3][bodyPartColours[int_3]]);
					}
				}

				return modeldata_1;
			}
		}
	}

	public int method483() {
		return transformedNpcId == -1
				? equipmentIds[1] + (bodyPartColours[0] << 25) + (bodyPartColours[4] << 20) + (equipmentIds[0] << 15)
						+ (equipmentIds[8] << 10) + (equipmentIds[11] << 5)
				: 305419896 + Class81.getNpcDefinition(transformedNpcId).anInt517;
	}

	public void method484(final int int_0, final boolean bool_0) {
		if ((int_0 != 1) || !isFemale) {
			int int_1 = equipmentIds[anIntArray48[int_0]];
			if (int_1 != 0) {
				int_1 -= 256;

				KitDefinition kitdefinition_0;
				do {
					if (!bool_0) {
						--int_1;
						if (int_1 < 0) {
							int_1 = KitDefinition.anInt465 - 1;
						}
					} else {
						++int_1;
						if (int_1 >= KitDefinition.anInt465) {
							int_1 = 0;
						}
					}

					kitdefinition_0 = FloorUnderlayDefinition.getKitDefinition(int_1);
				} while ((kitdefinition_0 == null) || kitdefinition_0.nonSelectable
						|| (kitdefinition_0.bodyPartId != ((isFemale ? 7 : 0) + int_0)));

				equipmentIds[anIntArray48[int_0]] = int_1 + 256;
				setHash();
			}
		}
	}

	public void method485(final int int_0, final boolean bool_0) {
		int int_1 = bodyPartColours[int_0];
		boolean bool_1;
		if (!bool_0) {
			do {
				--int_1;
				if (int_1 < 0) {
					int_1 = Class76.colorsToReplace[int_0].length - 1;
				}

				if ((int_0 == 4) && (int_1 >= 8)) {
					bool_1 = false;
				} else {
					bool_1 = true;
				}
			} while (!bool_1);
		} else {
			do {
				++int_1;
				if (int_1 >= Class76.colorsToReplace[int_0].length) {
					int_1 = 0;
				}

				if ((int_0 == 4) && (int_1 >= 8)) {
					bool_1 = false;
				} else {
					bool_1 = true;
				}
			} while (!bool_1);
		}

		bodyPartColours[int_0] = int_1;
		setHash();
	}

	public void method486(final boolean bool_0) {
		if (isFemale != bool_0) {
			method480((int[]) null, bodyPartColours, bool_0, -1);
		}
	}

	public void method487(final Buffer buffer_0) {
		buffer_0.putByte(isFemale ? 1 : 0);

		int int_0;
		for (int_0 = 0; int_0 < 7; int_0++) {
			final int int_1 = equipmentIds[anIntArray48[int_0]];
			if (int_1 == 0) {
				buffer_0.putByte(-1);
			} else {
				buffer_0.putByte(int_1 - 256);
			}
		}

		for (int_0 = 0; int_0 < 5; int_0++) {
			buffer_0.putByte(bodyPartColours[int_0]);
		}

	}

	public static ObjectComposition getObjectDefinition(final int int_0) {
		ObjectComposition objectcomposition_0 = (ObjectComposition) ObjectComposition.objects.get(int_0);
		if (objectcomposition_0 != null) {
			return objectcomposition_0;
		} else {
			final byte[] bytes_0 = ObjectComposition.objects_ref.getConfigData(6, int_0);
			objectcomposition_0 = new ObjectComposition();
			objectcomposition_0.anInt493 = int_0;
			if (bytes_0 != null) {
				objectcomposition_0.decode(new Buffer(bytes_0));
			}

			objectcomposition_0.post();
			if (objectcomposition_0.isSolid) {
				objectcomposition_0.interactType = 0;
				objectcomposition_0.aBool53 = false;
			}

			ObjectComposition.objects.put(objectcomposition_0, int_0);
			return objectcomposition_0;
		}
	}

	public static boolean method488() {
		final long long_0 = Class6.currentTimeMs();
		int int_0 = (int) (long_0 - Class93.aLong12);
		Class93.aLong12 = long_0;
		if (int_0 > 200) {
			int_0 = 200;
		}

		Class93.anInt204 += int_0;
		if ((Class93.anInt208 == 0) && (Class93.anInt207 == 0) && (Class93.anInt209 == 0) && (Class93.anInt206 == 0)) {
			return true;
		} else if (Class93.aRSSocket1 == null) {
			return false;
		} else {
			try {
				if (Class93.anInt204 > 30000) {
					throw new IOException();
				} else {
					FileRequest filerequest_0;
					Buffer buffer_0;
					while ((Class93.anInt207 < 20) && (Class93.anInt206 > 0)) {
						filerequest_0 = (FileRequest) Class93.aXHashTable4.method515();
						buffer_0 = new Buffer(4);
						buffer_0.putByte(1);
						buffer_0.put24bitInt((int) filerequest_0.hash);

						Class93.aRSSocket1.queueForWrite(buffer_0.payload, 0, 4);
						Class93.aXHashTable5.put(filerequest_0, filerequest_0.hash);
						--Class93.anInt206;
						++Class93.anInt207;
					}

					while ((Class93.anInt208 < 20) && (Class93.anInt209 > 0)) {
						filerequest_0 = (FileRequest) Class93.aNode2LinkedList1.peek();
						buffer_0 = new Buffer(4);
						buffer_0.putByte(0);
						buffer_0.put24bitInt((int) filerequest_0.hash);
						Class93.aRSSocket1.queueForWrite(buffer_0.payload, 0, 4);
						filerequest_0.unlinkDual();
						Class93.aXHashTable6.put(filerequest_0, filerequest_0.hash);
						--Class93.anInt209;
						++Class93.anInt208;
					}

					for (int int_1 = 0; int_1 < 100; int_1++) {
						final int int_2 = Class93.aRSSocket1.available();

						if (int_2 < 0) {
							throw new IOException();
						}

						if (int_2 == 0) {
							break;
						}

						Class93.anInt204 = 0;
						byte byte_0 = 0;
						if (Class94.currentRequest == null) {
							byte_0 = 8;
						} else if (Class93.anInt210 == 0) {
							byte_0 = 1;
						}

						int int_3;
						int int_4;
						int int_5;
						int int_6;
						if (byte_0 > 0) {
							int_3 = byte_0 - Class93.aBuffer4.offset;
							if (int_3 > int_2) {
								int_3 = int_2;
							}

							Class93.aRSSocket1.read(Class93.aBuffer4.payload, Class93.aBuffer4.offset, int_3);
							if (Class93.aByte1 != 0) {
								for (int_4 = 0; int_4 < int_3; int_4++) {
									Class93.aBuffer4.payload[int_4 + Class93.aBuffer4.offset] ^= Class93.aByte1;
								}
							}

							Class93.aBuffer4.offset += int_3;
							if (Class93.aBuffer4.offset < byte_0) {
								break;
							}

							if (Class94.currentRequest == null) {
								Class93.aBuffer4.offset = 0;
								int_4 = Class93.aBuffer4.readUnsignedByte();
								int_5 = Class93.aBuffer4.readUnsignedShort();
								final int int_8 = Class93.aBuffer4.readUnsignedByte();
								int_6 = Class93.aBuffer4.readInt();
								final long long_1 = int_5 + (int_4 << 16);
								FileRequest filerequest_1 = (FileRequest) Class93.aXHashTable5.get(long_1);
								Class102.aBool22 = true;
								if (filerequest_1 == null) {
									filerequest_1 = (FileRequest) Class93.aXHashTable6.get(long_1);
									Class102.aBool22 = false;
								}

								if (filerequest_1 == null) {
									throw new IOException();
								}

								final int int_9 = int_8 == 0 ? 5 : 9;

								Class94.currentRequest = filerequest_1;
								Class38.aBuffer1 = new Buffer(int_6 + int_9 + Class94.currentRequest.padding);
								Class38.aBuffer1.putByte(int_8);
								Class38.aBuffer1.putInt(int_6);
								Class93.anInt210 = 8;
								Class93.aBuffer4.offset = 0;
							} else if (Class93.anInt210 == 0) {
								if (Class93.aBuffer4.payload[0] == -1) {
									Class93.anInt210 = 1;
									Class93.aBuffer4.offset = 0;
								} else {
									Class94.currentRequest = null;
								}
							}
						} else {
							int_3 = Class38.aBuffer1.payload.length - Class94.currentRequest.padding;
							int_4 = 512 - Class93.anInt210;
							if (int_4 > (int_3 - Class38.aBuffer1.offset)) {
								int_4 = int_3 - Class38.aBuffer1.offset;
							}

							if (int_4 > int_2) {
								int_4 = int_2;
							}

							Class93.aRSSocket1.read(Class38.aBuffer1.payload, Class38.aBuffer1.offset, int_4);
							if (Class93.aByte1 != 0) {
								for (int_5 = 0; int_5 < int_4; int_5++) {
									Class38.aBuffer1.payload[int_5 + Class38.aBuffer1.offset] ^= Class93.aByte1;
								}
							}

							Class38.aBuffer1.offset += int_4;
							Class93.anInt210 += int_4;
							if (int_3 == Class38.aBuffer1.offset) {
								if (Class94.currentRequest.hash == 16711935L) {
									WorldMapData_Sub1.aBuffer5 = Class38.aBuffer1;

									for (int_5 = 0; int_5 < 256; int_5++) {
										final IndexData indexdata_0 = Class93.anIndexDataArray1[int_5];
										if (indexdata_0 != null) {
											WorldMapData_Sub1.aBuffer5.offset = (int_5 * 8) + 5;
											int_6 = WorldMapData_Sub1.aBuffer5.readInt();
											final int int_7 = WorldMapData_Sub1.aBuffer5.readInt();
											indexdata_0.setInformation(int_6, int_7);
										}
									}
								} else {
									Class93.aCRC32_1.reset();
									Class93.aCRC32_1.update(Class38.aBuffer1.payload, 0, int_3);
									int_5 = (int) Class93.aCRC32_1.getValue();
									if (int_5 != Class94.currentRequest.crc) {
										try {
											Class93.aRSSocket1.close();
										} catch (final Exception exception_1) {
											;
										}

										++Class93.anInt203;
										Class93.aRSSocket1 = null;
										Class93.aByte1 = (byte) ((int) ((Math.random() * 255.0D) + 1.0D));
										return false;
									}

									Class93.anInt203 = 0;
									Class93.anInt205 = 0;
									Class94.currentRequest.index.method596(
											(int) (Class94.currentRequest.hash & 0xFFFFL), Class38.aBuffer1.payload,
											(Class94.currentRequest.hash & 0xFF0000L) == 16711680L, Class102.aBool22);
								}

								Class94.currentRequest.unlink();
								if (Class102.aBool22) {
									--Class93.anInt207;
								} else {
									--Class93.anInt208;
								}

								Class93.anInt210 = 0;
								Class94.currentRequest = null;
								Class38.aBuffer1 = null;
							} else {
								if (Class93.anInt210 != 512) {
									break;
								}

								Class93.anInt210 = 0;
							}
						}
					}

					return true;
				}
			} catch (final IOException ioexception_0) {
				try {
					Class93.aRSSocket1.close();
				} catch (final Exception exception_0) {
					;
				}

				++Class93.anInt205;
				Class93.aRSSocket1 = null;
				return false;
			}
		}
	}

}
