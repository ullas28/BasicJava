package com.bridgelabz.Day1;
public class DemonstrateStatic_Methods_Blocks {
    static int a;
    static String s;
    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        DemonstrateStatic_Methods_Blocks d = new DemonstrateStatic_Methods_Blocks();
        d.add(45,55);
        System.out.println("Static variables a and s value "+a + "\t " +s);

    }

    void add(int a1 , int b1){
        int sum = a1 + b1;
        System.out.println("Method add result is\t" + sum);
    }
}
