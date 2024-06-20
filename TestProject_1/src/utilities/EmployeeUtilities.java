package utilities;
import employees.*;

public class EmployeeUtilities {

	public void getEmpinfo() {
		
		Employee obj = new Employee();
		
		obj.setEmployeeId(1001);
		obj.setSalary(85000);
		
		System.out.println("Employee ID: " + obj.getEmployeeId());
		System.out.println("Employee Salary: " + obj.getSalary());
	}
	
	
}