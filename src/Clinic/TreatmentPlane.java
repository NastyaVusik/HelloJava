package Clinic;

import java.util.Scanner;

public class TreatmentPlane {
    private int a_treatmentPlane;

//    public TreatmentPlane(int a_treatmentPlane) {
//        this.a_treatmentPlane = a_treatmentPlane;
//    }

    public TreatmentPlane(int a_treatmentPlane) {
        this.a_treatmentPlane = a_treatmentPlane;
    }

    //Method for addition for patient treatment plane
    public String getTreatmentPlane() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number, which correspond with a treatment plane: ");
        int a_treatmentPlane = scan.nextInt();

        if (a_treatmentPlane == 1) {
            return "This patient is very sick. He need in a surgeon";
        } else if (a_treatmentPlane == 2) {
            return "This patient is very sick. He need in a dentist";
        } else {
            return "This patient is very sick. He need in a therapist";
        }
    }
}
