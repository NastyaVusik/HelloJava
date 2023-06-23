package Vector_2D_3D;

public interface IFVector {

    //Mandatory method for calculation vector length
    public double getVectorLength();


    //Mandatory method for calculation scalar product of two vectors
    public double getVectorScalarProduct(Vector2D a, Vector2D b);


    //Mandatory method for summation of two vectors
    public double getVectorSum(Vector2D a, Vector2D b);


    //Mandatory method for deduction of two vectors
    public double getVectorDeduct(Vector2D a, Vector2D b);


    //Static method for output array with random vectors on base random integer number
    public static double[] vectorArr(int N) {
        return new double[N];
    }


    //Method for compare of two vectors
    public boolean compareVectors(Vector2D a, Vector2D b);


    //Method for output vector information
    public String toString();

}
