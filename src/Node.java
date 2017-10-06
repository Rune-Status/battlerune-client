public class Node {

	Node previous;
	public Node next;
	public long hash;

	public void unlink() {
		if (previous != null) {
			previous.next = next;
			next.previous = previous;
			next = null;
			previous = null;
		}
	}

	public boolean linked() {
		return previous != null;
	}

}
