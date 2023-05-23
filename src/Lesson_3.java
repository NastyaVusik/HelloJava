import java.util.Scanner;
public class Lesson_3 {
    public static void main(String[] args) {
        getPersonInfo();
        //getSymbol();
        //getBodyMassIndex();
    }

/*Method for reading from the console and output person's info*/

    public static void getPersonInfo(){
        Scanner info = new Scanner(System.in);
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
        info.close();

//Output of person info
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

