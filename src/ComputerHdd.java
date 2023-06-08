
// Task 1. Addition homework
public class ComputerHdd {
    private String hddName;
    private double hddSize;
    private String hddType;

    public ComputerHdd() {
    }

    public ComputerHdd(String hddName, double hddSize, String hddType) {
        this.hddName = hddName;
        this.hddSize = hddSize;
        this.hddType = hddType;
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

    public void setHddName(String hddName) {
        this.hddName = hddName;
    }

    public void setHddSize(double hddSize) {
        this.hddSize = hddSize;
    }

    public void setHddType(String hddType) {
        this.hddType = hddType;
    }
}


