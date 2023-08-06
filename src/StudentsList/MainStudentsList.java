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

    }
}
