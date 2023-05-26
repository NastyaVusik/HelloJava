// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Lesson_5_Basic {
    public static void main(String[] args) {
        checkPresenceOfNumb();


    }


    //Method for determination of presence of the number in array
    public static void checkPresenceOfNumb() {

        //Initialization of the array
        int[] arr = new int[]{5, -12, 34, 126, 256, -25, 17};

        //Getting the number from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int numb = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (numb == arr[i]) {
                System.out.println("This array contains the number.");
            } else {
                System.out.println("This array doesn't contain the number.");
            }
        }

    }


}

