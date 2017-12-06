package LinkedList;


public class ReverseLinkedList {
	
	public static ListNode reverseLinkedlist(ListNode head) {
		
		ListNode prev = null, current = head, next = null;
		
		while(current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		ListNode head = LinkedList.setUpLinkedlist();
		LinkedList.printList(head);
		head = reverseLinkedlist(head);
		LinkedList.printList(head);
		
	}
}
