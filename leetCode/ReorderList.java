package leetCode;

public class ReorderList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        reorderList_optimized(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

//    Brute force

    private static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode tempHead = head;
        ListNode tail = head;
        while (tempHead != null) {
            while (tail.next != null && tail.next.next != null) {
                tail = tail.next;
            }
            if (tempHead == tail) {
                break;
            }
            ListNode lastNode = tail.next;
            tail.next = null;
            lastNode.next = tempHead.next;
            tempHead.next = lastNode;
            tempHead = tempHead.next.next;
            if (tempHead == null) {
                break;
            }
            tail = tempHead;
        }
    }

    //    Using fast and slow pointers
    public static void reorderList_optimized(ListNode head) {
        if (head == null || head.next == null) return;

        //Find the middle of the list
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;
        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1 = head;
        p2 = preMiddle.next;
        while (p1 != preMiddle) {
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMiddle.next;
        }
    }

}
