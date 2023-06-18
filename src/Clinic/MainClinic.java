package Clinic;

public class MainClinic {
    public static void main(String[] args) {


//        Создать программу для имитации работы клиники.
//        Пусть в клинике будет три врача: хирург, терапевт и дантист.
//        Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
//                Так же предусмотреть класс «Пациент» и класс «План лечения».
//        Создать объект класса «Пациент» и добавить пациенту план лечения.
//                Так же создать метод, который будет назначать врача пациенту согласно
//        плану лечения.
//        Если план лечения имеет код 1 – назначить хирурга и выполнить метод
//        лечить.
//                Если план лечения имеет код 2 – назначить дантиста и выполнить метод
//        лечить.
//                Если план лечения имеет любой другой код – назначить терапевта и
//        выполнить метод лечить
//


        //Object of patient
        Patient patient1 = new Patient("Ivan Ivanov", new TreatmentPlane(1));


        System.out.println("\n*********************************************\n");
        System.out.println("Name of patient: " + patient1.getA_patient());
        System.out.println("\n*********************************************\n");
        System.out.println(patient1.infoTreatmentPlane());
    }
}
