/*  Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

import java.util.Arrays;

public class singlenumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int k = singleNumber(nums);
        System.out.println(k);
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i=i+2)
        {
            if(nums[i] != nums[i-1])
            {
                return nums[i-1];
            }
        }
        return nums[nums.length - 1];
    }
}
