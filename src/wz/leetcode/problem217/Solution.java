package wz.leetcode.problem217;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月10日 20:29
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            if (!set.add(nums[i]))
                return true;
        return false;


//        int temp;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            temp = nums[i];
//            if (map.containsKey(temp))
//                return true;
//            map.put(temp,i);
//        }
//        return false;
    }
}
