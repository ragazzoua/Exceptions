package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int x = 98;
//        int y = 0;
//        System.out.println(devideLBYL(x,y));
//        System.out.println(devideEAFP(x,y));
//        System.out.println(devide(x,y));

        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an Integer");
        String  input = scanner.next();
        for (int i = 0; i< input.length(); i++){
            if (!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if (isValid){
            return Integer.parseInt(input);
        }
        else {
            return 0;
        }
    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        try {
            return scanner.nextInt();
        }
        catch (InputMismatchException e){
            return 0;
        }
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

    private static int devide(int x, int y) {
        return x / y;
    }
}
