import java.util.Calendar;
import java.util.TimeZone;

public class Class68 {

	public static final String[][] aStringArrayArray1;
	public static final String[] aStringArray3;
	public static Calendar aCalendar2;
	static IndexData indexTrack1;

	static {
		aStringArrayArray1 = new String[][] {
				{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
				{ "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };
		aStringArray3 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	static final void method403(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4,
			final int int_5) {
		final int int_6 = (2048 - int_3) & 0x7FF;
		final int int_7 = (2048 - int_4) & 0x7FF;
		int int_8 = 0;
		int int_9 = 0;
		int int_10 = int_5;
		int int_11;
		int int_12;
		int int_13;
		if (int_6 != 0) {
			int_11 = Graphics3D.SINE[int_6];
			int_12 = Graphics3D.COSINE[int_6];
			int_13 = ((int_12 * int_9) - (int_5 * int_11)) >> 16;
			int_10 = ((int_11 * int_9) + (int_12 * int_5)) >> 16;
			int_9 = int_13;
		}

		if (int_7 != 0) {
			int_11 = Graphics3D.SINE[int_7];
			int_12 = Graphics3D.COSINE[int_7];
			int_13 = ((int_11 * int_10) + (int_12 * int_8)) >> 16;
			int_10 = ((int_12 * int_10) - (int_11 * int_8)) >> 16;
			int_8 = int_13;
		}

		Class13.cameraX = int_0 - int_8;
		XItemContainer.cameraZ = int_1 - int_9;
		Class46.cameraY = int_2 - int_10;
		AClass4_Sub2.cameraPitch = int_3;
		Friend.cameraYaw = int_4;
	}

}
