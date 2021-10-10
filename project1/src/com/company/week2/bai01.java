package com.company.week2;

public class bai01 {

    public static void main(String[] args) {

        int number = 224;
        double sum = 0;
        int denominator = 0;
        for (int i = 1; i <= number; ++i) {
            denominator += i;
            sum += (double) 1/denominator;
        }
        System.out.println(sum);
    }
}
