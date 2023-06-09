package ATM_machine;

import java.util.Scanner;

public class Atm {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    //Constructor describe nominal of banknotes in Atm
    public Atm(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        System.out.println("Object ATM was created: ");
    }


    public Scanner scan() {
        return new Scanner(System.in);
    }

    //Method for checking denominate of banknotes
    public boolean checkAddBanknotes(int addSum, int minBanknote, String... banknoteList) {
        boolean res = false;

        while (addSum != 0) {
//            System.out.println(banknoteList);
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
    public void AddBanknote(int addSum) {
        System.out.println("Enter amount to fill AMT. Denomination of banknotes is 20, 50, 100 $. ");
        addSum = scan().nextInt();
        while (addSum.checkAddBanknotes() != true) {
            System.out.println("Your amount isn't correct. ATM give banknotes with denominate 20, 50, 100 $.");
            addSum = scan().nextInt();
        }
        if (addSum.checkAddBanknotes() == true)
            addSum += addSum;
        System.out.println("Sum " + addSum + " $ was successfully added");
    }

    //Method for withdraw amount from the  ATM
    public boolean withdrawAmount() {
        System.out.println("Enter amount to withdraw from the AMT. Denomination of banknotes is 20, 50, 100 $. ");
    }
}
