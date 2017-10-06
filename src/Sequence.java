public class Sequence extends CacheableNode {

	public static NodeCache skeletons;
	public static NodeCache sequences;
	static IndexDataBase skel_ref;
	static IndexDataBase seq_ref;
	public int precedenceAnimating;
	public int[] frameIDs;
	int[] interleaveLeave;
	public int priority;
	public int frameStep;
	public int[] frameLenghts;
	public boolean stretches;
	public int leftHandItem;
	public int forcedPriority;
	int[] anIntArray107;
	public int rightHandItem;
	public int maxLoops;
	public int replyMode;
	public int[] anIntArray108;

	static {
		sequences = new NodeCache(64);
		skeletons = new NodeCache(100);
	}

	Sequence() {
		frameStep = -1;
		stretches = false;
		forcedPriority = 5;
		leftHandItem = -1;
		rightHandItem = -1;
		maxLoops = 99;
		precedenceAnimating = -1;
		priority = -1;
		replyMode = 2;
	}

	void method846(final Buffer buffer_0, final int int_0) {
		int int_1;
		int int_2;
		if (int_0 == 1) {
			int_1 = buffer_0.readUnsignedShort();
			frameLenghts = new int[int_1];

			for (int_2 = 0; int_2 < int_1; int_2++) {
				frameLenghts[int_2] = buffer_0.readUnsignedShort();
			}

			frameIDs = new int[int_1];

			for (int_2 = 0; int_2 < int_1; int_2++) {
				frameIDs[int_2] = buffer_0.readUnsignedShort();
			}

			for (int_2 = 0; int_2 < int_1; int_2++) {
				frameIDs[int_2] += buffer_0.readUnsignedShort() << 16;
			}

		} else {
			if (int_0 == 2) {
				frameStep = buffer_0.readUnsignedShort();
			} else {
				if (int_0 == 3) {
					int_1 = buffer_0.readUnsignedByte();
					interleaveLeave = new int[int_1 + 1];

					for (int_2 = 0; int_2 < int_1; int_2++) {
						interleaveLeave[int_2] = buffer_0.readUnsignedByte();
					}

					interleaveLeave[int_1] = 9999999;
					return;
				}

				if (int_0 == 4) {
					stretches = true;
					return;
				}

				if (int_0 == 5) {
					forcedPriority = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 6) {
					leftHandItem = buffer_0.readUnsignedShort();
					return;
				}

				if (int_0 == 7) {
					rightHandItem = buffer_0.readUnsignedShort();
					return;
				}

				if (int_0 == 8) {
					maxLoops = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 9) {
					precedenceAnimating = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 10) {
					priority = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 11) {
					replyMode = buffer_0.readUnsignedByte();
					return;
				}

				if (int_0 == 12) {
					int_1 = buffer_0.readUnsignedByte();
					anIntArray107 = new int[int_1];

					for (int_2 = 0; int_2 < int_1; int_2++) {
						anIntArray107[int_2] = buffer_0.readUnsignedShort();
					}

					for (int_2 = 0; int_2 < int_1; int_2++) {
						anIntArray107[int_2] += buffer_0.readUnsignedShort() << 16;
					}

					return;
				}

				if (int_0 == 13) {
					int_1 = buffer_0.readUnsignedByte();
					anIntArray108 = new int[int_1];

					for (int_2 = 0; int_2 < int_1; int_2++) {
						anIntArray108[int_2] = buffer_0.read24BitInt();
					}
				}
			}

		}
	}

	public Model method847(final Model model_0, int int_0) {
		int_0 = frameIDs[int_0];
		final Frames frames_0 = Enum2.getFrames(int_0 >> 16);
		int_0 &= 0xFFFF;
		if (frames_0 == null) {
			return model_0.method948(true);
		} else {
			final Model model_1 = model_0.method948(!frames_0.method814(int_0));
			model_1.method944(frames_0, int_0);
			return model_1;
		}
	}

	public Model method848(final Model model_0, int int_0, final Sequence sequence_1, int int_1) {
		int_0 = frameIDs[int_0];
		final Frames frames_0 = Enum2.getFrames(int_0 >> 16);
		int_0 &= 0xFFFF;
		if (frames_0 == null) {
			return sequence_1.method847(model_0, int_1);
		} else {
			int_1 = sequence_1.frameIDs[int_1];
			final Frames frames_1 = Enum2.getFrames(int_1 >> 16);
			int_1 &= 0xFFFF;
			Model model_1;
			if (frames_1 == null) {
				model_1 = model_0.method948(!frames_0.method814(int_0));
				model_1.method944(frames_0, int_0);
				return model_1;
			} else {
				model_1 = model_0.method948(!frames_0.method814(int_0) & !frames_1.method814(int_1));
				model_1.method959(frames_0, int_0, frames_1, int_1, interleaveLeave);
				return model_1;
			}
		}
	}

	Model method849(final Model model_0, int int_0, int int_1) {
		int_0 = frameIDs[int_0];
		final Frames frames_0 = Enum2.getFrames(int_0 >> 16);
		int_0 &= 0xFFFF;
		if (frames_0 == null) {
			return model_0.method948(true);
		} else {
			final Model model_1 = model_0.method948(!frames_0.method814(int_0));
			int_1 &= 0x3;
			if (int_1 == 1) {
				model_1.method953();
			} else if (int_1 == 2) {
				model_1.method954();
			} else if (int_1 == 3) {
				model_1.method956();
			}

			model_1.method944(frames_0, int_0);
			if (int_1 == 1) {
				model_1.method956();
			} else if (int_1 == 2) {
				model_1.method954();
			} else if (int_1 == 3) {
				model_1.method953();
			}

			return model_1;
		}
	}

	Model method850(final Model model_0, int int_0) {
		int_0 = frameIDs[int_0];
		final Frames frames_0 = Enum2.getFrames(int_0 >> 16);
		int_0 &= 0xFFFF;
		if (frames_0 == null) {
			return model_0.method950(true);
		} else {
			final Model model_1 = model_0.method950(!frames_0.method814(int_0));
			model_1.method944(frames_0, int_0);
			return model_1;
		}
	}

	public Model method851(final Model model_0, final int int_0) {
		int int_1 = frameIDs[int_0];
		final Frames frames_0 = Enum2.getFrames(int_1 >> 16);
		int_1 &= 0xFFFF;
		if (frames_0 == null) {
			return model_0.method948(true);
		} else {
			Frames frames_1 = null;
			int int_2 = 0;
			if ((anIntArray107 != null) && (int_0 < anIntArray107.length)) {
				int_2 = anIntArray107[int_0];
				frames_1 = Enum2.getFrames(int_2 >> 16);
				int_2 &= 0xFFFF;
			}

			Model model_1;
			if ((frames_1 != null) && (int_2 != 65535)) {
				model_1 = model_0.method948(!frames_0.method814(int_1) & !frames_1.method814(int_2));
				model_1.method944(frames_0, int_1);
				model_1.method944(frames_1, int_2);
				return model_1;
			} else {
				model_1 = model_0.method948(!frames_0.method814(int_1));
				model_1.method944(frames_0, int_1);
				return model_1;
			}
		}
	}

	void post() {
		if (precedenceAnimating == -1) {
			if (interleaveLeave != null) {
				precedenceAnimating = 2;
			} else {
				precedenceAnimating = 0;
			}
		}

		if (priority == -1) {
			if (interleaveLeave != null) {
				priority = 2;
				return;
			}

			priority = 0;
		}

	}

	void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method846(buffer_0, int_0);
		}
	}

}
