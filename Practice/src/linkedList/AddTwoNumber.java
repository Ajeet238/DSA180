package linkedList;

import java.util.Scanner;

public class AddTwoNumber {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){
            int val = 0;

            if(l1 != null){
                 val = val+l1.val;
                 l1 = l1.next;
            }
            if(l2 != null){
                 val = val+l2.val;
                 l2 = l2.next;
            }
            val = val + carry;
            carry = val/10;
             ListNode node = new ListNode(val%10);
            temp.next = node;
            temp = temp.next;

        }
        return dummy.next;

    }
		public static ListNode takeInputLinkedList() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the size of linked list ");
			int size = sc.nextInt();
			
			System.out.print("Enter the element of linked list ");
			
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
			ListNode addTwoNumbers = addTwoNumbers(headInput1,headInput2);
			printLinkedList(addTwoNumbers);
			//System.out.println(addTwoNumbers);
		}
}
