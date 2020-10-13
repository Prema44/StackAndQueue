package stackandqueue;

public class MyNode<K> implements INode<K> {
	private K key;
	private INode<K> next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public void setNext(INode<K> next) {
		this.next = next;
	}

	public INode<K> getNext() {
		return next;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}
}
