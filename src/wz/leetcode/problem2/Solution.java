package wz.leetcode.problem2;

/**
 * Solution
 *
 * @author wz
 * @date 2016年02月29日 22:31
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null, preNode = null;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode node = new ListNode(carry);
            if (l1 != null) {
                node.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                node.val += l2.val;
                l2 = l2.next;
            }

            carry = node.val / 10;
            node.val %= 10;

            if (preNode == null)
                head = node;
            else
                preNode.next = node;
            preNode = node;
        }
        return head;
    }
}
