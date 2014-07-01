public class Queue<Item> {
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
        if (!isEmpty()){
            tail = tail.previous;
            tail.next = null;
        }
        return item;
    }

    private class Node {
        private Item value;
        private Node next;
        private Node previous;
    }
}
