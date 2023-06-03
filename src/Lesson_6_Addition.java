import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_6_Addition {
    public static void main(String[] args) {
//        multipleMatrix();
        getSumNumbers();

    }

    //3) Method for multiple of two matrix
    public static void multipleMatrix() {
        System.out.println("\n" + 3 + ") " + "********************************" + "\n");

        //Initialisation of arrays
        int[][] arr1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        //Final array
        int[][] arrRez = new int[arr1.length][arr2[0].length];


        //Check requirement of possibility of multiple
        if (arr1[0].length != arr2.length) {
            System.out.println("You can't multiple this matrix");
            return;
        } else {
            System.out.println("Multiplication of this matrix is easy");
        }

        for (int i1 = 0; i1 < arr1.length; i1++) {
            for (int j1 = 0; j1 < arr1[0].length; j1++) {
                arrRez[i1][j1] = 0;
                for (int i2 = 0; i2 < arr2[0].length; i2++) {

                    arrRez[i1][j1] += arr1[i1][i2] * arr2[i2][j1];
                }
            }
        }
        System.out.println("Final matrix after multiple: " + Arrays.deepToString(arrRez));
    }


    //4) Method for calculation sum of all elements of array
    public static void getSumNumbers() {
        System.out.println("\n" + 4 + ") " + "********************************" + "\n");

        //Initialisation of array
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter quantity of rows of the array: ");
        int rows = scan.nextInt();
        System.out.print("Enter quantity of columns of the array: ");
        int col = scan.nextInt();

        int[][] arr1 = new int[rows][col];
        Random random = new Random();


        int sum = 0;    //counter

        //Fill the array with random numbers
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = random.nextInt(-20, 20);
                sum += arr1[i][j];
            }
        }
        System.out.println("Array arr1: " + Arrays.deepToString(arr1));
        System.out.println("Sum of all elements of array arr1 sum: " + sum);


    }
    /////////////////////////////
}

