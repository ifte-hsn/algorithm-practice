package linkedList;

import javax.swing.plaf.SliderUI;

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
		if(index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		SLinkedListNode temp = head;
		
		for(int i = 0; i<=index-1; i++) {
			temp = temp.next;
		}
		
		return temp.item;
	}

	public void pushFront(Object item) {
		head = new SLinkedListNode(item, head);
		size++;
	}

	public Object popFront() {
		if(head.next != null ) {
			head = head.next;
			size--;
			return head.item;
		}
		return null;
	}

	public void pushBack(Object item) {
		SLinkedListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = new SLinkedListNode(item);
		size++;
	}

	public Object popBack(){
		SLinkedListNode current = head;
		SLinkedListNode prev = null;
		
		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		size--;
		
		return prev.item;

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
		SLinkedListNode prev = null;
		SLinkedListNode current = head;
	
		for(int i = 0; i < index; i++) {
			prev = current;
			current = current.next;
		}
		prev.next = new SLinkedListNode(item, current);
		size++;
	}
	
	public void erase(int index) {
		SLinkedListNode prev = null;
		SLinkedListNode current = head;
	
		for(int i = 0; i<index; i++) {
			prev = current;
			current = current.next;
		}
		prev.next = current.next;
		size--;
	}
	
	public void printList() {
		SLinkedListNode temp = head;
		
		while(temp != null) {
			System.out.println(temp.item);
			temp = temp.next;
		}
	}
	
	
}