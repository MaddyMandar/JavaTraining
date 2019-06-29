package assignment;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c[][]= new int[3][3];
		int sol[][] = new int[3][3];
		
		System.out.println("Enter Matrix elements");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				
				c[i][j]=scan.nextInt();
			}
			if (i!=c.length-1) 
			System.out.println("Next");
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				sol[j][i]=c[i][j];
			}
		}
		
		for (int[] x : sol) {
			for (int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
	}
}
