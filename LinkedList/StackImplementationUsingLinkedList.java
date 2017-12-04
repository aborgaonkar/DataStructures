package LinkedList;

import java.util.EmptyStackException;

public class StackImplementationUsingLinkedList {
	private int length;
	private ListNode top;
	
	public StackImplementationUsingLinkedList() {
		length = 0;
		top = null;
	}
	
	// Add specified data to the top of the stack
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.setNext(top);
		top = temp;
		length++;
	}
	
	// Removes the data at the top of the stack and returns its reference
	public int pop() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}
	
	// Returns a reference to the data at TOS, but data is not removed
	
	public int peek() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.getData();
	}
	
	public boolean isEmpty() {
		return (length == 0);
	}
	
	public int size() {
		return length;
	}
	
	public static void main(String[] args) {
		StackImplementationUsingLinkedList linkedStack = new StackImplementationUsingLinkedList();
		linkedStack.push(5);
		linkedStack.push(15);
		linkedStack.push(25);
		linkedStack.push(35);
		System.out.println(linkedStack.peek());
		linkedStack.pop();
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.peek());
		
	}
	
}
