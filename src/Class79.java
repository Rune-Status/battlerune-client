import java.util.Iterator;

public class Class79 implements Iterable {

	public CacheableNode aCacheableNode3;

	public Class79() {
		aCacheableNode3 = new CacheableNode();
		aCacheableNode3.previous = aCacheableNode3;
		aCacheableNode3.next = aCacheableNode3;
	}

	public void method458() {
		while (aCacheableNode3.previous != aCacheableNode3) {
			aCacheableNode3.previous.unlinkDual();
		}

	}

	public void method459(final CacheableNode cacheablenode_0) {
		if (cacheablenode_0.next != null) {
			cacheablenode_0.unlinkDual();
		}

		cacheablenode_0.next = aCacheableNode3.next;
		cacheablenode_0.previous = aCacheableNode3;
		cacheablenode_0.next.previous = cacheablenode_0;
		cacheablenode_0.previous.next = cacheablenode_0;
	}

	@Override
	public Iterator iterator() {
		return new Class77(this);
	}

}
