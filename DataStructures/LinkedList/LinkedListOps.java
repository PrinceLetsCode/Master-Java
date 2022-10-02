package DataStructures.LinkedList;

import java.util.Stack;

public class LinkedListOps {

    static Node head;

    public static void add_node_at_end(int val) {
        if (head == null) {
            head = new Node(val, null);
        }else {
            Node temp=head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(val, null);
        }
    }

    public static void add_node_at_start(int val) {
        if (head == null) {
            head = new Node(val, null);
        }else {
            Node newNode= new Node(val);
            newNode.next = head;
            head = newNode;
        }
    }


    public static void add_node_at_position(int val, int pos) {
        if (head == null) {
            head = new Node(val);
        } else if (pos == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
        else {
             Node temp=head;
            while (pos != 2 && temp.next != null) {
                temp = temp.next;
                pos--;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public static void display_list() {
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void display_list_reverse_recursion(Node temp) {
        if (temp == null) {
            return;
        }

        display_list_reverse_recursion(temp.next);
        System.out.print(temp.val + " -> ");
    }

    public static void display_list_reverse_stack() {
        Stack<Integer> stack = new Stack<>();
        Node temp=head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " -> ");
        }
    }

    public static void main(String[] args) {
        add_node_at_end(1);
        add_node_at_end(2);
        add_node_at_end(3);
        add_node_at_end(4);
        display_list();
        add_node_at_start(0);
        System.out.println();
        display_list();
        add_node_at_position(7, 4);
        System.out.println();
        display_list();
        System.out.println();
        display_list_reverse_recursion(head);
        System.out.println();
        display_list_reverse_stack();
    }

}
