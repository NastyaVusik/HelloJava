// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

class Lesson_4 {        //Why word public give error?
    public static void main(String[] args) {
        getYearTimeSwitch();
        getYearTimeIf();
        checkEvenNumb();
        getTempComment();

    }

    //1) Method for output time of the year according to the number. Loop Switch-Case was used
    public static void getYearTimeSwitch() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 12: ");
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
                System.out.print("The number doesn't correspond with time of the year");
                break;
        }
    }

    //2) Method for output time of the year according to the number. Loop if-else was used
    public static void getYearTimeIf() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 12: ");
        int monthNum = scan.nextInt();

        if (monthNum == 1 || monthNum == 2 || monthNum == 12) {
            System.out.println("This is winter");
//    break;                             //Why in this case I can't use break?
        } else if (3 <= monthNum & monthNum <= 5) {
            System.out.println("This is spring");
//            break;
        } else if (6 <= monthNum & monthNum <= 8) {
            System.out.println("This is summer");
//            break;
        } else if (9 <= monthNum & monthNum <= 11) {
            System.out.println("This is autumn");
//    break;
        } else {
            System.out.println("The number doesn't correspond with time of the year");
//    break;
        }
    }


    //3) Method for checking of even numbers
    public static void checkEvenNumb() {

        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        System.out.print("Enter any integer number: ");

        if ((numb % 2) == 0) {
            System.out.println("Number" + numb + "is even");
        } else {
            System.out.println("Number" + numb + "is uneven");
        }
    }


    //4) Method for comment about temperature on the street
    public static void getTempComment() {

        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        System.out.print("Enter any temperature: ");

        if (temp > -5) {
            System.out.println("Тепло");
        } else if ((-20 < temp) & (temp <= -5)) {
            System.out.println("Нормально");
        } else if (temp <= -20) {
            System.out.println("Холодно");
        }
    }

}





