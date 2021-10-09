package com.company.week1;

public class bai04 {

    private static boolean check(int value) {
        return value % 3 == 0 && value % 7 == 0;
    }

    public static void main(String[] args) {

        for (int i = 0 ; i < 100; ++i) {
            if (check(i)) System.out.println(i);
        }
    }
}
