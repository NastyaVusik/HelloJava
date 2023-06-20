import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {


//        1. Написать программу для вывода названия поры года по
//        номеру месяца.
//        При решении используйте оператор switch-case.
//        2. Написать программу для вывода названия поры года по
//        номеру месяца.
//        При решении используйте оператор if-else-if.
//        3. Напишите программу, которая будет принимать на вход число и
//        на выход будет выводить сообщение четное число или нет.
//                Для определения четности числа используйте операцию
//        получения остатка от деления - операция выглядит так: '% 2').
//        4. Для введенного числа t (температура на улице) вывести
//        Если t>–5, то вывести «Тепло».
//        Если –5>= t > –20, то вывести «Нормально».
//        Если –20>= t, то вывести «Холодно».
//        5. По введенному номеру определить цвет радуги (1 –
//        красный, 4 – зеленый и т. д.)


        getYearTimeSwitch();
        getYearTimeIf();
        checkEvenNumb();
        getTempComment();
        getRainbowColor();

    }

    //1) Method for output time of the year according to the number. Loop Switch-Case was used
    public static void getYearTimeSwitch() {
        System.out.println("\n" + 1 + ") " + "********************************" + "\n");

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
        System.out.println("\n" + 2 + ") " + "********************************" + "\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 12: ");
        int monthNum = scan.nextInt();

        if (monthNum == 1 || monthNum == 2 || monthNum == 12) {
            System.out.println("This is winter");

        } else if (3 <= monthNum & monthNum <= 5) {
            System.out.println("This is spring");

        } else if (6 <= monthNum & monthNum <= 8) {
            System.out.println("This is summer");

        } else if (9 <= monthNum & monthNum <= 11) {
            System.out.println("This is autumn");

        } else {
            System.out.println("The number doesn't correspond with time of the year");

        }
    }


    //3) Method for checking of even numbers
    public static void checkEvenNumb() {
        System.out.println("\n" + 3 + ") " + "********************************" + "\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int numb = scan.nextInt();

        if ((numb % 2) == 0) {
            System.out.println("Number " + numb + " is even");
        } else {
            System.out.println("Number " + numb + " is uneven");
        }
    }


    //4) Method for comment about temperature on the street
    public static void getTempComment() {
        System.out.println("\n" + 4 + ") " + "********************************" + "\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any temperature: ");
        int temp = scan.nextInt();

        if (temp > -5) {
            System.out.println("Тепло");
        } else if ((temp > -20) & (temp <= -5)) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }


    //5) Method for output rainbow colors
    public static void getRainbowColor() {
        System.out.println("\n" + 5 + ") " + "********************************" + "\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number from 1 to 7: ");
        int colorNumb = scan.nextInt();

        switch (colorNumb) {
            case (1):
                System.out.println("1 - red");
                break;
            case (2):
                System.out.println("2 - orange");
                break;
            case (3):
                System.out.println("3 - yellow");
                break;
            case (4):
                System.out.println("4 - green");
                break;
            case (5):
                System.out.println("5 - light blue");
                break;
            case (6):
                System.out.println("6 - blue");
                break;
            case (7):
                System.out.println("7 - purple");
                break;
            default:
                System.out.println("Your input wrong number");

        }
        scan.close();

    }

}





