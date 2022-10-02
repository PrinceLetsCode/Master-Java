package leetCode;

public class AddTwoNumbers {

    // add function take two linked-Lists and adds their values and returns a new linked-list with the result of the addition.
    public static Node add(Node list1, Node list2) {

        //n1 storing the address of list1.
        //n2 storing the address of list2.
        //head stores the address of new linked-list which will hold the result.
        //cur is for traversing the new linked-list.
        Node n1=list1,n2=list2,head,cur;

        //initiating the new linked-list with value of first node as 0;
        //head and cur both pointing the same node.
        head = cur = new Node(0);

        //carry holds the carry of the sum.
        //rem holds the remainder of the sum.
        //sum as name suggests stores tne sum.
        int carry=0,rem=0,sum=0;

        //loop will run till both the linked-lists are not null otr the carry is not 0.
        while(n1 != null || n2 != null || carry != 0)
        {
            //if n1 and n2 is not null then add its value to sum along with the carry.
            sum = (n1 != null ? n1.val:0) + (n2 != null? n2.val:0) + carry;

            //if sum is greater than 9 then carry will be 1.
            carry = sum/10;

            //remainder will be sum%10
            rem = sum%10;

            //creating a new node with value as remainder.
            cur = cur.next = new Node(rem);

            //if n1 is not null then move to next node.
            n1 = (n1==null?null:n1.next);

            //if n2 is not null then move to next node.
            n2 = (n2==null?null:n2.next);
        }

        //returning the address of new linked-list.
        //head.next because head is pointing to 0.
        return (head.next==null?null:head.next);
    }

    //display function takes the address of the linked-list and displays it.
    public static void display_list(Node head) {
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node list1 = new Node(); //creating a new linked-list list1.
        Node list2 = new Node(); //creating a new linked-list list2.

        list1.val=2; //adding value 2 to list1.
        list1.next = new Node(4); //adding value 4 to next node of list1.
        list1.next.next = new Node(3); //adding value 3 to next node of list1.

        list2.val=5; //adding value 5 to list2.
        list2.next = new Node(6);  //adding value 6 to next node of list2.
        list2.next.next = new Node(4); //adding value 4 to next node of list2.
        Node result = add(list1, list2); //adding list1 and list2 and storing the result in result.
        display_list(result);      //displaying the result.
    }
}
