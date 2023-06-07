// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class MainCard {
    public static void main(String[] args) {
        CreditCard MasterCard1 = new CreditCard("MasterCard1", "BY1234567890", 5000.1, "Vova Ivanov");
        CreditCard MasterCard2 = new CreditCard("MasterCard2", "BY1234567891", 1500, "Katya Ivanova");
        CreditCard MasterCard3 = new CreditCard("MasterCard3", "BY1234567892", 400, "Masha Ivanova");


        MasterCard1.chargeAmount();
        System.out.println("\n*****************************************\n");
        MasterCard2.chargeAmount();
        System.out.println("\n*****************************************\n");
        MasterCard3.withdrawAmount();
        System.out.println("\n*****************************************\n");
        MasterCard1.getCardInfo();
        System.out.println("\n*****************************************\n");
        MasterCard2.getCardInfo();
        System.out.println("\n*****************************************\n");
        MasterCard3.getCardInfo();
        System.out.println("\n*****************************************\n");


    }
}

