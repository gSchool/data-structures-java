public class Queue<Item> {
    private int size = 0;

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Item item) {
        size++;
    }
}
