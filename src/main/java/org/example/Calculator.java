package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstnum= sc.nextInt();
        System.out.println("Enter the Second Number");
        int secondnum = sc.nextInt();
        System.out.println("choose the operator(+,-,*,/)");
        char operator= sc.next().charAt(0);

        switch (operator)
        {
            case '+':
                System.out.println(firstnum + secondnum);
                break;
            case '-':
                System.out.println(firstnum - secondnum);
                break;
            case '*':
                System.out.println(firstnum * secondnum);
                break;
            case '/':
                if(secondnum != 0) {
                    System.out.println(firstnum / secondnum);
                }
                else {
                    System.out.println("cannot divide by zero");
                }
                break;
            default:
                System.out.println("invalid operator");
        }
        sc.close();
    }
}
