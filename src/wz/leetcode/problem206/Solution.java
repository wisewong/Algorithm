package wz.leetcode.problem206;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月09日 22:31
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return null;
        ListNode node = head.next,preNode = head;
        ListNode temp;
        preNode.next = null;
        while (node!=null){
            temp = node.next;
            node.next = preNode;
            preNode = node;
            node = temp;
        }
        return preNode;
    }
}
