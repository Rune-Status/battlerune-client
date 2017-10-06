public class CacheableNode extends Node {

	public CacheableNode next;
	public CacheableNode previous;

	public void unlinkDual() {
		if (next != null) {
			next.previous = previous;
			previous.next = next;
			previous = null;
			next = null;
		}
	}

}
