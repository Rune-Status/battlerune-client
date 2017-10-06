import java.util.Comparator;

final class Class29 implements Comparator {

	int method227(final Class48 class48_0, final Class48 class48_1) {
		return class48_0.aXGrandExchangeOffer1.totalQuantity < class48_1.aXGrandExchangeOffer1.totalQuantity ? -1
				: (class48_1.aXGrandExchangeOffer1.totalQuantity == class48_0.aXGrandExchangeOffer1.totalQuantity ? 0
						: 1);
	}

	@Override
	public int compare(final Object object_0, final Object object_1) {
		return method227((Class48) object_0, (Class48) object_1);
	}

	@Override
	public boolean equals(final Object object_0) {
		return super.equals(object_0);
	}

	static void method228() {
		if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyFocusListener.anIntArray29[186] = 57;
			KeyFocusListener.anIntArray29[187] = 27;
			KeyFocusListener.anIntArray29[188] = 71;
			KeyFocusListener.anIntArray29[189] = 26;
			KeyFocusListener.anIntArray29[190] = 72;
			KeyFocusListener.anIntArray29[191] = 73;
			KeyFocusListener.anIntArray29[192] = 58;
			KeyFocusListener.anIntArray29[219] = 42;
			KeyFocusListener.anIntArray29[220] = 74;
			KeyFocusListener.anIntArray29[221] = 43;
			KeyFocusListener.anIntArray29[222] = 59;
			KeyFocusListener.anIntArray29[223] = 28;
		} else {
			KeyFocusListener.anIntArray29[44] = 71;
			KeyFocusListener.anIntArray29[45] = 26;
			KeyFocusListener.anIntArray29[46] = 72;
			KeyFocusListener.anIntArray29[47] = 73;
			KeyFocusListener.anIntArray29[59] = 57;
			KeyFocusListener.anIntArray29[61] = 27;
			KeyFocusListener.anIntArray29[91] = 42;
			KeyFocusListener.anIntArray29[92] = 74;
			KeyFocusListener.anIntArray29[93] = 43;
			KeyFocusListener.anIntArray29[192] = 28;
			KeyFocusListener.anIntArray29[222] = 58;
			KeyFocusListener.anIntArray29[520] = 59;
		}
	}

}
