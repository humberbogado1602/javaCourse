package finalProject;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, enter your name...");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Player 2, enter your name...");
        Player player2 = new Player(scanner.nextLine());

        System.out.println("Player1, you have to guess either heads or tails, enter any of them");
        String p1Guess = scanner.nextLine();
        boolean valid = false;

        do{
            switch (p1Guess.toLowerCase()){
                case "heads": player1.setGuess(true);
                    System.out.println("You pick heads, player2 picks tails");
                    player2.setGuess(false);
                    valid = true;
                    break;
                case "tails": player1.setGuess(false);
                    System.out.println("You pick tails, player2 picks heads");
                    player2.setGuess(false);
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid enter, pick between heads and tails");
                    p1Guess = scanner.nextLine();
            }
        }while (!valid);

        System.out.println("");

        Coin coin = new Coin();
        coin.flip();
        coin.printResults();

        if (coin.getSide() == player1.getGuess()){
            System.out.println("Player1 wins");
        }else{
            System.out.println("Player2 wins");
        }
    }

}
