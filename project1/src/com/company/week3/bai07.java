package com.company.week3;


public class bai07 {


    public static int getMin(int arr[], int n)
    {
        int res = arr[0];

        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }


    public static void main (String[] args)
    {
        System.out.println("Pham Duc Dat - 20183704");
        int arr[] = { 12, 124, 454, 673, 1155 };
        int n = arr.length;
        System.out.println("So nho hon tat ca cac so trong day la : " + (getMin(arr, n)-1));

    }
}
