package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/contains-duplicate/

public class task4 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}