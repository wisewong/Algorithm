package wz.leetcode.problem129;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月06日 15:06
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int parent = 0;
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if (root==null)
            return 0;
        if (root.left==null && root.right==null){
            sum+=parent*10+root.val;
            return sum;
        }
        parent = parent*10 +root.val;
        if (root.left!=null)
            sumNumbers(root.left);
        if (root.right!=null)
            sumNumbers(root.right);
        parent = (parent - root.val) /10;
        return sum;
    }

    public static void main(String[] args) {
        int x=1000;
        int count = 0;
        while (x>0){
            count++;
            x = x&(x-1);
            System.out.println(x);
        }
        System.out.println(count);
    }
}
