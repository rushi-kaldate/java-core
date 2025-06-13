package april16exception1;

public class Client {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount(1,"ram",23000);
		System.out.println(s);
		s.debit(42000);
		System.out.println(s);
	}

}
