public class AClass5_Sub2 extends AClass5 {

	int anInt451;
	int anInt452;
	int anInt453;
	int anInt454;
	int anInt455;
	int anInt456;
	int anInt457;
	int anInt458;
	int anInt459;
	int anInt460;
	int anInt461;
	int anInt462;
	int anInt463;
	boolean aBool50;
	int anInt464;

	AClass5_Sub2(final AClass7_Sub1 aclass7_sub1_0, final int int_0, final int int_1, final int int_2) {
		anAClass7_1 = aclass7_sub1_0;
		anInt459 = aclass7_sub1_0.anInt449;
		anInt461 = aclass7_sub1_0.anInt450;
		aBool50 = aclass7_sub1_0.aBool49;
		anInt456 = int_0;
		anInt452 = int_1;
		anInt451 = int_2;
		anInt457 = 0;
		method715();
	}

	AClass5_Sub2(final AClass7_Sub1 aclass7_sub1_0, final int int_0, final int int_1) {
		anAClass7_1 = aclass7_sub1_0;
		anInt459 = aclass7_sub1_0.anInt449;
		anInt461 = aclass7_sub1_0.anInt450;
		aBool50 = aclass7_sub1_0.aBool49;
		anInt456 = int_0;
		anInt452 = int_1;
		anInt451 = 8192;
		anInt457 = 0;
		method715();
	}

	public synchronized int method710() {
		return anInt451 < 0 ? -1 : anInt451;
	}

	synchronized void method711(final int int_0) {
		method712(int_0, method710());
	}

	synchronized void method712(final int int_0, final int int_1) {
		anInt452 = int_0;
		anInt451 = int_1;
		anInt455 = 0;
		method715();
	}

	public synchronized void method713(int int_0, final int int_1, final int int_2) {
		if (int_0 == 0) {
			method712(int_1, int_2);
		} else {
			final int int_3 = method730(int_1, int_2);
			final int int_4 = method731(int_1, int_2);
			if ((int_3 == anInt458) && (int_4 == anInt460)) {
				anInt455 = 0;
			} else {
				int int_5 = int_1 - anInt453;
				if ((anInt453 - int_1) > int_5) {
					int_5 = anInt453 - int_1;
				}

				if ((int_3 - anInt458) > int_5) {
					int_5 = int_3 - anInt458;
				}

				if ((anInt458 - int_3) > int_5) {
					int_5 = anInt458 - int_3;
				}

				if ((int_4 - anInt460) > int_5) {
					int_5 = int_4 - anInt460;
				}

				if ((anInt460 - int_4) > int_5) {
					int_5 = anInt460 - int_4;
				}

				if (int_0 > int_5) {
					int_0 = int_5;
				}

				anInt455 = int_0;
				anInt452 = int_1;
				anInt451 = int_2;
				anInt462 = (int_1 - anInt453) / int_0;
				anInt463 = (int_3 - anInt458) / int_0;
				anInt464 = (int_4 - anInt460) / int_0;
			}
		}
	}

	@Override
	public synchronized void method625(final int[] ints_0, final int int_0, int int_1) {
		if ((anInt452 == 0) && (anInt455 == 0)) {
			method626(int_1);
		} else {
			final AClass7_Sub1 aclass7_sub1_0 = (AClass7_Sub1) anAClass7_1;
			final int int_2 = anInt459 << 8;
			final int int_3 = anInt461 << 8;
			final int int_4 = aclass7_sub1_0.aByteArray19.length << 8;
			final int int_5 = int_3 - int_2;
			if (int_5 <= 0) {
				anInt454 = 0;
			}

			int int_6 = int_0;
			int_1 += int_0;
			if (anInt457 < 0) {
				if (anInt456 <= 0) {
					method720();
					unlink();
					return;
				}

				anInt457 = 0;
			}

			if (anInt457 >= int_4) {
				if (anInt456 >= 0) {
					method720();
					unlink();
					return;
				}

				anInt457 = int_4 - 1;
			}

			if (anInt454 < 0) {
				if (aBool50) {
					if (anInt456 < 0) {
						int_6 = method726(ints_0, int_0, int_2, int_1, aclass7_sub1_0.aByteArray19[anInt459]);
						if (anInt457 >= int_2) {
							return;
						}

						anInt457 = (int_2 + int_2) - 1 - anInt457;
						anInt456 = -anInt456;
					}

					while (true) {
						int_6 = method725(ints_0, int_6, int_3, int_1, aclass7_sub1_0.aByteArray19[anInt461 - 1]);
						if (anInt457 < int_3) {
							return;
						}

						anInt457 = (int_3 + int_3) - 1 - anInt457;
						anInt456 = -anInt456;
						int_6 = method726(ints_0, int_6, int_2, int_1, aclass7_sub1_0.aByteArray19[anInt459]);
						if (anInt457 >= int_2) {
							return;
						}

						anInt457 = (int_2 + int_2) - 1 - anInt457;
						anInt456 = -anInt456;
					}
				} else if (anInt456 < 0) {
					while (true) {
						int_6 = method726(ints_0, int_6, int_2, int_1, aclass7_sub1_0.aByteArray19[anInt461 - 1]);
						if (anInt457 >= int_2) {
							return;
						}

						anInt457 = int_3 - 1 - ((int_3 - 1 - anInt457) % int_5);
					}
				} else {
					while (true) {
						int_6 = method725(ints_0, int_6, int_3, int_1, aclass7_sub1_0.aByteArray19[anInt459]);
						if (anInt457 < int_3) {
							return;
						}

						anInt457 = int_2 + ((anInt457 - int_2) % int_5);
					}
				}
			} else {
				if (anInt454 > 0) {
					if (aBool50) {
						label131: {
							if (anInt456 < 0) {
								int_6 = method726(ints_0, int_0, int_2, int_1, aclass7_sub1_0.aByteArray19[anInt459]);
								if (anInt457 >= int_2) {
									return;
								}

								anInt457 = (int_2 + int_2) - 1 - anInt457;
								anInt456 = -anInt456;
								if (--anInt454 == 0) {
									break label131;
								}
							}

							do {
								int_6 = method725(ints_0, int_6, int_3, int_1,
										aclass7_sub1_0.aByteArray19[anInt461 - 1]);
								if (anInt457 < int_3) {
									return;
								}

								anInt457 = (int_3 + int_3) - 1 - anInt457;
								anInt456 = -anInt456;
								if (--anInt454 == 0) {
									break;
								}

								int_6 = method726(ints_0, int_6, int_2, int_1, aclass7_sub1_0.aByteArray19[anInt459]);
								if (anInt457 >= int_2) {
									return;
								}

								anInt457 = (int_2 + int_2) - 1 - anInt457;
								anInt456 = -anInt456;
							} while (--anInt454 != 0);
						}
					} else {
						int int_7;
						if (anInt456 < 0) {
							while (true) {
								int_6 = method726(ints_0, int_6, int_2, int_1,
										aclass7_sub1_0.aByteArray19[anInt461 - 1]);
								if (anInt457 >= int_2) {
									return;
								}

								int_7 = (int_3 - 1 - anInt457) / int_5;
								if (int_7 >= anInt454) {
									anInt457 += int_5 * anInt454;
									anInt454 = 0;
									break;
								}

								anInt457 += int_5 * int_7;
								anInt454 -= int_7;
							}
						} else {
							while (true) {
								int_6 = method725(ints_0, int_6, int_3, int_1, aclass7_sub1_0.aByteArray19[anInt459]);
								if (anInt457 < int_3) {
									return;
								}

								int_7 = (anInt457 - int_2) / int_5;
								if (int_7 >= anInt454) {
									anInt457 -= int_5 * anInt454;
									anInt454 = 0;
									break;
								}

								anInt457 -= int_5 * int_7;
								anInt454 -= int_7;
							}
						}
					}
				}

				if (anInt456 < 0) {
					method726(ints_0, int_6, 0, int_1, 0);
					if (anInt457 < 0) {
						anInt457 = -1;
						method720();
						unlink();
					}
				} else {
					method725(ints_0, int_6, int_4, int_1, 0);
					if (anInt457 >= int_4) {
						anInt457 = int_4;
						method720();
						unlink();
						return;
					}
				}

			}
		}
	}

