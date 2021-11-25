package com.company.week4;

public class bai14 {

    static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }


    public static void main(String args[])
    {
        String s = "1111100000";
        int n = 2;
        int count = 1;
        while (count <= n) {
            for (int i = 1; i <= 8; i++) {
                int j = i + 1;
                s = swap(s, i, j);
            }
            count++;
        }
        System.out.println(s);
//       s);
    }
}
