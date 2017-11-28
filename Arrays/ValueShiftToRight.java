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
		int[] nums = {1,0,2,0,0,0,9,3,0};
		int valueToShift = 0;
		System.out.println(shiftValuesToRight(nums,valueToShift));
	}
}
