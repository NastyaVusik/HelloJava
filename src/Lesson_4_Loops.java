import java.util.Scanner;


class Lesson_4_Loops {
    public static void main(String[] args) {
        getDigits1To99();
        getDigits5To1();
        sumDigits();
        getSequence();
        getNegativeSequence();

    }


    //1. Method for output only uneven numbers from 1 to 99
    public static void getDigits1To99() {
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("****************//****************");
    }


    //2. Method for output numbers from 5 to 1
    public static void getDigits5To1() {
        for (int i = 5; i > 1; i--) {
            System.out.println(i);
        }
        System.out.println("****************//****************");
    }


    //3. Method for calculation summarize digits from 1 to specified digit.
    public static void sumDigits() {

        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        int sum = 0;
        System.out.print("Enter any positive integer number: ");

        for (int i = 1; i < numb; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("****************//****************");
    }


    //    4. Method for output sequence 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    public static void getSequence() {
        int numb = 7;
        while (numb <= 98) {
            System.out.print((numb == 98) ? (numb + ".") : (numb + " "));
            numb += 7;
        }
        System.out.println("****************//****************");
    }


    //    5. Method for output 10 first digits of such sequence  0, -5,-10,-15...
    public static void getNegativeSequence() {
        int numb = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print((i == 10) ? (numb -= 5) : ((numb -= 5) + ", "));
            numb -= 5;
        }
        System.out.println("****************//****************");
    }


}
