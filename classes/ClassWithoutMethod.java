package com.example.demo.classes;

import java.util.Scanner;

public class ClassWithoutMethod {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        String temp = s.nextLine();
        String operation = s.nextLine();//no1 \n no2 \n operation
        switch(operation) {
            case "+":
               //addition(n1, n2);
               int SAtish = addition(n1, n2);
                System.out.println("Sum of given numbers = "+ SAtish);
                break;
            case "*":
                multiplication(n1,n2);
                break;
            case "-":
                substraciton(n1, n2);
                break;
            case "/":
               division(n1, n2);//method call
                break;
            case "%":
                modulo(n1, n2);
                break;
            default:
                System.out.println("Wrong Operation");
        }
    }

    public static int addition(int n1, int n2) {
        int hari = n1+n2;
        return hari;
    }

    public static void multiplication(int n1, int n2) {
        int multiplication = n1*n2;
        System.out.println("Multiplication of given numbers = "+ multiplication);
    }

    public static  void division(int n1, int n2) {
        int xyz = n1/n2;
        System.out.println("division of given numbers = "+ xyz);
    }

    public static void substraciton(int n1, int n2) {
        int sub = n1-n2;
        System.out.println("Sub of given numbers = "+ sub);
    }

    public static void modulo(int n1, int n2) {
        int mod = n1%n2;
        System.out.println("mod of given numbers = "+ mod);
    }

}
