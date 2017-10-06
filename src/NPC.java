import java.applet.Applet;
import java.net.URL;

import netscape.javascript.JSObject;

public final class NPC extends Actor {

	static int[] anIntArray141;
	NPCComposition composition;

	@Override
	protected final Model getModel() {
		if (composition == null) {
			return null;
		} else {
			final Sequence sequence_0 = (super.animation != -1) && (super.actionAnimationDisable == 0)
					? Class54.getAnimation(super.animation) : null;
			final Sequence sequence_1 = (super.poseAnimation == -1)
					|| ((super.poseAnimation == super.idlePoseAnimation) && (sequence_0 != null)) ? null
							: Class54.getAnimation(super.poseAnimation);
			Model model_0 = composition.method836(sequence_0, super.actionFrame, sequence_1, super.poseFrame);
			if (model_0 == null) {
				return null;
			} else {
				model_0.method942();
				super.anInt552 = model_0.modelHeight;
				if ((super.graphic != -1) && (super.anInt553 != -1)) {
					final Model model_1 = InvType.getSpotAnimType(super.graphic).method708(super.anInt553);
					if (model_1 != null) {
						model_1.method961(0, -super.anInt557, 0);
						final Model[] models_0 = new Model[] { model_0, model_1 };
						model_0 = new Model(models_0, 2);
					}
				}

				if (composition.anInt518 == 1) {
					model_0.aBool66 = true;
				}

				return model_0;
			}
		}
	}

	@Override
	final boolean hasConfig() {
		return composition != null;
	}

	final void method999(final int int_0, final byte byte_0) {
		int int_1 = super.pathX[0];
		int int_2 = super.pathY[0];
		if (int_0 == 0) {
			--int_1;
			++int_2;
		}

		if (int_0 == 1) {
			++int_2;
		}

		if (int_0 == 2) {
			++int_1;
			++int_2;
		}

		if (int_0 == 3) {
			--int_1;
		}

		if (int_0 == 4) {
			++int_1;
		}

		if (int_0 == 5) {
			--int_1;
			--int_2;
		}

		if (int_0 == 6) {
			--int_2;
		}

		if (int_0 == 7) {
			++int_1;
			--int_2;
		}

		if ((super.animation != -1) && (Class54.getAnimation(super.animation).priority == 1)) {
			super.animation = -1;
		}

		if (super.queueSize < 9) {
			++super.queueSize;
		}

		for (int int_3 = super.queueSize; int_3 > 0; --int_3) {
			super.pathX[int_3] = super.pathX[int_3 - 1];
			super.pathY[int_3] = super.pathY[int_3 - 1];
			super.aByteArray21[int_3] = super.aByteArray21[int_3 - 1];
		}

		super.pathX[0] = int_1;
		super.pathY[0] = int_2;
		super.aByteArray21[0] = byte_0;
	}

	final void method1000(final int int_0, final int int_1, final boolean bool_0) {
		if ((super.animation != -1) && (Class54.getAnimation(super.animation).priority == 1)) {
			super.animation = -1;
		}

		if (!bool_0) {
			final int int_2 = int_0 - super.pathX[0];
			final int int_3 = int_1 - super.pathY[0];
			if ((int_2 >= -8) && (int_2 <= 8) && (int_3 >= -8) && (int_3 <= 8)) {
				if (super.queueSize < 9) {
					++super.queueSize;
				}

				for (int int_4 = super.queueSize; int_4 > 0; --int_4) {
					super.pathX[int_4] = super.pathX[int_4 - 1];
					super.pathY[int_4] = super.pathY[int_4 - 1];
					super.aByteArray21[int_4] = super.aByteArray21[int_4 - 1];
				}

				super.pathX[0] = int_0;
				super.pathY[0] = int_1;
				super.aByteArray21[0] = 1;
				return;
			}
		}

		super.queueSize = 0;
		super.anInt540 = 0;
		super.anInt541 = 0;
		super.pathX[0] = int_0;
		super.pathY[0] = int_1;
		super.anInt547 = (super.anInt542 * 64) + (super.pathX[0] * 128);
		super.anInt550 = (super.anInt542 * 64) + (128 * super.pathY[0]);
	}

