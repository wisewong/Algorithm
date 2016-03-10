package wz.leetcode.problem238;

import java.util.HashSet;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月04日 14:41
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int product = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            res[i] = 0;
            if (nums[i]!=0)
                product*=nums[i];
            else{
                set.add(i);
                if (set.size()>1)
                    break;
            }
        }

        if (set.size()>1)
            return res;

        if (set.size()==1){
            for(int i:set)
                res[i] = product;
            return res;
        }

        for (int i = 0; i < nums.length; i++)
            res[i] = product/nums[i];
        return res;
    }
}
