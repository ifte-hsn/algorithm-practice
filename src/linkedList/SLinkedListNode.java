package linkedList;

public class SLinkedListNode {
	public Object item;
	public SLinkedListNode next;
	
	public SLinkedListNode(Object item, SLinkedListNode next) {
		this.item = item;
		this.next = next;
	}
	
	public SLinkedListNode(Object item) {
		this(item, null);
	}
}
