package linkedList;

public class DeleteMiddleNode {
	 public ListNode deleteMiddle(ListNode head) {
	        ListNode fast = head;
	        ListNode slow = head;
	        ListNode prevSlow = head;

	        if(head == null || head.next == null){
	            return null;
	        }

	        while(fast != null && fast.next != null){
	            
	            // store the Node just prev then slow
	            prevSlow = slow;
	            slow = slow.next;
	            fast = fast.next.next;

	            if(fast == null || fast.next == null){
	               
	                prevSlow.next = prevSlow.next.next;
	                
	            }
	        }
	        return head;
	    }
}
