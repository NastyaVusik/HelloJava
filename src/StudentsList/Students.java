package StudentsList;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Students {

    ArrayList<String> studentsList;


    //Method for creating Arraylist of students
    public ArrayList<String> getStudents() {
        studentsList = new ArrayList<>() {
            {
                add("Aleksandr");
                add("Daniil");
                add("Anastasiya");
                add("Ivan");
                add("Irina");
                add("Alena");
                add("anastasiya");
                add("Artiom");
                add("Ilya");
                add("Viktor");
                add("Kirill");
                add("Arseniy");
                add("ANasTasiYa");
                add("Dmitriy");
                add("Nicholas");
            }
        };

        return studentsList;
    }


    //Method for output quantity of  all students with my name with ignoring register
    public long getStudentsWithMyName(String myName) {
//        myName = "Anastasiya";

        long sum = studentsList.stream()
                .filter(student -> student.equalsIgnoreCase(myName))
                .count();

        return sum;

    }


    //Method for returning all names, which begin with "a" with ignoring register
    public ArrayList<String> getNamesStartWithA() {
        ArrayList<String> namesStartA = (ArrayList<String>) studentsList.stream()
                .filter(name -> (name.startsWith("a") || name.startsWith("A")))
                .collect(Collectors.toList());                           //Without this method was exception. Why?

//        namesStartA.forEach(result -> System.out.print(result + " "));

        return namesStartA;
    }


    //Method for sorting and returning the first element of the ArrayList
    public Optional<String> SortAndGetFirstElement() {
        Optional<String> firstElement = studentsList.stream().sorted().findFirst();
//        studentsList.stream().sorted().forEach(result -> System.out.print(result + " "));

        return firstElement;
    }


}
