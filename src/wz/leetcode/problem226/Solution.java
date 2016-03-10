package wz.leetcode.problem226;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月10日 19:57
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        if (root.left!=null)
            invertTree(root.left);
        if (root.right!=null)
            invertTree(root.right);
        return root;
    }
}
