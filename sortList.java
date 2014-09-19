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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
			return head;
		ListNode fast = head;
		ListNode slow = head;
		while(true){
			fast=fast.next;
			if(fast==null)
				break;
			fast=fast.next;
			if(fast==null)
				break;
			slow = slow.next;
		}
		ListNode right = slow.next;
		slow.next = null;
		ListNode leftNode = sortList(head);
		ListNode rightNode = sortList(right);
		ListNode newHead = new ListNode(0);
		ListNode cur = newHead;
		while(leftNode!=null || rightNode!=null){
			if(leftNode==null){
				cur.next = rightNode;
				break;
			}
			if(rightNode==null){
				cur.next = leftNode;
				break;
			}
			if(leftNode.val>rightNode.val){
				cur.next=new ListNode(rightNode.val);
				rightNode = rightNode.next;
				cur = cur.next;
				}
			else{
				cur.next=new ListNode(leftNode.val);
				leftNode = leftNode.next;
				cur = cur.next;
			}
			
		}
		return newHead.next;
    }
}
