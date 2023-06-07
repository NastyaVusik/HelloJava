
//1) Task 1. Basic homework

import java.util.Scanner;

public class CreditCard {
    private int accountNumber;
    private double currentAmount;

    CreditCard(int accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    // Method for withdraw amount from the card
    public double withdrawAmount() {
        // The rest in the account after withdrawing money
        double restSum;
        System.out.print("Enter the amount to withdraw from your card: ");
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        restSum = currentAmount - sum;

        System.out.println("Congratulations! You got" + accountNumber + "$!");
        System.out.println("The rest in the account is: " + restSum);

        return accountNumber;
    }
}
