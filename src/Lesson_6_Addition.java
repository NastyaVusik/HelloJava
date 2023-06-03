import java.util.Arrays;

public class Lesson_6_Addition {
    public static void main(String[] args) {
        multipleMatrix();

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


    /////////////////////////////
}
