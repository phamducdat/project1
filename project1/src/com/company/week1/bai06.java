package com.company.week1;

public class bai06 {


    private static boolean check(int value) {
        int sum = 0;
        for (int i = 1; i <= value /2; i ++) {
            if (value % i == 0) sum+=i;
        }
        return sum == value;
    }

    public static void main(String[] args) {
        int count = 0;
        int start = 1;
        while (count < 5){
            if (check(start)) {
                count ++;
                System.out.println(start);
            }
            start++;
        }
    }
}
