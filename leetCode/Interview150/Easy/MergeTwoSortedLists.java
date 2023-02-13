package leetCode.Interview150.Easy;

import DataStructures.LinkedList.Node;
import leetCode.ListNode;


public class MergeTwoSortedLists {

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            // if both lists are empty return null
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }


            // create a head node and point it to list 1.
            ListNode head = list1;

            // if list1.value is greater than list2.value then make the head point to the list2
            if (list1.val > list2.val) {
                head=list2;
                list2 = list2.next;
            }
            else {  // else make the head point to list1 and move list1 to the next node
                list1 = list1.next;
            }

            // create a temp node and point it to the head
            ListNode current = head;


            // while both lists are not empty
            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) { // if list1.value is greater than list2.value then make the current.next point to the list2.
                    current.next = list2;
                    list2 = list2.next; // move list2 to the next node
                }
                else { // else make the current.next point to list1 and move list1 to the next node
                    current.next = list1;
                    list1 = list1.next;
                }
                current = current.next; // move current to the next node
            }

            // if list1 is empty then make the current.next point to list1
            if (list1 != null) {
                current.next = list1;
            }
            else { // else make the current.next point to list2
                current.next = list2;
            }

            // return the head
            return head;
        }

    public static void display_list(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode head_1 = new ListNode(1);
        head_1.next = new ListNode(2);
        head_1.next.next = new ListNode(4);

        ListNode head_2 = new ListNode(1);
        head_2.next = new ListNode(3);
        head_2.next.next = new ListNode(4);

        display_list(head_1);
        System.out.println();
        display_list(head_2);

        mergeTwoLists(head_1,head_2);

        System.out.println();
        display_list(head_1);


    }
}
