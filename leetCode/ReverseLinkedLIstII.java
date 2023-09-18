package leetCode;

public class ReverseLinkedLIstII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next= new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next= new ListNode(10);




        ListNode result = reverseBetween(head, 4, 8);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        
    }

    private static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = dummy.next;

        for (int i = 1; i < left; i++) {
            pre = pre.next;
            cur = cur.next;
        }

        for (int i = 0; i < right - left; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }

        return dummy.next;

    }
}
