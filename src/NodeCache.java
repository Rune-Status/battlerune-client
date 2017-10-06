public final class NodeCache {

	int anInt200;
	XHashTable table;
	Node2LinkedList list;
	CacheableNode aCacheableNode4;
	int anInt201;

	public NodeCache(final int int_0) {
		aCacheableNode4 = new CacheableNode();
		list = new Node2LinkedList();
		anInt201 = int_0;
		anInt200 = int_0;

		int int_1;
		for (int_1 = 1; (int_1 + int_1) < int_0; int_1 += int_1) {
			;
		}

		table = new XHashTable(int_1);
	}

	public CacheableNode get(final long long_0) {
		final CacheableNode cacheablenode_0 = (CacheableNode) table.get(long_0);
		if (cacheablenode_0 != null) {
			list.push(cacheablenode_0);
		}

		return cacheablenode_0;
	}

	public void put(final CacheableNode cacheablenode_0, final long long_0) {
		if (anInt200 == 0) {
			CacheableNode cacheablenode_1 = list.pop();
			cacheablenode_1.unlink();
			cacheablenode_1.unlinkDual();
			if (cacheablenode_1 == aCacheableNode4) {
				cacheablenode_1 = list.pop();
				cacheablenode_1.unlink();
				cacheablenode_1.unlinkDual();
			}
		} else {
			--anInt200;
		}

		table.put(cacheablenode_0, long_0);
		list.push(cacheablenode_0);
	}

	public void reset() {
		list.clear();
		table.method517();
		aCacheableNode4 = new CacheableNode();
		anInt200 = anInt201;
	}

	public void remove(final long long_0) {
		final CacheableNode cacheablenode_0 = (CacheableNode) table.get(long_0);
		if (cacheablenode_0 != null) {
			cacheablenode_0.unlink();
			cacheablenode_0.unlinkDual();
			++anInt200;
		}

	}

}
