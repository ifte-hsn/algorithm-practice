package arrays;

public class DynamicArray {
	private int capacity = 2;
	private int size = 0;
	private Object[] arr = new Object[capacity];


	public int size() {
		return size;
	}
	
	public int capacity() {
		return capacity;
	}

	public boolean is_empty() {
		return size == 0;
	}

	public Object at(int index) {
		if(index >= size) {
			throw new IndexOutOfBoundsException("Index out of bound");
		}
		
		return arr[index];
	}


	public void push(Object item) {
		resize();
		if(item == null) {
			throw new NullPointerException();
		}
		arr[size] = item;
		size++;
	}

	public void insert(int index, Object item) {
		resize();
		Object[]  new_arr = new Object[capacity];
		
		for(int i = 0; i<index; i++) {
			new_arr[i] = arr[i];
		}
		new_arr[index] = item;

		for(int i = index+1; i <= size; i++) {
			new_arr[i] = arr[i-1];
		}
	
		arr = new_arr;
		size++;
	}

	public void prepend(Object item) {
		resize();
		Object[]  new_arr = new Object[capacity];
		
		for(int i = 1; i <= size; i++){
			new_arr[i] = arr[i-1];
		}
		new_arr[0] = item;
		arr = new_arr;
		size++;
	}

	public Object pop() {
		Object lastItem = arr[size-1];
		arr[size-1] = null;
		size--;
		resize();
		
		return lastItem;
	}

	public void delete(int index) {
		Object[] new_arr = new Object[capacity];
		
		
		for(int i = index-1; i >=0; i--) {
			new_arr[i] = arr[i];
		}
		
		for(int i = index; i<=size; i++) {
			new_arr[i] = arr[i+1];
		}
		
		arr = new_arr;
		size--;
		resize();
	}

	public void remove(Object item) {
		Object[] new_arr = new Object[capacity];
		
		int new_arr_counter = 0;
		int old_arr_counter = 0;
		int new_size = size;
		for(int i = 0; i<size; i++) {
			if(arr[i].equals(item)) {
				old_arr_counter++;
				new_size--;
				continue;
			}else {
				new_arr[new_arr_counter] = arr[old_arr_counter];
				new_arr_counter++;
				old_arr_counter++;
			}
		}
		size = new_size;
		arr = new_arr;
		resize();
	}

	public Object find(Object item) {
		for(int i = 0; i<size; i++) {
			if(arr[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}
	
	
	private void resize() {
		if(capacity == 2 && size < capacity) {
			return;
		}
		
		if(size >= capacity) {
			capacity = 2 * capacity;
		} else if (4*size <= capacity) {
			capacity = capacity/2;
		}

		Object[]  new_arr = new Object[capacity];
		
		for(int i = 0; i < size; i++) {
			new_arr[i] = arr[i];
		}
		arr = new_arr;
	}
}
