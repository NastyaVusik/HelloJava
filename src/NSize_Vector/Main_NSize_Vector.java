package NSize_Vector;

import Vector_2D_3D.IFVector;
import Vector_2D_3D.Vector2D;

import java.util.Scanner;

public class Main_NSize_Vector {


//    Предыдущее задание обобщить и написать один класс Vector для
//    произвольной размерности.
//    Для этого в классе вектор для хранения координат следует использовать
//    массив.

    //   ( Создайте класс, который описывает вектор в двумерной системе
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
//    информации о векторе.)


    public static void main(String[] args) {

        System.out.println("\nOutput  N-size vectors' coordinates on base random integer number.");

        //Declare of scanner to enter size of vectors
        System.out.println("Enter any integer positive number for array of arbitrary vectors coordinates: ");
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();

        //Create objects of N-size vectors
        NSize_Vector vectorN1 = NSize_Vector.getVectorSize(size1, "N-vectorA");
        NSize_Vector vectorN2 = NSize_Vector.getVectorSize(size1, "N-vectorB");


        //Creating object of arbitrary vectors NSizevectorArr
        for (int i = 0; i < size1; i++) {
            vectorN1.getnVector()[i] = 1 + (int) (Math.random() * 10);
        }

        System.out.println("\n********************************************************\n");


        //Output info about vectors
        System.out.println(vectorN1);
        System.out.println(vectorN2);


        //Calling of calculation methods for arbitrary vectors

        System.out.println("\n********************************************************\n");
        System.out.println("Brain exercises with couple of arbitrary vectors:\n");
        System.out.print("Scalar multiplication of two vectors: ");
        System.out.println(vectorN1.getVectorScalarMult(vectorN1, vectorN2));


        System.out.print("\nSummation of two vectors: ");
        vectorN1.getVectorSum(vectorN1, vectorN2).printVector();

        System.out.println("\n********************************************************\n");

        System.out.print("\nDeduction of two vectors: ");
        System.out.println(vectorN1.getVectorDeduct(vectorN1, vectorN2));

//        System.out.print("\nCompare of two vectors: ");
//        System.out.println(vectorN1.compareVectors(vectorN1, vectorN2));


    }
}
