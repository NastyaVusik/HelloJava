package Vector_2D_3D;

public class Vector3D extends Vector {

    //Constructor was inherited from abstract class Vector
    public Vector3D(double x, double y, double z, String vectorName) {
        super(x, y, z, vectorName);
        Vector.staticVectorSystem = "1) This vector belongs to 3D coordinate system.";
    }


    //Methods from interface IFVector
    //Mandatory method for calculation vector length
    @Override
    public double getVectorLength() {
        double length = Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());

        return length;
    }


    //Mandatory method for calculation scalar multiplication of two vectors
    @Override
    public double getVectorScalarMult(IFVector a1, IFVector b1) {
        Vector3D a = (Vector3D) a1;
        Vector3D b = (Vector3D) b1;

        if ((a == null) || (b == null)) {
            System.out.println("Object of vector can't be null.");
            return 0;
        }

        double vectorScalarMult = a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();

        return vectorScalarMult;

    }


    //Mandatory method for summation of two vectors
    @Override
    public double getVectorSum(IFVector a1, IFVector b1) {
        Vector3D a = (Vector3D) a1;
        Vector3D b = (Vector3D) b1;
        Vector3D vectorSum = new Vector3D(x, y, z, vectorName);        //??????????????? Why do I use parameters for this new object from this.constructor?

        vectorSum.x = a.getX() + b.getX();
        vectorSum.y = a.getY() + b.getY();
        vectorSum.z = a.getZ() + b.getZ();

        return vectorSum.z;
    }


    //Mandatory method for deduction of two vectors
    @Override
    public double getVectorDeduct(IFVector a1, IFVector b1) {
        Vector3D a = (Vector3D) a1;
        Vector3D b = (Vector3D) b1;
        Vector3D vectorDeduct = new Vector3D(x, y, z, vectorName);

        vectorDeduct.x = b.getX() - a.getX();
        vectorDeduct.y = b.getY() - a.getY();
        vectorDeduct.z = b.getZ() - a.getZ();

        return vectorDeduct.x;

    }


    //Static method for output array with random vectors on base random integer number
    public static IFVector[] getVectorArray(int N) {
        Vector[] vectorArr = new Vector[N];

        //Filling the array

        //Random vector coordinate
        int coord;

        for (int i = 0; i < vectorArr.length; i++) {
            coord = 1 + (int) (Math.random() * 100);

            Vector3D vector = new Vector3D(coord, coord, coord, "vector" + i);
            vectorArr[i] = vector;
        }

        return vectorArr;
    }


    //Method for compare of two vectors
    @Override
    public String compareVectors(IFVector a1, IFVector b1) {
        Vector3D a = (Vector3D) a1;
        Vector3D b = (Vector3D) b1;

        if ((a.getVectorLength() == b.getVectorLength()) && (a.getX() == b.getX()) && (a.getY() == b.getY()) && (a.getZ() == b.getZ())) {
            return "vectors are equal";
        }
        return "vectors aren't equal";

    }

    //Overrided method from abstract class Vector
    @Override
    public String toString() {
        return "Information for vector " + vectorName + "\n" +
                staticVectorSystem + "\n" +
                "2) Vector coordinates: x = " + this.x + ", y = " + this.y + ", z = " + this.z + "\n" +
                "3) Vector length = " + String.format("%.1f", getVectorLength()) + "\n";
    }

}

