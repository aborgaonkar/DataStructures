package Recursion;

public class PrintNumbersUsingRecursion {
	
	public static void printNumbers(int num) {
		if(num == 0) {
			return;
		}
		System.out.println(num);
		printNumbers(num-1);
	}
	public static void main(String[] args) {
		printNumbers(12);
	}
}
