package day11;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int i;
		int a[]= {1,2,3,4,5};
		int b[]= new int[] {1,2,3,4,5};
		
		int c[]=new int[5];
		System.out.println("Enter the numbers");
		
		for (i = 0; i < c.length; i++) {
			c[i]= scan.nextInt();
		}
		
		for (int x : c) {
			System.out.print(x);
		}
	
}
}
