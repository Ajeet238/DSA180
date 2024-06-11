package linkedList;

public class FindNodeWhereCycleStart {

	public ListNode detectCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {

				break;
			}
		}

		if (fast == null || fast.next == null) {
			return null;
		}

		while (head != slow && slow != null && head != null) {
			head = head.next;

			slow = slow.next;

		}

		return head;

	}

	public static void main(String[] args) {

	}

}
