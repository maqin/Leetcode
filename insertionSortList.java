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
    public ListNode insertionSortList(ListNode head) {
        ListNode d = new ListNode(-1);
		d.next = head;
		head = d;
		ListNode slow = head;
		for(ListNode cur = head; cur!=null && cur.next!=null; cur=cur.next){
			
			for(ListNode pre = head; pre!=cur; pre=pre.next){
				
				if(cur.next.val<pre.next.val){
					ListNode t1 = pre.next;
					ListNode t2 = new ListNode(cur.next.val);
					pre.next = t2;
					t2.next = t1;
					cur.next = cur.next.next;
					cur = slow;
					break;
				}	
			}
			slow = cur;
		}
		return head.next;
    }
}
