package linkedList;

public class DesignBrowserHistory {
	class Node {
	    String url;
	    Node next;
	    Node prev;

	    public Node(String url) {
	        this.url = url;
	       
	    }
	}
    Node curr;

    public DesignBrowserHistory(String homepage) {
        curr = new Node(homepage);
      
    }
   

    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next = newNode;
        curr.next.prev = curr;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(steps != 0){
            if(curr.prev != null){
            curr = curr.prev;
            steps--;
            }else{
                break;
            }
        }
        return curr.url;
    }
    
    public String forward(int steps) {

        while(steps != 0){
           if(curr.next != null){      
            curr = curr.next;
            steps--;
           }else{
            break;
           }
        }
        return curr.url;
    }
}
