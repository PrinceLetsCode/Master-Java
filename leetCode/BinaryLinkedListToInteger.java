package leetCode;

public class BinaryLinkedListToInteger {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        System.out.println(getDecimalValue(head));
        System.out.println(getDecimalValue2(head));
    }
    public static int getDecimalValue(ListNode head) {
        int ans=0;
        while (head!=null){
            ans=ans*2+head.val;
            head=head.next;
        }
        return ans;
    }
    public static int getDecimalValue2(ListNode head) {
        int ans=0;
        while (head!=null){
            ans=(ans<<1) | head.val;
            head=head.next;
        }
        return ans;
    }
}
