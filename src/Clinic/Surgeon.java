package Clinic;

public class Surgeon extends ClinicStaff {
    private String a_surgeon;

    //Constructor of super class
    public Surgeon(String treatment) {
        super(treatment);
    }

    //Overridden method of treatment
    @Override
    public String healPeople() {
        String str = "I like heal people. I make operations.";
        return str;
    }

}
