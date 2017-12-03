package Recursion;

public class FindPowerBySendingPowerAndBase {
	public static int findPower(int base, int power) {
		if(power == 1) {
			return base;
		} else {
			return base * findPower(base, power-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(findPower(2,3));
	}
}
