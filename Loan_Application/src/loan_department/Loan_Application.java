package loan_department;

 //Below is an example of multiple inheritance in the context of the banking or finance domain using interfaces:
public class Loan_Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Dattatray Bodake",10000.00);
		customer.accountdetails();
		customer.deposit(1000);
		customer.withdraw(200);
		
		customer.applyforloan(60000);
		customer.calculateIntrest(60000, 3);
	}
}
