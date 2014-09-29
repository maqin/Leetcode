/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newNode = new ListNode(-1);
        newNode.next = head;
        head = newNode;
        ListNode fast = head;
        ListNode slow = head;
        while(n>0){
            fast = fast.next;
            n--;
        }
        for(; fast.next!=null; fast=fast.next)
            slow = slow.next;
        slow.next = slow.next.next;
        return head.next;
    }
}
