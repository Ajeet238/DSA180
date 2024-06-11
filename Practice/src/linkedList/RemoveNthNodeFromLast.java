package linkedList;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1272636883/
public class RemoveNthNodeFromLast {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        ListNode slow = head;
	        ListNode fast = head;
	         if(head == null){
	            return null;
	         }
	         if(head.next == null && n== 1){
	            return null;
	         }
	         if(head.next == null){
	            return head;
	         }
	        int count = 0;

	        while(count < n){
	            fast = fast.next;
	            count++;
	        }
	        if(fast == null){
	            return head.next;
	        }
	        while(fast.next!= null){
	            slow = slow.next;
	            fast = fast.next;
	           
	        }
	       
	          slow.next = slow.next.next;
	            
	        
	        return head;
	    }
}
