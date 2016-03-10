package wz.leetcode.problem104;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月09日 12:43
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
//        if (root.left==null && root.right==null)
//            return 1;
        int left = root.left==null?0:(maxDepth(root.left));
        int right = root.right==null?0:(maxDepth(root.right));
        return Math.max(left,right)+1;
    }
}
