package Stacks;

public class Stack {
	private int size;
	private int top;
	private int[] stack;

	public Stack() {
		size = 20;
		top = -1;
		stack = new int[size];
	}

	public Stack(int size) {
		this.size = size;
		top = -1;
		stack = new int[this.size];
	}

	public boolean push(int item) {
		if(!isFull()) {
			top++;
			stack[top] = item;
			return true;
		}
		else {
			return false;
		}

	}

	
	public int pop() {
		return stack[top--];
	}
	
	public boolean isFull() {
		return (top == stack.length-1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public static void main(String args[]) {
		Stack stack = new Stack(10);
		stack.push(2);
		stack.push(12);
		stack.push(3);
		stack.push(6);
		stack.push(34);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
