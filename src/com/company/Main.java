package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x = 98;
        int y = 0;
        System.out.println(devideLBYL(x,y));
        System.out.println(devideEAFP(x,y));
    }

    private static int devideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int devideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
