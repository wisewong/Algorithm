package wz.leetcode.problem83;

/**
 * Solution
 *
 * @author wz
 * @date 2016年06月14日 18:41
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null)
            return head;
        ListNode node = head;
        while (node.next!=null){
            if (node.val == node.next.val)
                node.next=node.next.next;
            else
                node = node.next;
        }
        return head;
    }
}
