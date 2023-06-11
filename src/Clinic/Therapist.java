package Clinic;

public class Therapist extends ClinicStaff {

    //Constructor of super class
    public Therapist(String treatment) {
        super(treatment);
    }

    private String a_therapist;

    //Overridden method of treatment
    @Override
    public String healPeople() {
        String treatment = "\nHi!. I'm a therapist. I like heal people. I heal cold and flu. Also I give write out a sick leave.";
        return treatment;
    }

    public String getA_therapist() {
        return a_therapist;
    }
}
