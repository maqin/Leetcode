/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow = head;
		ListNode fast = head;
		while(true){
			fast = fast.next;
			if(fast==null) return null;
			fast = fast.next;
			if(fast==null) return null;
			slow = slow.next;
			if(fast==slow)
				break;
		}
		fast = head;
		while(true){
		    if(fast==slow) break;
			fast=fast.next;
			slow = slow.next;
		}
		//System.out.println(slow.val);
		return slow;
    }
}
