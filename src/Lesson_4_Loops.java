//import java.util.Scanner;

class Lesson_4_Loops {
    public static void main(String[] args) {
        getDigits1To99();
        getDigits5To1();

    }

    //1. Method for output only uneven numbers from 1 to 99
    public static void getDigits1To99() {
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("****************");
    }


    //2. Method for output numbers from 5 to 1
    public static void getDigits5To1() {
        for (int i = 5; i > 1; i--) {
            System.out.println(i);
        }
    }


}
