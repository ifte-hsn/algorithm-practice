package linkedList;


class SList {
	private static SLinkedListNode head;
	private static int size;

	public int size() {
		return size;
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public Object valueAt(int index) {
		if(index < 1 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		SLinkedListNode temp = head;
		
		for(int i = 1; i < index-1; i++) {
			temp = temp.next;
		}
		
		return temp.item;
	}
	
	public void pushFront(Object item) {
		head = new SLinkedListNode(item, head);
		size++;
	}
	
	public Object popFront() {
		if(size == 0) {
			return null;
		}
		
		Object item = head.item;
		head = head.next;
		size--;
		
		return item;
	}
	
	public void pushBack(Object item) {
		SLinkedListNode temp = head;
		
		
		if(temp == null) {
			head = new SLinkedListNode(item);
			return;
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = new SLinkedListNode(item);
		
		size++;
	}
	
	public Object popBack() {
		if(size == 0) {
			return null;
		}
		
		SLinkedListNode prev = null;
		SLinkedListNode current = head;
		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		size--;
		return current.item;
	}
	
	public Object front() {
		return head.item;
	}
	
	public Object back() {
		SLinkedListNode temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		return temp.item;
	}
	
	public void insert(Object item, int index) {
		SLinkedListNode current = head;
		SLinkedListNode prev = null;
		
		for(int i = 1; i<index; i++) {
			prev = current;
			current = current.next;
		}
		prev.next = new SLinkedListNode(item, current);
		size++;
	}
	
	public void erase(int index) {
		
		if(size == 0) {
			return;
		}
		
		SLinkedListNode prev = null;
		SLinkedListNode current = head;
		for(int i = 1; i < index-1; i++) {
			prev = current;
			current = current.next;
		}
		prev.next = current.next;
		size--;
	}
	
	public Object valueNFromEnd(int n) {
		if(n > size || n < 1) {
			throw new IndexOutOfBoundsException();
		}
		
		SLinkedListNode temp = head;
		int index = size - n;
		for(int i = 0; i <= index-1; i++) {
			temp = temp.next;
		}
		return temp.item;
	}
	
	public void reverse() {
		SLinkedListNode prev = null;
		SLinkedListNode next = null;
		SLinkedListNode current = head;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void printList() {
		SLinkedListNode temp = head;
		int i = 0;
		
		while(temp.next != null) {
			System.out.println(i+" => "+temp.item);
			temp = temp.next;
			i++;
		}
	}
}