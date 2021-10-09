package com.company.week1;

public class bai10 {

    public static void main(String[] args) {
        int number = 224;
        int i = 2;
        while (i  < number) {
            if (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
            else {
                i++;
            }
        }
    }
}
