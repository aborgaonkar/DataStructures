package Queue;

public class Queue {
	private int[] queue;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public Queue() {
		size = 10;
		total = 0;
		front = 0;
		rear = 0;
		queue  = new int[size];
	}
	public Queue(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		queue  = new int[this.size];
	}
	
	public boolean enque(int item) {
		if(isQueueFull()) {
			return false;
		}else {
			total++;
			queue[rear] = item;
			rear = (rear + 1) % size;     // rear++ would suffice but it won't fill out the whole array once the earlier entered values are dequed [, , 2,3], so to fill out 0 and 1 index we use this.
			return true;
		}
	}
	 
	public int deque() {
		int item = queue[front];
		total--;
		front = (front + 1) % size;      // front++ would suffice but it won't fill out the whole array once the earlier entered values are dequed [, , 2,3], so to fill out 0 and 1 index we use this.
		return item;
	}
	
	public boolean isQueueFull() {
		return size == total;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enque(1);
		queue.enque(4);
		queue.enque(9);
		
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
	}
}
