public class Class86 {

	public static int[] anIntArray46;
	public static int[] settings;
	public static int[] widgetSettings;

	static {
		anIntArray46 = new int[32];
		int int_0 = 2;

		for (int int_1 = 0; int_1 < 32; int_1++) {
			anIntArray46[int_1] = int_0 - 1;
			int_0 += int_0;
		}

		settings = new int[2000];
		widgetSettings = new int[2000];
	}

}
