import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class MainBufferProvider extends BufferProvider {

	Image image;
	Component aComponent1;

	MainBufferProvider(final int int_0, final int int_1, final Component component_0) {
		super.width = int_0;
		super.height = int_1;
		super.pixels = new int[(int_1 * int_0) + 1];
		final DataBufferInt databufferint_0 = new DataBufferInt(super.pixels, super.pixels.length);
		final DirectColorModel directcolormodel_0 = new DirectColorModel(32, 16711680, 65280, 255);
		final WritableRaster writableraster_0 = Raster.createWritableRaster(
				directcolormodel_0.createCompatibleSampleModel(super.width, super.height), databufferint_0,
				(Point) null);
		image = new BufferedImage(directcolormodel_0, writableraster_0, false, new Hashtable());
		method598(component_0);
		setRaster();
	}

	final void drawSub(final Graphics graphics_0, final int int_0, final int int_1, final int int_2, final int int_3) {
		try {
			final Shape shape_0 = graphics_0.getClip();
			graphics_0.clipRect(int_0, int_1, int_2, int_3);
			graphics_0.drawImage(image, 0, 0, aComponent1);
			graphics_0.setClip(shape_0);
		} catch (final Exception exception_0) {
			aComponent1.repaint();
		}
	}

	final void draw(final Graphics graphics_0, final int int_0, final int int_1) {
		try {
			graphics_0.drawImage(image, int_0, int_1, aComponent1);
		} catch (final Exception exception_0) {
			aComponent1.repaint();
		}
	}

	final void method598(final Component component_0) {
		aComponent1 = component_0;
	}

	@Override
	public final void method474(final int int_0, final int int_1) {
		draw(aComponent1.getGraphics(), int_0, int_1);
	}

	@Override
	public final void method475(final int int_0, final int int_1, final int int_2, final int int_3) {
		drawSub(aComponent1.getGraphics(), int_0, int_1, int_2, int_3);
	}

}
