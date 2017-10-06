public class Class9 {

	public static IndexDataBase anIndexDataBase2;
	public int anInt32;
	public Coordinates aCoordinates3;
	public Coordinates aCoordinates4;

	public Class9(final int int_0, final Coordinates coordinates_0, final Coordinates coordinates_1) {
		anInt32 = int_0;
		aCoordinates3 = coordinates_0;
		aCoordinates4 = coordinates_1;
	}

	static final void groundItemSpawned(final int int_0, final int int_1) {
		final Deque deque_0 = Client.groundItemDeque[AClass1_Sub1.plane][int_0][int_1];
		if (deque_0 == null) {
			Class8.region.method354(AClass1_Sub1.plane, int_0, int_1);
		} else {
			long long_0 = -99999999L;
			Item item_0 = null;

			Item item_1;
			for (item_1 = (Item) deque_0.getFront(); item_1 != null; item_1 = (Item) deque_0.getNext()) {
				final ItemComposition itemcomposition_0 = Class45.getItemDefinition(item_1.anInt584);
				long long_1 = itemcomposition_0.price;
				if (itemcomposition_0.isStackable == 1) {
					long_1 *= item_1.quantity + 1;
				}

				if (long_1 > long_0) {
					long_0 = long_1;
					item_0 = item_1;
				}
			}

			if (item_0 == null) {
				Class8.region.method354(AClass1_Sub1.plane, int_0, int_1);
			} else {
				deque_0.addTail(item_0);
				Item item_3 = null;
				Item item_2 = null;

				for (item_1 = (Item) deque_0.getFront(); item_1 != null; item_1 = (Item) deque_0.getNext()) {
					if (item_1.anInt584 != item_0.anInt584) {
						if (item_3 == null) {
							item_3 = item_1;
						}

						if ((item_3.anInt584 != item_1.anInt584) && (item_2 == null)) {
							item_2 = item_1;
						}
					}
				}

				final int int_2 = int_0 + (int_1 << 7) + 1610612736;
				Class8.region.addItemPile(AClass1_Sub1.plane, int_0, int_1,
						Actor.getTileHeight((int_0 * 128) + 64, (int_1 * 128) + 64, AClass1_Sub1.plane), item_0, int_2,
						item_3, item_2);
			}
		}
	}

	static int method121(final int int_0, final Script script_0, final boolean bool_0) {
		int int_1;
		int int_2;
		if (int_0 == 100) {
			WorldMapType2.intStackSize -= 3;
			int_1 = Class45.intStack[WorldMapType2.intStackSize];
			int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
			final int int_3 = Class45.intStack[WorldMapType2.intStackSize + 2];
			if (int_2 == 0) {
				throw new RuntimeException();
			} else {
				final Widget widget_2 = Class18.method202(int_1);
				if (widget_2.children == null) {
					widget_2.children = new Widget[int_3 + 1];
				}

				if (widget_2.children.length <= int_3) {
					final Widget[] widgets_0 = new Widget[int_3 + 1];

					for (int int_4 = 0; int_4 < widget_2.children.length; int_4++) {
						widgets_0[int_4] = widget_2.children[int_4];
					}

					widget_2.children = widgets_0;
				}

				if ((int_3 > 0) && (widget_2.children[int_3 - 1] == null)) {
					throw new RuntimeException("" + (int_3 - 1));
				} else {
					final Widget widget_4 = new Widget();
					widget_4.type = int_2;
					widget_4.parentId = widget_4.anInt289 = widget_2.anInt289;
					widget_4.index = int_3;
					widget_4.hasScript = true;
					widget_2.children[int_3] = widget_4;
					if (bool_0) {
						Class45.aWidget6 = widget_4;
					} else {
						Class38.aWidget5 = widget_4;
					}

					Class15.method196(widget_2);
					return 1;
				}
			}
		} else {
			Widget widget_0;
			if (int_0 == 101) {
				widget_0 = bool_0 ? Class45.aWidget6 : Class38.aWidget5;
				final Widget widget_1 = Class18.method202(widget_0.anInt289);
				widget_1.children[widget_0.index] = null;
				Class15.method196(widget_1);
				return 1;
			} else if (int_0 == 102) {
				widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
				widget_0.children = null;
				Class15.method196(widget_0);
				return 1;
			} else if (int_0 != 200) {
				if (int_0 == 201) {
					widget_0 = Class18.method202(Class45.intStack[--WorldMapType2.intStackSize]);
					if (widget_0 != null) {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = 1;
						if (bool_0) {
							Class45.aWidget6 = widget_0;
						} else {
							Class38.aWidget5 = widget_0;
						}
					} else {
						Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				WorldMapType2.intStackSize -= 2;
				int_1 = Class45.intStack[WorldMapType2.intStackSize];
				int_2 = Class45.intStack[WorldMapType2.intStackSize + 1];
				final Widget widget_3 = Class33.method238(int_1, int_2);
				if ((widget_3 != null) && (int_2 != -1)) {
					Class45.intStack[++WorldMapType2.intStackSize - 1] = 1;
					if (bool_0) {
						Class45.aWidget6 = widget_3;
					} else {
						Class38.aWidget5 = widget_3;
					}
				} else {
					Class45.intStack[++WorldMapType2.intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	static int method122(final int int_0, final Script script_0, final boolean bool_0) {
		if (int_0 == 5306) {
			final int[] ints_0 = Class45.intStack;
			final int int_1 = ++WorldMapType2.intStackSize - 1;
			final int int_2 = Client.isResized ? 2 : 1;
			ints_0[int_1] = int_2;
			return 1;
		} else {
			int int_3;
			if (int_0 == 5307) {
				int_3 = Class45.intStack[--WorldMapType2.intStackSize];
				if ((int_3 == 1) || (int_3 == 2)) {
					Class38.method255(int_3);
				}

				return 1;
			} else if (int_0 == 5308) {
				Class45.intStack[++WorldMapType2.intStackSize - 1] = Class28.preferences.screenType;
				return 1;
			} else if (int_0 != 5309) {
				return 2;
			} else {
				int_3 = Class45.intStack[--WorldMapType2.intStackSize];
				if ((int_3 == 1) || (int_3 == 2)) {
					Class28.preferences.screenType = int_3;
					PendingSpawn.method635();
				}

				return 1;
			}
		}
	}

	static final void characterToScreen(final Actor actor_0, final int int_0) {
		Class15.method197(actor_0.anInt547, actor_0.anInt550, int_0);
	}

	public static int method123(final boolean bool_0, final boolean bool_1) {
		final byte byte_0 = 0;
		final int int_0 = Class93.anInt207 + Class93.anInt206 + byte_0;
		return int_0;
	}

}
