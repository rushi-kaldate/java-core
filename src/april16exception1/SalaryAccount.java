package april16exception1;

public class SalaryAccount extends Account{
	
	
	public SalaryAccount() {
		
	}
	public void debit(double amount) {
		if(getBal() - amount <0)
		setBal(getBal()- amount);
	}
	public SalaryAccount(int id,String name, double bal) {
		super(id,name,bal);
	}
	@Override
	public String toString() {
		return "SalaryAccount []"+super.toString();
	}
	

}
