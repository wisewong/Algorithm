package wz.leetcode.problem96;

/**
 * Solution
 *
 * @author wz
 * @date 2016年04月27日 21:54
 */
public class Solution {
    public int numTrees(int n) {
        int[] G = new int[n+1];
        G[0] = G[1] = 1;
        for (int i=2;i<=n;i++){
            for (int j = 1;j<=i/2;j++)
                G[i]+=G[j-1]*G[i-j];
            if (i%2==0)
                G[i]=2*G[i];
            else
                G[i]=2*G[i]+G[i/2]*G[i/2];
        }
        return G[n];


//        int res = countTreeNums(0,n);
//        return res;
    }

    public int countTreeNums(int i,int j){
        if (i==j)
            return 1;
        int count = 0,left,right;
        for (int k = i; k < j; k++) {
            left = countTreeNums(i,k);
            right = countTreeNums(k+1,j);
            count+=left*right;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numTrees(3));
    }
}
