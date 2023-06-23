package Vector_2D_3D;

import java.util.Arrays;
import java.util.Scanner;

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


    //Mandatory method for calculation scalar multiplication of two vectors
    public double getVectorScalarMult(Vector2D a, Vector2D b) {

        double vectorScalarMult = a.getX() * b.getX() + a.getY() * b.getY();                //???????????????? Why do I not use super.getX() and Y?

        return vectorScalarMult;

    }


    //Mandatory method for summation of two vectors

    public double getVectorSum(Vector2D a, Vector2D b) {
        Vector2D vectorSum = new Vector2D(x, y, vectorName);        //??????????????? Why do I use parameters for this new object from this.constructor?

        vectorSum.x = a.getX() + b.getX();
        vectorSum.y = a.getY() + b.getY();

        return vectorSum.x;
    }


    //Mandatory method for deduction of two vectors
    public double getVectorDeduct(Vector2D a, Vector2D b) {
        Vector2D vectorDeduct = new Vector2D(x, y, vectorName);

        vectorDeduct.x = b.getX() - a.getX();
        vectorDeduct.y = b.getY() - a.getY();

        return vectorDeduct.x;

    }


    //Static method for output array with random vectors on base random integer number
    public static Vector[] getVectorArray(int N) {
        Vector[] vectorArr = new Vector[N];

        //Filling the array

        //Random vector coordinate
        int coord;

        for (int i = 0; i < vectorArr.length; i++) {
            coord = 1 + (int) (Math.random() * 100);

            Vector2D vector = new Vector2D(coord, coord, "vector" + i);
            vectorArr[i] = vector;
        }

        return vectorArr;
    }


    //Method for compare of two vectors
    public String compareVectors(Vector2D a, Vector2D b) {
        if ((a.getVectorLength() == b.getVectorLength()) && (a.getX() == b.getX()) && (a.getY() == b.getY())) {
            return "vectors are equal";
        }
        return "vectors aren't equal";

    }

    //Overrided method from abstract class Vector
    @Override
    public String toString() {
        return "Information for vector " + vectorName + "\n" +
                staticVectorSystem + "\n" +
                "2) Vector coordinates: x = " + this.x + ", y = " + this.y + "\n" +
                "3) Vector length = " + getVectorLength() + "\n";
    }


}
