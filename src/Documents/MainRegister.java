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

        //Declare new objects of documents and combine them into array
        BaseDocuments[] doc = new BaseDocuments[11];
        doc[0] = new DeliveryContract("Delivery contract", 100, LocalDate.of(2010, Month.JANUARY, 1), "Anchor bolts", 1000);
        doc[1] = new DeliveryContract("Delivery contract", 101, LocalDate.of(2011, Month.FEBRUARY, 2), "Columns", 40);
        doc[2] = new DeliveryContract("Delivery contract", 102, LocalDate.of(2012, Month.MARCH, 3), "Wind-columns", 10);
        doc[3] = new DeliveryContract("Delivery contract", 103, LocalDate.of(2013, Month.APRIL, 4), "Beams", 20);
        doc[4] = new EmployeeContract("Employee contract", 1, LocalDate.of(2022, Month.JUNE, 10), "01/01/2023", "Mark Zuckerberg");
        doc[5] = new EmployeeContract("Employee contract", 2, LocalDate.of(2021, Month.JULY, 11), "02/02/2022", "Winston Churchill");
        doc[6] = new EmployeeContract("Employee contract", 3, LocalDate.of(2020, Month.AUGUST, 12), "03/03/2021", "Forrest Gump");
        doc[7] = new EmployeeContract("Employee contract", 5, LocalDate.of(2021, Month.JULY, 11), "02/02/2022", "Winston Churchill");
        doc[8] = new DeliveryContract("Delivery contract", 104, LocalDate.of(2014, Month.MAY, 5), "Rafters", 20);
        doc[9] = new FinancialInvoice("Financial invoice", 36, LocalDate.of(2010, Month.APRIL, 15), 1000000, "INSEE 57463.");
        doc[10] = new FinancialInvoice("Financial invoice", 37, LocalDate.of(2010, Month.APRIL, 15), 1000000, "INSEE 57463.");


        //Declare new object of register
        Register register = new Register();


//Save all object of documents in the register object
        for (BaseDocuments document : doc) {
            register.saveDocument(document);
        }

        System.out.println("\n***************************************************************");

        //Get document's info by using document's number
        System.out.println("\nOutput info about documents, which the register contains:\n");

        for (BaseDocuments document : doc) {
            System.out.println("Required document by it document's number " + document.getDocNumber() + ":\n");
            System.out.println(register.getDocInfo(document.getDocNumber()));
            System.out.println("\n***************************************************************\n");
        }

    }
}
