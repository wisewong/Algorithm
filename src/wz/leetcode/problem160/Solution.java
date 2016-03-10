package wz.leetcode.problem160;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月09日 22:31
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aNode = headA,bNode = headB;
        int aLength = 0,bLength = 0;
        if (headA==null || headB==null)
            return null;
        while (aNode!=null && bNode!=null){
            aNode = aNode.next;
            aLength++;
            bNode = bNode.next;
            bLength++;
        }

        while (aNode!=null){
            aNode = aNode.next;
            aLength++;
        }

        while (bNode!=null){
            bNode = bNode.next;
            bLength++;
        }
        aNode = headA;
        bNode = headB;
        int sub = aLength>bLength?(aLength-bLength):(bLength-aLength);
        if (aLength>bLength){
            for (int i = 0; i < sub; i++)
                aNode = aNode.next;
        }else if (aLength<bLength){
            for (int i = 0; i < sub; i++)
                bNode = bNode.next;
        }
        while (aNode!=bNode){
            aNode = aNode.next;
            bNode = bNode.next;
        }
        return aNode;
    }
}
