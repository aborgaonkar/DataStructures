package LinkedList;

public class Add2LinkedLists {
	
	public static ListNode addLinkedLists(ListNode head1, ListNode head2) {
		ListNode l1 = head1, l2 = head2;
		ListNode head3 = new ListNode(0);
		ListNode l3 = head3;
		
		int sum = 0, carry = 0;
		
		while (l1 != null && l2 != null) {
			sum = l1.getData() + l2.getData();
			l3.setNext(new ListNode((sum + carry) % 10));
			carry = (sum + carry) / 10;
			l1 = l1.getNext();
			l2 = l2.getNext();
			l3 = l3.getNext();
		}
		while(l1 != null) {
			l3.setNext(new ListNode((carry + l1.getData()) % 10));
			carry = (carry + l1.getData()) /10;
			l1 = l1.getNext();
			l3 = l3.getNext();
			
		}
		
		while (l2 != null) {
			l3.setNext(new ListNode((carry + l2.getData()) % 10));
			carry = (carry + l2.getData()) / 10;
			l2 = l2.getNext();
			l3 = l3.getNext();
		}
		
		if(carry != 0) {
			l3.setNext(new ListNode(carry));
		}
		return head3.getNext();
	}
	
	public static void main(String[] args) {
		
		ListNode head1 = new ListNode(0);
		ListNode node1 = head1;
		node1.setNext(new ListNode(2));
		node1 = node1.getNext();
		node1.setNext(new ListNode(4));
		node1 = node1.getNext();
		node1.setNext(new ListNode(3));
		
		ListNode head2 = new ListNode(0);
		ListNode node2 = head2;
		node2.setNext(new ListNode(5));
		node2 = node2.getNext();
		node2.setNext(new ListNode(6));
		node2 = node2.getNext();
		node2.setNext(new ListNode(4));
		
		LinkedList.printList(head1.getNext());
		LinkedList.printList(head2.getNext());
		ListNode new_node = addLinkedLists(head1, head2);
		LinkedList.printList(new_node.getNext());
	}
}
