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
    public int pairSum(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next !=null) {
           slow = slow.next;
           fast = fast.next.next;
        }

        ListNode reverseListNode = reverseListNode(slow.next);
        
        ListNode left = head;
        ListNode right = reverseListNode;
        
        int max = 0;
        while (right != null) {
            int sum = left.val + right.val;
            max = Math.max(max, sum);

            left = left.next;
            right = right.next;
        }

        return max;
    }

    public ListNode reverseListNode(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;

        while (curr!=null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }
}