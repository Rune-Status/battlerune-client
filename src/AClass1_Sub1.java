public class AClass1_Sub1 extends AClass1 {

	static int plane;
	static int anInt324;
	int anInt325;
	int anInt326;
	int anInt327;
	int anInt328;

	int method579() {
		return anInt327;
	}

	boolean method580(final int int_0, final int int_1) {
		return int_0 < (anInt327 * 8) ? false
				: (int_1 < (anInt328 * 8) ? false
						: (int_0 >= ((anInt327 * 8) + 8) ? false : int_1 < ((anInt328 * 8) + 8)));
	}

	int method581() {
		return anInt328;
	}

	void method582(final Buffer buffer_0, final Buffer buffer_1) {
		int int_0 = buffer_1.readUnsignedByte();
		if (int_0 != Class5.aClass5_1.anInt24) {
			throw new IllegalStateException("");
		} else {
			anInt51 = buffer_1.readUnsignedByte();
			anInt50 = buffer_1.readUnsignedByte();
			anInt52 = buffer_1.readUnsignedShort();
			anInt53 = buffer_1.readUnsignedShort();
			anInt326 = buffer_1.readUnsignedByte();
			anInt325 = buffer_1.readUnsignedByte();
			anInt49 = buffer_1.readUnsignedShort();
			anInt48 = buffer_1.readUnsignedShort();
			anInt327 = buffer_1.readUnsignedByte();
			anInt328 = buffer_1.readUnsignedByte();
			anInt50 = Math.min(anInt50, 4);
			aShortArrayArrayArray1 = new short[1][64][64];
			aShortArrayArrayArray2 = new short[anInt50][64][64];
			aByteArrayArrayArray2 = new byte[anInt50][64][64];
			aByteArrayArrayArray3 = new byte[anInt50][64][64];
			aClass12ArrayArrayArrayArray1 = new Class12[anInt50][64][64][];
			int_0 = buffer_0.readUnsignedByte();
			if (int_0 != Class1.aClass1_2.anInt14) {
				throw new IllegalStateException("");
			} else {
				final int int_1 = buffer_0.readUnsignedByte();
				final int int_2 = buffer_0.readUnsignedByte();
				final int int_3 = buffer_0.readUnsignedByte();
				final int int_4 = buffer_0.readUnsignedByte();
				if ((int_1 == anInt49) && (int_2 == anInt48) && (int_3 == anInt327) && (int_4 == anInt328)) {
					for (int int_5 = 0; int_5 < 8; int_5++) {
						for (int int_6 = 0; int_6 < 8; int_6++) {
							method188((anInt327 * 8) + int_5, (anInt328 * 8) + int_6, buffer_0);
						}
					}

				} else {
					throw new IllegalStateException("");
				}
			}
		}
	}

	int method583() {
		return anInt326;
	}

	int method584() {
		return anInt325;
	}

	@Override
	public boolean equals(final Object object_0) {
		if (!(object_0 instanceof AClass1_Sub1)) {
			return false;
		} else {
			final AClass1_Sub1 aclass1_sub1_1 = (AClass1_Sub1) object_0;
			return (anInt49 == aclass1_sub1_1.anInt49) && (anInt48 == aclass1_sub1_1.anInt48)
					? (anInt327 == aclass1_sub1_1.anInt327) && (aclass1_sub1_1.anInt328 == anInt328) : false;
		}
	}

	@Override
	public int hashCode() {
		return anInt49 | (anInt48 << 8) | (anInt327 << 16) | (anInt328 << 24);
	}

	static final void method585(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5, final int int_6) {
		if (Class14.loadWidget(int_0)) {
			method586(Widget.widgets[int_0], -1, int_1, int_2, int_3, int_4, int_5, int_6);
		}
	}

	static final void method586(final Widget[] widgets_0, final int int_0, final int int_1, final int int_2,
			final int int_3, final int int_4, final int int_5, final int int_6) {
		for (int int_7 = 0; int_7 < widgets_0.length; int_7++) {
			final Widget widget_0 = widgets_0[int_7];
			if ((widget_0 != null)
					&& (!widget_0.hasScript || (widget_0.type == 0) || widget_0.aBool27
							|| (Class6.getWidgetConfig(widget_0) != 0) || (widget_0 == Client.aWidget10)
							|| (widget_0.contentType == 1338))
					&& (widget_0.parentId == int_0) && (!widget_0.hasScript || !Class37.method250(widget_0))) {
				final int int_8 = widget_0.relativeX + int_5;
				final int int_9 = int_6 + widget_0.relativeY;
				int int_10;
				int int_11;
				int int_12;
				int int_13;
				int int_14;
				int int_15;
				int int_17;
				if (widget_0.type == 2) {
					int_10 = int_1;
					int_11 = int_2;
					int_12 = int_3;
					int_13 = int_4;
				} else if (widget_0.type == 9) {
					int_14 = int_8;
					int_15 = int_9;
					int int_16 = int_8 + widget_0.width;
					int_17 = int_9 + widget_0.height;
					if (int_16 < int_8) {
						int_14 = int_16;
						int_16 = int_8;
					}

					if (int_17 < int_9) {
						int_15 = int_17;
						int_17 = int_9;
					}

					++int_16;
					++int_17;
					int_10 = int_14 > int_1 ? int_14 : int_1;
					int_11 = int_15 > int_2 ? int_15 : int_2;
					int_12 = int_16 < int_3 ? int_16 : int_3;
					int_13 = int_17 < int_4 ? int_17 : int_4;
				} else {
					int_14 = int_8 + widget_0.width;
					int_15 = int_9 + widget_0.height;
					int_10 = int_8 > int_1 ? int_8 : int_1;
					int_11 = int_9 > int_2 ? int_9 : int_2;
					int_12 = int_14 < int_3 ? int_14 : int_3;
					int_13 = int_15 < int_4 ? int_15 : int_4;
				}

				if (widget_0 == Client.aWidget9) {
					Client.aBool76 = true;
					Client.anInt682 = int_8;
					Client.anInt683 = int_9;
				}

				if (!widget_0.hasScript || ((int_10 < int_12) && (int_11 < int_13))) {
					int_14 = MouseInput.anInt278;
					int_15 = MouseInput.anInt280;
					if (MouseInput.anInt277 != 0) {
						int_14 = MouseInput.anInt282;
						int_15 = MouseInput.anInt283;
					}

					boolean bool_1 = (int_14 >= int_10) && (int_15 >= int_11) && (int_14 < int_12) && (int_15 < int_13);
					if (widget_0.contentType == 1337) {
						if (!Client.aBool81 && !Client.isMenuOpen && bool_1) {
							KeyFocusListener.method315(int_14, int_15, int_10, int_11);
						}
					} else {
						int int_18;
						int int_19;
						int int_20;
						int int_21;
						int int_22;
						int int_23;
						int int_26;
						if (widget_0.contentType == 1338) {
							if (((Client.anInt701 == 0) || (Client.anInt701 == 3)) && ((MouseInput.anInt277 == 1)
									|| (!Class14.aBool5 && (MouseInput.anInt277 == 4)))) {
								final CacheableNode_Sub1 cacheablenode_sub1_0 = widget_0.method562(true);
								if (cacheablenode_sub1_0 != null) {
									int_26 = MouseInput.anInt282 - int_8;
									int_18 = MouseInput.anInt283 - int_9;
									if (cacheablenode_sub1_0.method804(int_26, int_18)) {
										int_26 -= cacheablenode_sub1_0.anInt498 / 2;
										int_18 -= cacheablenode_sub1_0.anInt499 / 2;
										int_19 = (Client.mapScale + Client.mapAngle) & 0x7FF;
										int_20 = Graphics3D.SINE[int_19];
										int_21 = Graphics3D.COSINE[int_19];
										int_20 = ((Client.mapScaleDelta + 256) * int_20) >> 8;
										int_21 = (int_21 * (Client.mapScaleDelta + 256)) >> 8;
										int_22 = ((int_26 * int_21) + (int_20 * int_18)) >> 11;
										int_23 = ((int_21 * int_18) - (int_20 * int_26)) >> 11;
										final int int_24 = (int_22 + Script.localPlayer.anInt547) >> 7;
										final int int_25 = (Script.localPlayer.anInt550 - int_23) >> 7;
										Client.secretPacketBuffer1.putOpcode(79);
										Client.secretPacketBuffer1.putByte(18);
										Client.secretPacketBuffer1.putShortLE(KeyFocusListener.aBoolArray3[82]
												? (KeyFocusListener.aBoolArray3[81] ? 2 : 1) : 0);
										Client.secretPacketBuffer1.putLEShortA(int_24 + AClass2.baseX);
										Client.secretPacketBuffer1.putShortOb2(int_25 + AClass4_Sub1.baseY);
										Client.secretPacketBuffer1.putByte(int_26);
										Client.secretPacketBuffer1.putByte(int_18);
										Client.secretPacketBuffer1.putShort(Client.mapAngle);
										Client.secretPacketBuffer1.putByte(57);
										Client.secretPacketBuffer1.putByte(Client.mapScale);
										Client.secretPacketBuffer1.putByte(Client.mapScaleDelta);
										Client.secretPacketBuffer1.putByte(89);
										Client.secretPacketBuffer1.putShort(Script.localPlayer.anInt547);
										Client.secretPacketBuffer1.putShort(Script.localPlayer.anInt550);
										Client.secretPacketBuffer1.putByte(63);
										Client.destinationX = int_24;
										Client.destinationY = int_25;
									}
								}
							}
						} else {
							if (widget_0.contentType == 1400) {
								Class49.renderOverview.method36(MouseInput.anInt278, MouseInput.anInt280, bool_1, int_8,
										int_9, widget_0.width, widget_0.height);
							}

							if (!Client.isMenuOpen && bool_1) {
								if (widget_0.contentType == 1400) {
									Class49.renderOverview.method37(int_8, int_9, widget_0.width, widget_0.height,
											int_14, int_15);
								} else {
									Class7.method116(widget_0, int_14 - int_8, int_15 - int_9);
								}
							}

							if (widget_0.type == 0) {
								if (!widget_0.hasScript && Class37.method250(widget_0)
										&& (widget_0 != XGrandExchangeOffer.aWidget3)) {
									continue;
								}

								method586(widgets_0, widget_0.anInt289, int_10, int_11, int_12, int_13,
										int_8 - widget_0.scrollX, int_9 - widget_0.scrollY);
								if (widget_0.children != null) {
									method586(widget_0.children, widget_0.anInt289, int_10, int_11, int_12, int_13,
											int_8 - widget_0.scrollX, int_9 - widget_0.scrollY);
								}

								final WidgetNode widgetnode_0 = (WidgetNode) Client.componentTable
										.get(widget_0.anInt289);
								if (widgetnode_0 != null) {
									if ((widgetnode_0.owner == 0) && (MouseInput.anInt278 >= int_10)
											&& (MouseInput.anInt280 >= int_11) && (MouseInput.anInt278 < int_12)
											&& (MouseInput.anInt280 < int_13) && !Client.isMenuOpen
											&& !Client.aBool79) {
										for (ScriptEvent scriptevent_3 = (ScriptEvent) Client.aDeque7
												.getFront(); scriptevent_3 != null; scriptevent_3 = (ScriptEvent) Client.aDeque7
														.getNext()) {
											if (scriptevent_3.aBool48) {
												scriptevent_3.unlink();
												scriptevent_3.widget.aBool34 = false;
											}
										}

										if (Class14.anInt54 == 0) {
											Client.aWidget9 = null;
											Client.aWidget10 = null;
										}

										if (!Client.isMenuOpen) {
											Client.menuOptionCount = 0;
											Client.anInt654 = -1;
											Client.isMenuOpen = false;
											Client.menuOptions[0] = "Cancel";
											Client.menuTargets[0] = "";
											Client.menuTypes[0] = 1006;
											Client.menuOptionCount = 1;
										}
									}

									method585(widgetnode_0.anInt392, int_10, int_11, int_12, int_13, int_8, int_9);
								}
							}

							if (widget_0.hasScript) {
								ScriptEvent scriptevent_4;
								if (!widget_0.aBool30) {
									if (widget_0.aBool36 && (MouseInput.anInt278 >= int_10)
											&& (MouseInput.anInt280 >= int_11) && (MouseInput.anInt278 < int_12)
											&& (MouseInput.anInt280 < int_13)) {
										for (scriptevent_4 = (ScriptEvent) Client.aDeque7
												.getFront(); scriptevent_4 != null; scriptevent_4 = (ScriptEvent) Client.aDeque7
														.getNext()) {
											if (scriptevent_4.aBool48
													&& (scriptevent_4.widget.scrollListener == scriptevent_4.anObjectArray22)) {
												scriptevent_4.unlink();
											}
										}
									}
								} else if ((MouseInput.anInt278 >= int_10) && (MouseInput.anInt280 >= int_11)
										&& (MouseInput.anInt278 < int_12) && (MouseInput.anInt280 < int_13)) {
									for (scriptevent_4 = (ScriptEvent) Client.aDeque7
											.getFront(); scriptevent_4 != null; scriptevent_4 = (ScriptEvent) Client.aDeque7
													.getNext()) {
										if (scriptevent_4.aBool48) {
											scriptevent_4.unlink();
											scriptevent_4.widget.aBool34 = false;
										}
									}

									if (Class14.anInt54 == 0) {
										Client.aWidget9 = null;
										Client.aWidget10 = null;
									}

									if (!Client.isMenuOpen) {
										Client.menuOptions[0] = "Cancel";
										Client.menuTargets[0] = "";
										Client.menuTypes[0] = 1006;
										Client.menuOptionCount = 1;
									}
								}

								if ((MouseInput.anInt278 >= int_10) && (MouseInput.anInt280 >= int_11)
										&& (MouseInput.anInt278 < int_12) && (MouseInput.anInt280 < int_13)) {
									bool_1 = true;
								} else {
									bool_1 = false;
								}

								boolean bool_2 = false;
								if (((MouseInput.anInt281 == 1) || (!Class14.aBool5 && (MouseInput.anInt281 == 4)))
										&& bool_1) {
									bool_2 = true;
								}

								boolean bool_0 = false;
								if (((MouseInput.anInt277 == 1) || (!Class14.aBool5 && (MouseInput.anInt277 == 4)))
										&& (MouseInput.anInt282 >= int_10) && (MouseInput.anInt283 >= int_11)
										&& (MouseInput.anInt282 < int_12) && (MouseInput.anInt283 < int_13)) {
									bool_0 = true;
								}

								if (bool_0) {
									Enum2.method605(widget_0, MouseInput.anInt282 - int_8, MouseInput.anInt283 - int_9);
								}

								if (widget_0.contentType == 1400) {
									Class49.renderOverview.method44(MouseInput.anInt278, MouseInput.anInt280,
											bool_1 & bool_2);
								}

								if ((Client.aWidget9 != null) && (widget_0 != Client.aWidget9) && bool_1
										&& Class24.method217(Class6.getWidgetConfig(widget_0))) {
									Client.aWidget13 = widget_0;
								}

								if (widget_0 == Client.aWidget10) {
									Client.aBool78 = true;
									Client.anInt658 = int_8;
									Client.anInt665 = int_9;
								}

								if (widget_0.aBool27) {
									ScriptEvent scriptevent_0;
									if (bool_1 && (Client.anInt679 != 0) && (widget_0.scrollListener != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.aBool48 = true;
										scriptevent_0.widget = widget_0;
										scriptevent_0.anInt416 = Client.anInt679;
										scriptevent_0.anObjectArray22 = widget_0.scrollListener;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if ((Client.aWidget9 != null) || (Ignore.aWidget7 != null) || Client.isMenuOpen) {
										bool_0 = false;
										bool_2 = false;
										bool_1 = false;
									}

									if (!widget_0.aBool35 && bool_0) {
										widget_0.aBool35 = true;
										if (widget_0.anObjectArray9 != null) {
											scriptevent_0 = new ScriptEvent();
											scriptevent_0.aBool48 = true;
											scriptevent_0.widget = widget_0;
											scriptevent_0.anInt415 = MouseInput.anInt282 - int_8;
											scriptevent_0.anInt416 = MouseInput.anInt283 - int_9;
											scriptevent_0.anObjectArray22 = widget_0.anObjectArray9;
											Client.aDeque7.addFront(scriptevent_0);
										}
									}

									if (widget_0.aBool35 && bool_2 && (widget_0.anObjectArray10 != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.aBool48 = true;
										scriptevent_0.widget = widget_0;
										scriptevent_0.anInt415 = MouseInput.anInt278 - int_8;
										scriptevent_0.anInt416 = MouseInput.anInt280 - int_9;
										scriptevent_0.anObjectArray22 = widget_0.anObjectArray10;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if (widget_0.aBool35 && !bool_2) {
										widget_0.aBool35 = false;
										if (widget_0.anObjectArray11 != null) {
											scriptevent_0 = new ScriptEvent();
											scriptevent_0.aBool48 = true;
											scriptevent_0.widget = widget_0;
											scriptevent_0.anInt415 = MouseInput.anInt278 - int_8;
											scriptevent_0.anInt416 = MouseInput.anInt280 - int_9;
											scriptevent_0.anObjectArray22 = widget_0.anObjectArray11;
											Client.aDeque9.addFront(scriptevent_0);
										}
									}

									if (bool_2 && (widget_0.anObjectArray12 != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.aBool48 = true;
										scriptevent_0.widget = widget_0;
										scriptevent_0.anInt415 = MouseInput.anInt278 - int_8;
										scriptevent_0.anInt416 = MouseInput.anInt280 - int_9;
										scriptevent_0.anObjectArray22 = widget_0.anObjectArray12;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if (!widget_0.aBool34 && bool_1) {
										widget_0.aBool34 = true;
										if (widget_0.mouseEnterListener != null) {
											scriptevent_0 = new ScriptEvent();
											scriptevent_0.aBool48 = true;
											scriptevent_0.widget = widget_0;
											scriptevent_0.anInt415 = MouseInput.anInt278 - int_8;
											scriptevent_0.anInt416 = MouseInput.anInt280 - int_9;
											scriptevent_0.anObjectArray22 = widget_0.mouseEnterListener;
											Client.aDeque7.addFront(scriptevent_0);
										}
									}

									if (widget_0.aBool34 && bool_1 && (widget_0.mouseHoverListener != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.aBool48 = true;
										scriptevent_0.widget = widget_0;
										scriptevent_0.anInt415 = MouseInput.anInt278 - int_8;
										scriptevent_0.anInt416 = MouseInput.anInt280 - int_9;
										scriptevent_0.anObjectArray22 = widget_0.mouseHoverListener;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if (widget_0.aBool34 && !bool_1) {
										widget_0.aBool34 = false;
										if (widget_0.mouseExitListener != null) {
											scriptevent_0 = new ScriptEvent();
											scriptevent_0.aBool48 = true;
											scriptevent_0.widget = widget_0;
											scriptevent_0.anInt415 = MouseInput.anInt278 - int_8;
											scriptevent_0.anInt416 = MouseInput.anInt280 - int_9;
											scriptevent_0.anObjectArray22 = widget_0.mouseExitListener;
											Client.aDeque9.addFront(scriptevent_0);
										}
									}

									if (widget_0.renderListener != null) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.widget = widget_0;
										scriptevent_0.anObjectArray22 = widget_0.renderListener;
										Client.aDeque8.addFront(scriptevent_0);
									}

									ScriptEvent scriptevent_1;
									if ((widget_0.configListenerArgs != null)
											&& (Client.anInt705 > widget_0.anInt318)) {
										if ((widget_0.configTriggers != null)
												&& ((Client.anInt705 - widget_0.anInt318) <= 32)) {
											label587: for (int_18 = widget_0.anInt318; int_18 < Client.anInt705; int_18++) {
												int_19 = Client.anIntArray152[int_18 & 0x1F];

												for (int_20 = 0; int_20 < widget_0.configTriggers.length; int_20++) {
													if (int_19 == widget_0.configTriggers[int_20]) {
														scriptevent_1 = new ScriptEvent();
														scriptevent_1.widget = widget_0;
														scriptevent_1.anObjectArray22 = widget_0.configListenerArgs;
														Client.aDeque7.addFront(scriptevent_1);
														break label587;
													}
												}
											}
										} else {
											scriptevent_0 = new ScriptEvent();
											scriptevent_0.widget = widget_0;
											scriptevent_0.anObjectArray22 = widget_0.configListenerArgs;
											Client.aDeque7.addFront(scriptevent_0);
										}

										widget_0.anInt318 = Client.anInt705;
									}

									if ((widget_0.tableListenerArgs != null) && (Client.anInt704 > widget_0.anInt319)) {
										if ((widget_0.tableModTriggers != null)
												&& ((Client.anInt704 - widget_0.anInt319) <= 32)) {
											label563: for (int_18 = widget_0.anInt319; int_18 < Client.anInt704; int_18++) {
												int_19 = Client.interfaceItemTriggers[int_18 & 0x1F];

												for (int_20 = 0; int_20 < widget_0.tableModTriggers.length; int_20++) {
													if (int_19 == widget_0.tableModTriggers[int_20]) {
														scriptevent_1 = new ScriptEvent();
														scriptevent_1.widget = widget_0;
														scriptevent_1.anObjectArray22 = widget_0.tableListenerArgs;
														Client.aDeque7.addFront(scriptevent_1);
														break label563;
													}
												}
											}
										} else {
											scriptevent_0 = new ScriptEvent();
											scriptevent_0.widget = widget_0;
											scriptevent_0.anObjectArray22 = widget_0.tableListenerArgs;
											Client.aDeque7.addFront(scriptevent_0);
										}

										widget_0.anInt319 = Client.anInt704;
									}

									if ((widget_0.skillListenerArgs != null) && (Client.anInt702 > widget_0.anInt320)) {
										if ((widget_0.skillTriggers != null)
												&& ((Client.anInt702 - widget_0.anInt320) <= 32)) {
											label539: for (int_18 = widget_0.anInt320; int_18 < Client.anInt702; int_18++) {
												int_19 = Client.anIntArray149[int_18 & 0x1F];

												for (int_20 = 0; int_20 < widget_0.skillTriggers.length; int_20++) {
													if (int_19 == widget_0.skillTriggers[int_20]) {
														scriptevent_1 = new ScriptEvent();
														scriptevent_1.widget = widget_0;
														scriptevent_1.anObjectArray22 = widget_0.skillListenerArgs;
														Client.aDeque7.addFront(scriptevent_1);
														break label539;
													}
												}
											}
										} else {
											scriptevent_0 = new ScriptEvent();
											scriptevent_0.widget = widget_0;
											scriptevent_0.anObjectArray22 = widget_0.skillListenerArgs;
											Client.aDeque7.addFront(scriptevent_0);
										}

										widget_0.anInt320 = Client.anInt702;
									}

									if ((Client.anInt751 > widget_0.anInt317) && (widget_0.anObjectArray13 != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.widget = widget_0;
										scriptevent_0.anObjectArray22 = widget_0.anObjectArray13;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if ((Client.anInt697 > widget_0.anInt317) && (widget_0.anObjectArray15 != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.widget = widget_0;
										scriptevent_0.anObjectArray22 = widget_0.anObjectArray15;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if ((Client.anInt710 > widget_0.anInt317) && (widget_0.anObjectArray16 != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.widget = widget_0;
										scriptevent_0.anObjectArray22 = widget_0.anObjectArray16;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if ((Client.anInt694 > widget_0.anInt317) && (widget_0.anObjectArray20 != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.widget = widget_0;
										scriptevent_0.anObjectArray22 = widget_0.anObjectArray20;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if ((Client.anInt746 > widget_0.anInt317) && (widget_0.anObjectArray21 != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.widget = widget_0;
										scriptevent_0.anObjectArray22 = widget_0.anObjectArray21;
										Client.aDeque7.addFront(scriptevent_0);
									}

									if ((Client.anInt695 > widget_0.anInt317) && (widget_0.anObjectArray17 != null)) {
										scriptevent_0 = new ScriptEvent();
										scriptevent_0.widget = widget_0;
										scriptevent_0.anObjectArray22 = widget_0.anObjectArray17;
										Client.aDeque7.addFront(scriptevent_0);
									}

									widget_0.anInt317 = Client.anInt692;
									if (widget_0.anObjectArray14 != null) {
										for (int_18 = 0; int_18 < Client.anInt744; int_18++) {
											final ScriptEvent scriptevent_2 = new ScriptEvent();
											scriptevent_2.widget = widget_0;
											scriptevent_2.anInt419 = Client.anIntArray164[int_18];
											scriptevent_2.anInt420 = Client.anIntArray165[int_18];
											scriptevent_2.anObjectArray22 = widget_0.anObjectArray14;
											Client.aDeque7.addFront(scriptevent_2);
										}
									}
								}
							}

							if (!widget_0.hasScript && (Client.aWidget9 == null) && (Ignore.aWidget7 == null)
									&& !Client.isMenuOpen) {
								if (((widget_0.anInt302 >= 0) || (widget_0.anInt305 != 0))
										&& (MouseInput.anInt278 >= int_10) && (MouseInput.anInt280 >= int_11)
										&& (MouseInput.anInt278 < int_12) && (MouseInput.anInt280 < int_13)) {
									if (widget_0.anInt302 >= 0) {
										XGrandExchangeOffer.aWidget3 = widgets_0[widget_0.anInt302];
									} else {
										XGrandExchangeOffer.aWidget3 = widget_0;
									}
								}

								if ((widget_0.type == 8) && (MouseInput.anInt278 >= int_10)
										&& (MouseInput.anInt280 >= int_11) && (MouseInput.anInt278 < int_12)
										&& (MouseInput.anInt280 < int_13)) {
									Class1.aWidget2 = widget_0;
								}

								if (widget_0.scrollHeight > widget_0.height) {
									int_17 = int_8 + widget_0.width;
									int_26 = widget_0.height;
									int_18 = widget_0.scrollHeight;
									int_19 = MouseInput.anInt278;
									int_20 = MouseInput.anInt280;
									if (Client.aBool88) {
										Client.anInt734 = 32;
									} else {
										Client.anInt734 = 0;
									}

									Client.aBool88 = false;
									if ((MouseInput.anInt281 == 1) || (!Class14.aBool5 && (MouseInput.anInt281 == 4))) {
										if ((int_19 >= int_17) && (int_19 < (int_17 + 16)) && (int_20 >= int_9)
												&& (int_20 < (int_9 + 16))) {
											widget_0.scrollY -= 4;
											Class15.method196(widget_0);
										} else if ((int_19 >= int_17) && (int_19 < (int_17 + 16))
												&& (int_20 >= ((int_9 + int_26) - 16)) && (int_20 < (int_26 + int_9))) {
											widget_0.scrollY += 4;
											Class15.method196(widget_0);
										} else if ((int_19 >= (int_17 - Client.anInt734))
												&& (int_19 < (int_17 + 16 + Client.anInt734))
												&& (int_20 >= (int_9 + 16)) && (int_20 < ((int_26 + int_9) - 16))) {
											int_21 = (int_26 * (int_26 - 32)) / int_18;
											if (int_21 < 8) {
												int_21 = 8;
											}

											int_22 = int_20 - int_9 - 16 - (int_21 / 2);
											int_23 = int_26 - 32 - int_21;
											widget_0.scrollY = (int_22 * (int_18 - int_26)) / int_23;
											Class15.method196(widget_0);
											Client.aBool88 = true;
										}
									}

									if (Client.anInt679 != 0) {
										int_21 = widget_0.width;
										if ((int_19 >= (int_17 - int_21)) && (int_20 >= int_9)
												&& (int_19 < (int_17 + 16)) && (int_20 <= (int_26 + int_9))) {
											widget_0.scrollY += Client.anInt679 * 45;
											Class15.method196(widget_0);
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	static final void method587(final String string_0) {
		if (string_0 != null) {
			final String string_1 = Class75.method446(string_0, Class59.aClass110_1);
			if (string_1 != null) {
				for (int int_0 = 0; int_0 < Client.friendCount; int_0++) {
					final Friend friend_0 = Client.friends[int_0];
					final String string_2 = friend_0.name;
					final String string_3 = Class75.method446(string_2, Class59.aClass110_1);
					if (Class6.method107(string_0, string_1, string_2, string_3)) {
						--Client.friendCount;

						for (int int_1 = int_0; int_1 < Client.friendCount; int_1++) {
							Client.friends[int_1] = Client.friends[int_1 + 1];
						}

						Client.anInt697 = Client.anInt692;
						Client.secretPacketBuffer1.putOpcode(154);
						Client.secretPacketBuffer1.putByte(DecorativeObject.getLength(string_0));
						Client.secretPacketBuffer1.putString(string_0);
						break;
					}
				}

			}
		}
	}

	public static byte[] method588(final CharSequence charsequence_0) {
		final int int_0 = charsequence_0.length();
		final byte[] bytes_0 = new byte[int_0];

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			final char char_0 = charsequence_0.charAt(int_1);
			if (((char_0 > 0) && (char_0 < 128)) || ((char_0 >= 160) && (char_0 <= 255))) {
				bytes_0[int_1] = (byte) char_0;
			} else if (char_0 == 8364) {
				bytes_0[int_1] = -128;
			} else if (char_0 == 8218) {
				bytes_0[int_1] = -126;
			} else if (char_0 == 402) {
				bytes_0[int_1] = -125;
			} else if (char_0 == 8222) {
				bytes_0[int_1] = -124;
			} else if (char_0 == 8230) {
				bytes_0[int_1] = -123;
			} else if (char_0 == 8224) {
				bytes_0[int_1] = -122;
			} else if (char_0 == 8225) {
				bytes_0[int_1] = -121;
			} else if (char_0 == 710) {
				bytes_0[int_1] = -120;
			} else if (char_0 == 8240) {
				bytes_0[int_1] = -119;
			} else if (char_0 == 352) {
				bytes_0[int_1] = -118;
			} else if (char_0 == 8249) {
				bytes_0[int_1] = -117;
			} else if (char_0 == 338) {
				bytes_0[int_1] = -116;
			} else if (char_0 == 381) {
				bytes_0[int_1] = -114;
			} else if (char_0 == 8216) {
				bytes_0[int_1] = -111;
			} else if (char_0 == 8217) {
				bytes_0[int_1] = -110;
			} else if (char_0 == 8220) {
				bytes_0[int_1] = -109;
			} else if (char_0 == 8221) {
				bytes_0[int_1] = -108;
			} else if (char_0 == 8226) {
				bytes_0[int_1] = -107;
			} else if (char_0 == 8211) {
				bytes_0[int_1] = -106;
			} else if (char_0 == 8212) {
				bytes_0[int_1] = -105;
			} else if (char_0 == 732) {
				bytes_0[int_1] = -104;
			} else if (char_0 == 8482) {
				bytes_0[int_1] = -103;
			} else if (char_0 == 353) {
				bytes_0[int_1] = -102;
			} else if (char_0 == 8250) {
				bytes_0[int_1] = -101;
			} else if (char_0 == 339) {
				bytes_0[int_1] = -100;
			} else if (char_0 == 382) {
				bytes_0[int_1] = -98;
			} else if (char_0 == 376) {
				bytes_0[int_1] = -97;
			} else {
				bytes_0[int_1] = 63;
			}
		}

		return bytes_0;
	}

}
