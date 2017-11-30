package Arrays;

public class FindNthTermFromTheEnd {
	public static int findNthTermFromTheEnd(int[] nums, int n) {
		int i = 0, j = n;
		while( j <= nums.length-1) {
			j++;
			i++;
		}
		return nums[i];
	}
	public static void main(String args[]) {
		int[] nums = {1,3,4,2,5,6,8,0,7,9};
		int n = 2;
		int result = findNthTermFromTheEnd(nums, n);
		System.out.println(result);
	}
}
