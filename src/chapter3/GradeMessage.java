package chapter3;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args){

        //get student's letter grade
        System.out.println("Please, enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        scanner.close();

        String message;

        switch ( grade ) {
            case "A": message = "Very well! I'm proud of you: " + grade;
            break;
            case "B": message = "You got a " + grade + ". Congrats!";
            break;
            case "C": message = "You can improve " + grade + " is what you got";
            break;
            case "D": message = "Keep studying, your better than this: " + grade;
            break;
            case "E": message = grade + " , you should study more";
            break;
            case "F": message = "You didn't pass: " + grade;
            break;
            default:
                message = "Unexpected enter, you were supposed to enter a grade. From A to F";
        }

        System.out.println(message);
    }
}
