package gorAghajanyan.dynamicarray;


import java.util.Random;

public class DynamicArrayTest {
    private static DynamicArray dynamicArray;
    private static Random random;

    public static void main(String[] args) {

        initDynamicArray();

        emptyTest();

        sizeTest();

        addTest();

        getTest();

        isEmptyTest();

        setTest();

        addByIndexTest();

        removeTest();

        containsTest();

    }

    public static void initDynamicArray() {
        dynamicArray = new DynamicArray(30);
        random = new Random();
    }

    public static void emptyTest() {
        dynamicArray.add(45);
        dynamicArray.empty();
        if (dynamicArray.size() != 0) {
            System.err.println("The 'empty' test is not passed!");
            return;
        }
        System.out.println("The 'empty' test is passed.");
    }

    public static void sizeTest() {
        dynamicArray.empty();
        int count = 5;
        for (int i = 0; i < count; i++) {
            dynamicArray.add(i);
        }
        if (dynamicArray.size() != count) {
            System.err.println("The 'size' test is not passed!");
            return;
        }
        System.out.println("The 'size' test is passed.");
    }

    public static void addTest() {
        int value = random.nextInt();
        int size = dynamicArray.size();
        dynamicArray.add(value);
        if (dynamicArray.size() != size + 1 || dynamicArray.get(size) != value) {
            System.err.println("The 'add' test is not passed!");
            return;
        }
        System.out.println("The 'add' test is passed!");
    }

    public static void getTest() {
        int value = random.nextInt();
        int size = dynamicArray.size();
        dynamicArray.add(value);
        if (dynamicArray.size() != size + 1 || dynamicArray.get(size) != value) {
            System.err.println("The 'get' test is not passed!");
            return;
        }
        System.out.println("The 'get' test is passed!");
    }

    public static void isEmptyTest() {
        dynamicArray.empty();
        if (!dynamicArray.isEmpty()) {
            System.err.println("The 'isEmpty' test is not passed!");
            return;
        }
        System.out.println("The 'isEmpty' test is passed.");
    }

    public static void setTest() {
        int count = 5;
        for (int i = 0; i < count; i++) {
            dynamicArray.add(random.nextInt());
        }
        int value = -854;
        dynamicArray.set(2, value);
        if (dynamicArray.get(2) != value) {
            System.err.println("The 'set' test is not passed!");
            return;
        }
        System.out.println("The 'set' test is passed.");

    }

    public static void addByIndexTest() {
        dynamicArray.add(random.nextInt());
        int size = dynamicArray.size();
        int value = random.nextInt();
        int index = 1;
        dynamicArray.add(index, value);
        if (dynamicArray.get(index) != value || dynamicArray.size() != size + 1) {
            System.err.println("The 'add by index' test is not passed!");
            return;
        }
        System.out.println("The 'add by index' test is passed.");

    }

    public static void removeTest() {
        dynamicArray.add(random.nextInt());
        dynamicArray.add(random.nextInt());
        int size = dynamicArray.size();

        dynamicArray.remove(1);
        if (dynamicArray.size() + 1 != size) {
            System.err.println("The 'remove test is not passed!");
            return;
        }
        System.out.println("The 'remove' test is passed.");
    }

    public static void containsTest() {
        int value = random.nextInt();
        dynamicArray.add(value);
        if (!dynamicArray.contains(value)) {
            System.err.println("The 'contains' test is not passed!");
            return;
        }
        System.out.println("The 'contains' test is passed.");
    }

}
