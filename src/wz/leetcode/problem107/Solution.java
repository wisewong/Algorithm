package wz.leetcode.problem107;

import java.util.LinkedList;
import java.util.List;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月10日 18:16
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root==null)
            return res;
        List<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        nodes.add(null);
        List<Integer> subRes = new LinkedList<>();
        TreeNode node;
        while (!nodes.isEmpty()){
            node = nodes.remove(0);
            if (node==null ){
                res.add(0,subRes);
                subRes = new LinkedList<>();
                continue;
            }
            subRes.add(node.val);
            if (node.left!=null)
                nodes.add(node.left);
            if (node.right!=null)
                nodes.add(node.right);
            if (nodes.get(0)==null && nodes.size()>1)
                nodes.add(null);
        }
        return res;
    }
}
