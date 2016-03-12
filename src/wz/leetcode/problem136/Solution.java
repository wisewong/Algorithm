package wz.leetcode.problem136;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月12日 21:27
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++)
            res ^= nums[i];
        return res;

//        if (nums.length==0)
//            return 0;
//        Set<Integer> map = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.contains(nums[i]))
//                map.remove(nums[i]);
//            else
//                map.add(nums[i]);
//        }
//        return (int)map.toArray()[0];
    }
}
