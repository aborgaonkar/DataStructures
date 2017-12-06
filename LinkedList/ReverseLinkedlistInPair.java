package LinkedList;

public class ReverseLinkedlistInPair {
	
	public static ListNode reverseLinkedlistInPair(ListNode head) {
		
		int temp;
		ListNode current = head;
		
		while (current != null && current.getNext() != null) {
			temp = current.getNext().getData();
			current.getNext().setData(current.getData());;
			current.setData(temp); 
			current = current.getNext().getNext();
		}
		return head;
	}
	
	public static void main(String[] args) {
		ListNode head = LinkedList.setUpLinkedlist();
		head = LinkedList.addItemAtFront(head, 2);
		LinkedList.printList(head);
		reverseLinkedlistInPair(head);
		LinkedList.printList(head);
	}
}
