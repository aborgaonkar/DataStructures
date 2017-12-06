package LinkedList;

public class ReverseKNodes {

	public static ListNode reverse(ListNode head, int k) {

		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		
		int count = 0;

		while(current != null && count < k) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
			count++;
		}
		
		if (next != null) {
			head.setNext(reverse(next, k));
			LinkedList.printList(head);
		}
		
		return prev;
	}
	
	public static void main(String[] args) {
		ListNode head = LinkedList.setUpLinkedlist();
		//LinkedList.printList(head);
		head = reverse(head, 2);
		LinkedList.printList(head);
	}
}
