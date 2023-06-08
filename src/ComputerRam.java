
// Task 1. Addition homework
public class ComputerRam {
    public String ramName;
    public double ramSize;

    //Default constructor
    public ComputerRam() {
        System.out.println("Object " + ramName + " was created with ZERO parameters." + "\n");
    }

    public ComputerRam(String ramName, double ramSize) {
        this.ramName = ramName;
        this.ramSize = ramSize;
        System.out.println("Object " + ramName + " was created with TWO parameters." + "\n");
    }

//    public double getRamSize() {
//        return ramSize;
//    }
//
//    public String getRamName() {
//        return ramName;
//    }

}
