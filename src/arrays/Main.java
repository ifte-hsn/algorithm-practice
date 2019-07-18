package arrays;

public class Main {

	public static void main(String[] args) {
		DynamicArray dynArray = new DynamicArray();

		// check the capacity of the array
		System.out.println("capacity of the array is: " + dynArray.capacity());

		// check the size of the array
		System.out.println("size of the array is: " + dynArray.size());

		// check if array is empty
		System.out.println("Is empty: " + dynArray.is_empty());


		System.out.println("==================================");
		// push an item
		dynArray.push(1);

		// check the capacity of the array
		System.out.println("capacity of the array is: " + dynArray.capacity());

		// check the size of the array
		System.out.println("size of the array is: " + dynArray.size());

		// check if array is empty
		System.out.println("Is empty: " + dynArray.is_empty());

		// get element from an index
		System.out.println("element at index 0 is: " + dynArray.at(0));
		
		
		
		System.out.println("==================================");
		// push an item
		dynArray.push(2);

		// check the capacity of the array
		System.out.println("capacity of the array is: " + dynArray.capacity());

		// check the size of the array
		System.out.println("size of the array is: " + dynArray.size());

		// check if array is empty
		System.out.println("Is empty: " + dynArray.is_empty());

		// get element from an index
		System.out.println("element at index 1 is: " + dynArray.at(1));
		
		
		System.out.println("==================================");
		// push an item
		dynArray.push(4);

		// check the capacity of the array
		System.out.println("capacity of the array is: " + dynArray.capacity());

		// check the size of the array
		System.out.println("size of the array is: " + dynArray.size());

		for(int i = 0; i < dynArray.size(); i++) {
			System.out.println("element at index "+i+" is: "+ dynArray.at(i));
		}
		
		
		System.out.println("==================================");
		// adding 3 at index 2
		dynArray.insert(2, 3);
		dynArray.push(5);
		
		for(int i = 0; i < dynArray.size(); i++) {
			System.out.println("element at index "+i+" is: "+ dynArray.at(i));
		}
		
		dynArray.prepend(0);
		
		System.out.println("========================= \nafter prepending item");
		
		for(int i = 0; i < dynArray.size(); i++) {
			System.out.println("element at index "+i+" is: "+ dynArray.at(i));
		}
		
		
		
		System.out.println("===================");
		System.out.println("array after poping");
		System.out.println("===================");
		System.out.println("poped value :" + dynArray.pop());
		for(int i = 0; i < dynArray.size(); i++) {
			System.out.println("element at index "+i+" is: "+ dynArray.at(i));
		}
		
		
		System.out.println("===================");
		System.out.println("array after deleting item");
		System.out.println("===================");
		dynArray.delete(0);
		for(int i = 0; i < dynArray.size(); i++) {
			System.out.println("element at index "+i+" is: "+ dynArray.at(i));
		}
		
		dynArray.insert(0,0);
		
		for(int i = 0; i < dynArray.size(); i++) {
			System.out.println("element at index "+i+" is: "+ dynArray.at(i));
		}
		
		System.out.println("===================");
		System.out.println("array remove item");
		System.out.println("===================");
		
		dynArray.insert(2,0);
		dynArray.insert(4,0);
		dynArray.push(5);
		
		dynArray.remove(0);
		
		for(int i = 0; i < dynArray.size(); i++) {
			System.out.println("element at index "+i+" is: "+ dynArray.at(i));
		}
	}

}
