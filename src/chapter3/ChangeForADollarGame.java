package chapter3;

import java.util.Scanner;

/*
    penny = c1
    nickel = c5
    dime = c10
    quarter = c25
 */
public class ChangeForADollarGame {

    public static void main(String[] args) {

        System.out.println("Welcome to 'Change for a Dollar'! " + "Your goal is to enter enough change to make exactly $1.00");

        //ask user for values of coins
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many penny coins would you like ");
        int pennyAmount = scanner.nextInt();
        double pennyValue = 1;

        System.out.println("How nickel coins would you like ");
        int nickelAmount = scanner.nextInt();
        double nickelValue = 5;

        System.out.println("How dime coins would you like ");
        int dimeAmount = scanner.nextInt();
        double dimeValue = 10;

        System.out.println("How many quarter coins would you like ");
        int quarterAmount = scanner.nextInt();
        double quarterValue = 25;

        scanner.close();

        int goalChange = 100;
        double change = (pennyAmount * pennyValue) + (nickelAmount * nickelValue) + (dimeAmount * dimeValue) + (quarterAmount * quarterValue);

        if ( change == goalChange ) System.out.println("You win!");
            else if ( change < goalChange ) System.out.println("You are " + ( goalChange - change ) + " cents under the goal");
            else if ( change > goalChange ) System.out.println("You are " + ( change - goalChange ) + " cents over the goal");

    }
}
