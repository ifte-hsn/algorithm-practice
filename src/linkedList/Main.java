package linkedList;

public class Main {

	public static void main(String[] args) {
		SList list = new SList();
		
		System.out.println("List empty? "+ list.empty());
		list.pushFront(5);
		
		System.out.println("List empty? "+ list.empty());
		
		list.pushFront(4);
		list.pushFront(2);
		list.pushFront(1);
		
		list.printList();
		
		System.out.println("-----------------");
		System.out.println("     INSERT      ");
		System.out.println("-----------------");
		list.insert(3, 2);
		
		list.printList();
		
		
		System.out.println("-----------------");
		System.out.println("    PUSH BACK    ");
		System.out.println("-----------------");
		
		list.pushBack(7);
		
		list.printList();
		
		
		System.out.println("-----------------");
		System.out.println("     INSERT      ");
		System.out.println("-----------------");
		
		list.insert(6, 5);
		list.printList();
		
		System.out.println("-----------------");
		System.out.println("     INSERT      ");
		System.out.println("-----------------");
		
		list.insert(7, 5);
		list.printList();
		//System.out.println("list size "+ list.size());
		
		//System.out.println("value at 4 is "+ list.valueAt(4));
		
		System.out.println("-----------------");
		System.out.println("     ERASE       ");
		System.out.println("-----------------");
		list.erase(5);
		list.printList();
		
		System.out.println("--------------------");
		System.out.println("      POP FRONT     ");
		System.out.println("--------------------");
		list.popFront();
		list.printList();
		System.out.println("size "+list.size());
		
		
		System.out.println("-------------------");
		System.out.println("      POP BACK     ");
		System.out.println("-------------------");
		list.popBack();
		list.printList();
		System.out.println("size "+list.size());
		
		System.out.println("----------------");
		System.out.println("      FRONT     ");
		System.out.println("----------------");
		
		System.out.println(list.front());
		
		System.out.println("---------------");
		System.out.println("      BACK     ");
		System.out.println("---------------");
		
		System.out.println(list.back());
		
	}

}
