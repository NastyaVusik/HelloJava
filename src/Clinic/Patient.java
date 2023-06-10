package Clinic;

public class Patient {
    private String a_patient;
    private TreatmentPlane treatmentPlane;

    public Patient(String a_patient, TreatmentPlane treatmentPlane) {
        this.a_patient = a_patient;
        this.treatmentPlane = treatmentPlane;
    }

    public String getA_patient() {
        return a_patient;
    }

    public String infoTreatmentPlane() {
        String str = this.treatmentPlane.getTreatmentPlane();
        return str;
    }


}
