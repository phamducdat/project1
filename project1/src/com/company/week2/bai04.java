package com.company.week2;

public class bai04 {

    private static int fibbonaci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibbonaci(n-1) + fibbonaci(n-2);
    }

    public static void main(String[] args) {

        int number = 24;
        System.out.println(fibbonaci(number));
    }
}
