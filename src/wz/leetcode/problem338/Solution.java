package wz.leetcode.problem338;

/**
 * Solution
 * 动态规划(DP)
 * @author wz
 * @date 2016年04月12日 17:19
 */
public class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for (int i = 1; i <= num; i++)
            res[i] += res[i&(i-1)]+1;
        return res;
    }
}
