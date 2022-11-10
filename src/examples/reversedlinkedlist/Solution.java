package reversedlinkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

class ListNode {
    public  int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next)
    { this.val = val; this.next = next; }
}