	@Override
	public synchronized void method626(int int_0) {
		if (anInt455 > 0) {
			if (int_0 >= anInt455) {
				if (anInt452 == Integer.MIN_VALUE) {
					anInt452 = 0;
					anInt460 = 0;
					anInt458 = 0;
					anInt453 = 0;
					unlink();
					int_0 = anInt455;
				}

				anInt455 = 0;
				method715();
			} else {
				anInt453 += anInt462 * int_0;
				anInt458 += anInt463 * int_0;
				anInt460 += anInt464 * int_0;
				anInt455 -= int_0;
			}
		}

		final AClass7_Sub1 aclass7_sub1_0 = (AClass7_Sub1) anAClass7_1;
		final int int_1 = anInt459 << 8;
		final int int_2 = anInt461 << 8;
		final int int_3 = aclass7_sub1_0.aByteArray19.length << 8;
		final int int_4 = int_2 - int_1;
		if (int_4 <= 0) {
			anInt454 = 0;
		}

		if (anInt457 < 0) {
			if (anInt456 <= 0) {
				method720();
				unlink();
				return;
			}

			anInt457 = 0;
		}

		if (anInt457 >= int_3) {
			if (anInt456 >= 0) {
				method720();
				unlink();
				return;
			}

			anInt457 = int_3 - 1;
		}

		anInt457 += anInt456 * int_0;
		if (anInt454 < 0) {
			if (!aBool50) {
				if (anInt456 < 0) {
					if (anInt457 < int_1) {
						anInt457 = int_2 - 1 - ((int_2 - 1 - anInt457) % int_4);
					}
				} else if (anInt457 >= int_2) {
					anInt457 = int_1 + ((anInt457 - int_1) % int_4);
				}
			} else {
				if (anInt456 < 0) {
					if (anInt457 >= int_1) {
						return;
					}

					anInt457 = (int_1 + int_1) - 1 - anInt457;
					anInt456 = -anInt456;
				}

				while (anInt457 >= int_2) {
					anInt457 = (int_2 + int_2) - 1 - anInt457;
					anInt456 = -anInt456;
					if (anInt457 >= int_1) {
						return;
					}

					anInt457 = (int_1 + int_1) - 1 - anInt457;
					anInt456 = -anInt456;
				}

			}
		} else {
			if (anInt454 > 0) {
				if (aBool50) {
					label125: {
						if (anInt456 < 0) {
							if (anInt457 >= int_1) {
								return;
							}

							anInt457 = (int_1 + int_1) - 1 - anInt457;
							anInt456 = -anInt456;
							if (--anInt454 == 0) {
								break label125;
							}
						}

						do {
							if (anInt457 < int_2) {
								return;
							}

							anInt457 = (int_2 + int_2) - 1 - anInt457;
							anInt456 = -anInt456;
							if (--anInt454 == 0) {
								break;
							}

							if (anInt457 >= int_1) {
								return;
							}

							anInt457 = (int_1 + int_1) - 1 - anInt457;
							anInt456 = -anInt456;
						} while (--anInt454 != 0);
					}
				} else {
					int int_5;
					if (anInt456 < 0) {
						if (anInt457 >= int_1) {
							return;
						}

						int_5 = (int_2 - 1 - anInt457) / int_4;
						if (int_5 < anInt454) {
							anInt457 += int_4 * int_5;
							anInt454 -= int_5;
							return;
						}

						anInt457 += int_4 * anInt454;
						anInt454 = 0;
					} else {
						if (anInt457 < int_2) {
							return;
						}

						int_5 = (anInt457 - int_1) / int_4;
						if (int_5 < anInt454) {
							anInt457 -= int_4 * int_5;
							anInt454 -= int_5;
							return;
						}

						anInt457 -= int_4 * anInt454;
						anInt454 = 0;
					}
				}
			}

			if (anInt456 < 0) {
				if (anInt457 < 0) {
					anInt457 = -1;
					method720();
					unlink();
					return;
				}
			} else if (anInt457 >= int_3) {
				anInt457 = int_3;
				method720();
				unlink();
				return;
			}

		}
	}

