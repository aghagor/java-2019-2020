package java.bracechecker;


public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    private int[] storage;

    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        this.storage = new int[capacity];
        this.tos = -1;
    }

    public void push(int value) {
        if (tos == storage.length - 1) {
            extendStorage();
        }
        storage[++tos] = value;
    }

    public int pop() {
        return tos < 0 ? -1 : storage[tos--];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    private void extendStorage() {
        int[] newstorage = new int[storage.length + 1];
        for (int i = 0; i < storage.length; i++) {
            newstorage[i] = storage[i];
        }
        storage = newstorage;
    }
}
