package Office_Rev1;

public class MainOffice_Rev1 {
    public static void main(String[] args) {

        //Creating objects of the employees
        Employee_Rev1 employee1 = new Accountant_Rev1("accountant", "Winnie the Pooh");
        Employee_Rev1 employee2 = new Director_Rev1("director", "Peppa pig");
        Employee_Rev1 employee3 = new Worker_Rev1("worker", "Blue tractor");

        System.out.println("\n************************************************\n");
        System.out.println(employee1);
        System.out.println("\n************************************************\n");
        System.out.println(employee2);
        System.out.println("\n************************************************\n");
        System.out.println(employee3);
        System.out.println("\n************************************************\n");

    }
}
