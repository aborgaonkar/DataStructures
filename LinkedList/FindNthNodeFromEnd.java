package LinkedList;


public class FindNthNodeFromEnd {
	
	public static void printNthFromTheLast(ListNode head, int n) {
		int length = 0;
		ListNode temp = head;
		
		// Count the number of nodes in the linked list
		
		while(temp != null) {
			temp = temp.getNext();
			length++;
		}
		
		
		// Check if value of n is not more than length of linked list
		if(length < n) {
			return;
		}
		temp = head;
		
		// Get the (length+1 - n)th node
		
		for(int i = 1; i < (length+1)-n; i++)  {
			temp = temp.getNext();
		}
			System.out.println(temp.getData());
		
	}
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(5);
		ListNode node = head;
		node.setNext(new ListNode(15));
		node = node.getNext();
		node.setNext(new ListNode(25));
		node = node.getNext();
		node.setNext(new ListNode(35));
		printNthFromTheLast(head,3);
		
	}
}
