public enum Enum2 implements RSEnum {

	anEnum2_1(0), anEnum2_2(1), anEnum2_3(2), anEnum2_4(3);

	final int anInt336;
	public static short[][] aShortArrayArray3;

	Enum2(final int int_1) {
		anInt336 = int_1;
	}

	@Override
	public int rsOrdinal() {
		return anInt336;
	}

	static Frames getFrames(final int int_0) {
		final Frames frames_0 = (Frames) Sequence.skeletons.get(int_0);
		if (frames_0 != null) {
			return frames_0;
		} else {
			final IndexDataBase indexdatabase_0 = Sequence.skel_ref;
			final IndexDataBase indexdatabase_1 = Class6.skin_ref;
			boolean bool_0 = true;
			final int[] ints_0 = indexdatabase_0.getChilds(int_0);

			for (int int_1 = 0; int_1 < ints_0.length; int_1++) {
				final byte[] bytes_0 = indexdatabase_0.getChild(int_0, ints_0[int_1]);
				if (bytes_0 == null) {
					bool_0 = false;
				} else {
					final int int_2 = ((bytes_0[0] & 0xFF) << 8) | (bytes_0[1] & 0xFF);
					final byte[] bytes_1 = indexdatabase_1.getChild(int_2, 0);
					if (bytes_1 == null) {
						bool_0 = false;
					}
				}
			}

			Frames frames_1;
			if (!bool_0) {
				frames_1 = null;
			} else {
				try {
					frames_1 = new Frames(indexdatabase_0, indexdatabase_1, int_0, false);
				} catch (final Exception exception_0) {
					frames_1 = null;
				}
			}

			if (frames_1 != null) {
				Sequence.skeletons.put(frames_1, int_0);
			}

			return frames_1;
		}
	}

	static final boolean method603(final int int_0, int int_1) {
		final ObjectComposition objectcomposition_0 = PlayerComposition.getObjectDefinition(int_0);
		if (int_1 == 11) {
			int_1 = 10;
		}

		if ((int_1 >= 5) && (int_1 <= 8)) {
			int_1 = 4;
		}

		return objectcomposition_0.method799(int_1);
	}

	public static String method604(final CharSequence charsequence_0) {
		final int int_0 = charsequence_0.length();
		final StringBuilder stringbuilder_0 = new StringBuilder(int_0);

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			final char char_0 = charsequence_0.charAt(int_1);
			if (((char_0 < 97) || (char_0 > 122)) && ((char_0 < 65) || (char_0 > 90))
					&& ((char_0 < 48) || (char_0 > 57)) && (char_0 != 46) && (char_0 != 45) && (char_0 != 42)
					&& (char_0 != 95)) {
				if (char_0 == 32) {
					stringbuilder_0.append('\u002b');
				} else {
					final byte byte_0 = Class58.method380(char_0);
					stringbuilder_0.append('\u0025');
					int int_2 = (byte_0 >> 4) & 0xF;
					if (int_2 >= 10) {
						stringbuilder_0.append((char) (int_2 + 55));
					} else {
						stringbuilder_0.append((char) (int_2 + 48));
					}

					int_2 = byte_0 & 0xF;
					if (int_2 >= 10) {
						stringbuilder_0.append((char) (int_2 + 55));
					} else {
						stringbuilder_0.append((char) (int_2 + 48));
					}
				}
			} else {
				stringbuilder_0.append(char_0);
			}
		}

		return stringbuilder_0.toString();
	}

	static final void method605(final Widget widget_0, final int int_0, final int int_1) {
		if (Client.aWidget9 == null) {
			if (!Client.isMenuOpen) {
				if ((widget_0 != null) && (Class30.method230(widget_0) != null)) {
					Client.aWidget9 = widget_0;
					Client.aWidget10 = Class30.method230(widget_0);
					Client.anInt656 = int_0;
					Client.anInt657 = int_1;
					Class14.anInt54 = 0;
					Client.aBool84 = false;
					final int int_2 = Class56.method347();
					if (int_2 != -1) {
						Class42.aClass30_1 = new Class30();
						Class42.aClass30_1.anInt87 = Client.menuActionParams0[int_2];
						Class42.aClass30_1.anInt88 = Client.menuActionParams1[int_2];
						Class42.aClass30_1.anInt89 = Client.menuTypes[int_2];
						Class42.aClass30_1.anInt90 = Client.menuIdentifiers[int_2];
						Class42.aClass30_1.aString5 = Client.menuOptions[int_2];
					}

				}
			}
		}
	}

}
