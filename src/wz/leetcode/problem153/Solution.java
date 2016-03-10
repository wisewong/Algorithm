package wz.leetcode.problem153;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月08日 20:52
 */
public class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min<nums[i])
                min = nums[i];
        }
        return min;
    }
}
