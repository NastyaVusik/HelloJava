package Vector_2D_3D;

public interface IFVector {

    //Mandatory method for calculation vector length
    public double getVectorLength();


    //Mandatory method for calculation scalar multiplication of two vectors
    public double getVectorScalarMult(IFVector a, IFVector b);


    //Mandatory method for summation of two vectors
    public double getVectorSum(IFVector a, IFVector b);


    //Mandatory method for deduction of two vectors
    public double getVectorDeduct(IFVector a, IFVector b);


    //Static method for output array with random vectors on base random integer number
    public static IFVector[] getVectorArr(int N) {
        return null;
    }


    //Method for compare of two vectors
    public String compareVectors(IFVector a, IFVector b);


    //Method for output vector information
    public String toString();

}
