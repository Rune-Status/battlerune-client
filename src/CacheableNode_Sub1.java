public class CacheableNode_Sub1 extends CacheableNode {

	public final int[] anIntArray102;
	public final int anInt498;
	public final int anInt499;
	public final int[] anIntArray103;

	CacheableNode_Sub1(final int int_0, final int int_1, final int[] ints_0, final int[] ints_1, final int int_2) {
		anInt498 = int_0;
		anInt499 = int_1;
		anIntArray103 = ints_0;
		anIntArray102 = ints_1;
	}

	public boolean method804(final int int_0, final int int_1) {
		if ((int_1 >= 0) && (int_1 < anIntArray102.length)) {
			final int int_2 = anIntArray102[int_1];
			if ((int_0 >= int_2) && (int_0 <= (int_2 + anIntArray103[int_1]))) {
				return true;
			}
		}

		return false;
	}

	static ModIcon[] method805() {
		final ModIcon[] modicons_0 = new ModIcon[Class108.anInt218];

		for (int int_0 = 0; int_0 < Class108.anInt218; int_0++) {
			final ModIcon modicon_0 = modicons_0[int_0] = new ModIcon();
			modicon_0.width = Class108.anInt216;
			modicon_0.originalHeight = Class108.anInt217;
			modicon_0.offsetX = Class108.anIntArray56[int_0];
			modicon_0.offsetY = Class12.offsetsY[int_0];
			modicon_0.originalWidth = Class108.anIntArray57[int_0];
			modicon_0.height = Class37.anIntArray16[int_0];
			modicon_0.palette = Class108.anIntArray58;
			modicon_0.pixels = Class66.spritePixels[int_0];
		}

		Class32.method232();
		return modicons_0;
	}

}