	public synchronized void method714(int int_0) {
		final int int_1 = ((AClass7_Sub1) anAClass7_1).aByteArray19.length << 8;
		if (int_0 < -1) {
			int_0 = -1;
		}

		if (int_0 > int_1) {
			int_0 = int_1;
		}

		anInt457 = int_0;
	}

	void method715() {
		anInt453 = anInt452;
		anInt458 = method730(anInt452, anInt451);
		anInt460 = method731(anInt452, anInt451);
	}

	@Override
	protected AClass5 method628() {
		return null;
	}

	public boolean method716() {
		return (anInt457 < 0) || (anInt457 >= (((AClass7_Sub1) anAClass7_1).aByteArray19.length << 8));
	}

	public synchronized void method717(final int int_0) {
		if (anInt456 < 0) {
			anInt456 = -int_0;
		} else {
			anInt456 = int_0;
		}
	}

	public synchronized void method718(int int_0) {
		if (int_0 == 0) {
			method711(0);
			unlink();
		} else if ((anInt458 == 0) && (anInt460 == 0)) {
			anInt455 = 0;
			anInt452 = 0;
			anInt453 = 0;
			unlink();
		} else {
			int int_1 = -anInt453;
			if (anInt453 > int_1) {
				int_1 = anInt453;
			}

			if (-anInt458 > int_1) {
				int_1 = -anInt458;
			}

			if (anInt458 > int_1) {
				int_1 = anInt458;
			}

			if (-anInt460 > int_1) {
				int_1 = -anInt460;
			}

			if (anInt460 > int_1) {
				int_1 = anInt460;
			}

			if (int_0 > int_1) {
				int_0 = int_1;
			}

			anInt455 = int_0;
			anInt452 = Integer.MIN_VALUE;
			anInt462 = -anInt453 / int_0;
			anInt463 = -anInt458 / int_0;
			anInt464 = -anInt460 / int_0;
		}
	}

	public boolean method719() {
		return anInt455 != 0;
	}

	void method720() {
		if (anInt455 != 0) {
			if (anInt452 == Integer.MIN_VALUE) {
				anInt452 = 0;
			}

			anInt455 = 0;
			method715();
		}

	}

	public synchronized void method721() {
		anInt456 = (anInt456 ^ (anInt456 >> 31)) + (anInt456 >>> 31);
		anInt456 = -anInt456;
	}

	@Override
	protected AClass5 method629() {
		return null;
	}

	@Override
	int method630() {
		int int_0 = (anInt453 * 3) >> 6;
		int_0 = (int_0 ^ (int_0 >> 31)) + (int_0 >>> 31);
		if (anInt454 == 0) {
			int_0 -= (int_0 * anInt457) / (((AClass7_Sub1) anAClass7_1).aByteArray19.length << 8);
		} else if (anInt454 >= 0) {
			int_0 -= (int_0 * anInt459) / ((AClass7_Sub1) anAClass7_1).aByteArray19.length;
		}

		return int_0 > 255 ? 255 : int_0;
	}

	public synchronized int method722() {
		return anInt456 < 0 ? -anInt456 : anInt456;
	}

	public synchronized int method723() {
		return anInt452 == Integer.MIN_VALUE ? 0 : anInt452;
	}

	boolean method724() {
		int int_0 = anInt452;
		int int_1;
		int int_2;
		if (int_0 == Integer.MIN_VALUE) {
			int_1 = 0;
			int_2 = 0;
			int_0 = 0;
		} else {
			int_2 = method730(int_0, anInt451);
			int_1 = method731(int_0, anInt451);
		}

		if ((int_0 == anInt453) && (int_2 == anInt458) && (int_1 == anInt460)) {
			if (anInt452 == Integer.MIN_VALUE) {
				anInt452 = 0;
				anInt460 = 0;
				anInt458 = 0;
				anInt453 = 0;
				unlink();
				return true;
			} else {
				method715();
				return false;
			}
		} else {
			if (anInt453 < int_0) {
				anInt462 = 1;
				anInt455 = int_0 - anInt453;
			} else if (anInt453 > int_0) {
				anInt462 = -1;
				anInt455 = anInt453 - int_0;
			} else {
				anInt462 = 0;
			}

			if (anInt458 < int_2) {
				anInt463 = 1;
				if ((anInt455 == 0) || (anInt455 > (int_2 - anInt458))) {
					anInt455 = int_2 - anInt458;
				}
			} else if (anInt458 > int_2) {
				anInt463 = -1;
				if ((anInt455 == 0) || (anInt455 > (anInt458 - int_2))) {
					anInt455 = anInt458 - int_2;
				}
			} else {
				anInt463 = 0;
			}

			if (anInt460 < int_1) {
				anInt464 = 1;
				if ((anInt455 == 0) || (anInt455 > (int_1 - anInt460))) {
					anInt455 = int_1 - anInt460;
				}
			} else if (anInt460 > int_1) {
				anInt464 = -1;
				if ((anInt455 == 0) || (anInt455 > (anInt460 - int_1))) {
					anInt455 = anInt460 - int_1;
				}
			} else {
				anInt464 = 0;
			}

			return false;
		}
	}

