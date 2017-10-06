import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TextureProvider implements ITextureLoader {

	int width;
	double brightness;
	Texture[] textures;
	Deque deque;
	int size;
	IndexDataBase sprites;
	int maxSize;

	public TextureProvider(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1, final int int_0,
			final double double_0, final int int_1) {
		deque = new Deque();
		size = 0;
		brightness = 1.0D;
		width = 128;
		sprites = indexdatabase_1;
		maxSize = int_0;
		size = maxSize;
		brightness = double_0;
		width = int_1;
		final int[] ints_0 = indexdatabase_0.getChilds(0);
		final int int_2 = ints_0.length;
		textures = new Texture[indexdatabase_0.fileCount(0)];

		for (int int_3 = 0; int_3 < int_2; int_3++) {
			final Buffer buffer_0 = new Buffer(indexdatabase_0.getConfigData(0, ints_0[int_3]));
			textures[ints_0[int_3]] = new Texture(buffer_0);
		}

	}

	public void reset() {
		for (int int_0 = 0; int_0 < textures.length; int_0++) {
			if (textures[int_0] != null) {
				textures[int_0].resetPixels();
			}
		}

		deque = new Deque();
		size = maxSize;
	}

	@Override
	public int getAverageTextureRGB(final int int_0) {
		return textures[int_0] != null ? textures[int_0].anInt332 : 0;
	}

	@Override
	public int[] load(final int int_0) {
		final Texture texture_0 = textures[int_0];
		if (texture_0 != null) {
			if (texture_0.pixels != null) {
				deque.addTail(texture_0);
				texture_0.loaded = true;
				return texture_0.pixels;
			}

			final boolean bool_0 = texture_0.method599(brightness, width, sprites);
			if (bool_0) {
				if (size == 0) {
					final Texture texture_1 = (Texture) deque.popTail();
					texture_1.resetPixels();
				} else {
					--size;
				}

				deque.addTail(texture_0);
				texture_0.loaded = true;
				return texture_0.pixels;
			}
		}

		return null;
	}

	@Override
	public boolean method1(final int int_0) {
		return width == 64;
	}

	@Override
	public boolean method2(final int int_0) {
		return textures[int_0].aBool41;
	}

	public void brightness(final double double_0) {
		brightness = double_0;
		reset();
	}

	public void method541(final int int_0) {
		for (int int_1 = 0; int_1 < textures.length; int_1++) {
			final Texture texture_0 = textures[int_1];
			if ((texture_0 != null) && (texture_0.anInt331 != 0) && texture_0.loaded) {
				texture_0.method600(int_0);
				texture_0.loaded = false;
			}
		}

	}

	public static final AbstractSoundSystem method542(final Signlink signlink_0, final int int_0, int int_1) {
		if (ChatLineBuffer.sampleRate == 0) {
			throw new IllegalStateException();
		} else if ((int_0 >= 0) && (int_0 < 2)) {
			if (int_1 < 256) {
				int_1 = 256;
			}

			try {
				final AbstractSoundSystem abstractsoundsystem_0 = Class104.anInterface2_1.method3();
				abstractsoundsystem_0.samples = new int[256 * (AbstractSoundSystem.highMemory ? 2 : 1)];
				abstractsoundsystem_0.anInt139 = int_1;
				abstractsoundsystem_0.method340();
				abstractsoundsystem_0.offset = (int_1 & 0xFFFFFC00) + 1024;
				if (abstractsoundsystem_0.offset > 16384) {
					abstractsoundsystem_0.offset = 16384;
				}

				abstractsoundsystem_0.create(abstractsoundsystem_0.offset);
				if ((Class49.priority > 0) && (Class43.task == null)) {
					Class43.task = new SoundTask();
					Class95.aScheduledExecutorService1 = Executors.newScheduledThreadPool(1);
					Class95.aScheduledExecutorService1.scheduleAtFixedRate(Class43.task, 0L, 10L,
							TimeUnit.MILLISECONDS);
				}

				if (Class43.task != null) {
					if (Class43.task.systems[int_0] != null) {
						throw new IllegalArgumentException();
					}

					Class43.task.systems[int_0] = abstractsoundsystem_0;
				}

				return abstractsoundsystem_0;
			} catch (final Throwable throwable_0) {
				return new AbstractSoundSystem();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

}
