package wz.leetcode.problem9;

/**
 * Solution
 *
 * @author wz
 * @date 2016年02月27日 20:28
 */
public class Solution {
    public boolean isPalindrome(int x) {
        int temp = x,revertX = 0;
        while(temp>0){
            revertX = revertX*10 + temp%10;
            temp /= 10;
        }
        return revertX == x;
    }

    public static void main(String[] args) {

    }
}
