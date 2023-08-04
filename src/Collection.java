import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection {

    //Create object of class ConsoleWriter
    ConsoleWriter writer = new ConsoleWriter();


    //Create object of class ConsoleWriter
    ConsoleWriter consoleWriter = new ConsoleWriter();

    Random random = new Random();
    int size = random.nextInt(10, 35);               //Initial quantity of elements in the collection
    ArrayList<Integer> arrayList = new ArrayList<>(size);
//    Stream<Integer> streamList;


    //Method for filling ArrayList with random integer numbers
    public Stream<Integer> fillArrayList() {
        consoleWriter.printConsole("\nInitial size of the ArrayList: " + size + "\n");

        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(-10, 10));
        }

        consoleWriter.printConsole("Random ArrayList:");
        arrayList.stream().forEach(result -> System.out.print(result + " "));

        Stream<Integer> streamList = arrayList.stream();               //Convert ArrayList to stream
        return streamList;
    }


    //Deduct repeated elements
    public ArrayList<Integer> deleteDuplicates() {
//        return (ArrayList<Integer>) streamList.distinct().collect(Collectors.toList());

        return (ArrayList<Integer>) arrayList.stream().distinct().collect(Collectors.toList());
    }


    //Print to console all even numbers in rangee from 7 to 17 element (including)
    public ArrayList<Integer> getEvenNumbersFrom7to17(int start, int end) {

        Stream<Integer> intStreamByRange = arrayList.stream().filter(element -> (element >= start && element <= end));
        ArrayList<Integer> evenElements = (ArrayList<Integer>) intStreamByRange.filter(element -> (element % 2 == 0)).collect(Collectors.toList());

        evenElements.forEach(result -> System.out.print(result + " "));

        return evenElements;
    }


    //Method to multiple all elements of ArrayList
    public ArrayList<Integer> multipleNumbers() {
        List<Integer> multipleList = arrayList.stream().map(element -> element * 2).collect(Collectors.toList());

        multipleList.forEach(result -> System.out.print(result + " "));

        return (ArrayList<Integer>) multipleList;
    }


    //Method for sorting and printing to console first four sorted elements of ArrayList
    public ArrayList<Integer> printSortedNumbers() {

        List<Integer> fourSortedNumbers = arrayList.stream()
                .limit(4)
                .sorted()
                .collect(Collectors.toList());
        fourSortedNumbers.forEach(result -> System.out.print(result + " "));

        return (ArrayList<Integer>) fourSortedNumbers;
    }


    //Method for count quantity elements in ArrayList
    public long getQuantityElements() {
        long quantity = arrayList.stream().count();
        writer.printConsole(String.valueOf(quantity));

        return quantity;
    }


    //Method for calculation arithmetic mean of numbers in the ArrayList
    public OptionalDouble getArithmeticMean() {
//        double arithmeticMean = arrayList.stream().;    }
        OptionalDouble arithmeticMean = arrayList.stream().mapToInt(Integer::intValue).average();
        writer.printConsole(String.valueOf(arithmeticMean));
//        System.out.println(arithmeticMean);

        return arithmeticMean;
    }
}
