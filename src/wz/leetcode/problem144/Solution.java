package wz.leetcode.problem144;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月11日 21:14
 */
public class Solution {
//    List<Integer> res = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root==null)
//            return res;
//        res.add(root.val);
//        if (root.left!=null)
//            preorderTraversal(root.left);
//        if (root.right!=null)
//            preorderTraversal(root.right);
//        return res;

        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode node;
        nodes.push(root);
        while (!nodes.empty()){
            node = nodes.pop();
            res.add(node.val);
            if (node.right!=null)
                nodes.push(node.right);
            if (node.left!=null)
                nodes.push(node.left);
        }
        return res;
    }
}
