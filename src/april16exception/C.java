package april16exception;

public class C extends A{

	@Override
	public void debit(double amount) {
		if(getBal() - amount < 0)
			System.out.println();
		else
			setBal(getBal()-amount);

	}



	public C(int id, String name,double bal) {
		super(id,name,bal);
	}



	@Override
	public String toString() {
		return "C []" + super.toString();
	}


}
