public class NanoTimer extends Timer {

	long nanoTime;

	public NanoTimer() {
		nanoTime = System.nanoTime();
	}

	@Override
	public int method556(final int int_0, final int int_1) {
		final long long_0 = 1000000L * int_1;
		long long_1 = nanoTime - System.nanoTime();
		if (long_1 < long_0) {
			long_1 = long_0;
		}

		Class14.method189(long_1 / 1000000L);
		final long long_2 = System.nanoTime();

		int int_2;
		for (int_2 = 0; (int_2 < 10) && ((int_2 < 1) || (nanoTime < long_2)); nanoTime += int_0 * 1000000L) {
			++int_2;
		}

		if (nanoTime < long_2) {
			nanoTime = long_2;
		}

		return int_2;
	}

	@Override
	public void method557() {
		nanoTime = System.nanoTime();
	}

}
