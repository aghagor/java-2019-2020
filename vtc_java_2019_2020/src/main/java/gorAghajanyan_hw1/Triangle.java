package gorAghajanyan_hw1;

import java.util.Scanner;

public class Triangle {

    public static void main(String args[]) {
        Triangle triangle = new Triangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);

        triangle.printStarsLeftDown(n, c);
        System.out.println("\n----------------------------\n");
        triangle.printStarsLeftUp(n, c);
        System.out.println("\n----------------------------\n");
        triangle.printStarsRightDown(n, c);
        System.out.println("\n----------------------------\n");
        triangle.printStarsRightUp(n, c);
    }

    private void rightTriangleLoop(int n, int i, int j, char c) {
        for (j = 2 * (n - i); j >= 0; j--) {
            System.out.print(" ");
        }
        triangleLoop(i, j, c);
    }

    private void triangleLoop(int i, int j, char c) {
        for (j = 0; j <= i; j++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void printStarsLeftDown(int n, char c) {
        int i, j = 0;
        for (i = 0; i < n; i++) {
            triangleLoop(i, j, c);
        }
    }

    public void printStarsLeftUp(int n, char c) {
        int i, j = 0;
        for (i = n - 1; i >= 0; i--) {
            triangleLoop(i, j, c);
        }
    }

    public void printStarsRightDown(int n, char c) {
        int i, j = 0;
        for (i = 0; i < n; i++) {
            rightTriangleLoop(n, i, j, c);
        }
    }

    public void printStarsRightUp(int n, char c) {
        int i, j = 0;
        for (i = n - 1; i >= 0; i--) {
            rightTriangleLoop(n, i, j, c);
        }
    }

}
