package NSize_Vector;

public interface IFVectorNSize {

    //Mandatory method for calculation vector length
    public double getVectorLength();


    //Mandatory method for calculation scalar multiplication of two vectors

    double getVectorScalarMult(IFVectorNSize a1, IFVectorNSize b1);


    //Mandatory method for summation of two vectors
    IFVectorNSize getVectorSum(IFVectorNSize a1, IFVectorNSize b1);


    //Mandatory method for deduction of two vectors
    IFVectorNSize getVectorDeduct(IFVectorNSize a1, IFVectorNSize b1);


    //Method for compare of two vectors
//        String compareVectors(IFVectorNSize a1, IFVectorNSize b1);


    //Method for output vector information
    public String toString();


    //Method to output N-vector in console
    public void printVector();


}