	int method725(final int[] ints_0, int int_0, final int int_1, final int int_2, final int int_3) {
		while (true) {
			if (anInt455 > 0) {
				int int_4 = int_0 + anInt455;
				if (int_4 > int_2) {
					int_4 = int_2;
				}

				anInt455 += int_0;
				if ((anInt456 == 256) && ((anInt457 & 0xFF) == 0)) {
					if (AbstractSoundSystem.highMemory) {
						int_0 = method746(0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0,
								anInt458, anInt460, anInt463, anInt464, 0, int_4, int_1, this);
					} else {
						int_0 = method742(((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt453,
								anInt462, 0, int_4, int_1, this);
					}
				} else if (AbstractSoundSystem.highMemory) {
					int_0 = method744(0, 0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0,
							anInt458, anInt460, anInt463, anInt464, 0, int_4, int_1, this, anInt456, int_3);
				} else {
					int_0 = method740(0, 0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0,
							anInt453, anInt462, 0, int_4, int_1, this, anInt456, int_3);
				}

				anInt455 -= int_0;
				if (anInt455 != 0) {
					return int_0;
				}

				if (!method724()) {
					continue;
				}

				return int_2;
			}

			if ((anInt456 == 256) && ((anInt457 & 0xFF) == 0)) {
				if (AbstractSoundSystem.highMemory) {
					return method738(0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt458,
							anInt460, 0, int_2, int_1, this);
				}

				return method734(((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt453, 0, int_2,
						int_1, this);
			}

			if (AbstractSoundSystem.highMemory) {
				return method735(0, 0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt458,
						anInt460, 0, int_2, int_1, this, anInt456, int_3);
			}

			return method732(0, 0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt453, 0,
					int_2, int_1, this, anInt456, int_3);
		}
	}

	int method726(final int[] ints_0, int int_0, final int int_1, final int int_2, final int int_3) {
		while (true) {
			if (anInt455 > 0) {
				int int_4 = int_0 + anInt455;
				if (int_4 > int_2) {
					int_4 = int_2;
				}

				anInt455 += int_0;
				if ((anInt456 == -256) && ((anInt457 & 0xFF) == 0)) {
					if (AbstractSoundSystem.highMemory) {
						int_0 = method747(0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0,
								anInt458, anInt460, anInt463, anInt464, 0, int_4, int_1, this);
					} else {
						int_0 = method743(((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt453,
								anInt462, 0, int_4, int_1, this);
					}
				} else if (AbstractSoundSystem.highMemory) {
					int_0 = method745(0, 0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0,
							anInt458, anInt460, anInt463, anInt464, 0, int_4, int_1, this, anInt456, int_3);
				} else {
					int_0 = method741(0, 0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0,
							anInt453, anInt462, 0, int_4, int_1, this, anInt456, int_3);
				}

				anInt455 -= int_0;
				if (anInt455 != 0) {
					return int_0;
				}

				if (!method724()) {
					continue;
				}

				return int_2;
			}

			if ((anInt456 == -256) && ((anInt457 & 0xFF) == 0)) {
				if (AbstractSoundSystem.highMemory) {
					return method739(0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt458,
							anInt460, 0, int_2, int_1, this);
				}

				return method736(((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt453, 0, int_2,
						int_1, this);
			}

			if (AbstractSoundSystem.highMemory) {
				return method737(0, 0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt458,
						anInt460, 0, int_2, int_1, this, anInt456, int_3);
			}

			return method733(0, 0, ((AClass7_Sub1) anAClass7_1).aByteArray19, ints_0, anInt457, int_0, anInt453, 0,
					int_2, int_1, this, anInt456, int_3);
		}
	}

	public synchronized void method727(final int int_0) {
		anInt454 = int_0;
	}

	@Override
	protected int method631() {
		return (anInt452 == 0) && (anInt455 == 0) ? 0 : 1;
	}

	public synchronized void method728(final int int_0, final int int_1) {
		method713(int_0, int_1, method710());
	}

	public synchronized void method729(final int int_0) {
		method712(int_0 << 6, method710());
	}

	static int method730(final int int_0, final int int_1) {
		return int_1 < 0 ? int_0 : (int) ((int_0 * Math.sqrt((16384 - int_1) * 1.220703125E-4D)) + 0.5D);
	}

	static int method731(final int int_0, final int int_1) {
		return int_1 < 0 ? -int_0 : (int) ((int_0 * Math.sqrt(int_1 * 1.220703125E-4D)) + 0.5D);
	}

	static int method732(final int int_0, int int_1, final byte[] bytes_0, final int[] ints_0, int int_2, int int_3,
			final int int_4, int int_5, final int int_6, final int int_7, final AClass5_Sub2 aclass5_sub2_0,
			final int int_8, final int int_9) {
		if ((int_8 == 0) || ((int_5 = int_3 + (((int_8 + (int_7 - int_2)) - 257) / int_8)) > int_6)) {
			int_5 = int_6;
		}

		byte byte_0;
		int int_10;
		while (int_3 < int_5) {
			int_1 = int_2 >> 8;
			byte_0 = bytes_0[int_1];
			int_10 = int_3++;
			ints_0[int_10] += (((byte_0 << 8) + ((bytes_0[int_1 + 1] - byte_0) * (int_2 & 0xFF))) * int_4) >> 6;
			int_2 += int_8;
		}

		if ((int_8 == 0) || ((int_5 = int_3 + (((int_8 + (int_7 - int_2)) - 1) / int_8)) > int_6)) {
			int_5 = int_6;
		}

		for (int_1 = int_9; int_3 < int_5; int_2 += int_8) {
			byte_0 = bytes_0[int_2 >> 8];
			int_10 = int_3++;
			ints_0[int_10] += (((byte_0 << 8) + ((int_1 - byte_0) * (int_2 & 0xFF))) * int_4) >> 6;
		}

		aclass5_sub2_0.anInt457 = int_2;
		return int_3;
	}

	static int method733(int int_0, int int_1, final byte[] bytes_0, final int[] ints_0, int int_2, int int_3,
			final int int_4, int int_5, final int int_6, final int int_7, final AClass5_Sub2 aclass5_sub2_0,
			final int int_8, final int int_9) {
		if ((int_8 == 0) || ((int_5 = int_3 + ((int_8 + ((int_7 + 256) - int_2)) / int_8)) > int_6)) {
			int_5 = int_6;
		}

		int int_10;
		while (int_3 < int_5) {
			int_1 = int_2 >> 8;
			final byte byte_0 = bytes_0[int_1 - 1];
			int_10 = int_3++;
			ints_0[int_10] += ((((bytes_0[int_1] - byte_0) * (int_2 & 0xFF)) + (byte_0 << 8)) * int_4) >> 6;
			int_2 += int_8;
		}

		if ((int_8 == 0) || ((int_5 = int_3 + ((int_8 + (int_7 - int_2)) / int_8)) > int_6)) {
			int_5 = int_6;
		}

		int_0 = int_9;

		for (int_1 = int_8; int_3 < int_5; int_2 += int_1) {
			int_10 = int_3++;
			ints_0[int_10] += (((int_0 << 8) + ((bytes_0[int_2 >> 8] - int_0) * (int_2 & 0xFF))) * int_4) >> 6;
		}

		aclass5_sub2_0.anInt457 = int_2;
		return int_3;
	}

	static int method734(final byte[] bytes_0, final int[] ints_0, int int_0, int int_1, int int_2, int int_3,
			final int int_4, int int_5, final AClass5_Sub2 aclass5_sub2_0) {
		int_0 >>= 8;
		int_5 >>= 8;
		int_2 <<= 2;
		if ((int_3 = (int_1 + int_5) - int_0) > int_4) {
			int_3 = int_4;
		}

		int int_6;
		for (int_3 -= 3; int_1 < int_3; ints_0[int_6] += bytes_0[int_0++] * int_2) {
			int_6 = int_1++;
			ints_0[int_6] += bytes_0[int_0++] * int_2;
			int_6 = int_1++;
			ints_0[int_6] += bytes_0[int_0++] * int_2;
			int_6 = int_1++;
			ints_0[int_6] += bytes_0[int_0++] * int_2;
			int_6 = int_1++;
		}

		for (int_3 += 3; int_1 < int_3; ints_0[int_6] += bytes_0[int_0++] * int_2) {
			int_6 = int_1++;
		}

		aclass5_sub2_0.anInt457 = int_0 << 8;
		return int_1;
	}

	static int method735(int int_0, int int_1, final byte[] bytes_0, final int[] ints_0, int int_2, int int_3,
			final int int_4, final int int_5, int int_6, final int int_7, final int int_8,
			final AClass5_Sub2 aclass5_sub2_0, final int int_9, final int int_10) {
		if ((int_9 == 0) || ((int_6 = int_3 + ((((int_8 - int_2) + int_9) - 257) / int_9)) > int_7)) {
			int_6 = int_7;
		}

		int_3 <<= 1;

		byte byte_0;
		int int_11;
		for (int_6 <<= 1; int_3 < int_6; int_2 += int_9) {
			int_1 = int_2 >> 8;
			byte_0 = bytes_0[int_1];
			int_0 = (byte_0 << 8) + ((bytes_0[int_1 + 1] - byte_0) * (int_2 & 0xFF));
			int_11 = int_3++;
			ints_0[int_11] += (int_0 * int_4) >> 6;
			int_11 = int_3++;
			ints_0[int_11] += (int_0 * int_5) >> 6;
		}

		if ((int_9 == 0) || ((int_6 = (int_3 >> 1) + ((((int_8 - int_2) + int_9) - 1) / int_9)) > int_7)) {
			int_6 = int_7;
		}

		int_6 <<= 1;

		for (int_1 = int_10; int_3 < int_6; int_2 += int_9) {
			byte_0 = bytes_0[int_2 >> 8];
			int_0 = (byte_0 << 8) + ((int_1 - byte_0) * (int_2 & 0xFF));
			int_11 = int_3++;
			ints_0[int_11] += (int_0 * int_4) >> 6;
			int_11 = int_3++;
			ints_0[int_11] += (int_0 * int_5) >> 6;
		}

		aclass5_sub2_0.anInt457 = int_2;
		return int_3 >> 1;
	}

	static int method736(final byte[] bytes_0, final int[] ints_0, int int_0, int int_1, int int_2, int int_3,
			final int int_4, int int_5, final AClass5_Sub2 aclass5_sub2_0) {
		int_0 >>= 8;
		int_5 >>= 8;
		int_2 <<= 2;
		if ((int_3 = (int_1 + int_0) - (int_5 - 1)) > int_4) {
			int_3 = int_4;
		}

		int int_6;
		for (int_3 -= 3; int_1 < int_3; ints_0[int_6] += bytes_0[int_0--] * int_2) {
			int_6 = int_1++;
			ints_0[int_6] += bytes_0[int_0--] * int_2;
			int_6 = int_1++;
			ints_0[int_6] += bytes_0[int_0--] * int_2;
			int_6 = int_1++;
			ints_0[int_6] += bytes_0[int_0--] * int_2;
			int_6 = int_1++;
		}

		for (int_3 += 3; int_1 < int_3; ints_0[int_6] += bytes_0[int_0--] * int_2) {
			int_6 = int_1++;
		}

		aclass5_sub2_0.anInt457 = int_0 << 8;
		return int_1;
	}

	static int method737(int int_0, int int_1, final byte[] bytes_0, final int[] ints_0, int int_2, int int_3,
			final int int_4, final int int_5, int int_6, final int int_7, final int int_8,
			final AClass5_Sub2 aclass5_sub2_0, final int int_9, final int int_10) {
		if ((int_9 == 0) || ((int_6 = int_3 + ((((int_8 + 256) - int_2) + int_9) / int_9)) > int_7)) {
			int_6 = int_7;
		}

		int_3 <<= 1;

		int int_11;
		for (int_6 <<= 1; int_3 < int_6; int_2 += int_9) {
			int_1 = int_2 >> 8;
			final byte byte_0 = bytes_0[int_1 - 1];
			int_0 = ((bytes_0[int_1] - byte_0) * (int_2 & 0xFF)) + (byte_0 << 8);
			int_11 = int_3++;
			ints_0[int_11] += (int_0 * int_4) >> 6;
			int_11 = int_3++;
			ints_0[int_11] += (int_0 * int_5) >> 6;
		}

		if ((int_9 == 0) || ((int_6 = (((int_8 - int_2) + int_9) / int_9) + (int_3 >> 1)) > int_7)) {
			int_6 = int_7;
		}

		int_6 <<= 1;

		for (int_1 = int_10; int_3 < int_6; int_2 += int_9) {
			int_0 = (int_1 << 8) + ((int_2 & 0xFF) * (bytes_0[int_2 >> 8] - int_1));
			int_11 = int_3++;
			ints_0[int_11] += (int_0 * int_4) >> 6;
			int_11 = int_3++;
			ints_0[int_11] += (int_0 * int_5) >> 6;
		}

		aclass5_sub2_0.anInt457 = int_2;
		return int_3 >> 1;
	}

	static int method738(final int int_0, final byte[] bytes_0, final int[] ints_0, int int_1, int int_2, int int_3,
			int int_4, int int_5, final int int_6, int int_7, final AClass5_Sub2 aclass5_sub2_0) {
		int_1 >>= 8;
		int_7 >>= 8;
		int_3 <<= 2;
		int_4 <<= 2;
		if ((int_5 = (int_2 + int_7) - int_1) > int_6) {
			int_5 = int_6;
		}

		int_2 <<= 1;
		int_5 <<= 1;

		int int_8;
		byte byte_0;
		for (int_5 -= 6; int_2 < int_5; ints_0[int_8] += byte_0 * int_4) {
			byte_0 = bytes_0[int_1++];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
			ints_0[int_8] += byte_0 * int_4;
			byte_0 = bytes_0[int_1++];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
			ints_0[int_8] += byte_0 * int_4;
			byte_0 = bytes_0[int_1++];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
			ints_0[int_8] += byte_0 * int_4;
			byte_0 = bytes_0[int_1++];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
		}

		for (int_5 += 6; int_2 < int_5; ints_0[int_8] += byte_0 * int_4) {
			byte_0 = bytes_0[int_1++];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
		}

		aclass5_sub2_0.anInt457 = int_1 << 8;
		return int_2 >> 1;
	}

	static int method739(final int int_0, final byte[] bytes_0, final int[] ints_0, int int_1, int int_2, int int_3,
			int int_4, int int_5, final int int_6, int int_7, final AClass5_Sub2 aclass5_sub2_0) {
		int_1 >>= 8;
		int_7 >>= 8;
		int_3 <<= 2;
		int_4 <<= 2;
		if ((int_5 = (int_1 + int_2) - (int_7 - 1)) > int_6) {
			int_5 = int_6;
		}

		int_2 <<= 1;
		int_5 <<= 1;

		int int_8;
		byte byte_0;
		for (int_5 -= 6; int_2 < int_5; ints_0[int_8] += byte_0 * int_4) {
			byte_0 = bytes_0[int_1--];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
			ints_0[int_8] += byte_0 * int_4;
			byte_0 = bytes_0[int_1--];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
			ints_0[int_8] += byte_0 * int_4;
			byte_0 = bytes_0[int_1--];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
			ints_0[int_8] += byte_0 * int_4;
			byte_0 = bytes_0[int_1--];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
		}

		for (int_5 += 6; int_2 < int_5; ints_0[int_8] += byte_0 * int_4) {
			byte_0 = bytes_0[int_1--];
			int_8 = int_2++;
			ints_0[int_8] += int_3 * byte_0;
			int_8 = int_2++;
		}

		aclass5_sub2_0.anInt457 = int_1 << 8;
		return int_2 >> 1;
	}

	static int method740(final int int_0, int int_1, final byte[] bytes_0, final int[] ints_0, int int_2, int int_3,
			int int_4, final int int_5, int int_6, final int int_7, final int int_8, final AClass5_Sub2 aclass5_sub2_0,
			final int int_9, final int int_10) {
		aclass5_sub2_0.anInt458 -= aclass5_sub2_0.anInt463 * int_3;
		aclass5_sub2_0.anInt460 -= aclass5_sub2_0.anInt464 * int_3;
		if ((int_9 == 0) || ((int_6 = int_3 + ((((int_8 - int_2) + int_9) - 257) / int_9)) > int_7)) {
			int_6 = int_7;
		}

		byte byte_0;
		int int_11;
		while (int_3 < int_6) {
			int_1 = int_2 >> 8;
			byte_0 = bytes_0[int_1];
			int_11 = int_3++;
			ints_0[int_11] += (((byte_0 << 8) + ((bytes_0[int_1 + 1] - byte_0) * (int_2 & 0xFF))) * int_4) >> 6;
			int_4 += int_5;
			int_2 += int_9;
		}

		if ((int_9 == 0) || ((int_6 = int_3 + ((((int_8 - int_2) + int_9) - 1) / int_9)) > int_7)) {
			int_6 = int_7;
		}

		for (int_1 = int_10; int_3 < int_6; int_2 += int_9) {
			byte_0 = bytes_0[int_2 >> 8];
			int_11 = int_3++;
			ints_0[int_11] += (((byte_0 << 8) + ((int_1 - byte_0) * (int_2 & 0xFF))) * int_4) >> 6;
			int_4 += int_5;
		}

		aclass5_sub2_0.anInt458 += aclass5_sub2_0.anInt463 * int_3;
		aclass5_sub2_0.anInt460 += aclass5_sub2_0.anInt464 * int_3;
		aclass5_sub2_0.anInt453 = int_4;
		aclass5_sub2_0.anInt457 = int_2;
		return int_3;
	}

	static int method741(int int_0, int int_1, final byte[] bytes_0, final int[] ints_0, int int_2, int int_3,
			int int_4, final int int_5, int int_6, final int int_7, final int int_8, final AClass5_Sub2 aclass5_sub2_0,
			final int int_9, final int int_10) {
		aclass5_sub2_0.anInt458 -= aclass5_sub2_0.anInt463 * int_3;
		aclass5_sub2_0.anInt460 -= aclass5_sub2_0.anInt464 * int_3;
		if ((int_9 == 0) || ((int_6 = int_3 + ((((int_8 + 256) - int_2) + int_9) / int_9)) > int_7)) {
			int_6 = int_7;
		}

		int int_11;
		while (int_3 < int_6) {
			int_1 = int_2 >> 8;
			final byte byte_0 = bytes_0[int_1 - 1];
			int_11 = int_3++;
			ints_0[int_11] += ((((bytes_0[int_1] - byte_0) * (int_2 & 0xFF)) + (byte_0 << 8)) * int_4) >> 6;
			int_4 += int_5;
			int_2 += int_9;
		}

		if ((int_9 == 0) || ((int_6 = int_3 + (((int_8 - int_2) + int_9) / int_9)) > int_7)) {
			int_6 = int_7;
		}

		int_0 = int_10;

		for (int_1 = int_9; int_3 < int_6; int_2 += int_1) {
			int_11 = int_3++;
			ints_0[int_11] += (((int_0 << 8) + ((bytes_0[int_2 >> 8] - int_0) * (int_2 & 0xFF))) * int_4) >> 6;
			int_4 += int_5;
		}

		aclass5_sub2_0.anInt458 += aclass5_sub2_0.anInt463 * int_3;
		aclass5_sub2_0.anInt460 += aclass5_sub2_0.anInt464 * int_3;
		aclass5_sub2_0.anInt453 = int_4;
		aclass5_sub2_0.anInt457 = int_2;
		return int_3;
	}

	static int method742(final byte[] bytes_0, final int[] ints_0, int int_0, int int_1, int int_2, int int_3,
			int int_4, final int int_5, int int_6, final AClass5_Sub2 aclass5_sub2_0) {
		int_0 >>= 8;
		int_6 >>= 8;
		int_2 <<= 2;
		int_3 <<= 2;
		if ((int_4 = (int_1 + int_6) - int_0) > int_5) {
			int_4 = int_5;
		}

		aclass5_sub2_0.anInt458 += aclass5_sub2_0.anInt463 * (int_4 - int_1);
		aclass5_sub2_0.anInt460 += aclass5_sub2_0.anInt464 * (int_4 - int_1);

		int int_7;
		for (int_4 -= 3; int_1 < int_4; int_2 += int_3) {
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0++] * int_2;
			int_2 += int_3;
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0++] * int_2;
			int_2 += int_3;
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0++] * int_2;
			int_2 += int_3;
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0++] * int_2;
		}

		for (int_4 += 3; int_1 < int_4; int_2 += int_3) {
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0++] * int_2;
		}

		aclass5_sub2_0.anInt453 = int_2 >> 2;
		aclass5_sub2_0.anInt457 = int_0 << 8;
		return int_1;
	}

	static int method743(final byte[] bytes_0, final int[] ints_0, int int_0, int int_1, int int_2, int int_3,
			int int_4, final int int_5, int int_6, final AClass5_Sub2 aclass5_sub2_0) {
		int_0 >>= 8;
		int_6 >>= 8;
		int_2 <<= 2;
		int_3 <<= 2;
		if ((int_4 = (int_1 + int_0) - (int_6 - 1)) > int_5) {
			int_4 = int_5;
		}

		aclass5_sub2_0.anInt458 += aclass5_sub2_0.anInt463 * (int_4 - int_1);
		aclass5_sub2_0.anInt460 += aclass5_sub2_0.anInt464 * (int_4 - int_1);

		int int_7;
		for (int_4 -= 3; int_1 < int_4; int_2 += int_3) {
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0--] * int_2;
			int_2 += int_3;
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0--] * int_2;
			int_2 += int_3;
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0--] * int_2;
			int_2 += int_3;
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0--] * int_2;
		}

