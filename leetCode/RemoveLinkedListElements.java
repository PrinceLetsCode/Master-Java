package leetCode;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        // if the head is null return null
            if(head==null)
            return null;


        ListNode current=head; // create a current node and point it to the head
        ListNode prev=null; // create a prev node and point it to null, it will be used to point to the previous node of the current node.

        // while the current node is not null
        while(current!=null)
        {
            // if the current node value is equal to the val
            if(current.val==val)
            {
                // if the current node is the head then make the head point to the next node of the current node
                // because we are removing the current node from the list as it is equal to the val
                // this will ensure that the head is not pointing to the node which is equal to the val.
                // and also when all the nodes are equal to the val then the head will be null.
                if(prev==null)
                {
                    // make the head point to the next node of the current node
                    head=current.next;
                    current=current.next; // move the current node to the next node
                }
                else // current node is not the head
                {
                    prev.next=current.next; // make the prev node point to the next node of the current node
                    current=current.next;  // move the current node to the next node
                }
            }
            else  // if current node value is not equal to the val
            {
                prev=current; //make the prev node point to the current node
                current=current.next; // move the current node to the next node
            }
        }
        // return the head
        return head;
    }

    public static void main(String[] args) {

    }
}
