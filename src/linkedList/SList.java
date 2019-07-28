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
		
		
		
		if(size == 1) {
			Object item = head.item;
			head = null;
			size--;
			return item;
		}


		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		
		prev.next = null;
		size--;
		return current.item;
	}
	
	public Object front() {
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		return head.item;
	}
	
	public Object back() {
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		
		SLinkedListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.item;
	}
	
	public void insert(int index, Object item) {
		if(head == null) {
			pushFront(item);
			return;
		}
		
		if(index > size) {
			pushBack(item);
			return;
		}
		
		
		if(index == 1) {
			pushFront(item);
			return;
		}
		
		SLinkedListNode prev = null;
		SLinkedListNode current = head;
		
		for(int i = 1; i<index; i++) {
			prev = current;
			current = current.next;
		}
		
		prev.next = new SLinkedListNode(item, current);
		size++;
	}
	
	
	public Object erase(int index) {
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		
		SLinkedListNode current = head;
		SLinkedListNode prev = null;
		
		if(index == 1) {
			return popFront();
		}
		
		for(int i = 1; i <= index-1; i++) {
			prev = current;
			current = current.next;
		}
		
		Object item = current.item;
		
		prev.next = current.next;
		size--;
		
		return item;
	}
	
	public Object valueNfromEnd(int index) {
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		
		if(index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		int indexToShow = size - index;
		SLinkedListNode temp = head;
		
		for(int i = 1; i<= indexToShow; i++) {
			temp = temp.next;
		}
		
		return temp.item;
	}
	
	public void reverse() {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
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
	
	public void removeValue(Object value) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		SLinkedListNode prev = null;
		SLinkedListNode current = head;
		
		while(current.next != null) {
			if(current.item.equals(value)) {
				prev.next = current.next;
				size--;
				return;
			}
			
			prev = current;
			current = current.next;
			
		}
	}
	
	public void clear() {
		head = null;
		size = 0;
	}
}