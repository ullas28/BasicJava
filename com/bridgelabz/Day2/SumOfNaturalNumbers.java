package com.bridgelabz.Day2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value for n");
        int s1 = s.nextInt();
        int Sum = 0,k = 0;
        while (k<=s1){
            Sum += k;
            k++;
        }
        System.out.println("Sum of N numbers is " + Sum);
    }
}