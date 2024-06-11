package linkedList;

public class CopyListWithRandomPointer {
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	 public Node copyRandomList(Node head) {
	        Node temp = head;
	        if(head == null ){
	            return head;
	        }
	//  Add copy node between the two node
	        while(temp != null){
	            Node newNode = new Node(temp.val);
	        
	            Node temp2 = temp.next;
	            temp.next = newNode;
	            newNode.next = temp2;
	            temp = temp.next.next;
	            
	        }

	       Node dummy = head.next;
	        temp = head;
	// connect the copy node to copy random node
	        while(temp != null && temp.next != null){
	            if(temp.random != null){
	             dummy.random = temp.random.next;
	            }else{
	                dummy.random = null;
	            }
	            temp = temp.next.next;

	            if(temp != null){
	            dummy = temp.next;
	            }
	        }

	        dummy = head.next;
	       
	        temp = head;
	        Node dum = new Node(-1);  
	         Node res = dum;
	    // seperate the copy node and original node
	        while(temp != null ){
	            dum.next = temp.next;
	            temp.next = temp.next.next;
	            dum = dum.next;
	            temp = temp.next;
	        }
	        return res.next;
	    }
}
