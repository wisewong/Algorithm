package wz.leetcode.problem28;

import java.util.Map;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月06日 10:22
 */
public class Solution {
    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);

        if (needle.length() == 0)
            return 0;
        if (haystack.length()<needle.length())
            return -1;
        int []next = new int[needle.length()];
        int i = 0,j = -1;next[0] = -1;
        while (i<needle.length()-1){
            if (j==-1 || needle.charAt(i) == needle.charAt(j)){
//                改进前:
//                next[++i] = ++j;

//                改进后:
                if (needle.charAt(i+1)!=needle.charAt(j+1))
                    next[++i] = ++j;
                else
                    next[++i] = next[++j];

            }
            else
                j=next[j];
        }
        i=0;j=0;
        while (i<haystack.length() && j<needle.length()){
            if (j==-1 || (haystack.charAt(i) == needle.charAt(j))){
                ++i;
                ++j;
            }else
                j = next[j];
        }
        if (j>=needle.length())
            return i - needle.length();
        return -1;
    }

}
