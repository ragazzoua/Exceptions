package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = devide();
        System.out.println(result);
    }

    private static int devide() {
        int x, y;
        try {
            x = getInt();
        } catch (NoSuchElementException e) {
            x = getInt();
        }
        y = getInt();
        System.out.println("x is " + x + " ,y is " + y);
        return x / y;
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            }
        }

    }
}
