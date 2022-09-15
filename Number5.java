package ru.mirea.lab1;

import java.util.Scanner;
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        int n = sc.nextInt();
        array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            System.out.println(array[i]);
        }
    }
}