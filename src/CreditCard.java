
//1) Task 1. Basic homework

import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private double currentAmount;

    private String cardHolder;
    private String cardName;

    CreditCard(String cardName, String accountNumber, double currentAmount, String cardHolder) {
        this.cardName = cardName;
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
        this.cardHolder = cardHolder;
    }

    //Method for charging some amount to the card
    public void chargeAmount() {
        System.out.print("Enter the amount to charge to the card " + cardName + ", $: ");
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();

        //New amount in the account after charging money
        currentAmount = currentAmount + sum;

        System.out.println("Congratulations! You charged: " + sum + " $!");
        System.out.printf("The actual sum in the account " + cardName + " is: " + String.format("%.2f", currentAmount) + " $\n");

//        return currentAmount;
    }


    // Method for withdraw amount from the card
    public void withdrawAmount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw from your card " + cardName + ", $: ");
        double sum = scan.nextDouble();

        // The rest in the account after withdrawing money

        while (currentAmount < sum) {
            System.out.print("This amount isn't available. Please, try again: ");
            sum = scan.nextDouble();
//            if (currentAmount < sum) {
//                System.out.print("This amount isn't available. Please, try again: "); }

            if (currentAmount >= sum) {
                currentAmount = currentAmount - sum;
                System.out.println("Congratulations! You got: " + sum + " $!");
                System.out.printf("The rest in the account " + cardName + " is: " + String.format("%.2f", currentAmount) + " $\n");
                break;
            }
        }
//        return currentAmount;
    }


    //Method for getting card information;
    public void getCardInfo() {
        System.out.println(cardName + " card info of: " + "\n"
                + "Card holder is : " + cardHolder + "\n"
                + "The number of the account is: " + accountNumber + "\n"
                + "Current amount in the account is " + String.format("%.2f", currentAmount));

    }


}
