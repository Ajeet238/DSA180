package linkedList;

import java.util.Scanner;

public class DeleteDuplicatesFromSortedList {
	
	  public static ListNode deleteDuplicates(ListNode head) {
	        ListNode temp = head;
	       

	        while(temp != null && temp.next != null){
	            
	                if(temp.val != temp.next.val){
	                   
	                    temp = temp.next;
	                }else{
	                    temp.next = temp.next.next;
	                }
	        }
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
		ListNode reverseList = deleteDuplicates(headInput);
		printLinkedList(reverseList);
	}
}
