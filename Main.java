package com.company;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = reverseString(s);
        if (isPalindrome(s, s1))
            System.out.println(s + " Это палиндром");
    }
    public static String reverseString(String s){
        int b = s.length();
        String s1 = "";
        for (int i = b-1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
        return s1;
    }
    public static boolean isPalindrome(String s, String s1){
        boolean a = true;
        if (s.equals(s1)){
            return true;
        } else {
            return false;
        }
    }
}
