package com.company.week4;

public class bai16 {

    public static boolean containsSubstring(String s1, String s2) {
        if(s2.length()==0 && s1!=null)
            return true;

        for(int i=0; i < s1.length() - s2.length() + 1; i++) {
            int k = 0;
            while (k < s2.length() && s1.charAt(k+i) == s2.charAt(k++));
            if (k == s2.length() && s1.charAt(k+i-1) == s2.charAt(k-1)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "phamducdat";
        String s2 = "dat";

        System.out.println(containsSubstring(s1, s2));
    }
}
