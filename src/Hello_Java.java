// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;
public class Lesson_4 {
    public static void main(String[] args) {
        getYearTime();
    }

    //Method for output time of the year according to the number
    public static void getYearTime() {
//      import java.util.Scanner;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 12: ");
        int monthNum = scan.nextInt();


        switch (monthNum) {
            case (1):
            case (2):
            case (12):
                System.out.println("This is winter");
                break;

            case (3):
            case (4):
            case (5):
                System.out.println("This is spring");
                break;

            case (6):
            case (7):
            case (8):
                System.out.println("This is summer");
                break;

            case (9):
            case (10):
            case (11):
                System.out.println("This is autumn");
                break;

            default:
                System.out.println("The number doesn't correspond with time of the year");
                break;
        }
    }
}





