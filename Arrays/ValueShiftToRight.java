/*
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

*/

package Arrays;
import java.util.Arrays;

public class ValueShiftToRight {
	public static String shiftValuesToRight(int[] nums, int valueToShift) {
		int i = 0, j= 0;
		while(j < nums.length) {
			if(nums[j] == valueToShift) {
				j++;
			}
			else {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j++;
			}
		}
		return Arrays.toString(nums);
	}
	public static void main(String args[]) {
		int[] nums = {0, 1, 0, 3, 12};
		int valueToShift = 0;
		System.out.println(shiftValuesToRight(nums,valueToShift));
	}
}
