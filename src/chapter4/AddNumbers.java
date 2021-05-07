package chapter4;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("Enter number 1");
            double num1 = scanner.nextDouble();
            System.out.println("Enter number 2");
            double num2 = scanner.nextDouble();

            System.out.println("The result is:" + (num1+num2));
            System.out.println("You wanna continue? true/false");
            again = scanner.nextBoolean();

        }while (again);
    }
}
