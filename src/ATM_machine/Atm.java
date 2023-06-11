package ATM_machine;

import java.util.Scanner;

public class Atm {
    private int banknote20;
    private int banknote50;
    private int banknote100;
    private int moneyAmount = 0;  // initially quantity of money in ATM

    //Constructor describe nominal of banknotes in Atm
    public Atm(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }


    public Scanner scan() {
        return new Scanner(System.in);
    }

    //Method for checking denominate of banknotes
    public boolean checkAddBanknotes(int addSum, int minBanknote, String... banknoteList) {
        boolean res = false;

        while (addSum != 0) {
            res = true;
            if (minBanknote >= 20) {
                checkAddBanknotes(addSum - 20, 20, banknoteList + " [20] ");
            }
            if (minBanknote >= 50) {
                checkAddBanknotes(addSum - 50, 50, banknoteList + " [50] ");
            }
            if (minBanknote >= 100) {
                checkAddBanknotes(addSum - 100, 100, banknoteList + " [100] ");
            }
        }
        System.out.println(banknoteList);
        return res;
    }


    //Method for filling ATM with banknotes
    public int addBanknote(int denom, int quantity) {

        System.out.println("Enter denomination to fill AMT. Denomination of banknotes is 20, 50, 100 $: ");
        denom = scan().nextInt();

        System.out.println("Enter quantity of banknotes the same nominal: ");
        quantity = scan().nextInt();

        if (quantity > 0) {
            switch (denom) {
                case (20):
                    banknote20 += denom * quantity;
                    break;

                case (50):
                    banknote50 += denom * quantity;
                    break;

                case (100):
                    banknote100 += denom * quantity;
                    break;

                default:
                    System.out.println("Your amount isn't correct. Enter denominate 20, 50, 100 $.");
            }
        } else {
            System.out.println("Your entered quantity < 0");
        }

        moneyAmount = (banknote20 + banknote50 + banknote100);
        System.out.println("\nAmount of money in ATM: " + moneyAmount);
        return moneyAmount;
    }


    //Method for withdraw amount from the  ATM
    public boolean withdrawAmount(int outSum) {
        int sum20 = 0;    //Sum of banknotes of denominate 20
        int quantity20 = 0;   //Quantity of banknotes of denominate 20
        int sum50 = 0;    //Sum of banknotes of denominate 50
        int quantity50 = 0;   //Quantity of banknotes of denominate 50
        int sum100 = 0;   ///Sum of banknotes of denominate 100
        int quantity100 = 0;  //Quantity of banknotes of denominate 50

        if (outSum <= moneyAmount) {
            while (outSum > 0) {
                if (outSum % 20 == 0) {
                    outSum -= 20;
                    sum20 += 20;
                    quantity20++;
                }

                if (outSum % 50 == 0) {
                    outSum -= 50;
                    sum20 += 50;
                    quantity50++;
                }

                if (outSum % 100 == 0) {
                    outSum -= 100;
                    sum20 += 100;
                    quantity100++;
                }
            }
            moneyAmount -= outSum;
            System.out.println("Sum " + outSum + " $ was successfully withdrawn" + "\n");
            System.out.println("Amount of money in ATM: " + moneyAmount + "\n");
            System.out.println("Sum for withdraw: " + "\n" +
                    "denominate 20: 1.Sum = " + sum20 + "; 2.Quantity = " + quantity20 + "\n" +
                    "denominate 50: 1.Sum = " + sum50 + "; 2.Quantity = " + quantity50 + "\n" +
                    "denominate 100: 1.Sum = " + sum100 + "; 2.Quantity = " + quantity100 + "\n");

            return true;
        } else return false;
    }
}
