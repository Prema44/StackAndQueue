package stackandqueue;

import static org.junit.Assert.assertEquals;

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
		INode<Integer> peak = stack.peak();
		stack.printStack();
		assertEquals(peak, myThirdNode);
	}

	/**
	 * Usecase2
	 */
	@Test
	public void givenMethodShouldMatchPoppedValueWithLastAddedNode() {
		MyStack<Integer> stack = new MyStack<Integer>();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode<Integer> pop = stack.pop();
		stack.printStack();
		assertEquals(pop, myThirdNode);

	}

}
