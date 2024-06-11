package linkedList;

class ReorderList {
	
    public static ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            count++;
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = null;
        }
        return slow;

    }

    public static ListNode reverseLL(ListNode LL) {
        if (LL == null || LL.next == null) {
            return LL;
        }

        ListNode current = LL;
        ListNode prev = null;

        while (current != null) {
            ListNode temp1 = current.next;
            ListNode temp2 = current;
            current.next = prev;
            current = temp1;
            prev = temp2;
        }
        LL = prev;
        return LL;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode middle = findMiddle(head);

        ListNode reverse = reverseLL(middle);

        ListNode curr = head;
        ListNode revhead = reverse;

        while (curr != null && revhead != null) {
            ListNode temp1 = curr.next;
            curr.next = revhead;
            ListNode temp2 = revhead.next;
            revhead.next = temp1;
            curr = temp1;
            revhead = temp2;
        }

        if (revhead != null) {
            ListNode prev = null;
            while (head != null) {
                prev = head;
                head = head.next;
            }
            prev.next = revhead;
        }

    }
}
