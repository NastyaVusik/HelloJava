import java.util.Scanner;

//        Создать программу, которая с помощью класса Scanner принимает
//        следующие данные: имя, фамилия, возраст, рост и вес. Эти данные
//        должны храниться в соответствующих переменных. Используя
//        стандартный вывод выведите информацию следующим образом:
//        Name: _name
//        Surname: _surname
//        Age: _age
//        Height: _height
//        Weight: _weight
//        2. Напишите код, который будет принимать один символ и выводить в
//        консоль символическое значение, а напротив его численное. Например:
//        С - 66
//        а - 67
//        3. Напишите код, который принимает на входе следующие значения: вес и
//        рост. После этого выводит на экран т.н. BMI (Body Mass Index).
//        Формула: BMI = kg/m2
//        Ссылка на работающый калькулятор: https://www.calculator.net/bmicalculator.html
//        Пример. Вес: 88.8,Рост: 171.
//        Удостоверьтесь, что ваш код работает и все правильно высчитывает.
//        Важно! Все задачи должны быть прописаны отдельно в методах и
//        вызваны через т.н. точку входа (entry point)

public class Lesson_3 {
    public static Scanner info;

    public static void main(String[] args) {
        info = new Scanner(System.in);
        getPersonInfo();
        getSymbol();
        getSymbol_2();
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
        char ch = info.next().charAt(0);

        //Output of symbol ch in letter and digit format
        System.out.println(ch + " - " + (int) ch);

    }

    // The second version of method for conversion char to int

    public static void getSymbol_2() {

        //Read symbol from Scanner;
        System.out.print("Input one char for second version of method: ");
        char ch = (char) info.nextInt();

        //Output of symbol ch in letter and digit format
        System.out.println(ch + " - " + (int) ch);

    }


    //Method for calculation of body mass index(BMI)

    public static void getBodyMassIndex() {

        //Reading from Scanner
        System.out.print("Input person weight, kg: ");
        double weight = info.nextDouble();
        System.out.print("Input person height, sm: ");
        double height = info.nextDouble();

        //BMI calculation
        double bmi = weight / (0.01 * height * 0.01 * height);

        //BMI output
        System.out.println("BMI = " + bmi);

    }
}

