package leetCode;

import java.util.HashSet;

public class LinkedListCycle {

    // this works only if there is only one pair of duplicate elements and requires extra space.
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        HashSet<Integer> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head.val))
                return true;
            else
                set.add(head.val);

            head = head.next;
        }
        return false;
    }

    // this works for all cases and does not require extra space.
    public static boolean hashCycle(ListNode head) {
        if (head == null || head.next == null)  // if the head is null or the head.next is null then there is no cycle
            return false;

        ListNode slowPointer = head;  // create a slow pointer and point it to the head, it will move one step at a time
        ListNode fastPointer = head.next; // create a fast pointer and point it to the head.next, it will move two steps at a time.

        // while the fast pointer is not null and the fast pointer.next is not null
        while (fastPointer != null && fastPointer.next != null) {
            if (fastPointer == slowPointer) // if the fast pointer and the slow pointer are pointing to the same node then there is a cycle
                return true; // return true as there is a cycle
            fastPointer = fastPointer.next.next; // move the fast pointer two steps
            slowPointer = slowPointer.next; // move the slow pointer one step
        }
        return false; // if the fast pointer is null or the fast pointer.next is null then there is no cycle
    }

    public static void main(String[] args) {

    }
}
