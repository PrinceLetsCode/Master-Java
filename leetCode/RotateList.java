package leetCode;

public class RotateList {

    // Brute force solution
    // Time complexity: O(n*k)
    // Space complexity: O(1)
    public static ListNode rotateRight(ListNode head, int k) {
        // If the list is empty or has only one element, return the list
        if(head==null || head.next==null || k==0) return head;

        // run the loop k times
        while (k>0){

            // store head in temp
            ListNode temp = head;

            // traverse till second last node
            while (temp.next.next!=null){
                temp=temp.next;
            }
            // point last node to head
            temp.next.next=head;
            // point head to last node
            head=temp.next;
            // point second last node to null
            temp.next=null;
            // decrement k
            k--;
        }
        // return head
        return head;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }


    // Time complexity: O(n)
    // Space complexity: O(1)
    // This solution is based on the fact that if we rotate the list k times, the list will be rotated k%n times,
    // where n is the length of the list
    public  static ListNode rotateRight2(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;

        // store head in temp
        ListNode temp = head;

        // find the length of the list and store it in count.
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }

        // if k is greater than count, then we need to rotate the list k%count times
        // if k is less than count, then we need to rotate the list k times
        k=k%count;

        // if k is equal to count, then the list will not be rotated at all
        if (k==0) return head;

        // traverse till (count-k-1)th node
        ListNode temp2 = head;
        while (k>0){
            temp2=temp2.next;
            k--;
        }

        // store the (count-k)th node in temp3
        ListNode temp3 = head;
        // traverse till last node
        while (temp2.next!=null){
            temp2 = temp2.next; // traverse till last node
            temp3 = temp3.next; // traverse till (count-k)th node
        }
        // point last node to head
        temp2.next=head;
        // point head to (count-k+1)th node
        head=temp3.next;
        // point (count-k)th node to null
        temp3.next=null;
        // return head
        return head;
    }



    // Time complexity: O(n)
    // Space complexity: O(1)
    // This solution is based on the fact that if we rotate the list k times, the list will be rotated k%n times,
    public static ListNode rotateRight3(ListNode head, int k) {
        if(head == null || k<=0 || head.next==null) return head;

        // store head in newTail
        ListNode newTail = head;
        // store head in temp
        ListNode temp = head;

        // find the length of the list and store it in len.
        int len = 1;

        // traverse till last node
        while(newTail.next != null){
            newTail = newTail.next;
            len++;
        }

        // if k is greater than len, then we need to rotate the list k%len times
        // if k is less than len, then we need to rotate the list k times
        // if k is equal to len, then the list will not be rotated at all
        k = len - k%len;

        // traverse till (k-1)th node
        for(int i = 1; i<k; i++){
            temp = temp.next;
        }

        // point last node to head
        newTail.next = head;
        // point head to kth node
        head = temp.next;
        // point (k-1)th node to null
        temp.next = null;
        // return head
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(5);
        display(rotateRight2(node,2));
    }
}
