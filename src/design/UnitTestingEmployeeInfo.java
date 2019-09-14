package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo employee1 = new EmployeeInfo("Alejandro Castillo", 123);
        employee1.setSalary(150000);
        employee1.setPerformance(5);
        Assert.assertEquals(150000.00,employee1.getSalary());
        Assert.assertEquals(5,employee1.getPerformance());
        Assert.assertEquals(123,employee1.getEmployeeId());

    }
}
