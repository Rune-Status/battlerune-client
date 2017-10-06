import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.imageio.ImageIO;

public class Class2 {

	static SpritePixels[] mapfunctions;
	static int anInt16;
	int anInt17;
	int anInt18;
	int[][] anIntArrayArray1;
	int[][] anIntArrayArray2;
	int[][] anIntArrayArray3;
	int[][] anIntArrayArray4;

	Class2(final int int_0, final int int_1) {
		anInt17 = int_0;
		anInt18 = int_1;
		anIntArrayArray1 = new int[int_0][int_1];
		anIntArrayArray3 = new int[int_0][int_1];
		anIntArrayArray2 = new int[int_0][int_1];
		anIntArrayArray4 = new int[int_0][int_1];
	}

	int method77(final int int_0, final int int_1) {
		if ((int_0 >= 0) && (int_1 >= 0) && (int_0 < anInt17) && (int_1 < anInt18)) {
			if (anIntArrayArray2[int_0][int_1] == 0) {
				return 0;
			} else {
				final int int_2 = anIntArrayArray1[int_0][int_1] / anIntArrayArray4[int_0][int_1];
				final int int_3 = anIntArrayArray3[int_0][int_1] / anIntArrayArray4[int_0][int_1];
				final int int_4 = anIntArrayArray2[int_0][int_1] / anIntArrayArray4[int_0][int_1];
				return DState.method311(int_2 / 256.0D, int_3 / 256.0D, int_4 / 256.0D);
			}
		} else {
			return 0;
		}
	}

	void method78(final int int_0, final int int_1, final int int_2,
			final FloorUnderlayDefinition floorunderlaydefinition_0) {
		if (floorunderlaydefinition_0 != null) {
			if ((int_2 + int_0) >= 0) {
				if ((int_2 + int_1) >= 0) {
					if (((int_0 - int_2) <= anInt17) && ((int_1 - int_2) <= anInt18)) {
						final int int_3 = Math.max(0, int_0 - int_2);
						final int int_4 = Math.min(anInt17, int_2 + int_0);
						final int int_5 = Math.max(0, int_1 - int_2);
						final int int_6 = Math.min(anInt18, int_2 + int_1);

						for (int int_7 = int_3; int_7 < int_4; int_7++) {
							for (int int_8 = int_5; int_8 < int_6; int_8++) {
								anIntArrayArray1[int_7][int_8] += (floorunderlaydefinition_0.hue * 256)
										/ floorunderlaydefinition_0.hueMultiplier;
								anIntArrayArray3[int_7][int_8] += floorunderlaydefinition_0.saturation;
								anIntArrayArray2[int_7][int_8] += floorunderlaydefinition_0.lightness;
								++anIntArrayArray4[int_7][int_8];
							}
						}

					}
				}
			}
		}
	}

	static final boolean method79() {
		return Class56.aBool16;
	}

	public static final SpritePixels method80(final byte[] bytes_0) {
		BufferedImage bufferedimage_0 = null;

		try {
			bufferedimage_0 = ImageIO.read(new ByteArrayInputStream(bytes_0));
			final int int_0 = bufferedimage_0.getWidth();
			final int int_1 = bufferedimage_0.getHeight();
			final int[] ints_0 = new int[int_0 * int_1];
			final PixelGrabber pixelgrabber_0 = new PixelGrabber(bufferedimage_0, 0, 0, int_0, int_1, ints_0, 0, int_0);
			pixelgrabber_0.grabPixels();
			return new SpritePixels(ints_0, int_0, int_1);
		} catch (final IOException ioexception_0) {
			;
		} catch (final InterruptedException interruptedexception_0) {
			;
		}

		return new SpritePixels(0, 0);
	}

	public static void method81() {
		try {
			final File file_0 = new File(Class23.userHome, "random.dat");
			int int_0;
			if (file_0.exists()) {
				Class57.aCacheFile1 = new CacheFile(new FileOnDisk(file_0, "rw", 25L), 24, 0);
			} else {
				label33: for (int int_1 = 0; int_1 < Class25.aStringArray1.length; int_1++) {
					for (int_0 = 0; int_0 < Class41.cacheLocations.length; int_0++) {
						final File file_1 = new File(Class41.cacheLocations[int_0] + Class25.aStringArray1[int_1]
								+ File.separatorChar + "random.dat");
						if (file_1.exists()) {
							Class57.aCacheFile1 = new CacheFile(new FileOnDisk(file_1, "rw", 25L), 24, 0);
							break label33;
						}
					}
				}
			}

			if (Class57.aCacheFile1 == null) {
				final RandomAccessFile randomaccessfile_0 = new RandomAccessFile(file_0, "rw");
				int_0 = randomaccessfile_0.read();
				randomaccessfile_0.seek(0L);
				randomaccessfile_0.write(int_0);
				randomaccessfile_0.seek(0L);
				randomaccessfile_0.close();
				Class57.aCacheFile1 = new CacheFile(new FileOnDisk(file_0, "rw", 25L), 24, 0);
			}
		} catch (final IOException ioexception_0) {
			;
		}
	}

}
