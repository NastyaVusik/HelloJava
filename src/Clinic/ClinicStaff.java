package Clinic;

public abstract class ClinicStaff {
    public String treatment;

    public ClinicStaff(String treatment) {
        this.treatment = treatment;
    }

    abstract String healPeople();


}
