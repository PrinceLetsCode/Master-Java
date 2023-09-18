package DataStructures.stack;

public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        stack = new int[capacity];
    }

    boolean isFull(){
        if (top == capacity-1) {
            return  true;
        }
        return false;
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        }

        return false;
    }
    void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        top++;
        stack[top] = element;
    }

    int pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int element = stack[top];
        top--;
        return element;
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top];
    }

    void printStack(){
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return;
        }
        for(int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }


    int size(){
        return top+1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.printStack();
        stack.push(5);
        stack.push(6);

        System.out.println(stack.size());
        stack.printStack();
    }
}
