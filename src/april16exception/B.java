package april16exception;


public class B extends A{
     
	public B() {
		
	}
	
	@Override
	public void debit(double amount) {
		if(getBal() - amount <500)
			throw new D();
		setBal(getBal()-amount);
	}

	public B(int id,String name,double bal) {
		super(id,name,bal);
	}
	
	

	@Override
	public String toString() {
		return "B []" + super.toString();
	}
	
	
	
	

}
