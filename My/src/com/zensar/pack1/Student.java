package com.zensar.pack1;

public class Student {

	 private int rollNo;
	 private String studentName;
	 
	 private static int count;
	 
	 static {
		 count=101;
	 }
		public Student(String studentName) {
			super();
			this.rollNo = count;
			this.studentName = studentName;
			count++;
		}
		
		public Student() {
			super();
			count++;
		}
	 
		public void displayStudent() {
			System.out.println("Student details ");
			System.out.println(this.rollNo+"\t" +this.studentName);
		}
	
}
