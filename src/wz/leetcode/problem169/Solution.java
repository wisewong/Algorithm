package wz.leetcode.problem169;

import java.util.Arrays;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月04日 16:03
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
