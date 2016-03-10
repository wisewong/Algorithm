package wz.leetcode.problem203;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月09日 21:58
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode preNode = node;
        while (head!=null){
            if (head.val!=val){
                preNode.next = head;
                preNode = preNode.next;
            }
            head = head.next;
        }
        preNode.next = null;
        return node.next;
    }
}
