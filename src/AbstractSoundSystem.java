public class AbstractSoundSystem {

	public static boolean highMemory;
	AClass5[] anAClass5Array1;
	protected int[] samples;
	boolean aBool15;
	AClass5 anAClass5_1;
	int anInt134;
	int offset;
	int anInt135;
	AClass5[] anAClass5Array2;
	long aLong5;
	long aLong6;
	int anInt136;
	int anInt137;
	int anInt138;
	int anInt139;
	int anInt140;
	long aLong7;

	protected AbstractSoundSystem() {
		anInt135 = 32;
		aLong6 = Class6.currentTimeMs();
		aLong5 = 0L;
		anInt136 = 0;
		anInt138 = 0;
		anInt137 = 0;
		aLong7 = 0L;
		aBool15 = true;
		anInt134 = 0;
		anAClass5Array2 = new AClass5[8];
		anAClass5Array1 = new AClass5[8];
	}

	protected void method331() throws Exception {
	}

	protected void close() {
	}

	public final synchronized void method332() {
		if (samples != null) {
			long long_0 = Class6.currentTimeMs();

			try {
				if (aLong5 != 0L) {
					if (long_0 < aLong5) {
						return;
					}

					create(offset);
					aLong5 = 0L;
					aBool15 = true;
				}

				int int_0 = size();
				if ((anInt137 - int_0) > anInt136) {
					anInt136 = anInt137 - int_0;
				}

				int int_1 = anInt139 + anInt140;
				if ((int_1 + 256) > 16384) {
					int_1 = 16128;
				}

				if ((int_1 + 256) > offset) {
					offset += 1024;
					if (offset > 16384) {
						offset = 16384;
					}

					close();
					create(offset);
					int_0 = 0;
					aBool15 = true;
					if ((int_1 + 256) > offset) {
						int_1 = offset - 256;
						anInt140 = int_1 - anInt139;
					}
				}

				while (int_0 < int_1) {
					method338(samples, 256);
					write();
					int_0 += 256;
				}

				if (long_0 > aLong7) {
					if (!aBool15) {
						if ((anInt136 == 0) && (anInt138 == 0)) {
							close();
							aLong5 = long_0 + 2000L;
							return;
						}

						anInt140 = Math.min(anInt138, anInt136);
						anInt138 = anInt136;
					} else {
						aBool15 = false;
					}

					anInt136 = 0;
					aLong7 = 2000L + long_0;
				}

				anInt137 = int_0;
			} catch (final Exception exception_0) {
				close();
				aLong5 = 2000L + long_0;
			}

			try {
				if (long_0 > (500000L + aLong6)) {
					long_0 = aLong6;
				}

				while (long_0 > (aLong6 + 5000L)) {
					method334(256);
					aLong6 += 256000 / ChatLineBuffer.sampleRate;
				}

			} catch (final Exception exception_1) {
				aLong6 = long_0;
			}
		}
	}

	protected void create(final int int_0) throws Exception {
	}

	protected int size() throws Exception {
		return offset;
	}

	public final synchronized void method333() {
		aBool15 = true;

		try {
			method331();
		} catch (final Exception exception_0) {
			close();
			aLong5 = Class6.currentTimeMs() + 2000L;
		}
	}

	final void method334(final int int_0) {
		anInt134 -= int_0;
		if (anInt134 < 0) {
			anInt134 = 0;
		}

		if (anAClass5_1 != null) {
			anAClass5_1.method626(int_0);
		}

	}

	final void method335(final AClass5 aclass5_0, final int int_0) {
		final int int_1 = int_0 >> 5;
		final AClass5 aclass5_1 = anAClass5Array1[int_1];
		if (aclass5_1 == null) {
			anAClass5Array2[int_1] = aclass5_0;
		} else {
			aclass5_1.anAClass5_2 = aclass5_0;
		}

		anAClass5Array1[int_1] = aclass5_0;
		aclass5_0.anInt358 = int_0;
	}

	public final synchronized void method336() {
		if (Class43.task != null) {
			boolean bool_0 = true;

			for (int int_0 = 0; int_0 < 2; int_0++) {
				if (this == Class43.task.systems[int_0]) {
					Class43.task.systems[int_0] = null;
				}

				if (Class43.task.systems[int_0] != null) {
					bool_0 = false;
				}
			}

			if (bool_0) {
				Class95.aScheduledExecutorService1.shutdownNow();
				Class95.aScheduledExecutorService1 = null;
				Class43.task = null;
			}
		}

		close();
		samples = null;
	}

	public final void method337() {
		aBool15 = true;
	}

	final void method338(final int[] ints_0, final int int_0) {
		int int_1 = int_0;
		if (highMemory) {
			int_1 = int_0 << 1;
		}

		Class78.method448(ints_0, 0, int_1);
		anInt134 -= int_0;
		if ((anAClass5_1 != null) && (anInt134 <= 0)) {
			anInt134 += ChatLineBuffer.sampleRate >> 4;
			Class18.method203(anAClass5_1);
			method335(anAClass5_1, anAClass5_1.method630());
			int int_2 = 0;
			int int_3 = 255;

			int int_4;
			AClass5 aclass5_1;
			label104: for (int_4 = 7; int_3 != 0; --int_4) {
				int int_5;
				int int_6;
				if (int_4 < 0) {
					int_5 = int_4 & 0x3;
					int_6 = -(int_4 >> 2);
				} else {
					int_5 = int_4;
					int_6 = 0;
				}

				for (int int_7 = (int_3 >>> int_5) & 0x11111111; int_7 != 0; int_7 >>>= 4) {
					if ((int_7 & 0x1) != 0) {
						int_3 &= ~(1 << int_5);
						aclass5_1 = null;
						AClass5 aclass5_2 = anAClass5Array2[int_5];

						label98: while (true) {
							while (true) {
								if (aclass5_2 == null) {
									break label98;
								}

								final AClass7 aclass7_0 = aclass5_2.anAClass7_1;
								if ((aclass7_0 != null) && (aclass7_0.anInt360 > int_6)) {
									int_3 |= 1 << int_5;
									aclass5_1 = aclass5_2;
									aclass5_2 = aclass5_2.anAClass5_2;
								} else {
									aclass5_2.aBool45 = true;
									final int int_8 = aclass5_2.method631();
									int_2 += int_8;
									if (aclass7_0 != null) {
										aclass7_0.anInt360 += int_8;
									}

									if (int_2 >= anInt135) {
										break label104;
									}

									AClass5 aclass5_3 = aclass5_2.method629();
									if (aclass5_3 != null) {
										for (final int int_9 = aclass5_2.anInt358; aclass5_3 != null; aclass5_3 = aclass5_2
												.method628()) {
											method335(aclass5_3, (int_9 * aclass5_3.method630()) >> 8);
										}
									}

									final AClass5 aclass5_4 = aclass5_2.anAClass5_2;
									aclass5_2.anAClass5_2 = null;
									if (aclass5_1 == null) {
										anAClass5Array2[int_5] = aclass5_4;
									} else {
										aclass5_1.anAClass5_2 = aclass5_4;
									}

									if (aclass5_4 == null) {
										anAClass5Array1[int_5] = aclass5_1;
									}

									aclass5_2 = aclass5_4;
								}
							}
						}
					}

					int_5 += 4;
					++int_6;
				}
			}

			for (int_4 = 0; int_4 < 8; int_4++) {
				AClass5 aclass5_0 = anAClass5Array2[int_4];
				final AClass5[] aclass5s_0 = anAClass5Array2;
				anAClass5Array1[int_4] = null;

				for (aclass5s_0[int_4] = null; aclass5_0 != null; aclass5_0 = aclass5_1) {
					aclass5_1 = aclass5_0.anAClass5_2;
					aclass5_0.anAClass5_2 = null;
				}
			}
		}

		if (anInt134 < 0) {
			anInt134 = 0;
		}

		if (anAClass5_1 != null) {
			anAClass5_1.method625(ints_0, 0, int_0);
		}

		aLong6 = Class6.currentTimeMs();
	}

	protected void write() throws Exception {
	}

	public final synchronized void method339(final AClass5 aclass5_0) {
		anAClass5_1 = aclass5_0;
	}

	protected void method340() throws Exception {
	}

	static final boolean method341(final Widget widget_0) {
		if (widget_0.tableActions == null) {
			return false;
		} else {
			for (int int_0 = 0; int_0 < widget_0.tableActions.length; int_0++) {
				final int int_1 = Class41.method262(widget_0, int_0);
				final int int_2 = widget_0.anIntArray69[int_0];
				if (widget_0.tableActions[int_0] == 2) {
					if (int_1 >= int_2) {
						return false;
					}
				} else if (widget_0.tableActions[int_0] == 3) {
					if (int_1 <= int_2) {
						return false;
					}
				} else if (widget_0.tableActions[int_0] == 4) {
					if (int_1 == int_2) {
						return false;
					}
				} else if (int_1 != int_2) {
					return false;
				}
			}

			return true;
		}
	}

	static MessageNode method342(final int int_0) {
		return (MessageNode) Class42.aClass70_1.method419(int_0);
	}

	public static boolean method343(final int int_0) {
		return ((int_0 >> 31) & 0x1) != 0;
	}

}
