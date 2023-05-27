// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

class Lesson_5_Basic {
    public static void main(String[] args) {
        checkPresenceOfNumb();
        deleteNumb();
        getMinMidMaxValue();

    }


    //1) Method for determination presence of the number in array
    public static void checkPresenceOfNumb() {
        System.out.println("\n" + 1 + ") " + "********************************" + "\n");

        //Initialization of the array and filling it via the loop for
        int[] arr = new int[10];

        System.out.println("Output of new array arr:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 5;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //Getting the number from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int numb = scan.nextInt();

        //Searching of the number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == numb) {
                System.out.println("This array contains a number " + numb);
                break;
            }
            if (j == arr.length - 1) {
                System.out.println("This array doesn't contain a number " + numb);
            }
        }

    }


    //2) Method for delete all certain numbers from array
    public static void deleteNumb() {
        System.out.println("\n" + 2 + ") " + "********************************" + "\n");

        //Initialization of the array
        int[] arr = new int[]{5, -12, 34, 126, 256, -25, 17, 34, 56, 34};

        //Counter of quantity required numbers
        int count = 0;

        //Input number for deduct from array
        System.out.print("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numb) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Array arr doesn't contain a number " + numb);
        }

        //Create new array from old array arr. Specified number isn't included in new array
        int[] newArr = new int[arr.length - count];


//  Declare index for array newArr
        int newArrIndex = 0;

        // Fill newArr with numbers from arr
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != numb) {
                newArr[newArrIndex] = arr[i];
                System.out.print(newArr[newArrIndex] + "\t");
                newArrIndex++;
            }
        }
        System.out.println();
    }


    //3) Method for output min, middle and max value in array

    public static void getMinMidMaxValue() {
        System.out.println("\n" + 3 + ") " + "********************************" + "\n");

        //Getting array length from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array arr:");
        int arrLength = scan.nextInt();


        //Initialization of the array and filling it via the loop with random numbers
        int[] arr = new int[arrLength];

        System.out.println("Output of new array arr:");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = 1 + (int) (Math.random() * 100);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //Determination of min, middle, max value in array arr
        int minArr = arr[0];
        int maxArr = arr[0];
        int midArr = arr[0];

        //Initialization of sum of all elements in array
        int sum = 0;

        for (int i = 0; i < arrLength; i++) {
            if (minArr > arr[i]) {
                minArr = arr[i];
            }

            if (maxArr < arr[i]) {
                maxArr = arr[i];
            }

            sum += arr[i];
        }

        System.out.println("Min value in array arr: " + minArr);
        System.out.println("Max value in array arr: " + maxArr);

        midArr = sum / arrLength;
        System.out.println("Middle value in array arr: " + midArr);

    }


}

