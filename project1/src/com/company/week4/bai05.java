package com.company.week4;

public class bai05 {

    public static void main(String[] args) {
        //Pham DUc Dat
        String s1 = "01001010101010";
        String result = "";
        for (int i=0; i <s1.length(); i++) {
            if (s1.charAt(i) == '1') result += '0';
            else result += '1';
        }

        System.out.println(result);
    }
}
