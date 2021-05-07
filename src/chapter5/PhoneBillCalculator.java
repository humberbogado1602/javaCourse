package chapter5;

/*
Calculate the final total of someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage minutes.
Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill.
 */

import java.util.Scanner;

public class PhoneBillCalculator {

    static double tax = .15;
    static double charge = .25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Get the values from the client
        double clientPlanFee = clientPlanFee();
        double clientOvgMinutes = clientOverageMinutes();

        double clientCharge = calculateCharge(clientOvgMinutes);
        double subTotal = calculateTax(clientPlanFee, clientCharge);
        double total = calculateTotal(clientPlanFee, clientCharge, subTotal);

        printResults(clientPlanFee, clientCharge, subTotal, total);

    }

    private static double clientPlanFee() {

        System.out.println("How many is your fee?");
        return scanner.nextDouble();
    }

    private static double clientOverageMinutes() {

        System.out.println("How long did you overage? In minutes");

        return scanner.nextDouble();
    }

    private static double calculateCharge(double clientOvgMinutes) {
        return clientOvgMinutes * charge;
    }

    private static double calculateTax(double clientPlanFee, double clientCharge){

        return (clientPlanFee + clientCharge) * tax;
    }

    private static double calculateTotal(double clientPlanFee, double clientCharge, double subTotal) {

        return clientPlanFee + clientCharge + subTotal;
    }

    private static void printResults(double clientPlanFee, double clientCharge, double subTotal, double total) {

        System.out.println("Phone bill statement");
        System.out.println("Plan: $" + clientPlanFee);
        System.out.println("Overage: $" + clientCharge);
        System.out.println("Tax: $" + subTotal);
        System.out.println("Total: $" + total);
    }
}
