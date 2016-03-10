package wz.leetcode.problem110;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月08日 12:31
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        return dfsHeight(root)!=-2;
    }
    public int dfsHeight(TreeNode root){
        if (root==null)
            return 0;
        int left = dfsHeight(root.left);
        if (left == -2)
            return -2;
        int right = dfsHeight(root.right);
        if (right == -2)
            return -2;
        if (left-right>1||left-right<-1)
            return -2;
        return left>right?(left+1):(right+1);
    }
}
