import java.util.Scanner;

public class Lesson_5_Addition {
    public static void main(String[] args) {
        getEvenArray();


    }

    //5) Method for output array with even numbers from other random array
    public static void getEvenArray() {
        System.out.println("\n" + 5 + ") " + "********************************" + "\n");

        //Declaration of array length
        int arr1Length;

        //Read array length from Scanner
        Scanner scan = new Scanner(System.in);
        do {
            outer:
            System.out.println("Enter length of array from 6 to 10: ");
            arr1Length = scan.nextInt();
        } while ((arr1Length <= 5) || (arr1Length > 10));


        if ((arr1Length <= 5) || (arr1Length > 10)) {
            System.out.println("You input wrong length of array. Please, try again: ");
            continue outer;
        }

        //Counter for count quantity of even numbers in arr1
        int count = 0;

        //Initialization of array arr1 and filling it with random numbers. Simultaneously define quantity of even numbers in arr1
        int[] arr1 = new int[arr1Length];

        for (int i = 0; i < arr1Length; i++) {
            arr1[i] = 1 + (int) (Math.random() * 100);

            if (arr1[i] % 2 == 0) {
                count++;
            }
        }

// Checking of expediency to suffer from array with even numbers
        if (count == 0) {
            System.out.println("There are no any even numbers in the array arr1");
        } else {
            //  Declare index for array newArr
            int newArrIndex = 0;

            //Initialization of array arrEven and filling it with even numbers from array arr1
            int[] arrEven = new int[count];

            System.out.println("Array arrEven from even numbers of array arr1: ");
            for (int i = 0; i < arr1Length; i++) {
                if (arr1[i] % 2 == 0) {
                    arrEven[newArrIndex] = arr1[i];
                    System.out.print(arrEven[newArrIndex] + "\t");
                }
            }
        }

    }


}