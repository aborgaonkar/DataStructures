package Arrays;

public class ReverseInteger {
	public static int reverseInteger(int num) {
		int reversed = 0;
		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num/10;
		}
		return reversed;
	}
	public static void main(String[] args) {
		System.out.println(reverseInteger(123));
	}
}
