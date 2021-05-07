package chapter4;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 * nOfStudents = 24 | nOfTests = 4
 */

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        //known variables
        int nOfStudents = 24;
        int nOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nOfStudents; i++){

            double score = 0;
            for (int j = 0; j < nOfTests; j++){
                System.out.println("Enter score test for test #" + (j+1));
                score += scanner.nextDouble();

            }
            double avgScore = score / nOfTests;
            System.out.println("Average score from student #" + (i+1) + " is " + avgScore);
        }
    }
}
