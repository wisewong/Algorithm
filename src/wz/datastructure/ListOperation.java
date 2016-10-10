package wz.datastructure;

import java.util.Stack;

/**
 * ListOperation
 * 链表操作
 *
 * @author wz
 * @date 16/10/10 10:55
 */
public class ListOperation {

    /**
     * 反转链表
     * @param head 头结点
     * @return 新的头结点
     */
    static Node reverseList(Node head){
        if (head == null) {
            return null;
        }

        Node pre = null,temp;
        while(head!=null){
            temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;

    }

    /**
     * 打印链表
     * @param head 头结点
     */
    static void printList(Node head){
        while (head!=null) {
            System.out.print(head.value+" ");
            head = head.next;
        }
    }


    /**
     * 逆序打印链表
     * @param head 头结点
     */
    static void reversePrint(Node head){
        Stack<Integer> stack = new Stack<>();
        while (head!=null) {
            stack.push(head.value);
            head = head.next;
        }
        while(stack.size()>0)
            System.out.print(stack.pop()+" ");
    }

}
