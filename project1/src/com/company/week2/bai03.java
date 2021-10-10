package com.company.week2;

public class bai03 {

    private static long factorial(int value) {
        long result = 1;
        for (int i = 1; i <= value ; ++i) {
            result *= i;
        }
        return  result;
    }

    public static void main(String[] args) {
        int number = 50;
        double result = 0;
        long denominator = 0;

        for (int i = 1; i <= number; ++i) {
            denominator += factorial(i);
            result += (double) 1/denominator;
        }

        System.out.println(result);

    }
}
