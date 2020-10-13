package stackandqueue;

import org.junit.jupiter.api.Test;

class MyStackTest {

	/**
	 * Usecase1
	 */
	@Test
	public void givenInputShouldAddToStack() {
		MyStack<Integer> stack = new MyStack<Integer>();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		stack.printStack();
	}

}
