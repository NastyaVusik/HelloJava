
// Task 1. Addition homework
public class ComputerRam {
    private String ramName;
    private double ramSize;

    public ComputerRam() {
    }

    public ComputerRam(String ramName, double ramSize) {
        this.ramName = ramName;
        this.ramSize = ramSize;
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
