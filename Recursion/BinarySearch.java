package Recursion;

public class BinarySearch {
	public static int binarySearch(int[] nums, int target, int start, int end) {
		if(start <= end) {
			int middle = (start+end)/2;
			if(nums[middle] > target) {
				return binarySearch(nums, target, start, middle -1);
			}else if(nums[middle] < target){
				return binarySearch(nums, target, middle + 1, end);
			}else {
				return middle;
			}
		}else {
			return -1;
		}
		
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int target = 4;
		int start = 0;
		int end = nums.length-1;
		System.out.println(binarySearch(nums, target, start, end));
	}
}
