package NSize_Vector;

import java.util.Arrays;
import java.util.Scanner;


public class NSize_Vector implements IFVectorNSize {

    //Declare of array of vector's coordinates, vector's name and static variable
    private double[] nVector;
    private String vectorName;
    private static String staticVectorSystem;
    int size;

    //Constructor
    public NSize_Vector(int size, String vectorName) {
        this.size = size;
        this.vectorName = vectorName;
        this.nVector = new double[size];

        staticVectorSystem = "1) This vector belongs to arbitrary coordinate system.";
    }


    //Getters
    public double[] getnVector() {
        return nVector;
    }


    //Method for filling an array of coordinates with random numbers
    //size - Quantity of coordinates of vector
    public static NSize_Vector getVectorSize(int size1, String vectorName) {
        NSize_Vector nSizeVector = new NSize_Vector(size1, vectorName);

        //Random vector coordinate
        int coord;

        //Filling the array
        for (int i = 0; i < nSizeVector.nVector.length; i++) {
            coord = 1 + (int) (Math.random() * 10);

            nSizeVector.nVector[i] = coord;
        }

        return nSizeVector;
    }


    //Static method for output array with random vectors on base random integer number
    //N - quantity of random vectors
    public static IFVectorNSize[] getVectorArray(int N, int size1, String name) {
        IFVectorNSize[] nVectorArr = new IFVectorNSize[N];

        //Filling the array
        for (int i = 0; i < nVectorArr.length; i++) {

            IFVectorNSize randomNVector = getVectorSize(size1, name);
            nVectorArr[i] = randomNVector;
        }

        return nVectorArr;
    }


    //Methods from interface IFVectorNSize
    //Mandatory method for calculation vector length

    public double getVectorLength() {
        double sum = 0;
        for (int i = 0; i < nVector.length; i++) {
            sum += nVector[i] * nVector[i];
        }
        double length = Math.sqrt(sum);

        return length;
    }


    //Mandatory method for calculation scalar multiplication of two vectors
//   @Override
//    public double getVectorScalarMult(IFVectorNSize a1) {
//        NSize_Vector a = (NSize_Vector) a1;
//
//        double vectorScalarMult = 0;
//
//        for(int i = 0; i< nVector.length; i++) {
//
//            vectorScalarMult += a.nVector[i] * nVector[i];
//        }
//        return vectorScalarMult;
//    }


    @Override
    public double getVectorScalarMult(IFVectorNSize a1, IFVectorNSize b1) {
        NSize_Vector a = (NSize_Vector) a1;
        NSize_Vector b = (NSize_Vector) b1;

        double vectorScalarMult = 0;

        for (int i = 0; i < nVector.length; i++) {

            vectorScalarMult += (a.nVector[i]) * (b.nVector[i]);
        }
        return vectorScalarMult;
    }


    //Mandatory method for summation of two vectors
    @Override
    public IFVectorNSize getVectorSum(IFVectorNSize a1, IFVectorNSize b1) {
        NSize_Vector a = (NSize_Vector) a1;
        NSize_Vector b = (NSize_Vector) b1;

//Declare result vector for summation of coordinates vectors a and b
        NSize_Vector nVectorSum = new NSize_Vector(a.size, vectorName);


        //Loop for filling array of coordinate's sum
        for (int i = 0; i < a.nVector.length; i++) {
            nVectorSum.nVector[i] = a.nVector[i] + b.nVector[i];
        }
        return nVectorSum;
    }


    //Mandatory method for deduction of two vectors
    @Override
    public IFVectorNSize getVectorDeduct(IFVectorNSize a1, IFVectorNSize b1) {
        NSize_Vector a = (NSize_Vector) a1;
        NSize_Vector b = (NSize_Vector) b1;

        //Declare result vector for deduction of coordinates vectors a and b
        NSize_Vector nVectorDeduct = new NSize_Vector(size, vectorName);


        //Loop for filling array of coordinate's deduction
        for (int i = 0; i < a.nVector.length; i++) {
            nVectorDeduct.nVector[i] = a.nVector[i] - b.nVector[i];
        }
        return nVectorDeduct;

    }


    //Method to output N-vector in console
    public void printVector() {
        for (int i = 0; i < nVector.length; i++) {
            System.out.println("[" + i + "] = " + nVector[i]);
        }
    }


    //Method for compare of two vectors
//    @Override
//    public String compareVectors(IFVectorNSize a1, IFVectorNSize b1) {
//        NSize_Vector a = (NSize_Vector) a1;
//        NSize_Vector b = (NSize_Vector) b1;
//
//        if ((a.getVectorLength() == b.getVectorLength()) && (a.getX() == b.getX()) && (a.getY() == b.getY())) {
//            return "vectors are equal";
//        }
//        return "vectors aren't equal";
//
//    }

    //Overrided method from abstract class Vector
    @Override
    public String toString() {
        return "Information for vector " + vectorName + ":\n" +
                staticVectorSystem + "\n" +
                "2) Vector size = " + size + "\n" +
                "3) Vector length = " + String.format("%.1f", getVectorLength()) + "\n";
//        "4) Vector coordinates: " + Arrays.toString(nVector) + "\n";
    }
}
