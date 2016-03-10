package wz.leetcode.problem19;

import wz.dp.LIS;

/**
 * Solution
 *
 * @author wz
 * @date 2016年06月14日 18:41
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head==null)
//            return head;
//        int count = 1;
//        ListNode preNode = head,backNode;
//        while (count<=n){
//            if (preNode.next==null)
//                break;
//            preNode=preNode.next;
//            count++;
//        }
//        if (count<=n)
//            return head.next;
//        backNode = head;
//        while (preNode.next!=null){
//            preNode = preNode.next;
//            backNode = backNode.next;
//        }
//
//        backNode.next = backNode.next.next;

        ListNode start = new ListNode(0),preNode = start, backNode = start;
        start.next = head;
        for (int i = 0; i < n; i++)
            preNode = preNode.next;

        while (preNode.next!=null){
            preNode = preNode.next;
            backNode = backNode.next;
        }

        backNode.next = backNode.next.next;

        return start.next;
    }
}
