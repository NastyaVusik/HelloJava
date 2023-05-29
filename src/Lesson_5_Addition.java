import java.util.Scanner;
import java.util.Arrays;

public class Lesson_5_Addition {
    public static void main(String[] args) {
        getEvenArray();
        getArrWithNulls();
        getArrayRandomNames();
        sortBubbleMethod();


    }

    //5) Method for output array with even numbers from other random array
    public static void getEvenArray() {
        System.out.println("\n" + 5 + ") " + "********************************" + "\n");

        //Declaration of array length
        int arr1Length = 0;

        //Read array length from Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array from 6 to 10: ");

        while ((arr1Length <= 5) | (arr1Length > 10)) {
            arr1Length = scan.nextInt();

            if ((arr1Length <= 5) | (arr1Length > 10)) {
                System.out.println("You input wrong length of array. Please, try again: ");
            } else {
                break;
            }
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
        System.out.println();
    }


    // 6) Method for creating two arrays. One array is with random numbers. The second array is with nulls instead of uneven index
    public static void getArrWithNulls() {
        System.out.println("\n" + 6 + ") " + "********************************" + "\n");

        //Get length of array from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array. It can be any integer positive number: ");
        int arr1Length = scan.nextInt();

        //initialization of array arr1
        int[] arr1 = new int[arr1Length];

        //Fill array with random numbers
        for (int i = 0; i < arr1Length; i++) {
            arr1[i] = 1 + (int) (Math.random() * 100);
        }
        System.out.print("Array arr1: " + "\n" + Arrays.toString(arr1) + "\n");

        //Initialization new array with the same length as arr1. Copy elements from arr1 to new array
        int[] arrNew = new int[arr1Length];

        for (int i = 0; i < arr1Length; i++) {
            if (i % 2 == 0) {
                arrNew[i] = arr1[i];
            } else {
                arrNew[i] = 0;
            }
        }
        System.out.println("Array arrNew: " + "\n" + Arrays.toString(arrNew));
    }


    //7) Method for filling array with random names
    public static void getArrayRandomNames() {
        System.out.println("\n" + 7 + ") " + "********************************" + "\n");

        //Initialization String array with names
        String[] arr1 = new String[]{"Tom", "Masha", "Vitalik", "Misha", "Lesha", "Andrei", "Petr", "Sveta"};
        Arrays.sort(arr1);
        System.out.print(Arrays.toString(arr1));
        System.out.println();
    }


    //8) Bubble method
    public static void sortBubbleMethod() {
        System.out.println("\n" + 8 + ") " + "********************************" + "\n");

        //Temporary variable
        int temp;

        //Get length of array from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array. It can be any integer positive number: ");
        int arr1Length = scan.nextInt();

        //initialization of array arr1
        int[] arr1 = new int[arr1Length];

        //Fill array with random numbers
        for (int i = 0; i < arr1Length; i++) {
            arr1[i] = 1 + (int) (Math.random() * 100);
        }
        System.out.print("Array arr1: " + "\n" + Arrays.toString(arr1) + "\n");

        // Realisation of bubble sort
        for (int i = 1; i < arr1Length; i++) {
            for (int j = (arr1Length - 1); j >= i; j--) {
                if (arr1[j - 1] > arr1[j]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j - 1];
                    arr1[j - 1] = temp;
                }
            }
        }
        System.out.print("\n" + "Array arr1 after bubble sort: " + "\n" + Arrays.toString(arr1));
    }


/////////////////////////////////////

}














