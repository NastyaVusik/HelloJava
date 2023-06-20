// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.Scanner;

class Lesson_5_Basic {
    public static void main(String[] args) {


//        1. Создайте массив целых чисел. Напишете программу, которая выводит
//        сообщение о том, входит ли заданное число в массив или нет. Пусть
//        число для поиска задается с консоли (класс Scanner).
//        2. Создайте массив целых чисел. Удалите все вхождения
//        заданного числа из массива.
//        Пусть число задается с консоли (класс Scanner). Если такого числа нет
//                - выведите сообщения об этом.
//                В результате должен быть новый массив без указанного числа.
//        3. Создайте и заполните массив случайным числами и выведете
//        максимальное, минимальное и среднее значение.
//                Для генерации случайного числа используйте метод Math.random().
//                Пусть будет возможность создавать массив произвольного
//        размера. Пусть размер массива вводится с консоли.
//        4. Создайте 2 массива из 5 чисел.
//                Выведите массивы на консоль в двух отдельных строках.
//                Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//                сообщите, что их средние арифметические равны).


        checkPresenceOfNumb();
        deleteNumb();
        getMinMidMaxValue();
        get2Arrays();

    }


    //1) Method for determination presence of the number in array
    public static void checkPresenceOfNumb() {
        System.out.println("\n" + 1 + ") " + "********************************" + "\n");

        //Initialization of the array and filling it via the loop for
        int[] arr = new int[10];

        System.out.println("Output of new array arr:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 5;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //Getting the number from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int numb = scan.nextInt();

        //Searching of the number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == numb) {
                System.out.println("This array contains a number " + numb);
                break;
            }
            if (j == arr.length - 1) {
                System.out.println("This array doesn't contain a number " + numb);
            }
        }

    }


    //2) Method for delete all certain numbers from array
    public static void deleteNumb() {
        System.out.println("\n" + 2 + ") " + "********************************" + "\n");

        //Initialization of the array
        int[] arr = new int[]{5, -12, 34, 126, 256, -25, 17, 34, 56, 34};

        //Counter of quantity required numbers
        int count = 0;

        //Input number for deduct from array
        System.out.print("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numb) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Array arr doesn't contain a number " + numb);
        }

        //Create new array from old array arr. Specified number isn't included in new array
        int[] newArr = new int[arr.length - count];


//  Declare index for array newArr
        int newArrIndex = 0;

        // Fill newArr with numbers from arr
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != numb) {
                newArr[newArrIndex] = arr[i];
                System.out.print(newArr[newArrIndex] + "\t");
                newArrIndex++;
            }
        }
        System.out.println();
    }


    //3) Method for output min, middle and max value in array

    public static void getMinMidMaxValue() {
        System.out.println("\n" + 3 + ") " + "********************************" + "\n");

        //Getting array length from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array arr:");
        int arrLength = scan.nextInt();


        //Initialization of the array and filling it via the loop with random numbers
        int[] arr = new int[arrLength];

        System.out.println("Output of new array arr:");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = 1 + (int) (Math.random() * 100);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //Determination of min, middle, max value in array arr
        int minArr = arr[0];
        int maxArr = arr[0];
        double midArr;

        //Initialization of sum of all elements in array
        int sum = 0;

        for (int i = 0; i < arrLength; i++) {
            if (minArr > arr[i]) {
                minArr = arr[i];
            }

            if (maxArr < arr[i]) {
                maxArr = arr[i];
            }

            sum += arr[i];
        }

        System.out.println("Min value in array arr: " + minArr);
        System.out.println("Max value in array arr: " + maxArr);

        midArr = sum / arrLength;
        System.out.println("Middle value in array arr: " + midArr);

    }


    //4) Method for output min, middle and max value in array

    public static void get2Arrays() {
        System.out.println("\n" + 4 + ") " + "********************************" + "\n");

        //Initialization of two arrays and filling it via the loop for
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr1[i] = 1 + (int) (Math.random() * 100);
            arr2[i] = 2 + (int) (Math.random() * 50);
        }

        //Output of arrays arr1 and arr2
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        //Initialization of sum of all elements in arrays and their middle value
        int sum1 = 0;
        int sum2 = 0;
        double midArr1;
        double midArr2;

        for (int i = 0; i < 5; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        midArr1 = sum1 / 5;
        midArr2 = sum2 / 5;


        if (midArr1 > midArr2) {
            System.out.println("Middle value array of arr1 " + midArr1 + " > Middle value array of arr2 " + midArr2);
        } else if (midArr2 > midArr1) {
            System.out.println("Middle value array of arr2 " + midArr2 + " > Middle value array of arr1 " + midArr1);
        } else {
            System.out.println("Middle values of arrays are equal: " + midArr1);
        }
    }

}

