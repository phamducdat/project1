package com.company.week2;

public class bai02 {

    public static void main(String[] args) {

        int number = 50;
        double result = 0;
        long denominator = 1;

        for (int i = 1; i <= number; ++i) {
            denominator = denominator*i;
            result += (double) 1/denominator;
        }

        System.out.println(result);
    }
}
