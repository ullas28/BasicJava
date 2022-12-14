package com.bridgelabz.Day2;
/*Write a program Distance.java that takes two integer command-line arguments x and y
and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function*/
public class Distance {
    public static double distance(double x, double y) {
        double form = Math.sqrt(Math.pow(x,2)+(Math.pow(y,2)));
        System.out.println("Euclidean distance \t" +form);
        return form;
    }

    public static void main(String[] args) {
        double x,y;
        x = Double.parseDouble(args[0]);
        y = Double.parseDouble(args[1]);
        distance(x,y);
    }
}
