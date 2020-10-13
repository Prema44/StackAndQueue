package stackandqueue;

public class MyQueue<K> {
	private final MyLinkedList<K> list;

	public MyQueue() {
		list = new MyLinkedList<K>();
	}

	public void enqueue(INode<K> node) {
		list.appendNode(node);
	}
	
	public void dequeue() {
		list.pop();
	}

	public void printQueue() {
		list.printNodes();
	}
}
