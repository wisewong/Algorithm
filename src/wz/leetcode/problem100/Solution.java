package wz.leetcode.problem100;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月10日 20:08
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null)
            return true;
        if (p!=null && q!=null && p.val == q.val)
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        return false;
    }
}
