package linkedList;

import java.util.Scanner;

public class ReverseLinkedListWithoutStack {

	public static ListNode reverseList(ListNode head) {

		if (head == null) {
			return null;
		}
		// if we use below then linklist will get reversed but last node will not point
		// to null so
		// while printing linkedlist, we will trap in loop
		// ListNode current = head.next;
		// ListNode prev = head;

		ListNode current = head;
		ListNode prev = null;

		while (current != null) {

			ListNode temp1 = current.next;
			ListNode temp2 = current;
			current.next = prev;
			current = temp1;
			prev = temp2;

		}
		head = prev;
		return head;

	}

	public static ListNode takeInputLinkedList() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of linked list ");
		int size = sc.nextInt();

		System.out.println("Enter the element of linked list ");

		ListNode head = new ListNode(sc.nextInt());
		ListNode currentNode = head;

		for (int i = 1; i < size; i++) {
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
