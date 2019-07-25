package linkedList;


class SList {
	private static SLinkedListNode head;
	private static int size;
	
	
	/**
	 * Print all item of the list
	 */
	public void printList() {
		SLinkedListNode temp = head;
		int i = 1;
		
		while(temp != null) {
			System.out.println(i+" -> "+temp.item);
			temp = temp.next;
			i++;
		}
	}
	
	/**
	 * Get the size of the list
	 * @return Size of linked list
	 */
	public int size() {
		return size;
	}
	
	
	/**
	 * Returns if the list is empty
	 * @return false if list is empty
	 */
	public boolean empty() {
		return size == 0;
	}
	
	/**
	 * Return the value at specific index
	 * @param index
	 * @return
	 */
	public Object valueAt(int index) {
		if(index < 1 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		SLinkedListNode temp = head;
		
		for(int i = 1; i < index; i++) {
			temp = temp.next;
		}
		
		return temp.item;
	}
	
	/**
	 * Push item in front of list
	 * @param item
	 */
	public void pushFront(Object item) {
		head = new SLinkedListNode(item, head);
		size++;
	}
	
	
	/**
	 * Remove item from front and return value
	 * @return
	 */
	public Object popFront() {
		Object item = head.item;
		head = head.next;
		size--;
		return item;
	}
	
	
	/**
	 * Push item at the back of the list
	 * @param item
	 */
	public void pushBack(Object item) {
		if(head == null) {
			pushFront(item);
			size++;
			return;
		}
		
		SLinkedListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new SLinkedListNode(item);
		size++;
	}
	
	public Object popBack() {
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		
		SLinkedListNode current = head;
		SLinkedListNode prev = null;
		
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
}