package design;

public abstract class EmployeeAbstractClass implements Employee {

    public int employeeId() {
        System.out.println("Employee Id");

        return employeeId();
    }

    public String employeeName() {
        System.out.println("Employee Name");
        return employeeName();
    }

    public void assignDepartment() {
        System.out.println("Employee Department");

    }

}
