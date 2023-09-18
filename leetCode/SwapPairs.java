package leetCode;

public class SwapPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next= new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next= new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(11);

        ListNode result = swapPairs(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = dummy.next;

        while (cur != null && cur.next != null) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;

            pre = cur;
            cur = cur.next;
        }

        return dummy.next;
    }
}
