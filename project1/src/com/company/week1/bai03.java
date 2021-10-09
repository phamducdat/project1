package com.company.week1;

public class bai03 {

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 1000 ; i <= 2000; ++i) {
            if (check(i)) System.out.println(i);
        }
    }
}
