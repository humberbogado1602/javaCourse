package chapter3;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args){

        //get the student score
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score");
        int score = scanner.nextInt();

        scanner.close();

        char grade = 0;

        if ( score < 65 ) grade = 'F';
        else if ( score < 73 ) grade = 'D';
        else if ( score < 83 ) grade = 'C';
        else if ( score < 90 ) grade = 'B';
        else if ( score <= 100 ) grade = 'A';
        else System.out.println("Not a possible score");

        System.out.println("Your grade is " + grade);

    }
}
