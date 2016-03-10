package wz.leetcode.problem171;

/**
 * Solution
 *
 * @author wz
 * @date 2016年04月24日 21:42
 */
public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++)
            result = result*26 + s.charAt(i)-'A'+1;
        return result;
    }
}
