package ATM_machine;

public class MainAtm {
    public static void main(String[] args) {

        //New object
        Atm priorbak = new Atm(100, 500, 200);


        priorbak.addBanknote(50, 10);
        System.out.println("\n*************************************************\n");
        priorbak.withdrawAmount(20);
        System.out.println("\n*************************************************\n");


    }
}
