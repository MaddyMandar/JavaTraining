package com.zensar.oops;

public class Employee {

	private int empId;
	private String nameSt;
	private Date dobDate;
	
	
	public Employee() {
		super();
		empId=1;
		nameSt="abc";
		dobDate=new Date();
	}
	public Employee(int empId, String nameSt, int dd,int mm,int yy) {
		super();
		this.empId = empId;
		this.nameSt = nameSt;
		this.dobDate = new Date(dd,mm,yy);
	}
	public void display()
	{
		System.out.println(empId);
		System.out.println(nameSt);
		dobDate.display();
	}
	
	
	
}
