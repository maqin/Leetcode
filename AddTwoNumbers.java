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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      if (l1 == null)
			  return l2;
		  if (l2 == null)
			  return l1;
		  int token = 0;
		  ListNode dummy = new ListNode(-1);
		  ListNode head = dummy;
		  while (l1 != null || l2 != null) {
			  int value = 0;
			  if (l1 != null && l2 != null)
				  value = l1.val + l2.val + token;
			  else if (l1 == null)
				  value = l2.val + token;
			  else if (l2 == null)
				  value = l1.val + token;

			  int tmp = value % 10;
			  token = value / 10;
			  ListNode newNode = new ListNode(tmp);
			  head.next = newNode;
			  head = head.next;
			  l1 = l1 == null ? null : l1.next;
			  l2 = l2 == null ? null : l2.next;
		  }
        if(token==1){
			    ListNode newNode = new ListNode(1);
			    head.next=newNode;
		  }
		  return dummy.next;
    }
}
