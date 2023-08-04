// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class MainStreams {


//    Создать коллекцию класса ArrayList наполнить ее элементами
//    рандомными элементами типа Integer.
//    С помощью Stream'ов:
//            - Удалить дубликаты
//- Вывести все четные элементы в диапазоне от 7 до 17
//            (включительно)
//            - Каждый элемент умножить на 2
//            - Отсортировать и вывести на экран первых 4 элемента
//- Вывести количество элементов в стриме
//- Вывести среднее арифметическое всех чисел в стриме


    public static void main(String[] args) {

//Create object of class Collection
        Collection collection = new Collection();

        //Create object of class ConsoleWriter
        ConsoleWriter writer = new ConsoleWriter();

        collection.fillArrayList();

        writer.printConsole("\n\nArrayList after deduction repeated elements:");
        System.out.println(collection.deleteDuplicates());

        writer.printConsole("\n\nElements of ArrayList from 7 to 17(including):");
        collection.getEvenNumbersFrom7to17(7, 17);

        writer.printConsole("\n\nArrayList after multiplication all elements of ArrayList:");
        collection.multipleNumbers();

        writer.printConsole("\n\nFirst four sorted elements of ArrayList:");
        collection.printSortedNumbers();

        writer.printConsole("\n\nQuantity of elements in ArrayList:");
        collection.getQuantityElements();

        writer.printConsole("\n\nArithmetic mean of numbers in the ArrayList:");
        collection.getArithmeticMean();


    }
}

