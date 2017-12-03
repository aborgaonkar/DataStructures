package Recursion;

public class FibonacciSeries {
	public static int fibonacci(int num) {
		if(num == 0 || num == 1) {
			return num;
		}else {
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(fibonacci(i));
		}
		
	}
}
