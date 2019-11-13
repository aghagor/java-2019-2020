package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 4, 3, 15, -4, 0, 16, 17, 152, 31, 67};

        ArrayUtil.print(array);
        System.out.println("Maximum number form array : " + ArrayUtil.getMaximum(array));
        System.out.println("Sum of array's numbers : " + ArrayUtil.getSum(array));
        System.out.println("Reversed array : " + Arrays.toString(ArrayUtil.reverse(array)));
        arrayUtil.sortByOddAndEven(array);
        System.out.println("Minimum number form array : " + ArrayUtil.getMinimum(array));

    }
}