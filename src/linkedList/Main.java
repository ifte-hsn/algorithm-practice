package linkedList;

public class Main {

	public static void main(String[] args) {
		SList list = new SList();
		
		// Push front and pop front
//		list.pushFront(4);
//		list.pushFront(3);
//		list.pushFront(2);
//		list.pushFront(1);
//		
//		
//		
//		
//		System.out.println(list.popFront());
//		
//		list.printList();
	
		// Push back and pop back
//		list.pushBack(1);
//		list.pushBack(2);
//		list.pushBack(3);
//		list.pushBack(4);
//		list.pushBack(5);
//		list.pushBack(6);
//		
//		list.popBack();
		
		
		
		// Front & Back
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(6);
		
		list.printList();
		
		System.out.println("front "+list.front());
		System.out.println("back "+list.back());
		
	}

}
