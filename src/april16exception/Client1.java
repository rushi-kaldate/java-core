package april16exception;

public class Client1 {
	public static void main(String[] args) {
		
		SavingAccount obj = new SavingAccount(100,"Rushi",23000);
		System.out.println(obj);
		try {
		obj.debit(25000);
		}
		catch(Exception e) {
			
		}
		System.out.println(obj);
		
		SalaryAccount s = new SalaryAccount(101,"Ram",24000);
		System.out.println(s);
		s.debit(30000);
		System.out.println(s);
		
	}

}
