package wz.dp;

import java.util.*;

/**
 * LIS 最长递增子序列
 *
 * @author wz
 * @date 2016年04月26日 22:09
 */
public class LIS {
    private int[] length;

    public int[] LIS(int[] arr){
        int longest = 1;
        Stack<Integer> indexStack = new Stack<>();
        int[] len = new int[arr.length],res;
        len[0]=1;
        for (int i = 1; i < arr.length; i++) {
            len[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j]&& len[i]<len[j]+1){
                    len[i] = len[j]+1;
                    if (longest<len[i])
                        longest = len[i];
                }
            }
        }
        for (int i=arr.length-1; i>=0; i--){
            if (len[i]==longest){
                indexStack.push(i);
                longest--;
            }
        }

        res = new int[indexStack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[indexStack.pop()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = new LIS().LIS(new int[]{3 ,5, 7, 2 ,4 ,6 ,8 ,10, 12, 19});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
