package DataStructures.LinkedList;

public class Node {
    int val;
    public Node next;
    Node(){}
    public Node(int val){
        this.val=val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
