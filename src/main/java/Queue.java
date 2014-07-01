import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private int size = 0;
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Item item) {
        Node newHead = new Node();
        newHead.value = item;
        newHead.next = head;
        if (isEmpty()) {
            tail = newHead;

        } else {
            head.previous = newHead;
        }
        head = newHead;
        size++;
    }

    public Item dequeue() {
        Item item = tail.value;
        size--;
        if (!isEmpty()) {
            tail = tail.previous;
            tail.next = null;
        }
        return item;
    }

    public Iterator<Item> iterator() {
        return new QueueIterator(tail);
    }

    private class Node {
        private Item value;
        private Node next;
        private Node previous;
    }

    private class QueueIterator implements Iterator<Item> {
        private Node startingPoint;

        public QueueIterator(Node startingPoint) {
            this.startingPoint = startingPoint;
        }

        @Override
        public boolean hasNext() {
            return startingPoint != null;
        }

        @Override
        public Item next() {
            Item item = startingPoint.value;
            startingPoint = startingPoint.previous;
            return item;
        }
    }
}
