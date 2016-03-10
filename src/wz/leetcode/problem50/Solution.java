package wz.leetcode.problem50;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月07日 21:27
 */
public class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
//        if(n == 0)
//            return 1;
//        double res = myPow(x,n/2);
//        if(n%2==0)
//            return res*res;
//        if(n<0)
//            return res*res/x;
//        return res*res*x;
    }
}
