package wz.leetcode.problem8;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月03日 14:43
 */
public class Solution {
    public int myAtoi(String str) {
        if(str.length()==0)
            return 0;
        int sign = 1,res = 0,temp=res;
        if (str.charAt(0)=='-')
            sign = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)<='9' && str.charAt(i)>='0'){
                temp = res;
                res = res*10 +str.charAt(i)-'0';
                if (temp>res)
                    return Integer.MAX_VALUE;
            }
        }
        return res*sign;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.myAtoi("6666666666666");
    }
}
