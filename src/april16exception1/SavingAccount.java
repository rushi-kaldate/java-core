package april16exception1;

public class SavingAccount extends Account{

	
	public SavingAccount() {
		
	}
	@Override
	void debit(double amount) {
		if(getBal() - amount <500)
			throw new InvalidAmount();
		setBal(getBal()- amount); 
	}
	public SavingAccount(int id,String name, double bal) {
		super(id,name,bal);
	}
	@Override
	public String toString() {
		return "SavingAccount []"+super.toString();
	}
	
	
	
	
	

}
