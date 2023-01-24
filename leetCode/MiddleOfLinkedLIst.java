package leetCode;

public class MiddleOfLinkedLIst {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println(middleNode(head));
    }
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2;
        int i = 0;
        while (i < mid) {
            head = head.next;
            i++;
        }
        return head;
    }

    public static ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while ( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
