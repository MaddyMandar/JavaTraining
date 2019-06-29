package com.zensar.oops;

public class WageEmployee extends Employee {

	private int hours;
	private double rate;
	
	public WageEmployee() {
		// TODO Auto-generated constructor stub
		hours=0;
		rate=0;
	}
	
	
	public WageEmployee(int id,String str,int d,int m,int y,int h, int r) {
		// TODO Auto-generated constructor stub
		super(id,str,d,m,y);
		hours=h;
		rate=r;
	}
	
	public void display() {
		super.display();
		System.out.println(hours);
		System.out.println(rate);
	}
}
