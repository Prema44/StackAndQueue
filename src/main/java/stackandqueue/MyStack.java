package stackandqueue;

public class MyStack<K> {
	
	private final MyLinkedList<K> list;

	public MyStack() {
		list = new MyLinkedList<K>();
	}

	public void push(INode<K> node) {
		list.addNode(node);
	}

	public void printStack() {
		list.printNodes();
	}
}