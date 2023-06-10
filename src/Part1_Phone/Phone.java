package Part1_Phone;

import java.util.Scanner;

public class Phone {
    private String number;
    private String model;
    private double weight;


    //A constructor with three parameters
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println("Phone" + model + "was created with THREE parameters.");
    }

    //A constructor with two parameters
    public Phone(String number, String model) {
        this(number, model, 0);
        System.out.println("Phone" + model + "was created with TWO parameters.");
    }


    //A constructor without parameters
    public Phone() {
        this("Unknown", "Unknown", 0);
        System.out.println("Phone" + model + "was created WITHOUT parameters.");
    }


    //Method for output phone info
    public String getPhoneInfo() {
        String str = "Phone information:" + "\n" +
                "1. Phone model: " + model + "\n" +
                "2. Phone number: " + number + "\n" +
                "3. Phone weight: " + weight + "\n";

        return str;
    }


    //Method for receive call
    public String receiveCall(String callerName) {
        System.out.print("Enter names of the callers: ");

        callerName = scan().nextLine();
        String str = callerName + " is calling";
        return str;
    }


    //Method for return a phone number
    public String getNumber() {
        return "Phone " + model + " has number " + number;
    }


    //Method for receive call was overloaded. Create a new class for this method?????????
    public String receiveCall(String callerName, String number) {
        callerName = scan().nextLine();
        String str = "There is call: " + callerName + "\n" +
                "number: " + number;
        return str;
    }


    public void sendMessage(String... numbers) {

        System.out.println("Enter phone number: ");
        for (String numberMessage : numbers) {
            numberMessage = scan().nextLine();
            System.out.println(numberMessage + "\n");
        }
    }

    public Scanner scan() {
        return new Scanner(System.in);
    }

}
