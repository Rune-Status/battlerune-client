public class Class3 {

	static byte[][] aByteArrayArray1;
	final Class14 aClass14_1;
	public final int anInt19;
	int anInt20;
	public final Coordinates aCoordinates1;
	public final Coordinates aCoordinates2;
	final int anInt21;
	int anInt22;
	final int anInt23;

	Class3(final int int_0, final Coordinates coordinates_0, final Coordinates coordinates_1, final Class14 class14_0) {
		anInt19 = int_0;
		aCoordinates1 = coordinates_0;
		aCoordinates2 = coordinates_1;
		aClass14_1 = class14_0;
		final Area area_0 = Class17.anAreaArray1[anInt19];
		final SpritePixels spritepixels_0 = area_0.method755(false);
		if (spritepixels_0 != null) {
			anInt21 = spritepixels_0.width;
			anInt23 = spritepixels_0.height;
		} else {
			anInt21 = 0;
			anInt23 = 0;
		}
	}

	boolean method82(final int int_0, final int int_1) {
		final Area area_0 = Class17.anAreaArray1[anInt19];
		switch (area_0.anEnum7_4.anInt410) {
		case 0:
			if ((int_0 <= (anInt20 - anInt21)) || (int_0 > anInt20)) {
				return false;
			}
			break;
		case 1:
			if ((int_0 < (anInt20 - (anInt21 / 2))) || (int_0 > ((anInt21 / 2) + anInt20))) {
				return false;
			}
			break;
		case 2:
			if ((int_0 < anInt20) || (int_0 >= (anInt21 + anInt20))) {
				return false;
			}
		}

		switch (area_0.anEnum8_4.anInt411) {
		case 0:
			if ((int_1 < anInt22) || (int_1 >= (anInt22 + anInt23))) {
				return false;
			}
			break;
		case 1:
			if ((int_1 >= (anInt22 - (anInt23 / 2))) && (int_1 <= ((anInt23 / 2) + anInt22))) {
				break;
			}

			return false;
		case 2:
			if ((int_1 <= (anInt22 - anInt23)) || (int_1 > anInt22)) {
				return false;
			}
		}

		return true;
	}

	boolean method83(final int int_0, final int int_1) {
		return aClass14_1 == null ? false
				: ((int_0 >= (anInt20 - (aClass14_1.anInt56 / 2))) && (int_0 <= ((aClass14_1.anInt56 / 2) + anInt20))
						? (int_1 >= anInt22) && (int_1 <= (aClass14_1.anInt57 + anInt22)) : false);
	}

	boolean method84(final int int_0, final int int_1) {
		return method82(int_0, int_1) ? true : method83(int_0, int_1);
	}

	static final void method85(final int int_0, final int int_1, final int int_2, final int int_3) {
		for (int int_4 = 0; int_4 < Client.anInt647; int_4++) {
			if (((Client.widgetBoundsWidth[int_4] + Client.widgetPositionX[int_4]) > int_0)
					&& (Client.widgetPositionX[int_4] < (int_0 + int_2))
					&& ((Client.widgetBoundsHeight[int_4] + Client.widgetPositionY[int_4]) > int_1)
					&& (Client.widgetPositionY[int_4] < (int_3 + int_1))) {
				Client.aBoolArray8[int_4] = true;
			}
		}

	}

	static RenderOverview method86() {
		return Class49.renderOverview;
	}

}
