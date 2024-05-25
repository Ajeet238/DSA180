package LinkedList;

import java.util.Scanner;

public class MiddleOfLinkedList {
	
public static ListNode middleNode(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;

	        while(fast!=null && fast.next != null){
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        return slow;
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
		ListNode middleNode = middleNode(headInput);
		printLinkedList(middleNode);
	}
}
