// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

class Lesson_5_Basic {
    public static void main(String[] args) {
        checkPresenceOfNumb();
        deleteNumb();

    }


    //Method for determination presence of the number in array
    public static void checkPresenceOfNumb() {

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
                System.out.println("This array contains the number " + numb);
                break;
            }
            if (j == arr.length - 1) {
                System.out.println("This array doesn't contain the number " + numb);
            }
        }

    }


    //Method for delete all certain numbers from array
    public static void deleteNumb() {

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
            System.out.println("Array arr doesn't contain the number " + numb);
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
    }


}

