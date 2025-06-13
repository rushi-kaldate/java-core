package april16exception;

public class SavingAccount extends Account{

	public SavingAccount() {
		
	}
	
	public SavingAccount(int id, String name, double bal) {
		super(id,name,bal);
	}
	
	@Override
	public void debit(double amount) {
		if(getBal()-amount < Constant.MIN_SAVING_ACCOUNT_BAL)
			throw new InvalidWithdrwalAmount();
			setBal(getBal()-amount);
	}

	@Override
	public String toString() {
		return "SavingAccount :-(" + super.toString();
	}
	

	
	
}
