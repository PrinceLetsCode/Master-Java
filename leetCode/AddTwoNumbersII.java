package leetCode;

import java.util.Stack;

public class AddTwoNumbersII {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode result = addTwoNumbers(l1, l2);
        
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // reverse both lists
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode result = new ListNode(0);
        ListNode curr = result;

        int carry = 0;
        int sum = 0;

        while (l1 != null || l2 != null) {
            sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return reverseList(result.next);


    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }



    // Optimized solution using stack
    // time complexity: O(n)
    // space complexity: O(n)

    private static ListNode addTwoNumbersOptimized(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        ListNode result = new ListNode(0);


        int carry = 0;

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = carry;

            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }

            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }

            result.val = sum % 10;
            carry = sum / 10;

            ListNode head = new ListNode(carry);
            head.next = result;
            result = head;
        }

        return result.val == 0 ? result.next : result;
    }
}

