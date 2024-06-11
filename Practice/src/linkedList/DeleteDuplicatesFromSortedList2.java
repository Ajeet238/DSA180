package linkedList;
// Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
//leaving only distinct numbers from the original list. Return the linked list sorted as well.

public class DeleteDuplicatesFromSortedList2 {
	

	 public ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null){
	            return head;
	        }
	        ListNode temp = head;
	        ListNode prev = null;
	        while(temp != null && temp.next != null){

	        if(temp.val == temp.next.val){

	            while(temp.next != null && temp.val == temp.next.val){
	                temp = temp.next;
	            }
	            if( prev != null){
	                 prev.next = temp.next;
	            }else{
	                head = temp.next;
	            }
	            temp = temp.next;
	            
	        }
	        else{
	            prev = temp;
	            temp = temp.next;
	        }
	            
	        }
	        return head;
}
}