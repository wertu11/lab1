package ru.mirea.lab1;

import java.util.Scanner;

public class Number7 {
    public static int factorial(int a) {
        int b = 1;
        for(int i = 1; i <= a; i++){
            b*=i;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = factorial(n);
        System.out.print(b);
    }
}