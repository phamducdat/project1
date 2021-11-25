package com.company.week3;

public class bai10 {


    public static void main(String[] args) {
        int arr[] = {5, 6, 4, 7, 23, 56, 23, 4, 43, 64, 4, 23, 46, 34, 32 , 4, 5};
        int soLuong = 0;
        int phanTu = 0;

        int flags[] = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            flags[arr[i]] ++;
        }

        for (int i = 0; i < flags.length; i++) {
            if (flags[i] > soLuong) {
                soLuong = flags[i];
                phanTu = i;
            }
        }

        System.out.println("Pham Duc Dat - 20183704");
        System.out.println("So luong = " + soLuong);
        System.out.println("Phan tu dau tien = " + phanTu);




    }
}
