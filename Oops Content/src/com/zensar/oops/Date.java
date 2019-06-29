package com.zensar.oops;

public class Date {

	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public Date() {
		super();
		dd=1;
		mm=1;
		yy=2000;
	}
	void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
}
