import java.util.HashMap;
import java.util.Map;

public class Class42 {

	static int anInt97;
	static final Map chatLineMap;
	static final Class70 aClass70_1;
	static final Class79 aClass79_1;
	static Class30 aClass30_1;
	static int[] blendedSaturation;

	static {
		chatLineMap = new HashMap();
		aClass70_1 = new Class70(1024);
		aClass79_1 = new Class79();
		anInt97 = 0;
	}

	static final int getSmoothNoise(final int int_0, final int int_1, final int int_2) {
		final int int_3 = int_0 / int_2;
		final int int_4 = int_0 & (int_2 - 1);
		final int int_5 = int_1 / int_2;
		final int int_6 = int_1 & (int_2 - 1);
		final int int_7 = CombatInfo2.getSmoothNoise2D(int_3, int_5);
		final int int_8 = CombatInfo2.getSmoothNoise2D(int_3 + 1, int_5);
		final int int_9 = CombatInfo2.getSmoothNoise2D(int_3, int_5 + 1);
		final int int_10 = CombatInfo2.getSmoothNoise2D(int_3 + 1, int_5 + 1);
		final int int_11 = Class14.method192(int_7, int_8, int_4, int_2);
		final int int_12 = Class14.method192(int_9, int_10, int_4, int_2);
		return Class14.method192(int_11, int_12, int_6, int_2);
	}

}
