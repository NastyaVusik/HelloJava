//import java.util.Scanner;

class Lesson_4_Loops {
    public static void main(String[] args) {
        getDigits1To99();

    }

    //Method for output only uneven numbers from 1 to 99
    public static void getDigits1To99() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


}
