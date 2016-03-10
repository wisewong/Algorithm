package wz.leetcode.problem268;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月05日 21:51
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int total = (1+nums.length)*nums.length/2;
        for (int i = 0; i < nums.length; i++)
            total-=nums[i];
        return total;
    }
}
