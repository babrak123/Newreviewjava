package cubic.review;

public class SavingAccount implements Account {

	private int totalBalance = 0;

	public int deposit(int depositAmt) {
		totalBalance = totalBalance + depositAmt;

		return totalBalance;
	}

	public int withdraw(int withdrawAmt) {

		if (withdrawAmt < totalBalance) {
			totalBalance= totalBalance-withdrawAmt;
			
			
		}else {
		System.out.println("Insufficiant funds..");
		
		
		}
		return totalBalance;
	}

}
