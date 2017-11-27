
public class TestStack {
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
