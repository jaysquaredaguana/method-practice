package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(6));
        System.out.println(isEven(7));
        System.out.println(isPositive(6.7));
        System.out.println(isPositive(-6.7));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }
}
