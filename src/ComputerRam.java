
// Task 1. Addition homework
public class ComputerRam {
    private String ramName;
    private double ramSize;

    //Default constructor
    public ComputerRam() {
        System.out.println("Object " + ramName + " was created with ZERO parameters." + "\n");
    }

    public ComputerRam(String ramName, double ramSize) {
        this.ramName = ramName;
        this.ramSize = ramSize;
        System.out.println("Object " + ramName + " was created with TWO parameters." + "\n");
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    public String getRamName() {
        return ramName;
    }

    public void setRamName(String ramName) {
        this.ramName = ramName;
    }
}
