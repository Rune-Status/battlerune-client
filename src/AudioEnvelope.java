public class AudioEnvelope {

	int ticks;
	int max;
	int segments;
	int form;
	int phaseIndex;
	int[] durations;
	int[] phases;
	int amplitude;
	int step;
	int start;
	int end;

	AudioEnvelope() {
		segments = 2;
		durations = new int[2];
		phases = new int[2];
		durations[0] = 0;
		durations[1] = 65535;
		phases[0] = 0;
		phases[1] = 65535;
	}

	final void decode(final Buffer buffer_0) {
		form = buffer_0.readUnsignedByte();
		start = buffer_0.readInt();
		end = buffer_0.readInt();
		decodeSegments(buffer_0);
	}

	final void reset() {
		ticks = 0;
		phaseIndex = 0;
		step = 0;
		amplitude = 0;
		max = 0;
	}

	final void decodeSegments(final Buffer buffer_0) {
		segments = buffer_0.readUnsignedByte();
		durations = new int[segments];
		phases = new int[segments];

		for (int int_0 = 0; int_0 < segments; int_0++) {
			durations[int_0] = buffer_0.readUnsignedShort();
			phases[int_0] = buffer_0.readUnsignedShort();
		}

	}

	final int step(final int int_0) {
		if (max >= ticks) {
			amplitude = phases[phaseIndex++] << 15;
			if (phaseIndex >= segments) {
				phaseIndex = segments - 1;
			}

			ticks = (int) ((durations[phaseIndex] / 65536.0D) * int_0);
			if (ticks > max) {
				step = ((phases[phaseIndex] << 15) - amplitude) / (ticks - max);
			}
		}

		amplitude += step;
		++max;
		return (amplitude - step) >> 15;
	}

}
