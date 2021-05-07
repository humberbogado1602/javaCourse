package chapter3;

/*
 * LOGICAL OPERATORS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String[] args){

        //known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //unknown values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("Now enter how many years have you done in your current job");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if (salary >= requiredSalary && years >= requiredYearsEmployed)
                System.out.println("You've accepted for a loan");
        else
            System.out.println("Sorry, you must have worked at your current job " + requiredYearsEmployed + " years or earn $" + requiredSalary + " at least.");
    }
}
