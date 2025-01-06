package week01;

public class SavingsAccount {

	public static void main(String[] args) {
		double savingsAccountBalance = 29.00;
		double depositAmount = 100.00;
		double withdrawalAmount = 50.00;
		double newSavingsAccountBalance = 0.00;
		//Balance Inquiry:
		System.out.println("The balance in your account is: $" + String.format("%.2f",savingsAccountBalance));
		//Now Deposit A Check:
		newSavingsAccountBalance = savingsAccountBalance + depositAmount;
		System.out.println("You have deposited $" + String.format("%.2f",depositAmount)); 
		System.out.println("Your new balance is $" + String.format("%.2f",newSavingsAccountBalance));
		//Now Withdraw Cash:
		newSavingsAccountBalance = newSavingsAccountBalance - withdrawalAmount;
		System.out.println("Here is your withdrawal of $" + String.format("%.2f",withdrawalAmount));
		System.out.println("Your new balance is $" + String.format("%.2f",newSavingsAccountBalance));
		
	}

}
