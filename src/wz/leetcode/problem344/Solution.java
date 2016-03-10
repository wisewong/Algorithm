package wz.leetcode.problem344;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月09日 22:27
 */
public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
