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
//		list.pushBack(1);
//		list.pushBack(2);
//		list.pushBack(3);
//		list.pushBack(4);
//		list.pushBack(5);
//		list.pushBack(6);
//		
//		list.printList();
//		
//		System.out.println("front "+list.front());
//		System.out.println("back "+list.back());
//		System.out.println("size "+list.size());
		
		
		// Insert
	
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(4);
		list.pushBack(5);
		
		list.insert(3, 3);
		list.insert(1, 0);
		list.insert(7, 6);
		
//		list.erase(1);
//		list.erase(2);
//		list.erase(5);
		
		list.printList();
		
		System.out.println("front "+list.front());
		System.out.println("back "+list.back());
		System.out.println("size "+list.size());
		
		System.out.println("2nd value from end is "+list.valueNfromEnd(2));
		
	}

}
