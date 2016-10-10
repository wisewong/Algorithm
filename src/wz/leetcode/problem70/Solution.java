package wz.leetcode.problem70;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月04日 21:49
 *
 * DP问题
 *
 * d(0) = 1
 * d(1) = 1
 * d(2) = d(2-1) + d(2-2)
 * d(3) = d(3-1) + d(3-2)
 * ……
 *
 */
public class Solution {
    public int climbStairs(int n) {

        if (n<=1)
            return 1;

        int oneStep=1,twoStep = 1,res = 0;

        for (int i = 2; i <= n; i++) {
            res = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = res;
        }

        return res;

//        if (n<=1)
//            return 1;
//        int[] res = new int[n+1];
//        res[0] = res[1] = 1;
//        for (int i = 2; i <= n; i++)
//            res[i] = res[i-1] + res[i-2];
//        return res[n];
    }
}
