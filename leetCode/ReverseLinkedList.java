package leetCode;

import java.util.List;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        if (head==null) return null;

        //prev stores the address of previous node.
        ListNode prev = head;
        //cur stores the address of current node.
        ListNode cur = head.next;
        //next stores the address of next node.
        ListNode next = head.next.next;

        // performing the reversal of the linked-list.
        while (next != null) {  //loop will run till next is not null.
            cur.next = prev;  //changing the next of current node to previous node.
            prev = cur;      //moving the prev to current node.
            cur = next;      //moving the cur to next node.
            next = next.next; //moving the next to next node.
        }
        //changing the next of current node to previous node.
        cur.next = prev;
        head.next=null; //changing the next of head to null.
        head=cur; //changing the head to current node.

        //returning the address of new linked-list.
        return head;
    }

    public static void display_list(ListNode head) {
        ListNode temp=head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        ListNode list = new ListNode(1);

        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        ListNode res=reverseList(list);
        display_list(res);
    }
}
