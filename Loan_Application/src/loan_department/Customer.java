package loan_department;

public class Customer implements Account,Loan {

	double balance;
	String accountHolderName;
	
	public Customer(String accountHolderName, double balance) {
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}
	
	@Override
	public void accountdetails() {
		// TODO Auto-generated method stub
		System.out.println("----------***Loan Department: ***----------");
		System.out.println("===== Account Holder: " +accountHolderName+"======");
		System.out.println("Initially Account Balance: "+balance+" Rupees.");
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance+=amount;
		System.out.println("Deposit: "+amount+" Rupees");
		displayBalance();
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdraw: "+amount+"ruppes");
		}
		else
		{
			System.out.println("Insuffiecient Balance for Withdraw");
		}
		displayBalance();
	}
	
	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		System.out.println("The Total Amount in Bank Account Are: "+balance+" rupees");
	}
	
	@Override
	public void applyforloan(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Loan Application submitted for: "+amount+"(ruppes) That are successfully Accepted");

	}

	@Override
	public void calculateIntrest(double amount, int year) {
		// TODO Auto-generated method stub
//		double rate=8.25;
//		double intrest=(amount * rate * year)/100;
//		System.out.println("You should pay After "+year+" with "+rate+"% of rate amount is: "+intrest);	
		 double rate = 8.75;  
	        double compoundInterest = amount * Math.pow(1 + (rate / 100), year) - amount;
	        System.out.println("Interest "+rate+"% on loan amount of " + amount + "(Rupees) for " + year + " years: RS." + compoundInterest+" only");
	        double totalAmount = amount + compoundInterest;
	        System.out.println("Total amount to be paid after " + year + " years: $" + totalAmount);
	}	
}
