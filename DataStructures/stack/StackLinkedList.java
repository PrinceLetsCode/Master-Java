package DataStructures.stack;

public class StackLinkedList {

    class Node {
        int data;
        Node next;
    }

    Node top;

    public StackLinkedList() {
        this.top = null;
    }

    boolean isEmpty(){
        if (top == null) {
            return true;
        }
        return false;
    }

    void push(int element) {
        Node newNode =  new Node();
        newNode.data  = element;
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        int element =  top.data;
        top = top.next;
        return element;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        int element =  top.data;
        return element;
    }

    int size(){
        Node tempTop = top;
        int count = 0;

        while (tempTop != null) {
            count++;
            tempTop = tempTop.next;
        }

        return count;
    }


    void printStack(){
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return;
        }

        Node tempTop = top;
        while (tempTop != null) {
            System.out.print(tempTop.data + " ");
            tempTop = tempTop.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.printStack();
    }


}
