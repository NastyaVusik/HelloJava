package Clinic;

import java.util.Scanner;

public class TreatmentPlane {
    private int a_treatmentPlane;
    public Surgeon a_surgeon;
    public Therapist a_therapist;
    public Dentist a_dentist;


    public TreatmentPlane(int a_treatmentPlane) {
        this.a_treatmentPlane = a_treatmentPlane;
        a_surgeon = new Surgeon("");

        a_therapist = new Therapist("");
        
        a_dentist = new Dentist("");
    }

    //Method for addition for patient treatment plane
    public String getTreatmentPlane() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number, which correspond with a treatment plane: ");
        int a_treatmentPlane = scan.nextInt();

        if (a_treatmentPlane == 1) {
            String str = this.a_surgeon.healPeople();
            return str + "This patient  is very sick. He need in a surgeon";
        } else if (a_treatmentPlane == 2) {
            String str = this.a_dentist.healPeople();
            return str + "This patient is very sick. He need in a dentist";
        } else {
            String str = this.a_therapist.healPeople();
            return str + "This patient is very sick. He need in a therapist";
        }
    }
}
