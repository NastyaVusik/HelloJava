package Office;

public class MainOffice {
    public static void main(String[] args) {

//        Создать классы "Директор", "Рабочий", "Бухгалтер".
//                Реализовать интерфейс с методом, который печатает название
//        должности и имплементировать этот метод в созданные классы.


        Director employee1 = new Director();
        Worker employee2 = new Worker();
        Accountant employee3 = new Accountant();

        employee1.printPosition();
        employee2.printPosition();
        employee3.printPosition();


    }
}
