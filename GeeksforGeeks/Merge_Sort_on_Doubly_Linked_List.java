/* Link - https://www.geeksforgeeks.org/problems/merge-sort-on-doubly-linked-list/1 */


/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class Solution {
    // Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head) {
        // add your code here
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node l1 = sortDoubly(head);
        Node l2 = sortDoubly(mid);
        return merge(l1, l2);
    }
    static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow.next;
        slow.next = null;
        mid.prev = null; 
        return mid;
    }
    static Node merge(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        Node dummyHead = new Node(-1);
        Node tail = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                l1.prev = tail;
                tail.next = l1;
                l1 = l1.next;
            } else {
                l2.prev = tail;
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) {
            l1.prev = tail;
            tail.next = l1;
        }
        if (l2 != null) {
            l2.prev = tail;
            tail.next = l2;
        }
        Node head = dummyHead.next;
        head.prev = null;
        return head;
    }
}
