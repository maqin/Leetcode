public static ListNode partition(ListNode head, int x){
		ListNode n = new ListNode(0);
		n.next = head;
		ListNode pre = n;
		ListNode cur = n;
		
			while(pre.next!=null && pre.next.val<x){
				pre = pre.next;
				cur = cur.next;
			}
			
			while(cur!=null&&cur.next!=null){
				if(cur.next.val<x){
					//move element to pre.next
					ListNode t1 = pre.next;					
					ListNode t3 = cur.next;
					cur.next = cur.next.next;					
					pre.next = t3;
					t3.next = t1;					
					pre = pre.next;					
				}else{
					cur=cur.next;
				}
			}		
		return n.next;
	}
