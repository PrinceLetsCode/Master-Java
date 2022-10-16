package leetCode;

import java.util.Stack;
public class MyQueue {
    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }

    public void display() {
        System.out.println(output);
    }


    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.display();
        queue.pop();
        queue.display();
        System.out.println(queue.peek());
//        queue.display();
//        queue.empty();
//        queue.display();
    }

}
