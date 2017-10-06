import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInput implements MouseListener, MouseMotionListener, FocusListener {

	public static MouseInput mouse;
	public static volatile int mouseIdleTicks;
	public static volatile int anInt275;
	public static volatile int mouseX;
	public static volatile int anInt276;
	public static int anInt277;
	public static volatile int mouseY;
	public static int anInt278;
	public static volatile int anInt279;
	public static int anInt280;
	public static int anInt281;
	public static int anInt282;
	public static int anInt283;
	public static volatile int anInt284;
	public static volatile long aLong18;
	public static long aLong19;
	static String aString14;
	static Class103 aClass103_4;

	static {
		mouse = new MouseInput();
		mouseIdleTicks = 0;
		anInt275 = 0;
		mouseX = -1;
		mouseY = -1;
		anInt281 = 0;
		anInt278 = 0;
		anInt280 = 0;
		anInt284 = 0;
		anInt276 = 0;
		anInt279 = 0;
		aLong18 = 0L;
		anInt277 = 0;
		anInt282 = 0;
		anInt283 = 0;
		aLong19 = 0L;
	}

	final int method554(final MouseEvent mouseevent_0) {
		final int int_0 = mouseevent_0.getButton();
		return int_0 == 1 ? (mouseevent_0.isMetaDown() ? 2 : (mouseevent_0.isAltDown() ? 4 : 1))
				: (int_0 == 2 ? 4 : (int_0 == 3 ? 2 : 0));
	}

	@Override
	public final void mouseClicked(final MouseEvent mouseevent_0) {
		if (mouseevent_0.isPopupTrigger()) {
			mouseevent_0.consume();
		}

	}

	@Override
	public final synchronized void mousePressed(final MouseEvent mouseevent_0) {
		if (mouse != null) {
			mouseIdleTicks = 0;
			anInt276 = mouseevent_0.getX();
			anInt279 = mouseevent_0.getY();
			aLong18 = Class6.currentTimeMs();
			anInt284 = method554(mouseevent_0);
			if (anInt284 != 0) {
				anInt275 = anInt284 * 612100411;
			}
		}

		if (mouseevent_0.isPopupTrigger()) {
			mouseevent_0.consume();
		}

	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent mouseevent_0) {
		if (mouse != null) {
			mouseIdleTicks = 0;
			mouseX = mouseevent_0.getX();
			mouseY = mouseevent_0.getY();
		}

	}

	@Override
	public final synchronized void mouseExited(final MouseEvent mouseevent_0) {
		if (mouse != null) {
			mouseIdleTicks = 0;
			mouseX = -1;
			mouseY = -1;
		}

	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent mouseevent_0) {
		if (mouse != null) {
			mouseIdleTicks = 0;
			mouseX = mouseevent_0.getX();
			mouseY = mouseevent_0.getY();
		}

	}

	@Override
	public final void focusGained(final FocusEvent focusevent_0) {
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent_0) {
		if (mouse != null) {
			anInt275 = 0;
		}

	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent mouseevent_0) {
		if (mouse != null) {
			mouseIdleTicks = 0;
			anInt275 = 0;
		}

		if (mouseevent_0.isPopupTrigger()) {
			mouseevent_0.consume();
		}

	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent mouseevent_0) {
		if (mouse != null) {
			mouseIdleTicks = 0;
			mouseX = mouseevent_0.getX();
			mouseY = mouseevent_0.getY();
		}

	}

	static String method555(final Widget widget_0) {
		final int int_0 = Class6.getWidgetConfig(widget_0);
		final int int_1 = (int_0 >> 11) & 0x3F;
		return int_1 == 0 ? null
				: ((widget_0.selectedAction != null) && (widget_0.selectedAction.trim().length() != 0)
						? widget_0.selectedAction : null);
	}

}
