import java.io.IOException;

public class Class101 {

	public static final Class101 aClass101_4;
	public static final Class101 aClass101_5;
	public static final Class101 aClass101_6;
	public static final Class101 aClass101_7;
	public static final Class101 aClass101_8;
	static RSSocket aRSSocket2;
	public static final Class101 aClass101_9;
	final String aString11;
	String aString12;

	static {
		aClass101_5 = new Class101("PLAIN11", "p11_full");
		aClass101_8 = new Class101("PLAIN12", "p12_full");
		aClass101_9 = new Class101("BOLD12", "b12_full");
		aClass101_4 = new Class101("VERDANA11", "verdana_11pt_regular");
		aClass101_6 = new Class101("VERDANA13", "verdana_13pt_regular");
		aClass101_7 = new Class101("VERDANA15", "verdana_15pt_regular");
	}

	Class101(final String string_0, final String string_1) {
		aString11 = string_0;
		aString12 = string_1;
	}

	static Preferences method497() {
		FileOnDisk fileondisk_0 = null;
		Preferences preferences_0 = new Preferences();

		try {
			fileondisk_0 = RuntimeException_Sub1.getPreferencesFile("", Varcs.anEnum6_1.aString19, false);
			final byte[] bytes_0 = new byte[(int) fileondisk_0.length()];

			int int_1;
			for (int int_0 = 0; int_0 < bytes_0.length; int_0 += int_1) {
				int_1 = fileondisk_0.read(bytes_0, int_0, bytes_0.length - int_0);
				if (int_1 == -1) {
					throw new IOException();
				}
			}

			preferences_0 = new Preferences(new Buffer(bytes_0));
		} catch (final Exception exception_0) {
			;
		}

		try {
			if (fileondisk_0 != null) {
				fileondisk_0.close();
			}
		} catch (final Exception exception_1) {
			;
		}

		return preferences_0;
	}

	public static Class101[] method498() {
		return new Class101[] { aClass101_7, aClass101_8, aClass101_5, aClass101_9, aClass101_4, aClass101_6 };
	}

	static final void method499(final Actor actor_0) {
		if ((actor_0.anInt566 == Client.gameCycle) || (actor_0.animation == -1) || (actor_0.actionAnimationDisable != 0)
				|| ((actor_0.anInt559
						+ 1) > Class54.getAnimation(actor_0.animation).frameLenghts[actor_0.actionFrame])) {
			final int int_0 = actor_0.anInt566 - actor_0.anInt565;
			final int int_1 = Client.gameCycle - actor_0.anInt565;
			final int int_2 = (actor_0.anInt567 * 128) + (actor_0.anInt542 * 64);
			final int int_3 = (actor_0.anInt568 * 128) + (actor_0.anInt542 * 64);
			final int int_4 = (actor_0.anInt569 * 128) + (actor_0.anInt542 * 64);
			final int int_5 = (actor_0.anInt570 * 128) + (actor_0.anInt542 * 64);
			actor_0.anInt547 = ((int_1 * int_4) + (int_2 * (int_0 - int_1))) / int_0;
			actor_0.anInt550 = ((int_5 * int_1) + (int_3 * (int_0 - int_1))) / int_0;
		}

		actor_0.anInt541 = 0;
		actor_0.orientation = actor_0.anInt571;
		actor_0.angle = actor_0.orientation;
	}

}
