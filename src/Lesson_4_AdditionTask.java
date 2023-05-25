import java.util.Scanner;

public class Lesson_4_AdditionTask {
    public static void main(String[] args) {
        getFibonacci();
        calcBankDeposit();
        getmultTable();
    }


    //1) Method for output the first 11 members of Fibonacci numbers
    public static void getFibonacci() {
        System.out.println("\n" + 1 + ") " + "********************************" + "\n");

        int numb = 0;
        int nextNumb = 1;
        int lastNumb = 0;

        int tempNumb;
        for (int i = 1; i <= 11; i++) {

//Variable nextNumb go to the place of numb
            tempNumb = numb;
            numb = nextNumb;
            nextNumb = tempNumb;

            //Variable numb go to the place of lastNumb
            tempNumb = lastNumb;
            lastNumb = numb;
            numb = tempNumb;

            System.out.print(i == 11 ? (numb + "\n") : (numb + ", "));
            nextNumb = lastNumb + numb;

        }
    }


    //2) Method for calculation of total sum of bank deposit
    public static void calcBankDeposit() {
        System.out.println("\n" + 2 + ") " + "********************************" + "\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter beginning bank deposit: ");
        float primarySum = scan.nextFloat();
        System.out.print("Enter quantity of month for bank deposit storage: ");
        int monthQuantity = scan.nextInt();
        float delta; // 7% for sum of deposit per month
        float sum = primarySum;

        for (int i = 1; i <= monthQuantity; i++) {
            sum += 0.07 * sum;
        }
        System.out.println("Total deposit sum: " + sum);
        scan.close();
    }


    //3) Method for output of multiplication table
    public static void getmultTable() {
        System.out.println("\n" + 3 + ") " + "********************************" + "\n");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

    }


}
