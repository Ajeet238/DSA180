package linkedList;

import java.util.Scanner;

public class MergeTwoSortedList {
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode current = temp;

        while(list1!= null && list2!= null){
            if(list1.val<=list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        if(list1!=null){
            current.next = list1;
        }else{
            current.next = list2;
        }
        return temp.next;
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
		ListNode reverseList = mergeTwoLists(headInput1,headInput2);
		printLinkedList(reverseList);
	}

}
