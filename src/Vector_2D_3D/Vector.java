package Vector_2D_3D;

public abstract class Vector implements IFVector {

    //Declare vector coordinates
    protected double x;
    protected double y;
    protected double z;
    protected String vectorName;

    //Constant parameter
    protected static String staticVectorSystem;


    //Constructor
    public Vector(double x, double y, double z, String vectorName) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.vectorName = vectorName;
        Vector.staticVectorSystem = "1) This vector belongs to 3D coordinate system.";
    }


    //Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getVectorName() {
        return vectorName;
    }

    public void setVectorName(String vectorName) {
        this.vectorName = vectorName;
    }


    //Method for output vector information
    @Override
    public String toString() {
        return "Information for vector " + vectorName + "\n" +
                staticVectorSystem + "\n" +
                "2) Vector coordinates: x = " + this.x + "y = " + this.y + "z = " + this.z + "\n" +
                "3) Vector length = " + getVectorLength() + "\n";
    }


}
