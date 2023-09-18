package DataStructures.stack;

import java.util.List;

public class MinStack {
    class Node {
        int val;
        int min;
        Node next;}

        Node top;

    public MinStack() {
        this.top = null;
    }

    public void push(int val) {
        Node newNode = new Node();
        newNode.val = val;
        newNode.min = Math.min(val, getMin());
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top == null) {
            return;
        }
        top = top.next;
    }

    private int getMin() {
        if (top == null) {
            return Integer.MAX_VALUE;
        }
        return top.min;
    }

    public int top() {
        if (top == null) {
            return -1;
        }
        return top.val;
    }
}
