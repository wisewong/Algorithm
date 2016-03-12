package wz.leetcode.problem242;

import java.util.HashMap;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月12日 21:52
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        int []temp = new int[26];
        for (int i = 0; i < s.length(); i++)
            temp[s.charAt(i)-'a']++;
        for (int i = 0; i < t.length(); i++)
            if (--temp[t.charAt(i)-'a']<0)
                return false;
        return true;
    }
}
