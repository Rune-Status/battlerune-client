import java.io.IOException;

public abstract class Renderable extends CacheableNode {

	static IndexData indexModels;
	public int modelHeight;

	protected Renderable() {
		modelHeight = 1000;
	}

	protected Model getModel() {
		return null;
	}

	void draw(final int int_0, final int int_1, final int int_2, final int int_3, final int int_4, final int int_5,
			final int int_6, final int int_7, final int int_8) {
		final Model model_0 = getModel();
		if (model_0 != null) {
			modelHeight = model_0.modelHeight;
			model_0.draw(int_0, int_1, int_2, int_3, int_4, int_5, int_6, int_7, int_8);
		}

	}

	static void method691(final Buffer buffer_0) {
		if (Client.aByteArray29 != null) {
			buffer_0.putBytes(Client.aByteArray29, 0, Client.aByteArray29.length);
		} else {
			final byte[] bytes_0 = new byte[24];

			try {
				Class57.aCacheFile1.seek(0L);
				Class57.aCacheFile1.read(bytes_0);

				int int_0;
				for (int_0 = 0; (int_0 < 24) && (bytes_0[int_0] == 0); int_0++) {
					;
				}

				if (int_0 >= 24) {
					throw new IOException();
				}
			} catch (final Exception exception_0) {
				for (int int_1 = 0; int_1 < 24; int_1++) {
					bytes_0[int_1] = -1;
				}
			}

			buffer_0.putBytes(bytes_0, 0, bytes_0.length);
		}
	}

}
