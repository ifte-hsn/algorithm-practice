package queue;

public class Queue {
	private SLinkedListNode head;
	private SLinkedListNode tail;
	private int size;

	public int size() {
		return size;
	}

	public boolean empty() {
		return size == 0;
	}

	public void enqueue(Object item) {
		SLinkedListNode newNode = new SLinkedListNode(item);

		if (tail != null) {
			tail.next = newNode;
		}

		tail = newNode;

		if (head == null) {
			head = newNode;
		}
		size++;
	}

	public Object dequeue() {
		if (empty()) {
			System.out.println("Queue is empty");
			return null;
		}

		Object temp = head.item;

		if (tail == head) {
			tail = null;
		}
		head = head.next;
		size--;
		return temp;
	}

	public void clearQueue() {
		head = null;
		tail = null;
		size = 0;
	}
}
