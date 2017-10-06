import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class SourceDataSoundSystem extends AbstractSoundSystem {

	AudioFormat anAudioFormat1;
	int size;
	SourceDataLine source;
	byte[] bytes;

	@Override
	protected void method331() {
		source.flush();
	}

	@Override
	protected void close() {
		if (source != null) {
			source.close();
			source = null;
		}

	}

	@Override
	protected void create(final int int_0) throws LineUnavailableException {
		try {
			final Info dataline$info_0 = new Info(SourceDataLine.class, anAudioFormat1,
					int_0 << (AbstractSoundSystem.highMemory ? 2 : 1));
			source = (SourceDataLine) AudioSystem.getLine(dataline$info_0);
			source.open();
			source.start();
			size = int_0;
		} catch (final LineUnavailableException lineunavailableexception_0) {
			if (KeyFocusListener.method314(int_0) != 1) {
				create(RuntimeException_Sub1.method891(int_0));
			} else {
				source = null;
				throw lineunavailableexception_0;
			}
		}
	}

	@Override
	protected int size() {
		return size - (source.available() >> (AbstractSoundSystem.highMemory ? 2 : 1));
	}

	@Override
	protected void write() {
		int int_0 = 256;
		if (AbstractSoundSystem.highMemory) {
			int_0 <<= 1;
		}

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			int int_2 = super.samples[int_1];
			if (((int_2 + 8388608) & 0xFF000000) != 0) {
				int_2 = 0x7FFFFF ^ (int_2 >> 31);
			}

			bytes[int_1 * 2] = (byte) (int_2 >> 8);
			bytes[(2 * int_1) + 1] = (byte) (int_2 >> 16);
		}

		source.write(bytes, 0, int_0 << 1);
	}

	@Override
	protected void method340() {
		anAudioFormat1 = new AudioFormat(ChatLineBuffer.sampleRate, 16, AbstractSoundSystem.highMemory ? 2 : 1, true,
				false);
		bytes = new byte[256 << (AbstractSoundSystem.highMemory ? 2 : 1)];
	}

}
