package emp;



class Employee{
	int empId;
	
	String nameString;
	double salary;
	
	public Employee() {
		
//		empId=101;
//		nameString="Jack";
//		salary=50000.0;
		
		this(101,"Jack",50000.0); //Constructor chaining
		
	}
	
	public Employee(int empId, String nameString, double salary) {
		super();
		this.empId = empId;
		this.nameString = nameString;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee " + empId + " " + nameString + " " + salary + "";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}

public class Test {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee(102,"Mach",45000.0);
		System.out.println(emp2.getNameString());
		
		emp2.setNameString("Morty");
		System.out.println(emp2);
		
		
	}
}
