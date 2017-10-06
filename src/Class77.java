import java.util.Iterator;

public class Class77 implements Iterator {

	Class79 aClass79_2;
	CacheableNode aCacheableNode1;
	CacheableNode aCacheableNode2;

	Class77(final Class79 class79_0) {
		aCacheableNode2 = null;
		aClass79_2 = class79_0;
		aCacheableNode1 = aClass79_2.aCacheableNode3.previous;
		aCacheableNode2 = null;
	}

	@Override
	public Object next() {
		CacheableNode cacheablenode_0 = aCacheableNode1;
		if (cacheablenode_0 == aClass79_2.aCacheableNode3) {
			cacheablenode_0 = null;
			aCacheableNode1 = null;
		} else {
			aCacheableNode1 = cacheablenode_0.previous;
		}

		aCacheableNode2 = cacheablenode_0;
		return cacheablenode_0;
	}

	@Override
	public void remove() {
		if (aCacheableNode2 == null) {
			throw new IllegalStateException();
		} else {
			aCacheableNode2.unlinkDual();
			aCacheableNode2 = null;
		}
	}

	@Override
	public boolean hasNext() {
		return aClass79_2.aCacheableNode3 != aCacheableNode1;
	}

}
