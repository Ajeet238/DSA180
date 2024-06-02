package linkedList;

import java.util.Scanner;
import java.util.Stack;

public class CheckPalindromeUsingStack {
	 public static boolean isPalindrome(ListNode head) {

	        Stack<Integer> st = new Stack<>();
	        ListNode temp = head;

	        while(temp != null){
	            st.push(temp.val);
	            temp = temp.next;
	        }

	      temp = head;

	     while(!st.isEmpty()){

	        if(temp.val != st.peek()){
	            return false;
	        }
	        st.pop();
	        temp = temp.next;

	     } 
	     return true;  
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
		boolean isPalindrome = isPalindrome(headInput);
		System.out.println(isPalindrome);
	
	}
}
