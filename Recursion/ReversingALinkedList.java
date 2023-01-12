package Recursion;

import leetCode.ListNode;

import java.util.List;

public class ReversingALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
//        ListNode resultHead= reverseList_Iterative_1(head);
//        printList(resultHead);
//        ListNode resultHead2= reverseList_Iterative_2(head);
        ListNode resultHead3 = reverse_Recursive(head, null, head);
        printList(resultHead3);

    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode reverseList_Iterative_1(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    private static ListNode reverseList_Iterative_2(ListNode head) {

        ListNode prev = head;
        ListNode cur = head.next;
        ListNode next = cur.next;
        while (next != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        cur.next = prev;
        head.next = null;
        return cur;
    }

    private static ListNode reverse_Recursive(ListNode head, ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }
        ListNode temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = temp;
        return reverse_Recursive(head, prev, cur);
    }


}
