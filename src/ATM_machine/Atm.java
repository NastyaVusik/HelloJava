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


    //Method for filling ATM with banknotes
    public void AddBanknote(int addSum) {
        System.out.println("Enter amount to fill AMT. Denomination of banknotes is 20, 50, 100. ");
        addSum = scan().nextInt();
        addSum = banknote20 + banknote50 + banknote100;

    }
}
