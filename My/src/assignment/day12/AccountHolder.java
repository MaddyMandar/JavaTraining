package assignment.day12;

public class AccountHolder {

	 private int accountNumber;
	 private String  accHolderName;
	 private int balance;
	 
	 private static int count;
		
		static {
			count=100;
		}

		public AccountHolder( String accHolderName, int balance) {
			super();
			this.accountNumber = count;
			this.accHolderName = accHolderName;
			this.balance = balance;
			count++;
		}

		public AccountHolder() {
			super();
			count++;
		}
		
		public void display() {
			System.out.println("The account No. for "+this.accHolderName+" is  "+this.accountNumber);
		}
		
		
	
}
