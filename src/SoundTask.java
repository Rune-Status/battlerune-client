public class SoundTask implements Runnable {

	volatile AbstractSoundSystem[] systems;

	SoundTask() {
		systems = new AbstractSoundSystem[2];
	}

	@Override
	public void run() {
		try {
			for (int int_0 = 0; int_0 < 2; int_0++) {
				final AbstractSoundSystem abstractsoundsystem_0 = systems[int_0];
				if (abstractsoundsystem_0 != null) {
					abstractsoundsystem_0.method332();
				}
			}

		} catch (final Exception exception_0) {
			Class17.method201((String) null, exception_0);
		}
	}

	static final boolean method313(final Widget widget_0) {
		final int int_0 = widget_0.contentType;
		if (int_0 == 205) {
			Client.anInt646 = 250;
			return true;
		} else {
			int int_1;
			int int_2;
			if ((int_0 >= 300) && (int_0 <= 313)) {
				int_1 = (int_0 - 300) / 2;
				int_2 = int_0 & 0x1;
				Client.aPlayerComposition1.method484(int_1, int_2 == 1);
			}

			if ((int_0 >= 314) && (int_0 <= 323)) {
				int_1 = (int_0 - 314) / 2;
				int_2 = int_0 & 0x1;
				Client.aPlayerComposition1.method485(int_1, int_2 == 1);
			}

			if (int_0 == 324) {
				Client.aPlayerComposition1.method486(false);
			}

			if (int_0 == 325) {
				Client.aPlayerComposition1.method486(true);
			}

			if (int_0 == 326) {
				Client.secretPacketBuffer1.putOpcode(60);
				Client.aPlayerComposition1.method487(Client.secretPacketBuffer1);
				return true;
			} else {
				return false;
			}
		}
	}

}
