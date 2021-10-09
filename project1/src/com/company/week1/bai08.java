package com.company.week1;

public class bai08 {

    public static void main(String[] args) {
        int number = 100;

        for (int i = 2; i <= number ; ++i) {
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
