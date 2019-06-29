package assignment.day12;

import static assignment.day12.Product.showCount;


public class View {

	public static void main(String[] args) {
		
		System.out.println("*************** Questio 1 *****************");
		Product product = new Product();
		Product product2 = new Product(101,"Malkham",2200);
		
		showCount();
		System.out.println();
		//Question 2
		System.out.println("*************** Questio 2 *****************");
		System.out.println();
		
		AccountHolder accountHolder = new AccountHolder();
		AccountHolder accountHolder2 = new AccountHolder("Morty",5000);
		
		accountHolder2.display();
		System.out.println();
		
		System.out.println("*************** Questio 5 *****************");
		Student student = new Student(101,"Chhagan","151","Bheru Nagar","Indore","M.P.");
		student.displayStudent();
		System.out.println("-------------------------------------------");
		
		
		
	}
}
