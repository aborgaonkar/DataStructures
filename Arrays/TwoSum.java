/* 
  
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */


package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	// twoSum using 2 pointer method
	
	public static int[] twoSum(int[] nums, int target) {
		int i = 0;
		int j = nums.length-1;
		int[] result = new int[2];
		while(i < nums.length && j > 0) {
			if(nums[i] + nums[j] == target) {
				result[0] = i;
				result[1] = j;
				break;
			}
			else if(nums[i] + nums[j] > target) {
				j--;
			}
			else if(nums[i] + nums[j] < target) {
				i++;
			}	
		}
		return result;
	}
	
	// twoSum using hashmap
	
	public static int[] twoSumWithHashmap(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int[] result = new int[2];
		for(int i = 0 ; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				result[0] = map.get(nums[i]);
				result[1] = i;
				break;
			}
			else {
				map.put(target-nums[i], i);
			}
		}
		
		
		return result;
		
	}
	
	public static void main(String args[]) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSumWithHashmap(nums,target)));
	}
	
}
