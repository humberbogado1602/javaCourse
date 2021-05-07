package chapter7;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int BOUND = 69;

    public static void main(String[] args) {

        int[] ticket = generateTickets();
        printTickets(ticket);
    }

    private static int[] generateTickets() {
        int[] tickets = new int[LENGTH];
        Random number = new Random();
        for (int i = 0; i < LENGTH; i++){
            tickets[i] = number.nextInt(BOUND)+1;
        }
        return tickets;
    }
    
    private static void printTickets(int[] ticket) {
        for (int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
