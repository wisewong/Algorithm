package wz.datastructure;

import java.util.LinkedList;
import java.util.List;

/**
 * TreeOperation
 * 树的操作
 *
 * @author wz
 * @date 16/10/10 10:59
 */
public class TreeOperation {
    public static void main(String[] args) {
        TreeOperation treeOperation = new TreeOperation();
        int[] preOrder = new int[]{1,2,4,5,3}, inOrder = new int[]{4,2,5,1,3};
        TreeNode root = treeOperation.constructTreeNode(preOrder,inOrder,0,preOrder.length,0,inOrder.length);
        treeOperation.levelTraverse(root);


        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<Integer> res = treeOperation.inorderTraversal(root);
        for (Integer i : res) {
            System.out.println(i);
        }
    }

    /**
     * 由先序遍历和中序遍历结果构造二叉树
     * @param preOrder 先序遍历顺序
     * @param inOrder  中序遍历顺序
     * @param preStart  待构造二叉树的先序遍历结果的起始位置
     * @param preEnd  待构造二叉树的先序遍历结果的结束位置
     * @param inStart 待构造二叉树的中序遍历结果的起始位置
     * @param inEnd  待构造二叉树的中序遍历结果的结束位置
     * @return
     */
    public TreeNode constructTreeNode(int[] preOrder,int[] inOrder,int preStart,int preEnd,int inStart,int inEnd){
        if (preOrder == null || inOrder == null || preEnd-preStart<1 || inEnd-inStart<1 || preEnd-preStart!=inEnd-inStart) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);
        int count = 0;
        for (int i = inStart; i<inEnd ;i++ ) {
            if (inOrder[i] == preOrder[preStart])
                break;
            count++;
        }
        root.left = constructTreeNode(preOrder,inOrder,preStart+1,preStart+count+1,inStart,inStart+count);
        root.right = constructTreeNode(preOrder,inOrder,preStart+count+1,preEnd,inStart+count+1,inEnd);
        return root;
    }


    /**
     * 按层次遍历二叉树
     * @param root 根节点
     */
    public void levelTraverse(TreeNode root){
        if (root == null) {
            return;
        }

        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        // 使用null来区分一层结束
        list.add(null);

        TreeNode node;
        while(list.size()>0){
            node = list.pollFirst();
            // 一层遍历完
            if (node==null) {
                System.out.println();
                //下一层添加null标识
                if (list.size()>0)
                    list.add(null);
                continue;
            }
            System.out.print(node.value+" ");
            if (node.left!=null)
                list.add(node.left);
            if (node.right!=null)
                list.add(node.right);
        }
    }

    /**
     * 非递归中序遍历二叉树
     * @param root 根节点
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root){

        LinkedList<Integer> res = new LinkedList<>();
        if (root == null)
            return res;
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        TreeNode node = root;
        while (stack.size()>0) {

            while (node != null) {
                stack.add(node.left);
                node = node.left;
            }
            //移除栈顶的null
            stack.removeLast();
            if (stack.size()==0)
                return res;
            //取出栈顶元素，访问，将其右孩子节点放入栈顶
            node = stack.removeLast();
            res.add(node.value);
            node = node.right;
            stack.add(node);
        }
        return res;
    }

    /**
     * 求二叉树深度
     * @param root 根节点
     * @return 深度
     */
    public int depth(TreeNode root){
        if (root == null) {
            return 0;
        }

        return Math.max(depth(root.left),depth(root.right))+1;
    }


    /**
     * 判断是否为平衡二叉树
     * @param root 根节点
     * @return
     */
    public boolean judgeBalance(TreeNode root){
        if (root == null) {
            return true;
        }

        int res = isBalance(root);
        if (res==-2)
            return false;
        return true;
    }


    private int isBalance(TreeNode root){
        if (root == null) {
            return 0;
        }

        int left = isBalance(root.left);
        if (left==-2)
            return -2;
        int right = isBalance(root.right);
        if (right==-2)
            return -2;
        if (Math.abs(left-right)>1)
            return -2;

        return Math.max(left,right)+1;
    }

}
