package utils;

import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {
        Rhombus rm = new Rhombus();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rhombus side symbols N : ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);

        rm.makeRhombus(n, c);
    }

    private void inWhileLoop(int n, int i, int j, char c) {
        j = 1;
        while (j++ <= n - i) {
            System.out.print(" ");
        }
        j = 1;
        while (j++ <= i * 2 - 1) {
            System.out.print(c);
        }
    }

    public void makeRhombus(int n, char c) {
        int i = 1;
        int j = 0;
        while (i <= n) {
            inWhileLoop(n, i, j, c);
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {
            inWhileLoop(n, i, j, c);
            System.out.println();
            i--;
        }
    }
}

