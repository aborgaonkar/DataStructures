package LinkedList;

public class PrintListFromEnd {
	
	public static void printListFromEnd(ListNode head) {
		if(head == null) {
			return;
		}
		printListFromEnd(head.getNext());
		System.out.println(head.getData());
	}
	
	
	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		ListNode node = head;
		node.setNext(new ListNode(15));
		node = node.getNext();
		node.setNext(new ListNode(25));
		node = node.getNext();
		node.setNext(new ListNode(35));
		printListFromEnd(head);
		
	}
}
