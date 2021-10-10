package com.company.week3;

import java.util.ArrayList;
import java.util.Arrays;

public class bai05 {

    public static boolean kiemTraSoNguyenTo(int n) {
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
        ArrayList<Integer> arrayList =
                new ArrayList<>(Arrays.asList(1,2,4,5,5,41,2342));

        int soNguyenTo = (int) arrayList.stream().filter(bai05::kiemTraSoNguyenTo).count();
        System.out.println("Tong cac so nguyen to = " + soNguyenTo);
        System.out.println("Tong cac so nguyen to = " + (arrayList.size() - soNguyenTo));


    }
}
