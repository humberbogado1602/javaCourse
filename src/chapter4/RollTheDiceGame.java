package chapter4;

/*
    The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
    Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
    After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
    Repeat this 4 additional times, for 5 rolls in total.
    However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
    If they are greater than or less than 20 spaces exactly, they lose.
    Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;

public class RollTheDiceGame {

    public static void main(String[] args) {

        //known values
        int boardSpaces = 20;
        int attempts = 5;

        Random random = new Random();
        int hand = 0;

        boolean goalFlag = false;

        for (int i = 0; hand < boardSpaces && i < attempts && hand != boardSpaces; i++){

            hand += random.nextInt(6) + 1;

            if (hand == boardSpaces){
                goalFlag = true;
            }
                else if (hand < boardSpaces){
                System.out.println("You're in " + hand + " space. You need " + (boardSpaces - hand) + " to win");

            }

            }

        if (goalFlag){
            System.out.println("You win!");
        }else {
            System.out.println("You lose :(");
        }
        }
    }

