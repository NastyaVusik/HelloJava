import java.util.Scanner;

public class Lesson_3 {
    public static Scanner info;

    public static void main(String[] args) {
        info = new Scanner(System.in);
        getPersonInfo();
        info = new Scanner(System.in);
        getSymbol();
        getBodyMassIndex();
        info.close();
    }

    /*Method for reading from the console and output person's info*/

    public static void getPersonInfo() {
        System.out.print("Input person name: ");
        String name = info.nextLine();
        System.out.print("Input person surname: ");
        String surname = info.nextLine();
        System.out.print("Input person age: ");
        int age = info.nextInt();
        System.out.print("Input person height: ");
        double height = info.nextDouble();
        System.out.print("Input person weight: ");
        double weight = info.nextDouble();

//Output of person info
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }


    //Method for reading of symbol and convert it in a number

    public static void getSymbol() {

        //Read symbol from Scanner;
        System.out.print("Input one char: ");
        char ch = info.nextLine().charAt(0);

        //Output of symbol ch in letter and digit format
        System.out.println(ch + " - " + (int) ch);

    }

    //Method for calculation of body mass index(BMI)

    public static void getBodyMassIndex() {

        //Reading from Scanner
        System.out.print("Input person weight: ");
        double weight = info.nextDouble();
        System.out.print("Input person height: ");
        double height = info.nextDouble();

        //BMI calculation
        double bmi = weight / (height * height);

        //BMI output
        System.out.println("BMI = " + bmi);

    }
}

