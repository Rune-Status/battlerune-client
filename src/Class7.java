public class Class7 {

	static int anInt26;
	static int anInt27;

	public static final void addMenuEntry(final String string_0, final String string_1, final int int_0,
			final int int_1, final int int_2, final int int_3) {
		IndexFile.method73(string_0, string_1, int_0, int_1, int_2, int_3, false);
	}

	static int method115(final PacketBuffer packetbuffer_0) {
		final int int_0 = packetbuffer_0.getBits(2);
		int int_1;
		if (int_0 == 0) {
			int_1 = 0;
		} else if (int_0 == 1) {
			int_1 = packetbuffer_0.getBits(5);
		} else if (int_0 == 2) {
			int_1 = packetbuffer_0.getBits(8);
		} else {
			int_1 = packetbuffer_0.getBits(11);
		}

		return int_1;
	}

	static final void method116(final Widget widget_0, final int int_0, final int int_1) {
		if (widget_0.anInt292 == 1) {
			addMenuEntry(widget_0.tooltip, "", 24, 0, 0, widget_0.anInt289);
		}

		String string_0;
		if ((widget_0.anInt292 == 2) && !Client.spellSelected) {
			string_0 = MouseInput.method555(widget_0);
			if (string_0 != null) {
				addMenuEntry(string_0, Class6.getColTags(65280) + widget_0.aString16, 25, 0, -1, widget_0.anInt289);
			}
		}

		if (widget_0.anInt292 == 3) {
			addMenuEntry("Close", "", 26, 0, 0, widget_0.anInt289);
		}

		if (widget_0.anInt292 == 4) {
			addMenuEntry(widget_0.tooltip, "", 28, 0, 0, widget_0.anInt289);
		}

		if (widget_0.anInt292 == 5) {
			addMenuEntry(widget_0.tooltip, "", 29, 0, 0, widget_0.anInt289);
		}

		if ((widget_0.anInt292 == 6) && (Client.aWidget12 == null)) {
			addMenuEntry(widget_0.tooltip, "", 30, 0, -1, widget_0.anInt289);
		}

		int int_2;
		int int_3;
		if (widget_0.type == 2) {
			int_2 = 0;

			for (int_3 = 0; int_3 < widget_0.height; int_3++) {
				for (int int_4 = 0; int_4 < widget_0.width; int_4++) {
					int int_5 = (widget_0.paddingX + 32) * int_4;
					int int_6 = (32 + widget_0.paddingY) * int_3;
					if (int_2 < 20) {
						int_5 += widget_0.xSprites[int_2];
						int_6 += widget_0.anIntArray70[int_2];
					}

					if ((int_0 >= int_5) && (int_1 >= int_6) && (int_0 < (int_5 + 32)) && (int_1 < (int_6 + 32))) {
						Client.anInt749 = int_2;
						Class23.aWidget4 = widget_0;
						if (widget_0.itemIds[int_2] > 0) {
							label288: {
								final ItemComposition itemcomposition_0 = Class45
										.getItemDefinition(widget_0.itemIds[int_2] - 1);
								int int_7;
								boolean bool_0;
								if (Client.itemSelectionState == 1) {
									int_7 = Class6.getWidgetConfig(widget_0);
									bool_0 = ((int_7 >> 30) & 0x1) != 0;
									if (bool_0) {
										if ((widget_0.anInt289 != Class44.anInt101)
												|| (int_2 != Class49.selectedItemIndex)) {
											addMenuEntry("Use",
													Client.selectedItemName + " " + "->" + " "
															+ Class6.getColTags(16748608) + itemcomposition_0.name,
													31, itemcomposition_0.anInt533, int_2, widget_0.anInt289);
										}
										break label288;
									}
								}

								if (Client.spellSelected) {
									int_7 = Class6.getWidgetConfig(widget_0);
									bool_0 = ((int_7 >> 30) & 0x1) != 0;
									if (bool_0) {
										if ((Class53.anInt131 & 0x10) == 16) {
											addMenuEntry(Client.aString33,
													Client.aString34 + " " + "->" + " " + Class6.getColTags(16748608)
															+ itemcomposition_0.name,
													32, itemcomposition_0.anInt533, int_2, widget_0.anInt289);
										}
										break label288;
									}
								}

								String[] strings_0 = itemcomposition_0.inventoryActions;
								if (Client.aBool89) {
									strings_0 = Class11.method168(strings_0);
								}

								int_7 = itemcomposition_0.method875();
								final int int_8 = Class6.getWidgetConfig(widget_0);
								final boolean bool_1 = ((int_8 >> 30) & 0x1) != 0;
								if (bool_1) {
									for (int int_9 = 4; int_9 >= 3; --int_9) {
										final boolean bool_2 = int_9 == int_7;
										if ((strings_0 != null) && (strings_0[int_9] != null)) {
											byte byte_0;
											if (int_9 == 3) {
												byte_0 = 36;
											} else {
												byte_0 = 37;
											}

											IndexFile.method73(strings_0[int_9],
													Class6.getColTags(16748608) + itemcomposition_0.name, byte_0,
													itemcomposition_0.anInt533, int_2, widget_0.anInt289, bool_2);
										} else if (int_9 == 4) {
											IndexFile.method73("Drop",
													Class6.getColTags(16748608) + itemcomposition_0.name, 37,
													itemcomposition_0.anInt533, int_2, widget_0.anInt289, bool_2);
										}
									}
								}

								if (AbstractSoundSystem.method343(Class6.getWidgetConfig(widget_0))) {
									addMenuEntry("Use", Class6.getColTags(16748608) + itemcomposition_0.name, 38,
											itemcomposition_0.anInt533, int_2, widget_0.anInt289);
								}

								final int int_10 = Class6.getWidgetConfig(widget_0);
								final boolean bool_4 = ((int_10 >> 30) & 0x1) != 0;
								int int_11;
								if (bool_4 && (strings_0 != null)) {
									for (int_11 = 2; int_11 >= 0; --int_11) {
										final boolean bool_3 = int_11 == int_7;
										if (strings_0[int_11] != null) {
											byte byte_1 = 0;
											if (int_11 == 0) {
												byte_1 = 33;
											}

											if (int_11 == 1) {
												byte_1 = 34;
											}

											if (int_11 == 2) {
												byte_1 = 35;
											}

											IndexFile.method73(strings_0[int_11],
													Class6.getColTags(16748608) + itemcomposition_0.name, byte_1,
													itemcomposition_0.anInt533, int_2, widget_0.anInt289, bool_3);
										}
									}
								}

								strings_0 = widget_0.configActions;
								if (Client.aBool89) {
									strings_0 = Class11.method168(strings_0);
								}

								if (strings_0 != null) {
									for (int_11 = 4; int_11 >= 0; --int_11) {
										if (strings_0[int_11] != null) {
											byte byte_2 = 0;
											if (int_11 == 0) {
												byte_2 = 39;
											}

											if (int_11 == 1) {
												byte_2 = 40;
											}

											if (int_11 == 2) {
												byte_2 = 41;
											}

											if (int_11 == 3) {
												byte_2 = 42;
											}

											if (int_11 == 4) {
												byte_2 = 43;
											}

											addMenuEntry(strings_0[int_11],
													Class6.getColTags(16748608) + itemcomposition_0.name, byte_2,
													itemcomposition_0.anInt533, int_2, widget_0.anInt289);
										}
									}
								}

								addMenuEntry("Examine", Class6.getColTags(16748608) + itemcomposition_0.name, 1005,
										itemcomposition_0.anInt533, int_2, widget_0.anInt289);
							}
						}
					}

					++int_2;
				}
			}
		}

		if (widget_0.hasScript) {
			if (Client.spellSelected) {
				if (Class89.method471(Class6.getWidgetConfig(widget_0)) && ((Class53.anInt131 & 0x20) == 32)) {
					addMenuEntry(Client.aString33, Client.aString34 + " " + "->" + " " + widget_0.name, 58, 0,
							widget_0.index, widget_0.anInt289);
					return;
				}
			} else {
				for (int_2 = 9; int_2 >= 5; --int_2) {
					final String string_1 = Class22.method212(widget_0, int_2);
					if (string_1 != null) {
						addMenuEntry(string_1, widget_0.name, 1007, int_2 + 1, widget_0.index, widget_0.anInt289);
					}
				}

				string_0 = MouseInput.method555(widget_0);
				if (string_0 != null) {
					addMenuEntry(string_0, widget_0.name, 25, 0, widget_0.index, widget_0.anInt289);
				}

				for (int_3 = 4; int_3 >= 0; --int_3) {
					final String string_2 = Class22.method212(widget_0, int_3);
					if (string_2 != null) {
						addMenuEntry(string_2, widget_0.name, 57, int_3 + 1, widget_0.index, widget_0.anInt289);
					}
				}

				if (Class33.method240(Class6.getWidgetConfig(widget_0))) {
					addMenuEntry("Continue", "", 30, 0, widget_0.index, widget_0.anInt289);
					return;
				}
			}
		}

	}

	static int method117(char char_0) {
		int int_0 = char_0 << 4;
		if (Character.isUpperCase(char_0) || Character.isTitleCase(char_0)) {
			char_0 = Character.toLowerCase(char_0);
			int_0 = (char_0 << 4) + 1;
		}

		return int_0;
	}

}
