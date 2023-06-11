package Clinic;

public abstract class ClinicStaff {
    public String treatment;
//    public String a_surgeon;
//    public String a_therapist;
//    public String a_dentist;

    public ClinicStaff(String treatment) {
        this.treatment = treatment;
    }

    abstract String healPeople();


}
