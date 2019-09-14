package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1 = new EmployeeInfo("Alejandro Castillo", 123);
		EmployeeInfo employee2 = new EmployeeInfo("Gabriela Jaquez", 456);
		employee1.assignDepartment("Developer");
		employee2.assignDepartment("QA");
		employee1.setSalary(150000.00);
		employee1.calculateSalary(employee1.getSalary());
		employee2.setSalary(120000.00);
		employee2.calculateSalary(employee2.getSalary());
		employee1.setPerformance(5);

		System.out.println(employee1.calculateEmployeeBonus(150000,5));
		System.out.println(employee1.calculateEmployeePension(150000));



		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> employeeRecord123 = new ArrayList<Object>();
		employeeRecord123.add(employee1.employeeName());
		employeeRecord123.add(employee1.calculateSalary(employee1.getSalary()));


		List<Object> employeeRecord456 = new ArrayList<Object>();
		employeeRecord456.add(employee2.employeeName());
		employeeRecord456.add(employee2.calculateSalary(employee2.getSalary()));


		employeeInfo.put(123, employeeRecord123);
		employeeInfo.put(456, employeeRecord456);





	}

}
