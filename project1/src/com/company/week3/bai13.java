package com.company.week3;

import java.util.Scanner;

public class bai13 {

    public static void main(String[] args) {
        System.out.println("Pham Duc Dat - 20183704");
        System.out.print("Vui long nhap so n(3<=n<=8) : ");
        int n = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (n < 3 || n > 8) {
            System.out.print("Vui long nhap lai: ");
            n = input.nextInt();
        }
        System.out.println("Nhap du lieu bang tinh");
        int a[][] = new int[n+1][n+1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                Scanner element = new Scanner(System.in);
                a[i][j] = element.nextInt();
            }

        }

        System.out.println("Du lieu vua nhap");
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                System.out.print(a[i][j] + " | ");
            }
            System.out.println();
        }

    }
}
