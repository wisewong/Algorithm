package wz.leetcode.problem145;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月11日 22:11
 */
public class Solution {
//    List<Integer> res = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
//        if (root==null)
//            return res;
//        if (root.left!=null)
//            postorderTraversal(root.left);
//        if (root.right!=null)
//            postorderTraversal(root.right);
//        res.add(root.val);
//        return res;
        List<Integer> res = new LinkedList<>();
        if (root == null)
            return res;
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode node;
        nodes.push(root);
        while (!nodes.empty()){
            node = nodes.pop();
            res.add(0,node.val);
            if (node.left!=null)
                nodes.push(node.left);
            if (node.right!=null)
                nodes.push(node.right);
        }
        return res;
    }
}
