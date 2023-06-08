
// Task 1. Addition homework

public class Computer {
    private double price;
    private String model;
    private ComputerRam ram;
    private ComputerHdd hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(double price, String model, ComputerRam ram, ComputerHdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;

    }


//    System.out.println("Computer information: " + "\n"
//            + "1. price, $: " + price +"\n"
//            + "2. model: " + model);

}
