package wz.leetcode.problem258;

/**
 * Solution
 *
 * @author wz
 * @date 2016年04月13日 14:05
 */
public class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        if (num % 9 ==0)
            return 9;
        return num % 9;

//        int res = 0;
//        while (num!=0){
//            res+=num%10;
//            num /= 10;
//        }
//
//        if (res<10)
//            return res;
//        return addDigits(res);
//        int res = 0;
//        while (true){
//            res += num%10;
//            num /= 10;
//            if (num == 0){
//                if (res<10)
//                    break;
//                num = res;
//                res = 0;
//            }
//        }
//        return res;
    }
}
