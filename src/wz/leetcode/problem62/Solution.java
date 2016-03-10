package wz.leetcode.problem62;

import java.util.ArrayList;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月08日 22:04
 */
public class Solution {
    public int uniquePaths(int m, int n) {

        double res = 1;
        for (int i = 1; i <= n - 1; i++) {
            res *= ((double) (m + i - 1) / (double) i);
        }
        return (int) Math.round(res);

//        int totalStep = m+n-2;
//        double res = 1,temp = 1;
//        for (int i = totalStep ; i>totalStep-m+1;i--)
//            res *= i;
//        for (int i = m-1;i>0;i--)
//            res /= i;
//        System.out.println(temp);
//        return (int) Math.round(res);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().uniquePaths(36,7));
        ArrayList a = new ArrayList();
        a.remove(0);
    }
}
