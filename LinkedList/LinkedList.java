package LinkedList;


public class LinkedList {
	
	private static int length = 0;
	
	public LinkedList() {
		length = 0;
	}
	
	public static ListNode addItemAtFront(ListNode head, int item) {
		ListNode newNode = new ListNode(item);
		newNode.setNext(head);
		head = newNode;
		length++;
		return head;
	}
	
	public static ListNode addItemAtEnd(ListNode head, int item) {
		ListNode newNode = new ListNode(item);
		ListNode p,q;
		for(p = head; (q = p.getNext()) != null; p = q);
		p.setNext(newNode);
		length++;
		return head;
	}
	
	public static ListNode removeItemAtFront(ListNode head) {
		head = head.getNext();
		return head;
	}
	
	public static ListNode removeItemAtEnd(ListNode head) {
		ListNode p = head, q = null;
		while (p.getNext() != null) {
			q = p;
			p = p.getNext();
		}
		System.out.println("---> p: "+p.getData());
		System.out.println("---> q: "+q.getData());
		q.setNext(null);
		return head;
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.getData()+"--> ");
			head = head.getNext();
		}
		System.out.println();
	}
	
	public static int sizeOfLinkedList() {
		return length;
	}
	
	public static ListNode setUpLinkedlist() {
		ListNode head = new ListNode(15);
		length++;
		ListNode node = head;
		node.setNext(new ListNode(25));
		length++;
		node = node.getNext();
		node.setNext(new ListNode(35));
		length++;
		node = node.getNext();
		node.setNext(new ListNode(45));	
		length++;
		return head;
	}
	
	public static void main(String[] args) {
		ListNode head = setUpLinkedlist();
//		printList(head);
//		System.out.println("Size of Linked List: "+sizeOfLinkedList());
//		System.out.println();
//		head = addItemAtFront(head, 2);
//		printList(head);
//		System.out.println("Size of Linked List: "+sizeOfLinkedList());
//		System.out.println();
		head = addItemAtEnd(head, 3);
		printList(head);
		System.out.println();
		head = removeItemAtFront(head);
		printList(head);
		System.out.println();
		head = removeItemAtEnd(head);
		printList(head);
		
	}

}
