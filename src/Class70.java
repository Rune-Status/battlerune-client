import java.util.Iterator;

public final class Class70 implements Iterable {

	int anInt175;
	int anInt176;
	Node[] aNodeArray1;
	Node aNode1;
	Node aNode2;

	public Class70(final int int_0) {
		anInt176 = 0;
		anInt175 = int_0;
		aNodeArray1 = new Node[int_0];

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			final Node node_0 = aNodeArray1[int_1] = new Node();
			node_0.next = node_0;
			node_0.previous = node_0;
		}

	}

	public Node method419(final long long_0) {
		final Node node_0 = aNodeArray1[(int) (long_0 & anInt175 - 1)];

		for (aNode1 = node_0.next; node_0 != aNode1; aNode1 = aNode1.next) {
			if (aNode1.hash == long_0) {
				final Node node_1 = aNode1;
				aNode1 = aNode1.next;
				return node_1;
			}
		}

		aNode1 = null;
		return null;
	}

	public Node method420() {
		Node node_0;
		if ((anInt176 > 0) && (aNodeArray1[anInt176 - 1] != aNode2)) {
			node_0 = aNode2;
			aNode2 = node_0.next;
			return node_0;
		} else {
			do {
				if (anInt176 >= anInt175) {
					return null;
				}

				node_0 = aNodeArray1[anInt176++].next;
			} while (aNodeArray1[anInt176 - 1] == node_0);

			aNode2 = node_0.next;
			return node_0;
		}
	}

	public void method421(final Node node_0, final long long_0) {
		if (node_0.previous != null) {
			node_0.unlink();
		}

		final Node node_1 = aNodeArray1[(int) (long_0 & anInt175 - 1)];
		node_0.previous = node_1.previous;
		node_0.next = node_1;
		node_0.previous.next = node_0;
		node_0.next.previous = node_0;
		node_0.hash = long_0;
	}

	public Node method422() {
		anInt176 = 0;
		return method420();
	}

	public void method423() {
		for (int int_0 = 0; int_0 < anInt175; int_0++) {
			final Node node_0 = aNodeArray1[int_0];

			while (true) {
				final Node node_1 = node_0.next;
				if (node_1 == node_0) {
					break;
				}

				node_1.unlink();
			}
		}

		aNode1 = null;
		aNode2 = null;
	}

	@Override
	public Iterator iterator() {
		return new Class74(this);
	}

}
