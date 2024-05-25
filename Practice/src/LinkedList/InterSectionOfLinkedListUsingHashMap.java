package LinkedList;

import java.util.HashMap;
import java.util.Scanner;

// https://leetcode.com/problems/intersection-of-two-linked-lists/

public class InterSectionOfLinkedListUsingHashMap {
	   public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        HashMap<ListNode, Integer> hm = new HashMap<>();
	        ListNode tempA = headA;
	        ListNode tempB = headB;
	   

	        while(tempA != null){
	            hm.put(tempA, tempA.val);
	            tempA = tempA.next;
	        }
	        while(tempB != null){
	            if(hm.containsKey(tempB)){
	                return tempB;
	            }else{
	                hm.put(tempB,tempB.val);
	                tempB = tempB.next;
	            }
	        } 
	        return null;       
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

		ListNode headInput1 = takeInputLinkedList();
		ListNode headInput2 = takeInputLinkedList();
		ListNode IntersectionNode = getIntersectionNode(headInput1,headInput2);
		System.out.println(IntersectionNode);
	}

}
