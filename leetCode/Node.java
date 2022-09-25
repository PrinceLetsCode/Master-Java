package leetCode;

public class Node {

    int val;
    Node next;
    Node head;

    Node(){}

    Node(int val) {
        this.val=val;
    }

    Node(int val, Node next) {
        this.val=val;
        this.next=next;
    }


    public static void main(String[] args) {
        Node node = new Node(4);
        node.head=node;
    }
}
