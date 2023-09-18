package leetCode;

public class ReverseLinkedLIstAfterFirstElement {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode result = reverseList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head.next;
        while (current.next != null) {
            ListNode nextTemp = current.next;
            current.next = nextTemp.next;
            nextTemp.next = head.next;
            head.next = nextTemp;
        }
//        current.next = head;
//        ListNode temp = head.next;
//        head.next = null;
//        return temp;
//        uncomment all the code above and comment down the code below to reverse the whole list except the first element.
        return head;
    }
}
