package linkedList;

import java.util.Scanner;

public class OddEvenLinkedList {
	
	 public static ListNode oddEvenList(ListNode head) {
	        if(head == null){
	            return null;
	        }
	        if(head.next == null){
	            return head;
	        }
	        ListNode even = head.next;
	        ListNode oddNode = head;
	    
	        ListNode evenNode = head.next;
	     

	        while(evenNode != null && evenNode.next != null){
	           oddNode.next = oddNode.next.next;
	           evenNode.next = evenNode.next.next;
	           
	           oddNode = oddNode.next;
	           evenNode = evenNode.next;
	        }
	       
	        oddNode.next = even;

	     

	        return head;    
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

	// print linked list
	public static void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}
		
public static void main(String[] args) {

	ListNode headInput = takeInputLinkedList();
	ListNode oddEvenList = oddEvenList(headInput);
	printLinkedList(oddEvenList);

}
}
