public class Spotanim extends CacheableNode {

	public static NodeCache aNodeCache6;
	public static NodeCache spotanims;
	static IndexDataBase anIndexDataBase15;
	static IndexDataBase anIndexDataBase16;
	protected static String aString27;
	static int[] anIntArray83;
	int anInt440;
	public int anInt441;
	int anInt442;
	int anInt443;
	int anInt444;
	int anInt445;
	int anInt446;
	int anInt447;
	short[] aShortArray5;
	short[] aShortArray6;
	short[] aShortArray7;
	short[] aShortArray8;

	static {
		spotanims = new NodeCache(64);
		aNodeCache6 = new NodeCache(30);
	}

	Spotanim() {
		anInt441 = -1;
		anInt443 = 128;
		anInt444 = 128;
		anInt445 = 0;
		anInt446 = 0;
		anInt447 = 0;
	}

	void method707(final Buffer buffer_0, final int int_0) {
		if (int_0 == 1) {
			anInt442 = buffer_0.readUnsignedShort();
		} else {
			if (int_0 == 2) {
				anInt441 = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 4) {
				anInt443 = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 5) {
				anInt444 = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 6) {
				anInt445 = buffer_0.readUnsignedShort();
				return;
			}

			if (int_0 == 7) {
				anInt446 = buffer_0.readUnsignedByte();
				return;
			}

			if (int_0 == 8) {
				anInt447 = buffer_0.readUnsignedByte();
				return;
			}

			int int_1;
			int int_2;
			if (int_0 == 40) {
				int_1 = buffer_0.readUnsignedByte();
				aShortArray5 = new short[int_1];
				aShortArray7 = new short[int_1];

				for (int_2 = 0; int_2 < int_1; int_2++) {
					aShortArray5[int_2] = (short) buffer_0.readUnsignedShort();
					aShortArray7[int_2] = (short) buffer_0.readUnsignedShort();
				}

				return;
			}

			if (int_0 == 41) {
				int_1 = buffer_0.readUnsignedByte();
				aShortArray6 = new short[int_1];
				aShortArray8 = new short[int_1];

				for (int_2 = 0; int_2 < int_1; int_2++) {
					aShortArray6[int_2] = (short) buffer_0.readUnsignedShort();
					aShortArray8[int_2] = (short) buffer_0.readUnsignedShort();
				}
			}
		}

	}

	public final Model method708(final int int_0) {
		Model model_0 = (Model) aNodeCache6.get(anInt440);
		if (model_0 == null) {
			final ModelData modeldata_0 = ModelData.method995(anIndexDataBase15, anInt442, 0);
			if (modeldata_0 == null) {
				return null;
			}

			int int_1;
			if (aShortArray5 != null) {
				for (int_1 = 0; int_1 < aShortArray5.length; int_1++) {
					modeldata_0.recolor(aShortArray5[int_1], aShortArray7[int_1]);
				}
			}

			if (aShortArray6 != null) {
				for (int_1 = 0; int_1 < aShortArray6.length; int_1++) {
					modeldata_0.method985(aShortArray6[int_1], aShortArray8[int_1]);
				}
			}

			model_0 = modeldata_0.light(anInt446 + 64, anInt447 + 850, -30, -50, -30);
			aNodeCache6.put(model_0, anInt440);
		}

		Model model_1;
		if ((anInt441 != -1) && (int_0 != -1)) {
			model_1 = Class54.getAnimation(anInt441).method850(model_0, int_0);
		} else {
			model_1 = model_0.method950(true);
		}

		if ((anInt443 != 128) || (anInt444 != 128)) {
			model_1.method955(anInt443, anInt444, anInt443);
		}

		if (anInt445 != 0) {
			if (anInt445 == 90) {
				model_1.method956();
			}

			if (anInt445 == 180) {
				model_1.method956();
				model_1.method956();
			}

			if (anInt445 == 270) {
				model_1.method956();
				model_1.method956();
				model_1.method956();
			}
		}

		return model_1;
	}

	void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method707(buffer_0, int_0);
		}
	}

}
