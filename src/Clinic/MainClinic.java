package Clinic;

public class MainClinic {
    public static void main(String[] args) {

        //Object of patient
        Patient patient1 = new Patient("Ivan Ivanov", new TreatmentPlane(1));


        System.out.println("\n*********************************************\n");
        System.out.println("Name of patient: " + patient1.getA_patient());
        System.out.println("\n*********************************************\n");
        System.out.println(patient1.infoTreatmentPlane());
    }
}
