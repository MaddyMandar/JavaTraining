package day11;

import java.util.Scanner;

public class Jagged_Array {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int [][]a= {{1,2,3},{1,2}};
	int b[][]= new int[][] {{1,2,3},{4,5,6}};
	
	int c[][]= new int[3][];
	
	c[0]= new int[4];
	c[1]= new int[3];
	c[2]= new int[2];
	
	System.out.println("Enter Array Elements");
	
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			
			c[i][j]=scanner.nextInt();
		}
	}
	
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			
			System.out.print(c[i][j]+" ");
			
		}
		System.out.println();
	}
	System.out.println("For Each Begins");
	
	for (int[] x : c) {
		for (int y : x) {
			System.out.print(y+" ");
		}
		System.out.println();
	}
	
}
}
