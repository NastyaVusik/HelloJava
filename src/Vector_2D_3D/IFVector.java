package Vector_2D_3D;

public interface IFVector {

    //Mandatory method for calculation vector length
    public double getVectorLength();


    //Mandatory method for calculation scalar multiplication of two vectors
    public double getVectorScalarMult(Vector2D a, Vector2D b);


    //Mandatory method for summation of two vectors
    public double getVectorSum(Vector2D a, Vector2D b);


    //Mandatory method for deduction of two vectors
    public double getVectorDeduct(Vector2D a, Vector2D b);


    //Static method for output array with random vectors on base random integer number
    public static Vector[] getVectorArr(int N) {
        return null;
    }


    //Method for compare of two vectors
    public String compareVectors(Vector2D a, Vector2D b);


    //Method for output vector information
    public String toString();

}
