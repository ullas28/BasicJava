package com.bridgelabz.Day3;
/*Java Program to print the elements of an array present on odd position*/
public class OddPosition {
    public static void main(String[] args) {
        int []a = {0,1,2,3,4,5,6};
        for(int i = 1; i < a.length; i++) {
            System.out.println(a[i]);
            i++;
        }
    }
}
