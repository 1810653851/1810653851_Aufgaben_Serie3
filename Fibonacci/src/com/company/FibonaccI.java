package com.company;

public class FibonaccI {
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++)
            System.out.println(i + ": " + fibonacci(i));
    }

}