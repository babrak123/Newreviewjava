package cubic.review;

public class CheckingAccount implements Account {

	private int totalbalance = 0;
	

	public int deposit(int deposit) {
	totalbalance = totalbalance + deposit;
		return totalbalance;
		
	}

	public int withdraw(int withdraw) {
		if (withdraw <= totalbalance) {
			totalbalance = totalbalance - withdraw;
			
			
			
		    } else {
			System.out.println("insufficiant balabnce");
			
			
		}
		return totalbalance;
	}

}
