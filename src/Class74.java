import java.util.Iterator;

public class Class74 implements Iterator {

	Node aNode5;
	Class70 aClass70_2;
	int anInt178;
	Node aNode6;

	Class74(final Class70 class70_0) {
		aNode5 = null;
		aClass70_2 = class70_0;
		method444();
	}

	void method444() {
		aNode6 = aClass70_2.aNodeArray1[0].next;
		anInt178 = 1;
		aNode5 = null;
	}

	@Override
	public boolean hasNext() {
		if (aClass70_2.aNodeArray1[anInt178 - 1] != aNode6) {
			return true;
		} else {
			while (anInt178 < aClass70_2.anInt175) {
				if (aClass70_2.aNodeArray1[anInt178++].next != aClass70_2.aNodeArray1[anInt178 - 1]) {
					aNode6 = aClass70_2.aNodeArray1[anInt178 - 1].next;
					return true;
				}

				aNode6 = aClass70_2.aNodeArray1[anInt178 - 1];
			}

			return false;
		}
	}

	@Override
	public void remove() {
		if (aNode5 == null) {
			throw new IllegalStateException();
		} else {
			aNode5.unlink();
			aNode5 = null;
		}
	}

	@Override
	public Object next() {
		Node node_0;
		if (aClass70_2.aNodeArray1[anInt178 - 1] != aNode6) {
			node_0 = aNode6;
			aNode6 = node_0.next;
			aNode5 = node_0;
			return node_0;
		} else {
			do {
				if (anInt178 >= aClass70_2.anInt175) {
					return null;
				}

				node_0 = aClass70_2.aNodeArray1[anInt178++].next;
			} while (node_0 == aClass70_2.aNodeArray1[anInt178 - 1]);

			aNode6 = node_0.next;
			aNode5 = node_0;
			return node_0;
		}
	}

}
