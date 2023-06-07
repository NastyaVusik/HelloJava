
//1) Task 1. Basic homework

import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private double currentAmount;

    private String cardHolder;

    CreditCard(String accountNumber, double currentAmount, String cardHolder) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
        this.cardHolder = cardHolder;
    }

    //Method for charging some amount to the card
    double chargeAmount() {
        System.out.print("Enter the amount to charge to the card, $: ");
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();

        //New amount in the account after charging money
//        double newSum = currentAmount + sum;
        currentAmount = currentAmount + sum;

        System.out.println("Congratulations! You charged: " + sum + " $!");
        System.out.printf("The actual sum in the account is: " + String.format("%.2f", currentAmount) + " $\n");

        return currentAmount;
    }


    // Method for withdraw amount from the card
    double withdrawAmount() {
        System.out.print("Enter the amount to withdraw from your card, $: ");
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();

        // The rest in the account after withdrawing money
//        double restSum = currentAmount - sum;
        currentAmount = currentAmount - sum;

        System.out.println("Congratulations! You got: " + sum + " $!");
        System.out.printf("The rest in the account is: " + String.format("%.2f", currentAmount) + " $\n");

        return currentAmount;
    }


    //Method for getting card information;
    public void getCardInfo() {
        System.out.println("Card info:" + "\n"
                + "Card holder is : " + cardHolder + "\n"
                + "The number of the account is: " + accountNumber + "\n"
                + "Current amount in the account is " + currentAmount);

    }


}
