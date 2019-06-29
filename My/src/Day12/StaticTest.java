package Day12;
class Employee{
	private int empid;
	private String nameString;
	private double salary;
	private static int count;
	
	static {
		count=0;
	}

	public Employee(int empid, String nameString, double salary) {
		super();
		this.empid = empid;
		this.nameString = nameString;
		this.salary = salary;
		count++;
	}

	public Employee() {
		count++;
	}
	public static void showCount() {
		System.out.println("The count is "+count);
		
	}
	
}
public class StaticTest {

	public static void main(String[] args) {
		Employee.showCount();
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		Employee.showCount();
	}
	
}
