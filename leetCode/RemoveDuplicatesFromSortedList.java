package leetCode;

public class RemoveDuplicatesFromSortedList {


    private static ListNode deleteDuplicates(ListNode list) {

        if (list==null) return null;
        ListNode cur=list;
        while (cur.next!=null) {
            if (cur.val==cur.next.val) {
                cur.next=cur.next.next;
            } else {
                cur=cur.next;
            }
        }

        return list;
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
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(3);
        list.next.next.next.next.next = new ListNode(4);

        ListNode res=deleteDuplicates(list);
        display_list(res);
    }


}
