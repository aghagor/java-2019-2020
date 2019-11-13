package utils;

import javax.swing.*;
import java.util.Arrays;

public class StringUtil {

    public static void main(String[] args) {
        System.out.println("|  " + (char) ('0' - 48) + " |");
        System.out.println("|  " + ('0' - 48) + " |");
        System.out.println(parsInt("1234"));
        System.out.println(subString("C:\\Program Files\\Java\\jdk1.8.0_201\\bin\\java.exe", 0, 25));
        System.out.println(calculateCount("C:\\Program Files\\Java\\jdk1.8.0_201\\bin\\java.exe", 'e'));
        System.out.println(Arrays.toString(split("dssdsad dsada asd dsa")));
        System.out.println("   dsd fdsf sdfa fsdagf      sdaf  1   ".length());
        System.out.println(trim("   dsd fdsf sdfa fsdagf      sdaf  1   "));
        System.out.println(trim("   dsd fdsf sdfa fsdagf      sdaf  1   ").length());
    }

    public static int parsInt(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                JOptionPane.showMessageDialog(null,
                        "Failed to parse string to int: '" + str + '\'');
                return Integer.MIN_VALUE;
            }
            res = res * 10 + ch - '0';
        }

        return res;
    }


    public static String[] split(String text) {
        StringBuilder sb = new StringBuilder();
        String[] stArray = new String[calculateCount(text, ' ') + 1];
        for (int i = 0, j = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                stArray[j] = sb.toString();
                j++;
                sb = new StringBuilder();
            } else {
                sb.append(text.charAt(i));
            }
            stArray[j] = sb.toString();
        }
        return stArray;
    }


    public static String trim(String text) {
        int end = text.length();
        text.trim();
        int i = 0;
        while (i < end && text.charAt(i) <= ' ') {
            i++;
        }
        while (end > i && text.charAt(end - 1) <= ' ') {
            end--;
        }
        return end > i ? subString(text, i, end) : "";
    }

    public static String subString(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (end > text.length()) {
                System.out.println("Ending number is bigger then text length!!!");
                break;
            }
            if (start < 0 || end < 0) {
                System.out.println("Starting number or ending number is small then zero, please check the numbers!!!");
                break;
            }
            if (i >= start && i < end) sb.append(text.charAt(i));

        }
        return sb.toString();
    }


    public static int calculateCount(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != symbol) {
                continue;
            }
            count++;
        }
        return count;
    }

}
