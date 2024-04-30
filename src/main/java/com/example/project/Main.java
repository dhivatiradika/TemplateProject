package com.example.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Add number: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Ini adalah" + a);
    }

    public static int add(int a, int b) {
        return a+b;
    }
}
