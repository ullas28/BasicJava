package com.bridgelabz.Day2;

import java.util.Scanner;

public class ReverseNumberUsingFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Integer to reverse");
        int i = s.nextInt();
        String str1 = "";
        String str = Integer.toString(i);
        for (int k=0;k < str.length();k++) {
            char ch = str.charAt(k);
            str1 = ch + str1;
        }
        System.out.println("Reversed string using String Class\t" + str1);
    }
}