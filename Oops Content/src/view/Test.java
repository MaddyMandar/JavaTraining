package view;

import com.zensar.oops.Employee;
import com.zensar.oops.WageEmployee;

public class Test {

	public static void main(String[] args) {
//		Employee e1 = new Employee(101,"Tushar",24,8,84);
//		e1.display();
		
		WageEmployee wageEmployee = new WageEmployee(101,"Tushar",24,8,84,10,10000);
		wageEmployee.display();
		
		
	}
}
