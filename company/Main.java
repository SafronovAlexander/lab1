package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 100;
        for(int i = 2; i < n; i++){
            isPrime(i);
            if ((isPrime(i) == true))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int n) {
        int b;
        boolean a = true;
        for(int i = 2; i <= n; i++){
            b = n % i;
            if ((b == 0) && (i != n))
                a = false;
        }
        return a;
    }
}
