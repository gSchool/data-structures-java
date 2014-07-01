import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {
    @Test
    public void newQueueIsEmpty() {
        Queue q = new Queue();

        assertTrue(q.isEmpty());
        assertEquals(0, q.size());
    }
}
