package StudentsList;

public class MainStudentsList {

//    Создать коллекцию класса ArrayList со значениями имен всех студентов
//    в группе
//    С помощью Stream'ов:
//            - Вернуть количество количество людей с вашим именем (вне
//                                                                          зависимости от верхнего/нижнего регистра букв)
//- Выбрать все имена, начинающиеся на "а" (вне зависимости от
//    верхнего/нижнего регистра букв)
//            - Отсортировать и вернуть первый элемент коллекции или
//"Empty@, если коллекция пуста

    public static void main(String[] args) {

        //Create object of class Students
        Students students = new Students();

        //Print ArrayList to console
        System.out.println("\n\nArrayList of students:");
        System.out.print(students.getStudents());

        //Quantity of  all students with my name with ignoring register
        System.out.println("\n\nQuantity of  all students with my name with ignoring register");
        System.out.print(students.getStudentsWithMyName("Anastasiya"));

        //ArrayList from all names, which begin with "a" with ignoring register
        System.out.println("\n\nArrayList from all names, which begin with \"a\" with ignoring register:");
        System.out.print(students.getNamesStartWithA());

        //Method for sorting and returning the first element of the ArrayList
        System.out.println("\n\nFirst element of sorted ArrayList:");
        System.out.print(students.SortAndGetFirstElement());

    }
}
