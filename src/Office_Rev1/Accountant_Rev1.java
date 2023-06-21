package Office_Rev1;

public class Accountant_Rev1 extends Employee_Rev1 {

    //The constructor was inherited form abstract class Employee_Rev1
    public Accountant_Rev1(String employeePosition, String employeeName) {
        super(employeePosition, employeeName);
    }

    //Overrided method from abstract class Employee_Rev1
    @Override
    public String toString() {
        return "An employee " + super.getEmployeeName() + " work in position of " + super.getEmployeePosition();
    }

}
