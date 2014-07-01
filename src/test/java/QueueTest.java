import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
}
