package utils;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {


    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();

        // call each method and test hire

        int pow = pow(2, 3);
        int gcd = gcd(125, 25);
        int factorial = factorial(5);
        int abs = abs(-5);
        int reversNumber = reverse(1234);
        System.out.println("pow 2 ^ 3 = " + pow);
        System.out.println("gcd for 125 and 25 = " + gcd);
        System.out.println("factorial for 5 = " + factorial);
        System.out.println("-5 abs = " + abs);
        mathUtil.printIntAsBinary(1554);
        System.out.println("reversed number 1234 = " + reversNumber);
    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
        //TODO: must be implemented
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return pow(a, n / 2) * pow(a, n / 2);
        else
            return a * pow(a, n / 2) * pow(a, n / 2);
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        //TODO: must be implemented
        if (x == 0)
            return y;
        if (y == 0)
            return x;

        if (x == y)
            return x;

        if (x > y)
            return gcd(x - y, y);
        return gcd(x, y - x);
    }
    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        //TODO: must be implemented

        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);

    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        // TODO implement

        return (n < 0) ? -n : n;
    }

    public void printIntAsBinary(int n) {
        // TODO implement

        int[] binaryNum = new int[1000];

        int i = 0;

        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
        System.out.println();
    }

    public static int reverse(int number) {

        int res = 0;
        // TODO implement
        while (number != 0) {
            res = res * 10;
            res = res + number % 10;
            number = number / 10;
        }
        return res;
    }
}




