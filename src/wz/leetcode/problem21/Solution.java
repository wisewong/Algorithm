package wz.leetcode.problem21;


/**
 * Solution
 *
 * @author wz
 * @date 2016年03月04日 12:18
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2==null)
            return null;
        else if (l1==null)
            return l2;
        else if (l2 == null)
            return l1;
        ListNode head = new ListNode(0);
//        head.next = null;
//        if (l1.val<l2.val){
//            head.val = l1.val;
//            l1 = l1.next;
//        }else {
//            head.val = l2.val;
//            l2 = l2.next;
//        }

        ListNode cur = head;
        while (l1!=null && l2!=null ){
            ListNode node;
            if (l1.val<l2.val){
                node = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                node = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur.next = node;
            cur = cur.next;
        }
        if (l1!=null)
            cur.next =l1;
        if (l2!=null)
            cur.next = l2;
//        while(l1!=null){
//            ListNode node;
//            node = new ListNode(l1.val);
//            l1 = l1.next;
//            cur.next = node;
//            cur = cur.next;
//        }
//        while(l2!=null){
//            ListNode node;
//            node = new ListNode(l2.val);
//            l2 = l2.next;
//            cur.next = node;
//            cur = cur.next;
//        }
        return head.next;
    }
}








