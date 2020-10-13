package stackandqueue;

import org.junit.jupiter.api.Test;

class MyQueueTest {

	/**
	 * Usecase3
	 */
	@Test
	public void givenInputShouldAddToQueue() {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		queue.printQueue();
	}

}
