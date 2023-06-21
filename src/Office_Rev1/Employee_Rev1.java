package Office_Rev1;

public abstract class Employee_Rev1 implements IFOffice_Rev1 {

    //Variables
    private String employeePosition;
    private String employeeName;


    //Constructor
    public Employee_Rev1(String employeePosition, String employeeName) {
        this.employeePosition = employeePosition;
        this.employeeName = employeeName;

    }

    //Getters and Setters

    public String getEmployeePosition() {
        return employeePosition;
    }


    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }


    public String getEmployeeName() {
        return employeeName;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    //Overrided method from interface IFOffice_Rev1
    @Override
    public abstract String toString();

//    public abstract String toString(){
//        return "An employee " + this.getEmployeeName() + " has position of " + this.getEmployeePosition();
//    }

}
