
// Task 1. Addition homework

public class Computer {
    private double price;
    private String model;
    private ComputerRam ram;
    private ComputerHdd hdd;

    //Constructor with two parameters
    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        System.out.println("Object " + model + " was created with TWO parameters." + "\n");
    }

    //Constructor with four parameters
    public Computer(double price, String model, ComputerRam ram, ComputerHdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        System.out.println("Object " + model + " was created with FOUR parameters." + "\n");

    }

    public String getComputerInfo() {
        String str = "1. price, $: " + this.price + "\n" +
                "2. model: " + this.model + "\n" +
                "3. RAM name: " + ram.getRamName() + "\n" +
                "4. RAM size: " + ram.getRamSize() + "\n" +
                "5. HDD name: " + hdd.getHddName() + "\n" +
                "6. HDD size: " + hdd.getHddSize() + "\n" +
                "7. HDD type: " + hdd.getHddSize() + "\n";

        return str;
    }

}
