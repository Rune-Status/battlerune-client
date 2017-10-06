public class AClass1_Sub2 extends AClass1 {

	void method606(final Buffer buffer_0, final Buffer buffer_1) {
		int int_0 = buffer_1.readUnsignedByte();
		if (int_0 != Class5.aClass5_2.anInt24) {
			throw new IllegalStateException("");
		} else {
			anInt51 = buffer_1.readUnsignedByte();
			anInt50 = buffer_1.readUnsignedByte();
			anInt52 = buffer_1.readUnsignedShort();
			anInt53 = buffer_1.readUnsignedShort();
			anInt49 = buffer_1.readUnsignedShort();
			anInt48 = buffer_1.readUnsignedShort();
			anInt50 = Math.min(anInt50, 4);
			aShortArrayArrayArray1 = new short[1][64][64];
			aShortArrayArrayArray2 = new short[anInt50][64][64];
			aByteArrayArrayArray2 = new byte[anInt50][64][64];
			aByteArrayArrayArray3 = new byte[anInt50][64][64];
			aClass12ArrayArrayArrayArray1 = new Class12[anInt50][64][64][];
			int_0 = buffer_0.readUnsignedByte();
			if (int_0 != Class1.aClass1_1.anInt14) {
				throw new IllegalStateException("");
			} else {
				final int int_1 = buffer_0.readUnsignedByte();
				final int int_2 = buffer_0.readUnsignedByte();
				if ((int_1 == anInt49) && (int_2 == anInt48)) {
					for (int int_3 = 0; int_3 < 64; int_3++) {
						for (int int_4 = 0; int_4 < 64; int_4++) {
							method188(int_3, int_4, buffer_0);
						}
					}

				} else {
					throw new IllegalStateException("");
				}
			}
		}
	}

	@Override
	public boolean equals(final Object object_0) {
		if (!(object_0 instanceof AClass1_Sub2)) {
			return false;
		} else {
			final AClass1_Sub2 aclass1_sub2_1 = (AClass1_Sub2) object_0;
			return (anInt49 == aclass1_sub2_1.anInt49) && (anInt48 == aclass1_sub2_1.anInt48);
		}
	}

	@Override
	public int hashCode() {
		return anInt49 | (anInt48 << 8);
	}

	static final void method607(final int int_0) {
		if (Class14.loadWidget(int_0)) {
			final Widget[] widgets_0 = Widget.widgets[int_0];

			for (int int_1 = 0; int_1 < widgets_0.length; int_1++) {
				final Widget widget_0 = widgets_0[int_1];
				if (widget_0 != null) {
					widget_0.anInt301 = 0;
					widget_0.anInt300 = 0;
				}
			}

		}
	}

}
