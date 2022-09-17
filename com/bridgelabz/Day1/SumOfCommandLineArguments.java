package com.bridgelabz.Day1;
public class SumOfCommandLineArguments {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer command line arguments: " + e.toString());
            }
        }
        System.out.println(sum);
    }
}