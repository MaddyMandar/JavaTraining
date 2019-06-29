package assignment.day12;

public class Product {

	private int  productId;
	private String productName;
	private double productCost;
	private static int count;
	
	static {
		count=0;
	}

	
	public Product() {
		super();
		count++;
	}


	public Product(int productId, String productName, double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		count++;
	}
	
	public static void showCount() {
		System.out.println("The count of obejcts is "+count);
	}
	
}
