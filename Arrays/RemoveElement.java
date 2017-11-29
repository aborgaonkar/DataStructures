/*  Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2. */

package Arrays;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) 
    {
       int i = 0 ,j = 0, count = 0;
        while(j< nums.length)
        {
            if(nums[j] == val)
            {
                j++;
                count++;
            }
            else if(nums[j] != val)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
    }
        return nums.length -count;
    }
	
	public static void main(String args[]) {
		int[] nums = {3,2,2,3};
		int val = 3;
		int result = removeElement(nums, val);
		System.out.println("The length of the array after removing the element is: "+result);
	}
}
