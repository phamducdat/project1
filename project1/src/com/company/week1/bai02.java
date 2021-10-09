package com.company.week1;

public class bai02 {

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

        int count = 0;
        int start = 2;
        while (count < 20) {
            if (check(start)) {
                System.out.println(start);
                count++;
            }
            start++;

        }
    }
}
