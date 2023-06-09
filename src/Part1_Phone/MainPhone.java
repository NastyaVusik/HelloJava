package Part1_Phone;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class MainPhone {
    public static void main(String[] args) {

//Create phone with constructor with three parameters
        Phone phone1 = new Phone("+375291234567", "Samsung a51", 190);

        //Create phone with constructor with two parameters
        Phone phone2 = new Phone("+375291234568", "Samsung a51", 0);

        //Create phone with constructor with two parameters
        Phone phone3 = new Phone("unknown", "unknown", 0);

        System.out.println(phone1.receiveCall());
        System.out.println(phone2.receiveCall());
        System.out.println(phone3.receiveCall());
        System.out.println("\n*********************************************************\n");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println("\n*********************************************************\n");

        //Call @Override method - ?????????????????????????
        System.out.println(phone1.receiveCall(Phone callerName, Phone number);

        sendMessage();


    }
}

