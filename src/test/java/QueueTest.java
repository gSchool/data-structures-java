import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void newQueueIsEmpty() {
        Queue<String> q = new Queue<String>();

        assertTrue(q.isEmpty());
        assertEquals(0, q.size());
    }

    @Test
    public void addingAnItemChangesSize() {
        Queue<String> q = new Queue<String>();

        q.enqueue("Hello");
        q.enqueue("World");

        assertFalse(q.isEmpty());
        assertEquals(2, q.size());
    }

    @Test
    public void removingAnItemChangesSize() {
        Queue<String> q = new Queue<String>();

        q.enqueue("Hello");
        q.enqueue("World");
        q.dequeue();

        assertFalse(q.isEmpty());
        assertEquals(1, q.size());

        q.dequeue();
        assertTrue(q.isEmpty());
        assertEquals(0, q.size());
    }

    @Test
    public void removingAnItemReturnsProperItem() {
        Queue<String> q = new Queue<String>();

        q.enqueue("Hello");
        q.enqueue("World");
        assertEquals("Hello", q.dequeue());
    }

    @Test
    public void iterationIsInCorrectOrder() {
        Queue<String> q = new Queue<String>();

        q.enqueue("Hello");
        q.enqueue("World");
        q.enqueue("Goodbye");

        List<String> result = new ArrayList<String>();
        for (String s : q) {
            result.add(s);
        }

        String[] expected = new String[3];
        expected[0] = "Hello";
        expected[1] = "World";
        expected[2] = "Goodbye";

        assertArrayEquals(result.toArray(), expected);

    }
}
