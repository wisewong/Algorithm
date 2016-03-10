package wz.leetcode.problem343;

/**
 * Solution
 * DP问题
 * r[n] = Max{ Max{r[i],i} * Max{r[i-j],i-j} }  i=3,4,5,...n  j = 2,3,4,...,i/2
 *
 * @author wz
 * @date 2016年04月29日 22:48
 */
public class Solution {
    public int integerBreak(int n) {
        int[] res = new int[n+1];
        res[1]=res[2] = 1;
        int a,b;
        for (int i = 3; i <= n ; i++) {
            res[i] = Math.max(res[i-1],i-1);
            for (int j = 2; j <= i / 2; j++) {
                a = Math.max(res[j],j);
                b = Math.max(res[i-j],i-j);
                if (a*b>res[i])
                    res[i] = a*b;
            }
        }
        return res[n];
    }
}
