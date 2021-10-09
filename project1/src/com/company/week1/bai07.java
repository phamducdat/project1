package com.company.week1;

public class bai07 {

    private static int divisibleBy5() {
        int result = 0;
        for (int i =0 ; i <= 100; ++i) {
            if (i %5 == 0) result++;
        }
        return  result;
    }

    private static int divisibleBy5Remandier1() {
        int result = 0;
        for (int i =0 ; i <= 100; ++i) {
            if (i %5 == 1) result++;
        }
        return  result;
    }

    private static int divisibleBy5Remandier2() {
        int result = 0;
        for (int i =0 ; i <= 100; ++i) {
            if (i %5 == 2) result++;
        }
        return  result;
    }

    private static int divisibleBy5Remandier3() {
        int result = 0;
        for (int i =0 ; i <= 100; ++i) {
            if (i %5 == 3) result++;
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println("So cac so chia het cho 5 = "+divisibleBy5());
        System.out.println("So cac so chia 5 du 1 = " + divisibleBy5Remandier1());
        System.out.println("So cac so chia 5 du 2 = " + divisibleBy5Remandier2());
        System.out.println("So cac so chia 5 du 3 = " + divisibleBy5Remandier3());
    }
}
