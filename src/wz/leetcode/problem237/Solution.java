package wz.leetcode.problem237;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月09日 22:24
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
