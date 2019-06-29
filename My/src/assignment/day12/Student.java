package assignment.day12;

public class Student {

	private int rollNumber;
	private String studentName;
	private Address studentAddress;
	
	
	
	public Student() {
		super();
		rollNumber=101;
		studentName="Rachel";
		studentAddress=new Address();
	}



	public Student(int rollNumber, String studentName,String streetAdrs, String areaAdr, String cityAdrs, String stateAdrs) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAddress = new Address(streetAdrs, areaAdr, cityAdrs, stateAdrs);
	}
	
	public void displayStudent() {
		System.out.println(
				"Student details \n"
				+this.rollNumber + "\t" + this.studentName + "\t" 
				
				);
		this.studentAddress.displayAddress();
	}
	
	
}
