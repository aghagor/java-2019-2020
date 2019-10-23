package gor_aghajanyan.arrays;


/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {
    private static int biggestInt;

    /**
     * Sorts the array elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the array
     */
    public void sortByOddAndEven(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            while (array[left] % 2 == 0 && left < right)
                left++;

            while (array[right] % 2 == 1 && left < right)
                right--;

            if (left < right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        print(array);
    }

    /**
     * Get maximum int value from array
     */
    public static int getMaximum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggestInt) {
                biggestInt = array[i];
            }
        }
        return biggestInt;
    }


    /**
     * Get minimum int value from array
     */
    public static int getMinimum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[0];
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Reverse specified array
     */
    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;

    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * Prints all elements in an array.
     *
     * @param a the array to print
     */
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
      
