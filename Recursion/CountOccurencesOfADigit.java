package Recursion;

public class CountOccurencesOfADigit {
	public static int countOccurences(int num, int target) {
		if(num <= 9) {
			if(num == target) {
				return 1;
			}else {
				return 0;
			}
		}else {
			if(num%10 == target) {
				return 1 + countOccurences(num/10, target);
			}else {
				return 0 + countOccurences(num/10, target);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(countOccurences(15455656, 5));
	}
}
