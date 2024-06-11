package linkedList;

public class RotateList {

	class Solution {
	    public ListNode rotateRight(ListNode head, int k) {
	        if(head == null || head.next == null ){
	            return head;
	        }
	       int len = 0;
	       ListNode temp = head;
	       
	       while(temp != null) {
	            len++;
	            temp = temp.next;
	       }
	     
	       if(k >= len){
	        k = k%len;
	       }
	         if(k == 0 || k == len){
	            return head;
	        }       
	        temp = head;
	        int index = len - k;

	        while(index > 1){
	            temp = temp.next;
	            index--;
	        }
	    
	        ListNode secondHead = temp.next;
	        ListNode storeSecondHead = temp.next;
	        ListNode prev = null;
	        temp.next = null;

	        while(secondHead != null){
	            prev = secondHead;
	            secondHead = secondHead.next;
	        }
	        if(prev != null){
	        prev.next = head;
	        }
	        return storeSecondHead;
	    }
	}
}
