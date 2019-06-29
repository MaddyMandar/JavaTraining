package assignment;

import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c[][]= new int[3][3];
		int d[][] = new int[3][3];
		int sol[][] = new int[3][3];
		
		System.out.println("Enter Matrix elements");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				
				c[i][j]=scan.nextInt();
			}
			if (i!=c.length-1) 
			System.out.println("Next");
		}
		System.out.println("Enter values for second Matrix");
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				
				d[i][j]=scan.nextInt();
			}
			if (i!=d.length-1) 
			System.out.println("Next");
		}
		
		System.out.println("Sum of the Matrices is ");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				int t1=c[i][j];
				int t2=d[i][j];
				sol[i][j]=t1+t2;
			}
		}
		for (int[] x : sol) {
			for (int y : x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
	}
}
