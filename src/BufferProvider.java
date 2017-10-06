public abstract class BufferProvider {

	public int[] pixels;
	public int width;
	public int height;

	public final void setRaster() {
		Rasterizer2D.setRasterBuffer(pixels, width, height);
	}

	public abstract void method474(int var1, int var2);

	public abstract void method475(int var1, int var2, int var3, int var4);

}
