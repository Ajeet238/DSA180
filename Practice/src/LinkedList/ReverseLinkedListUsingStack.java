package LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLinkedListUsingStack {

// reverse linked linkedlist
	
	public static ListNode reverseList(ListNode head) {

		ListNode temp = head;
		if (head == null)
			return null;
		if (temp.next == null) {
			return head;
		}
		Stack<Integer> st = new Stack<>();

		while (temp != null) {
			st.push(temp.val);
			temp = temp.next;
		}

		if (st.size() == 1) {
			return head;
		}
		ListNode newNode = new ListNode();

		newNode = head;
		newNode.val = st.pop();

		ListNode temp2 = newNode;

		while (st.size() != 0) {
			ListNode newTempNode = new ListNode();
			temp2.next = newTempNode;
			temp2.next.val = st.pop();
			temp2 = newTempNode;
		}
		return head;

	}
	// take linkedlist input from user 
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
		ListNode reverseList = reverseList(headInput);
		printLinkedList(reverseList);
	}
}
