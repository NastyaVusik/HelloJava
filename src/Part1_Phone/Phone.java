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


    //Method for receive call
    public String receiveCall(/*String callerName*/) {
        String callerName = scan().nextLine();
        String str = "There is call" + callerName;
        return str;
    }


    //Method for return a phone number
    public String getNumber() {
        return number;
    }


    //Method for receive call was overrided. Create a new class for this method?????????
    @Override
    public String receiveCall(/*String callerName, String number*/) {
        String callerName = scan().nextLine();
        String str = "There is call" + callerName + "\n" +
                "number: " + number;
        return str;
    }


    public String sendMessage(String... numbers) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        for (String number : numbers) {
            number = scan.nextLine();
            System.out.println(number + "\n");
        }
        return number;
    }

    public Scanner scan() {
        return new Scanner(System.in);
    }


}
