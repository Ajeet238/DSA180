package linkedList;

import java.util.Scanner;

public class ReverseNodesInkGroup {
	// function to reverse the LL
	 public static ListNode reverse(ListNode head){
	        if(head == null || head.next == null){
	            return head;
	        }
	        ListNode temp = head;
	        ListNode prev = null;

	        while(temp != null){
	            ListNode temp1 = prev;
	            ListNode temp2 = temp ;
	            prev = temp2; 
	            temp = temp.next;
	            temp2.next = temp1; 
	            
	        }
	        head = prev;
	        return head;
	    };

		public ListNode reverseKGroup(ListNode head, int k) {
			
			ListNode temp = head;
			ListNode tail = null;
			ListNode resultHead = null;
			ListNode newHead = null;
			ListNode prev = null;
			int x = 0;
			
			if (head == null || head.next == null) {
				return head;
			}

			// reverse first k group;
			

			while (x < k) {
				prev = temp;
				temp = temp.next;
				x++;
			}
			prev.next = null;
			newHead = reverse(head);
			resultHead = newHead;
			tail = head;
			
			// reverese other first k group and join the tail with head got after reverse
			// update tail and head
			
			while (temp != null) {
				x = 0;
				ListNode temp2 = temp;
				while (temp != null && x < k) {
					prev = temp;
					temp = temp.next;
					x++;
				}

				if (x == k) {
					// disconnect the link
					prev.next = null;
					newHead = reverse(temp2);
					// connect the link
					tail.next = newHead;
					// update tail
					tail = temp2;

				} else {
					tail.next = temp2;

				}

			}
			return resultHead;
		}
	    public static ListNode nodeWithIndex(ListNode head, int randomval){
	    	ListNode temp = head;
	      

	        if(head == null){
	            return head;
	        }
	        while( temp != null){
	            if(temp.val == randomval){
	                return temp;
	            }
	            temp = temp.next;
	            
	        }
	        
	        return temp;
	    } 
		public static ListNode takeInputLinkedList() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size of linked list ");
			int size = sc.nextInt();
			
			System.out.println("Enter the element of linked list ");
			
			ListNode head = new ListNode(sc.nextInt());
			ListNode currentNode = head;
			
			for(int i=1; i<size; i++) {
				currentNode.next = new ListNode(sc.nextInt());
				currentNode = currentNode.next;			
			}
			return head;
			
		}
			
		public static void main(String[] args) {

			ListNode headInput = takeInputLinkedList();
			ListNode isPalindrome = nodeWithIndex(headInput, 7);
			System.out.println(isPalindrome);
		
		}
}
