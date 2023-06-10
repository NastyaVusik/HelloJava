package Clinic;

public class Dentist extends ClinicStaff {

    //Constructor of super class
    public Dentist(String treatment) {
        super(treatment);
    }

    private String a_dentist;

    //Overridden method of treatment
    @Override
    public String healPeople() {
        String str = "I like heal people. I heal teeth. Also I can pull out them.";
        return str;
    }
}
