package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args){

        //known values
        int quota = 10;

        //unknown values
        System.out.println("Enter how many sales did the employee do through this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if ( sales >= quota)
            System.out.println("Congrats! Keep it doing that way");
        else {
            int salesShort = quota - sales;
            System.out.println("You should work harder next time. You were " + salesShort + " sales short");
        }
    }

}
