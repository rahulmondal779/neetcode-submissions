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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int totalNode = 0;
        ListNode curr = head;

        while(curr!=null) {
            totalNode++;
            curr = curr.next;
        }

        if (totalNode == n) {
            return head.next;
        }

        int targetNode = totalNode - n;
        curr = head;

        for(int i = 1; i<targetNode; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
