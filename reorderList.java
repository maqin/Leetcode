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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
    	ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null){
			fast = fast.next;
			fast = fast.next;
			if(fast==null) break;
			slow = slow.next;
		}

		ListNode newSlow = slow.next;
		slow.next = null;
		//print(head);
		slow = newSlow;
		//reverse slow -> end
		//print(slow);
		ListNode pre = null;
		ListNode cur = slow;
		while(cur!=null){			
			ListNode tmp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = tmp;
		}
		ListNode newHead1 = head;
		ListNode newHead2 = pre;
		while(newHead1!=null&& newHead2!=null){
			ListNode p1 = newHead1.next;
			ListNode p2 = newHead2.next;
			newHead1.next = newHead2;
			newHead2.next = p1;
			newHead1 = p1;
			newHead2 = p2;
		}
		//print(head);
	}
}
