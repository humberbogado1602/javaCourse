package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        //ask the user for a season
        System.out.println("Please, name a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //ask for a whole number
        System.out.println("Enter a whole number");
        int wholeNumber = scanner.nextInt();

        //ask for an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        scanner.close();//always remember free memory space

        //use the input to complete a sentence
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
