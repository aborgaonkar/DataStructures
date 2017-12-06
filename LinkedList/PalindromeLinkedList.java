package LinkedList;


public class PalindromeLinkedList {
	
	public static boolean isPalindromeLinkedlist(ListNode head) {
		
		if(head == null || head.getNext() == null) {
			return true;
		}
		
		// Finding the center of the list
		
		ListNode fastPtr = head, slowPtr = head; 
		
		while(fastPtr != null && fastPtr.getNext() != null) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
		}
		System.out.println("slow: "+ slowPtr.getData());
		ListNode head2 = slowPtr.getNext(); // Next of slow is the new head of the 2nd split portion of the list
		slowPtr.setNext(null);
		
		// Reversing the second half of the list
		
		ListNode prev = null, current = head2, next;
		while(current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		
		// Comparing 1st list with the 2nd list
		
		ListNode head1 = head;
		while(head1 != null && head2 != null) {
			if (head1.getData() == head2.getData()) {
				head1 = head1.getNext();
				head2 = head2.getNext();
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		ListNode head = LinkedList.setUpLinkedlist();
		LinkedList.printList(head);
		System.out.println(isPalindromeLinkedlist(head));
		
	}
}
