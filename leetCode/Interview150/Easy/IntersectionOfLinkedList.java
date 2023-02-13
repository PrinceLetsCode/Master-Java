package leetCode.Interview150.Easy;

import leetCode.ListNode;

public class IntersectionOfLinkedList {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;
        System.out.println(getIntersectionNode(headA, headB).val); // 8
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a == null) {
                a = headB;
            }
            else{
                a = a.next;
            }
            if (b == null){
                b = headA;
            }
            else{
                b = b.next;
            }
        }
        return a;
    }
}
