package wz.leetcode.problem202;

import java.util.HashSet;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月06日 22:05
 */
public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int temp,sum;
        while (set.add(n)){
            sum = 0;
            while (n>0){
                temp = n%10;
                sum+=temp*temp;
                n/=10;
            }
            if (sum==1)
                return true;
            n = sum;
        }
        return false;
    }
}
