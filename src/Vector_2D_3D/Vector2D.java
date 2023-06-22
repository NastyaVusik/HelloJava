package Vector_2D_3D;

public class Vector2D extends Vector {

    //Constructor was inherited from abstract class Vector
    public Vector2D(double x, double y, String vectorName) {
        super(x, y, 0, vectorName);
        Vector.staticVectorSystem = "1) This vector belongs to 2D coordinate system.";
    }


    //Methods from interface IFVector

    //Mandatory method for calculation vector length

    public double getVectorLength() {
        double length = Math.sqrt(super.getX() * super.getX() + super.getY() * super.getY());

        return length;
    }


    //Mandatory method for calculation scalar product of two vectors

    public double getVectorScalarProduct(double vectorScalarProduct, Vector2D a, Vector2D b) {

        vectorScalarProduct = a.getX() * b.getX() + a.getY() * b.getY();                //???????????????? Why do I not use super.getX() and Y?

        return vectorScalarProduct;

    }


    //Mandatory method for summation of two vectors
    public Vector2D getVectorSum(Vector2D a, Vector2D b) {
        Vector2D vectorSum = new Vector2D(x, y, vectorName);        //??????????????? Why do I use parameters for this new object from this.constructor?

        vectorSum.x = a.getX() + b.getX();
        vectorSum.y = a.getY() + b.getY();

        return vectorSum;
    }


    //Mandatory method for deduction of two vectors
    public Vector2D getVectorDeduct(Vector2D a, Vector2D b) {
        Vector2D vectorDeduct = new Vector2D(x, y, vectorName);

        vectorDeduct.x = b.getX() - a.getX();
        vectorDeduct.y = b.getY() - a.getY();

        return vectorDeduct;

    }


    //Static method for output array with random vectors on base random integer number
    public static double[] vectorArray(int N) {
        double[] vectorArr = new double[N];

        return vectorArr;
    }


    //????????????????????????????????
    //Method for compare of two vectors
    public boolean compareVectors() {
        return false;
    }


    //Overrided method from abstract class Vector
    @Override
    public String toString() {
        return "Information for vector " + vectorName + "\n" +
                staticVectorSystem + "\n" +
                "2) Vector coordinates: x = " + this.x + this.y + "\n" +
                "3) Vector length = " + getVectorLength() + "\n";
    }


}
