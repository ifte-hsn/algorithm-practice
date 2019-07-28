package linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SLinkedListTest {

	SList list;

	@BeforeEach
	void setUp() throws Exception {
		list = new SList();
	}

	@AfterEach
	void tearDown() throws Exception {
		list.clear();
	}

	@Test
	void sizeTest() {
		assertEquals(0, list.size());

		list.pushFront(1);
		assertEquals(1, list.size());

		list.popFront();
		assertEquals(0, list.size());

		list.pushBack(1);
		assertEquals(1, list.size());

		list.popBack();
		assertEquals(0, list.size());

		list.pushFront(1);
		list.popBack();
		assertEquals(0, list.size());

		list.pushBack(1);
		list.popFront();
		assertEquals(0, list.size());

		list.pushBack(1);
		list.pushFront(2);
		list.pushBack(4);
		list.pushFront(5);

		assertEquals(4, list.size());

		list.popBack();
		assertEquals(3, list.size());

		list.popFront();
		assertEquals(2, list.size());

		list.popFront();
		assertEquals(1, list.size());

		list.popFront();
		assertEquals(0, list.size());
	}

	@Test
	public void isEmptyTest() {

		assertTrue(list.empty());

		list.pushBack(1);
		assertFalse(list.empty());

		list.popBack();
		assertTrue(list.empty());

		list.pushBack(1);
		list.popFront();
		assertTrue(list.empty());
	}
	
	@Test
	public void valueAtTest() {
		list.pushFront(1);
		list.pushBack(2);
		list.pushBack(3);
		
		assertEquals(3, list.size());
		assertEquals(1, list.valueAt(1));
		assertEquals(2, list.valueAt(2));
		assertEquals(3, list.valueAt(3));
	}
	
	@Test
	public void pushFrontTest() {
		list.pushFront(1);
		list.pushFront(2);
		assertEquals(1, list.valueAt(2));
	}

	@Test
	public void popFrontTest() {
		list.pushFront(3);
		list.pushFront(2);
		list.pushFront(1);
		
		assertEquals(1, list.popFront());
		assertEquals(3, list.valueAt(2));
	}
	
	@Test
	public void pushBackTest() {
		list.pushBack(1);
		list.pushBack(2);
		assertEquals(2, list.valueAt(2));
	}
	
	@Test
	public void popBackTest() {
		list.pushFront(3);
		list.pushFront(2);
		list.pushFront(1);
		
		assertEquals(3, list.popBack());
		assertEquals(2, list.valueAt(2));
	}
	
	@Test
	public void frontTest() {
		list.pushFront(3);
		list.pushFront(2);
		list.pushFront(1);
		
		assertEquals(1, list.front());
	}
	
	@Test
	public void backTest() {
		list.pushFront(3);
		list.pushFront(2);
		list.pushFront(1);
		
		assertEquals(3, list.back());
	}
	
	@Test
	public void insertTest() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(4);
		list.pushBack(5);
		
		assertEquals(1, list.valueAt(1));
		assertEquals(2, list.valueAt(2));
		assertEquals(4, list.valueAt(3));
		assertEquals(5, list.valueAt(4));
		
		list.insert(3, 3);
		assertEquals(3, list.valueAt(3));
		assertEquals(4, list.valueAt(4));
		
		list.insert(1, 0);
		assertEquals(0, list.valueAt(1));
		
		list.insert(7, 6);
		assertEquals(6, list.valueAt(7));
	}
	
	@Test
	public void eraseTest() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(4);
		list.pushBack(5);
		
		list.erase(2);
		
		assertEquals(1, list.valueAt(1));
		assertEquals(4, list.valueAt(2));
		assertEquals(5, list.valueAt(3));
	}
	
	@Test
	public void valueNFromEndTest() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(6);
		list.pushBack(7);
		
		assertEquals(5, list.valueNfromEnd(3));
		assertEquals(3, list.valueNfromEnd(5));
	}
	
	@Test
	public void reverseTest() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(6);
		
		
		assertEquals(1, list.valueAt(1));
		assertEquals(2, list.valueAt(2));
		assertEquals(3, list.valueAt(3));
		assertEquals(4, list.valueAt(4));
		assertEquals(5, list.valueAt(5));
		assertEquals(6, list.valueAt(6));
		
		list.reverse();
		
		assertEquals(6, list.valueAt(1));
		assertEquals(5, list.valueAt(2));
		assertEquals(4, list.valueAt(3));
		assertEquals(3, list.valueAt(4));
		assertEquals(2, list.valueAt(5));
		assertEquals(1, list.valueAt(6));
	}
	
	@Test
	public void removeTest() {
		list.pushBack(2);
		list.pushBack(4);
		list.pushBack(6);
		
		list.removeValue(4);
		assertEquals(2, list.size());
		
		assertEquals(2, list.valueAt(1));
		assertEquals(6, list.valueAt(2));
		
	}
}
