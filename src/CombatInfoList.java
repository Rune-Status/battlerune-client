import java.util.Iterator;

public class CombatInfoList implements Iterable {

	Node aNode7;
	Node node;

	public CombatInfoList() {
		node = new Node();
		node.next = node;
		node.previous = node;
	}

	Node method450(final Node node_0) {
		Node node_1;
		if (node_0 == null) {
			node_1 = node.next;
		} else {
			node_1 = node_0;
		}

		if (node_1 == node) {
			aNode7 = null;
			return null;
		} else {
			aNode7 = node_1.next;
			return node_1;
		}
	}

	public boolean method451() {
		return node.next == node;
	}

	public Node method452() {
		return method450((Node) null);
	}

	public Node method453() {
		final Node node_0 = aNode7;
		if (node_0 == node) {
			aNode7 = null;
			return null;
		} else {
			aNode7 = node_0.next;
			return node_0;
		}
	}

	public void method454(final Node node_0) {
		if (node_0.previous != null) {
			node_0.unlink();
		}

		node_0.previous = node;
		node_0.next = node.next;
		node_0.previous.next = node_0;
		node_0.next.previous = node_0;
	}

	public void method455(final Node node_0) {
		if (node_0.previous != null) {
			node_0.unlink();
		}

		node_0.previous = node.previous;
		node_0.next = node;
		node_0.previous.next = node_0;
		node_0.next.previous = node_0;
	}

	public Node method456() {
		final Node node_0 = node.next;
		if (node_0 == node) {
			return null;
		} else {
			node_0.unlink();
			return node_0;
		}
	}

	@Override
	public Iterator iterator() {
		return new Class72(this);
	}

	public static void method457(final Node node_0, final Node node_1) {
		if (node_0.previous != null) {
			node_0.unlink();
		}

		node_0.previous = node_1;
		node_0.next = node_1.next;
		node_0.previous.next = node_0;
		node_0.next.previous = node_0;
	}

}
