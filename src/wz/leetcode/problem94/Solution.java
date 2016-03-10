package wz.leetcode.problem94;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月09日 22:52
 */
public class Solution {
    List<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null)
            return res;
        if (root.left!=null)
            inorderTraversal(root.left);
        res.add(root.val);
        if (root.right!=null)
            inorderTraversal(root.right);
        return res;
    }
}
