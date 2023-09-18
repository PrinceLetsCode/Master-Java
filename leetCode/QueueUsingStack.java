package leetCode;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (stack1.empty()) {
            return -1;
        }

        while (!stack1.empty()) {
            int temp = stack1.pop();
            stack2.push(temp);
        }


        int top = stack2.pop();

        while (!stack2.empty()) {
            int temp = stack2.pop();
            stack1.push(temp);
        }


        return top;
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        System.out.println(queue.stack1);
    }
}
