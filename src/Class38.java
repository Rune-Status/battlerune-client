public class Class38 {

	static final Class38 aClass38_1;
	static final Class38 aClass38_2;
	static final Class38 aClass38_3;
	static final Class38 aClass38_4;
	static final Class38 aClass38_5;
	public static Buffer aBuffer1;
	static final Class38 aClass38_6;
	static final Class38 aClass38_7;
	static Widget aWidget5;
	final int anInt93;

	static {
		aClass38_1 = new Class38(1);
		aClass38_2 = new Class38(5);
		aClass38_3 = new Class38(3);
		aClass38_4 = new Class38(0);
		aClass38_5 = new Class38(4);
		aClass38_6 = new Class38(2);
		aClass38_7 = new Class38(6);
	}

	Class38(final int int_0) {
		anInt93 = int_0;
	}

	public static int method254(final int int_0) {
		Varbit varbit_0 = (Varbit) Varbit.varbits.get(int_0);
		Varbit varbit_1;
		if (varbit_0 != null) {
			varbit_1 = varbit_0;
		} else {
			final byte[] bytes_0 = Varbit.varbit_ref.getConfigData(14, int_0);
			varbit_0 = new Varbit();
			if (bytes_0 != null) {
				varbit_0.decode(new Buffer(bytes_0));
			}

			Varbit.varbits.put(varbit_0, int_0);
			varbit_1 = varbit_0;
		}

		final int int_1 = varbit_1.configId;
		final int int_2 = varbit_1.leastSignificantBit;
		final int int_3 = varbit_1.mostSignificantBit;
		final int int_4 = Class86.anIntArray46[int_3 - int_2];
		return (Class86.widgetSettings[int_1] >> int_2) & int_4;
	}

	static void method255(final int int_0) {
		Client.aLong24 = 0L;
		if (int_0 >= 2) {
			Client.isResized = true;
		} else {
			Client.isResized = false;
		}

		final int int_1 = Client.isResized ? 2 : 1;
		if (int_1 == 1) {
			AClass1.clientInstance.method1020(765, 503);
		} else {
			AClass1.clientInstance.method1020(7680, 2160);
		}

		if (Client.gameState >= 25) {
			Class11.method166();
		}

	}

	public static final void method256() {
		while (true) {
			final AClass4 aclass4_0 = (AClass4) Class46.aCombatInfoList1.method456();
			if (aclass4_0 == null) {
				return;
			}

			aclass4_0.method611();
		}
	}

	static void resetMapInfo() {
		Item.underlayIds = null;
		Class18.overlayIds = null;
		Class33.overlayPaths = null;
		Class18.overlayRotations = null;
		AClass4.anIntArrayArrayArray1 = null;
		Class18.aByteArrayArrayArray4 = null;
		FileRequest.anIntArrayArray14 = null;
		Class18.blendedHue = null;
		Class42.blendedSaturation = null;
		AClass4_Sub1.anIntArray82 = null;
		Class18.anIntArray8 = null;
		Varcs.anIntArray59 = null;
	}

}