		for (int_4 += 3; int_1 < int_4; int_2 += int_3) {
			int_7 = int_1++;
			ints_0[int_7] += bytes_0[int_0--] * int_2;
		}

		aclass5_sub2_0.anInt453 = int_2 >> 2;
		aclass5_sub2_0.anInt457 = int_0 << 8;
		return int_1;
	}

	static int method744(int int_0, int int_1, final byte[] bytes_0, final int[] ints_0, int int_2, int int_3,
			int int_4, int int_5, final int int_6, final int int_7, int int_8, final int int_9, final int int_10,
			final AClass5_Sub2 aclass5_sub2_0, final int int_11, final int int_12) {
		aclass5_sub2_0.anInt453 -= int_3 * aclass5_sub2_0.anInt462;
		if ((int_11 == 0) || ((int_8 = int_3 + ((((int_10 - int_2) + int_11) - 257) / int_11)) > int_9)) {
			int_8 = int_9;
		}

		int_3 <<= 1;

		byte byte_0;
		int int_13;
		for (int_8 <<= 1; int_3 < int_8; int_2 += int_11) {
			int_1 = int_2 >> 8;
			byte_0 = bytes_0[int_1];
			int_0 = (byte_0 << 8) + ((bytes_0[int_1 + 1] - byte_0) * (int_2 & 0xFF));
			int_13 = int_3++;
			ints_0[int_13] += (int_0 * int_4) >> 6;
			int_4 += int_6;
			int_13 = int_3++;
			ints_0[int_13] += (int_0 * int_5) >> 6;
			int_5 += int_7;
		}

		if ((int_11 == 0) || ((int_8 = ((((int_10 - int_2) + int_11) - 1) / int_11) + (int_3 >> 1)) > int_9)) {
			int_8 = int_9;
		}

		int_8 <<= 1;

		for (int_1 = int_12; int_3 < int_8; int_2 += int_11) {
			byte_0 = bytes_0[int_2 >> 8];
			int_0 = (byte_0 << 8) + ((int_1 - byte_0) * (int_2 & 0xFF));
			int_13 = int_3++;
			ints_0[int_13] += (int_0 * int_4) >> 6;
			int_4 += int_6;
			int_13 = int_3++;
			ints_0[int_13] += (int_0 * int_5) >> 6;
			int_5 += int_7;
		}

		int_3 >>= 1;
		aclass5_sub2_0.anInt453 += int_3 * aclass5_sub2_0.anInt462;
		aclass5_sub2_0.anInt458 = int_4;
		aclass5_sub2_0.anInt460 = int_5;
		aclass5_sub2_0.anInt457 = int_2;
		return int_3;
	}

	static int method745(int int_0, int int_1, final byte[] bytes_0, final int[] ints_0, int int_2, int int_3,
			int int_4, int int_5, final int int_6, final int int_7, int int_8, final int int_9, final int int_10,
			final AClass5_Sub2 aclass5_sub2_0, final int int_11, final int int_12) {
		aclass5_sub2_0.anInt453 -= int_3 * aclass5_sub2_0.anInt462;
		if ((int_11 == 0) || ((int_8 = int_3 + ((((int_10 + 256) - int_2) + int_11) / int_11)) > int_9)) {
			int_8 = int_9;
		}

		int_3 <<= 1;

		int int_13;
		for (int_8 <<= 1; int_3 < int_8; int_2 += int_11) {
			int_1 = int_2 >> 8;
			final byte byte_0 = bytes_0[int_1 - 1];
			int_0 = ((bytes_0[int_1] - byte_0) * (int_2 & 0xFF)) + (byte_0 << 8);
			int_13 = int_3++;
			ints_0[int_13] += (int_0 * int_4) >> 6;
			int_4 += int_6;
			int_13 = int_3++;
			ints_0[int_13] += (int_0 * int_5) >> 6;
			int_5 += int_7;
		}

		if ((int_11 == 0) || ((int_8 = (int_3 >> 1) + (((int_10 - int_2) + int_11) / int_11)) > int_9)) {
			int_8 = int_9;
		}

		int_8 <<= 1;

		for (int_1 = int_12; int_3 < int_8; int_2 += int_11) {
			int_0 = (int_1 << 8) + ((int_2 & 0xFF) * (bytes_0[int_2 >> 8] - int_1));
			int_13 = int_3++;
			ints_0[int_13] += (int_0 * int_4) >> 6;
			int_4 += int_6;
			int_13 = int_3++;
			ints_0[int_13] += (int_0 * int_5) >> 6;
			int_5 += int_7;
		}

		int_3 >>= 1;
		aclass5_sub2_0.anInt453 += int_3 * aclass5_sub2_0.anInt462;
		aclass5_sub2_0.anInt458 = int_4;
		aclass5_sub2_0.anInt460 = int_5;
		aclass5_sub2_0.anInt457 = int_2;
		return int_3;
	}

	static int method746(final int int_0, final byte[] bytes_0, final int[] ints_0, int int_1, int int_2, int int_3,
			int int_4, int int_5, int int_6, int int_7, final int int_8, int int_9, final AClass5_Sub2 aclass5_sub2_0) {
		int_1 >>= 8;
		int_9 >>= 8;
		int_3 <<= 2;
		int_4 <<= 2;
		int_5 <<= 2;
		int_6 <<= 2;
		if ((int_7 = (int_9 + int_2) - int_1) > int_8) {
			int_7 = int_8;
		}

		aclass5_sub2_0.anInt453 += (int_7 - int_2) * aclass5_sub2_0.anInt462;
		int_2 <<= 1;
		int_7 <<= 1;

		byte byte_0;
		int int_10;
		for (int_7 -= 6; int_2 < int_7; int_4 += int_6) {
			byte_0 = bytes_0[int_1++];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
			int_4 += int_6;
			byte_0 = bytes_0[int_1++];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
			int_4 += int_6;
			byte_0 = bytes_0[int_1++];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
			int_4 += int_6;
			byte_0 = bytes_0[int_1++];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
		}

		for (int_7 += 6; int_2 < int_7; int_4 += int_6) {
			byte_0 = bytes_0[int_1++];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
		}

		aclass5_sub2_0.anInt458 = int_3 >> 2;
		aclass5_sub2_0.anInt460 = int_4 >> 2;
		aclass5_sub2_0.anInt457 = int_1 << 8;
		return int_2 >> 1;
	}

	static int method747(final int int_0, final byte[] bytes_0, final int[] ints_0, int int_1, int int_2, int int_3,
			int int_4, int int_5, int int_6, int int_7, final int int_8, int int_9, final AClass5_Sub2 aclass5_sub2_0) {
		int_1 >>= 8;
		int_9 >>= 8;
		int_3 <<= 2;
		int_4 <<= 2;
		int_5 <<= 2;
		int_6 <<= 2;
		if ((int_7 = (int_1 + int_2) - (int_9 - 1)) > int_8) {
			int_7 = int_8;
		}

		aclass5_sub2_0.anInt453 += (int_7 - int_2) * aclass5_sub2_0.anInt462;
		int_2 <<= 1;
		int_7 <<= 1;

		byte byte_0;
		int int_10;
		for (int_7 -= 6; int_2 < int_7; int_4 += int_6) {
			byte_0 = bytes_0[int_1--];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
			int_4 += int_6;
			byte_0 = bytes_0[int_1--];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
			int_4 += int_6;
			byte_0 = bytes_0[int_1--];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
			int_4 += int_6;
			byte_0 = bytes_0[int_1--];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
		}

		for (int_7 += 6; int_2 < int_7; int_4 += int_6) {
			byte_0 = bytes_0[int_1--];
			int_10 = int_2++;
			ints_0[int_10] += int_3 * byte_0;
			int_3 += int_5;
			int_10 = int_2++;
			ints_0[int_10] += byte_0 * int_4;
		}

		aclass5_sub2_0.anInt458 = int_3 >> 2;
		aclass5_sub2_0.anInt460 = int_4 >> 2;
		aclass5_sub2_0.anInt457 = int_1 << 8;
		return int_2 >> 1;
	}

	public static AClass5_Sub2 method748(final AClass7_Sub1 aclass7_sub1_0, final int int_0, final int int_1,
			final int int_2) {
		return (aclass7_sub1_0.aByteArray19 != null) && (aclass7_sub1_0.aByteArray19.length != 0)
				? new AClass5_Sub2(aclass7_sub1_0, int_0, int_1, int_2) : null;
	}

	public static AClass5_Sub2 method749(final AClass7_Sub1 aclass7_sub1_0, final int int_0, final int int_1) {
		return (aclass7_sub1_0.aByteArray19 != null) && (aclass7_sub1_0.aByteArray19.length != 0) ? new AClass5_Sub2(
				aclass7_sub1_0, (int) ((aclass7_sub1_0.anInt448 * 256L * int_0) / (ChatLineBuffer.sampleRate * 100)),
				int_1 << 6) : null;
	}

}
