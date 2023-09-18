package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomPointer {
    public static void main(String[] args) {
        RandomNode node = new RandomNode(7);
        node.next = new RandomNode(13);
        node.next.next = new RandomNode(11);
        node.next.next.next = new RandomNode(10);
        node.next.next.next.next = new RandomNode(1);
        node.random = null;
        node.next.random = node;
        node.next.next.random = node.next.next.next.next;
        node.next.next.next.random = node.next.next;
        node.next.next.next.next.random = node;
        RandomNode copy = copyRandomList_mine(node);
        while (copy != null) {
            System.out.println(copy.val);
            copy = copy.next;
        }


    }

    /**
     * Copies a linked list of nodes with random pointers.
     * @param head The head of the linked list to be copied.
     * @return A copy of the linked list with separate nodes and random pointers.
     */
    private static RandomNode copyRandomList_git(RandomNode head) {
        // First step is to iterate through the original list and create a copy
        // of each node, inserting it after the corresponding node in the original list
        // We will store the copy as the "next" pointer of the original node
        RandomNode current = head;
        while (current != null) {
            RandomNode copy = new RandomNode(current.val); // Create a copy of the current node
            copy.next = current.next; // Set the next pointer of the copy to the next pointer of the original node
            current.next = copy; // Set the next pointer of the original node to the copy
            current = copy.next; // Move the pointer to the next node in the original list
        }

        // Second step is to set the random pointers of the copy nodes
        // The random pointer of each copy node is the next node of the random pointer
        // of the corresponding original node
        current = head;
        while (current != null) {
            if (current.random != null) { // Check if the original node has a random pointer
                current.next.random = current.random.next; // Set the random pointer of the copy node to the next node of the original random pointer
            }
            current = current.next.next; // Move the pointer to the next original node
        }

        // Third step is to separate the original list and the copy list
        // We will use the next pointers of both the original and the copy nodes
        RandomNode copyHead = new RandomNode(0); // Create a dummy node to store the head of the copy list
        RandomNode copyCurrent = copyHead; // Create a pointer to the dummy node
        current = head; // Reset the pointer to the head of the original list
        while (current != null) {
            copyCurrent.next = current.next; // Set the next pointer of the copy node to the next node of the original node
            copyCurrent = copyCurrent.next; // Move the pointer to the copy node
            current.next = current.next.next; // Set the next pointer of the original node to the next node of the copy node
            current = current.next; // Move the pointer to the next original node
        }

        // Finally, return the head of the copy list (excluding the dummy node)
        return copyHead.next;
    }





    /**
     * Copies a linked list of nodes with random pointers.
     * @param head The head of the linked list to be copied.
     * @return A copy of the linked list with separate nodes and random pointers.
     */
    private static RandomNode copyRandomList_mine(RandomNode head) {
        if (head == null) {
            return null;
        }
        Map<RandomNode, RandomNode> nodeMap = new HashMap<>();
        RandomNode newHead = new RandomNode(head.val);
        nodeMap.put(head, newHead);
        RandomNode tHead = head.next;
        RandomNode newTHead = newHead;
        // Create new nodes for each node in the old list, and store them in a map
        while (tHead != null) {
            RandomNode newNode = new RandomNode(tHead.val);
            nodeMap.put(tHead, newNode);
            newTHead.next = newNode;
            newTHead = newTHead.next;
            tHead = tHead.next;
        }
        // Reset pointers for the next loop
        tHead = head;
        newTHead = newHead;
        // Iterate through the old list again, setting the random pointers for each node
        while (tHead != null) {
            if (tHead.random != null) {
                newTHead.random = nodeMap.get(tHead.random);
            }
            tHead = tHead.next;
            newTHead = newTHead.next;
        }
        return newHead;
    }

}

