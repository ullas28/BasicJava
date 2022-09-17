package com.bridgelabz.Day1;
import java.util.Objects;
import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        System.out.println("Enter two strings to compare");
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println(s1.equals(s2));
        System.out.println("Using string equals case ignore, enter two string");
        s1 = s.nextLine();
        s2 = s.nextLine();
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("using object equal method");
        String s3 = new String("Ullas");
        String s4 = new String("Ullas");
        System.out.println("String objects are " + s3 +" \t"+s4 );
        System.out.println("after comparing two string objects using Objectequals method\t" + Objects.equals(s3,s4));
        System.out.println("Using string comapare to method lexographically");
        System.out.println(s1.compareTo(s2));
    }
}
