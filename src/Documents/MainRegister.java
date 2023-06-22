package Documents;

import java.text.DateFormat;
import java.time.Month;
//import java.util.Date;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class MainRegister {


//    Создать систему для учета документов.
//    Создать класс Регистр, который будет иметь методы:
//            - сохранения документа в регистре
//- предоставление информации о документе
//    Система может работать с тремя типами документов:
//            1) Контракт на поставку товаров
//    Содержит поля:
//            - Номер документа
//- Тип товаров
//- Количество товаров
//- Дата документа
//2) Контракт с сотрудником
//    Содержит поля:
//            - Номер документа
//- Дата документа
//- Дата документа
//- Дата окончания контракта
//- Имя сотрудника
//3) Финансовая накладная
//    Содержит поля:
//            - Итоговая сумма за месяц
//- Дата документа
//- Номер документа
//- Код департамента
//    TeachMeSkills.by
//- Класс регистр должен содержать внутри себя массив и при добавлении
//    документа в регистр этот добавляемый документ должен добавляться в
//            массив;
//- Массив для класса регистра должен быть размером 10;
//- Для полей "Дата документа" следует использовать тип данных Date;
//- В методе предоставления информации о документе следует выводить
//    на экран информацию о переданном входным параметром документе;
//- Каждый класс для описания документов должен содержать конструктор
//    с параметрами и без;
//- Для имитации работы системы создайте класс Main, который будет
//    содержать только один метод public static void main
//    В этом методе напишите код для создания каждого из типов
//    документов, добавления их в регистр и вывода информации о документе;
//- Все классы разместить по пакетам;
//- При выполнении задания использовать понятия интерфейсов и
//    абстрактных классов


    public static void main(String[] args) {

//        //Create date object of class Date
//        Date date = new Date(1212 / 12 / 2);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String stringDate = simpleDateFormat.format(date);
//        System.out.println(stringDate);

        //Declare new objects
        BaseDocuments deliveryContract1 = new DeliveryContract("Delivery contract", 100, LocalDate.of(2010, Month.JANUARY, 1), "Anchor bolts", 1000);
        BaseDocuments employeeContract1 = new EmployeeContract("Employee contract", 2, LocalDate.of(2022, Month.JUNE, 10), "01/01/2023", "Mark Zuckerberg");
        BaseDocuments financialInvoice1 = new FinancialInvoice("Financial invoice", 36, LocalDate.of(2010, Month.APRIL, 15), 1000000, "INSEE 57463.");


        //Output info about required documents
        System.out.println("\n*********************************************************\n");
        System.out.println(deliveryContract1.printInfo());
        System.out.println("\n*********************************************************\n");
        System.out.println(employeeContract1.printInfo());
        System.out.println("\n*********************************************************\n");
        System.out.println(financialInvoice1.printInfo());
        System.out.println("\n*********************************************************\n");


        //Get document's info by using document's number
        System.out.println(deliveryContract1.getDocInfo(deliveryContract1.getDocNumber()));

        //Save document in the register
        deliveryContract1.saveDocument(deliveryContract1);


    }
}
