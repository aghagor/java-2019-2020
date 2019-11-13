package gorAghajanyan.dynamicarray;


public class DynamicArray {
    
    private int[] storage;
    private int size;

    public DynamicArray(int capacity) {
        this.storage = new int[capacity];
        this.size = 0;
    }

    //returns count of elements added in to DynamicArray
    public int size() {
        if (size < 0) {
            System.out.println("Array size can't be negative!!!");
            return -1;
        }
        return size;
    }

    //return true if is empty
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }

        return false;
    }

    // returns true if the value is exist in the Dynamicarray 
    public boolean contains(int val) {
        for (int i = 0; i < size; i++) {
            if (storage[i] == val) {
                return true;
            }
        }
        return false;
    }

    // returns the element by specified index 
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " +
                    index + ", size: " + size);
        }
        return storage[index];
    }

    // sets the specified val by the specified index
    public void set(int index, int val) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " +
                    index + ", size: " + size);
        }
        storage[index] = val;
    }

    /**
     * adds the element at the end position in this DynamicArray .
     */
    public void add(int val) {
        if (size == storage.length - 1) {
            extendStorage();
        }
        storage[size++] = val;
    }

    /**
     * adds the element at the specified position in this DynamicArray .
     * Shifts any subsequent elements to the right
     */
    public void add(int index, int element) {
        if (size == storage.length) {
            extendStorage();
        }
        for (int i = size; i > index; i--) {
            storage[i] = storage[i - 1];
        }
        storage[index] = element;
        size++;
    }

    /**
     * Removes the element at the specified position in this DynamicArray .
     * Shifts any subsequent elements to the left
     */
    public void remove(int index) {
        if (index >= size || index < 0 || isEmpty()) {
            throw new IndexOutOfBoundsException("Index: " +
                    index + ", Size: " + size);
        }

        for (int i = index; i < size; i++) {
            storage[i] = storage[i + 1];
        }
        size--;
    }

    public void extendStorage() {
        int[] newStorage = new int[size * 3 / 2 + 1];
        for (int i = 0; i < storage.length; i++) {
            newStorage[i] = storage[i];
        }
        storage = newStorage;
    }

    public void empty() {
        size = 0;
    }
}
