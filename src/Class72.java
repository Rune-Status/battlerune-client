import java.util.Iterator;

public class Class72 implements Iterator {

	CombatInfoList aCombatInfoList2;
	Node aNode3;
	Node aNode4;

	Class72(final CombatInfoList combatinfolist_0) {
		aNode4 = null;
		aCombatInfoList2 = combatinfolist_0;
		aNode3 = aCombatInfoList2.node.next;
		aNode4 = null;
	}

	@Override
	public Object next() {
		Node node_0 = aNode3;
		if (node_0 == aCombatInfoList2.node) {
			node_0 = null;
			aNode3 = null;
		} else {
			aNode3 = node_0.next;
		}

		aNode4 = node_0;
		return node_0;
	}

	@Override
	public boolean hasNext() {
		return aCombatInfoList2.node != aNode3;
	}

	@Override
	public void remove() {
		aNode4.unlink();
		aNode4 = null;
	}

}
