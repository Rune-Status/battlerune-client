import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class Class10 implements Interface3, MouseWheelListener {

	int anInt33;

	Class10() {
		anInt33 = 0;
	}

	void method124(final Component component_0) {
		component_0.addMouseWheelListener(this);
	}

	void method125(final Component component_0) {
		component_0.removeMouseWheelListener(this);
	}

	@Override
	public synchronized int method4() {
		final int int_0 = anInt33;
		anInt33 = 0;
		return int_0;
	}

	@Override
	public synchronized void mouseWheelMoved(final MouseWheelEvent mousewheelevent_0) {
		anInt33 += mousewheelevent_0.getWheelRotation();
	}

}
