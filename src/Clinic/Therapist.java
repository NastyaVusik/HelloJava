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
        String str = "I like heal people. I heal cold and flu. Also I give write out a sick leave.";
        return str;
    }

}
