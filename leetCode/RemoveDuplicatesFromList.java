package leetCode;

public class RemoveDuplicatesFromList {

    public Node removeDuplicate(Node head)
    {
        if(head==null){
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }

}