	static int method1001() {
		return ++Class42.anInt97 - 1;
	}

	static boolean method1002(final String string_0, final int int_0, final String string_1) {
		if (int_0 == 0) {
			try {
				if (!Class19.aString3.startsWith("win")) {
					throw new Exception();
				} else if (!string_0.startsWith("http://") && !string_0.startsWith("https://")) {
					throw new Exception();
				} else {
					final String string_2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int int_1 = 0; int_1 < string_0.length(); int_1++) {
						if (string_2.indexOf(string_0.charAt(int_1)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string_0 + "\"");
					return true;
				}
			} catch (final Throwable throwable_0) {
				return false;
			}
		} else if (int_0 == 1) {
			try {
				final Applet applet_0 = Class19.anApplet1;
				final Object[] objects_0 = new Object[] {
						(new URL(Class19.anApplet1.getCodeBase(), string_0)).toString() };
				final Object object_0 = JSObject.getWindow(applet_0).call(string_1, objects_0);
				return object_0 != null;
			} catch (final Throwable throwable_1) {
				return false;
			}
		} else if (int_0 == 2) {
			try {
				Class19.anApplet1.getAppletContext().showDocument(new URL(Class19.anApplet1.getCodeBase(), string_0),
						"_blank");
				return true;
			} catch (final Exception exception_0) {
				return false;
			}
		} else if (int_0 == 3) {
			try {
				Class20.method208(Class19.anApplet1, "loggedout");
			} catch (final Throwable throwable_2) {
				;
			}

			try {
				Class19.anApplet1.getAppletContext().showDocument(new URL(Class19.anApplet1.getCodeBase(), string_0),
						"_top");
				return true;
			} catch (final Exception exception_1) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	static Script method1003(final byte[] bytes_0) {
		final Script script_0 = new Script();
		final Buffer buffer_0 = new Buffer(bytes_0);
		buffer_0.offset = buffer_0.payload.length - 2;
		final int int_0 = buffer_0.readUnsignedShort();
		final int int_1 = buffer_0.payload.length - 2 - int_0 - 12;
		buffer_0.offset = int_1;
		final int int_2 = buffer_0.readInt();
		script_0.localIntCount = buffer_0.readUnsignedShort();
		script_0.localStringCount = buffer_0.readUnsignedShort();
		script_0.intStackCount = buffer_0.readUnsignedShort();
		script_0.stringStackCount = buffer_0.readUnsignedShort();
		final int int_3 = buffer_0.readUnsignedByte();
		int int_4;
		int int_5;
		if (int_3 > 0) {
			script_0.switches = script_0.method843(int_3);

			for (int_4 = 0; int_4 < int_3; int_4++) {
				int_5 = buffer_0.readUnsignedShort();
				final Class70 class70_0 = new Class70(RuntimeException_Sub1.method891(int_5));
				script_0.switches[int_4] = class70_0;

				while (int_5-- > 0) {
					final int int_6 = buffer_0.readInt();
					final int int_7 = buffer_0.readInt();
					class70_0.method421(new WidgetConfig(int_7), int_6);
				}
			}
		}

		buffer_0.offset = 0;
		buffer_0.getNullString();
		script_0.instructions = new int[int_2];
		script_0.intOperands = new int[int_2];
		script_0.stringOperands = new String[int_2];

		for (int_4 = 0; buffer_0.offset < int_1; script_0.instructions[int_4++] = int_5) {
			int_5 = buffer_0.readUnsignedShort();
			if (int_5 == 3) {
				script_0.stringOperands[int_4] = buffer_0.readString();
			} else if ((int_5 < 100) && (int_5 != 21) && (int_5 != 38) && (int_5 != 39)) {
				script_0.intOperands[int_4] = buffer_0.readInt();
			} else {
				script_0.intOperands[int_4] = buffer_0.readUnsignedByte();
			}
		}

		return script_0;
	}

}
