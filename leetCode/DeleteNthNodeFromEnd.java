package leetCode;

import DataStructures.LinkedList.Node;

import java.util.List;

public  class DeleteNthNodeFromEnd {

    // Time complexity: O(n)
    public static ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode temp_head=head;

        int count=0;
        while(temp_head!=null){
            count++;
            temp_head = temp_head.next;
        }
//        System.out.println(count);

        if (n == count) {
            head=head.next;
            return head;
        }

        else {
            int pos = count - n;
            ListNode temp_head_2 = head;

            while (pos != 1) {
                temp_head_2 = temp_head_2.next;
                pos--;
            }

//        System.out.println(temp_head_2.val);

            temp_head_2.next = temp_head_2.next.next;
        }

        return head;

    }

    //Two pointer approach.
    // Time complexity : O(L). The algorithm makes one traversal of the list of L nodes. Therefore time complexity is O(L).
    public ListNode removeNthFromEnd_1(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;

        while(n > 0) {
            right = right.next;
            n -= 1;
        }

        while(right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummy.next;

    }

    public static void display_list(ListNode head) {
        ListNode temp=head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head=removeNthFromEnd(head, 5);
        display_list(head);


    }
}
