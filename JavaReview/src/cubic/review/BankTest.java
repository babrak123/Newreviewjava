package cubic.review;

public class BankTest {

	public static void main(String[] args) {
		
		Account sa = new SavingAccount();
		int savingsBalance = sa.deposit(100);
		System.out.println("Savings current balance is : "+savingsBalance);
		savingsBalance=  sa.withdraw(50);
		System.out.println("Savings current balance is : "+savingsBalance);

	}

}
