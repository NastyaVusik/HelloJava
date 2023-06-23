package Vector_2D_3D;


import java.util.Arrays;
import java.util.Scanner;

public class MainVector {

//    Создайте класс, который описывает вектор в двумерной системе
//    координат.
//    Создайте класс, который описывает вектор в трехмерной системе
//    координат.
//    У каждого класса должны быть:
//            - конструктор с параметрами в виде списка координат (например, x,
//                                                                 y, z);
//- метод, вычисляющий длину вектора. Корень можно посчитать с
//    помощью Math.sqrt();
//- метод, вычисляющий скалярное произведение;
//- метод сложения векторов;
//- метод разности векторов;
//- статический метод, который принимает целое число N, и
//    возвращает массив случайных векторов размером N.
//    Предусмотреть метод сравнение векторов.
//    Предусмотреть метод для вывода информации о векторе.
//    Каждый из классов должен иметь константу, содержащею описание
//    вектора.
//            Например, "Это вектор для двумерной системы координат".
//    Эта константа так же должна выводиться в методе для вывода
//    информации о векторе.


    public static void main(String[] args) {

        //Create objects of 2D vectors
        Vector2D vectorA2 = new Vector2D(1, 3, "vectorA");
        Vector2D vectorB2 = new Vector2D(4, -9, "vectorB");

        //Create objects of 3D vectors
        Vector3D vectorA3 = new Vector3D(1, 3, -4, "vectorC");
        Vector3D vectorB3 = new Vector3D(-5, 2, 6, "vectorC");


        //Output info about vectors
        System.out.println(vectorA2);
        System.out.println(vectorB2);


        //Calling of calculation methods for 2D vectors

        System.out.println("\n********************************************************\n");
        System.out.println("Brain exercises with couple of 2D vectors:\n");
        System.out.print("Scalar multiplication of two vectors: ");
        System.out.println(vectorA2.getVectorScalarMult(vectorA2, vectorB2));

        System.out.print("\nSummation of two vectors: ");
        System.out.println(vectorA2.getVectorSum(vectorA2, vectorB2));


        System.out.print("\nDeduction of two vectors: ");
        System.out.println(vectorA2.getVectorDeduct(vectorA2, vectorB2));

        System.out.print("\nCompare of two vectors: ");
        System.out.println(vectorA2.compareVectors(vectorA2, vectorB2));

        System.out.println("\nOutput array with random vectors on base random integer number.");

        //Declare of scanner to enter any number N
        System.out.println("Enter any integer positive number N: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        //Creating object of array vectorArr
        Vector[] vectorArr = Vector2D.getVectorArray(N);

        //Output of vector array
        for (Vector vector : vectorArr) {
//            System.out.println(Arrays.toString(vectorArr));
            System.out.println(vector + "\t");

        }


        //Calling of calculation methods for 3D vectors

        System.out.println("\n********************************************************\n");
        System.out.println("Brain exercises with couple of 3D vectors:\n");
        System.out.print("Scalar multiplication of two vectors: ");
        System.out.println(vectorA3.getVectorScalarMult(vectorA3, vectorB3));

        System.out.print("\nSummation of two vectors: ");
        System.out.println(vectorA3.getVectorSum(vectorA3, vectorB3));


        System.out.print("\nDeduction of two vectors: ");
        System.out.println(vectorA3.getVectorDeduct(vectorA3, vectorB3));

        System.out.print("\nCompare of two vectors: ");
        System.out.println(vectorA3.compareVectors(vectorA3, vectorB3));

    }
}

