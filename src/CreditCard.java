
//1) Task 1. Basic homework

import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private double currentAmount;

    CreditCard(String accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    //Method for charging some amount to the card
    double chargeAmount() {
        System.out.print("Enter the amount to charge to the card, $: ");
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();

        //New amount in the account after charging money
        double newSum = currentAmount + sum;

        System.out.println("Congratulations! You charged: " + newSum + " $!");
        System.out.printf("The actual sun in the account is: " + String.format("%.3f", newSum) + " $\n");

        return newSum;
    }


    // Method for withdraw amount from the card
    double withdrawAmount() {
        System.out.print("Enter the amount to withdraw from your card, $: ");
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();

        // The rest in the account after withdrawing money
        double restSum = currentAmount - sum;

        System.out.println("Congratulations! You got: " + sum + " $!");
        System.out.printf("The rest in the account is: " + String.format("%.3f", restSum) + " $\n");

        return restSum;
    }
}
