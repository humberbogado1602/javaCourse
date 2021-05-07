package chapter4;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        //Get text
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");

        String text = scanner.next();

        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i < text.length(); i++){

            char currentLetter = text.charAt(i);
            if (currentLetter == 'A'||currentLetter == 'a'){
                letterFound = true;
                break;
            }System.out.println("The text contains a letter a");
        }

        if (letterFound){
            System.out.println("The text contains a letter a");
        }else {
            System.out.println("The text does not contain a letter a");
        }
    }
}
