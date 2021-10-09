package com.company.week1;

public class bai05 {

    private static boolean check(int value) {
        return value % 3 == 0 && value % 7 == 0 && value % 5 == 0;
    }

    public static void main(String[] args) {
        for (int i = 1000; i < 2000; ++i) {
            if (check(i)) System.out.println(i);
        }
    }
}
