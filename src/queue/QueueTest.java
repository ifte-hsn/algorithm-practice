package queue;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

	Queue queue;
	
	@BeforeEach
	void setUp() {
		queue = new Queue();
	}
	
	@AfterEach
	void clear() {
		queue.clearQueue();
	}
	
	@Test
	void sizeTest() {
		assertEquals(0, queue.size());
		queue.enqueue(1);
		queue.enqueue(2);
		assertEquals(2, queue.size());
	}
	
	@Test
	void isEmptyTest() {
		assertTrue(queue.empty());
		queue.enqueue(1);
		assertFalse(queue.empty());
	}
	
	@Test
	void enqueueDequeueTest() {
		assertEquals(0, queue.size());
		assertTrue(queue.empty());
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		assertEquals(4, queue.size());
		assertFalse(queue.empty());
		
		assertEquals(1, queue.dequeue());
		assertEquals(3, queue.size());
		
		assertEquals(2, queue.dequeue());
		assertEquals(2, queue.size());
		
		assertEquals(3, queue.dequeue());
		assertEquals(1, queue.size());
		
		assertEquals(4, queue.dequeue());
		assertEquals(0, queue.size());
	}
	
	

}
