package wz.leetcode.problem66;

/**
 * Solution
 *
 * @author wz
 * @date 2016年04月18日 21:47
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length==0)
            return digits;

        int length = digits.length;
        digits[length-1] += 1;
        if (digits[length-1]<10)
            return digits;

        int carry = digits[length-1]/10;
        digits[length-1] %= 10;
        for (int i = length-2; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i]<10)
                return digits;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        if (carry == 0)
            return digits;
        int []res = new int[length+1];
        res[0] = 1;
        for (int i = 1; i < length + 1; i++)
            res[i] = digits[i-1];
        return res;
    }

    public static void main(String[] args) {
        new Solution().plusOne(new int[]{9,9,9});
    }
}
