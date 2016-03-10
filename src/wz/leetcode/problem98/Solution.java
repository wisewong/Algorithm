package wz.leetcode.problem98;

import java.util.Stack;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月05日 9:15
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    Integer preVal = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        boolean res = isValidBST(root.left);

        if (preVal == null)
            preVal = root.val;
        else {
            res = res && (preVal < root.val);
            preVal = root.val;
        }
        return res && isValidBST(root.right);

//        TreeNode curNode;
//        Integer preValue = null,value;
//        Stack<TreeNode> treeNodes = new Stack<>();
//        treeNodes.push(root);
//        while (!treeNodes.empty()){
//            while (!treeNodes.empty() && treeNodes.lastElement()!=null)
//                treeNodes.push(treeNodes.lastElement().left);
//            treeNodes.pop(); //空指针退栈
//            if (!treeNodes.empty()){
//                curNode = treeNodes.pop();
//                if (preValue==null)
//                    preValue = curNode.val;
//                else {
//                    value = curNode.val;
//                    if (value<=preValue)
//                        return false;
//                    else
//                        preValue = value;
//                }
//                treeNodes.push(curNode.right);
//            }
//        }
//        return true;

    }
}
