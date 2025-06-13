package april16exception;

public class SalaryAccount extends Account{


	public SalaryAccount() {

	}

	public SalaryAccount(int id, String name, double bal) {
		super(id,name,bal);
	}

	@Override
	public void debit(double amount) {
		if(getBal() - amount <  Constant.MIN_SALARY_ACCOUNT_BAL)
			System.out.println("balance is Available: ");
		else
			setBal(getBal() - amount);
	}

	public String toString() {
		return "SalaryAccount :-(" + super.toString();
	}


}
