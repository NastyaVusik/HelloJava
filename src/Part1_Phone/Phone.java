package Part1_Phone;

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
    public Phone(String number, String model, double weight) {
        this(number, model, weight 0);
        System.out.println("Phone" + model + "was created with TWO parameters.");
    }

    public String receiveCall(String callerName) {
        String str = "There is call" + callerName;
        return str;
    }

    public String getNumber() {
        return number;
    }


}
