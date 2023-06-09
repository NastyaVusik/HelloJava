
// Task 1. Addition homework
public class ComputerHdd {
    private String hddName;
    private double hddSize;
    private String hddType;

    public ComputerHdd() {
        this("Unknown", 0, "Unknown");
        System.out.println("Object " + hddName + " was created with ZERO parameters." + "\n");

    }

    public ComputerHdd(String hddName, double hddSize, String hddType) {
        this.hddName = hddName;
        this.hddSize = hddSize;
        this.hddType = hddType;
        System.out.println("Object " + hddName + " was created with THREE parameters." + "\n");
    }

    public String getHddName() {
        return hddName;
    }

    public double getHddSize() {
        return hddSize;
    }

    public String getHddType() {
        return hddType;
    }

}


