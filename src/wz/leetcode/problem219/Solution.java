package wz.leetcode.problem219;

import java.util.HashSet;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月06日 22:20
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set =new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i>k)
                set.remove(nums[i-k-1]);
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
