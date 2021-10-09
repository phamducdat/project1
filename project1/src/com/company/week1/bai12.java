package com.company.week1;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class bai12 {

    public static void main(String[] args) {
        System.out.println("Nhap chieu cao tam giac");
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        while (2 > number || 10 < number) {
            System.out.println("Nhap lai: ");
            number = scanner.nextInt();
        }
        for (int i = 1; i <= number + 1; i++) {
            for (int j = number+ 1-i; j >= 1; --j)
                System.out.print("* " );
            System.out.println();
        }

    }
}
