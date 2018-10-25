package InterviewBit;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {9,9};
        int[] result = plusOne(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] plusOne(int[] nums) {
        for(int i = nums.length-1; i >= 0 ; i--){
            if(nums[i] < 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }

        int[] newNumber = new int[nums.length+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
