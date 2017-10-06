public class Class84 {

	public static int ilog(int int_0) {
		int int_1 = 0;
		if ((int_0 < 0) || (int_0 >= 65536)) {
			int_0 >>>= 16;
			int_1 += 16;
		}

		if (int_0 >= 256) {
			int_0 >>>= 8;
			int_1 += 8;
		}

		if (int_0 >= 16) {
			int_0 >>>= 4;
			int_1 += 4;
		}

		if (int_0 >= 4) {
			int_0 >>>= 2;
			int_1 += 2;
		}

		if (int_0 >= 1) {
			int_0 >>>= 1;
			++int_1;
		}

		return int_0 + int_1;
	}

}
